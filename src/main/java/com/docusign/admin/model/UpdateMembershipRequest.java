package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.GroupRequest;
import com.docusign.admin.model.PermissionProfileRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UpdateMembershipRequest.
 *
 */

public class UpdateMembershipRequest {
  @JsonProperty("account_id")
  private java.util.UUID accountId = null;

  @JsonProperty("permission_profile")
  private PermissionProfileRequest permissionProfile = null;

  @JsonProperty("groups")
  private java.util.List<GroupRequest> groups = null;

  @JsonProperty("company_name")
  private String companyName = null;

  @JsonProperty("job_title")
  private String jobTitle = null;

  @JsonProperty("send_activation")
  private Boolean sendActivation = null;

  @JsonProperty("access_code")
  private String accessCode = null;


  /**
   * accountId.
   *
   * @return UpdateMembershipRequest
   **/
  public UpdateMembershipRequest accountId(java.util.UUID accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId.
   * @return accountId
   **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "")
  public java.util.UUID getAccountId() {
    return accountId;
  }

  /**
   * setAccountId.
   **/
  public void setAccountId(java.util.UUID accountId) {
    this.accountId = accountId;
  }


  /**
   * permissionProfile.
   *
   * @return UpdateMembershipRequest
   **/
  public UpdateMembershipRequest permissionProfile(PermissionProfileRequest permissionProfile) {
    this.permissionProfile = permissionProfile;
    return this;
  }

  /**
   * Get permissionProfile.
   * @return permissionProfile
   **/
  @ApiModelProperty(value = "")
  public PermissionProfileRequest getPermissionProfile() {
    return permissionProfile;
  }

  /**
   * setPermissionProfile.
   **/
  public void setPermissionProfile(PermissionProfileRequest permissionProfile) {
    this.permissionProfile = permissionProfile;
  }


  /**
   * groups.
   *
   * @return UpdateMembershipRequest
   **/
  public UpdateMembershipRequest groups(java.util.List<GroupRequest> groups) {
    this.groups = groups;
    return this;
  }
  
  /**
   * addGroupsItem.
   *
   * @return UpdateMembershipRequest
   **/
  public UpdateMembershipRequest addGroupsItem(GroupRequest groupsItem) {
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
  @ApiModelProperty(value = "")
  public java.util.List<GroupRequest> getGroups() {
    return groups;
  }

  /**
   * setGroups.
   **/
  public void setGroups(java.util.List<GroupRequest> groups) {
    this.groups = groups;
  }


  /**
   * companyName.
   *
   * @return UpdateMembershipRequest
   **/
  public UpdateMembershipRequest companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName.
   * @return companyName
   **/
  @ApiModelProperty(value = "")
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
   * @return UpdateMembershipRequest
   **/
  public UpdateMembershipRequest jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Get jobTitle.
   * @return jobTitle
   **/
  @ApiModelProperty(value = "")
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
   * sendActivation.
   *
   * @return UpdateMembershipRequest
   **/
  public UpdateMembershipRequest sendActivation(Boolean sendActivation) {
    this.sendActivation = sendActivation;
    return this;
  }

  /**
   * Get sendActivation.
   * @return sendActivation
   **/
  @ApiModelProperty(value = "")
  public Boolean isSendActivation() {
    return sendActivation;
  }

  /**
   * setSendActivation.
   **/
  public void setSendActivation(Boolean sendActivation) {
    this.sendActivation = sendActivation;
  }


  /**
   * accessCode.
   *
   * @return UpdateMembershipRequest
   **/
  public UpdateMembershipRequest accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

  /**
   * Get accessCode.
   * @return accessCode
   **/
  @ApiModelProperty(value = "")
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
    UpdateMembershipRequest updateMembershipRequest = (UpdateMembershipRequest) o;
    return Objects.equals(this.accountId, updateMembershipRequest.accountId) &&
        Objects.equals(this.permissionProfile, updateMembershipRequest.permissionProfile) &&
        Objects.equals(this.groups, updateMembershipRequest.groups) &&
        Objects.equals(this.companyName, updateMembershipRequest.companyName) &&
        Objects.equals(this.jobTitle, updateMembershipRequest.jobTitle) &&
        Objects.equals(this.sendActivation, updateMembershipRequest.sendActivation) &&
        Objects.equals(this.accessCode, updateMembershipRequest.accessCode);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountId, permissionProfile, groups, companyName, jobTitle, sendActivation, accessCode);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMembershipRequest {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    permissionProfile: ").append(toIndentedString(permissionProfile)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    sendActivation: ").append(toIndentedString(sendActivation)).append("\n");
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
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

