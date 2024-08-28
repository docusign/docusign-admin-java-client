
package com.docusign.admin.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.admin.client.ApiException;
import com.docusign.admin.client.ApiClient;
import com.docusign.admin.client.Configuration;
import com.docusign.admin.model.*;
import com.docusign.admin.client.Pair;
import com.docusign.admin.client.ApiResponse;




/**
 * ProvisionAssetGroupApi class.
 *
 **/
public class ProvisionAssetGroupApi {
  private ApiClient apiClient;

 /**
  * ProvisionAssetGroupApi.
  *
  **/
  public ProvisionAssetGroupApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * ProvisionAssetGroupApi.
  *
  **/
  public ProvisionAssetGroupApi(ApiClient apiClient) {
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
   * Clones an existing Docusign account to a new Docusign account..
   * Currently this only clones eSign settings and asset group information.  Required scopes: asset_group_account_clone_write
   * @param organizationId The Guid representing the organization id. (required)
   * @param request The request defails for the new asset group account clone. (required)
   * @return AssetGroupAccountClone
   * @throws ApiException if fails to make API call
   */
  public AssetGroupAccountClone cloneAssetGroupAccount(java.util.UUID organizationId, AssetGroupAccountClone request) throws ApiException {
    ApiResponse<AssetGroupAccountClone> localVarResponse = cloneAssetGroupAccountWithHttpInfo(organizationId, request);
    return localVarResponse.getData();
  }

  /**
   * Clones an existing Docusign account to a new Docusign account.
   * Currently this only clones eSign settings and asset group information.  Required scopes: asset_group_account_clone_write
   * @param organizationId The Guid representing the organization id. (required)
   * @param request The request defails for the new asset group account clone. (required)
   * @return AssetGroupAccountClone
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AssetGroupAccountClone > cloneAssetGroupAccountWithHttpInfo(java.util.UUID organizationId, AssetGroupAccountClone request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling cloneAssetGroupAccount");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling cloneAssetGroupAccount");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/assetGroups/accountClone"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()));

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
    
    GenericType<AssetGroupAccountClone> localVarReturnType = new GenericType<AssetGroupAccountClone>() {};
    AssetGroupAccountClone localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<AssetGroupAccountClone>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Creates a new Docusign account using the plan and modules specified in request body..
   * Currently this only supports eSign plans and modules.  Required scopes: organization_sub_account_write
   * @param organizationId The Guid representing the organization id. (required)
   * @param request The request details for the new account. (required)
   * @return SubscriptionProvisionModelAssetGroupWorkResult
   * @throws ApiException if fails to make API call
   */
  public SubscriptionProvisionModelAssetGroupWorkResult createAssetGroupAccount(java.util.UUID organizationId, SubAccountCreateRequest request) throws ApiException {
    ApiResponse<SubscriptionProvisionModelAssetGroupWorkResult> localVarResponse = createAssetGroupAccountWithHttpInfo(organizationId, request);
    return localVarResponse.getData();
  }

  /**
   * Creates a new Docusign account using the plan and modules specified in request body.
   * Currently this only supports eSign plans and modules.  Required scopes: organization_sub_account_write
   * @param organizationId The Guid representing the organization id. (required)
   * @param request The request details for the new account. (required)
   * @return SubscriptionProvisionModelAssetGroupWorkResult
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SubscriptionProvisionModelAssetGroupWorkResult > createAssetGroupAccountWithHttpInfo(java.util.UUID organizationId, SubAccountCreateRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling createAssetGroupAccount");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling createAssetGroupAccount");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/assetGroups/accountCreate"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()));

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
    
    GenericType<SubscriptionProvisionModelAssetGroupWorkResult> localVarReturnType = new GenericType<SubscriptionProvisionModelAssetGroupWorkResult>() {};
    SubscriptionProvisionModelAssetGroupWorkResult localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<SubscriptionProvisionModelAssetGroupWorkResult>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets an asset group account clone by the asset group work id. Required scopes: asset_group_account_clone_read
  /// </summary>

 /**
  * GetAssetGroupAccountCloneOptions Class.
  *
  **/
  public class GetAssetGroupAccountCloneOptions
  {
  private Boolean includeDetails = null;
  
 /**
  * setIncludeDetails method.
  */
  public void setIncludeDetails(Boolean includeDetails) {
    this.includeDetails = includeDetails;
  }

 /**
  * getIncludeDetails method.
  *
  * @return Boolean
  */
  public Boolean getIncludeDetails() {
    return this.includeDetails;
  }
  }

   /**
   * Gets an asset group account clone by the asset group work id..
   * Required scopes: asset_group_account_clone_read
   * @param organizationId The Guid representing the organization id. (required)
   * @param assetGroupId The Guid representing the asset group id. (required)
   * @param assetGroupWorkId The Guid representing the asset group account clone id (required)
   * @return AssetGroupAccountClone
   */ 
  public AssetGroupAccountClone getAssetGroupAccountClone(java.util.UUID organizationId, java.util.UUID assetGroupId, java.util.UUID assetGroupWorkId) throws ApiException {
    return getAssetGroupAccountClone(organizationId, assetGroupId, assetGroupWorkId, null);
  }

  /**
   * Gets an asset group account clone by the asset group work id..
   * Required scopes: asset_group_account_clone_read
   * @param organizationId The Guid representing the organization id. (required)
   * @param assetGroupId The Guid representing the asset group id. (required)
   * @param assetGroupWorkId The Guid representing the asset group account clone id (required)
   * @param options for modifying the method behavior.
   * @return AssetGroupAccountClone
   * @throws ApiException if fails to make API call
   */
  public AssetGroupAccountClone getAssetGroupAccountClone(java.util.UUID organizationId, java.util.UUID assetGroupId, java.util.UUID assetGroupWorkId, ProvisionAssetGroupApi.GetAssetGroupAccountCloneOptions options) throws ApiException {
    ApiResponse<AssetGroupAccountClone> localVarResponse = getAssetGroupAccountCloneWithHttpInfo(organizationId, assetGroupId, assetGroupWorkId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets an asset group account clone by the asset group work id.
   * Required scopes: asset_group_account_clone_read
   * @param organizationId The Guid representing the organization id. (required)
   * @param assetGroupId The Guid representing the asset group id. (required)
   * @param assetGroupWorkId The Guid representing the asset group account clone id (required)
   * @param options for modifying the method behavior.
   * @return AssetGroupAccountClone
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AssetGroupAccountClone > getAssetGroupAccountCloneWithHttpInfo(java.util.UUID organizationId, java.util.UUID assetGroupId, java.util.UUID assetGroupWorkId, ProvisionAssetGroupApi.GetAssetGroupAccountCloneOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getAssetGroupAccountClone");
    }
    
    // verify the required parameter 'assetGroupId' is set
    if (assetGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetGroupId' when calling getAssetGroupAccountClone");
    }
    
    // verify the required parameter 'assetGroupWorkId' is set
    if (assetGroupWorkId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetGroupWorkId' when calling getAssetGroupAccountClone");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/assetGroups/{assetGroupId}/accountClones/{assetGroupWorkId}"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "assetGroupId" + "\\}", apiClient.escapeString(assetGroupId.toString()))
      .replaceAll("\\{" + "assetGroupWorkId" + "\\}", apiClient.escapeString(assetGroupWorkId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_details", options.includeDetails));
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
    
    GenericType<AssetGroupAccountClone> localVarReturnType = new GenericType<AssetGroupAccountClone>() {};
    AssetGroupAccountClone localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<AssetGroupAccountClone>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets all asset group account clone(s) for an organization id. Required scopes: asset_group_account_clone_read
  /// </summary>

 /**
  * GetAssetGroupAccountClonesByOrgIdOptions Class.
  *
  **/
  public class GetAssetGroupAccountClonesByOrgIdOptions
  {
  private String sinceUpdatedDate = null;
  private Boolean includeDetails = null;
  
 /**
  * setSinceUpdatedDate method.
  */
  public void setSinceUpdatedDate(String sinceUpdatedDate) {
    this.sinceUpdatedDate = sinceUpdatedDate;
  }

 /**
  * getSinceUpdatedDate method.
  *
  * @return String
  */
  public String getSinceUpdatedDate() {
    return this.sinceUpdatedDate;
  }
  
 /**
  * setIncludeDetails method.
  */
  public void setIncludeDetails(Boolean includeDetails) {
    this.includeDetails = includeDetails;
  }

 /**
  * getIncludeDetails method.
  *
  * @return Boolean
  */
  public Boolean getIncludeDetails() {
    return this.includeDetails;
  }
  }

   /**
   * Gets all asset group account clone(s) for an organization id..
   * Required scopes: asset_group_account_clone_read
   * @param organizationId The Guid representing the organization id. (required)
   * @return AssetGroupAccountClones
   */ 
  public AssetGroupAccountClones getAssetGroupAccountClonesByOrgId(java.util.UUID organizationId) throws ApiException {
    return getAssetGroupAccountClonesByOrgId(organizationId, null);
  }

  /**
   * Gets all asset group account clone(s) for an organization id..
   * Required scopes: asset_group_account_clone_read
   * @param organizationId The Guid representing the organization id. (required)
   * @param options for modifying the method behavior.
   * @return AssetGroupAccountClones
   * @throws ApiException if fails to make API call
   */
  public AssetGroupAccountClones getAssetGroupAccountClonesByOrgId(java.util.UUID organizationId, ProvisionAssetGroupApi.GetAssetGroupAccountClonesByOrgIdOptions options) throws ApiException {
    ApiResponse<AssetGroupAccountClones> localVarResponse = getAssetGroupAccountClonesByOrgIdWithHttpInfo(organizationId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets all asset group account clone(s) for an organization id.
   * Required scopes: asset_group_account_clone_read
   * @param organizationId The Guid representing the organization id. (required)
   * @param options for modifying the method behavior.
   * @return AssetGroupAccountClones
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AssetGroupAccountClones > getAssetGroupAccountClonesByOrgIdWithHttpInfo(java.util.UUID organizationId, ProvisionAssetGroupApi.GetAssetGroupAccountClonesByOrgIdOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getAssetGroupAccountClonesByOrgId");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/assetGroups/accountClones"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("since_updated_date", options.sinceUpdatedDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_details", options.includeDetails));
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
    
    GenericType<AssetGroupAccountClones> localVarReturnType = new GenericType<AssetGroupAccountClones>() {};
    AssetGroupAccountClones localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<AssetGroupAccountClones>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Get all accounts in asset groups for the organization. Required scopes: asset_group_account_read
  /// </summary>

 /**
  * GetAssetGroupAccountsOptions Class.
  *
  **/
  public class GetAssetGroupAccountsOptions
  {
  private Boolean compliant = null;
  
 /**
  * setCompliant method.
  */
  public void setCompliant(Boolean compliant) {
    this.compliant = compliant;
  }

 /**
  * getCompliant method.
  *
  * @return Boolean
  */
  public Boolean getCompliant() {
    return this.compliant;
  }
  }

   /**
   * Get all accounts in asset groups for the organization..
   * Required scopes: asset_group_account_read
   * @param organizationId The Guid representing the organization id. (required)
   * @return AssetGroupAccountsResponse
   */ 
  public AssetGroupAccountsResponse getAssetGroupAccounts(java.util.UUID organizationId) throws ApiException {
    return getAssetGroupAccounts(organizationId, null);
  }

  /**
   * Get all accounts in asset groups for the organization..
   * Required scopes: asset_group_account_read
   * @param organizationId The Guid representing the organization id. (required)
   * @param options for modifying the method behavior.
   * @return AssetGroupAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public AssetGroupAccountsResponse getAssetGroupAccounts(java.util.UUID organizationId, ProvisionAssetGroupApi.GetAssetGroupAccountsOptions options) throws ApiException {
    ApiResponse<AssetGroupAccountsResponse> localVarResponse = getAssetGroupAccountsWithHttpInfo(organizationId, options);
    return localVarResponse.getData();
  }

  /**
   * Get all accounts in asset groups for the organization.
   * Required scopes: asset_group_account_read
   * @param organizationId The Guid representing the organization id. (required)
   * @param options for modifying the method behavior.
   * @return AssetGroupAccountsResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AssetGroupAccountsResponse > getAssetGroupAccountsWithHttpInfo(java.util.UUID organizationId, ProvisionAssetGroupApi.GetAssetGroupAccountsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getAssetGroupAccounts");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/assetGroups/accounts"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("compliant", options.compliant));
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
    
    GenericType<AssetGroupAccountsResponse> localVarReturnType = new GenericType<AssetGroupAccountsResponse>() {};
    AssetGroupAccountsResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<AssetGroupAccountsResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets the subscription details for an organization id..
   * Currently charges and non e-sign assets are excluded in the response.  Required scopes: organization_sub_account_read
   * @param organizationId The Guid representing the organization id. (required)
   * @return java.util.List<OrganizationSubscriptionResponse>
   * @throws ApiException if fails to make API call
   */
  public java.util.List<OrganizationSubscriptionResponse> getOrganizationPlanItems(java.util.UUID organizationId) throws ApiException {
    ApiResponse<java.util.List<OrganizationSubscriptionResponse>> localVarResponse = getOrganizationPlanItemsWithHttpInfo(organizationId);
    return localVarResponse.getData();
  }

  /**
   * Gets the subscription details for an organization id.
   * Currently charges and non e-sign assets are excluded in the response.  Required scopes: organization_sub_account_read
   * @param organizationId The Guid representing the organization id. (required)
   * @return java.util.List<OrganizationSubscriptionResponse>
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<java.util.List<OrganizationSubscriptionResponse> > getOrganizationPlanItemsWithHttpInfo(java.util.UUID organizationId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getOrganizationPlanItems");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/planItems"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()));

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
    
    GenericType<java.util.List<OrganizationSubscriptionResponse>> localVarReturnType = new GenericType<java.util.List<OrganizationSubscriptionResponse>>() {};
    java.util.List<OrganizationSubscriptionResponse> localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<java.util.List<OrganizationSubscriptionResponse>>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets an asset group account create process info by the asset group work id. Required scopes: organization_sub_account_read
  /// </summary>

 /**
  * GetSubAccountCreateProcessByAssetGroupWorkIdOptions Class.
  *
  **/
  public class GetSubAccountCreateProcessByAssetGroupWorkIdOptions
  {
  private Boolean includeDetails = null;
  
 /**
  * setIncludeDetails method.
  */
  public void setIncludeDetails(Boolean includeDetails) {
    this.includeDetails = includeDetails;
  }

 /**
  * getIncludeDetails method.
  *
  * @return Boolean
  */
  public Boolean getIncludeDetails() {
    return this.includeDetails;
  }
  }

   /**
   * Gets an asset group account create process info by the asset group work id..
   * Required scopes: organization_sub_account_read
   * @param organizationId The Guid representing the organization id. (required)
   * @param assetGroupId The Guid representing the asset group id. (required)
   * @param assetGroupWorkId The Guid representing the asset group account create id (required)
   * @return SubAccountCreateWorker
   */ 
  public SubAccountCreateWorker getSubAccountCreateProcessByAssetGroupWorkId(java.util.UUID organizationId, java.util.UUID assetGroupId, java.util.UUID assetGroupWorkId) throws ApiException {
    return getSubAccountCreateProcessByAssetGroupWorkId(organizationId, assetGroupId, assetGroupWorkId, null);
  }

  /**
   * Gets an asset group account create process info by the asset group work id..
   * Required scopes: organization_sub_account_read
   * @param organizationId The Guid representing the organization id. (required)
   * @param assetGroupId The Guid representing the asset group id. (required)
   * @param assetGroupWorkId The Guid representing the asset group account create id (required)
   * @param options for modifying the method behavior.
   * @return SubAccountCreateWorker
   * @throws ApiException if fails to make API call
   */
  public SubAccountCreateWorker getSubAccountCreateProcessByAssetGroupWorkId(java.util.UUID organizationId, java.util.UUID assetGroupId, java.util.UUID assetGroupWorkId, ProvisionAssetGroupApi.GetSubAccountCreateProcessByAssetGroupWorkIdOptions options) throws ApiException {
    ApiResponse<SubAccountCreateWorker> localVarResponse = getSubAccountCreateProcessByAssetGroupWorkIdWithHttpInfo(organizationId, assetGroupId, assetGroupWorkId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets an asset group account create process info by the asset group work id.
   * Required scopes: organization_sub_account_read
   * @param organizationId The Guid representing the organization id. (required)
   * @param assetGroupId The Guid representing the asset group id. (required)
   * @param assetGroupWorkId The Guid representing the asset group account create id (required)
   * @param options for modifying the method behavior.
   * @return SubAccountCreateWorker
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SubAccountCreateWorker > getSubAccountCreateProcessByAssetGroupWorkIdWithHttpInfo(java.util.UUID organizationId, java.util.UUID assetGroupId, java.util.UUID assetGroupWorkId, ProvisionAssetGroupApi.GetSubAccountCreateProcessByAssetGroupWorkIdOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getSubAccountCreateProcessByAssetGroupWorkId");
    }
    
    // verify the required parameter 'assetGroupId' is set
    if (assetGroupId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetGroupId' when calling getSubAccountCreateProcessByAssetGroupWorkId");
    }
    
    // verify the required parameter 'assetGroupWorkId' is set
    if (assetGroupWorkId == null) {
      throw new ApiException(400, "Missing the required parameter 'assetGroupWorkId' when calling getSubAccountCreateProcessByAssetGroupWorkId");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/assetGroup/{assetGroupId}/subAccountCreated/{assetGroupWorkId}"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "assetGroupId" + "\\}", apiClient.escapeString(assetGroupId.toString()))
      .replaceAll("\\{" + "assetGroupWorkId" + "\\}", apiClient.escapeString(assetGroupWorkId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_details", options.includeDetails));
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
    
    GenericType<SubAccountCreateWorker> localVarReturnType = new GenericType<SubAccountCreateWorker>() {};
    SubAccountCreateWorker localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<SubAccountCreateWorker>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets all asset group account creation processes for an organization id. Required scopes: organization_sub_account_read
  /// </summary>

 /**
  * GetSubAccountCreateProcessesByOrgIdOptions Class.
  *
  **/
  public class GetSubAccountCreateProcessesByOrgIdOptions
  {
  private String sinceUpdatedDate = null;
  private Boolean includeDetails = null;
  
 /**
  * setSinceUpdatedDate method.
  */
  public void setSinceUpdatedDate(String sinceUpdatedDate) {
    this.sinceUpdatedDate = sinceUpdatedDate;
  }

 /**
  * getSinceUpdatedDate method.
  *
  * @return String
  */
  public String getSinceUpdatedDate() {
    return this.sinceUpdatedDate;
  }
  
 /**
  * setIncludeDetails method.
  */
  public void setIncludeDetails(Boolean includeDetails) {
    this.includeDetails = includeDetails;
  }

 /**
  * getIncludeDetails method.
  *
  * @return Boolean
  */
  public Boolean getIncludeDetails() {
    return this.includeDetails;
  }
  }

   /**
   * Gets all asset group account creation processes for an organization id..
   * Required scopes: organization_sub_account_read
   * @param organizationId The Guid representing the organization id. (required)
   * @return SubAccountCreateWorkerResponse
   */ 
  public SubAccountCreateWorkerResponse getSubAccountCreateProcessesByOrgId(java.util.UUID organizationId) throws ApiException {
    return getSubAccountCreateProcessesByOrgId(organizationId, null);
  }

  /**
   * Gets all asset group account creation processes for an organization id..
   * Required scopes: organization_sub_account_read
   * @param organizationId The Guid representing the organization id. (required)
   * @param options for modifying the method behavior.
   * @return SubAccountCreateWorkerResponse
   * @throws ApiException if fails to make API call
   */
  public SubAccountCreateWorkerResponse getSubAccountCreateProcessesByOrgId(java.util.UUID organizationId, ProvisionAssetGroupApi.GetSubAccountCreateProcessesByOrgIdOptions options) throws ApiException {
    ApiResponse<SubAccountCreateWorkerResponse> localVarResponse = getSubAccountCreateProcessesByOrgIdWithHttpInfo(organizationId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets all asset group account creation processes for an organization id.
   * Required scopes: organization_sub_account_read
   * @param organizationId The Guid representing the organization id. (required)
   * @param options for modifying the method behavior.
   * @return SubAccountCreateWorkerResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SubAccountCreateWorkerResponse > getSubAccountCreateProcessesByOrgIdWithHttpInfo(java.util.UUID organizationId, ProvisionAssetGroupApi.GetSubAccountCreateProcessesByOrgIdOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getSubAccountCreateProcessesByOrgId");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/subAccountsCreated"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("since_updated_date", options.sinceUpdatedDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_details", options.includeDetails));
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
    
    GenericType<SubAccountCreateWorkerResponse> localVarReturnType = new GenericType<SubAccountCreateWorkerResponse>() {};
    SubAccountCreateWorkerResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<SubAccountCreateWorkerResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
