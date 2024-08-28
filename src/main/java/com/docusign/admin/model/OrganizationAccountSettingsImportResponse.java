package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.OrganizationAccountSettingsImportRequestorResponse;
import com.docusign.admin.model.OrganizationAccountSettingsImportResultResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * OrganizationAccountSettingsImportResponse.
 *
 */

public class OrganizationAccountSettingsImportResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("last_modified")
  private String lastModified = null;

  @JsonProperty("completed")
  private String completed = null;

  @JsonProperty("expires")
  private String expires = null;

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


  /**
   * created.
   *
   * @return OrganizationAccountSettingsImportResponse
   **/
  public OrganizationAccountSettingsImportResponse created(String created) {
    this.created = created;
    return this;
  }

  /**
   * Get created.
   * @return created
   **/
  @Schema(description = "")
  public String getCreated() {
    return created;
  }

  /**
   * setCreated.
   **/
  public void setCreated(String created) {
    this.created = created;
  }


  /**
   * lastModified.
   *
   * @return OrganizationAccountSettingsImportResponse
   **/
  public OrganizationAccountSettingsImportResponse lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified.
   * @return lastModified
   **/
  @Schema(description = "")
  public String getLastModified() {
    return lastModified;
  }

  /**
   * setLastModified.
   **/
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }


  /**
   * completed.
   *
   * @return OrganizationAccountSettingsImportResponse
   **/
  public OrganizationAccountSettingsImportResponse completed(String completed) {
    this.completed = completed;
    return this;
  }

  /**
   * Get completed.
   * @return completed
   **/
  @Schema(description = "")
  public String getCompleted() {
    return completed;
  }

  /**
   * setCompleted.
   **/
  public void setCompleted(String completed) {
    this.completed = completed;
  }


  /**
   * expires.
   *
   * @return OrganizationAccountSettingsImportResponse
   **/
  public OrganizationAccountSettingsImportResponse expires(String expires) {
    this.expires = expires;
    return this;
  }

  /**
   * Get expires.
   * @return expires
   **/
  @Schema(description = "")
  public String getExpires() {
    return expires;
  }

  /**
   * setExpires.
   **/
  public void setExpires(String expires) {
    this.expires = expires;
  }


  /**
   * percentCompleted.
   *
   * @return OrganizationAccountSettingsImportResponse
   **/
  public OrganizationAccountSettingsImportResponse percentCompleted(Integer percentCompleted) {
    this.percentCompleted = percentCompleted;
    return this;
  }

  /**
   * Get percentCompleted.
   * @return percentCompleted
   **/
  @Schema(description = "")
  public Integer getPercentCompleted() {
    return percentCompleted;
  }

  /**
   * setPercentCompleted.
   **/
  public void setPercentCompleted(Integer percentCompleted) {
    this.percentCompleted = percentCompleted;
  }


  /**
   * numberProcessedAccounts.
   *
   * @return OrganizationAccountSettingsImportResponse
   **/
  public OrganizationAccountSettingsImportResponse numberProcessedAccounts(Long numberProcessedAccounts) {
    this.numberProcessedAccounts = numberProcessedAccounts;
    return this;
  }

  /**
   * Get numberProcessedAccounts.
   * @return numberProcessedAccounts
   **/
  @Schema(description = "")
  public Long getNumberProcessedAccounts() {
    return numberProcessedAccounts;
  }

  /**
   * setNumberProcessedAccounts.
   **/
  public void setNumberProcessedAccounts(Long numberProcessedAccounts) {
    this.numberProcessedAccounts = numberProcessedAccounts;
  }


  /**
   * numberUnprocessedAccounts.
   *
   * @return OrganizationAccountSettingsImportResponse
   **/
  public OrganizationAccountSettingsImportResponse numberUnprocessedAccounts(Long numberUnprocessedAccounts) {
    this.numberUnprocessedAccounts = numberUnprocessedAccounts;
    return this;
  }

  /**
   * Get numberUnprocessedAccounts.
   * @return numberUnprocessedAccounts
   **/
  @Schema(description = "")
  public Long getNumberUnprocessedAccounts() {
    return numberUnprocessedAccounts;
  }

  /**
   * setNumberUnprocessedAccounts.
   **/
  public void setNumberUnprocessedAccounts(Long numberUnprocessedAccounts) {
    this.numberUnprocessedAccounts = numberUnprocessedAccounts;
  }


  /**
   * results.
   *
   * @return OrganizationAccountSettingsImportResponse
   **/
  public OrganizationAccountSettingsImportResponse results(java.util.List<OrganizationAccountSettingsImportResultResponse> results) {
    this.results = results;
    return this;
  }
  
  /**
   * addResultsItem.
   *
   * @return OrganizationAccountSettingsImportResponse
   **/
  public OrganizationAccountSettingsImportResponse addResultsItem(OrganizationAccountSettingsImportResultResponse resultsItem) {
    if (this.results == null) {
      this.results = new java.util.ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results.
   * @return results
   **/
  @Schema(description = "")
  public java.util.List<OrganizationAccountSettingsImportResultResponse> getResults() {
    return results;
  }

  /**
   * setResults.
   **/
  public void setResults(java.util.List<OrganizationAccountSettingsImportResultResponse> results) {
    this.results = results;
  }


  /**
   * success.
   *
   * @return OrganizationAccountSettingsImportResponse
   **/
  public OrganizationAccountSettingsImportResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Get success.
   * @return success
   **/
  @Schema(description = "")
  public Boolean isSuccess() {
    return success;
  }

  /**
   * setSuccess.
   **/
  public void setSuccess(Boolean success) {
    this.success = success;
  }


  /**
   * skippedSettingsByAccount.
   *
   * @return OrganizationAccountSettingsImportResponse
   **/
  public OrganizationAccountSettingsImportResponse skippedSettingsByAccount(java.util.Map<String, java.util.List<String>> skippedSettingsByAccount) {
    this.skippedSettingsByAccount = skippedSettingsByAccount;
    return this;
  }

  /**
   * putSkippedSettingsByAccountItem.
   *
   * @return OrganizationAccountSettingsImportResponse
   **/
  public OrganizationAccountSettingsImportResponse putSkippedSettingsByAccountItem(String key, java.util.List<String> skippedSettingsByAccountItem) {
    if (this.skippedSettingsByAccount == null) {
      this.skippedSettingsByAccount = new java.util.HashMap<>();
    }
    this.skippedSettingsByAccount.put(key, skippedSettingsByAccountItem);
    return this;
  }

  /**
   * Get skippedSettingsByAccount.
   * @return skippedSettingsByAccount
   **/
  @Schema(description = "")
  public java.util.Map<String, java.util.List<String>> getSkippedSettingsByAccount() {
    return skippedSettingsByAccount;
  }

  /**
   * setSkippedSettingsByAccount.
   **/
  public void setSkippedSettingsByAccount(java.util.Map<String, java.util.List<String>> skippedSettingsByAccount) {
    this.skippedSettingsByAccount = skippedSettingsByAccount;
  }


  /**
   * id.
   *
   * @return OrganizationAccountSettingsImportResponse
   **/
  public OrganizationAccountSettingsImportResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id.
   * @return id
   **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  /**
   * setId.
   **/
  public void setId(String id) {
    this.id = id;
  }


  /**
   * organizationId.
   *
   * @return OrganizationAccountSettingsImportResponse
   **/
  public OrganizationAccountSettingsImportResponse organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * Get organizationId.
   * @return organizationId
   **/
  @Schema(description = "")
  public String getOrganizationId() {
    return organizationId;
  }

  /**
   * setOrganizationId.
   **/
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  /**
   * status.
   *
   * @return OrganizationAccountSettingsImportResponse
   **/
  public OrganizationAccountSettingsImportResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status.
   * @return status
   **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * type.
   *
   * @return OrganizationAccountSettingsImportResponse
   **/
  public OrganizationAccountSettingsImportResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   * @return type
   **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(String type) {
    this.type = type;
  }


  /**
   * requestor.
   *
   * @return OrganizationAccountSettingsImportResponse
   **/
  public OrganizationAccountSettingsImportResponse requestor(OrganizationAccountSettingsImportRequestorResponse requestor) {
    this.requestor = requestor;
    return this;
  }

  /**
   * Get requestor.
   * @return requestor
   **/
  @Schema(description = "")
  public OrganizationAccountSettingsImportRequestorResponse getRequestor() {
    return requestor;
  }

  /**
   * setRequestor.
   **/
  public void setRequestor(OrganizationAccountSettingsImportRequestorResponse requestor) {
    this.requestor = requestor;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(created, lastModified, completed, expires, percentCompleted, numberProcessedAccounts, numberUnprocessedAccounts, results, success, skippedSettingsByAccount, id, organizationId, status, type, requestor);
  }


  /**
   * Converts the given object to string.
   */
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

