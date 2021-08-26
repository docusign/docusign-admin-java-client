package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserIdentityResponse
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

  public UserIdentityResponse id(java.util.UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getId() {
    return id;
  }

  public void setId(java.util.UUID id) {
    this.id = id;
  }

  public UserIdentityResponse providerId(java.util.UUID providerId) {
    this.providerId = providerId;
    return this;
  }

   /**
   * Get providerId
   * @return providerId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getProviderId() {
    return providerId;
  }

  public void setProviderId(java.util.UUID providerId) {
    this.providerId = providerId;
  }

  public UserIdentityResponse userId(java.util.UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getUserId() {
    return userId;
  }

  public void setUserId(java.util.UUID userId) {
    this.userId = userId;
  }

  public UserIdentityResponse immutableId(String immutableId) {
    this.immutableId = immutableId;
    return this;
  }

   /**
   * Get immutableId
   * @return immutableId
  **/
  @ApiModelProperty(value = "")
  public String getImmutableId() {
    return immutableId;
  }

  public void setImmutableId(String immutableId) {
    this.immutableId = immutableId;
  }

  public UserIdentityResponse errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(id, providerId, userId, immutableId, errorDetails);
  }


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

