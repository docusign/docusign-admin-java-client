package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.AddDSGroupUsersResponse;
import com.docusign.admin.model.DSGroupResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AddDSGroupAndUsersResponse
 */

public class AddDSGroupAndUsersResponse {
  @JsonProperty("group")
  private DSGroupResponse group = null;

  @JsonProperty("group_users")
  private AddDSGroupUsersResponse groupUsers = null;

  public AddDSGroupAndUsersResponse group(DSGroupResponse group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(value = "")
  public DSGroupResponse getGroup() {
    return group;
  }

  public void setGroup(DSGroupResponse group) {
    this.group = group;
  }

  public AddDSGroupAndUsersResponse groupUsers(AddDSGroupUsersResponse groupUsers) {
    this.groupUsers = groupUsers;
    return this;
  }

   /**
   * Get groupUsers
   * @return groupUsers
  **/
  @ApiModelProperty(value = "")
  public AddDSGroupUsersResponse getGroupUsers() {
    return groupUsers;
  }

  public void setGroupUsers(AddDSGroupUsersResponse groupUsers) {
    this.groupUsers = groupUsers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddDSGroupAndUsersResponse addDSGroupAndUsersResponse = (AddDSGroupAndUsersResponse) o;
    return Objects.equals(this.group, addDSGroupAndUsersResponse.group) &&
        Objects.equals(this.groupUsers, addDSGroupAndUsersResponse.groupUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, groupUsers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddDSGroupAndUsersResponse {\n");
    
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

