package com.docusign.admin.api;

import com.docusign.admin.client.ApiClient;
import com.docusign.admin.client.ApiException;
import com.docusign.admin.client.Configuration;
import com.docusign.admin.client.Pair;
import com.docusign.admin.model.*;
import javax.ws.rs.core.GenericType;

/** BulkImportsApi class. */
public class BulkImportsApi {
  private ApiClient apiClient;

  /** BulkImportsApi. */
  public BulkImportsApi() {
    this(Configuration.getDefaultApiClient());
  }

  /** BulkImportsApi. */
  public BulkImportsApi(ApiClient apiClient) {
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
   * Creates a new account settings import request.. Required scopes: account_write
   *
   * @param organizationId The organization ID Guid (required)
   * @param fileCsv CSV file. (required)
   * @return OrganizationAccountSettingsImportResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationAccountSettingsImportResponse addBulkAccountSettingsImport(
      java.util.UUID organizationId, byte[] fileCsv) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationId' when calling addBulkAccountSettingsImport");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/imports/account_settings"
            .replaceAll(
                "\\{" + "organizationId" + "\\}",
                apiClient.escapeString(organizationId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (fileCsv != null) {
      localVarFormParams.put("file.csv", fileCsv);
    }

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"multipart/form-data"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<OrganizationAccountSettingsImportResponse> localVarReturnType =
        new GenericType<OrganizationAccountSettingsImportResponse>() {};
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
   * Import request for adding users to accounts within the organization.. Required scopes:
   * user_write
   *
   * @param organizationId The organization ID Guid (required)
   * @param fileCsv CSV file. (required)
   * @return OrganizationImportResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationImportResponse createBulkImportAddUsersRequest(
      java.util.UUID organizationId, byte[] fileCsv) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationId' when calling createBulkImportAddUsersRequest");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/imports/bulk_users/add"
            .replaceAll(
                "\\{" + "organizationId" + "\\}",
                apiClient.escapeString(organizationId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (fileCsv != null) {
      localVarFormParams.put("file.csv", fileCsv);
    }

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"multipart/form-data"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<OrganizationImportResponse> localVarReturnType =
        new GenericType<OrganizationImportResponse>() {};
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
   * Closes the Bulk User Import request. Required scopes: user_write
   *
   * @param organizationId The organization ID Guid (required)
   * @return OrganizationImportResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationImportResponse createBulkImportCloseUsersRequest(java.util.UUID organizationId)
      throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationId' when calling createBulkImportCloseUsersRequest");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/imports/bulk_users/close"
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

    GenericType<OrganizationImportResponse> localVarReturnType =
        new GenericType<OrganizationImportResponse>() {};
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
   * Closes memberships which are not in an account which is part of the organization, but which do
   * have email addresses which are @ a verified reserved web domain which belongs to the
   * organization. Required scopes: user_write
   *
   * @param organizationId The organization ID Guid (required)
   * @return OrganizationImportResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationImportResponse createBulkImportExternalCloseUsersRequest(
      java.util.UUID organizationId) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationId' when calling createBulkImportExternalCloseUsersRequest");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/imports/bulk_users/close_external"
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

    GenericType<OrganizationImportResponse> localVarReturnType =
        new GenericType<OrganizationImportResponse>() {};
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
   * Import request for adding user to a single account within the organization. Allows upload of
   * user information without requiring an AccountId column. Required scopes: user_write
   *
   * @param organizationId The organization ID Guid (required)
   * @param accountId The account ID Guid (required)
   * @param fileCsv CSV file. (required)
   * @return OrganizationImportResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationImportResponse createBulkImportSingleAccountAddUsersRequest(
      java.util.UUID organizationId, java.util.UUID accountId, byte[] fileCsv) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationId' when calling createBulkImportSingleAccountAddUsersRequest");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling createBulkImportSingleAccountAddUsersRequest");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/accounts/{accountId}/imports/bulk_users/add"
            .replaceAll(
                "\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (fileCsv != null) {
      localVarFormParams.put("file.csv", fileCsv);
    }

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"multipart/form-data"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<OrganizationImportResponse> localVarReturnType =
        new GenericType<OrganizationImportResponse>() {};
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
   * Import request for updating users for a single account within the organization. Allows upload
   * of user information without requiring an AccountId column. Required scopes: user_write
   *
   * @param organizationId The organization ID Guid (required)
   * @param accountId The account ID Guid (required)
   * @param fileCsv CSV file. (required)
   * @return OrganizationImportResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationImportResponse createBulkImportSingleAccountUpdateUsersRequest(
      java.util.UUID organizationId, java.util.UUID accountId, byte[] fileCsv) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationId' when calling createBulkImportSingleAccountUpdateUsersRequest");
    }

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'accountId' when calling createBulkImportSingleAccountUpdateUsersRequest");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/accounts/{accountId}/imports/bulk_users/update"
            .replaceAll(
                "\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (fileCsv != null) {
      localVarFormParams.put("file.csv", fileCsv);
    }

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"multipart/form-data"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<OrganizationImportResponse> localVarReturnType =
        new GenericType<OrganizationImportResponse>() {};
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
   * Import request for updating users to accounts within the organization.. Required scopes:
   * user_write
   *
   * @param organizationId The organization ID Guid (required)
   * @param fileCsv CSV file. (required)
   * @return OrganizationImportResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationImportResponse createBulkImportUpdateUsersRequest(
      java.util.UUID organizationId, byte[] fileCsv) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationId' when calling createBulkImportUpdateUsersRequest");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/imports/bulk_users/update"
            .replaceAll(
                "\\{" + "organizationId" + "\\}",
                apiClient.escapeString(organizationId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (fileCsv != null) {
      localVarFormParams.put("file.csv", fileCsv);
    }

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"multipart/form-data"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<OrganizationImportResponse> localVarReturnType =
        new GenericType<OrganizationImportResponse>() {};
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
   * Deletes a Bulk Account Settings Import request. Required scopes: account_write
   *
   * @param organizationId The organization ID Guid (required)
   * @param importId The import ID Guid for the request (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object deleteBulkAccountSettingsImport(
      java.util.UUID organizationId, java.util.UUID importId) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationId' when calling deleteBulkAccountSettingsImport");
    }

    // verify the required parameter 'importId' is set
    if (importId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'importId' when calling deleteBulkAccountSettingsImport");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/imports/account_settings/{importId}"
            .replaceAll(
                "\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "importId" + "\\}", apiClient.escapeString(importId.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
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
   * Deletes a User Import request. Required scopes: user_write
   *
   * @param organizationId The organization ID Guid (required)
   * @param importId The import ID Guid for the request (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object deleteBulkUserImport(java.util.UUID organizationId, java.util.UUID importId)
      throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'organizationId' when calling deleteBulkUserImport");
    }

    // verify the required parameter 'importId' is set
    if (importId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'importId' when calling deleteBulkUserImport");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/imports/bulk_users/{importId}"
            .replaceAll(
                "\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "importId" + "\\}", apiClient.escapeString(importId.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
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
   * Returns the details/metadata for a Bulk Account Settings Import request. Required scopes:
   * account_read
   *
   * @param organizationId The organization ID Guid (required)
   * @param importId The import ID Guid for the request (required)
   * @return OrganizationAccountSettingsImportResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationAccountSettingsImportResponse getBulkAccountSettingsImport(
      java.util.UUID organizationId, java.util.UUID importId) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationId' when calling getBulkAccountSettingsImport");
    }

    // verify the required parameter 'importId' is set
    if (importId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'importId' when calling getBulkAccountSettingsImport");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/imports/account_settings/{importId}"
            .replaceAll(
                "\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "importId" + "\\}", apiClient.escapeString(importId.toString()));

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

    GenericType<OrganizationAccountSettingsImportResponse> localVarReturnType =
        new GenericType<OrganizationAccountSettingsImportResponse>() {};
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
   * Returns the details/metadata for Bulk Account Settings Import requests in the organization.
   * Required scopes: account_read
   *
   * @param organizationId The organization ID Guid (required)
   * @return java.util.List&lt;OrganizationAccountSettingsImportResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public java.util.List<OrganizationAccountSettingsImportResponse> getBulkAccountSettingsImports(
      java.util.UUID organizationId) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationId' when calling getBulkAccountSettingsImports");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/imports/account_settings"
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

    GenericType<java.util.List<OrganizationAccountSettingsImportResponse>> localVarReturnType =
        new GenericType<java.util.List<OrganizationAccountSettingsImportResponse>>() {};
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
   * Returns a text/csv file with user details for a User Import request. Required scopes: user_read
   *
   * @param organizationId The organization ID Guid (required)
   * @param importId The import ID Guid for the request (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object getBulkUserImportCSV(java.util.UUID organizationId, java.util.UUID importId)
      throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'organizationId' when calling getBulkUserImportCSV");
    }

    // verify the required parameter 'importId' is set
    if (importId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'importId' when calling getBulkUserImportCSV");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/imports/bulk_users/{importId}/results_csv"
            .replaceAll(
                "\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "importId" + "\\}", apiClient.escapeString(importId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    final String[] localVarAccepts = {"text/csv"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {"application/json"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"docusignAccessCode"};

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
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
   * Returns the details/metadata for a User Import request. Required scopes: user_read
   *
   * @param organizationId The organization ID Guid (required)
   * @param importId The import ID Guid for the request (required)
   * @return OrganizationImportResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationImportResponse getBulkUserImportRequest(
      java.util.UUID organizationId, java.util.UUID importId) throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationId' when calling getBulkUserImportRequest");
    }

    // verify the required parameter 'importId' is set
    if (importId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'importId' when calling getBulkUserImportRequest");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/imports/bulk_users/{importId}"
            .replaceAll(
                "\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "importId" + "\\}", apiClient.escapeString(importId.toString()));

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

    GenericType<OrganizationImportResponse> localVarReturnType =
        new GenericType<OrganizationImportResponse>() {};
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
   * Returns the details/metadata for Bulk User Import requests in the organization. Required
   * scopes: user_read
   *
   * @param organizationId The organization ID Guid (required)
   * @return OrganizationImportsResponse
   * @throws ApiException if fails to make API call
   */
  public OrganizationImportsResponse getBulkUserImportRequests(java.util.UUID organizationId)
      throws ApiException {
    Object localVarPostBody = "{}";

    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(
          400,
          "Missing the required parameter 'organizationId' when calling getBulkUserImportRequests");
    }

    // create path and map variables
    String localVarPath =
        "/v2/organizations/{organizationId}/imports/bulk_users"
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

    GenericType<OrganizationImportsResponse> localVarReturnType =
        new GenericType<OrganizationImportsResponse>() {};
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
