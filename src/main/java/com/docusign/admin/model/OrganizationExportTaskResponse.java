package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.OETRErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OrganizationExportTaskResponse
 */

public class OrganizationExportTaskResponse {
  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("site_id")
  private Integer siteId = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("number_rows")
  private Long numberRows = null;

  @JsonProperty("size_bytes")
  private Long sizeBytes = null;

  @JsonProperty("error_details")
  private OETRErrorDetails errorDetails = null;

  public OrganizationExportTaskResponse id(java.util.UUID id) {
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

  public OrganizationExportTaskResponse siteId(Integer siteId) {
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

  public OrganizationExportTaskResponse url(String url) {
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

  public OrganizationExportTaskResponse numberRows(Long numberRows) {
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

  public OrganizationExportTaskResponse sizeBytes(Long sizeBytes) {
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

  public OrganizationExportTaskResponse errorDetails(OETRErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(value = "")
  public OETRErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(OETRErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationExportTaskResponse organizationExportTaskResponse = (OrganizationExportTaskResponse) o;
    return Objects.equals(this.id, organizationExportTaskResponse.id) &&
        Objects.equals(this.siteId, organizationExportTaskResponse.siteId) &&
        Objects.equals(this.url, organizationExportTaskResponse.url) &&
        Objects.equals(this.numberRows, organizationExportTaskResponse.numberRows) &&
        Objects.equals(this.sizeBytes, organizationExportTaskResponse.sizeBytes) &&
        Objects.equals(this.errorDetails, organizationExportTaskResponse.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, siteId, url, numberRows, sizeBytes, errorDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationExportTaskResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    numberRows: ").append(toIndentedString(numberRows)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

