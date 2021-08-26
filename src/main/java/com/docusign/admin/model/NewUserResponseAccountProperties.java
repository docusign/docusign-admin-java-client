package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.MemberGroupResponse;
import com.docusign.admin.model.PermissionProfileResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NewUserResponseAccountProperties
 */

public class NewUserResponseAccountProperties {
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

  public NewUserResponseAccountProperties id(java.util.UUID id) {
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

  public NewUserResponseAccountProperties siteId(Integer siteId) {
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

  public NewUserResponseAccountProperties permissionProfile(PermissionProfileResponse permissionProfile) {
    this.permissionProfile = permissionProfile;
    return this;
  }

   /**
   * Get permissionProfile
   * @return permissionProfile
  **/
  @ApiModelProperty(value = "")
  public PermissionProfileResponse getPermissionProfile() {
    return permissionProfile;
  }

  public void setPermissionProfile(PermissionProfileResponse permissionProfile) {
    this.permissionProfile = permissionProfile;
  }

  public NewUserResponseAccountProperties groups(java.util.List<MemberGroupResponse> groups) {
    this.groups = groups;
    return this;
  }

  public NewUserResponseAccountProperties addGroupsItem(MemberGroupResponse groupsItem) {
    if (this.groups == null) {
      this.groups = new java.util.ArrayList<MemberGroupResponse>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(value = "")
  public java.util.List<MemberGroupResponse> getGroups() {
    return groups;
  }

  public void setGroups(java.util.List<MemberGroupResponse> groups) {
    this.groups = groups;
  }

  public NewUserResponseAccountProperties companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(value = "")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public NewUserResponseAccountProperties jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Get jobTitle
   * @return jobTitle
  **/
  @ApiModelProperty(value = "")
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }


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
        Objects.equals(this.jobTitle, newUserResponseAccountProperties.jobTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, siteId, permissionProfile, groups, companyName, jobTitle);
  }


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

