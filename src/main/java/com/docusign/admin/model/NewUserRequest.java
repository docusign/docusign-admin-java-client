package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.NewUserRequestAccountProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * NewUserRequest.
 *
 */

public class NewUserRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("accounts")
  private java.util.List<NewUserRequestAccountProperties> accounts = new java.util.ArrayList<>();

  @JsonProperty("user_name")
  private String userName = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("default_account_id")
  private java.util.UUID defaultAccountId = null;

  @JsonProperty("language_culture")
  private String languageCulture = null;

  @JsonProperty("selected_languages")
  private String selectedLanguages = null;

  @JsonProperty("access_code")
  private String accessCode = null;

  @JsonProperty("federated_status")
  private String federatedStatus = null;

  @JsonProperty("auto_activate_memberships")
  private Boolean autoActivateMemberships = null;


  /**
   * accounts.
   *
   * @return NewUserRequest
   **/
  public NewUserRequest accounts(java.util.List<NewUserRequestAccountProperties> accounts) {
    this.accounts = accounts;
    return this;
  }
  
  /**
   * addAccountsItem.
   *
   * @return NewUserRequest
   **/
  public NewUserRequest addAccountsItem(NewUserRequestAccountProperties accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * Get accounts.
   * @return accounts
   **/
  @Schema(required = true, description = "")
  public java.util.List<NewUserRequestAccountProperties> getAccounts() {
    return accounts;
  }

  /**
   * setAccounts.
   **/
  public void setAccounts(java.util.List<NewUserRequestAccountProperties> accounts) {
    this.accounts = accounts;
  }


  /**
   * userName.
   *
   * @return NewUserRequest
   **/
  public NewUserRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName.
   * @return userName
   **/
  @Schema(description = "")
  public String getUserName() {
    return userName;
  }

  /**
   * setUserName.
   **/
  public void setUserName(String userName) {
    this.userName = userName;
  }


  /**
   * firstName.
   *
   * @return NewUserRequest
   **/
  public NewUserRequest firstName(String firstName) {
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
   * @return NewUserRequest
   **/
  public NewUserRequest lastName(String lastName) {
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
   * email.
   *
   * @return NewUserRequest
   **/
  public NewUserRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email.
   * @return email
   **/
  @Schema(required = true, description = "")
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
   * defaultAccountId.
   *
   * @return NewUserRequest
   **/
  public NewUserRequest defaultAccountId(java.util.UUID defaultAccountId) {
    this.defaultAccountId = defaultAccountId;
    return this;
  }

  /**
   * Get defaultAccountId.
   * @return defaultAccountId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getDefaultAccountId() {
    return defaultAccountId;
  }

  /**
   * setDefaultAccountId.
   **/
  public void setDefaultAccountId(java.util.UUID defaultAccountId) {
    this.defaultAccountId = defaultAccountId;
  }


  /**
   * languageCulture.
   *
   * @return NewUserRequest
   **/
  public NewUserRequest languageCulture(String languageCulture) {
    this.languageCulture = languageCulture;
    return this;
  }

  /**
   * Get languageCulture.
   * @return languageCulture
   **/
  @Schema(description = "")
  public String getLanguageCulture() {
    return languageCulture;
  }

  /**
   * setLanguageCulture.
   **/
  public void setLanguageCulture(String languageCulture) {
    this.languageCulture = languageCulture;
  }


  /**
   * selectedLanguages.
   *
   * @return NewUserRequest
   **/
  public NewUserRequest selectedLanguages(String selectedLanguages) {
    this.selectedLanguages = selectedLanguages;
    return this;
  }

  /**
   * Get selectedLanguages.
   * @return selectedLanguages
   **/
  @Schema(description = "")
  public String getSelectedLanguages() {
    return selectedLanguages;
  }

  /**
   * setSelectedLanguages.
   **/
  public void setSelectedLanguages(String selectedLanguages) {
    this.selectedLanguages = selectedLanguages;
  }


  /**
   * accessCode.
   *
   * @return NewUserRequest
   **/
  public NewUserRequest accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

  /**
   * Get accessCode.
   * @return accessCode
   **/
  @Schema(description = "")
  public String getAccessCode() {
    return accessCode;
  }

  /**
   * setAccessCode.
   **/
  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }


  /**
   * federatedStatus.
   *
   * @return NewUserRequest
   **/
  public NewUserRequest federatedStatus(String federatedStatus) {
    this.federatedStatus = federatedStatus;
    return this;
  }

  /**
   * Get federatedStatus.
   * @return federatedStatus
   **/
  @Schema(description = "")
  public String getFederatedStatus() {
    return federatedStatus;
  }

  /**
   * setFederatedStatus.
   **/
  public void setFederatedStatus(String federatedStatus) {
    this.federatedStatus = federatedStatus;
  }


  /**
   * autoActivateMemberships.
   *
   * @return NewUserRequest
   **/
  public NewUserRequest autoActivateMemberships(Boolean autoActivateMemberships) {
    this.autoActivateMemberships = autoActivateMemberships;
    return this;
  }

  /**
   * Get autoActivateMemberships.
   * @return autoActivateMemberships
   **/
  @Schema(description = "")
  public Boolean isAutoActivateMemberships() {
    return autoActivateMemberships;
  }

  /**
   * setAutoActivateMemberships.
   **/
  public void setAutoActivateMemberships(Boolean autoActivateMemberships) {
    this.autoActivateMemberships = autoActivateMemberships;
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
    NewUserRequest newUserRequest = (NewUserRequest) o;
    return Objects.equals(this.accounts, newUserRequest.accounts) &&
        Objects.equals(this.userName, newUserRequest.userName) &&
        Objects.equals(this.firstName, newUserRequest.firstName) &&
        Objects.equals(this.lastName, newUserRequest.lastName) &&
        Objects.equals(this.email, newUserRequest.email) &&
        Objects.equals(this.defaultAccountId, newUserRequest.defaultAccountId) &&
        Objects.equals(this.languageCulture, newUserRequest.languageCulture) &&
        Objects.equals(this.selectedLanguages, newUserRequest.selectedLanguages) &&
        Objects.equals(this.accessCode, newUserRequest.accessCode) &&
        Objects.equals(this.federatedStatus, newUserRequest.federatedStatus) &&
        Objects.equals(this.autoActivateMemberships, newUserRequest.autoActivateMemberships);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accounts, userName, firstName, lastName, email, defaultAccountId, languageCulture, selectedLanguages, accessCode, federatedStatus, autoActivateMemberships);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUserRequest {\n");
    
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    defaultAccountId: ").append(toIndentedString(defaultAccountId)).append("\n");
    sb.append("    languageCulture: ").append(toIndentedString(languageCulture)).append("\n");
    sb.append("    selectedLanguages: ").append(toIndentedString(selectedLanguages)).append("\n");
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    federatedStatus: ").append(toIndentedString(federatedStatus)).append("\n");
    sb.append("    autoActivateMemberships: ").append(toIndentedString(autoActivateMemberships)).append("\n");
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

