package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.MemberGroupResponse;
import com.docusign.admin.model.PermissionProfileResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * NewUserResponseAccountProperties.
 *
 */

public class NewUserResponseAccountProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("site_id")
  private Integer siteId = null;

  @JsonProperty("permission_profile")
  private PermissionProfileResponse permissionProfile = null;

  @JsonProperty("groups")
  private java.util.List<MemberGroupResponse> groups = null;

  @JsonProperty("company_name")
  private String companyName = null;

  @JsonProperty("job_title")
  private String jobTitle = null;

  @JsonProperty("license_type")
  private String licenseType = null;

  @JsonProperty("subscription_id")
  private String subscriptionId = null;

  @JsonProperty("plan_name")
  private String planName = null;

  @JsonProperty("license_status")
  private String licenseStatus = null;


  /**
   * id.
   *
   * @return NewUserResponseAccountProperties
   **/
  public NewUserResponseAccountProperties id(java.util.UUID id) {
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
   * @return NewUserResponseAccountProperties
   **/
  public NewUserResponseAccountProperties siteId(Integer siteId) {
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
   * permissionProfile.
   *
   * @return NewUserResponseAccountProperties
   **/
  public NewUserResponseAccountProperties permissionProfile(PermissionProfileResponse permissionProfile) {
    this.permissionProfile = permissionProfile;
    return this;
  }

  /**
   * Get permissionProfile.
   * @return permissionProfile
   **/
  @Schema(description = "")
  public PermissionProfileResponse getPermissionProfile() {
    return permissionProfile;
  }

  /**
   * setPermissionProfile.
   **/
  public void setPermissionProfile(PermissionProfileResponse permissionProfile) {
    this.permissionProfile = permissionProfile;
  }


  /**
   * groups.
   *
   * @return NewUserResponseAccountProperties
   **/
  public NewUserResponseAccountProperties groups(java.util.List<MemberGroupResponse> groups) {
    this.groups = groups;
    return this;
  }
  
  /**
   * addGroupsItem.
   *
   * @return NewUserResponseAccountProperties
   **/
  public NewUserResponseAccountProperties addGroupsItem(MemberGroupResponse groupsItem) {
    if (this.groups == null) {
      this.groups = new java.util.ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups.
   * @return groups
   **/
  @Schema(description = "")
  public java.util.List<MemberGroupResponse> getGroups() {
    return groups;
  }

  /**
   * setGroups.
   **/
  public void setGroups(java.util.List<MemberGroupResponse> groups) {
    this.groups = groups;
  }


  /**
   * companyName.
   *
   * @return NewUserResponseAccountProperties
   **/
  public NewUserResponseAccountProperties companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName.
   * @return companyName
   **/
  @Schema(description = "")
  public String getCompanyName() {
    return companyName;
  }

  /**
   * setCompanyName.
   **/
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  /**
   * jobTitle.
   *
   * @return NewUserResponseAccountProperties
   **/
  public NewUserResponseAccountProperties jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Get jobTitle.
   * @return jobTitle
   **/
  @Schema(description = "")
  public String getJobTitle() {
    return jobTitle;
  }

  /**
   * setJobTitle.
   **/
  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }


  /**
   * licenseType.
   *
   * @return NewUserResponseAccountProperties
   **/
  public NewUserResponseAccountProperties licenseType(String licenseType) {
    this.licenseType = licenseType;
    return this;
  }

  /**
   * Get licenseType.
   * @return licenseType
   **/
  @Schema(description = "")
  public String getLicenseType() {
    return licenseType;
  }

  /**
   * setLicenseType.
   **/
  public void setLicenseType(String licenseType) {
    this.licenseType = licenseType;
  }


  /**
   * subscriptionId.
   *
   * @return NewUserResponseAccountProperties
   **/
  public NewUserResponseAccountProperties subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * Get subscriptionId.
   * @return subscriptionId
   **/
  @Schema(description = "")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  /**
   * setSubscriptionId.
   **/
  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  /**
   * planName.
   *
   * @return NewUserResponseAccountProperties
   **/
  public NewUserResponseAccountProperties planName(String planName) {
    this.planName = planName;
    return this;
  }

  /**
   * Get planName.
   * @return planName
   **/
  @Schema(description = "")
  public String getPlanName() {
    return planName;
  }

  /**
   * setPlanName.
   **/
  public void setPlanName(String planName) {
    this.planName = planName;
  }


  /**
   * licenseStatus.
   *
   * @return NewUserResponseAccountProperties
   **/
  public NewUserResponseAccountProperties licenseStatus(String licenseStatus) {
    this.licenseStatus = licenseStatus;
    return this;
  }

  /**
   * Get licenseStatus.
   * @return licenseStatus
   **/
  @Schema(description = "")
  public String getLicenseStatus() {
    return licenseStatus;
  }

  /**
   * setLicenseStatus.
   **/
  public void setLicenseStatus(String licenseStatus) {
    this.licenseStatus = licenseStatus;
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
    NewUserResponseAccountProperties newUserResponseAccountProperties = (NewUserResponseAccountProperties) o;
    return Objects.equals(this.id, newUserResponseAccountProperties.id) &&
        Objects.equals(this.siteId, newUserResponseAccountProperties.siteId) &&
        Objects.equals(this.permissionProfile, newUserResponseAccountProperties.permissionProfile) &&
        Objects.equals(this.groups, newUserResponseAccountProperties.groups) &&
        Objects.equals(this.companyName, newUserResponseAccountProperties.companyName) &&
        Objects.equals(this.jobTitle, newUserResponseAccountProperties.jobTitle) &&
        Objects.equals(this.licenseType, newUserResponseAccountProperties.licenseType) &&
        Objects.equals(this.subscriptionId, newUserResponseAccountProperties.subscriptionId) &&
        Objects.equals(this.planName, newUserResponseAccountProperties.planName) &&
        Objects.equals(this.licenseStatus, newUserResponseAccountProperties.licenseStatus);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, siteId, permissionProfile, groups, companyName, jobTitle, licenseType, subscriptionId, planName, licenseStatus);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUserResponseAccountProperties {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    permissionProfile: ").append(toIndentedString(permissionProfile)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    licenseStatus: ").append(toIndentedString(licenseStatus)).append("\n");
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

