package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * SubAccountCreateRequestSubAccountCreationSubscription.
 *
 */

public class SubAccountCreateRequestSubAccountCreationSubscription implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("planId")
  private java.util.UUID planId = null;

  @JsonProperty("modules")
  private java.util.List<java.util.UUID> modules = null;


  /**
   * id.
   *
   * @return SubAccountCreateRequestSubAccountCreationSubscription
   **/
  public SubAccountCreateRequestSubAccountCreationSubscription id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id.
   * @return id
   **/
  @Schema(description = "")
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
   * @return SubAccountCreateRequestSubAccountCreationSubscription
   **/
  public SubAccountCreateRequestSubAccountCreationSubscription planId(java.util.UUID planId) {
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
   * @return SubAccountCreateRequestSubAccountCreationSubscription
   **/
  public SubAccountCreateRequestSubAccountCreationSubscription modules(java.util.List<java.util.UUID> modules) {
    this.modules = modules;
    return this;
  }
  
  /**
   * addModulesItem.
   *
   * @return SubAccountCreateRequestSubAccountCreationSubscription
   **/
  public SubAccountCreateRequestSubAccountCreationSubscription addModulesItem(java.util.UUID modulesItem) {
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
    SubAccountCreateRequestSubAccountCreationSubscription subAccountCreateRequestSubAccountCreationSubscription = (SubAccountCreateRequestSubAccountCreationSubscription) o;
    return Objects.equals(this.id, subAccountCreateRequestSubAccountCreationSubscription.id) &&
        Objects.equals(this.planId, subAccountCreateRequestSubAccountCreationSubscription.planId) &&
        Objects.equals(this.modules, subAccountCreateRequestSubAccountCreationSubscription.modules);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, planId, modules);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubAccountCreateRequestSubAccountCreationSubscription {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

