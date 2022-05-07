package com.docusign.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** OrgReportListResponseRequestor. */
public class OrgReportListResponseRequestor {
  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * id.
   *
   * @return OrgReportListResponseRequestor
   */
  public OrgReportListResponseRequestor id(java.util.UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id.
   *
   * @return id
   */
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getId() {
    return id;
  }

  /** setId. */
  public void setId(java.util.UUID id) {
    this.id = id;
  }

  /**
   * name.
   *
   * @return OrgReportListResponseRequestor
   */
  public OrgReportListResponseRequestor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   *
   * @return name
   */
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  /** setName. */
  public void setName(String name) {
    this.name = name;
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
    OrgReportListResponseRequestor orgReportListResponseRequestor =
        (OrgReportListResponseRequestor) o;
    return Objects.equals(this.id, orgReportListResponseRequestor.id)
        && Objects.equals(this.name, orgReportListResponseRequestor.name);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgReportListResponseRequestor {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
