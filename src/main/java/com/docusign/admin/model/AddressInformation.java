package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * AddressInformation.
 *
 */

public class AddressInformation implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("street_address")
  private String streetAddress = null;

  @JsonProperty("street_address_2")
  private String streetAddress2 = null;

  @JsonProperty("locality")
  private String locality = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("postal_code")
  private String postalCode = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("fax")
  private String fax = null;


  /**
   * streetAddress.
   *
   * @return AddressInformation
   **/
  public AddressInformation streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  /**
   * Get streetAddress.
   * @return streetAddress
   **/
  @Schema(description = "")
  public String getStreetAddress() {
    return streetAddress;
  }

  /**
   * setStreetAddress.
   **/
  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }


  /**
   * streetAddress2.
   *
   * @return AddressInformation
   **/
  public AddressInformation streetAddress2(String streetAddress2) {
    this.streetAddress2 = streetAddress2;
    return this;
  }

  /**
   * Get streetAddress2.
   * @return streetAddress2
   **/
  @Schema(description = "")
  public String getStreetAddress2() {
    return streetAddress2;
  }

  /**
   * setStreetAddress2.
   **/
  public void setStreetAddress2(String streetAddress2) {
    this.streetAddress2 = streetAddress2;
  }


  /**
   * locality.
   *
   * @return AddressInformation
   **/
  public AddressInformation locality(String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * Get locality.
   * @return locality
   **/
  @Schema(description = "")
  public String getLocality() {
    return locality;
  }

  /**
   * setLocality.
   **/
  public void setLocality(String locality) {
    this.locality = locality;
  }


  /**
   * region.
   *
   * @return AddressInformation
   **/
  public AddressInformation region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Get region.
   * @return region
   **/
  @Schema(description = "")
  public String getRegion() {
    return region;
  }

  /**
   * setRegion.
   **/
  public void setRegion(String region) {
    this.region = region;
  }


  /**
   * postalCode.
   *
   * @return AddressInformation
   **/
  public AddressInformation postalCode(String postalCode) {
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
   * country.
   *
   * @return AddressInformation
   **/
  public AddressInformation country(String country) {
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
   * phone.
   *
   * @return AddressInformation
   **/
  public AddressInformation phone(String phone) {
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
   * @return AddressInformation
   **/
  public AddressInformation fax(String fax) {
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
    AddressInformation addressInformation = (AddressInformation) o;
    return Objects.equals(this.streetAddress, addressInformation.streetAddress) &&
        Objects.equals(this.streetAddress2, addressInformation.streetAddress2) &&
        Objects.equals(this.locality, addressInformation.locality) &&
        Objects.equals(this.region, addressInformation.region) &&
        Objects.equals(this.postalCode, addressInformation.postalCode) &&
        Objects.equals(this.country, addressInformation.country) &&
        Objects.equals(this.phone, addressInformation.phone) &&
        Objects.equals(this.fax, addressInformation.fax);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(streetAddress, streetAddress2, locality, region, postalCode, country, phone, fax);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressInformation {\n");
    
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    streetAddress2: ").append(toIndentedString(streetAddress2)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
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

