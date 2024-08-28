package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.SubAccountCreateTargetAccountAdmin;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * SubAccountCreateTargetAccount.
 *
 */

public class SubAccountCreateTargetAccount implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("region")
  private String region = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("site")
  private String site = null;

  @JsonProperty("admin")
  private SubAccountCreateTargetAccountAdmin admin = null;


  /**
   * id.
   *
   * @return SubAccountCreateTargetAccount
   **/
  public SubAccountCreateTargetAccount id(java.util.UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The target account id being created. It will be empty Guid if account is not created yet..
   * @return id
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "The target account id being created. It will be empty Guid if account is not created yet.")
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
   * name.
   *
   * @return SubAccountCreateTargetAccount
   **/
  public SubAccountCreateTargetAccount name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the target account..
   * @return name
   **/
  @Schema(description = "The name of the target account.")
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
   * region.
   *
   * @return SubAccountCreateTargetAccount
   **/
  public SubAccountCreateTargetAccount region(String region) {
    this.region = region;
    return this;
  }

  /**
   * The region where the target account is in..
   * @return region
   **/
  @Schema(description = "The region where the target account is in.")
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
   * countryCode.
   *
   * @return SubAccountCreateTargetAccount
   **/
  public SubAccountCreateTargetAccount countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * The country code where the target account is in..
   * @return countryCode
   **/
  @Schema(description = "The country code where the target account is in.")
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
   * site.
   *
   * @return SubAccountCreateTargetAccount
   **/
  public SubAccountCreateTargetAccount site(String site) {
    this.site = site;
    return this;
  }

  /**
   * The site where the target account is on..
   * @return site
   **/
  @Schema(description = "The site where the target account is on.")
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
   * admin.
   *
   * @return SubAccountCreateTargetAccount
   **/
  public SubAccountCreateTargetAccount admin(SubAccountCreateTargetAccountAdmin admin) {
    this.admin = admin;
    return this;
  }

  /**
   * The admin user for the target account..
   * @return admin
   **/
  @Schema(description = "The admin user for the target account.")
  public SubAccountCreateTargetAccountAdmin getAdmin() {
    return admin;
  }

  /**
   * setAdmin.
   **/
  public void setAdmin(SubAccountCreateTargetAccountAdmin admin) {
    this.admin = admin;
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
    SubAccountCreateTargetAccount subAccountCreateTargetAccount = (SubAccountCreateTargetAccount) o;
    return Objects.equals(this.id, subAccountCreateTargetAccount.id) &&
        Objects.equals(this.name, subAccountCreateTargetAccount.name) &&
        Objects.equals(this.region, subAccountCreateTargetAccount.region) &&
        Objects.equals(this.countryCode, subAccountCreateTargetAccount.countryCode) &&
        Objects.equals(this.site, subAccountCreateTargetAccount.site) &&
        Objects.equals(this.admin, subAccountCreateTargetAccount.admin);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, name, region, countryCode, site, admin);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubAccountCreateTargetAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
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

