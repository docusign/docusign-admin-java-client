package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.MembershipResponse;
import com.docusign.admin.model.UserIdentityResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;

/**
 * UserDrilldownResponse.
 *
 */

public class UserDrilldownResponse {
  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("site_id")
  private Integer siteId = null;

  @JsonProperty("site_name")
  private String siteName = null;

  @JsonProperty("user_name")
  private String userName = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("user_status")
  private String userStatus = null;

  @JsonProperty("default_account_id")
  private java.util.UUID defaultAccountId = null;

  @JsonProperty("default_account_name")
  private String defaultAccountName = null;

  @JsonProperty("language_culture")
  private String languageCulture = null;

  @JsonProperty("selected_languages")
  private String selectedLanguages = null;

  @JsonProperty("federated_status")
  private String federatedStatus = null;

  @JsonProperty("is_organization_admin")
  private Boolean isOrganizationAdmin = null;

  @JsonProperty("created_on")
  private String createdOn = null;

  @JsonProperty("last_login")
  private String lastLogin = null;

  @JsonProperty("memberships")
  private java.util.List<MembershipResponse> memberships = null;

  @JsonProperty("identities")
  private java.util.List<UserIdentityResponse> identities = null;

  @JsonProperty("device_verification_enabled")
  private Boolean deviceVerificationEnabled = null;


