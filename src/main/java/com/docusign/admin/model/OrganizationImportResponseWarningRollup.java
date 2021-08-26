package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OrganizationImportResponseWarningRollup
 */

public class OrganizationImportResponseWarningRollup {
  @JsonProperty("warning_type")
  private String warningType = null;

  @JsonProperty("count")
  private Integer count = null;

  public OrganizationImportResponseWarningRollup warningType(String warningType) {
    this.warningType = warningType;
    return this;
  }

   /**
   * Get warningType
   * @return warningType
  **/
  @ApiModelProperty(value = "")
  public String getWarningType() {
    return warningType;
  }

  public void setWarningType(String warningType) {
    this.warningType = warningType;
  }

  public OrganizationImportResponseWarningRollup count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationImportResponseWarningRollup organizationImportResponseWarningRollup = (OrganizationImportResponseWarningRollup) o;
    return Objects.equals(this.warningType, organizationImportResponseWarningRollup.warningType) &&
        Objects.equals(this.count, organizationImportResponseWarningRollup.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warningType, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationImportResponseWarningRollup {\n");
    
    sb.append("    warningType: ").append(toIndentedString(warningType)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

