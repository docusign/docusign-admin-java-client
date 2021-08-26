package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.DSGroupUserResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RemoveDSGroupUsersResponse
 */

public class RemoveDSGroupUsersResponse {
  @JsonProperty("is_success")
  private Boolean isSuccess = null;

  @JsonProperty("failed_users")
  private java.util.List<DSGroupUserResponse> failedUsers = null;

  public RemoveDSGroupUsersResponse isSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
    return this;
  }

   /**
   * Get isSuccess
   * @return isSuccess
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsSuccess() {
    return isSuccess;
  }

  public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
  }

  public RemoveDSGroupUsersResponse failedUsers(java.util.List<DSGroupUserResponse> failedUsers) {
    this.failedUsers = failedUsers;
    return this;
  }

  public RemoveDSGroupUsersResponse addFailedUsersItem(DSGroupUserResponse failedUsersItem) {
    if (this.failedUsers == null) {
      this.failedUsers = new java.util.ArrayList<DSGroupUserResponse>();
    }
    this.failedUsers.add(failedUsersItem);
    return this;
  }

   /**
   * Get failedUsers
   * @return failedUsers
  **/
  @ApiModelProperty(value = "")
  public java.util.List<DSGroupUserResponse> getFailedUsers() {
    return failedUsers;
  }

  public void setFailedUsers(java.util.List<DSGroupUserResponse> failedUsers) {
    this.failedUsers = failedUsers;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(isSuccess, failedUsers);
  }


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

