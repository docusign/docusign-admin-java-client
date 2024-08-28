package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.GroupRequest;
import com.docusign.admin.model.PermissionProfileRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * NewUserRequestAccountProperties.
 *
 */

public class NewUserRequestAccountProperties implements Serializable {
  private static final long serialVersionUID = 1L;

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


  /**
   * id.
   *
   * @return NewUserRequestAccountProperties
   **/
  public NewUserRequestAccountProperties id(java.util.UUID id) {
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
   * permissionProfile.
   *
   * @return NewUserRequestAccountProperties
   **/
  public NewUserRequestAccountProperties permissionProfile(PermissionProfileRequest permissionProfile) {
    this.permissionProfile = permissionProfile;
    return this;
  }

  /**
   * Get permissionProfile.
   * @return permissionProfile
   **/
  @Schema(description = "")
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
   * @return NewUserRequestAccountProperties
   **/
  public NewUserRequestAccountProperties groups(java.util.List<GroupRequest> groups) {
    this.groups = groups;
    return this;
  }
  
  /**
   * addGroupsItem.
   *
   * @return NewUserRequestAccountProperties
   **/
  public NewUserRequestAccountProperties addGroupsItem(GroupRequest groupsItem) {
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
   * @return NewUserRequestAccountProperties
   **/
  public NewUserRequestAccountProperties companyName(String companyName) {
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
   * @return NewUserRequestAccountProperties
   **/
  public NewUserRequestAccountProperties jobTitle(String jobTitle) {
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
    NewUserRequestAccountProperties newUserRequestAccountProperties = (NewUserRequestAccountProperties) o;
    return Objects.equals(this.id, newUserRequestAccountProperties.id) &&
        Objects.equals(this.permissionProfile, newUserRequestAccountProperties.permissionProfile) &&
        Objects.equals(this.groups, newUserRequestAccountProperties.groups) &&
        Objects.equals(this.companyName, newUserRequestAccountProperties.companyName) &&
        Objects.equals(this.jobTitle, newUserRequestAccountProperties.jobTitle);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, permissionProfile, groups, companyName, jobTitle);
  }


  /**
   * Converts the given object to string.
   */
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

