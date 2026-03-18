package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.UpdateUserRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * UpdateUsersRequest.
 *
 */

public class UpdateUsersRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("users")
  private java.util.List<UpdateUserRequest> users = null;

  @JsonProperty("auto_activate_memberships_on_reactivation")
  private Boolean autoActivateMembershipsOnReactivation = null;


  /**
   * users.
   *
   * @return UpdateUsersRequest
   **/
  public UpdateUsersRequest users(java.util.List<UpdateUserRequest> users) {
    this.users = users;
    return this;
  }
  
  /**
   * addUsersItem.
   *
   * @return UpdateUsersRequest
   **/
  public UpdateUsersRequest addUsersItem(UpdateUserRequest usersItem) {
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
  public java.util.List<UpdateUserRequest> getUsers() {
    return users;
  }

  /**
   * setUsers.
   **/
  public void setUsers(java.util.List<UpdateUserRequest> users) {
    this.users = users;
  }


  /**
   * autoActivateMembershipsOnReactivation.
   *
   * @return UpdateUsersRequest
   **/
  public UpdateUsersRequest autoActivateMembershipsOnReactivation(Boolean autoActivateMembershipsOnReactivation) {
    this.autoActivateMembershipsOnReactivation = autoActivateMembershipsOnReactivation;
    return this;
  }

  /**
   * When set to **true**, the user's memberships will be automatically activated on reactivation..
   * @return autoActivateMembershipsOnReactivation
   **/
  @Schema(description = "When set to **true**, the user's memberships will be automatically activated on reactivation.")
  public Boolean isAutoActivateMembershipsOnReactivation() {
    return autoActivateMembershipsOnReactivation;
  }

  /**
   * setAutoActivateMembershipsOnReactivation.
   **/
  public void setAutoActivateMembershipsOnReactivation(Boolean autoActivateMembershipsOnReactivation) {
    this.autoActivateMembershipsOnReactivation = autoActivateMembershipsOnReactivation;
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
    UpdateUsersRequest updateUsersRequest = (UpdateUsersRequest) o;
    return Objects.equals(this.users, updateUsersRequest.users) &&
        Objects.equals(this.autoActivateMembershipsOnReactivation, updateUsersRequest.autoActivateMembershipsOnReactivation);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(users, autoActivateMembershipsOnReactivation);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUsersRequest {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    autoActivateMembershipsOnReactivation: ").append(toIndentedString(autoActivateMembershipsOnReactivation)).append("\n");
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

