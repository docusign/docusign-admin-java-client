package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.OrganizationUserResponse;
import com.docusign.admin.model.PagingResponseProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OrganizationUsersResponse
 */

public class OrganizationUsersResponse {
  @JsonProperty("users")
  private java.util.List<OrganizationUserResponse> users = null;

  @JsonProperty("paging")
  private PagingResponseProperties paging = null;

  public OrganizationUsersResponse users(java.util.List<OrganizationUserResponse> users) {
    this.users = users;
    return this;
  }

  public OrganizationUsersResponse addUsersItem(OrganizationUserResponse usersItem) {
    if (this.users == null) {
      this.users = new java.util.ArrayList<OrganizationUserResponse>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @ApiModelProperty(value = "")
  public java.util.List<OrganizationUserResponse> getUsers() {
    return users;
  }

  public void setUsers(java.util.List<OrganizationUserResponse> users) {
    this.users = users;
  }

  public OrganizationUsersResponse paging(PagingResponseProperties paging) {
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
  @ApiModelProperty(value = "")
  public PagingResponseProperties getPaging() {
    return paging;
  }

  public void setPaging(PagingResponseProperties paging) {
    this.paging = paging;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationUsersResponse organizationUsersResponse = (OrganizationUsersResponse) o;
    return Objects.equals(this.users, organizationUsersResponse.users) &&
        Objects.equals(this.paging, organizationUsersResponse.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, paging);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationUsersResponse {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

