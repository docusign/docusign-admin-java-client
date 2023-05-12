package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.DSGroupUserResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * AddDSGroupUsersResponse.
 *
 */

public class AddDSGroupUsersResponse {
  @JsonProperty("is_success")
  private Boolean isSuccess = null;

  @JsonProperty("TotalCount")
  private Integer totalCount = null;

  @JsonProperty("users")
  private java.util.List<DSGroupUserResponse> users = null;


  /**
   * isSuccess.
   *
   * @return AddDSGroupUsersResponse
   **/
  public AddDSGroupUsersResponse isSuccess(Boolean isSuccess) {
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
   * totalCount.
   *
   * @return AddDSGroupUsersResponse
   **/
  public AddDSGroupUsersResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Get totalCount.
   * @return totalCount
   **/
  @Schema(description = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  /**
   * setTotalCount.
   **/
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  /**
   * users.
   *
   * @return AddDSGroupUsersResponse
   **/
  public AddDSGroupUsersResponse users(java.util.List<DSGroupUserResponse> users) {
    this.users = users;
    return this;
  }
  
  /**
   * addUsersItem.
   *
   * @return AddDSGroupUsersResponse
   **/
  public AddDSGroupUsersResponse addUsersItem(DSGroupUserResponse usersItem) {
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
  public java.util.List<DSGroupUserResponse> getUsers() {
    return users;
  }

  /**
   * setUsers.
   **/
  public void setUsers(java.util.List<DSGroupUserResponse> users) {
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
    AddDSGroupUsersResponse addDSGroupUsersResponse = (AddDSGroupUsersResponse) o;
    return Objects.equals(this.isSuccess, addDSGroupUsersResponse.isSuccess) &&
        Objects.equals(this.totalCount, addDSGroupUsersResponse.totalCount) &&
        Objects.equals(this.users, addDSGroupUsersResponse.users);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(isSuccess, totalCount, users);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddDSGroupUsersResponse {\n");
    
    sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

