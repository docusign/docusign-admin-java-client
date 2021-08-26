package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.OrganizationImportResponseErrorRollup;
import com.docusign.admin.model.OrganizationImportResponseRequestor;
import com.docusign.admin.model.OrganizationImportResponseWarningRollup;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * OrganizationImportResponse
 */

public class OrganizationImportResponse {
  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("requestor")
  private OrganizationImportResponseRequestor requestor = null;

  @JsonProperty("created")
  private DateTime created = null;

  @JsonProperty("last_modified")
  private DateTime lastModified = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("user_count")
  private Integer userCount = null;

  @JsonProperty("processed_user_count")
  private Integer processedUserCount = null;

  @JsonProperty("added_user_count")
  private Integer addedUserCount = null;

  @JsonProperty("updated_user_count")
  private Integer updatedUserCount = null;

  @JsonProperty("closed_user_count")
  private Integer closedUserCount = null;

  @JsonProperty("no_action_required_user_count")
  private Integer noActionRequiredUserCount = null;

  @JsonProperty("error_count")
  private Integer errorCount = null;

  @JsonProperty("warning_count")
  private Integer warningCount = null;

  @JsonProperty("invalid_column_headers")
  private String invalidColumnHeaders = null;

  @JsonProperty("imports_not_found_or_not_available_for_accounts")
  private String importsNotFoundOrNotAvailableForAccounts = null;

  @JsonProperty("imports_failed_for_accounts")
  private String importsFailedForAccounts = null;

  @JsonProperty("imports_timed_out_for_accounts")
  private String importsTimedOutForAccounts = null;

  @JsonProperty("imports_not_found_or_not_available_for_sites")
  private String importsNotFoundOrNotAvailableForSites = null;

  @JsonProperty("imports_failed_for_sites")
  private String importsFailedForSites = null;

  @JsonProperty("imports_timed_out_for_sites")
  private String importsTimedOutForSites = null;

  @JsonProperty("file_level_error_rollups")
  private java.util.List<OrganizationImportResponseErrorRollup> fileLevelErrorRollups = null;

  @JsonProperty("user_level_error_rollups")
  private java.util.List<OrganizationImportResponseErrorRollup> userLevelErrorRollups = null;

  @JsonProperty("user_level_warning_rollups")
  private java.util.List<OrganizationImportResponseWarningRollup> userLevelWarningRollups = null;

  @JsonProperty("has_csv_results")
  private Boolean hasCsvResults = null;

  @JsonProperty("results_uri")
  private String resultsUri = null;

