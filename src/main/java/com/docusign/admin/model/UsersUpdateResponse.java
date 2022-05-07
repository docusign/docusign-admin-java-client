package com.docusign.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** UsersUpdateResponse. */
public class UsersUpdateResponse {
  @JsonProperty("success")
  private Boolean success = null;

  @JsonProperty("users")
  private java.util.List<UserUpdateResponse> users = null;

  /**
   * success.
   *
   * @return UsersUpdateResponse
   */
  public UsersUpdateResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Get success.
   *
   * @return success
   */
  @ApiModelProperty(value = "")
  public Boolean isSuccess() {
    return success;
  }

  /** setSuccess. */
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  /**
   * users.
   *
   * @return UsersUpdateResponse
   */
  public UsersUpdateResponse users(java.util.List<UserUpdateResponse> users) {
    this.users = users;
    return this;
  }

  /**
   * addUsersItem.
   *
   * @return UsersUpdateResponse
   */
  public UsersUpdateResponse addUsersItem(UserUpdateResponse usersItem) {
    if (this.users == null) {
      this.users = new java.util.ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users.
   *
   * @return users
   */
  @ApiModelProperty(value = "")
  public java.util.List<UserUpdateResponse> getUsers() {
    return users;
  }

  /** setUsers. */
  public void setUsers(java.util.List<UserUpdateResponse> users) {
    this.users = users;
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
    UsersUpdateResponse usersUpdateResponse = (UsersUpdateResponse) o;
    return Objects.equals(this.success, usersUpdateResponse.success)
        && Objects.equals(this.users, usersUpdateResponse.users);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(success, users);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersUpdateResponse {\n");

    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
