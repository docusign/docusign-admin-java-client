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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * OrganizationExportResponse
 */

public class OrganizationExportResponse {
  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("requestor")
  private OrganizationExportRequestorResponse requestor = null;

  @JsonProperty("created")
  private DateTime created = null;

  @JsonProperty("last_modified")
  private DateTime lastModified = null;

  @JsonProperty("completed")
  private DateTime completed = null;

  @JsonProperty("expires")
  private DateTime expires = null;

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

  public OrganizationExportResponse id(java.util.UUID id) {
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

  public OrganizationExportResponse type(String type) {
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

  public OrganizationExportResponse requestor(OrganizationExportRequestorResponse requestor) {
    this.requestor = requestor;
    return this;
  }

   /**
   * Get requestor
   * @return requestor
  **/
  @ApiModelProperty(value = "")
  public OrganizationExportRequestorResponse getRequestor() {
    return requestor;
  }

  public void setRequestor(OrganizationExportRequestorResponse requestor) {
    this.requestor = requestor;
  }

  public OrganizationExportResponse created(DateTime created) {
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

  public OrganizationExportResponse lastModified(DateTime lastModified) {
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

  public OrganizationExportResponse completed(DateTime completed) {
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

  public OrganizationExportResponse expires(DateTime expires) {
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

  public OrganizationExportResponse status(String status) {
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

  public OrganizationExportResponse selectedAccounts(java.util.List<OrgExportSelectedAccount> selectedAccounts) {
    this.selectedAccounts = selectedAccounts;
    return this;
  }

  public OrganizationExportResponse addSelectedAccountsItem(OrgExportSelectedAccount selectedAccountsItem) {
    if (this.selectedAccounts == null) {
      this.selectedAccounts = new java.util.ArrayList<OrgExportSelectedAccount>();
    }
    this.selectedAccounts.add(selectedAccountsItem);
    return this;
  }

   /**
   * Get selectedAccounts
   * @return selectedAccounts
  **/
  @ApiModelProperty(value = "")
  public java.util.List<OrgExportSelectedAccount> getSelectedAccounts() {
    return selectedAccounts;
  }

  public void setSelectedAccounts(java.util.List<OrgExportSelectedAccount> selectedAccounts) {
    this.selectedAccounts = selectedAccounts;
  }

  public OrganizationExportResponse selectedDomains(java.util.List<OrgExportSelectedDomain> selectedDomains) {
    this.selectedDomains = selectedDomains;
    return this;
  }

  public OrganizationExportResponse addSelectedDomainsItem(OrgExportSelectedDomain selectedDomainsItem) {
    if (this.selectedDomains == null) {
      this.selectedDomains = new java.util.ArrayList<OrgExportSelectedDomain>();
    }
    this.selectedDomains.add(selectedDomainsItem);
    return this;
  }

   /**
   * Get selectedDomains
   * @return selectedDomains
  **/
  @ApiModelProperty(value = "")
  public java.util.List<OrgExportSelectedDomain> getSelectedDomains() {
    return selectedDomains;
  }

  public void setSelectedDomains(java.util.List<OrgExportSelectedDomain> selectedDomains) {
    this.selectedDomains = selectedDomains;
  }

  public OrganizationExportResponse metadataUrl(String metadataUrl) {
    this.metadataUrl = metadataUrl;
    return this;
  }

   /**
   * Get metadataUrl
   * @return metadataUrl
  **/
  @ApiModelProperty(value = "")
  public String getMetadataUrl() {
    return metadataUrl;
  }

  public void setMetadataUrl(String metadataUrl) {
    this.metadataUrl = metadataUrl;
  }

  public OrganizationExportResponse percentCompleted(Integer percentCompleted) {
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

  public OrganizationExportResponse numberRows(Long numberRows) {
    this.numberRows = numberRows;
    return this;
  }

   /**
   * Get numberRows
   * @return numberRows
  **/
  @ApiModelProperty(value = "")
  public Long getNumberRows() {
    return numberRows;
  }

  public void setNumberRows(Long numberRows) {
    this.numberRows = numberRows;
  }

  public OrganizationExportResponse sizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

   /**
   * Get sizeBytes
   * @return sizeBytes
  **/
  @ApiModelProperty(value = "")
  public Long getSizeBytes() {
    return sizeBytes;
  }

  public void setSizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
  }

  public OrganizationExportResponse results(java.util.List<OrganizationExportTaskResponse> results) {
    this.results = results;
    return this;
  }

  public OrganizationExportResponse addResultsItem(OrganizationExportTaskResponse resultsItem) {
    if (this.results == null) {
      this.results = new java.util.ArrayList<OrganizationExportTaskResponse>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")
  public java.util.List<OrganizationExportTaskResponse> getResults() {
    return results;
  }

  public void setResults(java.util.List<OrganizationExportTaskResponse> results) {
    this.results = results;
  }

  public OrganizationExportResponse success(Boolean success) {
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

  @Override
  public int hashCode() {
    return Objects.hash(id, type, requestor, created, lastModified, completed, expires, status, selectedAccounts, selectedDomains, metadataUrl, percentCompleted, numberRows, sizeBytes, results, success);
  }


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

