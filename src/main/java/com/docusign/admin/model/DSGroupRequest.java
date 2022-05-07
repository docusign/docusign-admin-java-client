package com.docusign.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** DSGroupRequest. */
public class DSGroupRequest {
  @JsonProperty("ds_group_id")
  private java.util.UUID dsGroupId = null;

  /**
   * dsGroupId.
   *
   * @return DSGroupRequest
   */
  public DSGroupRequest dsGroupId(java.util.UUID dsGroupId) {
    this.dsGroupId = dsGroupId;
    return this;
  }

  /**
   * Get dsGroupId.
   *
   * @return dsGroupId
   */
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "")
  public java.util.UUID getDsGroupId() {
    return dsGroupId;
  }

  /** setDsGroupId. */
  public void setDsGroupId(java.util.UUID dsGroupId) {
    this.dsGroupId = dsGroupId;
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
    DSGroupRequest dsGroupRequest = (DSGroupRequest) o;
    return Objects.equals(this.dsGroupId, dsGroupRequest.dsGroupId);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(dsGroupId);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSGroupRequest {\n");

    sb.append("    dsGroupId: ").append(toIndentedString(dsGroupId)).append("\n");
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
