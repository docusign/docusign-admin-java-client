
package com.docusign.admin.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.admin.client.ApiException;
import com.docusign.admin.client.ApiClient;
import com.docusign.admin.client.Configuration;
import com.docusign.admin.model.*;
import com.docusign.admin.client.Pair;
import com.docusign.admin.client.ApiResponse;




/**
 * AccountsApi class.
 *
 **/
public class AccountsApi {
  private ApiClient apiClient;

 /**
  * AccountsApi.
  *
  **/
  public AccountsApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * AccountsApi.
  *
  **/
  public AccountsApi(ApiClient apiClient) {
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

  /// <summary>
  /// Returns the list of groups in an account. Required scopes: group_read
  /// </summary>

 /**
  * GetGroupsOptions Class.
  *
  **/
  public class GetGroupsOptions
  {
  private Integer start = null;
  private Integer take = null;
  private Integer end = null;
  
 /**
  * setStart method.
  */
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
  
 /**
  * setTake method.
  */
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
  
 /**
  * setEnd method.
  */
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
  }

   /**
   * Returns the list of groups in an account..
   * Required scopes: group_read
   * @param organizationId The organization ID Guid (required)
   * @param accountId The account ID Guid (required)
   * @return MemberGroupsResponse
   */ 
  public MemberGroupsResponse getGroups(java.util.UUID organizationId, java.util.UUID accountId) throws ApiException {
    return getGroups(organizationId, accountId, null);
  }

  /**
   * Returns the list of groups in an account..
   * Required scopes: group_read
   * @param organizationId The organization ID Guid (required)
   * @param accountId The account ID Guid (required)
   * @param options for modifying the method behavior.
   * @return MemberGroupsResponse
   * @throws ApiException if fails to make API call
   */
  public MemberGroupsResponse getGroups(java.util.UUID organizationId, java.util.UUID accountId, AccountsApi.GetGroupsOptions options) throws ApiException {
    ApiResponse<MemberGroupsResponse> localVarResponse = getGroupsWithHttpInfo(organizationId, accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Returns the list of groups in an account.
   * Required scopes: group_read
   * @param organizationId The organization ID Guid (required)
   * @param accountId The account ID Guid (required)
   * @param options for modifying the method behavior.
   * @return MemberGroupsResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<MemberGroupsResponse > getGroupsWithHttpInfo(java.util.UUID organizationId, java.util.UUID accountId, AccountsApi.GetGroupsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getGroups");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getGroups");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/accounts/{accountId}/groups"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("start", options.start));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("take", options.take));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("end", options.end));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<MemberGroupsResponse> localVarReturnType = new GenericType<MemberGroupsResponse>() {};
    MemberGroupsResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<MemberGroupsResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Returns the list of organizations of which the authenticated user is a member. Required scopes: organization_read
  /// </summary>

 /**
  * GetOrganizationsOptions Class.
  *
  **/
  public class GetOrganizationsOptions
  {
  private String mode = null;
  
 /**
  * setMode method.
  */
  public void setMode(String mode) {
    this.mode = mode;
  }

 /**
  * getMode method.
  *
  * @return String
  */
  public String getMode() {
    return this.mode;
  }
  }

   /**
   * Returns the list of organizations of which the authenticated user is a member..
   * Required scopes: organization_read
   * @return OrganizationsResponse
   */ 
  public OrganizationsResponse getOrganizations() throws ApiException {
    return getOrganizations(null);
  }

  /**
   * Returns the list of organizations of which the authenticated user is a member..
   * Required scopes: organization_read
   * @param options for modifying the method behavior.
   * @return OrganizationsResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationsResponse getOrganizations(AccountsApi.GetOrganizationsOptions options) throws ApiException {
    ApiResponse<OrganizationsResponse> localVarResponse = getOrganizationsWithHttpInfo(options);
    return localVarResponse.getData();
  }

  /**
   * Returns the list of organizations of which the authenticated user is a member.
   * Required scopes: organization_read
   * @param options for modifying the method behavior.
   * @return OrganizationsResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationsResponse > getOrganizationsWithHttpInfo(AccountsApi.GetOrganizationsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/v2/organizations";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("mode", options.mode));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<OrganizationsResponse> localVarReturnType = new GenericType<OrganizationsResponse>() {};
    OrganizationsResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<OrganizationsResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns the list of permission profiles in an account..
   * Required scopes: permission_read
   * @param organizationId The organization ID Guid (required)
   * @param accountId The account ID Guid (required)
   * @return PermissionsResponse
   * @throws ApiException if fails to make API call
   */
  public PermissionsResponse getPermissions(java.util.UUID organizationId, java.util.UUID accountId) throws ApiException {
    ApiResponse<PermissionsResponse> localVarResponse = getPermissionsWithHttpInfo(organizationId, accountId);
    return localVarResponse.getData();
  }

  /**
   * Returns the list of permission profiles in an account.
   * Required scopes: permission_read
   * @param organizationId The organization ID Guid (required)
   * @param accountId The account ID Guid (required)
   * @return PermissionsResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PermissionsResponse > getPermissionsWithHttpInfo(java.util.UUID organizationId, java.util.UUID accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getPermissions");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPermissions");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/accounts/{accountId}/permissions"
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

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<PermissionsResponse> localVarReturnType = new GenericType<PermissionsResponse>() {};
    PermissionsResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<PermissionsResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Redacts membership data for users with memberships in an account..
   * Required scopes: user_data_redact
   * @param accountId The account ID Guid (required)
   * @param requestModel The request body describing the membership to be redacted (required)
   * @return IndividualUserDataRedactionResponse
   * @throws ApiException if fails to make API call
   */
  public IndividualUserDataRedactionResponse redactIndividualMembershipData(java.util.UUID accountId, IndividualMembershipDataRedactionRequest requestModel) throws ApiException {
    ApiResponse<IndividualUserDataRedactionResponse> localVarResponse = redactIndividualMembershipDataWithHttpInfo(accountId, requestModel);
    return localVarResponse.getData();
  }

  /**
   * Redacts membership data for users with memberships in an account.
   * Required scopes: user_data_redact
   * @param accountId The account ID Guid (required)
   * @param requestModel The request body describing the membership to be redacted (required)
   * @return IndividualUserDataRedactionResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<IndividualUserDataRedactionResponse > redactIndividualMembershipDataWithHttpInfo(java.util.UUID accountId, IndividualMembershipDataRedactionRequest requestModel) throws ApiException {
    Object localVarPostBody = requestModel;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling redactIndividualMembershipData");
    }
    
    // verify the required parameter 'requestModel' is set
    if (requestModel == null) {
      throw new ApiException(400, "Missing the required parameter 'requestModel' when calling redactIndividualMembershipData");
    }
    
    // create path and map variables
    String localVarPath = "/v2/data_redaction/accounts/{accountId}/user"
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

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<IndividualUserDataRedactionResponse> localVarReturnType = new GenericType<IndividualUserDataRedactionResponse>() {};
    IndividualUserDataRedactionResponse localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<IndividualUserDataRedactionResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
