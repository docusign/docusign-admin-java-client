package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * UserIdentityResponse.
 *
 */

public class UserIdentityResponse {
  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("provider_id")
  private java.util.UUID providerId = null;

  @JsonProperty("user_id")
  private java.util.UUID userId = null;

  @JsonProperty("immutable_id")
  private String immutableId = null;

  @JsonProperty("error_details")
  private ErrorDetails errorDetails = null;


  /**
   * id.
   *
   * @return UserIdentityResponse
   **/
  public UserIdentityResponse id(java.util.UUID id) {
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
   * providerId.
   *
   * @return UserIdentityResponse
   **/
  public UserIdentityResponse providerId(java.util.UUID providerId) {
    this.providerId = providerId;
    return this;
  }

  /**
   * Get providerId.
   * @return providerId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getProviderId() {
    return providerId;
  }

  /**
   * setProviderId.
   **/
  public void setProviderId(java.util.UUID providerId) {
    this.providerId = providerId;
  }


  /**
   * userId.
   *
   * @return UserIdentityResponse
   **/
  public UserIdentityResponse userId(java.util.UUID userId) {
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
   * immutableId.
   *
   * @return UserIdentityResponse
   **/
  public UserIdentityResponse immutableId(String immutableId) {
    this.immutableId = immutableId;
    return this;
  }

  /**
   * Get immutableId.
   * @return immutableId
   **/
  @Schema(description = "")
  public String getImmutableId() {
    return immutableId;
  }

  /**
   * setImmutableId.
   **/
  public void setImmutableId(String immutableId) {
    this.immutableId = immutableId;
  }


  /**
   * errorDetails.
   *
   * @return UserIdentityResponse
   **/
  public UserIdentityResponse errorDetails(ErrorDetails errorDetails) {
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
    UserIdentityResponse userIdentityResponse = (UserIdentityResponse) o;
    return Objects.equals(this.id, userIdentityResponse.id) &&
        Objects.equals(this.providerId, userIdentityResponse.providerId) &&
        Objects.equals(this.userId, userIdentityResponse.userId) &&
        Objects.equals(this.immutableId, userIdentityResponse.immutableId) &&
        Objects.equals(this.errorDetails, userIdentityResponse.errorDetails);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, providerId, userId, immutableId, errorDetails);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserIdentityResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    immutableId: ").append(toIndentedString(immutableId)).append("\n");
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

