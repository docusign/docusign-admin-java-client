package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.OrganizationImportResponseErrorRollup;
import com.docusign.admin.model.OrganizationImportResponseRequestor;
import com.docusign.admin.model.OrganizationImportResponseWarningRollup;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;

/**
 * OrganizationImportResponse.
 *
 */

public class OrganizationImportResponse {
  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("requestor")
  private OrganizationImportResponseRequestor requestor = null;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("last_modified")
  private String lastModified = null;

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


  /**
   * id.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse id(java.util.UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id.
   * @return id
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getId() {
    return id;
  }

  /**
   * setId.
   **/
  public void setId(java.util.UUID id) {
    this.id = id;
  }


  /**
   * type.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse type(String type) {
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
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse requestor(OrganizationImportResponseRequestor requestor) {
    this.requestor = requestor;
    return this;
  }

  /**
   * Get requestor.
   * @return requestor
   **/
  @Schema(description = "")
  public OrganizationImportResponseRequestor getRequestor() {
    return requestor;
  }

  /**
   * setRequestor.
   **/
  public void setRequestor(OrganizationImportResponseRequestor requestor) {
    this.requestor = requestor;
  }


  /**
   * created.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse created(String created) {
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
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse lastModified(String lastModified) {
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
   * status.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse status(String status) {
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
   * userCount.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse userCount(Integer userCount) {
    this.userCount = userCount;
    return this;
  }

  /**
   * Get userCount.
   * @return userCount
   **/
  @Schema(description = "")
  public Integer getUserCount() {
    return userCount;
  }

