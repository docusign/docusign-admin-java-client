package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserProductProfileDeleteRequest.
 *
 */

public class UserProductProfileDeleteRequest {
  @JsonProperty("user_email")
  private String userEmail = null;

  @JsonProperty("user_id")
  private java.util.UUID userId = null;

  @JsonProperty("product_ids")
  private java.util.List<java.util.UUID> productIds = new java.util.ArrayList<>();


  /**
   * userEmail.
   *
   * @return UserProductProfileDeleteRequest
   **/
  public UserProductProfileDeleteRequest userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  /**
   * Get userEmail.
   * @return userEmail
   **/
  @ApiModelProperty(value = "")
  public String getUserEmail() {
    return userEmail;
  }

  /**
   * setUserEmail.
   **/
  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  /**
   * userId.
   *
   * @return UserProductProfileDeleteRequest
   **/
  public UserProductProfileDeleteRequest userId(java.util.UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId.
   * @return userId
   **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
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
   * productIds.
   *
   * @return UserProductProfileDeleteRequest
   **/
  public UserProductProfileDeleteRequest productIds(java.util.List<java.util.UUID> productIds) {
    this.productIds = productIds;
    return this;
  }
  
  /**
   * addProductIdsItem.
   *
   * @return UserProductProfileDeleteRequest
   **/
  public UserProductProfileDeleteRequest addProductIdsItem(java.util.UUID productIdsItem) {
    this.productIds.add(productIdsItem);
    return this;
  }

  /**
   * Get productIds.
   * @return productIds
   **/
  @ApiModelProperty(required = true, value = "")
  public java.util.List<java.util.UUID> getProductIds() {
    return productIds;
  }

  /**
   * setProductIds.
   **/
  public void setProductIds(java.util.List<java.util.UUID> productIds) {
    this.productIds = productIds;
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
    UserProductProfileDeleteRequest userProductProfileDeleteRequest = (UserProductProfileDeleteRequest) o;
    return Objects.equals(this.userEmail, userProductProfileDeleteRequest.userEmail) &&
        Objects.equals(this.userId, userProductProfileDeleteRequest.userId) &&
        Objects.equals(this.productIds, userProductProfileDeleteRequest.productIds);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(userEmail, userId, productIds);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProductProfileDeleteRequest {\n");
    
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
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

