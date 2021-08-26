package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * OrgReportRequest
 */

public class OrgReportRequest {
  @JsonProperty("report_type")
  private String reportType = null;

  @JsonProperty("report_date_range")
  private String reportDateRange = null;

  @JsonProperty("account_ids")
  private java.util.List<java.util.UUID> accountIds = null;

  @JsonProperty("custom_start_date")
  private DateTime customStartDate = null;

  @JsonProperty("custom_end_date")
  private DateTime customEndDate = null;

  public OrgReportRequest reportType(String reportType) {
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  @ApiModelProperty(value = "")
  public String getReportType() {
    return reportType;
  }

  public void setReportType(String reportType) {
    this.reportType = reportType;
  }

  public OrgReportRequest reportDateRange(String reportDateRange) {
    this.reportDateRange = reportDateRange;
    return this;
  }

   /**
   * Get reportDateRange
   * @return reportDateRange
  **/
  @ApiModelProperty(value = "")
  public String getReportDateRange() {
    return reportDateRange;
  }

  public void setReportDateRange(String reportDateRange) {
    this.reportDateRange = reportDateRange;
  }

  public OrgReportRequest accountIds(java.util.List<java.util.UUID> accountIds) {
    this.accountIds = accountIds;
    return this;
  }

  public OrgReportRequest addAccountIdsItem(java.util.UUID accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new java.util.ArrayList<java.util.UUID>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * Get accountIds
   * @return accountIds
  **/
  @ApiModelProperty(value = "")
  public java.util.List<java.util.UUID> getAccountIds() {
    return accountIds;
  }

  public void setAccountIds(java.util.List<java.util.UUID> accountIds) {
    this.accountIds = accountIds;
  }

  public OrgReportRequest customStartDate(DateTime customStartDate) {
    this.customStartDate = customStartDate;
    return this;
  }

   /**
   * Get customStartDate
   * @return customStartDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getCustomStartDate() {
    return customStartDate;
  }

  public void setCustomStartDate(DateTime customStartDate) {
    this.customStartDate = customStartDate;
  }

  public OrgReportRequest customEndDate(DateTime customEndDate) {
    this.customEndDate = customEndDate;
    return this;
  }

   /**
   * Get customEndDate
   * @return customEndDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getCustomEndDate() {
    return customEndDate;
  }

  public void setCustomEndDate(DateTime customEndDate) {
    this.customEndDate = customEndDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgReportRequest orgReportRequest = (OrgReportRequest) o;
    return Objects.equals(this.reportType, orgReportRequest.reportType) &&
        Objects.equals(this.reportDateRange, orgReportRequest.reportDateRange) &&
        Objects.equals(this.accountIds, orgReportRequest.accountIds) &&
        Objects.equals(this.customStartDate, orgReportRequest.customStartDate) &&
        Objects.equals(this.customEndDate, orgReportRequest.customEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportType, reportDateRange, accountIds, customStartDate, customEndDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgReportRequest {\n");
    
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    reportDateRange: ").append(toIndentedString(reportDateRange)).append("\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
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

