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
import org.joda.time.DateTime;

/**
 * MembershipResponse
 */

public class MembershipResponse {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("account_id")
  private java.util.UUID accountId = null;

  @JsonProperty("external_account_id")
  private String externalAccountId = null;

  @JsonProperty("account_name")
  private String accountName = null;

  @JsonProperty("is_external_account")
  private Boolean isExternalAccount = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("permission_profile")
  private PermissionProfileResponse permissionProfile = null;

  @JsonProperty("created_on")
  private DateTime createdOn = null;

  @JsonProperty("groups")
  private java.util.List<MemberGroupResponse> groups = null;

  @JsonProperty("is_admin")
  private Boolean isAdmin = null;

  public MembershipResponse email(String email) {
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

  public MembershipResponse accountId(java.util.UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")
  public java.util.UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(java.util.UUID accountId) {
    this.accountId = accountId;
  }

  public MembershipResponse externalAccountId(String externalAccountId) {
    this.externalAccountId = externalAccountId;
    return this;
  }

   /**
   * Get externalAccountId
   * @return externalAccountId
  **/
  @ApiModelProperty(value = "")
  public String getExternalAccountId() {
    return externalAccountId;
  }

  public void setExternalAccountId(String externalAccountId) {
    this.externalAccountId = externalAccountId;
  }

  public MembershipResponse accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @ApiModelProperty(value = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public MembershipResponse isExternalAccount(Boolean isExternalAccount) {
    this.isExternalAccount = isExternalAccount;
    return this;
  }

   /**
   * Get isExternalAccount
   * @return isExternalAccount
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsExternalAccount() {
    return isExternalAccount;
  }

  public void setIsExternalAccount(Boolean isExternalAccount) {
    this.isExternalAccount = isExternalAccount;
  }

  public MembershipResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public MembershipResponse permissionProfile(PermissionProfileResponse permissionProfile) {
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

  public MembershipResponse createdOn(DateTime createdOn) {
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

  public MembershipResponse groups(java.util.List<MemberGroupResponse> groups) {
    this.groups = groups;
    return this;
  }

  public MembershipResponse addGroupsItem(MemberGroupResponse groupsItem) {
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

  public MembershipResponse isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

   /**
   * Get isAdmin
   * @return isAdmin
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MembershipResponse membershipResponse = (MembershipResponse) o;
    return Objects.equals(this.email, membershipResponse.email) &&
        Objects.equals(this.accountId, membershipResponse.accountId) &&
        Objects.equals(this.externalAccountId, membershipResponse.externalAccountId) &&
        Objects.equals(this.accountName, membershipResponse.accountName) &&
        Objects.equals(this.isExternalAccount, membershipResponse.isExternalAccount) &&
        Objects.equals(this.status, membershipResponse.status) &&
        Objects.equals(this.permissionProfile, membershipResponse.permissionProfile) &&
        Objects.equals(this.createdOn, membershipResponse.createdOn) &&
        Objects.equals(this.groups, membershipResponse.groups) &&
        Objects.equals(this.isAdmin, membershipResponse.isAdmin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, accountId, externalAccountId, accountName, isExternalAccount, status, permissionProfile, createdOn, groups, isAdmin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MembershipResponse {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    externalAccountId: ").append(toIndentedString(externalAccountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    isExternalAccount: ").append(toIndentedString(isExternalAccount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    permissionProfile: ").append(toIndentedString(permissionProfile)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
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

