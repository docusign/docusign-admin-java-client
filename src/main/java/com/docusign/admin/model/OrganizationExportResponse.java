package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.OrgExportSelectedAccount;
import com.docusign.admin.model.OrgExportSelectedDomain;
import com.docusign.admin.model.OrganizationExportRequestorResponse;
import com.docusign.admin.model.OrganizationExportTaskResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * OrganizationExportResponse.
 *
 */

public class OrganizationExportResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("requestor")
  private OrganizationExportRequestorResponse requestor = null;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("last_modified")
  private String lastModified = null;

  @JsonProperty("completed")
  private String completed = null;

  @JsonProperty("expires")
  private String expires = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("selected_accounts")
  private java.util.List<OrgExportSelectedAccount> selectedAccounts = null;

  @JsonProperty("selected_domains")
  private java.util.List<OrgExportSelectedDomain> selectedDomains = null;

  @JsonProperty("metadata_url")
  private String metadataUrl = null;

  @JsonProperty("percent_completed")
  private Integer percentCompleted = null;

  @JsonProperty("number_rows")
  private Long numberRows = null;

  @JsonProperty("size_bytes")
  private Long sizeBytes = null;

  @JsonProperty("results")
  private java.util.List<OrganizationExportTaskResponse> results = null;

  @JsonProperty("success")
  private Boolean success = null;


  /**
   * id.
   *
   * @return OrganizationExportResponse
   **/
  public OrganizationExportResponse id(java.util.UUID id) {
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
   * @return OrganizationExportResponse
   **/
  public OrganizationExportResponse type(String type) {
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
   * @return OrganizationExportResponse
   **/
  public OrganizationExportResponse requestor(OrganizationExportRequestorResponse requestor) {
    this.requestor = requestor;
    return this;
  }

  /**
   * Get requestor.
   * @return requestor
   **/
  @Schema(description = "")
  public OrganizationExportRequestorResponse getRequestor() {
    return requestor;
  }

  /**
   * setRequestor.
   **/
  public void setRequestor(OrganizationExportRequestorResponse requestor) {
    this.requestor = requestor;
  }


  /**
   * created.
   *
   * @return OrganizationExportResponse
   **/
  public OrganizationExportResponse created(String created) {
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
   * @return OrganizationExportResponse
   **/
  public OrganizationExportResponse lastModified(String lastModified) {
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
   * @return OrganizationExportResponse
   **/
  public OrganizationExportResponse completed(String completed) {
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
   * @return OrganizationExportResponse
   **/
  public OrganizationExportResponse expires(String expires) {
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
   * status.
   *
   * @return OrganizationExportResponse
   **/
  public OrganizationExportResponse status(String status) {
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
   * selectedAccounts.
   *
   * @return OrganizationExportResponse
   **/
  public OrganizationExportResponse selectedAccounts(java.util.List<OrgExportSelectedAccount> selectedAccounts) {
    this.selectedAccounts = selectedAccounts;
    return this;
  }
  
  /**
   * addSelectedAccountsItem.
   *
   * @return OrganizationExportResponse
   **/
  public OrganizationExportResponse addSelectedAccountsItem(OrgExportSelectedAccount selectedAccountsItem) {
    if (this.selectedAccounts == null) {
      this.selectedAccounts = new java.util.ArrayList<>();
    }
    this.selectedAccounts.add(selectedAccountsItem);
    return this;
  }

  /**
   * Get selectedAccounts.
   * @return selectedAccounts
   **/
  @Schema(description = "")
  public java.util.List<OrgExportSelectedAccount> getSelectedAccounts() {
    return selectedAccounts;
  }

  /**
   * setSelectedAccounts.
   **/
  public void setSelectedAccounts(java.util.List<OrgExportSelectedAccount> selectedAccounts) {
    this.selectedAccounts = selectedAccounts;
  }


  /**
   * selectedDomains.
   *
   * @return OrganizationExportResponse
   **/
  public OrganizationExportResponse selectedDomains(java.util.List<OrgExportSelectedDomain> selectedDomains) {
    this.selectedDomains = selectedDomains;
    return this;
  }
  
  /**
   * addSelectedDomainsItem.
   *
   * @return OrganizationExportResponse
   **/
  public OrganizationExportResponse addSelectedDomainsItem(OrgExportSelectedDomain selectedDomainsItem) {
    if (this.selectedDomains == null) {
      this.selectedDomains = new java.util.ArrayList<>();
    }
    this.selectedDomains.add(selectedDomainsItem);
    return this;
  }

  /**
   * Get selectedDomains.
   * @return selectedDomains
   **/
  @Schema(description = "")
  public java.util.List<OrgExportSelectedDomain> getSelectedDomains() {
    return selectedDomains;
  }

  /**
   * setSelectedDomains.
   **/
  public void setSelectedDomains(java.util.List<OrgExportSelectedDomain> selectedDomains) {
    this.selectedDomains = selectedDomains;
  }


  /**
   * metadataUrl.
   *
   * @return OrganizationExportResponse
   **/
  public OrganizationExportResponse metadataUrl(String metadataUrl) {
    this.metadataUrl = metadataUrl;
    return this;
  }

  /**
   * Get metadataUrl.
   * @return metadataUrl
   **/
  @Schema(description = "")
  public String getMetadataUrl() {
    return metadataUrl;
  }

  /**
   * setMetadataUrl.
   **/
  public void setMetadataUrl(String metadataUrl) {
    this.metadataUrl = metadataUrl;
  }


  /**
   * percentCompleted.
   *
   * @return OrganizationExportResponse
   **/
  public OrganizationExportResponse percentCompleted(Integer percentCompleted) {
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
   * numberRows.
   *
   * @return OrganizationExportResponse
   **/
  public OrganizationExportResponse numberRows(Long numberRows) {
    this.numberRows = numberRows;
    return this;
  }

  /**
   * Get numberRows.
   * @return numberRows
   **/
  @Schema(description = "")
  public Long getNumberRows() {
    return numberRows;
  }

  /**
   * setNumberRows.
   **/
  public void setNumberRows(Long numberRows) {
    this.numberRows = numberRows;
  }


  /**
   * sizeBytes.
   *
   * @return OrganizationExportResponse
   **/
  public OrganizationExportResponse sizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

  /**
   * Get sizeBytes.
   * @return sizeBytes
   **/
  @Schema(description = "")
  public Long getSizeBytes() {
    return sizeBytes;
  }

  /**
   * setSizeBytes.
   **/
  public void setSizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
  }


  /**
   * results.
   *
   * @return OrganizationExportResponse
   **/
  public OrganizationExportResponse results(java.util.List<OrganizationExportTaskResponse> results) {
    this.results = results;
    return this;
  }
  
  /**
   * addResultsItem.
   *
   * @return OrganizationExportResponse
   **/
  public OrganizationExportResponse addResultsItem(OrganizationExportTaskResponse resultsItem) {
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
  public java.util.List<OrganizationExportTaskResponse> getResults() {
    return results;
  }

  /**
   * setResults.
   **/
  public void setResults(java.util.List<OrganizationExportTaskResponse> results) {
    this.results = results;
  }


  /**
   * success.
   *
   * @return OrganizationExportResponse
   **/
  public OrganizationExportResponse success(Boolean success) {
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
    OrganizationExportResponse organizationExportResponse = (OrganizationExportResponse) o;
    return Objects.equals(this.id, organizationExportResponse.id) &&
        Objects.equals(this.type, organizationExportResponse.type) &&
        Objects.equals(this.requestor, organizationExportResponse.requestor) &&
        Objects.equals(this.created, organizationExportResponse.created) &&
        Objects.equals(this.lastModified, organizationExportResponse.lastModified) &&
        Objects.equals(this.completed, organizationExportResponse.completed) &&
        Objects.equals(this.expires, organizationExportResponse.expires) &&
        Objects.equals(this.status, organizationExportResponse.status) &&
        Objects.equals(this.selectedAccounts, organizationExportResponse.selectedAccounts) &&
        Objects.equals(this.selectedDomains, organizationExportResponse.selectedDomains) &&
        Objects.equals(this.metadataUrl, organizationExportResponse.metadataUrl) &&
        Objects.equals(this.percentCompleted, organizationExportResponse.percentCompleted) &&
        Objects.equals(this.numberRows, organizationExportResponse.numberRows) &&
        Objects.equals(this.sizeBytes, organizationExportResponse.sizeBytes) &&
        Objects.equals(this.results, organizationExportResponse.results) &&
        Objects.equals(this.success, organizationExportResponse.success);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, type, requestor, created, lastModified, completed, expires, status, selectedAccounts, selectedDomains, metadataUrl, percentCompleted, numberRows, sizeBytes, results, success);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationExportResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    requestor: ").append(toIndentedString(requestor)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    selectedAccounts: ").append(toIndentedString(selectedAccounts)).append("\n");
    sb.append("    selectedDomains: ").append(toIndentedString(selectedDomains)).append("\n");
    sb.append("    metadataUrl: ").append(toIndentedString(metadataUrl)).append("\n");
    sb.append("    percentCompleted: ").append(toIndentedString(percentCompleted)).append("\n");
    sb.append("    numberRows: ").append(toIndentedString(numberRows)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

