package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.DSGroupResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DSGroupListResponse
 */

public class DSGroupListResponse {
  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("page_size")
  private Integer pageSize = null;

  @JsonProperty("total_count")
  private Integer totalCount = null;

  @JsonProperty("account_id")
  private java.util.UUID accountId = null;

  @JsonProperty("ds_groups")
  private java.util.List<DSGroupResponse> dsGroups = null;

  public DSGroupListResponse page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public DSGroupListResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @ApiModelProperty(value = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DSGroupListResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public DSGroupListResponse accountId(java.util.UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(java.util.UUID accountId) {
    this.accountId = accountId;
  }

   /**
   * Get dsGroups
   * @return dsGroups
  **/
  @ApiModelProperty(value = "")
  public java.util.List<DSGroupResponse> getDsGroups() {
    return dsGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DSGroupListResponse dsGroupListResponse = (DSGroupListResponse) o;
    return Objects.equals(this.page, dsGroupListResponse.page) &&
        Objects.equals(this.pageSize, dsGroupListResponse.pageSize) &&
        Objects.equals(this.totalCount, dsGroupListResponse.totalCount) &&
        Objects.equals(this.accountId, dsGroupListResponse.accountId) &&
        Objects.equals(this.dsGroups, dsGroupListResponse.dsGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, totalCount, accountId, dsGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSGroupListResponse {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    dsGroups: ").append(toIndentedString(dsGroups)).append("\n");
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

