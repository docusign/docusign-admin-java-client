package com.docusign.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** DSGroupAndUsersResponse. */
public class DSGroupAndUsersResponse {
  @JsonProperty("group")
  private DSGroupResponse group = null;

  @JsonProperty("group_users")
  private DSGroupUsersResponse groupUsers = null;

  /**
   * group.
   *
   * @return DSGroupAndUsersResponse
   */
  public DSGroupAndUsersResponse group(DSGroupResponse group) {
    this.group = group;
    return this;
  }

  /**
   * Get group.
   *
   * @return group
   */
  @ApiModelProperty(value = "")
  public DSGroupResponse getGroup() {
    return group;
  }

  /** setGroup. */
  public void setGroup(DSGroupResponse group) {
    this.group = group;
  }

  /**
   * groupUsers.
   *
   * @return DSGroupAndUsersResponse
   */
  public DSGroupAndUsersResponse groupUsers(DSGroupUsersResponse groupUsers) {
    this.groupUsers = groupUsers;
    return this;
  }

  /**
   * Get groupUsers.
   *
   * @return groupUsers
   */
  @ApiModelProperty(value = "")
  public DSGroupUsersResponse getGroupUsers() {
    return groupUsers;
  }

  /** setGroupUsers. */
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
    return Objects.equals(this.group, dsGroupAndUsersResponse.group)
        && Objects.equals(this.groupUsers, dsGroupAndUsersResponse.groupUsers);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(group, groupUsers);
  }

  /** Converts the given object to string. */
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
