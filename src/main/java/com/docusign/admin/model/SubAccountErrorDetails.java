package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * SubAccountErrorDetails.
 *
 */

public class SubAccountErrorDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("error")
  private String error = null;

  @JsonProperty("errorDescription")
  private String errorDescription = null;

  @JsonProperty("isSystemError")
  private Boolean isSystemError = null;

  /**
   * The error code..
   * @return error
   **/
  @Schema(description = "The error code.")
  public String getError() {
    return error;
  }

  /**
   * The error description..
   * @return errorDescription
   **/
  @Schema(description = "The error description.")
  public String getErrorDescription() {
    return errorDescription;
  }

  /**
   * Whether the error is caused by the system or user..
   * @return isSystemError
   **/
  @Schema(description = "Whether the error is caused by the system or user.")
  public Boolean isIsSystemError() {
    return isSystemError;
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
    SubAccountErrorDetails subAccountErrorDetails = (SubAccountErrorDetails) o;
    return Objects.equals(this.error, subAccountErrorDetails.error) &&
        Objects.equals(this.errorDescription, subAccountErrorDetails.errorDescription) &&
        Objects.equals(this.isSystemError, subAccountErrorDetails.isSystemError);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(error, errorDescription, isSystemError);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubAccountErrorDetails {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    isSystemError: ").append(toIndentedString(isSystemError)).append("\n");
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

