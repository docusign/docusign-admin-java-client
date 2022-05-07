package com.docusign.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** OrganizationImportResponseWarningRollup. */
public class OrganizationImportResponseWarningRollup {
  @JsonProperty("warning_type")
  private String warningType = null;

  @JsonProperty("count")
  private Integer count = null;

  /**
   * warningType.
   *
   * @return OrganizationImportResponseWarningRollup
   */
  public OrganizationImportResponseWarningRollup warningType(String warningType) {
    this.warningType = warningType;
    return this;
  }

  /**
   * Get warningType.
   *
   * @return warningType
   */
  @ApiModelProperty(value = "")
  public String getWarningType() {
    return warningType;
  }

  /** setWarningType. */
  public void setWarningType(String warningType) {
    this.warningType = warningType;
  }

  /**
   * count.
   *
   * @return OrganizationImportResponseWarningRollup
   */
  public OrganizationImportResponseWarningRollup count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count.
   *
   * @return count
   */
  @ApiModelProperty(value = "")
  public Integer getCount() {
    return count;
  }

  /** setCount. */
  public void setCount(Integer count) {
    this.count = count;
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
    OrganizationImportResponseWarningRollup organizationImportResponseWarningRollup =
        (OrganizationImportResponseWarningRollup) o;
    return Objects.equals(this.warningType, organizationImportResponseWarningRollup.warningType)
        && Objects.equals(this.count, organizationImportResponseWarningRollup.count);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(warningType, count);
  }

  /** Converts the given object to string. */
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
