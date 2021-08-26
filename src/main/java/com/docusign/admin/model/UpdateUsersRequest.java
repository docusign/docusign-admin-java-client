package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.UpdateUserRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UpdateUsersRequest
 */

public class UpdateUsersRequest {
  @JsonProperty("users")
  private java.util.List<UpdateUserRequest> users = null;

  public UpdateUsersRequest users(java.util.List<UpdateUserRequest> users) {
    this.users = users;
    return this;
  }

  public UpdateUsersRequest addUsersItem(UpdateUserRequest usersItem) {
    if (this.users == null) {
      this.users = new java.util.ArrayList<UpdateUserRequest>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @ApiModelProperty(value = "")
  public java.util.List<UpdateUserRequest> getUsers() {
    return users;
  }

  public void setUsers(java.util.List<UpdateUserRequest> users) {
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
    UpdateUsersRequest updateUsersRequest = (UpdateUsersRequest) o;
    return Objects.equals(this.users, updateUsersRequest.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUsersRequest {\n");
    
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

