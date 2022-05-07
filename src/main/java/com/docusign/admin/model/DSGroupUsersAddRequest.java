package com.docusign.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** DSGroupUsersAddRequest. */
public class DSGroupUsersAddRequest {
  @JsonProperty("user_ids")
  private java.util.List<java.util.UUID> userIds = new java.util.ArrayList<>();

  /**
   * userIds.
   *
   * @return DSGroupUsersAddRequest
   */
  public DSGroupUsersAddRequest userIds(java.util.List<java.util.UUID> userIds) {
    this.userIds = userIds;
    return this;
  }

  /**
   * addUserIdsItem.
   *
   * @return DSGroupUsersAddRequest
   */
  public DSGroupUsersAddRequest addUserIdsItem(java.util.UUID userIdsItem) {
    this.userIds.add(userIdsItem);
    return this;
  }

  /**
   * Get userIds.
   *
   * @return userIds
   */
  @ApiModelProperty(required = true, value = "")
  public java.util.List<java.util.UUID> getUserIds() {
    return userIds;
  }

  /** setUserIds. */
  public void setUserIds(java.util.List<java.util.UUID> userIds) {
    this.userIds = userIds;
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
    DSGroupUsersAddRequest dsGroupUsersAddRequest = (DSGroupUsersAddRequest) o;
    return Objects.equals(this.userIds, dsGroupUsersAddRequest.userIds);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(userIds);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSGroupUsersAddRequest {\n");

    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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
