package com.docusign.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** IdentityProviderResponse. */
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

  /**
   * id.
   *
   * @return IdentityProviderResponse
   */
  public IdentityProviderResponse id(java.util.UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id.
   *
   * @return id
   */
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getId() {
    return id;
  }

  /** setId. */
  public void setId(java.util.UUID id) {
    this.id = id;
  }

  /**
   * friendlyName.
   *
   * @return IdentityProviderResponse
   */
  public IdentityProviderResponse friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

  /**
   * Get friendlyName.
   *
   * @return friendlyName
   */
  @ApiModelProperty(value = "")
  public String getFriendlyName() {
    return friendlyName;
  }

  /** setFriendlyName. */
  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  /**
   * autoProvisionUsers.
   *
   * @return IdentityProviderResponse
   */
  public IdentityProviderResponse autoProvisionUsers(Boolean autoProvisionUsers) {
    this.autoProvisionUsers = autoProvisionUsers;
    return this;
  }

  /**
   * Get autoProvisionUsers.
   *
   * @return autoProvisionUsers
   */
  @ApiModelProperty(value = "")
  public Boolean isAutoProvisionUsers() {
    return autoProvisionUsers;
  }

  /** setAutoProvisionUsers. */
  public void setAutoProvisionUsers(Boolean autoProvisionUsers) {
    this.autoProvisionUsers = autoProvisionUsers;
  }

  /**
   * type.
   *
   * @return IdentityProviderResponse
   */
  public IdentityProviderResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   *
   * @return type
   */
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  /** setType. */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * saml20.
   *
   * @return IdentityProviderResponse
   */
  public IdentityProviderResponse saml20(Saml2IdentityProviderResponse saml20) {
    this.saml20 = saml20;
    return this;
  }

  /**
   * Get saml20.
   *
   * @return saml20
   */
  @ApiModelProperty(value = "")
  public Saml2IdentityProviderResponse getSaml20() {
    return saml20;
  }

  /** setSaml20. */
  public void setSaml20(Saml2IdentityProviderResponse saml20) {
    this.saml20 = saml20;
  }

  /**
   * links.
   *
   * @return IdentityProviderResponse
   */
  public IdentityProviderResponse links(java.util.List<LinkResponse> links) {
    this.links = links;
    return this;
  }

  /**
   * addLinksItem.
   *
   * @return IdentityProviderResponse
   */
  public IdentityProviderResponse addLinksItem(LinkResponse linksItem) {
    if (this.links == null) {
      this.links = new java.util.ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links.
   *
   * @return links
   */
  @ApiModelProperty(value = "")
  public java.util.List<LinkResponse> getLinks() {
    return links;
  }

  /** setLinks. */
  public void setLinks(java.util.List<LinkResponse> links) {
    this.links = links;
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
    IdentityProviderResponse identityProviderResponse = (IdentityProviderResponse) o;
    return Objects.equals(this.id, identityProviderResponse.id)
        && Objects.equals(this.friendlyName, identityProviderResponse.friendlyName)
        && Objects.equals(this.autoProvisionUsers, identityProviderResponse.autoProvisionUsers)
        && Objects.equals(this.type, identityProviderResponse.type)
        && Objects.equals(this.saml20, identityProviderResponse.saml20)
        && Objects.equals(this.links, identityProviderResponse.links);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(id, friendlyName, autoProvisionUsers, type, saml20, links);
  }

  /** Converts the given object to string. */
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
