package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ProductPermissionProfileRequest
 */

public class ProductPermissionProfileRequest {
  @JsonProperty("product_id")
  private java.util.UUID productId = null;

  @JsonProperty("permission_profile_id")
  private String permissionProfileId = null;

  public ProductPermissionProfileRequest productId(java.util.UUID productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "")
  public java.util.UUID getProductId() {
    return productId;
  }

  public void setProductId(java.util.UUID productId) {
    this.productId = productId;
  }

  public ProductPermissionProfileRequest permissionProfileId(String permissionProfileId) {
    this.permissionProfileId = permissionProfileId;
    return this;
  }

   /**
   * Get permissionProfileId
   * @return permissionProfileId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPermissionProfileId() {
    return permissionProfileId;
  }

  public void setPermissionProfileId(String permissionProfileId) {
    this.permissionProfileId = permissionProfileId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductPermissionProfileRequest productPermissionProfileRequest = (ProductPermissionProfileRequest) o;
    return Objects.equals(this.productId, productPermissionProfileRequest.productId) &&
        Objects.equals(this.permissionProfileId, productPermissionProfileRequest.permissionProfileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, permissionProfileId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPermissionProfileRequest {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    permissionProfileId: ").append(toIndentedString(permissionProfileId)).append("\n");
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

