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
 * ProductPermissionProfilesResponse
 */

public class ProductPermissionProfilesResponse {
  @JsonProperty("product_permission_profiles")
  private java.util.List<ProductPermissionProfileResponse> productPermissionProfiles = null;

   /**
   * Get productPermissionProfiles
   * @return productPermissionProfiles
  **/
  @ApiModelProperty(value = "")
  public java.util.List<ProductPermissionProfileResponse> getProductPermissionProfiles() {
    return productPermissionProfiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductPermissionProfilesResponse productPermissionProfilesResponse = (ProductPermissionProfilesResponse) o;
    return Objects.equals(this.productPermissionProfiles, productPermissionProfilesResponse.productPermissionProfiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productPermissionProfiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPermissionProfilesResponse {\n");
    
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

