package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.PermissionProfileResponse21;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ProductPermissionProfileResponse
 */

public class ProductPermissionProfileResponse {
  @JsonProperty("product_id")
  private java.util.UUID productId = null;

  @JsonProperty("product_name")
  private String productName = null;

  @JsonProperty("permission_profiles")
  private java.util.List<PermissionProfileResponse21> permissionProfiles = null;

  @JsonProperty("error_message")
  private String errorMessage = null;

  public ProductPermissionProfileResponse productId(java.util.UUID productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getProductId() {
    return productId;
  }

  public void setProductId(java.util.UUID productId) {
    this.productId = productId;
  }

  public ProductPermissionProfileResponse productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @ApiModelProperty(value = "")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public ProductPermissionProfileResponse permissionProfiles(java.util.List<PermissionProfileResponse21> permissionProfiles) {
    this.permissionProfiles = permissionProfiles;
    return this;
  }

  public ProductPermissionProfileResponse addPermissionProfilesItem(PermissionProfileResponse21 permissionProfilesItem) {
    if (this.permissionProfiles == null) {
      this.permissionProfiles = new java.util.ArrayList<PermissionProfileResponse21>();
    }
    this.permissionProfiles.add(permissionProfilesItem);
    return this;
  }

   /**
   * Get permissionProfiles
   * @return permissionProfiles
  **/
  @ApiModelProperty(value = "")
  public java.util.List<PermissionProfileResponse21> getPermissionProfiles() {
    return permissionProfiles;
  }

  public void setPermissionProfiles(java.util.List<PermissionProfileResponse21> permissionProfiles) {
    this.permissionProfiles = permissionProfiles;
  }

  public ProductPermissionProfileResponse errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @ApiModelProperty(value = "")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductPermissionProfileResponse productPermissionProfileResponse = (ProductPermissionProfileResponse) o;
    return Objects.equals(this.productId, productPermissionProfileResponse.productId) &&
        Objects.equals(this.productName, productPermissionProfileResponse.productName) &&
        Objects.equals(this.permissionProfiles, productPermissionProfileResponse.permissionProfiles) &&
        Objects.equals(this.errorMessage, productPermissionProfileResponse.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productName, permissionProfiles, errorMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPermissionProfileResponse {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    permissionProfiles: ").append(toIndentedString(permissionProfiles)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

