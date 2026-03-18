
package com.docusign.admin.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.admin.client.ApiException;
import com.docusign.admin.client.ApiClient;
import com.docusign.admin.client.Configuration;
import com.docusign.admin.model.*;
import com.docusign.admin.client.Pair;
import com.docusign.admin.client.ApiResponse;




/**
 * OrgConnectApi class.
 *
 **/
public class OrgConnectApi {
  private ApiClient apiClient;

 /**
  * OrgConnectApi.
  *
  **/
  public OrgConnectApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * OrgConnectApi.
  *
  **/
  public OrgConnectApi(ApiClient apiClient) {
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
   * Adds a Connect configuration for an organization.
   * Required scopes: connect_org_config_write_api
   * @param organizationId The organization ID Guid (required)
   * @param connectRequest Add an organization Connect request (required)
   * @return OrganizationConnectConfigurationDetailsResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationConnectConfigurationDetailsResponse createOrganizationConnectConfig(java.util.UUID organizationId, OrganizationConnectConfigurationRequest connectRequest) throws ApiException {
    ApiResponse<OrganizationConnectConfigurationDetailsResponse> localVarResponse = createOrganizationConnectConfigWithHttpInfo(organizationId, connectRequest);
    return localVarResponse.getData();
  }

  /**
   * Adds a Connect configuration for an organization
   * Required scopes: connect_org_config_write_api
   * @param organizationId The organization ID Guid (required)
   * @param connectRequest Add an organization Connect request (required)
   * @return OrganizationConnectConfigurationDetailsResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationConnectConfigurationDetailsResponse > createOrganizationConnectConfigWithHttpInfo(java.util.UUID organizationId, OrganizationConnectConfigurationRequest connectRequest) throws ApiException {
    Object localVarPostBody = connectRequest;
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling createOrganizationConnectConfig");
    }
    
    // verify the required parameter 'connectRequest' is set
    if (connectRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'connectRequest' when calling createOrganizationConnectConfig");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/connect"
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
    
    GenericType<OrganizationConnectConfigurationDetailsResponse> localVarReturnType = new GenericType<OrganizationConnectConfigurationDetailsResponse>() {};
    OrganizationConnectConfigurationDetailsResponse localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<OrganizationConnectConfigurationDetailsResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes information about a Connect HMAC secret.
   * Required scopes: connect_org_hmac_write_api
   * @param organizationId The organization ID Guid (required)
   * @param keyId The key ID Guid (required)
   * @return OrganizationConnectHmacSecretsResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationConnectHmacSecretsResponse deleteConnectHmacSecret(java.util.UUID organizationId, java.util.UUID keyId) throws ApiException {
    ApiResponse<OrganizationConnectHmacSecretsResponse> localVarResponse = deleteConnectHmacSecretWithHttpInfo(organizationId, keyId);
    return localVarResponse.getData();
  }

  /**
   * Deletes information about a Connect HMAC secret
   * Required scopes: connect_org_hmac_write_api
   * @param organizationId The organization ID Guid (required)
   * @param keyId The key ID Guid (required)
   * @return OrganizationConnectHmacSecretsResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationConnectHmacSecretsResponse > deleteConnectHmacSecretWithHttpInfo(java.util.UUID organizationId, java.util.UUID keyId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling deleteConnectHmacSecret");
    }
    
    // verify the required parameter 'keyId' is set
    if (keyId == null) {
      throw new ApiException(400, "Missing the required parameter 'keyId' when calling deleteConnectHmacSecret");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/connect/secret/{keyId}"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "keyId" + "\\}", apiClient.escapeString(keyId.toString()));

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
    
    GenericType<OrganizationConnectHmacSecretsResponse> localVarReturnType = new GenericType<OrganizationConnectHmacSecretsResponse>() {};
    OrganizationConnectHmacSecretsResponse localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<OrganizationConnectHmacSecretsResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes information about an organization-level Connect configuration.
   * Required scopes: connect_org_config_write_api
   * @param organizationId The organization ID Guid (required)
   * @param connectId The configuration ID Guid (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object deleteOrganizationConnectConfig(java.util.UUID organizationId, java.util.UUID connectId) throws ApiException {
    ApiResponse<Object> localVarResponse = deleteOrganizationConnectConfigWithHttpInfo(organizationId, connectId);
    return localVarResponse.getData();
  }

  /**
   * Deletes information about an organization-level Connect configuration
   * Required scopes: connect_org_config_write_api
   * @param organizationId The organization ID Guid (required)
   * @param connectId The configuration ID Guid (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object > deleteOrganizationConnectConfigWithHttpInfo(java.util.UUID organizationId, java.util.UUID connectId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling deleteOrganizationConnectConfig");
    }
    
    // verify the required parameter 'connectId' is set
    if (connectId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectId' when calling deleteOrganizationConnectConfig");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/connect/{connectId}"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "connectId" + "\\}", apiClient.escapeString(connectId.toString()));

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
    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    Object localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes an organization-level Connect OAuth configuration.
   * Required scopes: connect_org_oauth_write_api
   * @param organizationId The organization ID Guid (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object deleteOrganizationConnectOAuthConfiguration(java.util.UUID organizationId) throws ApiException {
    ApiResponse<Object> localVarResponse = deleteOrganizationConnectOAuthConfigurationWithHttpInfo(organizationId);
    return localVarResponse.getData();
  }

  /**
   * Deletes an organization-level Connect OAuth configuration
   * Required scopes: connect_org_oauth_write_api
   * @param organizationId The organization ID Guid (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object > deleteOrganizationConnectOAuthConfigurationWithHttpInfo(java.util.UUID organizationId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling deleteOrganizationConnectOAuthConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/connect/oauth"
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
    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    Object localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns information about Connect HMAC secrets.
   * Required scopes: connect_org_hmac_read_api
   * @param organizationId The organization ID Guid (required)
   * @return OrganizationConnectHmacSecretsResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationConnectHmacSecretsResponse getConnectHmacSecrets(java.util.UUID organizationId) throws ApiException {
    ApiResponse<OrganizationConnectHmacSecretsResponse> localVarResponse = getConnectHmacSecretsWithHttpInfo(organizationId);
    return localVarResponse.getData();
  }

  /**
   * Returns information about Connect HMAC secrets
   * Required scopes: connect_org_hmac_read_api
   * @param organizationId The organization ID Guid (required)
   * @return OrganizationConnectHmacSecretsResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationConnectHmacSecretsResponse > getConnectHmacSecretsWithHttpInfo(java.util.UUID organizationId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getConnectHmacSecrets");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/connect/secret"
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
    
    GenericType<OrganizationConnectHmacSecretsResponse> localVarReturnType = new GenericType<OrganizationConnectHmacSecretsResponse>() {};
    OrganizationConnectHmacSecretsResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<OrganizationConnectHmacSecretsResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns an organization-level Connect configuration.
   * Required scopes: connect_org_config_read_api
   * @param organizationId The organization ID Guid (required)
   * @param connectId The configuration ID Guid (required)
   * @return OrganizationConnectConfigurationDetailsResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationConnectConfigurationDetailsResponse getOrganizationConnectConfig(java.util.UUID organizationId, java.util.UUID connectId) throws ApiException {
    ApiResponse<OrganizationConnectConfigurationDetailsResponse> localVarResponse = getOrganizationConnectConfigWithHttpInfo(organizationId, connectId);
    return localVarResponse.getData();
  }

  /**
   * Returns an organization-level Connect configuration
   * Required scopes: connect_org_config_read_api
   * @param organizationId The organization ID Guid (required)
   * @param connectId The configuration ID Guid (required)
   * @return OrganizationConnectConfigurationDetailsResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationConnectConfigurationDetailsResponse > getOrganizationConnectConfigWithHttpInfo(java.util.UUID organizationId, java.util.UUID connectId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getOrganizationConnectConfig");
    }
    
    // verify the required parameter 'connectId' is set
    if (connectId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectId' when calling getOrganizationConnectConfig");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/connect/{connectId}"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "connectId" + "\\}", apiClient.escapeString(connectId.toString()));

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
    
    GenericType<OrganizationConnectConfigurationDetailsResponse> localVarReturnType = new GenericType<OrganizationConnectConfigurationDetailsResponse>() {};
    OrganizationConnectConfigurationDetailsResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<OrganizationConnectConfigurationDetailsResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Returns a list of Connect configurations under an organization Required scopes: connect_org_config_read_api
  /// </summary>

 /**
  * GetOrganizationConnectConfigsOptions Class.
  *
  **/
  public class GetOrganizationConnectConfigsOptions
  {
  private String sortBy = null;
  private Integer siteId = null;
  private java.util.UUID accountId = null;
  private Boolean allowEnvelopePublish = null;
  private String q = null;
  
 /**
  * setSortBy method.
  */
  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }

 /**
  * getSortBy method.
  *
  * @return String
  */
  public String getSortBy() {
    return this.sortBy;
  }
  
 /**
  * setSiteId method.
  */
  public void setSiteId(Integer siteId) {
    this.siteId = siteId;
  }

 /**
  * getSiteId method.
  *
  * @return Integer
  */
  public Integer getSiteId() {
    return this.siteId;
  }
  
 /**
  * setAccountId method.
  */
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
  
 /**
  * setAllowEnvelopePublish method.
  */
  public void setAllowEnvelopePublish(Boolean allowEnvelopePublish) {
    this.allowEnvelopePublish = allowEnvelopePublish;
  }

 /**
  * getAllowEnvelopePublish method.
  *
  * @return Boolean
  */
  public Boolean getAllowEnvelopePublish() {
    return this.allowEnvelopePublish;
  }
  
 /**
  * setQ method.
  */
  public void setQ(String q) {
    this.q = q;
  }

 /**
  * getQ method.
  *
  * @return String
  */
  public String getQ() {
    return this.q;
  }
  }

