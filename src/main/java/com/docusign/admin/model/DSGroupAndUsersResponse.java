package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.DSGroupResponse;
import com.docusign.admin.model.DSGroupUsersResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * DSGroupAndUsersResponse.
 *
 */

public class DSGroupAndUsersResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("group")
  private DSGroupResponse group = null;

  @JsonProperty("group_users")
  private DSGroupUsersResponse groupUsers = null;


  /**
   * group.
   *
   * @return DSGroupAndUsersResponse
   **/
  public DSGroupAndUsersResponse group(DSGroupResponse group) {
    this.group = group;
    return this;
  }

  /**
   * Get group.
   * @return group
   **/
  @Schema(description = "")
  public DSGroupResponse getGroup() {
    return group;
  }

  /**
   * setGroup.
   **/
  public void setGroup(DSGroupResponse group) {
    this.group = group;
  }


  /**
   * groupUsers.
   *
   * @return DSGroupAndUsersResponse
   **/
  public DSGroupAndUsersResponse groupUsers(DSGroupUsersResponse groupUsers) {
    this.groupUsers = groupUsers;
    return this;
  }

  /**
   * Get groupUsers.
   * @return groupUsers
   **/
  @Schema(description = "")
  public DSGroupUsersResponse getGroupUsers() {
    return groupUsers;
  }

  /**
   * setGroupUsers.
   **/
  public void setGroupUsers(DSGroupUsersResponse groupUsers) {
    this.groupUsers = groupUsers;
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
    DSGroupAndUsersResponse dsGroupAndUsersResponse = (DSGroupAndUsersResponse) o;
    return Objects.equals(this.group, dsGroupAndUsersResponse.group) &&
        Objects.equals(this.groupUsers, dsGroupAndUsersResponse.groupUsers);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(group, groupUsers);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSGroupAndUsersResponse {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    groupUsers: ").append(toIndentedString(groupUsers)).append("\n");
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

