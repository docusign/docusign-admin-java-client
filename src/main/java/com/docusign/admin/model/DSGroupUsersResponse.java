package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.DSGroupUserResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DSGroupUsersResponse
 */

public class DSGroupUsersResponse {
  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("page_size")
  private Integer pageSize = null;

  @JsonProperty("total_count")
  private Integer totalCount = null;

  @JsonProperty("users")
  private java.util.List<DSGroupUserResponse> users = null;

  public DSGroupUsersResponse page(Integer page) {
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

  public DSGroupUsersResponse pageSize(Integer pageSize) {
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

  public DSGroupUsersResponse totalCount(Integer totalCount) {
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

  public DSGroupUsersResponse users(java.util.List<DSGroupUserResponse> users) {
    this.users = users;
    return this;
  }

  public DSGroupUsersResponse addUsersItem(DSGroupUserResponse usersItem) {
    if (this.users == null) {
      this.users = new java.util.ArrayList<DSGroupUserResponse>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @ApiModelProperty(value = "")
  public java.util.List<DSGroupUserResponse> getUsers() {
    return users;
  }

  public void setUsers(java.util.List<DSGroupUserResponse> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DSGroupUsersResponse dsGroupUsersResponse = (DSGroupUsersResponse) o;
    return Objects.equals(this.page, dsGroupUsersResponse.page) &&
        Objects.equals(this.pageSize, dsGroupUsersResponse.pageSize) &&
        Objects.equals(this.totalCount, dsGroupUsersResponse.totalCount) &&
        Objects.equals(this.users, dsGroupUsersResponse.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, totalCount, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSGroupUsersResponse {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

