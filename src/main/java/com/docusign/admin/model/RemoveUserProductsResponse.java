package com.docusign.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** RemoveUserProductsResponse. */
public class RemoveUserProductsResponse {
  @JsonProperty("is_success")
  private Boolean isSuccess = null;

  @JsonProperty("user_email")
  private String userEmail = null;

  @JsonProperty("user_id")
  private java.util.UUID userId = null;

  @JsonProperty("user_product_results")
  private java.util.Map<String, String> userProductResults = new java.util.HashMap<>();

  /**
   * isSuccess.
   *
   * @return RemoveUserProductsResponse
   */
  public RemoveUserProductsResponse isSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
    return this;
  }

  /**
   * Get isSuccess.
   *
   * @return isSuccess
   */
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsSuccess() {
    return isSuccess;
  }

  /** setIsSuccess. */
  public void setIsSuccess(Boolean isSuccess) {
    this.isSuccess = isSuccess;
  }

  /**
   * userEmail.
   *
   * @return RemoveUserProductsResponse
   */
  public RemoveUserProductsResponse userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * Get userEmail.
   *
   * @return userEmail
   */
  @ApiModelProperty(value = "")
  public String getUserEmail() {
    return userEmail;
  }

  /** setUserEmail. */
  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  /**
   * userId.
   *
   * @return RemoveUserProductsResponse
   */
  public RemoveUserProductsResponse userId(java.util.UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId.
   *
   * @return userId
   */
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getUserId() {
    return userId;
  }

  /** setUserId. */
  public void setUserId(java.util.UUID userId) {
    this.userId = userId;
  }

  /**
   * userProductResults.
   *
   * @return RemoveUserProductsResponse
   */
  public RemoveUserProductsResponse userProductResults(
      java.util.Map<String, String> userProductResults) {
    this.userProductResults = userProductResults;
    return this;
  }

  /**
   * putUserProductResultsItem.
   *
   * @return RemoveUserProductsResponse
   */
  public RemoveUserProductsResponse putUserProductResultsItem(
      String key, String userProductResultsItem) {
    this.userProductResults.put(key, userProductResultsItem);
    return this;
  }

  /**
   * Get userProductResults.
   *
   * @return userProductResults
   */
  @ApiModelProperty(required = true, value = "")
  public java.util.Map<String, String> getUserProductResults() {
    return userProductResults;
  }

  /** setUserProductResults. */
  public void setUserProductResults(java.util.Map<String, String> userProductResults) {
    this.userProductResults = userProductResults;
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
    RemoveUserProductsResponse removeUserProductsResponse = (RemoveUserProductsResponse) o;
    return Objects.equals(this.isSuccess, removeUserProductsResponse.isSuccess)
        && Objects.equals(this.userEmail, removeUserProductsResponse.userEmail)
        && Objects.equals(this.userId, removeUserProductsResponse.userId)
        && Objects.equals(this.userProductResults, removeUserProductsResponse.userProductResults);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(isSuccess, userEmail, userId, userProductResults);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveUserProductsResponse {\n");

    sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userProductResults: ").append(toIndentedString(userProductResults)).append("\n");
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
