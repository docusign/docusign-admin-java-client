package com.docusign.admin.api;

import com.docusign.admin.client.ApiClient;
import com.docusign.admin.client.ApiException;
import com.docusign.admin.client.Configuration;
import com.docusign.admin.client.Pair;
import com.docusign.admin.model.*;
import javax.ws.rs.core.GenericType;

/** ProductPermissionProfilesApi class. */
public class ProductPermissionProfilesApi {
  private ApiClient apiClient;

  /** ProductPermissionProfilesApi. */
  public ProductPermissionProfilesApi() {
    this(Configuration.getDefaultApiClient());
  }

  /** ProductPermissionProfilesApi. */
  public ProductPermissionProfilesApi(ApiClient apiClient) {
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
   * Assign user to permission profiles for one or more products. Required scopes: user_write
   *
   * @param organizationId The organization ID GUID (required)
   * @param accountId The account ID GUID (required)
   * @param userId The user ID GUID (required)
   * @param productPermissionProfilesRequest Request object (required)
   * @return UserProductPermissionProfilesResponse
   * @throws ApiException if fails to make API call
   */
  public UserProductPermissionProfilesResponse addUserProductPermissionProfiles(
      java.util.UUID organizationId,
      java.util.UUID accountId,
      java.util.UUID userId,
      ProductPermissionProfilesRequest productPermissionProfilesRequest)
      throws ApiException {
    Object localVarPostBody = productPermissionProfilesRequest;

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationId' when calling addUserProductPermissionProfiles");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling addUserProductPermissionProfiles");
    }

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'userId' when calling addUserProductPermissionProfiles");
    }

