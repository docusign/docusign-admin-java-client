package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.LinkResponse;
import com.docusign.admin.model.Saml2IdentityProviderResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * IdentityProviderResponse
 */

public class IdentityProviderResponse {
  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("friendly_name")
  private String friendlyName = null;

  @JsonProperty("auto_provision_users")
  private Boolean autoProvisionUsers = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("saml_20")
  private Saml2IdentityProviderResponse saml20 = null;

  @JsonProperty("links")
  private java.util.List<LinkResponse> links = null;

  public IdentityProviderResponse id(java.util.UUID id) {
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

  public IdentityProviderResponse friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

   /**
   * Get friendlyName
   * @return friendlyName
  **/
  @ApiModelProperty(value = "")
  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  public IdentityProviderResponse autoProvisionUsers(Boolean autoProvisionUsers) {
    this.autoProvisionUsers = autoProvisionUsers;
    return this;
  }

   /**
   * Get autoProvisionUsers
   * @return autoProvisionUsers
  **/
  @ApiModelProperty(value = "")
  public Boolean isAutoProvisionUsers() {
    return autoProvisionUsers;
  }

  public void setAutoProvisionUsers(Boolean autoProvisionUsers) {
    this.autoProvisionUsers = autoProvisionUsers;
  }

  public IdentityProviderResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IdentityProviderResponse saml20(Saml2IdentityProviderResponse saml20) {
    this.saml20 = saml20;
    return this;
  }

   /**
   * Get saml20
   * @return saml20
  **/
  @ApiModelProperty(value = "")
  public Saml2IdentityProviderResponse getSaml20() {
    return saml20;
  }

  public void setSaml20(Saml2IdentityProviderResponse saml20) {
    this.saml20 = saml20;
  }

  public IdentityProviderResponse links(java.util.List<LinkResponse> links) {
    this.links = links;
    return this;
  }

  public IdentityProviderResponse addLinksItem(LinkResponse linksItem) {
    if (this.links == null) {
      this.links = new java.util.ArrayList<LinkResponse>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public java.util.List<LinkResponse> getLinks() {
    return links;
  }

  public void setLinks(java.util.List<LinkResponse> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityProviderResponse identityProviderResponse = (IdentityProviderResponse) o;
    return Objects.equals(this.id, identityProviderResponse.id) &&
        Objects.equals(this.friendlyName, identityProviderResponse.friendlyName) &&
        Objects.equals(this.autoProvisionUsers, identityProviderResponse.autoProvisionUsers) &&
        Objects.equals(this.type, identityProviderResponse.type) &&
        Objects.equals(this.saml20, identityProviderResponse.saml20) &&
        Objects.equals(this.links, identityProviderResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, friendlyName, autoProvisionUsers, type, saml20, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityProviderResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    autoProvisionUsers: ").append(toIndentedString(autoProvisionUsers)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    saml20: ").append(toIndentedString(saml20)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

