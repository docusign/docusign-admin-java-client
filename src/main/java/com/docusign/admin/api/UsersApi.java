package com.docusign.admin.api;

import com.docusign.admin.client.ApiClient;
import com.docusign.admin.client.ApiException;
import com.docusign.admin.client.Configuration;
import com.docusign.admin.client.Pair;
import com.docusign.admin.model.*;
import javax.ws.rs.core.GenericType;

/** UsersApi class. */
public class UsersApi {
  private ApiClient apiClient;

  /** UsersApi. */
  public UsersApi() {
    this(Configuration.getDefaultApiClient());
  }

  /** UsersApi. */
  public UsersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getApiClient Method.
   *
   * @return ApiClient
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /** setApiClient Method. */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Activates user memberships. Required scopes: user_write
   *
   * @param organizationId The organization ID Guid (required)
   * @param userId The user ID Guid (required)
   * @param membershipId The membership ID Guid (required)
   * @param request Additional details about the user&#39;s membership (required)
   * @return UpdateResponse
   * @throws ApiException if fails to make API call
   */
  public UpdateResponse activateMembership(
      java.util.UUID organizationId,
      java.util.UUID userId,
      java.util.UUID membershipId,
      ForceActivateMembershipRequest request)
      throws ApiException {
    Object localVarPostBody = request;

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'organizationId' when calling activateMembership");
    }

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'userId' when calling activateMembership");
    }

    // verify the required parameter 'membershipId' is set
    if (membershipId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'membershipId' when calling activateMembership");
    }

    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(
          400, "Missing the required parameter 'request' when calling activateMembership");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/users/{userId}/memberships/{membershipId}"
            .replaceAll(
                "\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll(
                "\\{" + "membershipId" + "\\}", apiClient.escapeString(membershipId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<UpdateResponse> localVarReturnType = new GenericType<UpdateResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }

  /**
   * Creates and updates a multi-product user. Required scopes: user_write
   *
   * @param organizationId The organization ID GUID (required)
   * @param accountId The account ID GUID (required)
   * @param request The request object (required)
   * @return AddUserResponse
   * @throws ApiException if fails to make API call
   */
  public AddUserResponse addOrUpdateUser(
      java.util.UUID organizationId,
      java.util.UUID accountId,
      NewMultiProductUserAddRequest request)
      throws ApiException {
    Object localVarPostBody = request;

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'organizationId' when calling addOrUpdateUser");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling addOrUpdateUser");
    }

    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(
          400, "Missing the required parameter 'request' when calling addOrUpdateUser");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/organizations/{organizationId}/accounts/{accountId}/users"
            .replaceAll(
                "\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<AddUserResponse> localVarReturnType = new GenericType<AddUserResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }

  /**
   * Adds users to an account.. Required scopes: user_write
   *
   * @param organizationId The organization ID Guid (required)
   * @param accountId The account ID Guid (required)
   * @param request The details for the users to add to the account (required)
   * @return NewUserResponse
   * @throws ApiException if fails to make API call
   */
  public NewUserResponse addUsers(
      java.util.UUID organizationId, java.util.UUID accountId, NewAccountUserRequest request)
      throws ApiException {
    Object localVarPostBody = request;

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'organizationId' when calling addUsers");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'accountId' when calling addUsers");
    }

    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling addUsers");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/accounts/{accountId}/users"
            .replaceAll(
                "\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<NewUserResponse> localVarReturnType = new GenericType<NewUserResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }

  /**
   * Closes a user&#39;s memberships.. Required scopes: user_write
   *
   * @param organizationId The organization ID Guid (required)
   * @param userId The user ID Guid (required)
   * @param request The details about which membership to close (required)
   * @return DeleteMembershipsResponse
   * @throws ApiException if fails to make API call
   */
  public DeleteMembershipsResponse closeMemberships(
      java.util.UUID organizationId, java.util.UUID userId, DeleteMembershipsRequest request)
      throws ApiException {
    Object localVarPostBody = request;

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'organizationId' when calling closeMemberships");
    }

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'userId' when calling closeMemberships");
    }

    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(
          400, "Missing the required parameter 'request' when calling closeMemberships");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/users/{userId}/accounts"
            .replaceAll(
                "\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<DeleteMembershipsResponse> localVarReturnType =
        new GenericType<DeleteMembershipsResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }

  /**
   * Creates a new user. Required scopes: user_write
   *
   * @param organizationId The organization ID Guid (required)
   * @param request Details about the user to be added (required)
   * @return NewUserResponse
   * @throws ApiException if fails to make API call
   */
  public NewUserResponse createUser(java.util.UUID organizationId, NewUserRequest request)
      throws ApiException {
    Object localVarPostBody = request;

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'organizationId' when calling createUser");
    }

    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(
          400, "Missing the required parameter 'request' when calling createUser");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/users"
            .replaceAll(
                "\\{" + "organizationId" + "\\}",
                apiClient.escapeString(organizationId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<NewUserResponse> localVarReturnType = new GenericType<NewUserResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }

  /**
   * Deletes user identities.. Required scopes: user_write
   *
   * @param organizationId The organization ID Guid (required)
   * @param userId The user ID Guid (required)
   * @param requestModel The details for the user identities to be deleted (required)
   * @return DeleteResponse
   * @throws ApiException if fails to make API call
   */
  public DeleteResponse deleteIdentities(
      java.util.UUID organizationId, java.util.UUID userId, DeleteUserIdentityRequest requestModel)
      throws ApiException {
    Object localVarPostBody = requestModel;

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'organizationId' when calling deleteIdentities");
    }

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'userId' when calling deleteIdentities");
    }

    // verify the required parameter 'requestModel' is set
    if (requestModel == null) {
      throw new ApiException(
          400, "Missing the required parameter 'requestModel' when calling deleteIdentities");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/users/{userId}/identities"
            .replaceAll(
                "\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<DeleteResponse> localVarReturnType = new GenericType<DeleteResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "DELETE",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /// <summary>
  /// Returns user information using the userId for lookup. Required scopes: user_read
  /// </summary>

  /** GetUserDSProfileOptions Class. */
  public class GetUserDSProfileOptions {
    private Boolean sort = null;

    /** setSort method. */
    public void setSort(Boolean sort) {
      this.sort = sort;
    }

    /**
     * getSort method.
     *
     * @return Boolean
     */
    public Boolean getSort() {
      return this.sort;
    }
  }

  /**
   * Returns user information using the userId for lookup.. Required scopes: user_read
   *
   * @param organizationId The organization ID Guid (required)
   * @param userId The user ID Guid (required)
   * @return UsersDrilldownResponse
   */
  public UsersDrilldownResponse getUserDSProfile(
      java.util.UUID organizationId, java.util.UUID userId) throws ApiException {
    return getUserDSProfile(organizationId, userId, null);
  }

  /**
   * Returns user information using the userId for lookup.. Required scopes: user_read
   *
   * @param organizationId The organization ID Guid (required)
   * @param userId The user ID Guid (required)
   * @param options for modifying the method behavior.
   * @return UsersDrilldownResponse
   * @throws ApiException if fails to make API call
   */
  public UsersDrilldownResponse getUserDSProfile(
      java.util.UUID organizationId,
      java.util.UUID userId,
      UsersApi.GetUserDSProfileOptions options)
      throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'organizationId' when calling getUserDSProfile");
    }

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'userId' when calling getUserDSProfile");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/organizations/{organizationId}/users/{userId}/dsprofile"
            .replaceAll(
                "\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("sort", options.sort));
    }

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<UsersDrilldownResponse> localVarReturnType =
        new GenericType<UsersDrilldownResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /// <summary>
  /// Returns DS user profile information. Required scopes: user_read
  /// </summary>

  /** GetUserDSProfilesByEmailOptions Class. */
  public class GetUserDSProfilesByEmailOptions {
    private String email = null;
    private Boolean sort = null;

    /** setEmail method. */
    public void setEmail(String email) {
      this.email = email;
    }

    /**
     * getEmail method.
     *
     * @return String
     */
    public String getEmail() {
      return this.email;
    }

    /** setSort method. */
    public void setSort(Boolean sort) {
      this.sort = sort;
    }

    /**
     * getSort method.
     *
     * @return Boolean
     */
    public Boolean getSort() {
      return this.sort;
    }
  }

  /**
   * Returns DS user profile information.. Required scopes: user_read
   *
   * @param organizationId The organization ID Guid (required)
   * @return UsersDrilldownResponse
   */
  public UsersDrilldownResponse getUserDSProfilesByEmail(java.util.UUID organizationId)
      throws ApiException {
    return getUserDSProfilesByEmail(organizationId, null);
  }

  /**
   * Returns DS user profile information.. Required scopes: user_read
   *
   * @param organizationId The organization ID Guid (required)
   * @param options for modifying the method behavior.
   * @return UsersDrilldownResponse
   * @throws ApiException if fails to make API call
   */
  public UsersDrilldownResponse getUserDSProfilesByEmail(
      java.util.UUID organizationId, UsersApi.GetUserDSProfilesByEmailOptions options)
      throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationId' when calling getUserDSProfilesByEmail");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/organizations/{organizationId}/users/dsprofile"
            .replaceAll(
                "\\{" + "organizationId" + "\\}",
                apiClient.escapeString(organizationId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("email", options.email));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("sort", options.sort));
    }

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<UsersDrilldownResponse> localVarReturnType =
        new GenericType<UsersDrilldownResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /// <summary>
  /// Returns user information. Required scopes: user_read
  /// </summary>

  /** GetUserProfilesOptions Class. */
  public class GetUserProfilesOptions {
    private String email = null;

    /** setEmail method. */
    public void setEmail(String email) {
      this.email = email;
    }

    /**
     * getEmail method.
     *
     * @return String
     */
    public String getEmail() {
      return this.email;
    }
  }

  /**
   * Returns user information.. Required scopes: user_read
   *
   * @param organizationId The organization ID Guid (required)
   * @return UsersDrilldownResponse
   */
  public UsersDrilldownResponse getUserProfiles(java.util.UUID organizationId) throws ApiException {
    return getUserProfiles(organizationId, null);
  }

  /**
   * Returns user information.. Required scopes: user_read
   *
   * @param organizationId The organization ID Guid (required)
   * @param options for modifying the method behavior.
   * @return UsersDrilldownResponse
   * @throws ApiException if fails to make API call
   */
  public UsersDrilldownResponse getUserProfiles(
      java.util.UUID organizationId, UsersApi.GetUserProfilesOptions options) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'organizationId' when calling getUserProfiles");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/users/profile"
            .replaceAll(
                "\\{" + "organizationId" + "\\}",
                apiClient.escapeString(organizationId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("email", options.email));
    }

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<UsersDrilldownResponse> localVarReturnType =
        new GenericType<UsersDrilldownResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
  /// <summary>
  /// Returns information about the users in the organization Required scopes: user_read
  /// </summary>

  /** GetUsersOptions Class. */
  public class GetUsersOptions {
    private Integer start = null;
    private Integer take = null;
    private Integer end = null;
    private String email = null;
    private String emailUserNameLike = null;
    private String status = null;
    private String membershipStatus = null;
    private java.util.UUID accountId = null;
    private java.util.UUID organizationReservedDomainId = null;
    private String lastModifiedSince = null;

    /** setStart method. */
    public void setStart(Integer start) {
      this.start = start;
    }

    /**
     * getStart method.
     *
     * @return Integer
     */
    public Integer getStart() {
      return this.start;
    }

    /** setTake method. */
    public void setTake(Integer take) {
      this.take = take;
    }

    /**
     * getTake method.
     *
     * @return Integer
     */
    public Integer getTake() {
      return this.take;
    }

    /** setEnd method. */
    public void setEnd(Integer end) {
      this.end = end;
    }

    /**
     * getEnd method.
     *
     * @return Integer
     */
    public Integer getEnd() {
      return this.end;
    }

    /** setEmail method. */
    public void setEmail(String email) {
      this.email = email;
    }

    /**
     * getEmail method.
     *
     * @return String
     */
    public String getEmail() {
      return this.email;
    }

    /** setEmailUserNameLike method. */
    public void setEmailUserNameLike(String emailUserNameLike) {
      this.emailUserNameLike = emailUserNameLike;
    }

    /**
     * getEmailUserNameLike method.
     *
     * @return String
     */
    public String getEmailUserNameLike() {
      return this.emailUserNameLike;
    }

    /** setStatus method. */
    public void setStatus(String status) {
      this.status = status;
    }

    /**
     * getStatus method.
     *
     * @return String
     */
    public String getStatus() {
      return this.status;
    }

    /** setMembershipStatus method. */
    public void setMembershipStatus(String membershipStatus) {
      this.membershipStatus = membershipStatus;
    }

    /**
     * getMembershipStatus method.
     *
     * @return String
     */
    public String getMembershipStatus() {
      return this.membershipStatus;
    }

    /** setAccountId method. */
    public void setAccountId(java.util.UUID accountId) {
      this.accountId = accountId;
    }

    /**
     * getAccountId method.
     *
     * @return java.util.UUID
     */
    public java.util.UUID getAccountId() {
      return this.accountId;
    }

    /** setOrganizationReservedDomainId method. */
    public void setOrganizationReservedDomainId(java.util.UUID organizationReservedDomainId) {
      this.organizationReservedDomainId = organizationReservedDomainId;
    }

    /**
     * getOrganizationReservedDomainId method.
     *
     * @return java.util.UUID
     */
    public java.util.UUID getOrganizationReservedDomainId() {
      return this.organizationReservedDomainId;
    }

    /** setLastModifiedSince method. */
    public void setLastModifiedSince(String lastModifiedSince) {
      this.lastModifiedSince = lastModifiedSince;
    }

    /**
     * getLastModifiedSince method.
     *
     * @return String
     */
    public String getLastModifiedSince() {
      return this.lastModifiedSince;
    }
  }

  /**
   * Returns information about the users in the organization. Required scopes: user_read
   *
   * @param organizationId The organization ID Guid (required)
   * @return OrganizationUsersResponse
   */
  public OrganizationUsersResponse getUsers(java.util.UUID organizationId) throws ApiException {
    return getUsers(organizationId, null);
  }

  /**
   * Returns information about the users in the organization. Required scopes: user_read
   *
   * @param organizationId The organization ID Guid (required)
   * @param options for modifying the method behavior.
   * @return OrganizationUsersResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationUsersResponse getUsers(
      java.util.UUID organizationId, UsersApi.GetUsersOptions options) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'organizationId' when calling getUsers");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/users"
            .replaceAll(
                "\\{" + "organizationId" + "\\}",
                apiClient.escapeString(organizationId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("start", options.start));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("take", options.take));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("end", options.end));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("email", options.email));
    }
    if (options != null) {
      localVarQueryParams.addAll(
          apiClient.parameterToPair("email_user_name_like", options.emailUserNameLike));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("status", options.status));
    }
    if (options != null) {
      localVarQueryParams.addAll(
          apiClient.parameterToPair("membership_status", options.membershipStatus));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", options.accountId));
    }
    if (options != null) {
      localVarQueryParams.addAll(
          apiClient.parameterToPair(
              "organization_reserved_domain_id", options.organizationReservedDomainId));
    }
    if (options != null) {
      localVarQueryParams.addAll(
          apiClient.parameterToPair("last_modified_since", options.lastModifiedSince));
    }

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<OrganizationUsersResponse> localVarReturnType =
        new GenericType<OrganizationUsersResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }

  /**
   * Updates a user&#39;s email address.. Required scopes: user_write
   *
   * @param organizationId The organization ID Guid (required)
   * @param request The details about which email addresses to update (required)
   * @return UsersUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public UsersUpdateResponse updateEmailAddress(
      java.util.UUID organizationId, UpdateUsersEmailRequest request) throws ApiException {
    Object localVarPostBody = request;

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'organizationId' when calling updateEmailAddress");
    }

    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(
          400, "Missing the required parameter 'request' when calling updateEmailAddress");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/users/email_addresses"
            .replaceAll(
                "\\{" + "organizationId" + "\\}",
                apiClient.escapeString(organizationId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<UsersUpdateResponse> localVarReturnType = new GenericType<UsersUpdateResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }

  /**
   * Updates a user.. Required scopes: user_write
   *
   * @param organizationId The organization ID Guid (required)
   * @param request The user details to update (required)
   * @return UsersUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public UsersUpdateResponse updateUser(java.util.UUID organizationId, UpdateUsersRequest request)
      throws ApiException {
    Object localVarPostBody = request;

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'organizationId' when calling updateUser");
    }

    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(
          400, "Missing the required parameter 'request' when calling updateUser");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/users/profiles"
            .replaceAll(
                "\\{" + "organizationId" + "\\}",
                apiClient.escapeString(organizationId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<UsersUpdateResponse> localVarReturnType = new GenericType<UsersUpdateResponse>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }
}
