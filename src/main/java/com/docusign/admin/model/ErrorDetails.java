package com.docusign.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ErrorDetails. */
public class ErrorDetails {
  @JsonProperty("error")
  private String error = null;

  @JsonProperty("error_description")
  private String errorDescription = null;

  /**
   * error.
   *
   * @return ErrorDetails
   */
  public ErrorDetails error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error.
   *
   * @return error
   */
  @ApiModelProperty(value = "")
  public String getError() {
    return error;
  }

  /** setError. */
  public void setError(String error) {
    this.error = error;
  }

  /**
   * errorDescription.
   *
   * @return ErrorDetails
   */
  public ErrorDetails errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * Get errorDescription.
   *
   * @return errorDescription
   */
  @ApiModelProperty(value = "")
  public String getErrorDescription() {
    return errorDescription;
  }

  /** setErrorDescription. */
  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
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
    ErrorDetails errorDetails = (ErrorDetails) o;
    return Objects.equals(this.error, errorDetails.error)
        && Objects.equals(this.errorDescription, errorDetails.errorDescription);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(error, errorDescription);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetails {\n");

    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
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
