package com.docusign.admin.api;

import com.docusign.admin.client.ApiClient;
import com.docusign.admin.client.ApiException;
import com.docusign.admin.client.Configuration;
import com.docusign.admin.client.Pair;
import com.docusign.admin.model.*;
import javax.ws.rs.core.GenericType;

/** ReservedDomainsApi class. */
public class ReservedDomainsApi {
  private ApiClient apiClient;

  /** ReservedDomainsApi. */
  public ReservedDomainsApi() {
    this(Configuration.getDefaultApiClient());
  }

  /** ReservedDomainsApi. */
  public ReservedDomainsApi(ApiClient apiClient) {
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
   * Returns the list of reserved domains for the organization.. Required scopes: domain_read
   *
   * @param organizationId The organization ID Guid (required)
   * @return DomainsResponse
   * @throws ApiException if fails to make API call
   */
  public DomainsResponse getReservedDomains(java.util.UUID organizationId) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'organizationId' when calling getReservedDomains");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/reserved_domains"
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

    GenericType<DomainsResponse> localVarReturnType = new GenericType<DomainsResponse>() {};
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
}