  /**
   * id.
   *
   * @return UserDrilldownResponse
   **/
  public UserDrilldownResponse id(java.util.UUID id) {
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
   * @return UserDrilldownResponse
   **/
  public UserDrilldownResponse siteId(Integer siteId) {
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
   * siteName.
   *
   * @return UserDrilldownResponse
   **/
  public UserDrilldownResponse siteName(String siteName) {
    this.siteName = siteName;
    return this;
  }

  /**
   * Get siteName.
   * @return siteName
   **/
  @Schema(description = "")
  public String getSiteName() {
    return siteName;
  }

  /**
   * setSiteName.
   **/
  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }


  /**
   * userName.
   *
   * @return UserDrilldownResponse
   **/
  public UserDrilldownResponse userName(String userName) {
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
   * @return UserDrilldownResponse
   **/
  public UserDrilldownResponse firstName(String firstName) {
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
   * @return UserDrilldownResponse
   **/
  public UserDrilldownResponse lastName(String lastName) {
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
   * userStatus.
   *
   * @return UserDrilldownResponse
   **/
  public UserDrilldownResponse userStatus(String userStatus) {
    this.userStatus = userStatus;
    return this;
  }

  /**
   * Get userStatus.
   * @return userStatus
   **/
  @Schema(description = "")
  public String getUserStatus() {
    return userStatus;
  }

  /**
   * setUserStatus.
   **/
  public void setUserStatus(String userStatus) {
    this.userStatus = userStatus;
  }


  /**
   * defaultAccountId.
   *
   * @return UserDrilldownResponse
   **/
  public UserDrilldownResponse defaultAccountId(java.util.UUID defaultAccountId) {
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
   * defaultAccountName.
   *
   * @return UserDrilldownResponse
   **/
  public UserDrilldownResponse defaultAccountName(String defaultAccountName) {
    this.defaultAccountName = defaultAccountName;
    return this;
  }

  /**
   * Get defaultAccountName.
   * @return defaultAccountName
   **/
  @Schema(description = "")
  public String getDefaultAccountName() {
    return defaultAccountName;
  }

  /**
   * setDefaultAccountName.
   **/
  public void setDefaultAccountName(String defaultAccountName) {
    this.defaultAccountName = defaultAccountName;
  }


  /**
   * languageCulture.
   *
   * @return UserDrilldownResponse
   **/
  public UserDrilldownResponse languageCulture(String languageCulture) {
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
   * @return UserDrilldownResponse
   **/
  public UserDrilldownResponse selectedLanguages(String selectedLanguages) {
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
   * @return UserDrilldownResponse
   **/
  public UserDrilldownResponse federatedStatus(String federatedStatus) {
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
   * isOrganizationAdmin.
   *
   * @return UserDrilldownResponse
   **/
  public UserDrilldownResponse isOrganizationAdmin(Boolean isOrganizationAdmin) {
    this.isOrganizationAdmin = isOrganizationAdmin;
    return this;
  }

  /**
   * Get isOrganizationAdmin.
   * @return isOrganizationAdmin
   **/
  @Schema(description = "")
  public Boolean isIsOrganizationAdmin() {
    return isOrganizationAdmin;
  }

  /**
   * setIsOrganizationAdmin.
   **/
  public void setIsOrganizationAdmin(Boolean isOrganizationAdmin) {
    this.isOrganizationAdmin = isOrganizationAdmin;
  }


  /**
   * createdOn.
   *
   * @return UserDrilldownResponse
   **/
  public UserDrilldownResponse createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * Get createdOn.
   * @return createdOn
   **/
  @Schema(description = "")
  public String getCreatedOn() {
    return createdOn;
  }

  /**
   * setCreatedOn.
   **/
  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }


  /**
   * lastLogin.
   *
   * @return UserDrilldownResponse
   **/
  public UserDrilldownResponse lastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

  /**
   * Get lastLogin.
   * @return lastLogin
   **/
  @Schema(description = "")
  public String getLastLogin() {
    return lastLogin;
  }

  /**
   * setLastLogin.
   **/
  public void setLastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
  }


  /**
   * memberships.
   *
   * @return UserDrilldownResponse
   **/
  public UserDrilldownResponse memberships(java.util.List<MembershipResponse> memberships) {
    this.memberships = memberships;
    return this;
  }
  
  /**
   * addMembershipsItem.
   *
   * @return UserDrilldownResponse
   **/
  public UserDrilldownResponse addMembershipsItem(MembershipResponse membershipsItem) {
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
  public java.util.List<MembershipResponse> getMemberships() {
    return memberships;
  }

  /**
   * setMemberships.
   **/
  public void setMemberships(java.util.List<MembershipResponse> memberships) {
    this.memberships = memberships;
  }


  /**
   * identities.
   *
   * @return UserDrilldownResponse
   **/
  public UserDrilldownResponse identities(java.util.List<UserIdentityResponse> identities) {
    this.identities = identities;
    return this;
  }
  
  /**
   * addIdentitiesItem.
   *
   * @return UserDrilldownResponse
   **/
  public UserDrilldownResponse addIdentitiesItem(UserIdentityResponse identitiesItem) {
    if (this.identities == null) {
      this.identities = new java.util.ArrayList<>();
    }
    this.identities.add(identitiesItem);
    return this;
  }

  /**
   * Get identities.
   * @return identities
   **/
  @Schema(description = "")
  public java.util.List<UserIdentityResponse> getIdentities() {
    return identities;
  }

  /**
   * setIdentities.
   **/
  public void setIdentities(java.util.List<UserIdentityResponse> identities) {
    this.identities = identities;
  }


  /**
   * deviceVerificationEnabled.
   *
   * @return UserDrilldownResponse
   **/
  public UserDrilldownResponse deviceVerificationEnabled(Boolean deviceVerificationEnabled) {
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
    UserDrilldownResponse userDrilldownResponse = (UserDrilldownResponse) o;
    return Objects.equals(this.id, userDrilldownResponse.id) &&
        Objects.equals(this.siteId, userDrilldownResponse.siteId) &&
        Objects.equals(this.siteName, userDrilldownResponse.siteName) &&
        Objects.equals(this.userName, userDrilldownResponse.userName) &&
        Objects.equals(this.firstName, userDrilldownResponse.firstName) &&
        Objects.equals(this.lastName, userDrilldownResponse.lastName) &&
        Objects.equals(this.userStatus, userDrilldownResponse.userStatus) &&
        Objects.equals(this.defaultAccountId, userDrilldownResponse.defaultAccountId) &&
        Objects.equals(this.defaultAccountName, userDrilldownResponse.defaultAccountName) &&
        Objects.equals(this.languageCulture, userDrilldownResponse.languageCulture) &&
        Objects.equals(this.selectedLanguages, userDrilldownResponse.selectedLanguages) &&
        Objects.equals(this.federatedStatus, userDrilldownResponse.federatedStatus) &&
        Objects.equals(this.isOrganizationAdmin, userDrilldownResponse.isOrganizationAdmin) &&
        Objects.equals(this.createdOn, userDrilldownResponse.createdOn) &&
        Objects.equals(this.lastLogin, userDrilldownResponse.lastLogin) &&
        Objects.equals(this.memberships, userDrilldownResponse.memberships) &&
        Objects.equals(this.identities, userDrilldownResponse.identities) &&
        Objects.equals(this.deviceVerificationEnabled, userDrilldownResponse.deviceVerificationEnabled);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, siteId, siteName, userName, firstName, lastName, userStatus, defaultAccountId, defaultAccountName, languageCulture, selectedLanguages, federatedStatus, isOrganizationAdmin, createdOn, lastLogin, memberships, identities, deviceVerificationEnabled);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDrilldownResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("    defaultAccountId: ").append(toIndentedString(defaultAccountId)).append("\n");
    sb.append("    defaultAccountName: ").append(toIndentedString(defaultAccountName)).append("\n");
    sb.append("    languageCulture: ").append(toIndentedString(languageCulture)).append("\n");
    sb.append("    selectedLanguages: ").append(toIndentedString(selectedLanguages)).append("\n");
    sb.append("    federatedStatus: ").append(toIndentedString(federatedStatus)).append("\n");
    sb.append("    isOrganizationAdmin: ").append(toIndentedString(isOrganizationAdmin)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    memberships: ").append(toIndentedString(memberships)).append("\n");
    sb.append("    identities: ").append(toIndentedString(identities)).append("\n");
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

