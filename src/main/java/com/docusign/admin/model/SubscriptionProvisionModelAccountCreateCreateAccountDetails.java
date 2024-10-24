package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.DocuSignAccountDomainModelAddress;
import com.docusign.admin.model.SubscriptionProvisionModelAccountCreateAccountAdmin;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * SubscriptionProvisionModelAccountCreateCreateAccountDetails.
 *
 */

public class SubscriptionProvisionModelAccountCreateCreateAccountDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("CountryCode")
  private String countryCode = null;

  @JsonProperty("Region")
  private String region = null;

  @JsonProperty("Site")
  private String site = null;

  @JsonProperty("Address")
  private DocuSignAccountDomainModelAddress address = null;

  @JsonProperty("AdminUser")
  private SubscriptionProvisionModelAccountCreateAccountAdmin adminUser = null;

  /**
   * 0 stands for Web, 1 stands for Direct
   */
  public enum BillingProfileTypeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    BillingProfileTypeEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BillingProfileTypeEnum fromValue(Integer value) {
      for (BillingProfileTypeEnum b : BillingProfileTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("BillingProfileType")
  private BillingProfileTypeEnum billingProfileType = null;


  /**
   * name.
   *
   * @return SubscriptionProvisionModelAccountCreateCreateAccountDetails
   **/
  public SubscriptionProvisionModelAccountCreateCreateAccountDetails name(String name) {
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
   * @return SubscriptionProvisionModelAccountCreateCreateAccountDetails
   **/
  public SubscriptionProvisionModelAccountCreateCreateAccountDetails countryCode(String countryCode) {
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
   * @return SubscriptionProvisionModelAccountCreateCreateAccountDetails
   **/
  public SubscriptionProvisionModelAccountCreateCreateAccountDetails region(String region) {
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
   * @return SubscriptionProvisionModelAccountCreateCreateAccountDetails
   **/
  public SubscriptionProvisionModelAccountCreateCreateAccountDetails site(String site) {
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
   * address.
   *
   * @return SubscriptionProvisionModelAccountCreateCreateAccountDetails
   **/
  public SubscriptionProvisionModelAccountCreateCreateAccountDetails address(DocuSignAccountDomainModelAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address.
   * @return address
   **/
  @Schema(description = "")
  public DocuSignAccountDomainModelAddress getAddress() {
    return address;
  }

  /**
   * setAddress.
   **/
  public void setAddress(DocuSignAccountDomainModelAddress address) {
    this.address = address;
  }


  /**
   * adminUser.
   *
   * @return SubscriptionProvisionModelAccountCreateCreateAccountDetails
   **/
  public SubscriptionProvisionModelAccountCreateCreateAccountDetails adminUser(SubscriptionProvisionModelAccountCreateAccountAdmin adminUser) {
    this.adminUser = adminUser;
    return this;
  }

  /**
   * Get adminUser.
   * @return adminUser
   **/
  @Schema(description = "")
  public SubscriptionProvisionModelAccountCreateAccountAdmin getAdminUser() {
    return adminUser;
  }

  /**
   * setAdminUser.
   **/
  public void setAdminUser(SubscriptionProvisionModelAccountCreateAccountAdmin adminUser) {
    this.adminUser = adminUser;
  }


  /**
   * billingProfileType.
   *
   * @return SubscriptionProvisionModelAccountCreateCreateAccountDetails
   **/
  public SubscriptionProvisionModelAccountCreateCreateAccountDetails billingProfileType(BillingProfileTypeEnum billingProfileType) {
    this.billingProfileType = billingProfileType;
    return this;
  }

  /**
   * 0 stands for Web, 1 stands for Direct.
   * @return billingProfileType
   **/
  @Schema(description = "0 stands for Web, 1 stands for Direct")
  public BillingProfileTypeEnum getBillingProfileType() {
    return billingProfileType;
  }

  /**
   * setBillingProfileType.
   **/
  public void setBillingProfileType(BillingProfileTypeEnum billingProfileType) {
    this.billingProfileType = billingProfileType;
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
    SubscriptionProvisionModelAccountCreateCreateAccountDetails subscriptionProvisionModelAccountCreateCreateAccountDetails = (SubscriptionProvisionModelAccountCreateCreateAccountDetails) o;
    return Objects.equals(this.name, subscriptionProvisionModelAccountCreateCreateAccountDetails.name) &&
        Objects.equals(this.countryCode, subscriptionProvisionModelAccountCreateCreateAccountDetails.countryCode) &&
        Objects.equals(this.region, subscriptionProvisionModelAccountCreateCreateAccountDetails.region) &&
        Objects.equals(this.site, subscriptionProvisionModelAccountCreateCreateAccountDetails.site) &&
        Objects.equals(this.address, subscriptionProvisionModelAccountCreateCreateAccountDetails.address) &&
        Objects.equals(this.adminUser, subscriptionProvisionModelAccountCreateCreateAccountDetails.adminUser) &&
        Objects.equals(this.billingProfileType, subscriptionProvisionModelAccountCreateCreateAccountDetails.billingProfileType);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(name, countryCode, region, site, address, adminUser, billingProfileType);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProvisionModelAccountCreateCreateAccountDetails {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    adminUser: ").append(toIndentedString(adminUser)).append("\n");
    sb.append("    billingProfileType: ").append(toIndentedString(billingProfileType)).append("\n");
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

