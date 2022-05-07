package com.docusign.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** OrganizationAccountSettingsImportResultResponse. */
public class OrganizationAccountSettingsImportResultResponse {
  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("site_id")
  private Integer siteId = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("number_processed_accounts")
  private Long numberProcessedAccounts = null;

  @JsonProperty("error_details")
  private OASIRRErrorDetails errorDetails = null;

  @JsonProperty("processing_issues_by_account")
  private java.util.List<OASIRROrganizationAccountSettingsErrorDataResponse>
      processingIssuesByAccount = null;

  @JsonProperty("number_unprocessed_accounts")
  private Long numberUnprocessedAccounts = null;

  /**
   * id.
   *
   * @return OrganizationAccountSettingsImportResultResponse
   */
  public OrganizationAccountSettingsImportResultResponse id(java.util.UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id.
   *
   * @return id
   */
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getId() {
    return id;
  }

  /** setId. */
  public void setId(java.util.UUID id) {
    this.id = id;
  }

  /**
   * siteId.
   *
   * @return OrganizationAccountSettingsImportResultResponse
   */
  public OrganizationAccountSettingsImportResultResponse siteId(Integer siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * Get siteId.
   *
   * @return siteId
   */
  @ApiModelProperty(value = "")
  public Integer getSiteId() {
    return siteId;
  }

  /** setSiteId. */
  public void setSiteId(Integer siteId) {
    this.siteId = siteId;
  }

  /**
   * url.
   *
   * @return OrganizationAccountSettingsImportResultResponse
   */
  public OrganizationAccountSettingsImportResultResponse url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url.
   *
   * @return url
   */
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  /** setUrl. */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * numberProcessedAccounts.
   *
   * @return OrganizationAccountSettingsImportResultResponse
   */
  public OrganizationAccountSettingsImportResultResponse numberProcessedAccounts(
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
   * errorDetails.
   *
   * @return OrganizationAccountSettingsImportResultResponse
   */
  public OrganizationAccountSettingsImportResultResponse errorDetails(
      OASIRRErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails.
   *
   * @return errorDetails
   */
  @ApiModelProperty(value = "")
  public OASIRRErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /** setErrorDetails. */
  public void setErrorDetails(OASIRRErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  /**
   * processingIssuesByAccount.
   *
   * @return OrganizationAccountSettingsImportResultResponse
   */
  public OrganizationAccountSettingsImportResultResponse processingIssuesByAccount(
      java.util.List<OASIRROrganizationAccountSettingsErrorDataResponse>
          processingIssuesByAccount) {
    this.processingIssuesByAccount = processingIssuesByAccount;
    return this;
  }

  /**
   * addProcessingIssuesByAccountItem.
   *
   * @return OrganizationAccountSettingsImportResultResponse
   */
  public OrganizationAccountSettingsImportResultResponse addProcessingIssuesByAccountItem(
      OASIRROrganizationAccountSettingsErrorDataResponse processingIssuesByAccountItem) {
    if (this.processingIssuesByAccount == null) {
      this.processingIssuesByAccount = new java.util.ArrayList<>();
    }
    this.processingIssuesByAccount.add(processingIssuesByAccountItem);
    return this;
  }

  /**
   * Get processingIssuesByAccount.
   *
   * @return processingIssuesByAccount
   */
  @ApiModelProperty(value = "")
  public java.util.List<OASIRROrganizationAccountSettingsErrorDataResponse>
      getProcessingIssuesByAccount() {
    return processingIssuesByAccount;
  }

  /** setProcessingIssuesByAccount. */
  public void setProcessingIssuesByAccount(
      java.util.List<OASIRROrganizationAccountSettingsErrorDataResponse>
          processingIssuesByAccount) {
    this.processingIssuesByAccount = processingIssuesByAccount;
  }

  /**
   * numberUnprocessedAccounts.
   *
   * @return OrganizationAccountSettingsImportResultResponse
   */
  public OrganizationAccountSettingsImportResultResponse numberUnprocessedAccounts(
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
    OrganizationAccountSettingsImportResultResponse
        organizationAccountSettingsImportResultResponse =
            (OrganizationAccountSettingsImportResultResponse) o;
    return Objects.equals(this.id, organizationAccountSettingsImportResultResponse.id)
        && Objects.equals(this.siteId, organizationAccountSettingsImportResultResponse.siteId)
        && Objects.equals(this.url, organizationAccountSettingsImportResultResponse.url)
        && Objects.equals(
            this.numberProcessedAccounts,
            organizationAccountSettingsImportResultResponse.numberProcessedAccounts)
        && Objects.equals(
            this.errorDetails, organizationAccountSettingsImportResultResponse.errorDetails)
        && Objects.equals(
            this.processingIssuesByAccount,
            organizationAccountSettingsImportResultResponse.processingIssuesByAccount)
        && Objects.equals(
            this.numberUnprocessedAccounts,
            organizationAccountSettingsImportResultResponse.numberUnprocessedAccounts);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(
        id,
        siteId,
        url,
        numberProcessedAccounts,
        errorDetails,
        processingIssuesByAccount,
        numberUnprocessedAccounts);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationAccountSettingsImportResultResponse {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    numberProcessedAccounts: ")
        .append(toIndentedString(numberProcessedAccounts))
        .append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    processingIssuesByAccount: ")
        .append(toIndentedString(processingIssuesByAccount))
        .append("\n");
    sb.append("    numberUnprocessedAccounts: ")
        .append(toIndentedString(numberUnprocessedAccounts))
        .append("\n");
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
