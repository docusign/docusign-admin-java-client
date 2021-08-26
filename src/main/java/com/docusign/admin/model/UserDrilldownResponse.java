package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.MembershipResponse;
import com.docusign.admin.model.UserIdentityResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * UserDrilldownResponse
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
  private DateTime createdOn = null;

  @JsonProperty("last_login")
  private DateTime lastLogin = null;

  @JsonProperty("memberships")
  private java.util.List<MembershipResponse> memberships = null;

  @JsonProperty("identities")
  private java.util.List<UserIdentityResponse> identities = null;

  @JsonProperty("device_verification_enabled")
  private Boolean deviceVerificationEnabled = null;

  public UserDrilldownResponse id(java.util.UUID id) {
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

  public UserDrilldownResponse siteId(Integer siteId) {
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

  public UserDrilldownResponse siteName(String siteName) {
    this.siteName = siteName;
    return this;
  }

   /**
   * Get siteName
   * @return siteName
  **/
  @ApiModelProperty(value = "")
  public String getSiteName() {
    return siteName;
  }

  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }

  public UserDrilldownResponse userName(String userName) {
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

  public UserDrilldownResponse firstName(String firstName) {
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

  public UserDrilldownResponse lastName(String lastName) {
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

  public UserDrilldownResponse userStatus(String userStatus) {
    this.userStatus = userStatus;
    return this;
  }

   /**
   * Get userStatus
   * @return userStatus
  **/
  @ApiModelProperty(value = "")
  public String getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(String userStatus) {
    this.userStatus = userStatus;
  }

  public UserDrilldownResponse defaultAccountId(java.util.UUID defaultAccountId) {
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

  public UserDrilldownResponse defaultAccountName(String defaultAccountName) {
    this.defaultAccountName = defaultAccountName;
    return this;
  }

   /**
   * Get defaultAccountName
   * @return defaultAccountName
  **/
  @ApiModelProperty(value = "")
  public String getDefaultAccountName() {
    return defaultAccountName;
  }

  public void setDefaultAccountName(String defaultAccountName) {
    this.defaultAccountName = defaultAccountName;
  }

  public UserDrilldownResponse languageCulture(String languageCulture) {
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

  public UserDrilldownResponse selectedLanguages(String selectedLanguages) {
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

  public UserDrilldownResponse federatedStatus(String federatedStatus) {
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

  public UserDrilldownResponse isOrganizationAdmin(Boolean isOrganizationAdmin) {
    this.isOrganizationAdmin = isOrganizationAdmin;
    return this;
  }

   /**
   * Get isOrganizationAdmin
   * @return isOrganizationAdmin
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsOrganizationAdmin() {
    return isOrganizationAdmin;
  }

  public void setIsOrganizationAdmin(Boolean isOrganizationAdmin) {
    this.isOrganizationAdmin = isOrganizationAdmin;
  }

  public UserDrilldownResponse createdOn(DateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(value = "")
  public DateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(DateTime createdOn) {
    this.createdOn = createdOn;
  }

  public UserDrilldownResponse lastLogin(DateTime lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * Get lastLogin
   * @return lastLogin
  **/
  @ApiModelProperty(value = "")
  public DateTime getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(DateTime lastLogin) {
    this.lastLogin = lastLogin;
  }

  public UserDrilldownResponse memberships(java.util.List<MembershipResponse> memberships) {
    this.memberships = memberships;
    return this;
  }

  public UserDrilldownResponse addMembershipsItem(MembershipResponse membershipsItem) {
    if (this.memberships == null) {
      this.memberships = new java.util.ArrayList<MembershipResponse>();
    }
    this.memberships.add(membershipsItem);
    return this;
  }

   /**
   * Get memberships
   * @return memberships
  **/
  @ApiModelProperty(value = "")
  public java.util.List<MembershipResponse> getMemberships() {
    return memberships;
  }

  public void setMemberships(java.util.List<MembershipResponse> memberships) {
    this.memberships = memberships;
  }

  public UserDrilldownResponse identities(java.util.List<UserIdentityResponse> identities) {
    this.identities = identities;
    return this;
  }

  public UserDrilldownResponse addIdentitiesItem(UserIdentityResponse identitiesItem) {
    if (this.identities == null) {
      this.identities = new java.util.ArrayList<UserIdentityResponse>();
    }
    this.identities.add(identitiesItem);
    return this;
  }

   /**
   * Get identities
   * @return identities
  **/
  @ApiModelProperty(value = "")
  public java.util.List<UserIdentityResponse> getIdentities() {
    return identities;
  }

  public void setIdentities(java.util.List<UserIdentityResponse> identities) {
    this.identities = identities;
  }

  public UserDrilldownResponse deviceVerificationEnabled(Boolean deviceVerificationEnabled) {
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

  @Override
  public int hashCode() {
    return Objects.hash(id, siteId, siteName, userName, firstName, lastName, userStatus, defaultAccountId, defaultAccountName, languageCulture, selectedLanguages, federatedStatus, isOrganizationAdmin, createdOn, lastLogin, memberships, identities, deviceVerificationEnabled);
  }


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

