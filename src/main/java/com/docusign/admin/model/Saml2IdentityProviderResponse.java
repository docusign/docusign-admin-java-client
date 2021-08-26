package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.CertificateResponse;
import com.docusign.admin.model.RequiredAttributeMappingResponse;
import com.docusign.admin.model.SettingResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Saml2IdentityProviderResponse
 */

public class Saml2IdentityProviderResponse {
  @JsonProperty("issuer")
  private String issuer = null;

  @JsonProperty("settings")
  private java.util.List<SettingResponse> settings = null;

  @JsonProperty("certificates")
  private java.util.List<CertificateResponse> certificates = null;

  @JsonProperty("attribute_mappings")
  private java.util.List<RequiredAttributeMappingResponse> attributeMappings = null;

  public Saml2IdentityProviderResponse issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @ApiModelProperty(value = "")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public Saml2IdentityProviderResponse settings(java.util.List<SettingResponse> settings) {
    this.settings = settings;
    return this;
  }

  public Saml2IdentityProviderResponse addSettingsItem(SettingResponse settingsItem) {
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

  public Saml2IdentityProviderResponse certificates(java.util.List<CertificateResponse> certificates) {
    this.certificates = certificates;
    return this;
  }

  public Saml2IdentityProviderResponse addCertificatesItem(CertificateResponse certificatesItem) {
    if (this.certificates == null) {
      this.certificates = new java.util.ArrayList<CertificateResponse>();
    }
    this.certificates.add(certificatesItem);
    return this;
  }

   /**
   * Get certificates
   * @return certificates
  **/
  @ApiModelProperty(value = "")
  public java.util.List<CertificateResponse> getCertificates() {
    return certificates;
  }

  public void setCertificates(java.util.List<CertificateResponse> certificates) {
    this.certificates = certificates;
  }

  public Saml2IdentityProviderResponse attributeMappings(java.util.List<RequiredAttributeMappingResponse> attributeMappings) {
    this.attributeMappings = attributeMappings;
    return this;
  }

  public Saml2IdentityProviderResponse addAttributeMappingsItem(RequiredAttributeMappingResponse attributeMappingsItem) {
    if (this.attributeMappings == null) {
      this.attributeMappings = new java.util.ArrayList<RequiredAttributeMappingResponse>();
    }
    this.attributeMappings.add(attributeMappingsItem);
    return this;
  }

   /**
   * Get attributeMappings
   * @return attributeMappings
  **/
  @ApiModelProperty(value = "")
  public java.util.List<RequiredAttributeMappingResponse> getAttributeMappings() {
    return attributeMappings;
  }

  public void setAttributeMappings(java.util.List<RequiredAttributeMappingResponse> attributeMappings) {
    this.attributeMappings = attributeMappings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Saml2IdentityProviderResponse saml2IdentityProviderResponse = (Saml2IdentityProviderResponse) o;
    return Objects.equals(this.issuer, saml2IdentityProviderResponse.issuer) &&
        Objects.equals(this.settings, saml2IdentityProviderResponse.settings) &&
        Objects.equals(this.certificates, saml2IdentityProviderResponse.certificates) &&
        Objects.equals(this.attributeMappings, saml2IdentityProviderResponse.attributeMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuer, settings, certificates, attributeMappings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Saml2IdentityProviderResponse {\n");
    
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
    sb.append("    attributeMappings: ").append(toIndentedString(attributeMappings)).append("\n");
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

