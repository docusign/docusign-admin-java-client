
package com.docusign.admin.api;

import javax.ws.rs.core.GenericType;

import com.docusign.admin.client.ApiException;
import com.docusign.admin.client.ApiClient;
import com.docusign.admin.client.Configuration;
import com.docusign.admin.model.*;
import com.docusign.admin.client.Pair;
import com.docusign.admin.client.ApiResponse;

/**
 * DsGroupsApi class.
 *
 **/
public class DsGroupsApi {
  private ApiClient apiClient;

  /**
   * DsGroupsApi.
   *
   **/
  public DsGroupsApi() {
    this(Configuration.getDefaultApiClient());
  }

  /**
   * DsGroupsApi.
   *
   **/
  public DsGroupsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getApiClient Method.
   *
   * @return ApiClient
   **/
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * setApiClient Method.
   *
   **/
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add a new DSGroup.
   * Required scopes: user_write
   * 
   * @param organizationId The organization ID GUID (required)
   * @param accountId      The account ID GUID (required)
   * @param addRequest     Add DSGroup request object (required)
   * @return DSGroupResponse
   * @throws ApiException if fails to make API call
   */
  public DSGroupResponse addDSGroup(java.util.UUID organizationId, java.util.UUID accountId,
      DSGroupAddRequest addRequest) throws ApiException {
    ApiResponse<DSGroupResponse> localVarResponse = addDSGroupWithHttpInfo(organizationId, accountId, addRequest);
    return localVarResponse.getData();
  }

  /**
   * Add a new DSGroup
   * Required scopes: user_write
   * 
   * @param organizationId The organization ID GUID (required)
   * @param accountId      The account ID GUID (required)
   * @param addRequest     Add DSGroup request object (required)
   * @return DSGroupResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DSGroupResponse> addDSGroupWithHttpInfo(java.util.UUID organizationId, java.util.UUID accountId,
      DSGroupAddRequest addRequest) throws ApiException {
    Object localVarPostBody = addRequest;

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling addDSGroup");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling addDSGroup");
    }

    // verify the required parameter 'addRequest' is set
    if (addRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'addRequest' when calling addDSGroup");
    }

    // create path and map variables
    String localVarPath = "/v2.1/organizations/{organizationId}/accounts/{accountId}/dsgroups"
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
        .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {
        "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
        "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<DSGroupResponse> localVarReturnType = new GenericType<DSGroupResponse>() {
    };
    DSGroupResponse localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams,
        localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept,
        localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DSGroupResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(),
        localVarResponse);
  }

  /**
   * Add list of users to a DSGroup.
   * Required scopes: user_write
   * 
   * @param organizationId         The organization ID GUID (required)
   * @param accountId              The account ID GUID (required)
   * @param dsGroupId              The DSGroup ID GUID (required)
   * @param dSGroupUsersAddRequest Add DSGroup users request object (required)
   * @return AddDSGroupAndUsersResponse
   * @throws ApiException if fails to make API call
   */
  public AddDSGroupAndUsersResponse addDSGroupUsers(java.util.UUID organizationId, java.util.UUID accountId,
      java.util.UUID dsGroupId, DSGroupUsersAddRequest dSGroupUsersAddRequest) throws ApiException {
    ApiResponse<AddDSGroupAndUsersResponse> localVarResponse = addDSGroupUsersWithHttpInfo(organizationId, accountId,
        dsGroupId, dSGroupUsersAddRequest);
    return localVarResponse.getData();
  }

