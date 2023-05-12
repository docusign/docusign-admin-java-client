package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * IndividualMembershipDataRedactionRequest.
 *
 */

public class IndividualMembershipDataRedactionRequest {
  @JsonProperty("user_id")
  private java.util.UUID userId = null;


  /**
   * userId.
   *
   * @return IndividualMembershipDataRedactionRequest
   **/
  public IndividualMembershipDataRedactionRequest userId(java.util.UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId.
   * @return userId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getUserId() {
    return userId;
  }

  /**
   * setUserId.
   **/
  public void setUserId(java.util.UUID userId) {
    this.userId = userId;
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
    IndividualMembershipDataRedactionRequest individualMembershipDataRedactionRequest = (IndividualMembershipDataRedactionRequest) o;
    return Objects.equals(this.userId, individualMembershipDataRedactionRequest.userId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(userId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualMembershipDataRedactionRequest {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

