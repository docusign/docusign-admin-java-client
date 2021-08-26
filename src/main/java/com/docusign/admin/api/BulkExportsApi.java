
package com.docusign.admin.api;

import javax.ws.rs.core.GenericType;

import com.docusign.admin.client.ApiException;
import com.docusign.admin.client.ApiClient;
import com.docusign.admin.client.Configuration;
import com.docusign.admin.model.*;
import com.docusign.admin.client.Pair;



public class BulkExportsApi {
  private ApiClient apiClient;

  public BulkExportsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BulkExportsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


  /**
   * Creates a  new Account Setting Export request.
   * Required scopes: account_read
   * @param organizationId The organization ID Guid (required)
   * @param request Request body containing details about the accounts be compared (required)
   * @return OrganizationExportResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationExportResponse createAccountSettingsExport(java.util.UUID organizationId, OrganizationAccountsRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling createAccountSettingsExport");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling createAccountSettingsExport");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/exports/account_settings"
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

    GenericType<OrganizationExportResponse> localVarReturnType = new GenericType<OrganizationExportResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Creates a new User List Export request.
   * Required scopes: user_read
   * @param organizationId The organization ID Guid (required)
   * @param request Request body containing details about what is to be exported (required)
   * @return OrganizationExportResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationExportResponse createUserListExport(java.util.UUID organizationId, OrganizationExportRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling createUserListExport");
    }
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling createUserListExport");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/exports/user_list"
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

    GenericType<OrganizationExportResponse> localVarReturnType = new GenericType<OrganizationExportResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Deletes a single Account Settings Export request
   * Required scopes: account_read
   * @param organizationId The organization ID Guid (required)
   * @param exportId The export ID Guid for the request (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object deleteAccountSettingsExport(java.util.UUID organizationId, java.util.UUID exportId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling deleteAccountSettingsExport");
    }
    
    // verify the required parameter 'exportId' is set
    if (exportId == null) {
      throw new ApiException(400, "Missing the required parameter 'exportId' when calling deleteAccountSettingsExport");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/exports/account_settings/{exportId}"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "exportId" + "\\}", apiClient.escapeString(exportId.toString()));

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
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Deletes a single User List Export request
   * Required scopes: user_read
   * @param organizationId The organization ID Guid (required)
   * @param exportId The export ID Guid for the request (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object deleteUserListExport(java.util.UUID organizationId, java.util.UUID exportId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling deleteUserListExport");
    }
    
    // verify the required parameter 'exportId' is set
    if (exportId == null) {
      throw new ApiException(400, "Missing the required parameter 'exportId' when calling deleteUserListExport");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/exports/user_list/{exportId}"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "exportId" + "\\}", apiClient.escapeString(exportId.toString()));

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
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns the details/metadata for a single Account Setting Export request
   * Required scopes: account_read
   * @param organizationId The organization ID Guid (required)
   * @param exportId The export ID Guid for the request (required)
   * @return OrganizationExportResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationExportResponse getAccountSettingsExport(java.util.UUID organizationId, java.util.UUID exportId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getAccountSettingsExport");
    }
    
    // verify the required parameter 'exportId' is set
    if (exportId == null) {
      throw new ApiException(400, "Missing the required parameter 'exportId' when calling getAccountSettingsExport");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/exports/account_settings/{exportId}"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "exportId" + "\\}", apiClient.escapeString(exportId.toString()));

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

    GenericType<OrganizationExportResponse> localVarReturnType = new GenericType<OrganizationExportResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns the details/metadata for Account Setting Export requests
   * Required scopes: account_read
   * @param organizationId The organization ID Guid (required)
   * @return OrganizationExportsResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationExportsResponse getAccountSettingsExports(java.util.UUID organizationId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getAccountSettingsExports");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/exports/account_settings"
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

    GenericType<OrganizationExportsResponse> localVarReturnType = new GenericType<OrganizationExportsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns the details/metadata for a single User List Export request
   * Required scopes: user_read
   * @param organizationId The organization ID Guid (required)
   * @param exportId The export ID Guid for the request (required)
   * @return OrganizationExportResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationExportResponse getUserListExport(java.util.UUID organizationId, java.util.UUID exportId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getUserListExport");
    }
    
    // verify the required parameter 'exportId' is set
    if (exportId == null) {
      throw new ApiException(400, "Missing the required parameter 'exportId' when calling getUserListExport");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/exports/user_list/{exportId}"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "exportId" + "\\}", apiClient.escapeString(exportId.toString()));

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

    GenericType<OrganizationExportResponse> localVarReturnType = new GenericType<OrganizationExportResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns a list of existing User List Exports (requests and completed exports) and their details/metadata
   * Required scopes: user_read
   * @param organizationId The organization ID Guid (required)
   * @return OrganizationExportsResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationExportsResponse getUserListExports(java.util.UUID organizationId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getUserListExports");
    }
    
    // create path and map variables
    String localVarPath = "/v2/organizations/{organizationId}/exports/user_list"
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

    GenericType<OrganizationExportsResponse> localVarReturnType = new GenericType<OrganizationExportsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
