package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * DSGroupRequest.
 *
 */

public class DSGroupRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("ds_group_id")
  private java.util.UUID dsGroupId = null;


  /**
   * dsGroupId.
   *
   * @return DSGroupRequest
   **/
  public DSGroupRequest dsGroupId(java.util.UUID dsGroupId) {
    this.dsGroupId = dsGroupId;
    return this;
  }

  /**
   * Get dsGroupId.
   * @return dsGroupId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", required = true, description = "")
  public java.util.UUID getDsGroupId() {
    return dsGroupId;
  }

  /**
   * setDsGroupId.
   **/
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(dsGroupId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSGroupRequest {\n");
    
    sb.append("    dsGroupId: ").append(toIndentedString(dsGroupId)).append("\n");
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

