package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.UpdateMembershipRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UpdateUserRequest
 */

public class UpdateUserRequest {
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

  @JsonProperty("default_account_id")
  private java.util.UUID defaultAccountId = null;

  @JsonProperty("language_culture")
  private String languageCulture = null;

  @JsonProperty("selected_languages")
  private String selectedLanguages = null;

  @JsonProperty("federated_status")
  private String federatedStatus = null;

  @JsonProperty("force_password_change")
  private Boolean forcePasswordChange = null;

  @JsonProperty("memberships")
  private java.util.List<UpdateMembershipRequest> memberships = null;

  @JsonProperty("device_verification_enabled")
  private Boolean deviceVerificationEnabled = null;

  public UpdateUserRequest id(java.util.UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "")
  public java.util.UUID getId() {
    return id;
  }

  public void setId(java.util.UUID id) {
    this.id = id;
  }

  public UpdateUserRequest siteId(Integer siteId) {
    this.siteId = siteId;
    return this;
  }

   /**
   * Get siteId
   * @return siteId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getSiteId() {
    return siteId;
  }

  public void setSiteId(Integer siteId) {
    this.siteId = siteId;
  }

  public UpdateUserRequest userName(String userName) {
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

  public UpdateUserRequest firstName(String firstName) {
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

  public UpdateUserRequest lastName(String lastName) {
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

  public UpdateUserRequest email(String email) {
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

  public UpdateUserRequest defaultAccountId(java.util.UUID defaultAccountId) {
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

  public UpdateUserRequest languageCulture(String languageCulture) {
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

  public UpdateUserRequest selectedLanguages(String selectedLanguages) {
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

  public UpdateUserRequest federatedStatus(String federatedStatus) {
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

  public UpdateUserRequest forcePasswordChange(Boolean forcePasswordChange) {
    this.forcePasswordChange = forcePasswordChange;
    return this;
  }

   /**
   * Get forcePasswordChange
   * @return forcePasswordChange
  **/
  @ApiModelProperty(value = "")
  public Boolean isForcePasswordChange() {
    return forcePasswordChange;
  }

  public void setForcePasswordChange(Boolean forcePasswordChange) {
    this.forcePasswordChange = forcePasswordChange;
  }

  public UpdateUserRequest memberships(java.util.List<UpdateMembershipRequest> memberships) {
    this.memberships = memberships;
    return this;
  }

  public UpdateUserRequest addMembershipsItem(UpdateMembershipRequest membershipsItem) {
    if (this.memberships == null) {
      this.memberships = new java.util.ArrayList<UpdateMembershipRequest>();
    }
    this.memberships.add(membershipsItem);
    return this;
  }

   /**
   * Get memberships
   * @return memberships
  **/
  @ApiModelProperty(value = "")
  public java.util.List<UpdateMembershipRequest> getMemberships() {
    return memberships;
  }

  public void setMemberships(java.util.List<UpdateMembershipRequest> memberships) {
    this.memberships = memberships;
  }

  public UpdateUserRequest deviceVerificationEnabled(Boolean deviceVerificationEnabled) {
    this.deviceVerificationEnabled = deviceVerificationEnabled;
    return this;
  }

   /**
   * Get deviceVerificationEnabled
   * @return deviceVerificationEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isDeviceVerificationEnabled() {
    return deviceVerificationEnabled;
  }

  public void setDeviceVerificationEnabled(Boolean deviceVerificationEnabled) {
    this.deviceVerificationEnabled = deviceVerificationEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserRequest updateUserRequest = (UpdateUserRequest) o;
    return Objects.equals(this.id, updateUserRequest.id) &&
        Objects.equals(this.siteId, updateUserRequest.siteId) &&
        Objects.equals(this.userName, updateUserRequest.userName) &&
        Objects.equals(this.firstName, updateUserRequest.firstName) &&
        Objects.equals(this.lastName, updateUserRequest.lastName) &&
        Objects.equals(this.email, updateUserRequest.email) &&
        Objects.equals(this.defaultAccountId, updateUserRequest.defaultAccountId) &&
        Objects.equals(this.languageCulture, updateUserRequest.languageCulture) &&
        Objects.equals(this.selectedLanguages, updateUserRequest.selectedLanguages) &&
        Objects.equals(this.federatedStatus, updateUserRequest.federatedStatus) &&
        Objects.equals(this.forcePasswordChange, updateUserRequest.forcePasswordChange) &&
        Objects.equals(this.memberships, updateUserRequest.memberships) &&
        Objects.equals(this.deviceVerificationEnabled, updateUserRequest.deviceVerificationEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, siteId, userName, firstName, lastName, email, defaultAccountId, languageCulture, selectedLanguages, federatedStatus, forcePasswordChange, memberships, deviceVerificationEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    defaultAccountId: ").append(toIndentedString(defaultAccountId)).append("\n");
    sb.append("    languageCulture: ").append(toIndentedString(languageCulture)).append("\n");
    sb.append("    selectedLanguages: ").append(toIndentedString(selectedLanguages)).append("\n");
    sb.append("    federatedStatus: ").append(toIndentedString(federatedStatus)).append("\n");
    sb.append("    forcePasswordChange: ").append(toIndentedString(forcePasswordChange)).append("\n");
    sb.append("    memberships: ").append(toIndentedString(memberships)).append("\n");
    sb.append("    deviceVerificationEnabled: ").append(toIndentedString(deviceVerificationEnabled)).append("\n");
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

