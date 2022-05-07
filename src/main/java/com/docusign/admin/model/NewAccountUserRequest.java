package com.docusign.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NewAccountUserRequest. */
public class NewAccountUserRequest {
  @JsonProperty("permission_profile")
  private PermissionProfileRequest permissionProfile = null;

  @JsonProperty("groups")
  private java.util.List<GroupRequest> groups = null;

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
   * permissionProfile.
   *
   * @return NewAccountUserRequest
   */
  public NewAccountUserRequest permissionProfile(PermissionProfileRequest permissionProfile) {
    this.permissionProfile = permissionProfile;
    return this;
  }

  /**
   * Get permissionProfile.
   *
   * @return permissionProfile
   */
  @ApiModelProperty(value = "")
  public PermissionProfileRequest getPermissionProfile() {
    return permissionProfile;
  }

  /** setPermissionProfile. */
  public void setPermissionProfile(PermissionProfileRequest permissionProfile) {
    this.permissionProfile = permissionProfile;
  }

  /**
   * groups.
   *
   * @return NewAccountUserRequest
   */
  public NewAccountUserRequest groups(java.util.List<GroupRequest> groups) {
    this.groups = groups;
    return this;
  }

  /**
   * addGroupsItem.
   *
   * @return NewAccountUserRequest
   */
  public NewAccountUserRequest addGroupsItem(GroupRequest groupsItem) {
    if (this.groups == null) {
      this.groups = new java.util.ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups.
   *
   * @return groups
   */
  @ApiModelProperty(value = "")
  public java.util.List<GroupRequest> getGroups() {
    return groups;
  }

  /** setGroups. */
  public void setGroups(java.util.List<GroupRequest> groups) {
    this.groups = groups;
  }

  /**
   * userName.
   *
   * @return NewAccountUserRequest
   */
  public NewAccountUserRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName.
   *
   * @return userName
   */
  @ApiModelProperty(value = "")
  public String getUserName() {
    return userName;
  }

  /** setUserName. */
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   * firstName.
   *
   * @return NewAccountUserRequest
   */
  public NewAccountUserRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName.
   *
   * @return firstName
   */
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  /** setFirstName. */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * lastName.
   *
   * @return NewAccountUserRequest
   */
  public NewAccountUserRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName.
   *
   * @return lastName
   */
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  /** setLastName. */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * email.
   *
   * @return NewAccountUserRequest
   */
  public NewAccountUserRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email.
   *
   * @return email
   */
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }

  /** setEmail. */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * defaultAccountId.
   *
   * @return NewAccountUserRequest
   */
  public NewAccountUserRequest defaultAccountId(java.util.UUID defaultAccountId) {
    this.defaultAccountId = defaultAccountId;
    return this;
  }

  /**
   * Get defaultAccountId.
   *
   * @return defaultAccountId
   */
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getDefaultAccountId() {
    return defaultAccountId;
  }

  /** setDefaultAccountId. */
  public void setDefaultAccountId(java.util.UUID defaultAccountId) {
    this.defaultAccountId = defaultAccountId;
  }

  /**
   * languageCulture.
   *
   * @return NewAccountUserRequest
   */
  public NewAccountUserRequest languageCulture(String languageCulture) {
    this.languageCulture = languageCulture;
    return this;
  }

  /**
   * Get languageCulture.
   *
   * @return languageCulture
   */
  @ApiModelProperty(value = "")
  public String getLanguageCulture() {
    return languageCulture;
  }

  /** setLanguageCulture. */
  public void setLanguageCulture(String languageCulture) {
    this.languageCulture = languageCulture;
  }

  /**
   * selectedLanguages.
   *
   * @return NewAccountUserRequest
   */
  public NewAccountUserRequest selectedLanguages(String selectedLanguages) {
    this.selectedLanguages = selectedLanguages;
    return this;
  }

  /**
   * Get selectedLanguages.
   *
   * @return selectedLanguages
   */
  @ApiModelProperty(value = "")
  public String getSelectedLanguages() {
    return selectedLanguages;
  }

  /** setSelectedLanguages. */
  public void setSelectedLanguages(String selectedLanguages) {
    this.selectedLanguages = selectedLanguages;
  }

  /**
   * accessCode.
   *
   * @return NewAccountUserRequest
   */
  public NewAccountUserRequest accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

  /**
   * Get accessCode.
   *
   * @return accessCode
   */
  @ApiModelProperty(value = "")
  public String getAccessCode() {
    return accessCode;
  }

  /** setAccessCode. */
  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }

  /**
   * federatedStatus.
   *
   * @return NewAccountUserRequest
   */
  public NewAccountUserRequest federatedStatus(String federatedStatus) {
    this.federatedStatus = federatedStatus;
    return this;
  }

  /**
   * Get federatedStatus.
   *
   * @return federatedStatus
   */
  @ApiModelProperty(value = "")
  public String getFederatedStatus() {
    return federatedStatus;
  }

  /** setFederatedStatus. */
  public void setFederatedStatus(String federatedStatus) {
    this.federatedStatus = federatedStatus;
  }

  /**
   * autoActivateMemberships.
   *
   * @return NewAccountUserRequest
   */
  public NewAccountUserRequest autoActivateMemberships(Boolean autoActivateMemberships) {
    this.autoActivateMemberships = autoActivateMemberships;
    return this;
  }

  /**
   * Get autoActivateMemberships.
   *
   * @return autoActivateMemberships
   */
  @ApiModelProperty(value = "")
  public Boolean isAutoActivateMemberships() {
    return autoActivateMemberships;
  }

  /** setAutoActivateMemberships. */
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
    NewAccountUserRequest newAccountUserRequest = (NewAccountUserRequest) o;
    return Objects.equals(this.permissionProfile, newAccountUserRequest.permissionProfile)
        && Objects.equals(this.groups, newAccountUserRequest.groups)
        && Objects.equals(this.userName, newAccountUserRequest.userName)
        && Objects.equals(this.firstName, newAccountUserRequest.firstName)
        && Objects.equals(this.lastName, newAccountUserRequest.lastName)
        && Objects.equals(this.email, newAccountUserRequest.email)
        && Objects.equals(this.defaultAccountId, newAccountUserRequest.defaultAccountId)
        && Objects.equals(this.languageCulture, newAccountUserRequest.languageCulture)
        && Objects.equals(this.selectedLanguages, newAccountUserRequest.selectedLanguages)
        && Objects.equals(this.accessCode, newAccountUserRequest.accessCode)
        && Objects.equals(this.federatedStatus, newAccountUserRequest.federatedStatus)
        && Objects.equals(
            this.autoActivateMemberships, newAccountUserRequest.autoActivateMemberships);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(
        permissionProfile,
        groups,
        userName,
        firstName,
        lastName,
        email,
        defaultAccountId,
        languageCulture,
        selectedLanguages,
        accessCode,
        federatedStatus,
        autoActivateMemberships);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewAccountUserRequest {\n");

    sb.append("    permissionProfile: ").append(toIndentedString(permissionProfile)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    defaultAccountId: ").append(toIndentedString(defaultAccountId)).append("\n");
    sb.append("    languageCulture: ").append(toIndentedString(languageCulture)).append("\n");
    sb.append("    selectedLanguages: ").append(toIndentedString(selectedLanguages)).append("\n");
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    federatedStatus: ").append(toIndentedString(federatedStatus)).append("\n");
    sb.append("    autoActivateMemberships: ")
        .append(toIndentedString(autoActivateMemberships))
        .append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
