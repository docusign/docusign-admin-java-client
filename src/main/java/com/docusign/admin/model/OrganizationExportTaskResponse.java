package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.OETRErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * OrganizationExportTaskResponse.
 *
 */

public class OrganizationExportTaskResponse implements Serializable {
  private static final long serialVersionUID = 1L;

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


  /**
   * id.
   *
   * @return OrganizationExportTaskResponse
   **/
  public OrganizationExportTaskResponse id(java.util.UUID id) {
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
   * siteId.
   *
   * @return OrganizationExportTaskResponse
   **/
  public OrganizationExportTaskResponse siteId(Integer siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * Get siteId.
   * @return siteId
   **/
  @Schema(description = "")
  public Integer getSiteId() {
    return siteId;
  }

  /**
   * setSiteId.
   **/
  public void setSiteId(Integer siteId) {
    this.siteId = siteId;
  }


  /**
   * url.
   *
   * @return OrganizationExportTaskResponse
   **/
  public OrganizationExportTaskResponse url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url.
   * @return url
   **/
  @Schema(description = "")
  public String getUrl() {
    return url;
  }

  /**
   * setUrl.
   **/
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * numberRows.
   *
   * @return OrganizationExportTaskResponse
   **/
  public OrganizationExportTaskResponse numberRows(Long numberRows) {
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
   * @return OrganizationExportTaskResponse
   **/
  public OrganizationExportTaskResponse sizeBytes(Long sizeBytes) {
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
   * errorDetails.
   *
   * @return OrganizationExportTaskResponse
   **/
  public OrganizationExportTaskResponse errorDetails(OETRErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails.
   * @return errorDetails
   **/
  @Schema(description = "")
  public OETRErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(OETRErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
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
    OrganizationExportTaskResponse organizationExportTaskResponse = (OrganizationExportTaskResponse) o;
    return Objects.equals(this.id, organizationExportTaskResponse.id) &&
        Objects.equals(this.siteId, organizationExportTaskResponse.siteId) &&
        Objects.equals(this.url, organizationExportTaskResponse.url) &&
        Objects.equals(this.numberRows, organizationExportTaskResponse.numberRows) &&
        Objects.equals(this.sizeBytes, organizationExportTaskResponse.sizeBytes) &&
        Objects.equals(this.errorDetails, organizationExportTaskResponse.errorDetails);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, siteId, url, numberRows, sizeBytes, errorDetails);
  }


  /**
   * Converts the given object to string.
   */
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

