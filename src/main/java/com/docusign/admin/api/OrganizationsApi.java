
package com.docusign.admin.api;

import jakarta.ws.rs.core.GenericType;

import com.docusign.admin.client.ApiException;
import com.docusign.admin.client.ApiClient;
import com.docusign.admin.client.Configuration;
import com.docusign.admin.model.*;
import com.docusign.admin.client.Pair;
import com.docusign.admin.client.ApiResponse;




/**
 * OrganizationsApi class.
 *
 **/
public class OrganizationsApi {
  private ApiClient apiClient;

 /**
  * OrganizationsApi.
  *
  **/
  public OrganizationsApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * OrganizationsApi.
  *
  **/
  public OrganizationsApi(ApiClient apiClient) {
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
   * Redacts membership and user data for users in an organization..
   * Required scopes: user_data_redact
   * @param organizationId The organization ID Guid (required)
   * @param requestModel The request body describing the users and memberships to be redacted (required)
   * @return IndividualUserDataRedactionResponse
   * @throws ApiException if fails to make API call
   */
  public IndividualUserDataRedactionResponse redactIndividualUserData(java.util.UUID organizationId, IndividualUserDataRedactionRequest requestModel) throws ApiException {
    ApiResponse<IndividualUserDataRedactionResponse> localVarResponse = redactIndividualUserDataWithHttpInfo(organizationId, requestModel);
    return localVarResponse.getData();
  }

  /**
   * Redacts membership and user data for users in an organization.
   * Required scopes: user_data_redact
   * @param organizationId The organization ID Guid (required)
   * @param requestModel The request body describing the users and memberships to be redacted (required)
   * @return IndividualUserDataRedactionResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<IndividualUserDataRedactionResponse > redactIndividualUserDataWithHttpInfo(java.util.UUID organizationId, IndividualUserDataRedactionRequest requestModel) throws ApiException {
    Object localVarPostBody = requestModel;
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling redactIndividualUserData");
    }
    
    // verify the required parameter 'requestModel' is set
    if (requestModel == null) {
      throw new ApiException(400, "Missing the required parameter 'requestModel' when calling redactIndividualUserData");
    }
    
    // create path and map variables
    String localVarPath = "/v2/data_redaction/organizations/{organizationId}/user"
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
    
    GenericType<IndividualUserDataRedactionResponse> localVarReturnType = new GenericType<IndividualUserDataRedactionResponse>() {};
    IndividualUserDataRedactionResponse localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<IndividualUserDataRedactionResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