  /**
   * Add list of users to a DSGroup
   * Required scopes: user_write
   * 
   * @param organizationId         The organization ID GUID (required)
   * @param accountId              The account ID GUID (required)
   * @param dsGroupId              The DSGroup ID GUID (required)
   * @param dSGroupUsersAddRequest Add DSGroup users request object (required)
   * @return AddDSGroupAndUsersResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AddDSGroupAndUsersResponse> addDSGroupUsersWithHttpInfo(java.util.UUID organizationId,
      java.util.UUID accountId, java.util.UUID dsGroupId, DSGroupUsersAddRequest dSGroupUsersAddRequest)
      throws ApiException {
    Object localVarPostBody = dSGroupUsersAddRequest;

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling addDSGroupUsers");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling addDSGroupUsers");
    }

    // verify the required parameter 'dsGroupId' is set
    if (dsGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'dsGroupId' when calling addDSGroupUsers");
    }

    // verify the required parameter 'dSGroupUsersAddRequest' is set
    if (dSGroupUsersAddRequest == null) {
      throw new ApiException(400,
          "Missing the required parameter 'dSGroupUsersAddRequest' when calling addDSGroupUsers");
    }

    // create path and map variables
    String localVarPath = "/v2.1/organizations/{organizationId}/accounts/{accountId}/dsgroups/{dsGroupId}/users"
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
        .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "dsGroupId" + "\\}", apiClient.escapeString(dsGroupId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {
        "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
        "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<AddDSGroupAndUsersResponse> localVarReturnType = new GenericType<AddDSGroupAndUsersResponse>() {
    };
    AddDSGroupAndUsersResponse localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams,
        localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept,
        localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<AddDSGroupAndUsersResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(),
        localVarResponse);
  }

  /**
   * Delete a DSGroup.
   * Required scopes: user_write
   * 
   * @param organizationId The organization ID GUID (required)
   * @param accountId      The account ID GUID (required)
   * @param dsGroupId      The DSGroup ID GUID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDSGroup(java.util.UUID organizationId, java.util.UUID accountId, java.util.UUID dsGroupId)
      throws ApiException {
    deleteDSGroupWithHttpInfo(organizationId, accountId, dsGroupId);
  }

  /**
   * Delete a DSGroup
   * Required scopes: user_write
   * 
   * @param organizationId The organization ID GUID (required)
   * @param accountId      The account ID GUID (required)
   * @param dsGroupId      The DSGroup ID GUID (required)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> deleteDSGroupWithHttpInfo(java.util.UUID organizationId, java.util.UUID accountId,
      java.util.UUID dsGroupId) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling deleteDSGroup");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteDSGroup");
    }

    // verify the required parameter 'dsGroupId' is set
    if (dsGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'dsGroupId' when calling deleteDSGroup");
    }

    // create path and map variables
    String localVarPath = "/v2.1/organizations/{organizationId}/accounts/{accountId}/dsgroups/{dsGroupId}"
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
        .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "dsGroupId" + "\\}", apiClient.escapeString(dsGroupId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {
        "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
        "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody,
        localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Get list of DSGroup.
   * Required scopes: user_read
   * 
   * @param organizationId The organization ID GUID (required)
   * @param accountId      The account ID GUID (required)
   * @param dsGroupId      The dsGroup ID GUID (required)
   * @return DSGroupResponse
   * @throws ApiException if fails to make API call
   */
  public DSGroupResponse getDSGroup(java.util.UUID organizationId, java.util.UUID accountId, java.util.UUID dsGroupId)
      throws ApiException {
    ApiResponse<DSGroupResponse> localVarResponse = getDSGroupWithHttpInfo(organizationId, accountId, dsGroupId);
    return localVarResponse.getData();
  }

  /**
   * Get list of DSGroup
   * Required scopes: user_read
   * 
   * @param organizationId The organization ID GUID (required)
   * @param accountId      The account ID GUID (required)
   * @param dsGroupId      The dsGroup ID GUID (required)
   * @return DSGroupResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DSGroupResponse> getDSGroupWithHttpInfo(java.util.UUID organizationId, java.util.UUID accountId,
      java.util.UUID dsGroupId) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getDSGroup");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDSGroup");
    }

    // verify the required parameter 'dsGroupId' is set
    if (dsGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'dsGroupId' when calling getDSGroup");
    }

    // create path and map variables
    String localVarPath = "/v2.1/organizations/{organizationId}/accounts/{accountId}/dsgroups/{dsGroupId}"
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
        .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "dsGroupId" + "\\}", apiClient.escapeString(dsGroupId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {
        "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
        "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<DSGroupResponse> localVarReturnType = new GenericType<DSGroupResponse>() {
    };
    DSGroupResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams,
        localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept,
        localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DSGroupResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(),
        localVarResponse);
  }
  /// <summary>
  /// Get list of users in a DSGroup Required scopes: user_read
  /// </summary>

  /**
   * GetDSGroupUsersOptions Class.
   *
   **/
  public class GetDSGroupUsersOptions {
    private Integer page = null;
    private Integer pageSize = null;

    /**
     * setPage method.
     */
    public void setPage(Integer page) {
      this.page = page;
    }

