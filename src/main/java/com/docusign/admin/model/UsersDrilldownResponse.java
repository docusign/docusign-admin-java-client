package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.UserDrilldownResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * UsersDrilldownResponse.
 *
 */

public class UsersDrilldownResponse {
  @JsonProperty("users")
  private java.util.List<UserDrilldownResponse> users = null;


  /**
   * users.
   *
   * @return UsersDrilldownResponse
   **/
  public UsersDrilldownResponse users(java.util.List<UserDrilldownResponse> users) {
    this.users = users;
    return this;
  }
  
  /**
   * addUsersItem.
   *
   * @return UsersDrilldownResponse
   **/
  public UsersDrilldownResponse addUsersItem(UserDrilldownResponse usersItem) {
    if (this.users == null) {
      this.users = new java.util.ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users.
   * @return users
   **/
  @Schema(description = "")
  public java.util.List<UserDrilldownResponse> getUsers() {
    return users;
  }

  /**
   * setUsers.
   **/
  public void setUsers(java.util.List<UserDrilldownResponse> users) {
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
    UsersDrilldownResponse usersDrilldownResponse = (UsersDrilldownResponse) o;
    return Objects.equals(this.users, usersDrilldownResponse.users);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(users);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersDrilldownResponse {\n");
    
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

