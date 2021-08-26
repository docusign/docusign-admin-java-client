package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.OASIRRErrorDetails;
import com.docusign.admin.model.OASIRROrganizationAccountSettingsErrorDataResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OrganizationAccountSettingsImportResultResponse
 */

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
  private java.util.List<OASIRROrganizationAccountSettingsErrorDataResponse> processingIssuesByAccount = null;

  @JsonProperty("number_unprocessed_accounts")
  private Long numberUnprocessedAccounts = null;

  public OrganizationAccountSettingsImportResultResponse id(java.util.UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getId() {
    return id;
  }

  public void setId(java.util.UUID id) {
    this.id = id;
  }

  public OrganizationAccountSettingsImportResultResponse siteId(Integer siteId) {
    this.siteId = siteId;
    return this;
  }

   /**
   * Get siteId
   * @return siteId
  **/
  @ApiModelProperty(value = "")
  public Integer getSiteId() {
    return siteId;
  }

  public void setSiteId(Integer siteId) {
    this.siteId = siteId;
  }

  public OrganizationAccountSettingsImportResultResponse url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public OrganizationAccountSettingsImportResultResponse numberProcessedAccounts(Long numberProcessedAccounts) {
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

  public OrganizationAccountSettingsImportResultResponse errorDetails(OASIRRErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(value = "")
  public OASIRRErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(OASIRRErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public OrganizationAccountSettingsImportResultResponse processingIssuesByAccount(java.util.List<OASIRROrganizationAccountSettingsErrorDataResponse> processingIssuesByAccount) {
    this.processingIssuesByAccount = processingIssuesByAccount;
    return this;
  }

  public OrganizationAccountSettingsImportResultResponse addProcessingIssuesByAccountItem(OASIRROrganizationAccountSettingsErrorDataResponse processingIssuesByAccountItem) {
    if (this.processingIssuesByAccount == null) {
      this.processingIssuesByAccount = new java.util.ArrayList<OASIRROrganizationAccountSettingsErrorDataResponse>();
    }
    this.processingIssuesByAccount.add(processingIssuesByAccountItem);
    return this;
  }

   /**
   * Get processingIssuesByAccount
   * @return processingIssuesByAccount
  **/
  @ApiModelProperty(value = "")
  public java.util.List<OASIRROrganizationAccountSettingsErrorDataResponse> getProcessingIssuesByAccount() {
    return processingIssuesByAccount;
  }

  public void setProcessingIssuesByAccount(java.util.List<OASIRROrganizationAccountSettingsErrorDataResponse> processingIssuesByAccount) {
    this.processingIssuesByAccount = processingIssuesByAccount;
  }

  public OrganizationAccountSettingsImportResultResponse numberUnprocessedAccounts(Long numberUnprocessedAccounts) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationAccountSettingsImportResultResponse organizationAccountSettingsImportResultResponse = (OrganizationAccountSettingsImportResultResponse) o;
    return Objects.equals(this.id, organizationAccountSettingsImportResultResponse.id) &&
        Objects.equals(this.siteId, organizationAccountSettingsImportResultResponse.siteId) &&
        Objects.equals(this.url, organizationAccountSettingsImportResultResponse.url) &&
        Objects.equals(this.numberProcessedAccounts, organizationAccountSettingsImportResultResponse.numberProcessedAccounts) &&
        Objects.equals(this.errorDetails, organizationAccountSettingsImportResultResponse.errorDetails) &&
        Objects.equals(this.processingIssuesByAccount, organizationAccountSettingsImportResultResponse.processingIssuesByAccount) &&
        Objects.equals(this.numberUnprocessedAccounts, organizationAccountSettingsImportResultResponse.numberUnprocessedAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, siteId, url, numberProcessedAccounts, errorDetails, processingIssuesByAccount, numberUnprocessedAccounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationAccountSettingsImportResultResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    numberProcessedAccounts: ").append(toIndentedString(numberProcessedAccounts)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    processingIssuesByAccount: ").append(toIndentedString(processingIssuesByAccount)).append("\n");
    sb.append("    numberUnprocessedAccounts: ").append(toIndentedString(numberUnprocessedAccounts)).append("\n");
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

