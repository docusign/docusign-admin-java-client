package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.OrganizationAccountSettingsImportRequestorResponse;
import com.docusign.admin.model.OrganizationAccountSettingsImportResultResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * OrganizationAccountSettingsImportResponse
 */

public class OrganizationAccountSettingsImportResponse {
  @JsonProperty("created")
  private DateTime created = null;

  @JsonProperty("last_modified")
  private DateTime lastModified = null;

  @JsonProperty("completed")
  private DateTime completed = null;

  @JsonProperty("expires")
  private DateTime expires = null;

  @JsonProperty("percent_completed")
  private Integer percentCompleted = null;

  @JsonProperty("number_processed_accounts")
  private Long numberProcessedAccounts = null;

  @JsonProperty("number_unprocessed_accounts")
  private Long numberUnprocessedAccounts = null;

  @JsonProperty("results")
  private java.util.List<OrganizationAccountSettingsImportResultResponse> results = null;

  @JsonProperty("success")
  private Boolean success = null;

  @JsonProperty("skipped_settings_by_account")
  private java.util.Map<String, java.util.List<String>> skippedSettingsByAccount = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("organization_id")
  private String organizationId = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("requestor")
  private OrganizationAccountSettingsImportRequestorResponse requestor = null;

  public OrganizationAccountSettingsImportResponse created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public OrganizationAccountSettingsImportResponse lastModified(DateTime lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Get lastModified
   * @return lastModified
  **/
  @ApiModelProperty(value = "")
  public DateTime getLastModified() {
    return lastModified;
  }

  public void setLastModified(DateTime lastModified) {
    this.lastModified = lastModified;
  }

  public OrganizationAccountSettingsImportResponse completed(DateTime completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Get completed
   * @return completed
  **/
  @ApiModelProperty(value = "")
  public DateTime getCompleted() {
    return completed;
  }

  public void setCompleted(DateTime completed) {
    this.completed = completed;
  }

  public OrganizationAccountSettingsImportResponse expires(DateTime expires) {
    this.expires = expires;
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/
  @ApiModelProperty(value = "")
  public DateTime getExpires() {
    return expires;
  }

  public void setExpires(DateTime expires) {
    this.expires = expires;
  }

  public OrganizationAccountSettingsImportResponse percentCompleted(Integer percentCompleted) {
    this.percentCompleted = percentCompleted;
    return this;
  }

   /**
   * Get percentCompleted
   * @return percentCompleted
  **/
  @ApiModelProperty(value = "")
  public Integer getPercentCompleted() {
    return percentCompleted;
  }

  public void setPercentCompleted(Integer percentCompleted) {
    this.percentCompleted = percentCompleted;
  }

  public OrganizationAccountSettingsImportResponse numberProcessedAccounts(Long numberProcessedAccounts) {
    this.numberProcessedAccounts = numberProcessedAccounts;
    return this;
  }

   /**
   * Get numberProcessedAccounts
   * @return numberProcessedAccounts
  **/
  @ApiModelProperty(value = "")
  public Long getNumberProcessedAccounts() {
    return numberProcessedAccounts;
  }

  public void setNumberProcessedAccounts(Long numberProcessedAccounts) {
    this.numberProcessedAccounts = numberProcessedAccounts;
  }

  public OrganizationAccountSettingsImportResponse numberUnprocessedAccounts(Long numberUnprocessedAccounts) {
    this.numberUnprocessedAccounts = numberUnprocessedAccounts;
    return this;
  }

   /**
   * Get numberUnprocessedAccounts
   * @return numberUnprocessedAccounts
  **/
  @ApiModelProperty(value = "")
  public Long getNumberUnprocessedAccounts() {
    return numberUnprocessedAccounts;
  }

  public void setNumberUnprocessedAccounts(Long numberUnprocessedAccounts) {
    this.numberUnprocessedAccounts = numberUnprocessedAccounts;
  }

  public OrganizationAccountSettingsImportResponse results(java.util.List<OrganizationAccountSettingsImportResultResponse> results) {
    this.results = results;
    return this;
  }

  public OrganizationAccountSettingsImportResponse addResultsItem(OrganizationAccountSettingsImportResultResponse resultsItem) {
    if (this.results == null) {
      this.results = new java.util.ArrayList<OrganizationAccountSettingsImportResultResponse>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")
  public java.util.List<OrganizationAccountSettingsImportResultResponse> getResults() {
    return results;
  }

  public void setResults(java.util.List<OrganizationAccountSettingsImportResultResponse> results) {
    this.results = results;
  }

  public OrganizationAccountSettingsImportResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(value = "")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public OrganizationAccountSettingsImportResponse skippedSettingsByAccount(java.util.Map<String, java.util.List<String>> skippedSettingsByAccount) {
    this.skippedSettingsByAccount = skippedSettingsByAccount;
    return this;
  }

  public OrganizationAccountSettingsImportResponse putSkippedSettingsByAccountItem(String key, java.util.List<String> skippedSettingsByAccountItem) {
    if (this.skippedSettingsByAccount == null) {
      this.skippedSettingsByAccount = new java.util.HashMap<String, java.util.List<String>>();
    }
    this.skippedSettingsByAccount.put(key, skippedSettingsByAccountItem);
    return this;
  }

   /**
   * Get skippedSettingsByAccount
   * @return skippedSettingsByAccount
  **/
  @ApiModelProperty(value = "")
  public java.util.Map<String, java.util.List<String>> getSkippedSettingsByAccount() {
    return skippedSettingsByAccount;
  }

  public void setSkippedSettingsByAccount(java.util.Map<String, java.util.List<String>> skippedSettingsByAccount) {
    this.skippedSettingsByAccount = skippedSettingsByAccount;
  }

  public OrganizationAccountSettingsImportResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrganizationAccountSettingsImportResponse organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @ApiModelProperty(value = "")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public OrganizationAccountSettingsImportResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OrganizationAccountSettingsImportResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrganizationAccountSettingsImportResponse requestor(OrganizationAccountSettingsImportRequestorResponse requestor) {
    this.requestor = requestor;
    return this;
  }

   /**
   * Get requestor
   * @return requestor
  **/
  @ApiModelProperty(value = "")
  public OrganizationAccountSettingsImportRequestorResponse getRequestor() {
    return requestor;
  }

  public void setRequestor(OrganizationAccountSettingsImportRequestorResponse requestor) {
    this.requestor = requestor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationAccountSettingsImportResponse organizationAccountSettingsImportResponse = (OrganizationAccountSettingsImportResponse) o;
    return Objects.equals(this.created, organizationAccountSettingsImportResponse.created) &&
        Objects.equals(this.lastModified, organizationAccountSettingsImportResponse.lastModified) &&
        Objects.equals(this.completed, organizationAccountSettingsImportResponse.completed) &&
        Objects.equals(this.expires, organizationAccountSettingsImportResponse.expires) &&
        Objects.equals(this.percentCompleted, organizationAccountSettingsImportResponse.percentCompleted) &&
        Objects.equals(this.numberProcessedAccounts, organizationAccountSettingsImportResponse.numberProcessedAccounts) &&
        Objects.equals(this.numberUnprocessedAccounts, organizationAccountSettingsImportResponse.numberUnprocessedAccounts) &&
        Objects.equals(this.results, organizationAccountSettingsImportResponse.results) &&
        Objects.equals(this.success, organizationAccountSettingsImportResponse.success) &&
        Objects.equals(this.skippedSettingsByAccount, organizationAccountSettingsImportResponse.skippedSettingsByAccount) &&
        Objects.equals(this.id, organizationAccountSettingsImportResponse.id) &&
        Objects.equals(this.organizationId, organizationAccountSettingsImportResponse.organizationId) &&
        Objects.equals(this.status, organizationAccountSettingsImportResponse.status) &&
        Objects.equals(this.type, organizationAccountSettingsImportResponse.type) &&
        Objects.equals(this.requestor, organizationAccountSettingsImportResponse.requestor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, lastModified, completed, expires, percentCompleted, numberProcessedAccounts, numberUnprocessedAccounts, results, success, skippedSettingsByAccount, id, organizationId, status, type, requestor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationAccountSettingsImportResponse {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    percentCompleted: ").append(toIndentedString(percentCompleted)).append("\n");
    sb.append("    numberProcessedAccounts: ").append(toIndentedString(numberProcessedAccounts)).append("\n");
    sb.append("    numberUnprocessedAccounts: ").append(toIndentedString(numberUnprocessedAccounts)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    skippedSettingsByAccount: ").append(toIndentedString(skippedSettingsByAccount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    requestor: ").append(toIndentedString(requestor)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

