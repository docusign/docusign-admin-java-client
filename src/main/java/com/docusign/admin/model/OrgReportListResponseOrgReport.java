package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.OrgReportListResponseRequestor;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;

/**
 * OrgReportListResponseOrgReport.
 *
 */

public class OrgReportListResponseOrgReport {
  @JsonProperty("complete")
  private Boolean complete = null;

  @JsonProperty("report_correlation_id")
  private java.util.UUID reportCorrelationId = null;

  @JsonProperty("site_id")
  private Integer siteId = null;

  @JsonProperty("report_id")
  private java.util.UUID reportId = null;

  @JsonProperty("requestor")
  private OrgReportListResponseRequestor requestor = null;

  @JsonProperty("created_on")
  private String createdOn = null;

  @JsonProperty("account_export_count")
  private Integer accountExportCount = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("report_type_id")
  private String reportTypeId = null;

  @JsonProperty("report_date_range")
  private String reportDateRange = null;

  @JsonProperty("custom_start_date")
  private String customStartDate = null;

  @JsonProperty("custom_end_date")
  private String customEndDate = null;


  /**
   * complete.
   *
   * @return OrgReportListResponseOrgReport
   **/
  public OrgReportListResponseOrgReport complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

  /**
   * Get complete.
   * @return complete
   **/
  @Schema(description = "")
  public Boolean isComplete() {
    return complete;
  }

  /**
   * setComplete.
   **/
  public void setComplete(Boolean complete) {
    this.complete = complete;
  }