   /**
   * Returns a list of Connect configurations under an organization.
   * Required scopes: connect_org_config_read_api
   * @param organizationId The organization ID Guid (required)
   * @return OrganizationConnectConfigsResponse
   */ 
  public OrganizationConnectConfigsResponse getOrganizationConnectConfigs(java.util.UUID organizationId) throws ApiException {
    return getOrganizationConnectConfigs(organizationId, null);
  }

  /**
   * Returns a list of Connect configurations under an organization.
   * Required scopes: connect_org_config_read_api
   * @param organizationId The organization ID Guid (required)
   * @param options for modifying the method behavior.
   * @return OrganizationConnectConfigsResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationConnectConfigsResponse getOrganizationConnectConfigs(java.util.UUID organizationId, OrgConnectApi.GetOrganizationConnectConfigsOptions options) throws ApiException {
    ApiResponse<OrganizationConnectConfigsResponse> localVarResponse = getOrganizationConnectConfigsWithHttpInfo(organizationId, options);
    return localVarResponse.getData();
  }

  /**
   * Returns a list of Connect configurations under an organization
   * Required scopes: connect_org_config_read_api
   * @param organizationId The organization ID Guid (required)
   * @param options for modifying the method behavior.
   * @return OrganizationConnectConfigsResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationConnectConfigsResponse > getOrganizationConnectConfigsWithHttpInfo(java.util.UUID organizationId, OrgConnectApi.GetOrganizationConnectConfigsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getOrganizationConnectConfigs");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/connect"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("sortBy", options.sortBy));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("siteId", options.siteId));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("accountId", options.accountId));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("allowEnvelopePublish", options.allowEnvelopePublish));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("q", options.q));
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
    
    GenericType<OrganizationConnectConfigsResponse> localVarReturnType = new GenericType<OrganizationConnectConfigsResponse>() {};
    OrganizationConnectConfigsResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<OrganizationConnectConfigsResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Returns information about an organization-level Connect OAuth configuration.
   * Required scopes: connect_org_oauth_read_api
   * @param organizationId The organization ID Guid (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object getOrganizationConnectOAuthConfiguration(java.util.UUID organizationId) throws ApiException {
    ApiResponse<Object> localVarResponse = getOrganizationConnectOAuthConfigurationWithHttpInfo(organizationId);
    return localVarResponse.getData();
  }

  /**
   * Returns information about an organization-level Connect OAuth configuration
   * Required scopes: connect_org_oauth_read_api
   * @param organizationId The organization ID Guid (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object > getOrganizationConnectOAuthConfigurationWithHttpInfo(java.util.UUID organizationId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getOrganizationConnectOAuthConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/connect/oauth"
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
    
    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    Object localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Saves information about a Connect HMAC secret.
   * Required scopes: connect_org_hmac_write_api
   * @param organizationId The organization ID Guid (required)
   * @return OrganizationConnectHmacSecretsResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationConnectHmacSecretsResponse postConnectHmacSecret(java.util.UUID organizationId) throws ApiException {
    ApiResponse<OrganizationConnectHmacSecretsResponse> localVarResponse = postConnectHmacSecretWithHttpInfo(organizationId);
    return localVarResponse.getData();
  }

  /**
   * Saves information about a Connect HMAC secret
   * Required scopes: connect_org_hmac_write_api
   * @param organizationId The organization ID Guid (required)
   * @return OrganizationConnectHmacSecretsResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationConnectHmacSecretsResponse > postConnectHmacSecretWithHttpInfo(java.util.UUID organizationId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling postConnectHmacSecret");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/connect/secret"
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
    
    GenericType<OrganizationConnectHmacSecretsResponse> localVarReturnType = new GenericType<OrganizationConnectHmacSecretsResponse>() {};
    OrganizationConnectHmacSecretsResponse localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<OrganizationConnectHmacSecretsResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Saves information about an organization-level Connect OAuth configuration.
   * Required scopes: connect_org_oauth_write_api
   * @param organizationId The organization ID Guid (required)
   * @param _configuration Add an organization-level Connect OAuth configuration (required)
   * @return OrganizationConnectOAuthConfiguration
   * @throws ApiException if fails to make API call
   */
  public OrganizationConnectOAuthConfiguration postOrganizationConnectOAuthConfiguration(java.util.UUID organizationId, OrganizationConnectOAuthConfiguration _configuration) throws ApiException {
    ApiResponse<OrganizationConnectOAuthConfiguration> localVarResponse = postOrganizationConnectOAuthConfigurationWithHttpInfo(organizationId, _configuration);
    return localVarResponse.getData();
  }

