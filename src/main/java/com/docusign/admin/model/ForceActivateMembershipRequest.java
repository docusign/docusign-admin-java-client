package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ForceActivateMembershipRequest.
 *
 */

public class ForceActivateMembershipRequest {
  @JsonProperty("site_id")
  private Integer siteId = null;


  /**
   * siteId.
   *
   * @return ForceActivateMembershipRequest
   **/
  public ForceActivateMembershipRequest siteId(Integer siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * Get siteId.
   * @return siteId
   **/
  @Schema(required = true, description = "")
  public Integer getSiteId() {
    return siteId;
  }

  /**
   * setSiteId.
   **/
  public void setSiteId(Integer siteId) {
    this.siteId = siteId;
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
    ForceActivateMembershipRequest forceActivateMembershipRequest = (ForceActivateMembershipRequest) o;
    return Objects.equals(this.siteId, forceActivateMembershipRequest.siteId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(siteId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForceActivateMembershipRequest {\n");
    
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
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

