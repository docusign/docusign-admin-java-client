package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.DSGroupResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * DSGroupListResponse.
 *
 */

public class DSGroupListResponse implements Serializable {
  private static final long serialVersionUID = 1L;

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


  /**
   * page.
   *
   * @return DSGroupListResponse
   **/
  public DSGroupListResponse page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page.
   * @return page
   **/
  @Schema(description = "")
  public Integer getPage() {
    return page;
  }

  /**
   * setPage.
   **/
  public void setPage(Integer page) {
    this.page = page;
  }


  /**
   * pageSize.
   *
   * @return DSGroupListResponse
   **/
  public DSGroupListResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize.
   * @return pageSize
   **/
  @Schema(description = "")
  public Integer getPageSize() {
    return pageSize;
  }

  /**
   * setPageSize.
   **/
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  /**
   * totalCount.
   *
   * @return DSGroupListResponse
   **/
  public DSGroupListResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Get totalCount.
   * @return totalCount
   **/
  @Schema(description = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  /**
   * setTotalCount.
   **/
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  /**
   * accountId.
   *
   * @return DSGroupListResponse
   **/
  public DSGroupListResponse accountId(java.util.UUID accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId.
   * @return accountId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getAccountId() {
    return accountId;
  }

  /**
   * setAccountId.
   **/
  public void setAccountId(java.util.UUID accountId) {
    this.accountId = accountId;
  }

  /**
   * Get dsGroups.
   * @return dsGroups
   **/
  @Schema(description = "")
  public java.util.List<DSGroupResponse> getDsGroups() {
    return dsGroups;
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
    DSGroupListResponse dsGroupListResponse = (DSGroupListResponse) o;
    return Objects.equals(this.page, dsGroupListResponse.page) &&
        Objects.equals(this.pageSize, dsGroupListResponse.pageSize) &&
        Objects.equals(this.totalCount, dsGroupListResponse.totalCount) &&
        Objects.equals(this.accountId, dsGroupListResponse.accountId) &&
        Objects.equals(this.dsGroups, dsGroupListResponse.dsGroups);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, totalCount, accountId, dsGroups);
  }


  /**
   * Converts the given object to string.
   */
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

