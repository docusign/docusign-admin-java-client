package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * AssetGroupAccountCloneTargetAccountAdmin.
 *
 */

public class AssetGroupAccountCloneTargetAccountAdmin implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  /**
   * The locale of the target account&#39;s admin user.
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
   * email.
   *
   * @return AssetGroupAccountCloneTargetAccountAdmin
   **/
  public AssetGroupAccountCloneTargetAccountAdmin email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email of the target account's admin user..
   * @return email
   **/
  @Schema(description = "The email of the target account's admin user.")
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
   * @return AssetGroupAccountCloneTargetAccountAdmin
   **/
  public AssetGroupAccountCloneTargetAccountAdmin firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The first name of the target account's admin user..
   * @return firstName
   **/
  @Schema(description = "The first name of the target account's admin user.")
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
   * @return AssetGroupAccountCloneTargetAccountAdmin
   **/
  public AssetGroupAccountCloneTargetAccountAdmin lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The last name of the target account's admin user..
   * @return lastName
   **/
  @Schema(description = "The last name of the target account's admin user.")
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
   * @return AssetGroupAccountCloneTargetAccountAdmin
   **/
  public AssetGroupAccountCloneTargetAccountAdmin locale(LocaleEnum locale) {
    this.locale = locale;
    return this;
  }

  /**
   * The locale of the target account's admin user..
   * @return locale
   **/
  @Schema(description = "The locale of the target account's admin user.")
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
    AssetGroupAccountCloneTargetAccountAdmin assetGroupAccountCloneTargetAccountAdmin = (AssetGroupAccountCloneTargetAccountAdmin) o;
    return Objects.equals(this.email, assetGroupAccountCloneTargetAccountAdmin.email) &&
        Objects.equals(this.firstName, assetGroupAccountCloneTargetAccountAdmin.firstName) &&
        Objects.equals(this.lastName, assetGroupAccountCloneTargetAccountAdmin.lastName) &&
        Objects.equals(this.locale, assetGroupAccountCloneTargetAccountAdmin.locale);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, lastName, locale);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupAccountCloneTargetAccountAdmin {\n");
    
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

