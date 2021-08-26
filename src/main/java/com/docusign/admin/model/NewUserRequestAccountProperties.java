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
 * NewUserRequestAccountProperties
 */

public class NewUserRequestAccountProperties {
  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("permission_profile")
  private PermissionProfileRequest permissionProfile = null;

  @JsonProperty("groups")
  private java.util.List<GroupRequest> groups = null;

  @JsonProperty("company_name")
  private String companyName = null;

  @JsonProperty("job_title")
  private String jobTitle = null;

  public NewUserRequestAccountProperties id(java.util.UUID id) {
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

  public NewUserRequestAccountProperties permissionProfile(PermissionProfileRequest permissionProfile) {
    this.permissionProfile = permissionProfile;
    return this;
  }

   /**
   * Get permissionProfile
   * @return permissionProfile
  **/
  @ApiModelProperty(value = "")
  public PermissionProfileRequest getPermissionProfile() {
    return permissionProfile;
  }

  public void setPermissionProfile(PermissionProfileRequest permissionProfile) {
    this.permissionProfile = permissionProfile;
  }

  public NewUserRequestAccountProperties groups(java.util.List<GroupRequest> groups) {
    this.groups = groups;
    return this;
  }

  public NewUserRequestAccountProperties addGroupsItem(GroupRequest groupsItem) {
    if (this.groups == null) {
      this.groups = new java.util.ArrayList<GroupRequest>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(value = "")
  public java.util.List<GroupRequest> getGroups() {
    return groups;
  }

  public void setGroups(java.util.List<GroupRequest> groups) {
    this.groups = groups;
  }

  public NewUserRequestAccountProperties companyName(String companyName) {
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

  public NewUserRequestAccountProperties jobTitle(String jobTitle) {
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
    NewUserRequestAccountProperties newUserRequestAccountProperties = (NewUserRequestAccountProperties) o;
    return Objects.equals(this.id, newUserRequestAccountProperties.id) &&
        Objects.equals(this.permissionProfile, newUserRequestAccountProperties.permissionProfile) &&
        Objects.equals(this.groups, newUserRequestAccountProperties.groups) &&
        Objects.equals(this.companyName, newUserRequestAccountProperties.companyName) &&
        Objects.equals(this.jobTitle, newUserRequestAccountProperties.jobTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, permissionProfile, groups, companyName, jobTitle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUserRequestAccountProperties {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

