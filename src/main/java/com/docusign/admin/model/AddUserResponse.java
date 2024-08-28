package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.AddUserResponseAccountProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * AddUserResponse.
 *
 */

public class AddUserResponse implements Serializable {
  private static final long serialVersionUID = 1L;

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
  private java.util.List<AddUserResponseAccountProperties> accounts = null;


  /**
   * id.
   *
   * @return AddUserResponse
   **/
  public AddUserResponse id(java.util.UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id.
   * @return id
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
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
   * siteId.
   *
   * @return AddUserResponse
   **/
  public AddUserResponse siteId(Integer siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * Get siteId.
   * @return siteId
   **/
  @Schema(description = "")
  public Integer getSiteId() {
    return siteId;
  }

  /**
   * setSiteId.
   **/
  public void setSiteId(Integer siteId) {
    this.siteId = siteId;
  }


  /**
   * userName.
   *
   * @return AddUserResponse
   **/
  public AddUserResponse userName(String userName) {
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
   * @return AddUserResponse
   **/
  public AddUserResponse firstName(String firstName) {
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
   * @return AddUserResponse
   **/
  public AddUserResponse lastName(String lastName) {
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
   * @return AddUserResponse
   **/
  public AddUserResponse email(String email) {
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
   * languageCulture.
   *
   * @return AddUserResponse
   **/
  public AddUserResponse languageCulture(String languageCulture) {
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
   * federatedStatus.
   *
   * @return AddUserResponse
   **/
  public AddUserResponse federatedStatus(String federatedStatus) {
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
   * Get accounts.
   * @return accounts
   **/
  @Schema(description = "")
  public java.util.List<AddUserResponseAccountProperties> getAccounts() {
    return accounts;
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
    AddUserResponse addUserResponse = (AddUserResponse) o;
    return Objects.equals(this.id, addUserResponse.id) &&
        Objects.equals(this.siteId, addUserResponse.siteId) &&
        Objects.equals(this.userName, addUserResponse.userName) &&
        Objects.equals(this.firstName, addUserResponse.firstName) &&
        Objects.equals(this.lastName, addUserResponse.lastName) &&
        Objects.equals(this.email, addUserResponse.email) &&
        Objects.equals(this.languageCulture, addUserResponse.languageCulture) &&
        Objects.equals(this.federatedStatus, addUserResponse.federatedStatus) &&
        Objects.equals(this.accounts, addUserResponse.accounts);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, siteId, userName, firstName, lastName, email, languageCulture, federatedStatus, accounts);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddUserResponse {\n");
    
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

