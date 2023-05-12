package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PermissionProfileResponse21.
 *
 */

public class PermissionProfileResponse21 {
  @JsonProperty("permission_profile_id")
  private String permissionProfileId = null;

  @JsonProperty("permission_profile_name")
  private String permissionProfileName = null;


  /**
   * permissionProfileId.
   *
   * @return PermissionProfileResponse21
   **/
  public PermissionProfileResponse21 permissionProfileId(String permissionProfileId) {
    this.permissionProfileId = permissionProfileId;
    return this;
  }

  /**
   * Get permissionProfileId.
   * @return permissionProfileId
   **/
  @Schema(description = "")
  public String getPermissionProfileId() {
    return permissionProfileId;
  }

  /**
   * setPermissionProfileId.
   **/
  public void setPermissionProfileId(String permissionProfileId) {
    this.permissionProfileId = permissionProfileId;
  }


  /**
   * permissionProfileName.
   *
   * @return PermissionProfileResponse21
   **/
  public PermissionProfileResponse21 permissionProfileName(String permissionProfileName) {
    this.permissionProfileName = permissionProfileName;
    return this;
  }

  /**
   * Get permissionProfileName.
   * @return permissionProfileName
   **/
  @Schema(description = "")
  public String getPermissionProfileName() {
    return permissionProfileName;
  }

  /**
   * setPermissionProfileName.
   **/
  public void setPermissionProfileName(String permissionProfileName) {
    this.permissionProfileName = permissionProfileName;
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
    PermissionProfileResponse21 permissionProfileResponse21 = (PermissionProfileResponse21) o;
    return Objects.equals(this.permissionProfileId, permissionProfileResponse21.permissionProfileId) &&
        Objects.equals(this.permissionProfileName, permissionProfileResponse21.permissionProfileName);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(permissionProfileId, permissionProfileName);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionProfileResponse21 {\n");
    
    sb.append("    permissionProfileId: ").append(toIndentedString(permissionProfileId)).append("\n");
    sb.append("    permissionProfileName: ").append(toIndentedString(permissionProfileName)).append("\n");
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

