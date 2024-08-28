package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * DSGroupUserResponse.
 *
 */

public class DSGroupUserResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("user_id")
  private java.util.UUID userId = null;

  @JsonProperty("account_id")
  private java.util.UUID accountId = null;

  @JsonProperty("user_name")
  private String userName = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("middle_name")
  private String middleName = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("error_details")
  private ErrorDetails errorDetails = null;


  /**
   * userId.
   *
   * @return DSGroupUserResponse
   **/
  public DSGroupUserResponse userId(java.util.UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId.
   * @return userId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getUserId() {
    return userId;
  }

  /**
   * setUserId.
   **/
  public void setUserId(java.util.UUID userId) {
    this.userId = userId;
  }


  /**
   * accountId.
   *
   * @return DSGroupUserResponse
   **/
  public DSGroupUserResponse accountId(java.util.UUID accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId.
   * @return accountId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getAccountId() {
    return accountId;
  }

  /**
   * setAccountId.
   **/
  public void setAccountId(java.util.UUID accountId) {
    this.accountId = accountId;
  }


  /**
   * userName.
   *
   * @return DSGroupUserResponse
   **/
  public DSGroupUserResponse userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName.
   * @return userName
   **/
  @Schema(description = "")
  public String getUserName() {
    return userName;
  }

  /**
   * setUserName.
   **/
  public void setUserName(String userName) {
    this.userName = userName;
  }


  /**
   * firstName.
   *
   * @return DSGroupUserResponse
   **/
  public DSGroupUserResponse firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName.
   * @return firstName
   **/
  @Schema(description = "")
  public String getFirstName() {
    return firstName;
  }

  /**
   * setFirstName.
   **/
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   * lastName.
   *
   * @return DSGroupUserResponse
   **/
  public DSGroupUserResponse lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName.
   * @return lastName
   **/
  @Schema(description = "")
  public String getLastName() {
    return lastName;
  }

  /**
   * setLastName.
   **/
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   * middleName.
   *
   * @return DSGroupUserResponse
   **/
  public DSGroupUserResponse middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Get middleName.
   * @return middleName
   **/
  @Schema(description = "")
  public String getMiddleName() {
    return middleName;
  }

  /**
   * setMiddleName.
   **/
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  /**
   * status.
   *
   * @return DSGroupUserResponse
   **/
  public DSGroupUserResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status.
   * @return status
   **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * errorDetails.
   *
   * @return DSGroupUserResponse
   **/
  public DSGroupUserResponse errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails.
   * @return errorDetails
   **/
  @Schema(description = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
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
    DSGroupUserResponse dsGroupUserResponse = (DSGroupUserResponse) o;
    return Objects.equals(this.userId, dsGroupUserResponse.userId) &&
        Objects.equals(this.accountId, dsGroupUserResponse.accountId) &&
        Objects.equals(this.userName, dsGroupUserResponse.userName) &&
        Objects.equals(this.firstName, dsGroupUserResponse.firstName) &&
        Objects.equals(this.lastName, dsGroupUserResponse.lastName) &&
        Objects.equals(this.middleName, dsGroupUserResponse.middleName) &&
        Objects.equals(this.status, dsGroupUserResponse.status) &&
        Objects.equals(this.errorDetails, dsGroupUserResponse.errorDetails);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(userId, accountId, userName, firstName, lastName, middleName, status, errorDetails);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSGroupUserResponse {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

