package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.IdentityProviderResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * IdentityProvidersResponse
 */

public class IdentityProvidersResponse {
  @JsonProperty("identity_providers")
  private java.util.List<IdentityProviderResponse> identityProviders = null;

  public IdentityProvidersResponse identityProviders(java.util.List<IdentityProviderResponse> identityProviders) {
    this.identityProviders = identityProviders;
    return this;
  }

  public IdentityProvidersResponse addIdentityProvidersItem(IdentityProviderResponse identityProvidersItem) {
    if (this.identityProviders == null) {
      this.identityProviders = new java.util.ArrayList<IdentityProviderResponse>();
    }
    this.identityProviders.add(identityProvidersItem);
    return this;
  }

   /**
   * Get identityProviders
   * @return identityProviders
  **/
  @ApiModelProperty(value = "")
  public java.util.List<IdentityProviderResponse> getIdentityProviders() {
    return identityProviders;
  }

  public void setIdentityProviders(java.util.List<IdentityProviderResponse> identityProviders) {
    this.identityProviders = identityProviders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityProvidersResponse identityProvidersResponse = (IdentityProvidersResponse) o;
    return Objects.equals(this.identityProviders, identityProvidersResponse.identityProviders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityProviders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityProvidersResponse {\n");
    
    sb.append("    identityProviders: ").append(toIndentedString(identityProviders)).append("\n");
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

