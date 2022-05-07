import com.docusign.admin.api.*;
import com.docusign.admin.client.*;
import com.docusign.admin.client.auth.OAuth;
import com.docusign.admin.client.auth.OAuth.UserInfo;
import com.docusign.admin.model.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Base64;
import java.util.UUID;
import javax.ws.rs.core.UriBuilderException;
import org.junit.*;
import org.junit.runners.MethodSorters;

/** @author majid.mallis */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SdkUnitTests {

  // private static final String UserName = System.getenv("USER_NAME");
  private static final String UserId = System.getenv("USER_ID");
  private static final String IntegratorKey = System.getenv("INTEGRATOR_KEY_JWT");
  // private static final String IntegratorKeyImplicit = System.getenv("INTEGRATOR_KEY_IMPLICIT");
  // private static final String ClientSecret = System.getenv("CLIENT_SECRET");
  // private static final String RedirectURI = System.getenv("REDIRECT_URI");
  private String organizationId = System.getenv("ORGANIZATION_ID");

  private static final String BaseUrl = ApiClient.DEMO_REST_BASEPATH;
  // private static final String OAuthBaseUrl = OAuth.DEMO_OAUTH_BASEPATH;
  private static final byte[] privateKeyBytes =
      Base64.getDecoder().decode(System.getenv("PRIVATE_KEY"));
  private static final String userImportFullPath =
      System.getProperty("user.dir") + "/src/test/docs/organization-user-import.csv";

  // JUnit 4.12 runs test cases in parallel, so the envelope ID needs to be initiated as well.

  // private JSON json = new JSON();

  public SdkUnitTests() {}

  @BeforeClass
  public static void setUpClass() {}

  @AfterClass
  public static void tearDownClass() {}

  @Before
  public void setUp() {
    if (organizationId == null) {
      organizationId = getFirstOrganizationId();
    }
  }

  @After
  public void tearDown() {}

  private String getFirstOrganizationId() {
    ApiClient apiClient = new ApiClient(BaseUrl);
    // String currentDir = System.getProperty("user.dir");

    try {
      // IMPORTANT NOTE:
      // the first time you ask for a JWT access token, you should grant access by making the
      // following call
      // get DocuSign OAuth authorization url:
      // String oauthLoginUrl = apiClient.getJWTUri(IntegratorKey, RedirectURI, OAuthBaseUrl);
      // open DocuSign OAuth authorization url in the browser, login and grant access
      // Desktop.getDesktop().browse(URI.create(oauthLoginUrl));
      // END OF NOTE

      java.util.List<String> scopes = new ArrayList<String>();
      scopes.add("organization_read");

      OAuth.OAuthToken oAuthToken =
          apiClient.requestJWTUserToken(IntegratorKey, UserId, scopes, privateKeyBytes, 3600);
      Assert.assertNotSame(null, oAuthToken);
      // now that the API client has an OAuth token, let's use it in all
      // DocuSign APIss
      apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());

      UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
      Assert.assertNotSame(null, userInfo);
      Assert.assertNotNull(userInfo.getAccounts());
      Assert.assertTrue(userInfo.getAccounts().size() > 0);

      Configuration.setDefaultApiClient(apiClient);

      AccountsApi accountsApi = new AccountsApi();
      OrganizationsResponse organizationsResponse = accountsApi.getOrganizations();
      Assert.assertNotNull(organizationsResponse);
      Assert.assertNotNull(organizationsResponse.getOrganizations());
      return organizationsResponse.getOrganizations().get(0).getId().toString();
    } catch (ApiException ex) {
      Assert.fail("Exception: " + ex);
    } catch (Exception e) {
      Assert.fail("Exception: " + e.getLocalizedMessage());
    }
    return null;
  }

  // The methods must be annotated with annotation @Test. For example:
  //
  @Test
  public void JWTLoginTest() {
    System.out.println("\nJWTLoginTest:\n" + "===========================================");
    ApiClient apiClient = new ApiClient(BaseUrl);
    // String currentDir = System.getenv("user.dir");

    try {
      java.util.List<String> scopes = new ArrayList<String>();
      scopes.add("organization_read");

      // IMPORTANT NOTE:
      // the first time you ask for a JWT access token, you should grant access by making the
      // following call
      // get DocuSign OAuth authorization url:
      // String oauthLoginUrl = apiClient.getJWTUri(IntegratorKey, RedirectURI, OAuthBaseUrl,
      // scopes);
      // open DocuSign OAuth authorization url in the browser, login and grant access
      // Desktop.getDesktop().browse(URI.create(oauthLoginUrl));
      // END OF NOTE

      OAuth.OAuthToken oAuthToken =
          apiClient.requestJWTUserToken(IntegratorKey, UserId, scopes, privateKeyBytes, 3600);
      Assert.assertNotSame(null, oAuthToken);
      // now that the API client has an OAuth token, let's use it in all
      // DocuSign APIs
      apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());
      UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
      Assert.assertNotSame(null, userInfo);
      Assert.assertNotNull(userInfo.getAccounts());
      Assert.assertTrue(userInfo.getAccounts().size() > 0);

      System.out.println("UserInfo: " + userInfo);
      Configuration.setDefaultApiClient(apiClient);
    } catch (ApiException ex) {
      Assert.fail("Exception: " + ex);
    } catch (Exception e) {
      Assert.fail("Exception: " + e.getLocalizedMessage());
    }
  }

  @Test
  public void AuthorizationCodeLoginTest() {
    System.out.println(
        "\nAuthorizationCodeLoginTest:\n" + "===========================================");
    ApiClient apiClient = new ApiClient(BaseUrl);
    try {
      // after successful login you should compare the value of URI decoded "state" query param
      // with the one you create here; they should match.
      java.util.List<String> scopes = new ArrayList<String>();
      scopes.add("organization_read");
      // get DocuSign OAuth authorization url
      // URI oauthLoginUrl = apiClient.getAuthorizationUri(IntegratorKey, scopes, RedirectURI,
      // OAuth.CODE, null);
      // open DocuSign OAuth login in the browser
      // Desktop.getDesktop().browse(oauthLoginUrl);
      // IMPORTANT: after the login, DocuSign will send back a fresh
      // authorization code as a query param of the redirect URI.
      // You should set up a route that handles the redirect call to get
      // that code and pass it to token endpoint as shown in the next
      // lines:
      /*String code = "<once_you_get_the_oauth_code_put_it_here>";
      	OAuth.OAuthToken oAuthToken = apiClient.generateAccessToken(IntegratorKey, ClientSecret, code);
      	Assert.assertNotSame(null, oAuthToken);
      	Assert.assertNotNull(oAuthToken.getAccessToken());
      	Assert.assertTrue(oAuthToken.getExpiresIn() > 0L);

      	// now that the API client has an OAuth token, let's use it in all
      	// DocuSign APIs
      	apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());
      	UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
      	Assert.assertNotSame(null, userInfo);
      	Assert.assertNotNull(userInfo.getAccounts());
      	Assert.assertTrue(userInfo.getAccounts().size() > 0);

      	System.out.println("UserInfo: " + userInfo);
      	Configuration.setDefaultApiClient(apiClient);
      } catch (ApiException ex) {
      	Assert.fail("Exception: " + ex);*/
    } catch (Exception e) {
      Assert.fail("Exception: " + e.getLocalizedMessage());
    }
  }

  @Test
  public void ImplicitLoginTest() {
    System.out.println("\nImplicitLoginTest:\n" + "===========================================");
    // ApiClient apiClient = new ApiClient(BaseUrl);
    try {
      // after successful login you should compare the value of URI decoded "state" query param
      // with the one you create here; they should match.
      // String randomState = "*^.$DGj*)+}Jk";
      java.util.List<String> scopes = new ArrayList<String>();
      scopes.add("organization_read");
      // get DocuSign OAuth authorization url
      // URI oAuthLoginUri = apiClient.getAuthorizationUri(IntegratorKeyImplicit, scopes,
      // RedirectURI, OAuth.TOKEN, randomState);
      // open DocuSign OAuth login in the browser
      // Desktop.getDesktop().browse(oAuthLoginUri);
      // IMPORTANT: after the login, DocuSign will send back a new
      // access token in the hash fragment of the redirect URI.
      // You should set up a client-side handler that handles window.location change to get
      // that token and pass it to the ApiClient object as shown in the next
      // lines:
      // String token = "<once_you_get_the_oauth_token_put_it_here>";
      // now that the API client has an OAuth token, let's use it in all
      // DocuSign APIs
      /*apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());
      UserInfo userInfo = apiClient.getUserInfo(token);
      Assert.assertNotSame(null, userInfo);
      Assert.assertNotNull(userInfo.getAccounts());
      Assert.assertTrue(userInfo.getAccounts().size() > 0);

      System.out.println("UserInfo: " + userInfo);
      Configuration.setDefaultApiClient(apiClient);*/
    } catch (UriBuilderException ex) {
      System.out.println("UriBuilderException: " + ex);
    } catch (Exception e) {
      Assert.fail("Exception: " + e.getLocalizedMessage());
    }
  }

  @Test
  public synchronized void BulkImportTest() {
    System.out.println("\nBulkImportTest:\n" + "===========================================");
    ApiClient apiClient = new ApiClient(BaseUrl);
    // String currentDir = System.getProperty("user.dir");

    try {
      // IMPORTANT NOTE:
      // the first time you ask for a JWT access token, you should grant access by making the
      // following call
      // get DocuSign OAuth authorization url:
      // String oauthLoginUrl = apiClient.getJWTUri(IntegratorKey, RedirectURI, OAuthBaseUrl);
      // open DocuSign OAuth authorization url in the browser, login and grant access
      // Desktop.getDesktop().browse(URI.create(oauthLoginUrl));
      // END OF NOTE

      java.util.List<String> scopes = new ArrayList<String>();
      scopes.add("user_write");
      scopes.add("organization_read");

      OAuth.OAuthToken oAuthToken =
          apiClient.requestJWTUserToken(IntegratorKey, UserId, scopes, privateKeyBytes, 3600);
      Assert.assertNotSame(null, oAuthToken);
      // now that the API client has an OAuth token, let's use it in all
      // DocuSign APIss
      apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());

      UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
      Assert.assertNotSame(null, userInfo);
      Assert.assertNotNull(userInfo.getAccounts());
      Assert.assertTrue(userInfo.getAccounts().size() > 0);

      System.out.println("UserInfo: " + userInfo);

      Configuration.setDefaultApiClient(apiClient);
      String accountId = userInfo.getAccounts().get(0).getAccountId();

      byte[] userImportBytes = null;
      try {
        userImportBytes = Files.readAllBytes(Paths.get(userImportFullPath));
      } catch (IOException ioExcp) {
        Assert.assertEquals(null, ioExcp);
      }
      if (userImportBytes == null) return;
      String userImportStr = new String(userImportBytes).replace("<accountId>", accountId);

      BulkImportsApi bulkImportsApi = new BulkImportsApi();
      OrganizationImportResponse organizationImportResponse =
          bulkImportsApi.createBulkImportAddUsersRequest(
              UUID.fromString(organizationId), userImportStr.getBytes());
      Assert.assertNotNull(organizationImportResponse);
      Assert.assertNotNull(organizationImportResponse.getId());

      System.out.println("OrganizationImportResponse: " + organizationImportResponse);

      // wait for DocuSign to process the last import job before deleting it
      try {
        wait(15000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      Thread.sleep(1000);
      bulkImportsApi.deleteBulkUserImport(
          UUID.fromString(organizationId), organizationImportResponse.getId());
    } catch (ApiException ex) {
      Assert.fail("Exception: " + ex);
    } catch (Exception e) {
      Assert.fail("Exception: " + e.getLocalizedMessage());
    }
  }

  @Test
  public void CreateUserTest() {
    System.out.println("\nCreateUserTest:\n" + "===========================================");
    ApiClient apiClient = new ApiClient(BaseUrl);
    // String currentDir = System.getProperty("user.dir");

    try {
      // IMPORTANT NOTE:
      // the first time you ask for a JWT access token, you should grant access by making the
      // following call
      // get DocuSign OAuth authorization url:
      // String oauthLoginUrl = apiClient.getJWTUri(IntegratorKey, RedirectURI, OAuthBaseUrl);
      // open DocuSign OAuth authorization url in the browser, login and grant access
      // Desktop.getDesktop().browse(URI.create(oauthLoginUrl));
      // END OF NOTE

      java.util.List<String> scopes = new ArrayList<String>();
      scopes.add("user_write");
      scopes.add("organization_read");

      OAuth.OAuthToken oAuthToken =
          apiClient.requestJWTUserToken(IntegratorKey, UserId, scopes, privateKeyBytes, 3600);
      Assert.assertNotSame(null, oAuthToken);
      // now that the API client has an OAuth token, let's use it in all
      // DocuSign APIss
      apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());

      UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
      Assert.assertNotSame(null, userInfo);
      Assert.assertNotNull(userInfo.getAccounts());
      Assert.assertTrue(userInfo.getAccounts().size() > 0);

      System.out.println("UserInfo: " + userInfo);

      Configuration.setDefaultApiClient(apiClient);
      String accountId = userInfo.getAccounts().get(0).getAccountId();

      PermissionProfileRequest permissionProfile = new PermissionProfileRequest().id(9305351L);
      NewUserRequestAccountProperties account =
          new NewUserRequestAccountProperties()
              .id(UUID.fromString(accountId))
              .permissionProfile(permissionProfile);
      NewUserRequest request =
          new NewUserRequest().addAccountsItem(account).userName("testuser").email("xxx@yyy.zzz");

      UsersApi usersApi = new UsersApi();
      NewUserResponse newUserResponse =
          usersApi.createUser(UUID.fromString(organizationId), request);
      Assert.assertNotNull(newUserResponse);
      Assert.assertNotNull(newUserResponse.getId());

      System.out.println("NewUserResponse: " + newUserResponse);
    } catch (ApiException ex) {
      Assert.fail("Exception: " + ex);
    } catch (Exception e) {
      Assert.fail("Exception: " + e.getLocalizedMessage());
    }
  }

  @Test
  public void GetProductPermissionProfilesTest() {
    System.out.println(
        "\nGetProductPermissionProfilesTest:\n" + "===========================================");
    ApiClient apiClient = new ApiClient(BaseUrl);
    // String currentDir = System.getProperty("user.dir");

    try {
      // IMPORTANT NOTE:
      // the first time you ask for a JWT access token, you should grant access by making the
      // following call
      // get DocuSign OAuth authorization url:
      // String oauthLoginUrl = apiClient.getJWTUri(IntegratorKey, RedirectURI, OAuthBaseUrl);
      // open DocuSign OAuth authorization url in the browser, login and grant access
      // Desktop.getDesktop().browse(URI.create(oauthLoginUrl));
      // END OF NOTE

      java.util.List<String> scopes = new ArrayList<String>();
      scopes.add("user_read");

      OAuth.OAuthToken oAuthToken =
          apiClient.requestJWTUserToken(IntegratorKey, UserId, scopes, privateKeyBytes, 3600);
      Assert.assertNotSame(null, oAuthToken);
      // now that the API client has an OAuth token, let's use it in all
      // DocuSign APIss
      apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());

      UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
      Assert.assertNotSame(null, userInfo);
      Assert.assertNotNull(userInfo.getAccounts());
      Assert.assertTrue(userInfo.getAccounts().size() > 0);

      System.out.println("UserInfo: " + userInfo);

      Configuration.setDefaultApiClient(apiClient);
      String accountId = userInfo.getAccounts().get(0).getAccountId();

      ProductPermissionProfilesApi productPermissionProfilesApi =
          new ProductPermissionProfilesApi();
      ProductPermissionProfilesResponse productPermissionProfilesResponse =
          productPermissionProfilesApi.getProductPermissionProfiles(
              UUID.fromString(organizationId), UUID.fromString(accountId));
      Assert.assertNotNull(productPermissionProfilesResponse);
      Assert.assertNotNull(productPermissionProfilesResponse.getProductPermissionProfiles());

      System.out.println("ProductPermissionProfilesResponse: " + productPermissionProfilesResponse);
    } catch (ApiException ex) {
      Assert.fail("Exception: " + ex);
    } catch (Exception e) {
      Assert.fail("Exception: " + e.getLocalizedMessage());
    }
  }

  @Test
  public void GetUserProfilesTest() {
    System.out.println("\nGetUserProfilesTest:\n" + "===========================================");
    ApiClient apiClient = new ApiClient(BaseUrl);
    // String currentDir = System.getProperty("user.dir");

    try {
      // IMPORTANT NOTE:
      // the first time you ask for a JWT access token, you should grant access by making the
      // following call
      // get DocuSign OAuth authorization url:
      // String oauthLoginUrl = apiClient.getJWTUri(IntegratorKey, RedirectURI, OAuthBaseUrl);
      // open DocuSign OAuth authorization url in the browser, login and grant access
      // Desktop.getDesktop().browse(URI.create(oauthLoginUrl));
      // END OF NOTE

      java.util.List<String> scopes = new ArrayList<String>();
      scopes.add("user_read");
      scopes.add("organization_read");

      OAuth.OAuthToken oAuthToken =
          apiClient.requestJWTUserToken(IntegratorKey, UserId, scopes, privateKeyBytes, 3600);
      Assert.assertNotSame(null, oAuthToken);
      // now that the API client has an OAuth token, let's use it in all
      // DocuSign APIss
      apiClient.setAccessToken(oAuthToken.getAccessToken(), oAuthToken.getExpiresIn());

      UserInfo userInfo = apiClient.getUserInfo(oAuthToken.getAccessToken());
      Assert.assertNotSame(null, userInfo);
      Assert.assertNotNull(userInfo.getAccounts());
      Assert.assertTrue(userInfo.getAccounts().size() > 0);

      System.out.println("UserInfo: " + userInfo);

      Configuration.setDefaultApiClient(apiClient);
      String accountId = userInfo.getAccounts().get(0).getAccountId();

      UsersApi usersApi = new UsersApi();
      UsersApi.GetUsersOptions getUsersOptions = usersApi.new GetUsersOptions();
      getUsersOptions.setAccountId(UUID.fromString(accountId));
      LocalDate fromDate = LocalDate.now();
      fromDate = fromDate.minusDays(30);
      String fromDateStr = fromDate.toString();
      getUsersOptions.setLastModifiedSince(fromDateStr);

      OrganizationUsersResponse organizationUsersResponse =
          usersApi.getUsers(UUID.fromString(organizationId), getUsersOptions);

      System.out.println("OrganizationUsersResponse: " + organizationUsersResponse);
      Assert.assertNotNull(organizationUsersResponse);
      Assert.assertNotNull(organizationUsersResponse.getUsers());

      for (OrganizationUserResponse user : organizationUsersResponse.getUsers()) {
        UsersApi.GetUserProfilesOptions getUserProfilesOptions =
            usersApi.new GetUserProfilesOptions();
        getUserProfilesOptions.setEmail(user.getEmail());
        UsersDrilldownResponse usersDrilldownResponse =
            usersApi.getUserProfiles(UUID.fromString(organizationId), getUserProfilesOptions);
        Assert.assertNotNull(usersDrilldownResponse);
        Assert.assertNotNull(usersDrilldownResponse.getUsers());

        // System.out.println("UsersDrilldownResponse: " + usersDrilldownResponse);
      }
    } catch (ApiException ex) {
      Assert.fail("Exception: " + ex);
    } catch (Exception e) {
      Assert.fail("Exception: " + e.getLocalizedMessage());
    }
  }
}
