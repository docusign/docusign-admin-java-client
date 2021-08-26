package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RequiredAttributeMappingResponse
 */

public class RequiredAttributeMappingResponse {
  @JsonProperty("required_attribute_id")
  private Integer requiredAttributeId = null;

  @JsonProperty("required_attribute_name")
  private String requiredAttributeName = null;

  @JsonProperty("required_attribute_friendly_name")
  private String requiredAttributeFriendlyName = null;

  @JsonProperty("substitute_attribute_name")
  private String substituteAttributeName = null;

  public RequiredAttributeMappingResponse requiredAttributeId(Integer requiredAttributeId) {
    this.requiredAttributeId = requiredAttributeId;
    return this;
  }

   /**
   * Get requiredAttributeId
   * @return requiredAttributeId
  **/
  @ApiModelProperty(value = "")
  public Integer getRequiredAttributeId() {
    return requiredAttributeId;
  }

  public void setRequiredAttributeId(Integer requiredAttributeId) {
    this.requiredAttributeId = requiredAttributeId;
  }

  public RequiredAttributeMappingResponse requiredAttributeName(String requiredAttributeName) {
    this.requiredAttributeName = requiredAttributeName;
    return this;
  }

   /**
   * Get requiredAttributeName
   * @return requiredAttributeName
  **/
  @ApiModelProperty(value = "")
  public String getRequiredAttributeName() {
    return requiredAttributeName;
  }

  public void setRequiredAttributeName(String requiredAttributeName) {
    this.requiredAttributeName = requiredAttributeName;
  }

  public RequiredAttributeMappingResponse requiredAttributeFriendlyName(String requiredAttributeFriendlyName) {
    this.requiredAttributeFriendlyName = requiredAttributeFriendlyName;
    return this;
  }

   /**
   * Get requiredAttributeFriendlyName
   * @return requiredAttributeFriendlyName
  **/
  @ApiModelProperty(value = "")
  public String getRequiredAttributeFriendlyName() {
    return requiredAttributeFriendlyName;
  }

  public void setRequiredAttributeFriendlyName(String requiredAttributeFriendlyName) {
    this.requiredAttributeFriendlyName = requiredAttributeFriendlyName;
  }

  public RequiredAttributeMappingResponse substituteAttributeName(String substituteAttributeName) {
    this.substituteAttributeName = substituteAttributeName;
    return this;
  }

   /**
   * Get substituteAttributeName
   * @return substituteAttributeName
  **/
  @ApiModelProperty(value = "")
  public String getSubstituteAttributeName() {
    return substituteAttributeName;
  }

  public void setSubstituteAttributeName(String substituteAttributeName) {
    this.substituteAttributeName = substituteAttributeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequiredAttributeMappingResponse requiredAttributeMappingResponse = (RequiredAttributeMappingResponse) o;
    return Objects.equals(this.requiredAttributeId, requiredAttributeMappingResponse.requiredAttributeId) &&
        Objects.equals(this.requiredAttributeName, requiredAttributeMappingResponse.requiredAttributeName) &&
        Objects.equals(this.requiredAttributeFriendlyName, requiredAttributeMappingResponse.requiredAttributeFriendlyName) &&
        Objects.equals(this.substituteAttributeName, requiredAttributeMappingResponse.substituteAttributeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredAttributeId, requiredAttributeName, requiredAttributeFriendlyName, substituteAttributeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequiredAttributeMappingResponse {\n");
    
    sb.append("    requiredAttributeId: ").append(toIndentedString(requiredAttributeId)).append("\n");
    sb.append("    requiredAttributeName: ").append(toIndentedString(requiredAttributeName)).append("\n");
    sb.append("    requiredAttributeFriendlyName: ").append(toIndentedString(requiredAttributeFriendlyName)).append("\n");
    sb.append("    substituteAttributeName: ").append(toIndentedString(substituteAttributeName)).append("\n");
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

