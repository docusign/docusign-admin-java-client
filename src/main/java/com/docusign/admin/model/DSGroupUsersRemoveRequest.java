package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DSGroupUsersRemoveRequest.
 *
 */

public class DSGroupUsersRemoveRequest {
  @JsonProperty("user_ids")
  private java.util.List<java.util.UUID> userIds = null;

  @JsonProperty("user_emails")
  private java.util.List<String> userEmails = null;


  /**
   * userIds.
   *
   * @return DSGroupUsersRemoveRequest
   **/
  public DSGroupUsersRemoveRequest userIds(java.util.List<java.util.UUID> userIds) {
    this.userIds = userIds;
    return this;
  }
  
  /**
   * addUserIdsItem.
   *
   * @return DSGroupUsersRemoveRequest
   **/
  public DSGroupUsersRemoveRequest addUserIdsItem(java.util.UUID userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new java.util.ArrayList<>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

  /**
   * Get userIds.
   * @return userIds
   **/
  @Schema(description = "")
  public java.util.List<java.util.UUID> getUserIds() {
    return userIds;
  }

  /**
   * setUserIds.
   **/
  public void setUserIds(java.util.List<java.util.UUID> userIds) {
    this.userIds = userIds;
  }


  /**
   * userEmails.
   *
   * @return DSGroupUsersRemoveRequest
   **/
  public DSGroupUsersRemoveRequest userEmails(java.util.List<String> userEmails) {
    this.userEmails = userEmails;
    return this;
  }
  
  /**
   * addUserEmailsItem.
   *
   * @return DSGroupUsersRemoveRequest
   **/
  public DSGroupUsersRemoveRequest addUserEmailsItem(String userEmailsItem) {
    if (this.userEmails == null) {
      this.userEmails = new java.util.ArrayList<>();
    }
    this.userEmails.add(userEmailsItem);
    return this;
  }

  /**
   * Get userEmails.
   * @return userEmails
   **/
  @Schema(description = "")
  public java.util.List<String> getUserEmails() {
    return userEmails;
  }

  /**
   * setUserEmails.
   **/
  public void setUserEmails(java.util.List<String> userEmails) {
    this.userEmails = userEmails;
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
    DSGroupUsersRemoveRequest dsGroupUsersRemoveRequest = (DSGroupUsersRemoveRequest) o;
    return Objects.equals(this.userIds, dsGroupUsersRemoveRequest.userIds) &&
        Objects.equals(this.userEmails, dsGroupUsersRemoveRequest.userEmails);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(userIds, userEmails);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSGroupUsersRemoveRequest {\n");
    
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    userEmails: ").append(toIndentedString(userEmails)).append("\n");
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

