package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.NewUserRequestAccountProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NewUserRequest
 */

public class NewUserRequest {
  @JsonProperty("accounts")
  private java.util.List<NewUserRequestAccountProperties> accounts = new java.util.ArrayList<NewUserRequestAccountProperties>();

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

  public NewUserRequest accounts(java.util.List<NewUserRequestAccountProperties> accounts) {
    this.accounts = accounts;
    return this;
  }

  public NewUserRequest addAccountsItem(NewUserRequestAccountProperties accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @ApiModelProperty(required = true, value = "")
  public java.util.List<NewUserRequestAccountProperties> getAccounts() {
    return accounts;
  }

  public void setAccounts(java.util.List<NewUserRequestAccountProperties> accounts) {
    this.accounts = accounts;
  }

  public NewUserRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public NewUserRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public NewUserRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public NewUserRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public NewUserRequest defaultAccountId(java.util.UUID defaultAccountId) {
    this.defaultAccountId = defaultAccountId;
    return this;
  }

   /**
   * Get defaultAccountId
   * @return defaultAccountId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getDefaultAccountId() {
    return defaultAccountId;
  }

  public void setDefaultAccountId(java.util.UUID defaultAccountId) {
    this.defaultAccountId = defaultAccountId;
  }

  public NewUserRequest languageCulture(String languageCulture) {
    this.languageCulture = languageCulture;
    return this;
  }

   /**
   * Get languageCulture
   * @return languageCulture
  **/
  @ApiModelProperty(value = "")
  public String getLanguageCulture() {
    return languageCulture;
  }

  public void setLanguageCulture(String languageCulture) {
    this.languageCulture = languageCulture;
  }

  public NewUserRequest selectedLanguages(String selectedLanguages) {
    this.selectedLanguages = selectedLanguages;
    return this;
  }

   /**
   * Get selectedLanguages
   * @return selectedLanguages
  **/
  @ApiModelProperty(value = "")
  public String getSelectedLanguages() {
    return selectedLanguages;
  }

  public void setSelectedLanguages(String selectedLanguages) {
    this.selectedLanguages = selectedLanguages;
  }

  public NewUserRequest accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

   /**
   * Get accessCode
   * @return accessCode
  **/
  @ApiModelProperty(value = "")
  public String getAccessCode() {
    return accessCode;
  }

  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }

  public NewUserRequest federatedStatus(String federatedStatus) {
    this.federatedStatus = federatedStatus;
    return this;
  }

   /**
   * Get federatedStatus
   * @return federatedStatus
  **/
  @ApiModelProperty(value = "")
  public String getFederatedStatus() {
    return federatedStatus;
  }

  public void setFederatedStatus(String federatedStatus) {
    this.federatedStatus = federatedStatus;
  }

  public NewUserRequest autoActivateMemberships(Boolean autoActivateMemberships) {
    this.autoActivateMemberships = autoActivateMemberships;
    return this;
  }

   /**
   * Get autoActivateMemberships
   * @return autoActivateMemberships
  **/
  @ApiModelProperty(value = "")
  public Boolean isAutoActivateMemberships() {
    return autoActivateMemberships;
  }

  public void setAutoActivateMemberships(Boolean autoActivateMemberships) {
    this.autoActivateMemberships = autoActivateMemberships;
  }


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

  @Override
  public int hashCode() {
    return Objects.hash(accounts, userName, firstName, lastName, email, defaultAccountId, languageCulture, selectedLanguages, accessCode, federatedStatus, autoActivateMemberships);
  }


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

