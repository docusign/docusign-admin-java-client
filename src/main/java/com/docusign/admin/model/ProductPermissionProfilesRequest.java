package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.ProductPermissionProfileRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ProductPermissionProfilesRequest.
 *
 */

public class ProductPermissionProfilesRequest {
  @JsonProperty("product_permission_profiles")
  private java.util.List<ProductPermissionProfileRequest> productPermissionProfiles = new java.util.ArrayList<>();


  /**
   * productPermissionProfiles.
   *
   * @return ProductPermissionProfilesRequest
   **/
  public ProductPermissionProfilesRequest productPermissionProfiles(java.util.List<ProductPermissionProfileRequest> productPermissionProfiles) {
    this.productPermissionProfiles = productPermissionProfiles;
    return this;
  }
  
  /**
   * addProductPermissionProfilesItem.
   *
   * @return ProductPermissionProfilesRequest
   **/
  public ProductPermissionProfilesRequest addProductPermissionProfilesItem(ProductPermissionProfileRequest productPermissionProfilesItem) {
    this.productPermissionProfiles.add(productPermissionProfilesItem);
    return this;
  }

  /**
   * Get productPermissionProfiles.
   * @return productPermissionProfiles
   **/
  @Schema(required = true, description = "")
  public java.util.List<ProductPermissionProfileRequest> getProductPermissionProfiles() {
    return productPermissionProfiles;
  }

  /**
   * setProductPermissionProfiles.
   **/
  public void setProductPermissionProfiles(java.util.List<ProductPermissionProfileRequest> productPermissionProfiles) {
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
    ProductPermissionProfilesRequest productPermissionProfilesRequest = (ProductPermissionProfilesRequest) o;
    return Objects.equals(this.productPermissionProfiles, productPermissionProfilesRequest.productPermissionProfiles);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(productPermissionProfiles);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPermissionProfilesRequest {\n");
    
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

