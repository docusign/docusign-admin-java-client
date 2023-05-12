package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DeleteMembershipResponse.
 *
 */

public class DeleteMembershipResponse {
  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("error_details")
  private ErrorDetails errorDetails = null;


  /**
   * id.
   *
   * @return DeleteMembershipResponse
   **/
  public DeleteMembershipResponse id(java.util.UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id.
   * @return id
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getId() {
    return id;
  }

  /**
   * setId.
   **/
  public void setId(java.util.UUID id) {
    this.id = id;
  }


  /**
   * errorDetails.
   *
   * @return DeleteMembershipResponse
   **/
  public DeleteMembershipResponse errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails.
   * @return errorDetails
   **/
  @Schema(description = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
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
    DeleteMembershipResponse deleteMembershipResponse = (DeleteMembershipResponse) o;
    return Objects.equals(this.id, deleteMembershipResponse.id) &&
        Objects.equals(this.errorDetails, deleteMembershipResponse.errorDetails);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, errorDetails);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteMembershipResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