  /**
   * Saves information about an organization-level Connect OAuth configuration
   * Required scopes: connect_org_oauth_write_api
   * @param organizationId The organization ID Guid (required)
   * @param _configuration Add an organization-level Connect OAuth configuration (required)
   * @return OrganizationConnectOAuthConfiguration
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationConnectOAuthConfiguration > postOrganizationConnectOAuthConfigurationWithHttpInfo(java.util.UUID organizationId, OrganizationConnectOAuthConfiguration _configuration) throws ApiException {
    Object localVarPostBody = _configuration;
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling postOrganizationConnectOAuthConfiguration");
    }
    
    // verify the required parameter '_configuration' is set
    if (_configuration == null) {
      throw new ApiException(400, "Missing the required parameter '_configuration' when calling postOrganizationConnectOAuthConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/connect/oauth"
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
    
    GenericType<OrganizationConnectOAuthConfiguration> localVarReturnType = new GenericType<OrganizationConnectOAuthConfiguration>() {};
    OrganizationConnectOAuthConfiguration localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<OrganizationConnectOAuthConfiguration>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates information about an organization-level Connect OAuth configuration.
   * Required scopes: connect_org_oauth_write_api
   * @param organizationId The organization ID Guid (required)
   * @param _configuration Update an organization-level Connect OAuth configuration (required)
   * @return OrganizationConnectOAuthConfiguration
   * @throws ApiException if fails to make API call
   */
  public OrganizationConnectOAuthConfiguration putOrganizationConnectOAuthConfiguration(java.util.UUID organizationId, OrganizationConnectOAuthConfiguration _configuration) throws ApiException {
    ApiResponse<OrganizationConnectOAuthConfiguration> localVarResponse = putOrganizationConnectOAuthConfigurationWithHttpInfo(organizationId, _configuration);
    return localVarResponse.getData();
  }