    /**
     * getPage method.
     *
     * @return Integer
     */
    public Integer getPage() {
      return this.page;
    }

    /**
     * setPageSize method.
     */
    public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
    }

    /**
     * getPageSize method.
     *
     * @return Integer
     */
    public Integer getPageSize() {
      return this.pageSize;
    }
  }

  /**
   * Get list of users in a DSGroup.
   * Required scopes: user_read
   * 
   * @param organizationId The organization ID GUID (required)
   * @param accountId      The account ID GUID (required)
   * @param dsGroupId      The DSGroup ID GUID (required)
   * @return DSGroupAndUsersResponse
   */
  public DSGroupAndUsersResponse getDSGroupUsers(java.util.UUID organizationId, java.util.UUID accountId,
      java.util.UUID dsGroupId) throws ApiException {
    return getDSGroupUsers(organizationId, accountId, dsGroupId, null);
  }

  /**
   * Get list of users in a DSGroup.
   * Required scopes: user_read
   * 
   * @param organizationId The organization ID GUID (required)
   * @param accountId      The account ID GUID (required)
   * @param dsGroupId      The DSGroup ID GUID (required)
   * @param options        for modifying the method behavior.
   * @return DSGroupAndUsersResponse
   * @throws ApiException if fails to make API call
   */
  public DSGroupAndUsersResponse getDSGroupUsers(java.util.UUID organizationId, java.util.UUID accountId,
      java.util.UUID dsGroupId, DsGroupsApi.GetDSGroupUsersOptions options) throws ApiException {
    ApiResponse<DSGroupAndUsersResponse> localVarResponse = getDSGroupUsersWithHttpInfo(organizationId, accountId,
        dsGroupId, options);
    return localVarResponse.getData();
  }

  /**
   * Get list of users in a DSGroup
   * Required scopes: user_read
   * 
   * @param organizationId The organization ID GUID (required)
   * @param accountId      The account ID GUID (required)
   * @param dsGroupId      The DSGroup ID GUID (required)
   * @param options        for modifying the method behavior.
   * @return DSGroupAndUsersResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DSGroupAndUsersResponse> getDSGroupUsersWithHttpInfo(java.util.UUID organizationId,
      java.util.UUID accountId, java.util.UUID dsGroupId, DsGroupsApi.GetDSGroupUsersOptions options)
      throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getDSGroupUsers");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDSGroupUsers");
    }

    // verify the required parameter 'dsGroupId' is set
    if (dsGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'dsGroupId' when calling getDSGroupUsers");
    }

    // create path and map variables
    String localVarPath = "/v2.1/organizations/{organizationId}/accounts/{accountId}/dsgroups/{dsGroupId}/users"
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
        .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "dsGroupId" + "\\}", apiClient.escapeString(dsGroupId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("page", options.page));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("page_size", options.pageSize));
    }

    final String[] localVarAccepts = {
        "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
        "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<DSGroupAndUsersResponse> localVarReturnType = new GenericType<DSGroupAndUsersResponse>() {
    };
    DSGroupAndUsersResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams,
        localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept,
        localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DSGroupAndUsersResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(),
        localVarResponse);
  }
  /// <summary>
  /// Get list of DSGroups Required scopes: user_read
  /// </summary>

  /**
   * GetDSGroupsOptions Class.
   *
   **/
  public class GetDSGroupsOptions {
    private Integer page = null;
    private Integer pageSize = null;

    /**
     * setPage method.
     */
    public void setPage(Integer page) {
      this.page = page;
    }

    /**
     * getPage method.
     *
     * @return Integer
     */
    public Integer getPage() {
      return this.page;
    }

    /**
     * setPageSize method.
     */
    public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
    }

    /**
     * getPageSize method.
     *
     * @return Integer
     */
    public Integer getPageSize() {
      return this.pageSize;
    }
  }

  /**
   * Get list of DSGroups.
   * Required scopes: user_read
   * 
   * @param organizationId The organization ID GUID (required)
   * @param accountId      The account ID GUID (required)
   * @return DSGroupListResponse
   */
  public DSGroupListResponse getDSGroups(java.util.UUID organizationId, java.util.UUID accountId) throws ApiException {
    return getDSGroups(organizationId, accountId, null);
  }

  /**
   * Get list of DSGroups.
   * Required scopes: user_read
   * 
   * @param organizationId The organization ID GUID (required)
   * @param accountId      The account ID GUID (required)
   * @param options        for modifying the method behavior.
   * @return DSGroupListResponse
   * @throws ApiException if fails to make API call
   */
  public DSGroupListResponse getDSGroups(java.util.UUID organizationId, java.util.UUID accountId,
      DsGroupsApi.GetDSGroupsOptions options) throws ApiException {
    ApiResponse<DSGroupListResponse> localVarResponse = getDSGroupsWithHttpInfo(organizationId, accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Get list of DSGroups
   * Required scopes: user_read
   * 
   * @param organizationId The organization ID GUID (required)
   * @param accountId      The account ID GUID (required)
   * @param options        for modifying the method behavior.
   * @return DSGroupListResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<DSGroupListResponse> getDSGroupsWithHttpInfo(java.util.UUID organizationId,
      java.util.UUID accountId, DsGroupsApi.GetDSGroupsOptions options) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getDSGroups");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDSGroups");
    }

    // create path and map variables
    String localVarPath = "/v2.1/organizations/{organizationId}/accounts/{accountId}/dsgroups"
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
        .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("page", options.page));
    }
    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("page_size", options.pageSize));
    }

    final String[] localVarAccepts = {
        "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
        "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<DSGroupListResponse> localVarReturnType = new GenericType<DSGroupListResponse>() {
    };
    DSGroupListResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams,
        localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept,
        localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<DSGroupListResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(),
        localVarResponse);
  }

  /**
   * Remove users from a DSGroup.
   * Required scopes: user_write
   * 
   * @param organizationId            The organization ID GUID (required)
   * @param accountId                 The account ID GUID (required)
   * @param dsGroupId                 The DSGroup ID GUID (required)
   * @param dSGroupUsersRemoveRequest Remove DSGroup users request object
   *                                  (required)
   * @return RemoveDSGroupUsersResponse
   * @throws ApiException if fails to make API call
   */
  public RemoveDSGroupUsersResponse removeDSGroupUsers(java.util.UUID organizationId, java.util.UUID accountId,
      java.util.UUID dsGroupId, DSGroupUsersRemoveRequest dSGroupUsersRemoveRequest) throws ApiException {
    ApiResponse<RemoveDSGroupUsersResponse> localVarResponse = removeDSGroupUsersWithHttpInfo(organizationId, accountId,
        dsGroupId, dSGroupUsersRemoveRequest);
    return localVarResponse.getData();
  }

  /**
   * Remove users from a DSGroup
   * Required scopes: user_write
   * 
   * @param organizationId            The organization ID GUID (required)
   * @param accountId                 The account ID GUID (required)
   * @param dsGroupId                 The DSGroup ID GUID (required)
   * @param dSGroupUsersRemoveRequest Remove DSGroup users request object
   *                                  (required)
   * @return RemoveDSGroupUsersResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RemoveDSGroupUsersResponse> removeDSGroupUsersWithHttpInfo(java.util.UUID organizationId,
      java.util.UUID accountId, java.util.UUID dsGroupId, DSGroupUsersRemoveRequest dSGroupUsersRemoveRequest)
      throws ApiException {
    Object localVarPostBody = dSGroupUsersRemoveRequest;

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling removeDSGroupUsers");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling removeDSGroupUsers");
    }

    // verify the required parameter 'dsGroupId' is set
    if (dsGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'dsGroupId' when calling removeDSGroupUsers");
    }

    // verify the required parameter 'dSGroupUsersRemoveRequest' is set
    if (dSGroupUsersRemoveRequest == null) {
      throw new ApiException(400,
          "Missing the required parameter 'dSGroupUsersRemoveRequest' when calling removeDSGroupUsers");
    }

    // create path and map variables
    String localVarPath = "/v2.1/organizations/{organizationId}/accounts/{accountId}/dsgroups/{dsGroupId}/users"
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
        .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "dsGroupId" + "\\}", apiClient.escapeString(dsGroupId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {
        "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
        "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {};

    GenericType<RemoveDSGroupUsersResponse> localVarReturnType = new GenericType<RemoveDSGroupUsersResponse>() {
    };
    RemoveDSGroupUsersResponse localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams,
        localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept,
        localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<RemoveDSGroupUsersResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(),
        localVarResponse);
  }
}
