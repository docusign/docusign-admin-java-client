package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.LinkResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * CertificateResponse.
 *
 */

public class CertificateResponse {
  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("issuer")
  private String issuer = null;

  @JsonProperty("thumbprint")
  private String thumbprint = null;

  @JsonProperty("expiration_date")
  private OffsetDateTime expirationDate = null;

  @JsonProperty("is_valid")
  private Boolean isValid = null;

  @JsonProperty("links")
  private java.util.List<LinkResponse> links = null;


  /**
   * id.
   *
   * @return CertificateResponse
   **/
  public CertificateResponse id(java.util.UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id.
   * @return id
   **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
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
   * issuer.
   *
   * @return CertificateResponse
   **/
  public CertificateResponse issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Get issuer.
   * @return issuer
   **/
  @ApiModelProperty(value = "")
  public String getIssuer() {
    return issuer;
  }

  /**
   * setIssuer.
   **/
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  /**
   * thumbprint.
   *
   * @return CertificateResponse
   **/
  public CertificateResponse thumbprint(String thumbprint) {
    this.thumbprint = thumbprint;
    return this;
  }

  /**
   * Get thumbprint.
   * @return thumbprint
   **/
  @ApiModelProperty(value = "")
  public String getThumbprint() {
    return thumbprint;
  }

  /**
   * setThumbprint.
   **/
  public void setThumbprint(String thumbprint) {
    this.thumbprint = thumbprint;
  }


  /**
   * expirationDate.
   *
   * @return CertificateResponse
   **/
  public CertificateResponse expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate.
   * @return expirationDate
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  /**
   * setExpirationDate.
   **/
  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  /**
   * Get isValid.
   * @return isValid
   **/
  @ApiModelProperty(value = "")
  public Boolean isIsValid() {
    return isValid;
  }


  /**
   * links.
   *
   * @return CertificateResponse
   **/
  public CertificateResponse links(java.util.List<LinkResponse> links) {
    this.links = links;
    return this;
  }
  
  /**
   * addLinksItem.
   *
   * @return CertificateResponse
   **/
  public CertificateResponse addLinksItem(LinkResponse linksItem) {
    if (this.links == null) {
      this.links = new java.util.ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links.
   * @return links
   **/
  @ApiModelProperty(value = "")
  public java.util.List<LinkResponse> getLinks() {
    return links;
  }

  /**
   * setLinks.
   **/
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
    CertificateResponse certificateResponse = (CertificateResponse) o;
    return Objects.equals(this.id, certificateResponse.id) &&
        Objects.equals(this.issuer, certificateResponse.issuer) &&
        Objects.equals(this.thumbprint, certificateResponse.thumbprint) &&
        Objects.equals(this.expirationDate, certificateResponse.expirationDate) &&
        Objects.equals(this.isValid, certificateResponse.isValid) &&
        Objects.equals(this.links, certificateResponse.links);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, issuer, thumbprint, expirationDate, isValid, links);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    thumbprint: ").append(toIndentedString(thumbprint)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
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

