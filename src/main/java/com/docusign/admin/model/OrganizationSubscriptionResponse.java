package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.SubscriptionPlanItemResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * OrganizationSubscriptionResponse.
 *
 */

public class OrganizationSubscriptionResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("plan_id")
  private java.util.UUID planId = null;

  @JsonProperty("plan_name")
  private String planName = null;

  @JsonProperty("associated_accounts_count")
  private Integer associatedAccountsCount = null;

  @JsonProperty("asset_group_name")
  private String assetGroupName = null;

  @JsonProperty("asset_group_id")
  private java.util.UUID assetGroupId = null;

  @JsonProperty("subscription_name")
  private String subscriptionName = null;

  @JsonProperty("subscription_id")
  private String subscriptionId = null;

  @JsonProperty("modules")
  private java.util.List<SubscriptionPlanItemResponse> modules = null;


  /**
   * planId.
   *
   * @return OrganizationSubscriptionResponse
   **/
  public OrganizationSubscriptionResponse planId(java.util.UUID planId) {
    this.planId = planId;
    return this;
  }

  /**
   * Get planId.
   * @return planId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getPlanId() {
    return planId;
  }

  /**
   * setPlanId.
   **/
  public void setPlanId(java.util.UUID planId) {
    this.planId = planId;
  }


  /**
   * planName.
   *
   * @return OrganizationSubscriptionResponse
   **/
  public OrganizationSubscriptionResponse planName(String planName) {
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
   * associatedAccountsCount.
   *
   * @return OrganizationSubscriptionResponse
   **/
  public OrganizationSubscriptionResponse associatedAccountsCount(Integer associatedAccountsCount) {
    this.associatedAccountsCount = associatedAccountsCount;
    return this;
  }

  /**
   * Get associatedAccountsCount.
   * @return associatedAccountsCount
   **/
  @Schema(description = "")
  public Integer getAssociatedAccountsCount() {
    return associatedAccountsCount;
  }

  /**
   * setAssociatedAccountsCount.
   **/
  public void setAssociatedAccountsCount(Integer associatedAccountsCount) {
    this.associatedAccountsCount = associatedAccountsCount;
  }


  /**
   * assetGroupName.
   *
   * @return OrganizationSubscriptionResponse
   **/
  public OrganizationSubscriptionResponse assetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
    return this;
  }

  /**
   * Get assetGroupName.
   * @return assetGroupName
   **/
  @Schema(description = "")
  public String getAssetGroupName() {
    return assetGroupName;
  }

  /**
   * setAssetGroupName.
   **/
  public void setAssetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
  }


  /**
   * assetGroupId.
   *
   * @return OrganizationSubscriptionResponse
   **/
  public OrganizationSubscriptionResponse assetGroupId(java.util.UUID assetGroupId) {
    this.assetGroupId = assetGroupId;
    return this;
  }

  /**
   * Get assetGroupId.
   * @return assetGroupId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getAssetGroupId() {
    return assetGroupId;
  }

  /**
   * setAssetGroupId.
   **/
  public void setAssetGroupId(java.util.UUID assetGroupId) {
    this.assetGroupId = assetGroupId;
  }


  /**
   * subscriptionName.
   *
   * @return OrganizationSubscriptionResponse
   **/
  public OrganizationSubscriptionResponse subscriptionName(String subscriptionName) {
    this.subscriptionName = subscriptionName;
    return this;
  }

  /**
   * Get subscriptionName.
   * @return subscriptionName
   **/
  @Schema(description = "")
  public String getSubscriptionName() {
    return subscriptionName;
  }

  /**
   * setSubscriptionName.
   **/
  public void setSubscriptionName(String subscriptionName) {
    this.subscriptionName = subscriptionName;
  }


  /**
   * subscriptionId.
   *
   * @return OrganizationSubscriptionResponse
   **/
  public OrganizationSubscriptionResponse subscriptionId(String subscriptionId) {
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
   * modules.
   *
   * @return OrganizationSubscriptionResponse
   **/
  public OrganizationSubscriptionResponse modules(java.util.List<SubscriptionPlanItemResponse> modules) {
    this.modules = modules;
    return this;
  }
  
  /**
   * addModulesItem.
   *
   * @return OrganizationSubscriptionResponse
   **/
  public OrganizationSubscriptionResponse addModulesItem(SubscriptionPlanItemResponse modulesItem) {
    if (this.modules == null) {
      this.modules = new java.util.ArrayList<>();
    }
    this.modules.add(modulesItem);
    return this;
  }

  /**
   * Get modules.
   * @return modules
   **/
  @Schema(description = "")
  public java.util.List<SubscriptionPlanItemResponse> getModules() {
    return modules;
  }

  /**
   * setModules.
   **/
  public void setModules(java.util.List<SubscriptionPlanItemResponse> modules) {
    this.modules = modules;
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
    OrganizationSubscriptionResponse organizationSubscriptionResponse = (OrganizationSubscriptionResponse) o;
    return Objects.equals(this.planId, organizationSubscriptionResponse.planId) &&
        Objects.equals(this.planName, organizationSubscriptionResponse.planName) &&
        Objects.equals(this.associatedAccountsCount, organizationSubscriptionResponse.associatedAccountsCount) &&
        Objects.equals(this.assetGroupName, organizationSubscriptionResponse.assetGroupName) &&
        Objects.equals(this.assetGroupId, organizationSubscriptionResponse.assetGroupId) &&
        Objects.equals(this.subscriptionName, organizationSubscriptionResponse.subscriptionName) &&
        Objects.equals(this.subscriptionId, organizationSubscriptionResponse.subscriptionId) &&
        Objects.equals(this.modules, organizationSubscriptionResponse.modules);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(planId, planName, associatedAccountsCount, assetGroupName, assetGroupId, subscriptionName, subscriptionId, modules);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationSubscriptionResponse {\n");
    
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    associatedAccountsCount: ").append(toIndentedString(associatedAccountsCount)).append("\n");
    sb.append("    assetGroupName: ").append(toIndentedString(assetGroupName)).append("\n");
    sb.append("    assetGroupId: ").append(toIndentedString(assetGroupId)).append("\n");
    sb.append("    subscriptionName: ").append(toIndentedString(subscriptionName)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
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

