package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.MemberGroupResponse;
import com.docusign.admin.model.PermissionProfileResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * MembershipResponse.
 *
 */

public class MembershipResponse implements Serializable {
  private static final long serialVersionUID = 1L;

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
  private String createdOn = null;

  @JsonProperty("groups")
  private java.util.List<MemberGroupResponse> groups = null;

  @JsonProperty("is_admin")
  private Boolean isAdmin = null;


  /**
   * email.
   *
   * @return MembershipResponse
   **/
  public MembershipResponse email(String email) {
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
   * accountId.
   *
   * @return MembershipResponse
   **/
  public MembershipResponse accountId(java.util.UUID accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId.
   * @return accountId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
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
   * externalAccountId.
   *
   * @return MembershipResponse
   **/
  public MembershipResponse externalAccountId(String externalAccountId) {
    this.externalAccountId = externalAccountId;
    return this;
  }

  /**
   * Get externalAccountId.
   * @return externalAccountId
   **/
  @Schema(description = "")
  public String getExternalAccountId() {
    return externalAccountId;
  }

  /**
   * setExternalAccountId.
   **/
  public void setExternalAccountId(String externalAccountId) {
    this.externalAccountId = externalAccountId;
  }


  /**
   * accountName.
   *
   * @return MembershipResponse
   **/
  public MembershipResponse accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Get accountName.
   * @return accountName
   **/
  @Schema(description = "")
  public String getAccountName() {
    return accountName;
  }

  /**
   * setAccountName.
   **/
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  /**
   * isExternalAccount.
   *
   * @return MembershipResponse
   **/
  public MembershipResponse isExternalAccount(Boolean isExternalAccount) {
    this.isExternalAccount = isExternalAccount;
    return this;
  }

  /**
   * Get isExternalAccount.
   * @return isExternalAccount
   **/
  @Schema(description = "")
  public Boolean isIsExternalAccount() {
    return isExternalAccount;
  }

  /**
   * setIsExternalAccount.
   **/
  public void setIsExternalAccount(Boolean isExternalAccount) {
    this.isExternalAccount = isExternalAccount;
  }


  /**
   * status.
   *
   * @return MembershipResponse
   **/
  public MembershipResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status.
   * @return status
   **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * permissionProfile.
   *
   * @return MembershipResponse
   **/
  public MembershipResponse permissionProfile(PermissionProfileResponse permissionProfile) {
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
   * createdOn.
   *
   * @return MembershipResponse
   **/
  public MembershipResponse createdOn(String createdOn) {
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
   * groups.
   *
   * @return MembershipResponse
   **/
  public MembershipResponse groups(java.util.List<MemberGroupResponse> groups) {
    this.groups = groups;
    return this;
  }
  
  /**
   * addGroupsItem.
   *
   * @return MembershipResponse
   **/
  public MembershipResponse addGroupsItem(MemberGroupResponse groupsItem) {
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
   * isAdmin.
   *
   * @return MembershipResponse
   **/
  public MembershipResponse isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

  /**
   * Get isAdmin.
   * @return isAdmin
   **/
  @Schema(description = "")
  public Boolean isIsAdmin() {
    return isAdmin;
  }

  /**
   * setIsAdmin.
   **/
  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(email, accountId, externalAccountId, accountName, isExternalAccount, status, permissionProfile, createdOn, groups, isAdmin);
  }


  /**
   * Converts the given object to string.
   */
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

