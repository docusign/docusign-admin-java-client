package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.DSGroupUserResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * RemoveDSGroupUsersResponse.
 *
 */

public class RemoveDSGroupUsersResponse {
  @JsonProperty("is_success")
  private Boolean isSuccess = null;

  @JsonProperty("failed_users")
  private java.util.List<DSGroupUserResponse> failedUsers = null;


  /**
   * isSuccess.
   *
   * @return RemoveDSGroupUsersResponse
   **/
  public RemoveDSGroupUsersResponse isSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
    return this;
  }

  /**
   * Get isSuccess.
   * @return isSuccess
   **/
  @Schema(description = "")
  public Boolean isIsSuccess() {
    return isSuccess;
  }

  /**
   * setIsSuccess.
   **/
  public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
  }


  /**
   * failedUsers.
   *
   * @return RemoveDSGroupUsersResponse
   **/
  public RemoveDSGroupUsersResponse failedUsers(java.util.List<DSGroupUserResponse> failedUsers) {
    this.failedUsers = failedUsers;
    return this;
  }
  
  /**
   * addFailedUsersItem.
   *
   * @return RemoveDSGroupUsersResponse
   **/
  public RemoveDSGroupUsersResponse addFailedUsersItem(DSGroupUserResponse failedUsersItem) {
    if (this.failedUsers == null) {
      this.failedUsers = new java.util.ArrayList<>();
    }
    this.failedUsers.add(failedUsersItem);
    return this;
  }

  /**
   * Get failedUsers.
   * @return failedUsers
   **/
  @Schema(description = "")
  public java.util.List<DSGroupUserResponse> getFailedUsers() {
    return failedUsers;
  }

  /**
   * setFailedUsers.
   **/
  public void setFailedUsers(java.util.List<DSGroupUserResponse> failedUsers) {
    this.failedUsers = failedUsers;
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
    RemoveDSGroupUsersResponse removeDSGroupUsersResponse = (RemoveDSGroupUsersResponse) o;
    return Objects.equals(this.isSuccess, removeDSGroupUsersResponse.isSuccess) &&
        Objects.equals(this.failedUsers, removeDSGroupUsersResponse.failedUsers);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(isSuccess, failedUsers);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveDSGroupUsersResponse {\n");
    
    sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
    sb.append("    failedUsers: ").append(toIndentedString(failedUsers)).append("\n");
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