  /**
   * Updates information about an organization-level Connect OAuth configuration
   * Required scopes: connect_org_oauth_write_api
   * @param organizationId The organization ID Guid (required)
   * @param _configuration Update an organization-level Connect OAuth configuration (required)
   * @return OrganizationConnectOAuthConfiguration
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationConnectOAuthConfiguration > putOrganizationConnectOAuthConfigurationWithHttpInfo(java.util.UUID organizationId, OrganizationConnectOAuthConfiguration _configuration) throws ApiException {
    Object localVarPostBody = _configuration;
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling putOrganizationConnectOAuthConfiguration");
    }
    
    // verify the required parameter '_configuration' is set
    if (_configuration == null) {
      throw new ApiException(400, "Missing the required parameter '_configuration' when calling putOrganizationConnectOAuthConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/connect/oauth"
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
    
    GenericType<OrganizationConnectOAuthConfiguration> localVarReturnType = new GenericType<OrganizationConnectOAuthConfiguration>() {};
    OrganizationConnectOAuthConfiguration localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<OrganizationConnectOAuthConfiguration>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates an organization-level Connect configuration.
   * Required scopes: connect_org_config_write_api
   * @param organizationId The organization ID Guid (required)
   * @param connectId The configuration ID Guid (required)
   * @param connectRequest Add an organization Connect request (required)
   * @return OrganizationConnectConfigurationDetailsResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationConnectConfigurationDetailsResponse updateOrganizationConnectConfig(java.util.UUID organizationId, java.util.UUID connectId, OrganizationConnectConfigurationRequest connectRequest) throws ApiException {
    ApiResponse<OrganizationConnectConfigurationDetailsResponse> localVarResponse = updateOrganizationConnectConfigWithHttpInfo(organizationId, connectId, connectRequest);
    return localVarResponse.getData();
  }

  /**
   * Updates an organization-level Connect configuration
   * Required scopes: connect_org_config_write_api
   * @param organizationId The organization ID Guid (required)
   * @param connectId The configuration ID Guid (required)
   * @param connectRequest Add an organization Connect request (required)
   * @return OrganizationConnectConfigurationDetailsResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OrganizationConnectConfigurationDetailsResponse > updateOrganizationConnectConfigWithHttpInfo(java.util.UUID organizationId, java.util.UUID connectId, OrganizationConnectConfigurationRequest connectRequest) throws ApiException {
    Object localVarPostBody = connectRequest;
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling updateOrganizationConnectConfig");
    }
    
    // verify the required parameter 'connectId' is set
    if (connectId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectId' when calling updateOrganizationConnectConfig");
    }
    
    // verify the required parameter 'connectRequest' is set
    if (connectRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'connectRequest' when calling updateOrganizationConnectConfig");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/connect/{connectId}"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "connectId" + "\\}", apiClient.escapeString(connectId.toString()));

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
    
    GenericType<OrganizationConnectConfigurationDetailsResponse> localVarReturnType = new GenericType<OrganizationConnectConfigurationDetailsResponse>() {};
    OrganizationConnectConfigurationDetailsResponse localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<OrganizationConnectConfigurationDetailsResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
