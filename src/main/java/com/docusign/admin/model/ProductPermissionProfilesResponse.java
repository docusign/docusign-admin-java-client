package com.docusign.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ProductPermissionProfilesResponse. */
public class ProductPermissionProfilesResponse {
  @JsonProperty("product_permission_profiles")
  private java.util.List<ProductPermissionProfileResponse> productPermissionProfiles = null;

  /**
   * Get productPermissionProfiles.
   *
   * @return productPermissionProfiles
   */
  @ApiModelProperty(value = "")
  public java.util.List<ProductPermissionProfileResponse> getProductPermissionProfiles() {
    return productPermissionProfiles;
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
    ProductPermissionProfilesResponse productPermissionProfilesResponse =
        (ProductPermissionProfilesResponse) o;
    return Objects.equals(
        this.productPermissionProfiles,
        productPermissionProfilesResponse.productPermissionProfiles);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(productPermissionProfiles);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPermissionProfilesResponse {\n");

    sb.append("    productPermissionProfiles: ")
        .append(toIndentedString(productPermissionProfiles))
        .append("\n");
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
