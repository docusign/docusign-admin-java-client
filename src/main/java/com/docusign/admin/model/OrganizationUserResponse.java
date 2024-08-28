package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.DSGroupResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * OrganizationUserResponse.
 *
 */

public class OrganizationUserResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("user_name")
  private String userName = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("user_status")
  private String userStatus = null;

  @JsonProperty("membership_status")
  private String membershipStatus = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("created_on")
  private String createdOn = null;

  @JsonProperty("membership_created_on")
  private String membershipCreatedOn = null;

  @JsonProperty("ds_groups")
  private java.util.List<DSGroupResponse> dsGroups = null;

  @JsonProperty("membership_id")
  private java.util.UUID membershipId = null;


  /**
   * id.
   *
   * @return OrganizationUserResponse
   **/
  public OrganizationUserResponse id(java.util.UUID id) {
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
   * userName.
   *
   * @return OrganizationUserResponse
   **/
  public OrganizationUserResponse userName(String userName) {
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
   * @return OrganizationUserResponse
   **/
  public OrganizationUserResponse firstName(String firstName) {
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
   * @return OrganizationUserResponse
   **/
  public OrganizationUserResponse lastName(String lastName) {
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
   * @return OrganizationUserResponse
   **/
  public OrganizationUserResponse userStatus(String userStatus) {
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
   * membershipStatus.
   *
   * @return OrganizationUserResponse
   **/
  public OrganizationUserResponse membershipStatus(String membershipStatus) {
    this.membershipStatus = membershipStatus;
    return this;
  }

  /**
   * Get membershipStatus.
   * @return membershipStatus
   **/
  @Schema(description = "")
  public String getMembershipStatus() {
    return membershipStatus;
  }

  /**
   * setMembershipStatus.
   **/
  public void setMembershipStatus(String membershipStatus) {
    this.membershipStatus = membershipStatus;
  }


  /**
   * email.
   *
   * @return OrganizationUserResponse
   **/
  public OrganizationUserResponse email(String email) {
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
   * createdOn.
   *
   * @return OrganizationUserResponse
   **/
  public OrganizationUserResponse createdOn(String createdOn) {
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
   * membershipCreatedOn.
   *
   * @return OrganizationUserResponse
   **/
  public OrganizationUserResponse membershipCreatedOn(String membershipCreatedOn) {
    this.membershipCreatedOn = membershipCreatedOn;
    return this;
  }

  /**
   * Get membershipCreatedOn.
   * @return membershipCreatedOn
   **/
  @Schema(description = "")
  public String getMembershipCreatedOn() {
    return membershipCreatedOn;
  }

  /**
   * setMembershipCreatedOn.
   **/
  public void setMembershipCreatedOn(String membershipCreatedOn) {
    this.membershipCreatedOn = membershipCreatedOn;
  }


  /**
   * dsGroups.
   *
   * @return OrganizationUserResponse
   **/
  public OrganizationUserResponse dsGroups(java.util.List<DSGroupResponse> dsGroups) {
    this.dsGroups = dsGroups;
    return this;
  }
  
  /**
   * addDsGroupsItem.
   *
   * @return OrganizationUserResponse
   **/
  public OrganizationUserResponse addDsGroupsItem(DSGroupResponse dsGroupsItem) {
    if (this.dsGroups == null) {
      this.dsGroups = new java.util.ArrayList<>();
    }
    this.dsGroups.add(dsGroupsItem);
    return this;
  }

  /**
   * Get dsGroups.
   * @return dsGroups
   **/
  @Schema(description = "")
  public java.util.List<DSGroupResponse> getDsGroups() {
    return dsGroups;
  }

  /**
   * setDsGroups.
   **/
  public void setDsGroups(java.util.List<DSGroupResponse> dsGroups) {
    this.dsGroups = dsGroups;
  }


  /**
   * membershipId.
   *
   * @return OrganizationUserResponse
   **/
  public OrganizationUserResponse membershipId(java.util.UUID membershipId) {
    this.membershipId = membershipId;
    return this;
  }

  /**
   * Get membershipId.
   * @return membershipId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getMembershipId() {
    return membershipId;
  }

  /**
   * setMembershipId.
   **/
  public void setMembershipId(java.util.UUID membershipId) {
    this.membershipId = membershipId;
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
    OrganizationUserResponse organizationUserResponse = (OrganizationUserResponse) o;
    return Objects.equals(this.id, organizationUserResponse.id) &&
        Objects.equals(this.userName, organizationUserResponse.userName) &&
        Objects.equals(this.firstName, organizationUserResponse.firstName) &&
        Objects.equals(this.lastName, organizationUserResponse.lastName) &&
        Objects.equals(this.userStatus, organizationUserResponse.userStatus) &&
        Objects.equals(this.membershipStatus, organizationUserResponse.membershipStatus) &&
        Objects.equals(this.email, organizationUserResponse.email) &&
        Objects.equals(this.createdOn, organizationUserResponse.createdOn) &&
        Objects.equals(this.membershipCreatedOn, organizationUserResponse.membershipCreatedOn) &&
        Objects.equals(this.dsGroups, organizationUserResponse.dsGroups) &&
        Objects.equals(this.membershipId, organizationUserResponse.membershipId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, userName, firstName, lastName, userStatus, membershipStatus, email, createdOn, membershipCreatedOn, dsGroups, membershipId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationUserResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("    membershipStatus: ").append(toIndentedString(membershipStatus)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    membershipCreatedOn: ").append(toIndentedString(membershipCreatedOn)).append("\n");
    sb.append("    dsGroups: ").append(toIndentedString(dsGroups)).append("\n");
    sb.append("    membershipId: ").append(toIndentedString(membershipId)).append("\n");
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

