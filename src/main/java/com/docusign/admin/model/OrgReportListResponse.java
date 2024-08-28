package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.OrgReportListResponseOrgReport;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * OrgReportListResponse.
 *
 */

public class OrgReportListResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("reports")
  private java.util.List<OrgReportListResponseOrgReport> reports = null;


  /**
   * reports.
   *
   * @return OrgReportListResponse
   **/
  public OrgReportListResponse reports(java.util.List<OrgReportListResponseOrgReport> reports) {
    this.reports = reports;
    return this;
  }
  
  /**
   * addReportsItem.
   *
   * @return OrgReportListResponse
   **/
  public OrgReportListResponse addReportsItem(OrgReportListResponseOrgReport reportsItem) {
    if (this.reports == null) {
      this.reports = new java.util.ArrayList<>();
    }
    this.reports.add(reportsItem);
    return this;
  }

  /**
   * Get reports.
   * @return reports
   **/
  @Schema(description = "")
  public java.util.List<OrgReportListResponseOrgReport> getReports() {
    return reports;
  }

  /**
   * setReports.
   **/
  public void setReports(java.util.List<OrgReportListResponseOrgReport> reports) {
    this.reports = reports;
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
    OrgReportListResponse orgReportListResponse = (OrgReportListResponse) o;
    return Objects.equals(this.reports, orgReportListResponse.reports);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(reports);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgReportListResponse {\n");
    
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
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

