package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.MembershipDataRedactionRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * IndividualUserDataRedactionRequest.
 *
 */

public class IndividualUserDataRedactionRequest {
  @JsonProperty("user_id")
  private java.util.UUID userId = null;

  @JsonProperty("memberships")
  private java.util.List<MembershipDataRedactionRequest> memberships = null;


  /**
   * userId.
   *
   * @return IndividualUserDataRedactionRequest
   **/
  public IndividualUserDataRedactionRequest userId(java.util.UUID userId) {
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
   * memberships.
   *
   * @return IndividualUserDataRedactionRequest
   **/
  public IndividualUserDataRedactionRequest memberships(java.util.List<MembershipDataRedactionRequest> memberships) {
    this.memberships = memberships;
    return this;
  }
  
  /**
   * addMembershipsItem.
   *
   * @return IndividualUserDataRedactionRequest
   **/
  public IndividualUserDataRedactionRequest addMembershipsItem(MembershipDataRedactionRequest membershipsItem) {
    if (this.memberships == null) {
      this.memberships = new java.util.ArrayList<>();
    }
    this.memberships.add(membershipsItem);
    return this;
  }

  /**
   * Get memberships.
   * @return memberships
   **/
  @Schema(description = "")
  public java.util.List<MembershipDataRedactionRequest> getMemberships() {
    return memberships;
  }

  /**
   * setMemberships.
   **/
  public void setMemberships(java.util.List<MembershipDataRedactionRequest> memberships) {
    this.memberships = memberships;
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
    IndividualUserDataRedactionRequest individualUserDataRedactionRequest = (IndividualUserDataRedactionRequest) o;
    return Objects.equals(this.userId, individualUserDataRedactionRequest.userId) &&
        Objects.equals(this.memberships, individualUserDataRedactionRequest.memberships);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(userId, memberships);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualUserDataRedactionRequest {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    memberships: ").append(toIndentedString(memberships)).append("\n");
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

