package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.OrganizationExportResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OrganizationExportsResponse
 */

public class OrganizationExportsResponse {
  @JsonProperty("exports")
  private java.util.List<OrganizationExportResponse> exports = null;

  public OrganizationExportsResponse exports(java.util.List<OrganizationExportResponse> exports) {
    this.exports = exports;
    return this;
  }

  public OrganizationExportsResponse addExportsItem(OrganizationExportResponse exportsItem) {
    if (this.exports == null) {
      this.exports = new java.util.ArrayList<OrganizationExportResponse>();
    }
    this.exports.add(exportsItem);
    return this;
  }

   /**
   * Get exports
   * @return exports
  **/
  @ApiModelProperty(value = "")
  public java.util.List<OrganizationExportResponse> getExports() {
    return exports;
  }

  public void setExports(java.util.List<OrganizationExportResponse> exports) {
    this.exports = exports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationExportsResponse organizationExportsResponse = (OrganizationExportsResponse) o;
    return Objects.equals(this.exports, organizationExportsResponse.exports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationExportsResponse {\n");
    
    sb.append("    exports: ").append(toIndentedString(exports)).append("\n");
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

