package com.docusign.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** OrganizationSimpleIdObject. */
public class OrganizationSimpleIdObject {
  @JsonProperty("id")
  private java.util.UUID id = null;

  /**
   * id.
   *
   * @return OrganizationSimpleIdObject
   */
  public OrganizationSimpleIdObject id(java.util.UUID id) {
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
    OrganizationSimpleIdObject organizationSimpleIdObject = (OrganizationSimpleIdObject) o;
    return Objects.equals(this.id, organizationSimpleIdObject.id);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationSimpleIdObject {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
