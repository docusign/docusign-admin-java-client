package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * DSGroupResponse.
 *
 */

public class DSGroupResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("ds_group_id")
  private java.util.UUID dsGroupId = null;

  @JsonProperty("account_id")
  private java.util.UUID accountId = null;

  @JsonProperty("source_product_name")
  private String sourceProductName = null;

  @JsonProperty("group_id")
  private String groupId = null;

  @JsonProperty("group_name")
  private String groupName = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("is_admin")
  private Boolean isAdmin = null;

  @JsonProperty("last_modified_on")
  private String lastModifiedOn = null;

  @JsonProperty("user_count")
  private Integer userCount = null;

  @JsonProperty("external_account_id")
  private Long externalAccountId = null;

  @JsonProperty("account_name")
  private String accountName = null;


  /**
   * dsGroupId.
   *
   * @return DSGroupResponse
   **/
  public DSGroupResponse dsGroupId(java.util.UUID dsGroupId) {
    this.dsGroupId = dsGroupId;
    return this;
  }

  /**
   * Get dsGroupId.
   * @return dsGroupId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getDsGroupId() {
    return dsGroupId;
  }

  /**
   * setDsGroupId.
   **/
  public void setDsGroupId(java.util.UUID dsGroupId) {
    this.dsGroupId = dsGroupId;
  }


  /**
   * accountId.
   *
   * @return DSGroupResponse
   **/
  public DSGroupResponse accountId(java.util.UUID accountId) {
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
   * sourceProductName.
   *
   * @return DSGroupResponse
   **/
  public DSGroupResponse sourceProductName(String sourceProductName) {
    this.sourceProductName = sourceProductName;
    return this;
  }

  /**
   * Get sourceProductName.
   * @return sourceProductName
   **/
  @Schema(description = "")
  public String getSourceProductName() {
    return sourceProductName;
  }

  /**
   * setSourceProductName.
   **/
  public void setSourceProductName(String sourceProductName) {
    this.sourceProductName = sourceProductName;
  }


  /**
   * groupId.
   *
   * @return DSGroupResponse
   **/
  public DSGroupResponse groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId.
   * @return groupId
   **/
  @Schema(description = "")
  public String getGroupId() {
    return groupId;
  }

  /**
   * setGroupId.
   **/
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  /**
   * groupName.
   *
   * @return DSGroupResponse
   **/
  public DSGroupResponse groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * Get groupName.
   * @return groupName
   **/
  @Schema(description = "")
  public String getGroupName() {
    return groupName;
  }

  /**
   * setGroupName.
   **/
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  /**
   * description.
   *
   * @return DSGroupResponse
   **/
  public DSGroupResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description.
   * @return description
   **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  /**
   * setDescription.
   **/
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * isAdmin.
   *
   * @return DSGroupResponse
   **/
  public DSGroupResponse isAdmin(Boolean isAdmin) {
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
   * lastModifiedOn.
   *
   * @return DSGroupResponse
   **/
  public DSGroupResponse lastModifiedOn(String lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  /**
   * Get lastModifiedOn.
   * @return lastModifiedOn
   **/
  @Schema(description = "")
  public String getLastModifiedOn() {
    return lastModifiedOn;
  }

  /**
   * setLastModifiedOn.
   **/
  public void setLastModifiedOn(String lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }


  /**
   * userCount.
   *
   * @return DSGroupResponse
   **/
  public DSGroupResponse userCount(Integer userCount) {
    this.userCount = userCount;
    return this;
  }

  /**
   * Get userCount.
   * @return userCount
   **/
  @Schema(description = "")
  public Integer getUserCount() {
    return userCount;
  }

  /**
   * setUserCount.
   **/
  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }


  /**
   * externalAccountId.
   *
   * @return DSGroupResponse
   **/
  public DSGroupResponse externalAccountId(Long externalAccountId) {
    this.externalAccountId = externalAccountId;
    return this;
  }

  /**
   * Get externalAccountId.
   * @return externalAccountId
   **/
  @Schema(description = "")
  public Long getExternalAccountId() {
    return externalAccountId;
  }

  /**
   * setExternalAccountId.
   **/
  public void setExternalAccountId(Long externalAccountId) {
    this.externalAccountId = externalAccountId;
  }


  /**
   * accountName.
   *
   * @return DSGroupResponse
   **/
  public DSGroupResponse accountName(String accountName) {
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
    DSGroupResponse dsGroupResponse = (DSGroupResponse) o;
    return Objects.equals(this.dsGroupId, dsGroupResponse.dsGroupId) &&
        Objects.equals(this.accountId, dsGroupResponse.accountId) &&
        Objects.equals(this.sourceProductName, dsGroupResponse.sourceProductName) &&
        Objects.equals(this.groupId, dsGroupResponse.groupId) &&
        Objects.equals(this.groupName, dsGroupResponse.groupName) &&
        Objects.equals(this.description, dsGroupResponse.description) &&
        Objects.equals(this.isAdmin, dsGroupResponse.isAdmin) &&
        Objects.equals(this.lastModifiedOn, dsGroupResponse.lastModifiedOn) &&
        Objects.equals(this.userCount, dsGroupResponse.userCount) &&
        Objects.equals(this.externalAccountId, dsGroupResponse.externalAccountId) &&
        Objects.equals(this.accountName, dsGroupResponse.accountName);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(dsGroupId, accountId, sourceProductName, groupId, groupName, description, isAdmin, lastModifiedOn, userCount, externalAccountId, accountName);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSGroupResponse {\n");
    
    sb.append("    dsGroupId: ").append(toIndentedString(dsGroupId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    sourceProductName: ").append(toIndentedString(sourceProductName)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
    sb.append("    externalAccountId: ").append(toIndentedString(externalAccountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
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

