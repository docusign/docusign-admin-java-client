package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * OrgReportCreateResponse.
 *
 */

public class OrgReportCreateResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("report_correlation_id")
  private java.util.UUID reportCorrelationId = null;


  /**
   * reportCorrelationId.
   *
   * @return OrgReportCreateResponse
   **/
  public OrgReportCreateResponse reportCorrelationId(java.util.UUID reportCorrelationId) {
    this.reportCorrelationId = reportCorrelationId;
    return this;
  }

  /**
   * Get reportCorrelationId.
   * @return reportCorrelationId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getReportCorrelationId() {
    return reportCorrelationId;
  }

  /**
   * setReportCorrelationId.
   **/
  public void setReportCorrelationId(java.util.UUID reportCorrelationId) {
    this.reportCorrelationId = reportCorrelationId;
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
    OrgReportCreateResponse orgReportCreateResponse = (OrgReportCreateResponse) o;
    return Objects.equals(this.reportCorrelationId, orgReportCreateResponse.reportCorrelationId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(reportCorrelationId);
  }


  /**
   * Converts the given object to string.
   */
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

