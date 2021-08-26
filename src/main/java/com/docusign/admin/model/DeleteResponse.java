package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.UserIdentityResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DeleteResponse
 */

public class DeleteResponse {
  @JsonProperty("success")
  private Boolean success = null;

  @JsonProperty("identities")
  private java.util.List<UserIdentityResponse> identities = null;

  public DeleteResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(value = "")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public DeleteResponse identities(java.util.List<UserIdentityResponse> identities) {
    this.identities = identities;
    return this;
  }

  public DeleteResponse addIdentitiesItem(UserIdentityResponse identitiesItem) {
    if (this.identities == null) {
      this.identities = new java.util.ArrayList<UserIdentityResponse>();
    }
    this.identities.add(identitiesItem);
    return this;
  }

   /**
   * Get identities
   * @return identities
  **/
  @ApiModelProperty(value = "")
  public java.util.List<UserIdentityResponse> getIdentities() {
    return identities;
  }

  public void setIdentities(java.util.List<UserIdentityResponse> identities) {
    this.identities = identities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteResponse deleteResponse = (DeleteResponse) o;
    return Objects.equals(this.success, deleteResponse.success) &&
        Objects.equals(this.identities, deleteResponse.identities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, identities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteResponse {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    identities: ").append(toIndentedString(identities)).append("\n");
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

