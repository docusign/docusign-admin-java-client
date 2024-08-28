package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.SubAccountCreateSubscriptionModuleDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * SubAccountCreateSubscriptionDetails.
 *
 */

public class SubAccountCreateSubscriptionDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("planId")
  private java.util.UUID planId = null;

  @JsonProperty("planName")
  private String planName = null;

  @JsonProperty("modules")
  private java.util.List<SubAccountCreateSubscriptionModuleDetails> modules = null;


  /**
   * id.
   *
   * @return SubAccountCreateSubscriptionDetails
   **/
  public SubAccountCreateSubscriptionDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Subscription ID.
   * @return id
   **/
  @Schema(description = "Subscription ID")
  public String getId() {
    return id;
  }

  /**
   * setId.
   **/
  public void setId(String id) {
    this.id = id;
  }


  /**
   * planId.
   *
   * @return SubAccountCreateSubscriptionDetails
   **/
  public SubAccountCreateSubscriptionDetails planId(java.util.UUID planId) {
    this.planId = planId;
    return this;
  }

  /**
   * Plan ID.
   * @return planId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "Plan ID")
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
   * @return SubAccountCreateSubscriptionDetails
   **/
  public SubAccountCreateSubscriptionDetails planName(String planName) {
    this.planName = planName;
    return this;
  }

  /**
   * Plan Name.
   * @return planName
   **/
  @Schema(description = "Plan Name")
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
   * modules.
   *
   * @return SubAccountCreateSubscriptionDetails
   **/
  public SubAccountCreateSubscriptionDetails modules(java.util.List<SubAccountCreateSubscriptionModuleDetails> modules) {
    this.modules = modules;
    return this;
  }
  
  /**
   * addModulesItem.
   *
   * @return SubAccountCreateSubscriptionDetails
   **/
  public SubAccountCreateSubscriptionDetails addModulesItem(SubAccountCreateSubscriptionModuleDetails modulesItem) {
    if (this.modules == null) {
      this.modules = new java.util.ArrayList<>();
    }
    this.modules.add(modulesItem);
    return this;
  }

  /**
   * List of module IDs selected for creating the new account.
   * @return modules
   **/
  @Schema(description = "List of module IDs selected for creating the new account")
  public java.util.List<SubAccountCreateSubscriptionModuleDetails> getModules() {
    return modules;
  }

  /**
   * setModules.
   **/
  public void setModules(java.util.List<SubAccountCreateSubscriptionModuleDetails> modules) {
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
    SubAccountCreateSubscriptionDetails subAccountCreateSubscriptionDetails = (SubAccountCreateSubscriptionDetails) o;
    return Objects.equals(this.id, subAccountCreateSubscriptionDetails.id) &&
        Objects.equals(this.planId, subAccountCreateSubscriptionDetails.planId) &&
        Objects.equals(this.planName, subAccountCreateSubscriptionDetails.planName) &&
        Objects.equals(this.modules, subAccountCreateSubscriptionDetails.modules);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, planId, planName, modules);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubAccountCreateSubscriptionDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
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

