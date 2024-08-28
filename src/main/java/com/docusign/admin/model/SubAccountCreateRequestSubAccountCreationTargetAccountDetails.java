package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.AddressInformation;
import com.docusign.admin.model.SubAccountCreateRequestSubAccountCreationTargetAccountAdmin;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * SubAccountCreateRequestSubAccountCreationTargetAccountDetails.
 *
 */

public class SubAccountCreateRequestSubAccountCreationTargetAccountDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("address")
  private AddressInformation address = null;

  @JsonProperty("admin")
  private SubAccountCreateRequestSubAccountCreationTargetAccountAdmin admin = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("site")
  private String site = null;


  /**
   * id.
   *
   * @return SubAccountCreateRequestSubAccountCreationTargetAccountDetails
   **/
  public SubAccountCreateRequestSubAccountCreationTargetAccountDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id.
   * @return id
   **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  /**
   * setId.
   **/
  public void setId(String id) {
    this.id = id;
  }


  /**
   * address.
   *
   * @return SubAccountCreateRequestSubAccountCreationTargetAccountDetails
   **/
  public SubAccountCreateRequestSubAccountCreationTargetAccountDetails address(AddressInformation address) {
    this.address = address;
    return this;
  }

  /**
   * Get address.
   * @return address
   **/
  @Schema(description = "")
  public AddressInformation getAddress() {
    return address;
  }

  /**
   * setAddress.
   **/
  public void setAddress(AddressInformation address) {
    this.address = address;
  }


  /**
   * admin.
   *
   * @return SubAccountCreateRequestSubAccountCreationTargetAccountDetails
   **/
  public SubAccountCreateRequestSubAccountCreationTargetAccountDetails admin(SubAccountCreateRequestSubAccountCreationTargetAccountAdmin admin) {
    this.admin = admin;
    return this;
  }

  /**
   * Get admin.
   * @return admin
   **/
  @Schema(description = "")
  public SubAccountCreateRequestSubAccountCreationTargetAccountAdmin getAdmin() {
    return admin;
  }

  /**
   * setAdmin.
   **/
  public void setAdmin(SubAccountCreateRequestSubAccountCreationTargetAccountAdmin admin) {
    this.admin = admin;
  }


  /**
   * name.
   *
   * @return SubAccountCreateRequestSubAccountCreationTargetAccountDetails
   **/
  public SubAccountCreateRequestSubAccountCreationTargetAccountDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * countryCode.
   *
   * @return SubAccountCreateRequestSubAccountCreationTargetAccountDetails
   **/
  public SubAccountCreateRequestSubAccountCreationTargetAccountDetails countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode.
   * @return countryCode
   **/
  @Schema(description = "")
  public String getCountryCode() {
    return countryCode;
  }

  /**
   * setCountryCode.
   **/
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  /**
   * region.
   *
   * @return SubAccountCreateRequestSubAccountCreationTargetAccountDetails
   **/
  public SubAccountCreateRequestSubAccountCreationTargetAccountDetails region(String region) {
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
   * site.
   *
   * @return SubAccountCreateRequestSubAccountCreationTargetAccountDetails
   **/
  public SubAccountCreateRequestSubAccountCreationTargetAccountDetails site(String site) {
    this.site = site;
    return this;
  }

  /**
   * Get site.
   * @return site
   **/
  @Schema(description = "")
  public String getSite() {
    return site;
  }

  /**
   * setSite.
   **/
  public void setSite(String site) {
    this.site = site;
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
    SubAccountCreateRequestSubAccountCreationTargetAccountDetails subAccountCreateRequestSubAccountCreationTargetAccountDetails = (SubAccountCreateRequestSubAccountCreationTargetAccountDetails) o;
    return Objects.equals(this.id, subAccountCreateRequestSubAccountCreationTargetAccountDetails.id) &&
        Objects.equals(this.address, subAccountCreateRequestSubAccountCreationTargetAccountDetails.address) &&
        Objects.equals(this.admin, subAccountCreateRequestSubAccountCreationTargetAccountDetails.admin) &&
        Objects.equals(this.name, subAccountCreateRequestSubAccountCreationTargetAccountDetails.name) &&
        Objects.equals(this.countryCode, subAccountCreateRequestSubAccountCreationTargetAccountDetails.countryCode) &&
        Objects.equals(this.region, subAccountCreateRequestSubAccountCreationTargetAccountDetails.region) &&
        Objects.equals(this.site, subAccountCreateRequestSubAccountCreationTargetAccountDetails.site);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, address, admin, name, countryCode, region, site);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubAccountCreateRequestSubAccountCreationTargetAccountDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
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

