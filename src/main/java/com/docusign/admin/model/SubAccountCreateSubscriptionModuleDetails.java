package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * SubAccountCreateSubscriptionModuleDetails.
 *
 */

public class SubAccountCreateSubscriptionModuleDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("moduleId")
  private java.util.UUID moduleId = null;

  @JsonProperty("moduleName")
  private String moduleName = null;


  /**
   * moduleId.
   *
   * @return SubAccountCreateSubscriptionModuleDetails
   **/
  public SubAccountCreateSubscriptionModuleDetails moduleId(java.util.UUID moduleId) {
    this.moduleId = moduleId;
    return this;
  }

  /**
   * Module ID.
   * @return moduleId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "Module ID")
  public java.util.UUID getModuleId() {
    return moduleId;
  }

  /**
   * setModuleId.
   **/
  public void setModuleId(java.util.UUID moduleId) {
    this.moduleId = moduleId;
  }


  /**
   * moduleName.
   *
   * @return SubAccountCreateSubscriptionModuleDetails
   **/
  public SubAccountCreateSubscriptionModuleDetails moduleName(String moduleName) {
    this.moduleName = moduleName;
    return this;
  }

  /**
   * Module Name.
   * @return moduleName
   **/
  @Schema(description = "Module Name")
  public String getModuleName() {
    return moduleName;
  }

  /**
   * setModuleName.
   **/
  public void setModuleName(String moduleName) {
    this.moduleName = moduleName;
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
    SubAccountCreateSubscriptionModuleDetails subAccountCreateSubscriptionModuleDetails = (SubAccountCreateSubscriptionModuleDetails) o;
    return Objects.equals(this.moduleId, subAccountCreateSubscriptionModuleDetails.moduleId) &&
        Objects.equals(this.moduleName, subAccountCreateSubscriptionModuleDetails.moduleName);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(moduleId, moduleName);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubAccountCreateSubscriptionModuleDetails {\n");
    
    sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
    sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
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

