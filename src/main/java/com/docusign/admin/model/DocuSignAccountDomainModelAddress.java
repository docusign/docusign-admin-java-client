package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * DocuSignAccountDomainModelAddress.
 *
 */

public class DocuSignAccountDomainModelAddress implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("Address1")
  private String address1 = null;

  @JsonProperty("Address2")
  private String address2 = null;

  @JsonProperty("City")
  private String city = null;

  @JsonProperty("StateProvince")
  private String stateProvince = null;

  @JsonProperty("Country")
  private String country = null;

  @JsonProperty("PostalCode")
  private String postalCode = null;

  @JsonProperty("Phone")
  private String phone = null;

  @JsonProperty("Fax")
  private String fax = null;

  @JsonProperty("ZipPlus4")
  private String zipPlus4 = null;


  /**
   * address1.
   *
   * @return DocuSignAccountDomainModelAddress
   **/
  public DocuSignAccountDomainModelAddress address1(String address1) {
    this.address1 = address1;
    return this;
  }

  /**
   * Get address1.
   * @return address1
   **/
  @Schema(description = "")
  public String getAddress1() {
    return address1;
  }

  /**
   * setAddress1.
   **/
  public void setAddress1(String address1) {
    this.address1 = address1;
  }


  /**
   * address2.
   *
   * @return DocuSignAccountDomainModelAddress
   **/
  public DocuSignAccountDomainModelAddress address2(String address2) {
    this.address2 = address2;
    return this;
  }

  /**
   * Get address2.
   * @return address2
   **/
  @Schema(description = "")
  public String getAddress2() {
    return address2;
  }

  /**
   * setAddress2.
   **/
  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  /**
   * city.
   *
   * @return DocuSignAccountDomainModelAddress
   **/
  public DocuSignAccountDomainModelAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city.
   * @return city
   **/
  @Schema(description = "")
  public String getCity() {
    return city;
  }

  /**
   * setCity.
   **/
  public void setCity(String city) {
    this.city = city;
  }


  /**
   * stateProvince.
   *
   * @return DocuSignAccountDomainModelAddress
   **/
  public DocuSignAccountDomainModelAddress stateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
    return this;
  }

  /**
   * Get stateProvince.
   * @return stateProvince
   **/
  @Schema(description = "")
  public String getStateProvince() {
    return stateProvince;
  }

  /**
   * setStateProvince.
   **/
  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }


  /**
   * country.
   *
   * @return DocuSignAccountDomainModelAddress
   **/
  public DocuSignAccountDomainModelAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country.
   * @return country
   **/
  @Schema(description = "")
  public String getCountry() {
    return country;
  }

  /**
   * setCountry.
   **/
  public void setCountry(String country) {
    this.country = country;
  }


  /**
   * postalCode.
   *
   * @return DocuSignAccountDomainModelAddress
   **/
  public DocuSignAccountDomainModelAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Get postalCode.
   * @return postalCode
   **/
  @Schema(description = "")
  public String getPostalCode() {
    return postalCode;
  }

  /**
   * setPostalCode.
   **/
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  /**
   * phone.
   *
   * @return DocuSignAccountDomainModelAddress
   **/
  public DocuSignAccountDomainModelAddress phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone.
   * @return phone
   **/
  @Schema(description = "")
  public String getPhone() {
    return phone;
  }

  /**
   * setPhone.
   **/
  public void setPhone(String phone) {
    this.phone = phone;
  }


  /**
   * fax.
   *
   * @return DocuSignAccountDomainModelAddress
   **/
  public DocuSignAccountDomainModelAddress fax(String fax) {
    this.fax = fax;
    return this;
  }

  /**
   * Get fax.
   * @return fax
   **/
  @Schema(description = "")
  public String getFax() {
    return fax;
  }

  /**
   * setFax.
   **/
  public void setFax(String fax) {
    this.fax = fax;
  }


  /**
   * zipPlus4.
   *
   * @return DocuSignAccountDomainModelAddress
   **/
  public DocuSignAccountDomainModelAddress zipPlus4(String zipPlus4) {
    this.zipPlus4 = zipPlus4;
    return this;
  }

  /**
   * Get zipPlus4.
   * @return zipPlus4
   **/
  @Schema(description = "")
  public String getZipPlus4() {
    return zipPlus4;
  }

  /**
   * setZipPlus4.
   **/
  public void setZipPlus4(String zipPlus4) {
    this.zipPlus4 = zipPlus4;
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
    DocuSignAccountDomainModelAddress docuSignAccountDomainModelAddress = (DocuSignAccountDomainModelAddress) o;
    return Objects.equals(this.address1, docuSignAccountDomainModelAddress.address1) &&
        Objects.equals(this.address2, docuSignAccountDomainModelAddress.address2) &&
        Objects.equals(this.city, docuSignAccountDomainModelAddress.city) &&
        Objects.equals(this.stateProvince, docuSignAccountDomainModelAddress.stateProvince) &&
        Objects.equals(this.country, docuSignAccountDomainModelAddress.country) &&
        Objects.equals(this.postalCode, docuSignAccountDomainModelAddress.postalCode) &&
        Objects.equals(this.phone, docuSignAccountDomainModelAddress.phone) &&
        Objects.equals(this.fax, docuSignAccountDomainModelAddress.fax) &&
        Objects.equals(this.zipPlus4, docuSignAccountDomainModelAddress.zipPlus4);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, stateProvince, country, postalCode, phone, fax, zipPlus4);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocuSignAccountDomainModelAddress {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    zipPlus4: ").append(toIndentedString(zipPlus4)).append("\n");
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