  /**
   * reportCorrelationId.
   *
   * @return OrgReportListResponseOrgReport
   **/
  public OrgReportListResponseOrgReport reportCorrelationId(java.util.UUID reportCorrelationId) {
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
   * siteId.
   *
   * @return OrgReportListResponseOrgReport
   **/
  public OrgReportListResponseOrgReport siteId(Integer siteId) {
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
   * reportId.
   *
   * @return OrgReportListResponseOrgReport
   **/
  public OrgReportListResponseOrgReport reportId(java.util.UUID reportId) {
    this.reportId = reportId;
    return this;
  }

  /**
   * Get reportId.
   * @return reportId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getReportId() {
    return reportId;
  }

  /**
   * setReportId.
   **/
  public void setReportId(java.util.UUID reportId) {
    this.reportId = reportId;
  }


  /**
   * requestor.
   *
   * @return OrgReportListResponseOrgReport
   **/
  public OrgReportListResponseOrgReport requestor(OrgReportListResponseRequestor requestor) {
    this.requestor = requestor;
    return this;
  }

  /**
   * Get requestor.
   * @return requestor
   **/
  @Schema(description = "")
  public OrgReportListResponseRequestor getRequestor() {
    return requestor;
  }

  /**
   * setRequestor.
   **/
  public void setRequestor(OrgReportListResponseRequestor requestor) {
    this.requestor = requestor;
  }


  /**
   * createdOn.
   *
   * @return OrgReportListResponseOrgReport
   **/
  public OrgReportListResponseOrgReport createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * Get createdOn.
   * @return createdOn
   **/
  @Schema(description = "")
  public String getCreatedOn() {
    return createdOn;
  }

  /**
   * setCreatedOn.
   **/
  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }


  /**
   * accountExportCount.
   *
   * @return OrgReportListResponseOrgReport
   **/
  public OrgReportListResponseOrgReport accountExportCount(Integer accountExportCount) {
    this.accountExportCount = accountExportCount;
    return this;
  }

  /**
   * Get accountExportCount.
   * @return accountExportCount
   **/
  @Schema(description = "")
  public Integer getAccountExportCount() {
    return accountExportCount;
  }

  /**
   * setAccountExportCount.
   **/
  public void setAccountExportCount(Integer accountExportCount) {
    this.accountExportCount = accountExportCount;
  }


  /**
   * url.
   *
   * @return OrgReportListResponseOrgReport
   **/
  public OrgReportListResponseOrgReport url(String url) {
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
   * reportTypeId.
   *
   * @return OrgReportListResponseOrgReport
   **/
  public OrgReportListResponseOrgReport reportTypeId(String reportTypeId) {
    this.reportTypeId = reportTypeId;
    return this;
  }

  /**
   * Get reportTypeId.
   * @return reportTypeId
   **/
  @Schema(description = "")
  public String getReportTypeId() {
    return reportTypeId;
  }

  /**
   * setReportTypeId.
   **/
  public void setReportTypeId(String reportTypeId) {
    this.reportTypeId = reportTypeId;
  }


  /**
   * reportDateRange.
   *
   * @return OrgReportListResponseOrgReport
   **/
  public OrgReportListResponseOrgReport reportDateRange(String reportDateRange) {
    this.reportDateRange = reportDateRange;
    return this;
  }

  /**
   * Get reportDateRange.
   * @return reportDateRange
   **/
  @Schema(description = "")
  public String getReportDateRange() {
    return reportDateRange;
  }

  /**
   * setReportDateRange.
   **/
  public void setReportDateRange(String reportDateRange) {
    this.reportDateRange = reportDateRange;
  }


  /**
   * customStartDate.
   *
   * @return OrgReportListResponseOrgReport
   **/
  public OrgReportListResponseOrgReport customStartDate(String customStartDate) {
    this.customStartDate = customStartDate;
    return this;
  }

  /**
   * Get customStartDate.
   * @return customStartDate
   **/
  @Schema(description = "")
  public String getCustomStartDate() {
    return customStartDate;
  }

  /**
   * setCustomStartDate.
   **/
  public void setCustomStartDate(String customStartDate) {
    this.customStartDate = customStartDate;
  }


  /**
   * customEndDate.
   *
   * @return OrgReportListResponseOrgReport
   **/
  public OrgReportListResponseOrgReport customEndDate(String customEndDate) {
    this.customEndDate = customEndDate;
    return this;
  }

  /**
   * Get customEndDate.
   * @return customEndDate
   **/
  @Schema(description = "")
  public String getCustomEndDate() {
    return customEndDate;
  }

  /**
   * setCustomEndDate.
   **/
  public void setCustomEndDate(String customEndDate) {
    this.customEndDate = customEndDate;
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
    OrgReportListResponseOrgReport orgReportListResponseOrgReport = (OrgReportListResponseOrgReport) o;
    return Objects.equals(this.complete, orgReportListResponseOrgReport.complete) &&
        Objects.equals(this.reportCorrelationId, orgReportListResponseOrgReport.reportCorrelationId) &&
        Objects.equals(this.siteId, orgReportListResponseOrgReport.siteId) &&
        Objects.equals(this.reportId, orgReportListResponseOrgReport.reportId) &&
        Objects.equals(this.requestor, orgReportListResponseOrgReport.requestor) &&
        Objects.equals(this.createdOn, orgReportListResponseOrgReport.createdOn) &&
        Objects.equals(this.accountExportCount, orgReportListResponseOrgReport.accountExportCount) &&
        Objects.equals(this.url, orgReportListResponseOrgReport.url) &&
        Objects.equals(this.reportTypeId, orgReportListResponseOrgReport.reportTypeId) &&
        Objects.equals(this.reportDateRange, orgReportListResponseOrgReport.reportDateRange) &&
        Objects.equals(this.customStartDate, orgReportListResponseOrgReport.customStartDate) &&
        Objects.equals(this.customEndDate, orgReportListResponseOrgReport.customEndDate);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(complete, reportCorrelationId, siteId, reportId, requestor, createdOn, accountExportCount, url, reportTypeId, reportDateRange, customStartDate, customEndDate);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgReportListResponseOrgReport {\n");
    
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    reportCorrelationId: ").append(toIndentedString(reportCorrelationId)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    requestor: ").append(toIndentedString(requestor)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    accountExportCount: ").append(toIndentedString(accountExportCount)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    reportTypeId: ").append(toIndentedString(reportTypeId)).append("\n");
    sb.append("    reportDateRange: ").append(toIndentedString(reportDateRange)).append("\n");
    sb.append("    customStartDate: ").append(toIndentedString(customStartDate)).append("\n");
    sb.append("    customEndDate: ").append(toIndentedString(customEndDate)).append("\n");
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

