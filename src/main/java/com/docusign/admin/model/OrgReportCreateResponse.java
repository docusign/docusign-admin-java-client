package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OrgReportCreateResponse
 */

public class OrgReportCreateResponse {
  @JsonProperty("report_correlation_id")
  private java.util.UUID reportCorrelationId = null;

  public OrgReportCreateResponse reportCorrelationId(java.util.UUID reportCorrelationId) {
    this.reportCorrelationId = reportCorrelationId;
    return this;
  }

   /**
   * Get reportCorrelationId
   * @return reportCorrelationId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getReportCorrelationId() {
    return reportCorrelationId;
  }

  public void setReportCorrelationId(java.util.UUID reportCorrelationId) {
    this.reportCorrelationId = reportCorrelationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgReportCreateResponse orgReportCreateResponse = (OrgReportCreateResponse) o;
    return Objects.equals(this.reportCorrelationId, orgReportCreateResponse.reportCorrelationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportCorrelationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgReportCreateResponse {\n");
    
    sb.append("    reportCorrelationId: ").append(toIndentedString(reportCorrelationId)).append("\n");
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

