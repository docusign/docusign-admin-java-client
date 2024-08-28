package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.AddressInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * SubAccountCreateRequestSubAccountCreationTargetAccountAdmin.
 *
 */

public class SubAccountCreateRequestSubAccountCreationTargetAccountAdmin implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("address")
  private AddressInformation address = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
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

  @JsonProperty("locale")
  private LocaleEnum locale = null;


  /**
   * address.
   *
   * @return SubAccountCreateRequestSubAccountCreationTargetAccountAdmin
   **/
  public SubAccountCreateRequestSubAccountCreationTargetAccountAdmin address(AddressInformation address) {
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
   * email.
   *
   * @return SubAccountCreateRequestSubAccountCreationTargetAccountAdmin
   **/
  public SubAccountCreateRequestSubAccountCreationTargetAccountAdmin email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email.
   * @return email
   **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  /**
   * setEmail.
   **/
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * firstName.
   *
   * @return SubAccountCreateRequestSubAccountCreationTargetAccountAdmin
   **/
  public SubAccountCreateRequestSubAccountCreationTargetAccountAdmin firstName(String firstName) {
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
   * @return SubAccountCreateRequestSubAccountCreationTargetAccountAdmin
   **/
  public SubAccountCreateRequestSubAccountCreationTargetAccountAdmin lastName(String lastName) {
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
   * @return SubAccountCreateRequestSubAccountCreationTargetAccountAdmin
   **/
  public SubAccountCreateRequestSubAccountCreationTargetAccountAdmin locale(LocaleEnum locale) {
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
    SubAccountCreateRequestSubAccountCreationTargetAccountAdmin subAccountCreateRequestSubAccountCreationTargetAccountAdmin = (SubAccountCreateRequestSubAccountCreationTargetAccountAdmin) o;
    return Objects.equals(this.address, subAccountCreateRequestSubAccountCreationTargetAccountAdmin.address) &&
        Objects.equals(this.email, subAccountCreateRequestSubAccountCreationTargetAccountAdmin.email) &&
        Objects.equals(this.firstName, subAccountCreateRequestSubAccountCreationTargetAccountAdmin.firstName) &&
        Objects.equals(this.lastName, subAccountCreateRequestSubAccountCreationTargetAccountAdmin.lastName) &&
        Objects.equals(this.locale, subAccountCreateRequestSubAccountCreationTargetAccountAdmin.locale);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(address, email, firstName, lastName, locale);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubAccountCreateRequestSubAccountCreationTargetAccountAdmin {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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

