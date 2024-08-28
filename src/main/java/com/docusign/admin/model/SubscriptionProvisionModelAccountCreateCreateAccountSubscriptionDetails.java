package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * SubscriptionProvisionModelAccountCreateCreateAccountSubscriptionDetails.
 *
 */

public class SubscriptionProvisionModelAccountCreateCreateAccountSubscriptionDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("SubscriptionId")
  private String subscriptionId = null;

  @JsonProperty("PlanId")
  private java.util.UUID planId = null;

  @JsonProperty("Modules")
  private java.util.List<java.util.UUID> modules = null;


  /**
   * subscriptionId.
   *
   * @return SubscriptionProvisionModelAccountCreateCreateAccountSubscriptionDetails
   **/
  public SubscriptionProvisionModelAccountCreateCreateAccountSubscriptionDetails subscriptionId(String subscriptionId) {
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
   * planId.
   *
   * @return SubscriptionProvisionModelAccountCreateCreateAccountSubscriptionDetails
   **/
  public SubscriptionProvisionModelAccountCreateCreateAccountSubscriptionDetails planId(java.util.UUID planId) {
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
   * modules.
   *
   * @return SubscriptionProvisionModelAccountCreateCreateAccountSubscriptionDetails
   **/
  public SubscriptionProvisionModelAccountCreateCreateAccountSubscriptionDetails modules(java.util.List<java.util.UUID> modules) {
    this.modules = modules;
    return this;
  }
  
  /**
   * addModulesItem.
   *
   * @return SubscriptionProvisionModelAccountCreateCreateAccountSubscriptionDetails
   **/
  public SubscriptionProvisionModelAccountCreateCreateAccountSubscriptionDetails addModulesItem(java.util.UUID modulesItem) {
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
  public java.util.List<java.util.UUID> getModules() {
    return modules;
  }

  /**
   * setModules.
   **/
  public void setModules(java.util.List<java.util.UUID> modules) {
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
    SubscriptionProvisionModelAccountCreateCreateAccountSubscriptionDetails subscriptionProvisionModelAccountCreateCreateAccountSubscriptionDetails = (SubscriptionProvisionModelAccountCreateCreateAccountSubscriptionDetails) o;
    return Objects.equals(this.subscriptionId, subscriptionProvisionModelAccountCreateCreateAccountSubscriptionDetails.subscriptionId) &&
        Objects.equals(this.planId, subscriptionProvisionModelAccountCreateCreateAccountSubscriptionDetails.planId) &&
        Objects.equals(this.modules, subscriptionProvisionModelAccountCreateCreateAccountSubscriptionDetails.modules);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, planId, modules);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProvisionModelAccountCreateCreateAccountSubscriptionDetails {\n");
    
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
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