  public OrganizationImportResponse id(java.util.UUID id) {
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

  public OrganizationImportResponse type(String type) {
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

  public OrganizationImportResponse requestor(OrganizationImportResponseRequestor requestor) {
    this.requestor = requestor;
    return this;
  }

   /**
   * Get requestor
   * @return requestor
  **/
  @ApiModelProperty(value = "")
  public OrganizationImportResponseRequestor getRequestor() {
    return requestor;
  }

  public void setRequestor(OrganizationImportResponseRequestor requestor) {
    this.requestor = requestor;
  }

  public OrganizationImportResponse created(DateTime created) {
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

  public OrganizationImportResponse lastModified(DateTime lastModified) {
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

  public OrganizationImportResponse status(String status) {
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

  public OrganizationImportResponse userCount(Integer userCount) {
    this.userCount = userCount;
    return this;
  }

   /**
   * Get userCount
   * @return userCount
  **/
  @ApiModelProperty(value = "")
  public Integer getUserCount() {
    return userCount;
  }

  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }

  public OrganizationImportResponse processedUserCount(Integer processedUserCount) {
    this.processedUserCount = processedUserCount;
    return this;
  }

   /**
   * Get processedUserCount
   * @return processedUserCount
  **/
  @ApiModelProperty(value = "")
  public Integer getProcessedUserCount() {
    return processedUserCount;
  }

  public void setProcessedUserCount(Integer processedUserCount) {
    this.processedUserCount = processedUserCount;
  }

  public OrganizationImportResponse addedUserCount(Integer addedUserCount) {
    this.addedUserCount = addedUserCount;
    return this;
  }

   /**
   * Get addedUserCount
   * @return addedUserCount
  **/
  @ApiModelProperty(value = "")
  public Integer getAddedUserCount() {
    return addedUserCount;
  }

  public void setAddedUserCount(Integer addedUserCount) {
    this.addedUserCount = addedUserCount;
  }

  public OrganizationImportResponse updatedUserCount(Integer updatedUserCount) {
    this.updatedUserCount = updatedUserCount;
    return this;
  }

   /**
   * Get updatedUserCount
   * @return updatedUserCount
  **/
  @ApiModelProperty(value = "")
  public Integer getUpdatedUserCount() {
    return updatedUserCount;
  }

  public void setUpdatedUserCount(Integer updatedUserCount) {
    this.updatedUserCount = updatedUserCount;
  }

  public OrganizationImportResponse closedUserCount(Integer closedUserCount) {
    this.closedUserCount = closedUserCount;
    return this;
  }

   /**
   * Get closedUserCount
   * @return closedUserCount
  **/
  @ApiModelProperty(value = "")
  public Integer getClosedUserCount() {
    return closedUserCount;
  }

  public void setClosedUserCount(Integer closedUserCount) {
    this.closedUserCount = closedUserCount;
  }

  public OrganizationImportResponse noActionRequiredUserCount(Integer noActionRequiredUserCount) {
    this.noActionRequiredUserCount = noActionRequiredUserCount;
    return this;
  }

   /**
   * Get noActionRequiredUserCount
   * @return noActionRequiredUserCount
  **/
  @ApiModelProperty(value = "")
  public Integer getNoActionRequiredUserCount() {
    return noActionRequiredUserCount;
  }

  public void setNoActionRequiredUserCount(Integer noActionRequiredUserCount) {
    this.noActionRequiredUserCount = noActionRequiredUserCount;
  }

  public OrganizationImportResponse errorCount(Integer errorCount) {
    this.errorCount = errorCount;
    return this;
  }

   /**
   * Get errorCount
   * @return errorCount
  **/
  @ApiModelProperty(value = "")
  public Integer getErrorCount() {
    return errorCount;
  }

  public void setErrorCount(Integer errorCount) {
    this.errorCount = errorCount;
  }

  public OrganizationImportResponse warningCount(Integer warningCount) {
    this.warningCount = warningCount;
    return this;
  }

   /**
   * Get warningCount
   * @return warningCount
  **/
  @ApiModelProperty(value = "")
  public Integer getWarningCount() {
    return warningCount;
  }

  public void setWarningCount(Integer warningCount) {
    this.warningCount = warningCount;
  }

  public OrganizationImportResponse invalidColumnHeaders(String invalidColumnHeaders) {
    this.invalidColumnHeaders = invalidColumnHeaders;
    return this;
  }

   /**
   * Get invalidColumnHeaders
   * @return invalidColumnHeaders
  **/
  @ApiModelProperty(value = "")
  public String getInvalidColumnHeaders() {
    return invalidColumnHeaders;
  }

  public void setInvalidColumnHeaders(String invalidColumnHeaders) {
    this.invalidColumnHeaders = invalidColumnHeaders;
  }

  public OrganizationImportResponse importsNotFoundOrNotAvailableForAccounts(String importsNotFoundOrNotAvailableForAccounts) {
    this.importsNotFoundOrNotAvailableForAccounts = importsNotFoundOrNotAvailableForAccounts;
    return this;
  }

   /**
   * Get importsNotFoundOrNotAvailableForAccounts
   * @return importsNotFoundOrNotAvailableForAccounts
  **/
  @ApiModelProperty(value = "")
  public String getImportsNotFoundOrNotAvailableForAccounts() {
    return importsNotFoundOrNotAvailableForAccounts;
  }

  public void setImportsNotFoundOrNotAvailableForAccounts(String importsNotFoundOrNotAvailableForAccounts) {
    this.importsNotFoundOrNotAvailableForAccounts = importsNotFoundOrNotAvailableForAccounts;
  }

  public OrganizationImportResponse importsFailedForAccounts(String importsFailedForAccounts) {
    this.importsFailedForAccounts = importsFailedForAccounts;
    return this;
  }

   /**
   * Get importsFailedForAccounts
   * @return importsFailedForAccounts
  **/
  @ApiModelProperty(value = "")
  public String getImportsFailedForAccounts() {
    return importsFailedForAccounts;
  }

  public void setImportsFailedForAccounts(String importsFailedForAccounts) {
    this.importsFailedForAccounts = importsFailedForAccounts;
  }

  public OrganizationImportResponse importsTimedOutForAccounts(String importsTimedOutForAccounts) {
    this.importsTimedOutForAccounts = importsTimedOutForAccounts;
    return this;
  }

   /**
   * Get importsTimedOutForAccounts
   * @return importsTimedOutForAccounts
  **/
  @ApiModelProperty(value = "")
  public String getImportsTimedOutForAccounts() {
    return importsTimedOutForAccounts;
  }

  public void setImportsTimedOutForAccounts(String importsTimedOutForAccounts) {
    this.importsTimedOutForAccounts = importsTimedOutForAccounts;
  }

  public OrganizationImportResponse importsNotFoundOrNotAvailableForSites(String importsNotFoundOrNotAvailableForSites) {
    this.importsNotFoundOrNotAvailableForSites = importsNotFoundOrNotAvailableForSites;
    return this;
  }

   /**
   * Get importsNotFoundOrNotAvailableForSites
   * @return importsNotFoundOrNotAvailableForSites
  **/
  @ApiModelProperty(value = "")
  public String getImportsNotFoundOrNotAvailableForSites() {
    return importsNotFoundOrNotAvailableForSites;
  }

  public void setImportsNotFoundOrNotAvailableForSites(String importsNotFoundOrNotAvailableForSites) {
    this.importsNotFoundOrNotAvailableForSites = importsNotFoundOrNotAvailableForSites;
  }

  public OrganizationImportResponse importsFailedForSites(String importsFailedForSites) {
    this.importsFailedForSites = importsFailedForSites;
    return this;
  }

   /**
   * Get importsFailedForSites
   * @return importsFailedForSites
  **/
  @ApiModelProperty(value = "")
  public String getImportsFailedForSites() {
    return importsFailedForSites;
  }

  public void setImportsFailedForSites(String importsFailedForSites) {
    this.importsFailedForSites = importsFailedForSites;
  }

  public OrganizationImportResponse importsTimedOutForSites(String importsTimedOutForSites) {
    this.importsTimedOutForSites = importsTimedOutForSites;
    return this;
  }

   /**
   * Get importsTimedOutForSites
   * @return importsTimedOutForSites
  **/
  @ApiModelProperty(value = "")
  public String getImportsTimedOutForSites() {
    return importsTimedOutForSites;
  }

  public void setImportsTimedOutForSites(String importsTimedOutForSites) {
    this.importsTimedOutForSites = importsTimedOutForSites;
  }

  public OrganizationImportResponse fileLevelErrorRollups(java.util.List<OrganizationImportResponseErrorRollup> fileLevelErrorRollups) {
    this.fileLevelErrorRollups = fileLevelErrorRollups;
    return this;
  }

  public OrganizationImportResponse addFileLevelErrorRollupsItem(OrganizationImportResponseErrorRollup fileLevelErrorRollupsItem) {
    if (this.fileLevelErrorRollups == null) {
      this.fileLevelErrorRollups = new java.util.ArrayList<OrganizationImportResponseErrorRollup>();
    }
    this.fileLevelErrorRollups.add(fileLevelErrorRollupsItem);
    return this;
  }

   /**
   * Get fileLevelErrorRollups
   * @return fileLevelErrorRollups
  **/
  @ApiModelProperty(value = "")
  public java.util.List<OrganizationImportResponseErrorRollup> getFileLevelErrorRollups() {
    return fileLevelErrorRollups;
  }

  public void setFileLevelErrorRollups(java.util.List<OrganizationImportResponseErrorRollup> fileLevelErrorRollups) {
    this.fileLevelErrorRollups = fileLevelErrorRollups;
  }

  public OrganizationImportResponse userLevelErrorRollups(java.util.List<OrganizationImportResponseErrorRollup> userLevelErrorRollups) {
    this.userLevelErrorRollups = userLevelErrorRollups;
    return this;
  }

  public OrganizationImportResponse addUserLevelErrorRollupsItem(OrganizationImportResponseErrorRollup userLevelErrorRollupsItem) {
    if (this.userLevelErrorRollups == null) {
      this.userLevelErrorRollups = new java.util.ArrayList<OrganizationImportResponseErrorRollup>();
    }
    this.userLevelErrorRollups.add(userLevelErrorRollupsItem);
    return this;
  }

   /**
   * Get userLevelErrorRollups
   * @return userLevelErrorRollups
  **/
  @ApiModelProperty(value = "")
  public java.util.List<OrganizationImportResponseErrorRollup> getUserLevelErrorRollups() {
    return userLevelErrorRollups;
  }

  public void setUserLevelErrorRollups(java.util.List<OrganizationImportResponseErrorRollup> userLevelErrorRollups) {
    this.userLevelErrorRollups = userLevelErrorRollups;
  }

  public OrganizationImportResponse userLevelWarningRollups(java.util.List<OrganizationImportResponseWarningRollup> userLevelWarningRollups) {
    this.userLevelWarningRollups = userLevelWarningRollups;
    return this;
  }

  public OrganizationImportResponse addUserLevelWarningRollupsItem(OrganizationImportResponseWarningRollup userLevelWarningRollupsItem) {
    if (this.userLevelWarningRollups == null) {
      this.userLevelWarningRollups = new java.util.ArrayList<OrganizationImportResponseWarningRollup>();
    }
    this.userLevelWarningRollups.add(userLevelWarningRollupsItem);
    return this;
  }

   /**
   * Get userLevelWarningRollups
   * @return userLevelWarningRollups
  **/
  @ApiModelProperty(value = "")
  public java.util.List<OrganizationImportResponseWarningRollup> getUserLevelWarningRollups() {
    return userLevelWarningRollups;
  }

  public void setUserLevelWarningRollups(java.util.List<OrganizationImportResponseWarningRollup> userLevelWarningRollups) {
    this.userLevelWarningRollups = userLevelWarningRollups;
  }

  public OrganizationImportResponse hasCsvResults(Boolean hasCsvResults) {
    this.hasCsvResults = hasCsvResults;
    return this;
  }

   /**
   * Get hasCsvResults
   * @return hasCsvResults
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasCsvResults() {
    return hasCsvResults;
  }

  public void setHasCsvResults(Boolean hasCsvResults) {
    this.hasCsvResults = hasCsvResults;
  }

  public OrganizationImportResponse resultsUri(String resultsUri) {
    this.resultsUri = resultsUri;
    return this;
  }

   /**
   * Get resultsUri
   * @return resultsUri
  **/
  @ApiModelProperty(value = "")
  public String getResultsUri() {
    return resultsUri;
  }

  public void setResultsUri(String resultsUri) {
    this.resultsUri = resultsUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationImportResponse organizationImportResponse = (OrganizationImportResponse) o;
    return Objects.equals(this.id, organizationImportResponse.id) &&
        Objects.equals(this.type, organizationImportResponse.type) &&
        Objects.equals(this.requestor, organizationImportResponse.requestor) &&
        Objects.equals(this.created, organizationImportResponse.created) &&
        Objects.equals(this.lastModified, organizationImportResponse.lastModified) &&
        Objects.equals(this.status, organizationImportResponse.status) &&
        Objects.equals(this.userCount, organizationImportResponse.userCount) &&
        Objects.equals(this.processedUserCount, organizationImportResponse.processedUserCount) &&
        Objects.equals(this.addedUserCount, organizationImportResponse.addedUserCount) &&
        Objects.equals(this.updatedUserCount, organizationImportResponse.updatedUserCount) &&
        Objects.equals(this.closedUserCount, organizationImportResponse.closedUserCount) &&
        Objects.equals(this.noActionRequiredUserCount, organizationImportResponse.noActionRequiredUserCount) &&
        Objects.equals(this.errorCount, organizationImportResponse.errorCount) &&
        Objects.equals(this.warningCount, organizationImportResponse.warningCount) &&
        Objects.equals(this.invalidColumnHeaders, organizationImportResponse.invalidColumnHeaders) &&
        Objects.equals(this.importsNotFoundOrNotAvailableForAccounts, organizationImportResponse.importsNotFoundOrNotAvailableForAccounts) &&
        Objects.equals(this.importsFailedForAccounts, organizationImportResponse.importsFailedForAccounts) &&
        Objects.equals(this.importsTimedOutForAccounts, organizationImportResponse.importsTimedOutForAccounts) &&
        Objects.equals(this.importsNotFoundOrNotAvailableForSites, organizationImportResponse.importsNotFoundOrNotAvailableForSites) &&
        Objects.equals(this.importsFailedForSites, organizationImportResponse.importsFailedForSites) &&
        Objects.equals(this.importsTimedOutForSites, organizationImportResponse.importsTimedOutForSites) &&
        Objects.equals(this.fileLevelErrorRollups, organizationImportResponse.fileLevelErrorRollups) &&
        Objects.equals(this.userLevelErrorRollups, organizationImportResponse.userLevelErrorRollups) &&
        Objects.equals(this.userLevelWarningRollups, organizationImportResponse.userLevelWarningRollups) &&
        Objects.equals(this.hasCsvResults, organizationImportResponse.hasCsvResults) &&
        Objects.equals(this.resultsUri, organizationImportResponse.resultsUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, requestor, created, lastModified, status, userCount, processedUserCount, addedUserCount, updatedUserCount, closedUserCount, noActionRequiredUserCount, errorCount, warningCount, invalidColumnHeaders, importsNotFoundOrNotAvailableForAccounts, importsFailedForAccounts, importsTimedOutForAccounts, importsNotFoundOrNotAvailableForSites, importsFailedForSites, importsTimedOutForSites, fileLevelErrorRollups, userLevelErrorRollups, userLevelWarningRollups, hasCsvResults, resultsUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationImportResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    requestor: ").append(toIndentedString(requestor)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
    sb.append("    processedUserCount: ").append(toIndentedString(processedUserCount)).append("\n");
    sb.append("    addedUserCount: ").append(toIndentedString(addedUserCount)).append("\n");
    sb.append("    updatedUserCount: ").append(toIndentedString(updatedUserCount)).append("\n");
    sb.append("    closedUserCount: ").append(toIndentedString(closedUserCount)).append("\n");
    sb.append("    noActionRequiredUserCount: ").append(toIndentedString(noActionRequiredUserCount)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    warningCount: ").append(toIndentedString(warningCount)).append("\n");
    sb.append("    invalidColumnHeaders: ").append(toIndentedString(invalidColumnHeaders)).append("\n");
    sb.append("    importsNotFoundOrNotAvailableForAccounts: ").append(toIndentedString(importsNotFoundOrNotAvailableForAccounts)).append("\n");
    sb.append("    importsFailedForAccounts: ").append(toIndentedString(importsFailedForAccounts)).append("\n");
    sb.append("    importsTimedOutForAccounts: ").append(toIndentedString(importsTimedOutForAccounts)).append("\n");
    sb.append("    importsNotFoundOrNotAvailableForSites: ").append(toIndentedString(importsNotFoundOrNotAvailableForSites)).append("\n");
    sb.append("    importsFailedForSites: ").append(toIndentedString(importsFailedForSites)).append("\n");
    sb.append("    importsTimedOutForSites: ").append(toIndentedString(importsTimedOutForSites)).append("\n");
    sb.append("    fileLevelErrorRollups: ").append(toIndentedString(fileLevelErrorRollups)).append("\n");
    sb.append("    userLevelErrorRollups: ").append(toIndentedString(userLevelErrorRollups)).append("\n");
    sb.append("    userLevelWarningRollups: ").append(toIndentedString(userLevelWarningRollups)).append("\n");
    sb.append("    hasCsvResults: ").append(toIndentedString(hasCsvResults)).append("\n");
    sb.append("    resultsUri: ").append(toIndentedString(resultsUri)).append("\n");
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

