package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.ErrorDetail;
import com.docusign.admin.model.OrganizationConnectConfigResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * OrganizationConnectConfigsResponse.
 *
 */

public class OrganizationConnectConfigsResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("configurations")
  private java.util.List<OrganizationConnectConfigResponse> configurations = null;

  @JsonProperty("totalSetSize")
  private Integer totalSetSize = null;

  @JsonProperty("errorDetail")
  private ErrorDetail errorDetail = null;


  /**
   * configurations.
   *
   * @return OrganizationConnectConfigsResponse
   **/
  public OrganizationConnectConfigsResponse configurations(java.util.List<OrganizationConnectConfigResponse> configurations) {
    this.configurations = configurations;
    return this;
  }
  
  /**
   * addConfigurationsItem.
   *
   * @return OrganizationConnectConfigsResponse
   **/
  public OrganizationConnectConfigsResponse addConfigurationsItem(OrganizationConnectConfigResponse configurationsItem) {
    if (this.configurations == null) {
      this.configurations = new java.util.ArrayList<>();
    }
    this.configurations.add(configurationsItem);
    return this;
  }

  /**
   * Get configurations.
   * @return configurations
   **/
  @Schema(description = "")
  public java.util.List<OrganizationConnectConfigResponse> getConfigurations() {
    return configurations;
  }

  /**
   * setConfigurations.
   **/
  public void setConfigurations(java.util.List<OrganizationConnectConfigResponse> configurations) {
    this.configurations = configurations;
  }


  /**
   * totalSetSize.
   *
   * @return OrganizationConnectConfigsResponse
   **/
  public OrganizationConnectConfigsResponse totalSetSize(Integer totalSetSize) {
    this.totalSetSize = totalSetSize;
    return this;
  }

  /**
   * Get totalSetSize.
   * @return totalSetSize
   **/
  @Schema(description = "")
  public Integer getTotalSetSize() {
    return totalSetSize;
  }

  /**
   * setTotalSetSize.
   **/
  public void setTotalSetSize(Integer totalSetSize) {
    this.totalSetSize = totalSetSize;
  }


  /**
   * errorDetail.
   *
   * @return OrganizationConnectConfigsResponse
   **/
  public OrganizationConnectConfigsResponse errorDetail(ErrorDetail errorDetail) {
    this.errorDetail = errorDetail;
    return this;
  }

  /**
   * Get errorDetail.
   * @return errorDetail
   **/
  @Schema(description = "")
  public ErrorDetail getErrorDetail() {
    return errorDetail;
  }

  /**
   * setErrorDetail.
   **/
  public void setErrorDetail(ErrorDetail errorDetail) {
    this.errorDetail = errorDetail;
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
    OrganizationConnectConfigsResponse organizationConnectConfigsResponse = (OrganizationConnectConfigsResponse) o;
    return Objects.equals(this.configurations, organizationConnectConfigsResponse.configurations) &&
        Objects.equals(this.totalSetSize, organizationConnectConfigsResponse.totalSetSize) &&
        Objects.equals(this.errorDetail, organizationConnectConfigsResponse.errorDetail);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(configurations, totalSetSize, errorDetail);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationConnectConfigsResponse {\n");
    
    sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
    sb.append("    totalSetSize: ").append(toIndentedString(totalSetSize)).append("\n");
    sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
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

