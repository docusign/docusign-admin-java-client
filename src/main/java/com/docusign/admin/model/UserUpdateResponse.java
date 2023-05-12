package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * UserUpdateResponse.
 *
 */

public class UserUpdateResponse {
  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("site_id")
  private Integer siteId = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("error_details")
  private ErrorDetails errorDetails = null;


  /**
   * id.
   *
   * @return UserUpdateResponse
   **/
  public UserUpdateResponse id(java.util.UUID id) {
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
   * siteId.
   *
   * @return UserUpdateResponse
   **/
  public UserUpdateResponse siteId(Integer siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * Get siteId.
   * @return siteId
   **/
  @Schema(description = "")
  public Integer getSiteId() {
    return siteId;
  }

  /**
   * setSiteId.
   **/
  public void setSiteId(Integer siteId) {
    this.siteId = siteId;
  }


  /**
   * email.
   *
   * @return UserUpdateResponse
   **/
  public UserUpdateResponse email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email.
   * @return email
   **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  /**
   * setEmail.
   **/
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * errorDetails.
   *
   * @return UserUpdateResponse
   **/
  public UserUpdateResponse errorDetails(ErrorDetails errorDetails) {
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
    UserUpdateResponse userUpdateResponse = (UserUpdateResponse) o;
    return Objects.equals(this.id, userUpdateResponse.id) &&
        Objects.equals(this.siteId, userUpdateResponse.siteId) &&
        Objects.equals(this.email, userUpdateResponse.email) &&
        Objects.equals(this.errorDetails, userUpdateResponse.errorDetails);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, siteId, email, errorDetails);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdateResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

