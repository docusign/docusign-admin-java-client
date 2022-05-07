package com.docusign.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import java.util.Objects;

/** OrganizationAccountSettingsImportResponse. */
public class OrganizationAccountSettingsImportResponse {
  @JsonProperty("created")
  private LocalDateTime created = null;

  @JsonProperty("last_modified")
  private LocalDateTime lastModified = null;

  @JsonProperty("completed")
  private LocalDateTime completed = null;

  @JsonProperty("expires")
  private LocalDateTime expires = null;

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
   */
  public OrganizationAccountSettingsImportResponse created(LocalDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created.
   *
   * @return created
   */
  @ApiModelProperty(value = "")
  public LocalDateTime getCreated() {
    return created;
  }

  /** setCreated. */
  public void setCreated(LocalDateTime created) {
    this.created = created;
  }

  /**
   * lastModified.
   *
   * @return OrganizationAccountSettingsImportResponse
   */
  public OrganizationAccountSettingsImportResponse lastModified(LocalDateTime lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified.
   *
   * @return lastModified
   */
  @ApiModelProperty(value = "")
  public LocalDateTime getLastModified() {
    return lastModified;
  }

  /** setLastModified. */
  public void setLastModified(LocalDateTime lastModified) {
    this.lastModified = lastModified;
  }

  /**
   * completed.
   *
   * @return OrganizationAccountSettingsImportResponse
   */
  public OrganizationAccountSettingsImportResponse completed(LocalDateTime completed) {
    this.completed = completed;
    return this;
  }

  /**
   * Get completed.
   *
   * @return completed
   */
  @ApiModelProperty(value = "")
  public LocalDateTime getCompleted() {
    return completed;
  }

  /** setCompleted. */
  public void setCompleted(LocalDateTime completed) {
    this.completed = completed;
  }

  /**
   * expires.
   *
   * @return OrganizationAccountSettingsImportResponse
   */
  public OrganizationAccountSettingsImportResponse expires(LocalDateTime expires) {
    this.expires = expires;
    return this;
  }

  /**
   * Get expires.
   *
   * @return expires
   */
  @ApiModelProperty(value = "")
  public LocalDateTime getExpires() {
    return expires;
  }

  /** setExpires. */
  public void setExpires(LocalDateTime expires) {
    this.expires = expires;
  }

  /**
   * percentCompleted.
   *
   * @return OrganizationAccountSettingsImportResponse
   */
  public OrganizationAccountSettingsImportResponse percentCompleted(Integer percentCompleted) {
    this.percentCompleted = percentCompleted;
    return this;
  }

  /**
   * Get percentCompleted.
   *
   * @return percentCompleted
   */
  @ApiModelProperty(value = "")
  public Integer getPercentCompleted() {
    return percentCompleted;
  }

  /** setPercentCompleted. */
  public void setPercentCompleted(Integer percentCompleted) {
    this.percentCompleted = percentCompleted;
  }

  /**
   * numberProcessedAccounts.
   *
   * @return OrganizationAccountSettingsImportResponse
   */
  public OrganizationAccountSettingsImportResponse numberProcessedAccounts(
      Long numberProcessedAccounts) {
    this.numberProcessedAccounts = numberProcessedAccounts;
    return this;
  }

  /**
   * Get numberProcessedAccounts.
   *
   * @return numberProcessedAccounts
   */
  @ApiModelProperty(value = "")
  public Long getNumberProcessedAccounts() {
    return numberProcessedAccounts;
  }

  /** setNumberProcessedAccounts. */
  public void setNumberProcessedAccounts(Long numberProcessedAccounts) {
    this.numberProcessedAccounts = numberProcessedAccounts;
  }

  /**
   * numberUnprocessedAccounts.
   *
   * @return OrganizationAccountSettingsImportResponse
   */
  public OrganizationAccountSettingsImportResponse numberUnprocessedAccounts(
      Long numberUnprocessedAccounts) {
    this.numberUnprocessedAccounts = numberUnprocessedAccounts;
    return this;
  }

  /**
   * Get numberUnprocessedAccounts.
   *
   * @return numberUnprocessedAccounts
   */
  @ApiModelProperty(value = "")
  public Long getNumberUnprocessedAccounts() {
    return numberUnprocessedAccounts;
  }

  /** setNumberUnprocessedAccounts. */
  public void setNumberUnprocessedAccounts(Long numberUnprocessedAccounts) {
    this.numberUnprocessedAccounts = numberUnprocessedAccounts;
  }

  /**
   * results.
   *
   * @return OrganizationAccountSettingsImportResponse
   */
  public OrganizationAccountSettingsImportResponse results(
      java.util.List<OrganizationAccountSettingsImportResultResponse> results) {
    this.results = results;
    return this;
  }

  /**
   * addResultsItem.
   *
   * @return OrganizationAccountSettingsImportResponse
   */
  public OrganizationAccountSettingsImportResponse addResultsItem(
      OrganizationAccountSettingsImportResultResponse resultsItem) {
    if (this.results == null) {
      this.results = new java.util.ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results.
   *
   * @return results
   */
  @ApiModelProperty(value = "")
  public java.util.List<OrganizationAccountSettingsImportResultResponse> getResults() {
    return results;
  }

  /** setResults. */
  public void setResults(java.util.List<OrganizationAccountSettingsImportResultResponse> results) {
    this.results = results;
  }

  /**
   * success.
   *
   * @return OrganizationAccountSettingsImportResponse
   */
  public OrganizationAccountSettingsImportResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Get success.
   *
   * @return success
   */
  @ApiModelProperty(value = "")
  public Boolean isSuccess() {
    return success;
  }

  /** setSuccess. */
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  /**
   * skippedSettingsByAccount.
   *
   * @return OrganizationAccountSettingsImportResponse
   */
  public OrganizationAccountSettingsImportResponse skippedSettingsByAccount(
      java.util.Map<String, java.util.List<String>> skippedSettingsByAccount) {
    this.skippedSettingsByAccount = skippedSettingsByAccount;
    return this;
  }

  /**
   * putSkippedSettingsByAccountItem.
   *
   * @return OrganizationAccountSettingsImportResponse
   */
  public OrganizationAccountSettingsImportResponse putSkippedSettingsByAccountItem(
      String key, java.util.List<String> skippedSettingsByAccountItem) {
    if (this.skippedSettingsByAccount == null) {
      this.skippedSettingsByAccount = new java.util.HashMap<>();
    }
    this.skippedSettingsByAccount.put(key, skippedSettingsByAccountItem);
    return this;
  }

  /**
   * Get skippedSettingsByAccount.
   *
   * @return skippedSettingsByAccount
   */
  @ApiModelProperty(value = "")
  public java.util.Map<String, java.util.List<String>> getSkippedSettingsByAccount() {
    return skippedSettingsByAccount;
  }

  /** setSkippedSettingsByAccount. */
  public void setSkippedSettingsByAccount(
      java.util.Map<String, java.util.List<String>> skippedSettingsByAccount) {
    this.skippedSettingsByAccount = skippedSettingsByAccount;
  }

  /**
   * id.
   *
   * @return OrganizationAccountSettingsImportResponse
   */
  public OrganizationAccountSettingsImportResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id.
   *
   * @return id
   */
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  /** setId. */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * organizationId.
   *
   * @return OrganizationAccountSettingsImportResponse
   */
  public OrganizationAccountSettingsImportResponse organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * Get organizationId.
   *
   * @return organizationId
   */
  @ApiModelProperty(value = "")
  public String getOrganizationId() {
    return organizationId;
  }

  /** setOrganizationId. */
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  /**
   * status.
   *
   * @return OrganizationAccountSettingsImportResponse
   */
  public OrganizationAccountSettingsImportResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status.
   *
   * @return status
   */
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  /** setStatus. */
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * type.
   *
   * @return OrganizationAccountSettingsImportResponse
   */
  public OrganizationAccountSettingsImportResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   *
   * @return type
   */
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  /** setType. */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * requestor.
   *
   * @return OrganizationAccountSettingsImportResponse
   */
  public OrganizationAccountSettingsImportResponse requestor(
      OrganizationAccountSettingsImportRequestorResponse requestor) {
    this.requestor = requestor;
    return this;
  }

  /**
   * Get requestor.
   *
   * @return requestor
   */
  @ApiModelProperty(value = "")
  public OrganizationAccountSettingsImportRequestorResponse getRequestor() {
    return requestor;
  }

  /** setRequestor. */
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
    OrganizationAccountSettingsImportResponse organizationAccountSettingsImportResponse =
        (OrganizationAccountSettingsImportResponse) o;
    return Objects.equals(this.created, organizationAccountSettingsImportResponse.created)
        && Objects.equals(this.lastModified, organizationAccountSettingsImportResponse.lastModified)
        && Objects.equals(this.completed, organizationAccountSettingsImportResponse.completed)
        && Objects.equals(this.expires, organizationAccountSettingsImportResponse.expires)
        && Objects.equals(
            this.percentCompleted, organizationAccountSettingsImportResponse.percentCompleted)
        && Objects.equals(
            this.numberProcessedAccounts,
            organizationAccountSettingsImportResponse.numberProcessedAccounts)
        && Objects.equals(
            this.numberUnprocessedAccounts,
            organizationAccountSettingsImportResponse.numberUnprocessedAccounts)
        && Objects.equals(this.results, organizationAccountSettingsImportResponse.results)
        && Objects.equals(this.success, organizationAccountSettingsImportResponse.success)
        && Objects.equals(
            this.skippedSettingsByAccount,
            organizationAccountSettingsImportResponse.skippedSettingsByAccount)
        && Objects.equals(this.id, organizationAccountSettingsImportResponse.id)
        && Objects.equals(
            this.organizationId, organizationAccountSettingsImportResponse.organizationId)
        && Objects.equals(this.status, organizationAccountSettingsImportResponse.status)
        && Objects.equals(this.type, organizationAccountSettingsImportResponse.type)
        && Objects.equals(this.requestor, organizationAccountSettingsImportResponse.requestor);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(
        created,
        lastModified,
        completed,
        expires,
        percentCompleted,
        numberProcessedAccounts,
        numberUnprocessedAccounts,
        results,
        success,
        skippedSettingsByAccount,
        id,
        organizationId,
        status,
        type,
        requestor);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationAccountSettingsImportResponse {\n");

    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    percentCompleted: ").append(toIndentedString(percentCompleted)).append("\n");
    sb.append("    numberProcessedAccounts: ")
        .append(toIndentedString(numberProcessedAccounts))
        .append("\n");
    sb.append("    numberUnprocessedAccounts: ")
        .append(toIndentedString(numberUnprocessedAccounts))
        .append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    skippedSettingsByAccount: ")
        .append(toIndentedString(skippedSettingsByAccount))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    requestor: ").append(toIndentedString(requestor)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
