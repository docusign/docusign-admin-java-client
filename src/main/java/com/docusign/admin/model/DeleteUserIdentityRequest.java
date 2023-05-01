package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.UserIdentityRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DeleteUserIdentityRequest.
 *
 */

public class DeleteUserIdentityRequest {
  @JsonProperty("identities")
  private java.util.List<UserIdentityRequest> identities = new java.util.ArrayList<>();


  /**
   * identities.
   *
   * @return DeleteUserIdentityRequest
   **/
  public DeleteUserIdentityRequest identities(java.util.List<UserIdentityRequest> identities) {
    this.identities = identities;
    return this;
  }
  
  /**
   * addIdentitiesItem.
   *
   * @return DeleteUserIdentityRequest
   **/
  public DeleteUserIdentityRequest addIdentitiesItem(UserIdentityRequest identitiesItem) {
    this.identities.add(identitiesItem);
    return this;
  }

  /**
   * Get identities.
   * @return identities
   **/
  @ApiModelProperty(required = true, value = "")
  public java.util.List<UserIdentityRequest> getIdentities() {
    return identities;
  }

  /**
   * setIdentities.
   **/
  public void setIdentities(java.util.List<UserIdentityRequest> identities) {
    this.identities = identities;
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
    DeleteUserIdentityRequest deleteUserIdentityRequest = (DeleteUserIdentityRequest) o;
    return Objects.equals(this.identities, deleteUserIdentityRequest.identities);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(identities);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteUserIdentityRequest {\n");
    
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

