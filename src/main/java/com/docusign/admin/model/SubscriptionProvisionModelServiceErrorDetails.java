package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * SubscriptionProvisionModelServiceErrorDetails.
 *
 */

public class SubscriptionProvisionModelServiceErrorDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("ErrorCode")
  private String errorCode = null;

  @JsonProperty("PublicErrorCode")
  private String publicErrorCode = null;

  @JsonProperty("ErrorDescription")
  private String errorDescription = null;

  @JsonProperty("IsSystemError")
  private Boolean isSystemError = null;


  /**
   * errorCode.
   *
   * @return SubscriptionProvisionModelServiceErrorDetails
   **/
  public SubscriptionProvisionModelServiceErrorDetails errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode.
   * @return errorCode
   **/
  @Schema(description = "")
  public String getErrorCode() {
    return errorCode;
  }

  /**
   * setErrorCode.
   **/
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  /**
   * publicErrorCode.
   *
   * @return SubscriptionProvisionModelServiceErrorDetails
   **/
  public SubscriptionProvisionModelServiceErrorDetails publicErrorCode(String publicErrorCode) {
    this.publicErrorCode = publicErrorCode;
    return this;
  }

  /**
   * Get publicErrorCode.
   * @return publicErrorCode
   **/
  @Schema(description = "")
  public String getPublicErrorCode() {
    return publicErrorCode;
  }

  /**
   * setPublicErrorCode.
   **/
  public void setPublicErrorCode(String publicErrorCode) {
    this.publicErrorCode = publicErrorCode;
  }


  /**
   * errorDescription.
   *
   * @return SubscriptionProvisionModelServiceErrorDetails
   **/
  public SubscriptionProvisionModelServiceErrorDetails errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * Get errorDescription.
   * @return errorDescription
   **/
  @Schema(description = "")
  public String getErrorDescription() {
    return errorDescription;
  }

  /**
   * setErrorDescription.
   **/
  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


  /**
   * isSystemError.
   *
   * @return SubscriptionProvisionModelServiceErrorDetails
   **/
  public SubscriptionProvisionModelServiceErrorDetails isSystemError(Boolean isSystemError) {
    this.isSystemError = isSystemError;
    return this;
  }

  /**
   * Get isSystemError.
   * @return isSystemError
   **/
  @Schema(description = "")
  public Boolean isIsSystemError() {
    return isSystemError;
  }

  /**
   * setIsSystemError.
   **/
  public void setIsSystemError(Boolean isSystemError) {
    this.isSystemError = isSystemError;
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
    SubscriptionProvisionModelServiceErrorDetails subscriptionProvisionModelServiceErrorDetails = (SubscriptionProvisionModelServiceErrorDetails) o;
    return Objects.equals(this.errorCode, subscriptionProvisionModelServiceErrorDetails.errorCode) &&
        Objects.equals(this.publicErrorCode, subscriptionProvisionModelServiceErrorDetails.publicErrorCode) &&
        Objects.equals(this.errorDescription, subscriptionProvisionModelServiceErrorDetails.errorDescription) &&
        Objects.equals(this.isSystemError, subscriptionProvisionModelServiceErrorDetails.isSystemError);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(errorCode, publicErrorCode, errorDescription, isSystemError);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProvisionModelServiceErrorDetails {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    publicErrorCode: ").append(toIndentedString(publicErrorCode)).append("\n");
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

