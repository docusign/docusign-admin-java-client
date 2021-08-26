package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.LinkResponse;
import com.docusign.admin.model.SettingResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DomainResponse
 */

public class DomainResponse {
  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("host_name")
  private String hostName = null;

  @JsonProperty("txt_token")
  private String txtToken = null;

  @JsonProperty("identity_provider_id")
  private java.util.UUID identityProviderId = null;

  @JsonProperty("settings")
  private java.util.List<SettingResponse> settings = null;

  @JsonProperty("links")
  private java.util.List<LinkResponse> links = null;

  public DomainResponse id(java.util.UUID id) {
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

  public DomainResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DomainResponse hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * Get hostName
   * @return hostName
  **/
  @ApiModelProperty(value = "")
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public DomainResponse txtToken(String txtToken) {
    this.txtToken = txtToken;
    return this;
  }

   /**
   * Get txtToken
   * @return txtToken
  **/
  @ApiModelProperty(value = "")
  public String getTxtToken() {
    return txtToken;
  }

  public void setTxtToken(String txtToken) {
    this.txtToken = txtToken;
  }

  public DomainResponse identityProviderId(java.util.UUID identityProviderId) {
    this.identityProviderId = identityProviderId;
    return this;
  }

   /**
   * Get identityProviderId
   * @return identityProviderId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getIdentityProviderId() {
    return identityProviderId;
  }

  public void setIdentityProviderId(java.util.UUID identityProviderId) {
    this.identityProviderId = identityProviderId;
  }

  public DomainResponse settings(java.util.List<SettingResponse> settings) {
    this.settings = settings;
    return this;
  }

  public DomainResponse addSettingsItem(SettingResponse settingsItem) {
    if (this.settings == null) {
      this.settings = new java.util.ArrayList<SettingResponse>();
    }
    this.settings.add(settingsItem);
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @ApiModelProperty(value = "")
  public java.util.List<SettingResponse> getSettings() {
    return settings;
  }

  public void setSettings(java.util.List<SettingResponse> settings) {
    this.settings = settings;
  }

  public DomainResponse links(java.util.List<LinkResponse> links) {
    this.links = links;
    return this;
  }

  public DomainResponse addLinksItem(LinkResponse linksItem) {
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
    DomainResponse domainResponse = (DomainResponse) o;
    return Objects.equals(this.id, domainResponse.id) &&
        Objects.equals(this.status, domainResponse.status) &&
        Objects.equals(this.hostName, domainResponse.hostName) &&
        Objects.equals(this.txtToken, domainResponse.txtToken) &&
        Objects.equals(this.identityProviderId, domainResponse.identityProviderId) &&
        Objects.equals(this.settings, domainResponse.settings) &&
        Objects.equals(this.links, domainResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, hostName, txtToken, identityProviderId, settings, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    txtToken: ").append(toIndentedString(txtToken)).append("\n");
    sb.append("    identityProviderId: ").append(toIndentedString(identityProviderId)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

