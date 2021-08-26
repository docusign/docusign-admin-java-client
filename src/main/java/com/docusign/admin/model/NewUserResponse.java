package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.NewUserResponseAccountProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NewUserResponse
 */

public class NewUserResponse {
  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("site_id")
  private Integer siteId = null;

  @JsonProperty("user_name")
  private String userName = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("language_culture")
  private String languageCulture = null;

  @JsonProperty("federated_status")
  private String federatedStatus = null;

  @JsonProperty("accounts")
  private java.util.List<NewUserResponseAccountProperties> accounts = null;

  public NewUserResponse id(java.util.UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getId() {
    return id;
  }

  public void setId(java.util.UUID id) {
    this.id = id;
  }

  public NewUserResponse siteId(Integer siteId) {
    this.siteId = siteId;
    return this;
  }

   /**
   * Get siteId
   * @return siteId
  **/
  @ApiModelProperty(value = "")
  public Integer getSiteId() {
    return siteId;
  }

  public void setSiteId(Integer siteId) {
    this.siteId = siteId;
  }

  public NewUserResponse userName(String userName) {
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

  public NewUserResponse firstName(String firstName) {
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

  public NewUserResponse lastName(String lastName) {
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

  public NewUserResponse email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public NewUserResponse languageCulture(String languageCulture) {
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

  public NewUserResponse federatedStatus(String federatedStatus) {
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

  public NewUserResponse accounts(java.util.List<NewUserResponseAccountProperties> accounts) {
    this.accounts = accounts;
    return this;
  }

  public NewUserResponse addAccountsItem(NewUserResponseAccountProperties accountsItem) {
    if (this.accounts == null) {
      this.accounts = new java.util.ArrayList<NewUserResponseAccountProperties>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @ApiModelProperty(value = "")
  public java.util.List<NewUserResponseAccountProperties> getAccounts() {
    return accounts;
  }

  public void setAccounts(java.util.List<NewUserResponseAccountProperties> accounts) {
    this.accounts = accounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewUserResponse newUserResponse = (NewUserResponse) o;
    return Objects.equals(this.id, newUserResponse.id) &&
        Objects.equals(this.siteId, newUserResponse.siteId) &&
        Objects.equals(this.userName, newUserResponse.userName) &&
        Objects.equals(this.firstName, newUserResponse.firstName) &&
        Objects.equals(this.lastName, newUserResponse.lastName) &&
        Objects.equals(this.email, newUserResponse.email) &&
        Objects.equals(this.languageCulture, newUserResponse.languageCulture) &&
        Objects.equals(this.federatedStatus, newUserResponse.federatedStatus) &&
        Objects.equals(this.accounts, newUserResponse.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, siteId, userName, firstName, lastName, email, languageCulture, federatedStatus, accounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUserResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    languageCulture: ").append(toIndentedString(languageCulture)).append("\n");
    sb.append("    federatedStatus: ").append(toIndentedString(federatedStatus)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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

