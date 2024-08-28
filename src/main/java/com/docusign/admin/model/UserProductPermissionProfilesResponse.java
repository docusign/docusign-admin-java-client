package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.ProductPermissionProfileResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * UserProductPermissionProfilesResponse.
 *
 */

public class UserProductPermissionProfilesResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("user_id")
  private java.util.UUID userId = null;

  @JsonProperty("account_id")
  private java.util.UUID accountId = null;

  @JsonProperty("product_permission_profiles")
  private java.util.List<ProductPermissionProfileResponse> productPermissionProfiles = null;


  /**
   * userId.
   *
   * @return UserProductPermissionProfilesResponse
   **/
  public UserProductPermissionProfilesResponse userId(java.util.UUID userId) {
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
   * @return UserProductPermissionProfilesResponse
   **/
  public UserProductPermissionProfilesResponse accountId(java.util.UUID accountId) {
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
   * productPermissionProfiles.
   *
   * @return UserProductPermissionProfilesResponse
   **/
  public UserProductPermissionProfilesResponse productPermissionProfiles(java.util.List<ProductPermissionProfileResponse> productPermissionProfiles) {
    this.productPermissionProfiles = productPermissionProfiles;
    return this;
  }
  
  /**
   * addProductPermissionProfilesItem.
   *
   * @return UserProductPermissionProfilesResponse
   **/
  public UserProductPermissionProfilesResponse addProductPermissionProfilesItem(ProductPermissionProfileResponse productPermissionProfilesItem) {
    if (this.productPermissionProfiles == null) {
      this.productPermissionProfiles = new java.util.ArrayList<>();
    }
    this.productPermissionProfiles.add(productPermissionProfilesItem);
    return this;
  }

  /**
   * Get productPermissionProfiles.
   * @return productPermissionProfiles
   **/
  @Schema(description = "")
  public java.util.List<ProductPermissionProfileResponse> getProductPermissionProfiles() {
    return productPermissionProfiles;
  }

  /**
   * setProductPermissionProfiles.
   **/
  public void setProductPermissionProfiles(java.util.List<ProductPermissionProfileResponse> productPermissionProfiles) {
    this.productPermissionProfiles = productPermissionProfiles;
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
    UserProductPermissionProfilesResponse userProductPermissionProfilesResponse = (UserProductPermissionProfilesResponse) o;
    return Objects.equals(this.userId, userProductPermissionProfilesResponse.userId) &&
        Objects.equals(this.accountId, userProductPermissionProfilesResponse.accountId) &&
        Objects.equals(this.productPermissionProfiles, userProductPermissionProfilesResponse.productPermissionProfiles);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(userId, accountId, productPermissionProfiles);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProductPermissionProfilesResponse {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    productPermissionProfiles: ").append(toIndentedString(productPermissionProfiles)).append("\n");
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

