package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * ErrorDetail.
 *
 */

public class ErrorDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("referenceId")
  private String referenceId = null;


  /**
   * errorMessage.
   *
   * @return ErrorDetail
   **/
  public ErrorDetail errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage.
   * @return errorMessage
   **/
  @Schema(description = "")
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * setErrorMessage.
   **/
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  /**
   * referenceId.
   *
   * @return ErrorDetail
   **/
  public ErrorDetail referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Get referenceId.
   * @return referenceId
   **/
  @Schema(description = "")
  public String getReferenceId() {
    return referenceId;
  }

  /**
   * setReferenceId.
   **/
  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
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
    ErrorDetail errorDetail = (ErrorDetail) o;
    return Objects.equals(this.errorMessage, errorDetail.errorMessage) &&
        Objects.equals(this.referenceId, errorDetail.referenceId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, referenceId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetail {\n");
    
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
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

