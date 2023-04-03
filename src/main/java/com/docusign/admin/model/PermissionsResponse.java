package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.PermissionProfileResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PermissionsResponse.
 *
 */

public class PermissionsResponse {
  @JsonProperty("permissions")
  private java.util.List<PermissionProfileResponse> permissions = null;


  /**
   * permissions.
   *
   * @return PermissionsResponse
   **/
  public PermissionsResponse permissions(java.util.List<PermissionProfileResponse> permissions) {
    this.permissions = permissions;
    return this;
  }
  
  /**
   * addPermissionsItem.
   *
   * @return PermissionsResponse
   **/
  public PermissionsResponse addPermissionsItem(PermissionProfileResponse permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new java.util.ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions.
   * @return permissions
   **/
  @ApiModelProperty(value = "")
  public java.util.List<PermissionProfileResponse> getPermissions() {
    return permissions;
  }

  /**
   * setPermissions.
   **/
  public void setPermissions(java.util.List<PermissionProfileResponse> permissions) {
    this.permissions = permissions;
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
    PermissionsResponse permissionsResponse = (PermissionsResponse) o;
    return Objects.equals(this.permissions, permissionsResponse.permissions);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(permissions);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionsResponse {\n");
    
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