    // verify the required parameter 'productPermissionProfilesRequest' is set
    if (productPermissionProfilesRequest == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'productPermissionProfilesRequest' when calling addUserProductPermissionProfiles");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/organizations/{organizationId}/accounts/{accountId}/products/users/{userId}/permission_profiles"
            .replaceAll(
                "\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
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

    GenericType<UserProductPermissionProfilesResponse> localVarReturnType =
        new GenericType<UserProductPermissionProfilesResponse>() {};
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
   * Assign user to permission profiles for one or more products. Required scopes: user_write
   *
   * @param organizationId The organization ID GUID (required)
   * @param accountId The account ID GUID (required)
   * @param userProductPermissionProfilesRequest Request object (required)
   * @return UserProductPermissionProfilesResponse
   * @throws ApiException if fails to make API call
   */
  public UserProductPermissionProfilesResponse addUserProductPermissionProfilesByEmail(
      java.util.UUID organizationId,
      java.util.UUID accountId,
      UserProductPermissionProfilesRequest userProductPermissionProfilesRequest)
      throws ApiException {
    Object localVarPostBody = userProductPermissionProfilesRequest;

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationId' when calling addUserProductPermissionProfilesByEmail");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling addUserProductPermissionProfilesByEmail");
    }

    // verify the required parameter 'userProductPermissionProfilesRequest' is set
    if (userProductPermissionProfilesRequest == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'userProductPermissionProfilesRequest' when calling addUserProductPermissionProfilesByEmail");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/organizations/{organizationId}/accounts/{accountId}/products/permission_profiles/users"
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

    GenericType<UserProductPermissionProfilesResponse> localVarReturnType =
        new GenericType<UserProductPermissionProfilesResponse>() {};
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
   * Get products associated with the account and the available permission profiles. Required
   * scopes: user_read
   *
   * @param organizationId The organization ID GUID (required)
   * @param accountId The account ID GUID (required)
   * @return ProductPermissionProfilesResponse
   * @throws ApiException if fails to make API call
   */
  public ProductPermissionProfilesResponse getProductPermissionProfiles(
      java.util.UUID organizationId, java.util.UUID accountId) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationId' when calling getProductPermissionProfiles");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling getProductPermissionProfiles");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/organizations/{organizationId}/accounts/{accountId}/products/permission_profiles"
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

    GenericType<ProductPermissionProfilesResponse> localVarReturnType =
        new GenericType<ProductPermissionProfilesResponse>() {};
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
   * Retrieve list of user&#39;s permission profiles for each account&#39;s product. Required
   * scopes: user_read
   *
   * @param organizationId The organization ID GUID (required)
   * @param accountId The account ID GUID (required)
   * @param userId The user ID GUID (required)
   * @return ProductPermissionProfilesResponse
   * @throws ApiException if fails to make API call
   */
  public ProductPermissionProfilesResponse getUserProductPermissionProfiles(
      java.util.UUID organizationId, java.util.UUID accountId, java.util.UUID userId)
      throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationId' when calling getUserProductPermissionProfiles");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling getUserProductPermissionProfiles");
    }

    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'userId' when calling getUserProductPermissionProfiles");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/organizations/{organizationId}/accounts/{accountId}/products/users/{userId}/permission_profiles"
            .replaceAll(
                "\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
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

    GenericType<ProductPermissionProfilesResponse> localVarReturnType =
        new GenericType<ProductPermissionProfilesResponse>() {};
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
  /// Remove user from permission profiles for one or more products Required scopes: user_write
  /// </summary>

  /** GetUserProductPermissionProfilesByEmailOptions Class. */
  public class GetUserProductPermissionProfilesByEmailOptions {
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
   * Remove user from permission profiles for one or more products. Required scopes: user_write
   *
   * @param organizationId The organization ID GUID (required)
   * @param accountId The account ID GUID (required)
   * @return UserProductPermissionProfilesResponse
   */
  public UserProductPermissionProfilesResponse getUserProductPermissionProfilesByEmail(
      java.util.UUID organizationId, java.util.UUID accountId) throws ApiException {
    return getUserProductPermissionProfilesByEmail(organizationId, accountId, null);
  }

  /**
   * Remove user from permission profiles for one or more products. Required scopes: user_write
   *
   * @param organizationId The organization ID GUID (required)
   * @param accountId The account ID GUID (required)
   * @param options for modifying the method behavior.
   * @return UserProductPermissionProfilesResponse
   * @throws ApiException if fails to make API call
   */
  public UserProductPermissionProfilesResponse getUserProductPermissionProfilesByEmail(
      java.util.UUID organizationId,
      java.util.UUID accountId,
      ProductPermissionProfilesApi.GetUserProductPermissionProfilesByEmailOptions options)
      throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationId' when calling getUserProductPermissionProfilesByEmail");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling getUserProductPermissionProfilesByEmail");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/organizations/{organizationId}/accounts/{accountId}/products/permission_profiles/users"
            .replaceAll(
                "\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

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

    GenericType<UserProductPermissionProfilesResponse> localVarReturnType =
        new GenericType<UserProductPermissionProfilesResponse>() {};
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
   * Remove user from permission profiles for one or more products. Required scopes: user_write
   *
   * @param organizationId The organization ID GUID (required)
   * @param accountId The account ID GUID (required)
   * @param userProductPermissionProfilesRequest Request object (required)
   * @return RemoveUserProductsResponse
   * @throws ApiException if fails to make API call
   */
  public RemoveUserProductsResponse removeUserProductPermission(
      java.util.UUID organizationId,
      java.util.UUID accountId,
      UserProductProfileDeleteRequest userProductPermissionProfilesRequest)
      throws ApiException {
    Object localVarPostBody = userProductPermissionProfilesRequest;

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationId' when calling removeUserProductPermission");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling removeUserProductPermission");
    }

    // verify the required parameter 'userProductPermissionProfilesRequest' is set
    if (userProductPermissionProfilesRequest == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'userProductPermissionProfilesRequest' when calling removeUserProductPermission");
    }

    // create path and map variables
    String localVarPath =
        "/v2.1/organizations/{organizationId}/accounts/{accountId}/products/users"
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

    GenericType<RemoveUserProductsResponse> localVarReturnType =
        new GenericType<RemoveUserProductsResponse>() {};
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
}