  /**
   * setUserCount.
   **/
  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }


  /**
   * processedUserCount.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse processedUserCount(Integer processedUserCount) {
    this.processedUserCount = processedUserCount;
    return this;
  }

  /**
   * Get processedUserCount.
   * @return processedUserCount
   **/
  @Schema(description = "")
  public Integer getProcessedUserCount() {
    return processedUserCount;
  }

  /**
   * setProcessedUserCount.
   **/
  public void setProcessedUserCount(Integer processedUserCount) {
    this.processedUserCount = processedUserCount;
  }


  /**
   * addedUserCount.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse addedUserCount(Integer addedUserCount) {
    this.addedUserCount = addedUserCount;
    return this;
  }

  /**
   * Get addedUserCount.
   * @return addedUserCount
   **/
  @Schema(description = "")
  public Integer getAddedUserCount() {
    return addedUserCount;
  }

  /**
   * setAddedUserCount.
   **/
  public void setAddedUserCount(Integer addedUserCount) {
    this.addedUserCount = addedUserCount;
  }


  /**
   * updatedUserCount.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse updatedUserCount(Integer updatedUserCount) {
    this.updatedUserCount = updatedUserCount;
    return this;
  }

  /**
   * Get updatedUserCount.
   * @return updatedUserCount
   **/
  @Schema(description = "")
  public Integer getUpdatedUserCount() {
    return updatedUserCount;
  }

  /**
   * setUpdatedUserCount.
   **/
  public void setUpdatedUserCount(Integer updatedUserCount) {
    this.updatedUserCount = updatedUserCount;
  }


  /**
   * closedUserCount.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse closedUserCount(Integer closedUserCount) {
    this.closedUserCount = closedUserCount;
    return this;
  }

  /**
   * Get closedUserCount.
   * @return closedUserCount
   **/
  @Schema(description = "")
  public Integer getClosedUserCount() {
    return closedUserCount;
  }

  /**
   * setClosedUserCount.
   **/
  public void setClosedUserCount(Integer closedUserCount) {
    this.closedUserCount = closedUserCount;
  }


  /**
   * noActionRequiredUserCount.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse noActionRequiredUserCount(Integer noActionRequiredUserCount) {
    this.noActionRequiredUserCount = noActionRequiredUserCount;
    return this;
  }

  /**
   * Get noActionRequiredUserCount.
   * @return noActionRequiredUserCount
   **/
  @Schema(description = "")
  public Integer getNoActionRequiredUserCount() {
    return noActionRequiredUserCount;
  }

  /**
   * setNoActionRequiredUserCount.
   **/
  public void setNoActionRequiredUserCount(Integer noActionRequiredUserCount) {
    this.noActionRequiredUserCount = noActionRequiredUserCount;
  }


  /**
   * errorCount.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse errorCount(Integer errorCount) {
    this.errorCount = errorCount;
    return this;
  }

  /**
   * Get errorCount.
   * @return errorCount
   **/
  @Schema(description = "")
  public Integer getErrorCount() {
    return errorCount;
  }

  /**
   * setErrorCount.
   **/
  public void setErrorCount(Integer errorCount) {
    this.errorCount = errorCount;
  }


  /**
   * warningCount.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse warningCount(Integer warningCount) {
    this.warningCount = warningCount;
    return this;
  }

  /**
   * Get warningCount.
   * @return warningCount
   **/
  @Schema(description = "")
  public Integer getWarningCount() {
    return warningCount;
  }

  /**
   * setWarningCount.
   **/
  public void setWarningCount(Integer warningCount) {
    this.warningCount = warningCount;
  }


  /**
   * invalidColumnHeaders.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse invalidColumnHeaders(String invalidColumnHeaders) {
    this.invalidColumnHeaders = invalidColumnHeaders;
    return this;
  }

  /**
   * Get invalidColumnHeaders.
   * @return invalidColumnHeaders
   **/
  @Schema(description = "")
  public String getInvalidColumnHeaders() {
    return invalidColumnHeaders;
  }

  /**
   * setInvalidColumnHeaders.
   **/
  public void setInvalidColumnHeaders(String invalidColumnHeaders) {
    this.invalidColumnHeaders = invalidColumnHeaders;
  }


  /**
   * importsNotFoundOrNotAvailableForAccounts.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse importsNotFoundOrNotAvailableForAccounts(String importsNotFoundOrNotAvailableForAccounts) {
    this.importsNotFoundOrNotAvailableForAccounts = importsNotFoundOrNotAvailableForAccounts;
    return this;
  }

  /**
   * Get importsNotFoundOrNotAvailableForAccounts.
   * @return importsNotFoundOrNotAvailableForAccounts
   **/
  @Schema(description = "")
  public String getImportsNotFoundOrNotAvailableForAccounts() {
    return importsNotFoundOrNotAvailableForAccounts;
  }

  /**
   * setImportsNotFoundOrNotAvailableForAccounts.
   **/
  public void setImportsNotFoundOrNotAvailableForAccounts(String importsNotFoundOrNotAvailableForAccounts) {
    this.importsNotFoundOrNotAvailableForAccounts = importsNotFoundOrNotAvailableForAccounts;
  }


  /**
   * importsFailedForAccounts.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse importsFailedForAccounts(String importsFailedForAccounts) {
    this.importsFailedForAccounts = importsFailedForAccounts;
    return this;
  }

  /**
   * Get importsFailedForAccounts.
   * @return importsFailedForAccounts
   **/
  @Schema(description = "")
  public String getImportsFailedForAccounts() {
    return importsFailedForAccounts;
  }

  /**
   * setImportsFailedForAccounts.
   **/
  public void setImportsFailedForAccounts(String importsFailedForAccounts) {
    this.importsFailedForAccounts = importsFailedForAccounts;
  }


  /**
   * importsTimedOutForAccounts.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse importsTimedOutForAccounts(String importsTimedOutForAccounts) {
    this.importsTimedOutForAccounts = importsTimedOutForAccounts;
    return this;
  }

  /**
   * Get importsTimedOutForAccounts.
   * @return importsTimedOutForAccounts
   **/
  @Schema(description = "")
  public String getImportsTimedOutForAccounts() {
    return importsTimedOutForAccounts;
  }

  /**
   * setImportsTimedOutForAccounts.
   **/
  public void setImportsTimedOutForAccounts(String importsTimedOutForAccounts) {
    this.importsTimedOutForAccounts = importsTimedOutForAccounts;
  }


  /**
   * importsNotFoundOrNotAvailableForSites.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse importsNotFoundOrNotAvailableForSites(String importsNotFoundOrNotAvailableForSites) {
    this.importsNotFoundOrNotAvailableForSites = importsNotFoundOrNotAvailableForSites;
    return this;
  }

  /**
   * Get importsNotFoundOrNotAvailableForSites.
   * @return importsNotFoundOrNotAvailableForSites
   **/
  @Schema(description = "")
  public String getImportsNotFoundOrNotAvailableForSites() {
    return importsNotFoundOrNotAvailableForSites;
  }

  /**
   * setImportsNotFoundOrNotAvailableForSites.
   **/
  public void setImportsNotFoundOrNotAvailableForSites(String importsNotFoundOrNotAvailableForSites) {
    this.importsNotFoundOrNotAvailableForSites = importsNotFoundOrNotAvailableForSites;
  }


  /**
   * importsFailedForSites.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse importsFailedForSites(String importsFailedForSites) {
    this.importsFailedForSites = importsFailedForSites;
    return this;
  }

  /**
   * Get importsFailedForSites.
   * @return importsFailedForSites
   **/
  @Schema(description = "")
  public String getImportsFailedForSites() {
    return importsFailedForSites;
  }

  /**
   * setImportsFailedForSites.
   **/
  public void setImportsFailedForSites(String importsFailedForSites) {
    this.importsFailedForSites = importsFailedForSites;
  }


  /**
   * importsTimedOutForSites.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse importsTimedOutForSites(String importsTimedOutForSites) {
    this.importsTimedOutForSites = importsTimedOutForSites;
    return this;
  }

  /**
   * Get importsTimedOutForSites.
   * @return importsTimedOutForSites
   **/
  @Schema(description = "")
  public String getImportsTimedOutForSites() {
    return importsTimedOutForSites;
  }

  /**
   * setImportsTimedOutForSites.
   **/
  public void setImportsTimedOutForSites(String importsTimedOutForSites) {
    this.importsTimedOutForSites = importsTimedOutForSites;
  }


  /**
   * fileLevelErrorRollups.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse fileLevelErrorRollups(java.util.List<OrganizationImportResponseErrorRollup> fileLevelErrorRollups) {
    this.fileLevelErrorRollups = fileLevelErrorRollups;
    return this;
  }
  
  /**
   * addFileLevelErrorRollupsItem.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse addFileLevelErrorRollupsItem(OrganizationImportResponseErrorRollup fileLevelErrorRollupsItem) {
    if (this.fileLevelErrorRollups == null) {
      this.fileLevelErrorRollups = new java.util.ArrayList<>();
    }
    this.fileLevelErrorRollups.add(fileLevelErrorRollupsItem);
    return this;
  }

  /**
   * Get fileLevelErrorRollups.
   * @return fileLevelErrorRollups
   **/
  @Schema(description = "")
  public java.util.List<OrganizationImportResponseErrorRollup> getFileLevelErrorRollups() {
    return fileLevelErrorRollups;
  }

  /**
   * setFileLevelErrorRollups.
   **/
  public void setFileLevelErrorRollups(java.util.List<OrganizationImportResponseErrorRollup> fileLevelErrorRollups) {
    this.fileLevelErrorRollups = fileLevelErrorRollups;
  }


  /**
   * userLevelErrorRollups.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse userLevelErrorRollups(java.util.List<OrganizationImportResponseErrorRollup> userLevelErrorRollups) {
    this.userLevelErrorRollups = userLevelErrorRollups;
    return this;
  }
  
  /**
   * addUserLevelErrorRollupsItem.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse addUserLevelErrorRollupsItem(OrganizationImportResponseErrorRollup userLevelErrorRollupsItem) {
    if (this.userLevelErrorRollups == null) {
      this.userLevelErrorRollups = new java.util.ArrayList<>();
    }
    this.userLevelErrorRollups.add(userLevelErrorRollupsItem);
    return this;
  }

  /**
   * Get userLevelErrorRollups.
   * @return userLevelErrorRollups
   **/
  @Schema(description = "")
  public java.util.List<OrganizationImportResponseErrorRollup> getUserLevelErrorRollups() {
    return userLevelErrorRollups;
  }

  /**
   * setUserLevelErrorRollups.
   **/
  public void setUserLevelErrorRollups(java.util.List<OrganizationImportResponseErrorRollup> userLevelErrorRollups) {
    this.userLevelErrorRollups = userLevelErrorRollups;
  }


  /**
   * userLevelWarningRollups.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse userLevelWarningRollups(java.util.List<OrganizationImportResponseWarningRollup> userLevelWarningRollups) {
    this.userLevelWarningRollups = userLevelWarningRollups;
    return this;
  }
  
  /**
   * addUserLevelWarningRollupsItem.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse addUserLevelWarningRollupsItem(OrganizationImportResponseWarningRollup userLevelWarningRollupsItem) {
    if (this.userLevelWarningRollups == null) {
      this.userLevelWarningRollups = new java.util.ArrayList<>();
    }
    this.userLevelWarningRollups.add(userLevelWarningRollupsItem);
    return this;
  }

  /**
   * Get userLevelWarningRollups.
   * @return userLevelWarningRollups
   **/
  @Schema(description = "")
  public java.util.List<OrganizationImportResponseWarningRollup> getUserLevelWarningRollups() {
    return userLevelWarningRollups;
  }

  /**
   * setUserLevelWarningRollups.
   **/
  public void setUserLevelWarningRollups(java.util.List<OrganizationImportResponseWarningRollup> userLevelWarningRollups) {
    this.userLevelWarningRollups = userLevelWarningRollups;
  }


  /**
   * hasCsvResults.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse hasCsvResults(Boolean hasCsvResults) {
    this.hasCsvResults = hasCsvResults;
    return this;
  }

  /**
   * Get hasCsvResults.
   * @return hasCsvResults
   **/
  @Schema(description = "")
  public Boolean isHasCsvResults() {
    return hasCsvResults;
  }

  /**
   * setHasCsvResults.
   **/
  public void setHasCsvResults(Boolean hasCsvResults) {
    this.hasCsvResults = hasCsvResults;
  }


  /**
   * resultsUri.
   *
   * @return OrganizationImportResponse
   **/
  public OrganizationImportResponse resultsUri(String resultsUri) {
    this.resultsUri = resultsUri;
    return this;
  }

  /**
   * Get resultsUri.
   * @return resultsUri
   **/
  @Schema(description = "")
  public String getResultsUri() {
    return resultsUri;
  }

  /**
   * setResultsUri.
   **/
  public void setResultsUri(String resultsUri) {
    this.resultsUri = resultsUri;
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, type, requestor, created, lastModified, status, userCount, processedUserCount, addedUserCount, updatedUserCount, closedUserCount, noActionRequiredUserCount, errorCount, warningCount, invalidColumnHeaders, importsNotFoundOrNotAvailableForAccounts, importsFailedForAccounts, importsTimedOutForAccounts, importsNotFoundOrNotAvailableForSites, importsFailedForSites, importsTimedOutForSites, fileLevelErrorRollups, userLevelErrorRollups, userLevelWarningRollups, hasCsvResults, resultsUri);
  }


  /**
   * Converts the given object to string.
   */
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

