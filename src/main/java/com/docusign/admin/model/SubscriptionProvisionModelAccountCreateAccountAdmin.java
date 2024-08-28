package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.DocuSignAccountDomainModelAddress;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * SubscriptionProvisionModelAccountCreateAccountAdmin.
 *
 */

public class SubscriptionProvisionModelAccountCreateAccountAdmin implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("EmailAddress")
  private String emailAddress = null;

  @JsonProperty("FirstName")
  private String firstName = null;

  @JsonProperty("LastName")
  private String lastName = null;

  /**
   * Gets or Sets locale
   */
  public enum LocaleEnum {
    NONE("None"),
    
    ZH_CN("zh_cn"),
    
    ZH_TW("zh_tw"),
    
    NL("nl"),
    
    EN("en"),
    
    FR("fr"),
    
    DE("de"),
    
    IT("it"),
    
    JA("ja"),
    
    KO("ko"),
    
    PT("pt"),
    
    PT_BR("pt_br"),
    
    RU("ru"),
    
    ES("es"),
    
    PL("pl");

    private String value;

    LocaleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LocaleEnum fromValue(String value) {
      for (LocaleEnum b : LocaleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Locale")
  private LocaleEnum locale = null;

  @JsonProperty("Address")
  private DocuSignAccountDomainModelAddress address = null;


  /**
   * emailAddress.
   *
   * @return SubscriptionProvisionModelAccountCreateAccountAdmin
   **/
  public SubscriptionProvisionModelAccountCreateAccountAdmin emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Get emailAddress.
   * @return emailAddress
   **/
  @Schema(description = "")
  public String getEmailAddress() {
    return emailAddress;
  }

  /**
   * setEmailAddress.
   **/
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  /**
   * firstName.
   *
   * @return SubscriptionProvisionModelAccountCreateAccountAdmin
   **/
  public SubscriptionProvisionModelAccountCreateAccountAdmin firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName.
   * @return firstName
   **/
  @Schema(description = "")
  public String getFirstName() {
    return firstName;
  }

  /**
   * setFirstName.
   **/
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   * lastName.
   *
   * @return SubscriptionProvisionModelAccountCreateAccountAdmin
   **/
  public SubscriptionProvisionModelAccountCreateAccountAdmin lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName.
   * @return lastName
   **/
  @Schema(description = "")
  public String getLastName() {
    return lastName;
  }

  /**
   * setLastName.
   **/
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   * locale.
   *
   * @return SubscriptionProvisionModelAccountCreateAccountAdmin
   **/
  public SubscriptionProvisionModelAccountCreateAccountAdmin locale(LocaleEnum locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Get locale.
   * @return locale
   **/
  @Schema(description = "")
  public LocaleEnum getLocale() {
    return locale;
  }

  /**
   * setLocale.
   **/
  public void setLocale(LocaleEnum locale) {
    this.locale = locale;
  }


  /**
   * address.
   *
   * @return SubscriptionProvisionModelAccountCreateAccountAdmin
   **/
  public SubscriptionProvisionModelAccountCreateAccountAdmin address(DocuSignAccountDomainModelAddress address) {
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
    SubscriptionProvisionModelAccountCreateAccountAdmin subscriptionProvisionModelAccountCreateAccountAdmin = (SubscriptionProvisionModelAccountCreateAccountAdmin) o;
    return Objects.equals(this.emailAddress, subscriptionProvisionModelAccountCreateAccountAdmin.emailAddress) &&
        Objects.equals(this.firstName, subscriptionProvisionModelAccountCreateAccountAdmin.firstName) &&
        Objects.equals(this.lastName, subscriptionProvisionModelAccountCreateAccountAdmin.lastName) &&
        Objects.equals(this.locale, subscriptionProvisionModelAccountCreateAccountAdmin.locale) &&
        Objects.equals(this.address, subscriptionProvisionModelAccountCreateAccountAdmin.address);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, firstName, lastName, locale, address);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProvisionModelAccountCreateAccountAdmin {\n");
    
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

