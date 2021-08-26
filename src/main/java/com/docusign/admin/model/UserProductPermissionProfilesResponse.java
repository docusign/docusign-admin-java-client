package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.ProductPermissionProfileResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserProductPermissionProfilesResponse
 */

public class UserProductPermissionProfilesResponse {
  @JsonProperty("user_id")
  private java.util.UUID userId = null;

  @JsonProperty("account_id")
  private java.util.UUID accountId = null;

  @JsonProperty("product_permission_profiles")
  private java.util.List<ProductPermissionProfileResponse> productPermissionProfiles = null;

  public UserProductPermissionProfilesResponse userId(java.util.UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getUserId() {
    return userId;
  }

  public void setUserId(java.util.UUID userId) {
    this.userId = userId;
  }

  public UserProductPermissionProfilesResponse accountId(java.util.UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(java.util.UUID accountId) {
    this.accountId = accountId;
  }

  public UserProductPermissionProfilesResponse productPermissionProfiles(java.util.List<ProductPermissionProfileResponse> productPermissionProfiles) {
    this.productPermissionProfiles = productPermissionProfiles;
    return this;
  }

  public UserProductPermissionProfilesResponse addProductPermissionProfilesItem(ProductPermissionProfileResponse productPermissionProfilesItem) {
    if (this.productPermissionProfiles == null) {
      this.productPermissionProfiles = new java.util.ArrayList<ProductPermissionProfileResponse>();
    }
    this.productPermissionProfiles.add(productPermissionProfilesItem);
    return this;
  }

   /**
   * Get productPermissionProfiles
   * @return productPermissionProfiles
  **/
  @ApiModelProperty(value = "")
  public java.util.List<ProductPermissionProfileResponse> getProductPermissionProfiles() {
    return productPermissionProfiles;
  }

  public void setProductPermissionProfiles(java.util.List<ProductPermissionProfileResponse> productPermissionProfiles) {
    this.productPermissionProfiles = productPermissionProfiles;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(userId, accountId, productPermissionProfiles);
  }


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

