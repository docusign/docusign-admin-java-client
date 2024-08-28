package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * MembershipDataRedactionRequest.
 *
 */

public class MembershipDataRedactionRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("account_id")
  private java.util.UUID accountId = null;


  /**
   * accountId.
   *
   * @return MembershipDataRedactionRequest
   **/
  public MembershipDataRedactionRequest accountId(java.util.UUID accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId.
   * @return accountId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getAccountId() {
    return accountId;
  }

  /**
   * setAccountId.
   **/
  public void setAccountId(java.util.UUID accountId) {
    this.accountId = accountId;
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
    MembershipDataRedactionRequest membershipDataRedactionRequest = (MembershipDataRedactionRequest) o;
    return Objects.equals(this.accountId, membershipDataRedactionRequest.accountId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MembershipDataRedactionRequest {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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

