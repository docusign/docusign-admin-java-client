package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.MembershipDataRedactionResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * IndividualUserDataRedactionResponse.
 *
 */

public class IndividualUserDataRedactionResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("user_id")
  private java.util.UUID userId = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    UNKNOWN("unknown"),
    
    PENDING("pending"),
    
    FAILURE("failure"),
    
    SUCCESS("success"),
    
    ALREADY_REDACTED("already_redacted");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("membership_results")
  private java.util.List<MembershipDataRedactionResponse> membershipResults = null;

  /**
   * Get userId.
   * @return userId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getUserId() {
    return userId;
  }

  /**
   * Get status.
   * @return status
   **/
  @Schema(description = "")
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * Get membershipResults.
   * @return membershipResults
   **/
  @Schema(description = "")
  public java.util.List<MembershipDataRedactionResponse> getMembershipResults() {
    return membershipResults;
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
    IndividualUserDataRedactionResponse individualUserDataRedactionResponse = (IndividualUserDataRedactionResponse) o;
    return Objects.equals(this.userId, individualUserDataRedactionResponse.userId) &&
        Objects.equals(this.status, individualUserDataRedactionResponse.status) &&
        Objects.equals(this.membershipResults, individualUserDataRedactionResponse.membershipResults);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(userId, status, membershipResults);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualUserDataRedactionResponse {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    membershipResults: ").append(toIndentedString(membershipResults)).append("\n");
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

