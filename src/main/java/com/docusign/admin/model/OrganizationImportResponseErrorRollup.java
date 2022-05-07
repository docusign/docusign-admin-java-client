package com.docusign.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** OrganizationImportResponseErrorRollup. */
public class OrganizationImportResponseErrorRollup {
  @JsonProperty("error_type")
  private String errorType = null;

  @JsonProperty("count")
  private Integer count = null;

  /**
   * errorType.
   *
   * @return OrganizationImportResponseErrorRollup
   */
  public OrganizationImportResponseErrorRollup errorType(String errorType) {
    this.errorType = errorType;
    return this;
  }

  /**
   * Get errorType.
   *
   * @return errorType
   */
  @ApiModelProperty(value = "")
  public String getErrorType() {
    return errorType;
  }

  /** setErrorType. */
  public void setErrorType(String errorType) {
    this.errorType = errorType;
  }

  /**
   * count.
   *
   * @return OrganizationImportResponseErrorRollup
   */
  public OrganizationImportResponseErrorRollup count(Integer count) {
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
    OrganizationImportResponseErrorRollup organizationImportResponseErrorRollup =
        (OrganizationImportResponseErrorRollup) o;
    return Objects.equals(this.errorType, organizationImportResponseErrorRollup.errorType)
        && Objects.equals(this.count, organizationImportResponseErrorRollup.count);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(errorType, count);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationImportResponseErrorRollup {\n");

    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
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
