package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.SubAccountCreateRequestSubAccountCreationSubscription;
import com.docusign.admin.model.SubAccountCreateRequestSubAccountCreationTargetAccountDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * SubAccountCreateRequest.
 *
 */

public class SubAccountCreateRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("subscriptionDetails")
  private SubAccountCreateRequestSubAccountCreationSubscription subscriptionDetails = null;

  @JsonProperty("targetAccount")
  private SubAccountCreateRequestSubAccountCreationTargetAccountDetails targetAccount = null;


  /**
   * subscriptionDetails.
   *
   * @return SubAccountCreateRequest
   **/
  public SubAccountCreateRequest subscriptionDetails(SubAccountCreateRequestSubAccountCreationSubscription subscriptionDetails) {
    this.subscriptionDetails = subscriptionDetails;
    return this;
  }

  /**
   * Get subscriptionDetails.
   * @return subscriptionDetails
   **/
  @Schema(description = "")
  public SubAccountCreateRequestSubAccountCreationSubscription getSubscriptionDetails() {
    return subscriptionDetails;
  }

  /**
   * setSubscriptionDetails.
   **/
  public void setSubscriptionDetails(SubAccountCreateRequestSubAccountCreationSubscription subscriptionDetails) {
    this.subscriptionDetails = subscriptionDetails;
  }


  /**
   * targetAccount.
   *
   * @return SubAccountCreateRequest
   **/
  public SubAccountCreateRequest targetAccount(SubAccountCreateRequestSubAccountCreationTargetAccountDetails targetAccount) {
    this.targetAccount = targetAccount;
    return this;
  }

  /**
   * Get targetAccount.
   * @return targetAccount
   **/
  @Schema(description = "")
  public SubAccountCreateRequestSubAccountCreationTargetAccountDetails getTargetAccount() {
    return targetAccount;
  }

  /**
   * setTargetAccount.
   **/
  public void setTargetAccount(SubAccountCreateRequestSubAccountCreationTargetAccountDetails targetAccount) {
    this.targetAccount = targetAccount;
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
    SubAccountCreateRequest subAccountCreateRequest = (SubAccountCreateRequest) o;
    return Objects.equals(this.subscriptionDetails, subAccountCreateRequest.subscriptionDetails) &&
        Objects.equals(this.targetAccount, subAccountCreateRequest.targetAccount);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(subscriptionDetails, targetAccount);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubAccountCreateRequest {\n");
    
    sb.append("    subscriptionDetails: ").append(toIndentedString(subscriptionDetails)).append("\n");
    sb.append("    targetAccount: ").append(toIndentedString(targetAccount)).append("\n");
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

