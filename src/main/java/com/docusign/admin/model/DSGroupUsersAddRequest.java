package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DSGroupUsersAddRequest
 */

public class DSGroupUsersAddRequest {
  @JsonProperty("user_ids")
  private java.util.List<java.util.UUID> userIds = new java.util.ArrayList<java.util.UUID>();

  public DSGroupUsersAddRequest userIds(java.util.List<java.util.UUID> userIds) {
    this.userIds = userIds;
    return this;
  }

  public DSGroupUsersAddRequest addUserIdsItem(java.util.UUID userIdsItem) {
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Get userIds
   * @return userIds
  **/
  @ApiModelProperty(required = true, value = "")
  public java.util.List<java.util.UUID> getUserIds() {
    return userIds;
  }

  public void setUserIds(java.util.List<java.util.UUID> userIds) {
    this.userIds = userIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DSGroupUsersAddRequest dsGroupUsersAddRequest = (DSGroupUsersAddRequest) o;
    return Objects.equals(this.userIds, dsGroupUsersAddRequest.userIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSGroupUsersAddRequest {\n");
    
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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

