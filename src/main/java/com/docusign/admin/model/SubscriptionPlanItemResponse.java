package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * SubscriptionPlanItemResponse.
 *
 */

public class SubscriptionPlanItemResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("plan_item_id")
  private java.util.UUID planItemId = null;

  @JsonProperty("plan_item_name")
  private String planItemName = null;

  @JsonProperty("plan_item_description")
  private String planItemDescription = null;

  @JsonProperty("plan_item_internal_id")
  private String planItemInternalId = null;


  /**
   * planItemId.
   *
   * @return SubscriptionPlanItemResponse
   **/
  public SubscriptionPlanItemResponse planItemId(java.util.UUID planItemId) {
    this.planItemId = planItemId;
    return this;
  }

  /**
   * Get planItemId.
   * @return planItemId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getPlanItemId() {
    return planItemId;
  }

  /**
   * setPlanItemId.
   **/
  public void setPlanItemId(java.util.UUID planItemId) {
    this.planItemId = planItemId;
  }


  /**
   * planItemName.
   *
   * @return SubscriptionPlanItemResponse
   **/
  public SubscriptionPlanItemResponse planItemName(String planItemName) {
    this.planItemName = planItemName;
    return this;
  }

  /**
   * Get planItemName.
   * @return planItemName
   **/
  @Schema(description = "")
  public String getPlanItemName() {
    return planItemName;
  }

  /**
   * setPlanItemName.
   **/
  public void setPlanItemName(String planItemName) {
    this.planItemName = planItemName;
  }


  /**
   * planItemDescription.
   *
   * @return SubscriptionPlanItemResponse
   **/
  public SubscriptionPlanItemResponse planItemDescription(String planItemDescription) {
    this.planItemDescription = planItemDescription;
    return this;
  }

  /**
   * Get planItemDescription.
   * @return planItemDescription
   **/
  @Schema(description = "")
  public String getPlanItemDescription() {
    return planItemDescription;
  }

  /**
   * setPlanItemDescription.
   **/
  public void setPlanItemDescription(String planItemDescription) {
    this.planItemDescription = planItemDescription;
  }


  /**
   * planItemInternalId.
   *
   * @return SubscriptionPlanItemResponse
   **/
  public SubscriptionPlanItemResponse planItemInternalId(String planItemInternalId) {
    this.planItemInternalId = planItemInternalId;
    return this;
  }

  /**
   * Get planItemInternalId.
   * @return planItemInternalId
   **/
  @Schema(description = "")
  public String getPlanItemInternalId() {
    return planItemInternalId;
  }

  /**
   * setPlanItemInternalId.
   **/
  public void setPlanItemInternalId(String planItemInternalId) {
    this.planItemInternalId = planItemInternalId;
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
    SubscriptionPlanItemResponse subscriptionPlanItemResponse = (SubscriptionPlanItemResponse) o;
    return Objects.equals(this.planItemId, subscriptionPlanItemResponse.planItemId) &&
        Objects.equals(this.planItemName, subscriptionPlanItemResponse.planItemName) &&
        Objects.equals(this.planItemDescription, subscriptionPlanItemResponse.planItemDescription) &&
        Objects.equals(this.planItemInternalId, subscriptionPlanItemResponse.planItemInternalId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(planItemId, planItemName, planItemDescription, planItemInternalId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPlanItemResponse {\n");
    
    sb.append("    planItemId: ").append(toIndentedString(planItemId)).append("\n");
    sb.append("    planItemName: ").append(toIndentedString(planItemName)).append("\n");
    sb.append("    planItemDescription: ").append(toIndentedString(planItemDescription)).append("\n");
    sb.append("    planItemInternalId: ").append(toIndentedString(planItemInternalId)).append("\n");
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

