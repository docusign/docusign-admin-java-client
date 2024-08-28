
package com.docusign.admin.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.admin.client.ApiException;
import com.docusign.admin.client.ApiClient;
import com.docusign.admin.client.Configuration;
import com.docusign.admin.model.*;
import com.docusign.admin.client.Pair;
import com.docusign.admin.client.ApiResponse;




/**
 * IdentityProvidersApi class.
 *
 **/
public class IdentityProvidersApi {
  private ApiClient apiClient;

 /**
  * IdentityProvidersApi.
  *
  **/
  public IdentityProvidersApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * IdentityProvidersApi.
  *
  **/
  public IdentityProvidersApi(ApiClient apiClient) {
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
   * Returns the list of identity providers for the organization..
   * Required scopes: identity_provider_read
   * @param organizationId The organization ID Guid (required)
   * @return IdentityProvidersResponse
   * @throws ApiException if fails to make API call
   */
  public IdentityProvidersResponse getIdentityProviders(java.util.UUID organizationId) throws ApiException {
    ApiResponse<IdentityProvidersResponse> localVarResponse = getIdentityProvidersWithHttpInfo(organizationId);
    return localVarResponse.getData();
  }

  /**
   * Returns the list of identity providers for the organization.
   * Required scopes: identity_provider_read
   * @param organizationId The organization ID Guid (required)
   * @return IdentityProvidersResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<IdentityProvidersResponse > getIdentityProvidersWithHttpInfo(java.util.UUID organizationId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getIdentityProviders");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/identity_providers"
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
    
    GenericType<IdentityProvidersResponse> localVarReturnType = new GenericType<IdentityProvidersResponse>() {};
    IdentityProvidersResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<IdentityProvidersResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
