package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.UpdateMembershipRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * UpdateUserRequest.
 *
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


  /**
   * id.
   *
   * @return UpdateUserRequest
   **/
  public UpdateUserRequest id(java.util.UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id.
   * @return id
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", required = true, description = "")
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
   * @return UpdateUserRequest
   **/
  public UpdateUserRequest siteId(Integer siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * Get siteId.
   * @return siteId
   **/
  @Schema(required = true, description = "")
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
   * @return UpdateUserRequest
   **/
  public UpdateUserRequest userName(String userName) {
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
   * @return UpdateUserRequest
   **/
  public UpdateUserRequest firstName(String firstName) {
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
   * @return UpdateUserRequest
   **/
  public UpdateUserRequest lastName(String lastName) {
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
   * @return UpdateUserRequest
   **/
  public UpdateUserRequest email(String email) {
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
   * defaultAccountId.
   *
   * @return UpdateUserRequest
   **/
  public UpdateUserRequest defaultAccountId(java.util.UUID defaultAccountId) {
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
   * @return UpdateUserRequest
   **/
  public UpdateUserRequest languageCulture(String languageCulture) {
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
   * @return UpdateUserRequest
   **/
  public UpdateUserRequest selectedLanguages(String selectedLanguages) {
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
   * federatedStatus.
   *
   * @return UpdateUserRequest
   **/
  public UpdateUserRequest federatedStatus(String federatedStatus) {
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
   * forcePasswordChange.
   *
   * @return UpdateUserRequest
   **/
  public UpdateUserRequest forcePasswordChange(Boolean forcePasswordChange) {
    this.forcePasswordChange = forcePasswordChange;
    return this;
  }

  /**
   * Get forcePasswordChange.
   * @return forcePasswordChange
   **/
  @Schema(description = "")
  public Boolean isForcePasswordChange() {
    return forcePasswordChange;
  }

  /**
   * setForcePasswordChange.
   **/
  public void setForcePasswordChange(Boolean forcePasswordChange) {
    this.forcePasswordChange = forcePasswordChange;
  }


  /**
   * memberships.
   *
   * @return UpdateUserRequest
   **/
  public UpdateUserRequest memberships(java.util.List<UpdateMembershipRequest> memberships) {
    this.memberships = memberships;
    return this;
  }
  
  /**
   * addMembershipsItem.
   *
   * @return UpdateUserRequest
   **/
  public UpdateUserRequest addMembershipsItem(UpdateMembershipRequest membershipsItem) {
    if (this.memberships == null) {
      this.memberships = new java.util.ArrayList<>();
    }
    this.memberships.add(membershipsItem);
    return this;
  }

  /**
   * Get memberships.
   * @return memberships
   **/
  @Schema(description = "")
  public java.util.List<UpdateMembershipRequest> getMemberships() {
    return memberships;
  }

  /**
   * setMemberships.
   **/
  public void setMemberships(java.util.List<UpdateMembershipRequest> memberships) {
    this.memberships = memberships;
  }


  /**
   * deviceVerificationEnabled.
   *
   * @return UpdateUserRequest
   **/
  public UpdateUserRequest deviceVerificationEnabled(Boolean deviceVerificationEnabled) {
    this.deviceVerificationEnabled = deviceVerificationEnabled;
    return this;
  }

  /**
   * Get deviceVerificationEnabled.
   * @return deviceVerificationEnabled
   **/
  @Schema(description = "")
  public Boolean isDeviceVerificationEnabled() {
    return deviceVerificationEnabled;
  }

  /**
   * setDeviceVerificationEnabled.
   **/
  public void setDeviceVerificationEnabled(Boolean deviceVerificationEnabled) {
    this.deviceVerificationEnabled = deviceVerificationEnabled;
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, siteId, userName, firstName, lastName, email, defaultAccountId, languageCulture, selectedLanguages, federatedStatus, forcePasswordChange, memberships, deviceVerificationEnabled);
  }


  /**
   * Converts the given object to string.
   */
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

