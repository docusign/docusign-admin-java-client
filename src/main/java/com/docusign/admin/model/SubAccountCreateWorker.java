package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.SubAccountCreateSubscriptionDetails;
import com.docusign.admin.model.SubAccountCreateTargetAccount;
import com.docusign.admin.model.SubAccountErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * SubAccountCreateWorker.
 *
 */

public class SubAccountCreateWorker implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("targetAccount")
  private SubAccountCreateTargetAccount targetAccount = null;

  @JsonProperty("subscriptionDetails")
  private SubAccountCreateSubscriptionDetails subscriptionDetails = null;

  @JsonProperty("assetGroupWorkId")
  private java.util.UUID assetGroupWorkId = null;

  @JsonProperty("assetGroupId")
  private java.util.UUID assetGroupId = null;

  /**
   * The type of asset group work.
   */
  public enum AssetGroupWorkTypeEnum {
    UNDEFINED("Undefined"),
    
    GROUPASSETFULFILLMENT("GroupAssetFulfillment"),
    
    ACCOUNTASSETFULFILLMENT("AccountAssetFulfillment"),
    
    ACCOUNTASSETCLONE("AccountAssetClone"),
    
    ACCOUNTASSETCREATE("AccountAssetCreate"),
    
    SUBSCRIPTIONSYNC("SubscriptionSync");

    private String value;

    AssetGroupWorkTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AssetGroupWorkTypeEnum fromValue(String value) {
      for (AssetGroupWorkTypeEnum b : AssetGroupWorkTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("assetGroupWorkType")
  private AssetGroupWorkTypeEnum assetGroupWorkType = null;

  /**
   * The account creation status.
   */
  public enum StatusEnum {
    UNDEFINED("Undefined"),
    
    PENDING("Pending"),
    
    PROCESSING("Processing"),
    
    PROCESSINGONHOLD("ProcessingOnHold"),
    
    PENDINGERROR("PendingError"),
    
    PROCESSINGERROR("ProcessingError"),
    
    COMPLETED("Completed"),
    
    CANCELED("Canceled"),
    
    PERMANENTFAILURE("PermanentFailure");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("orderId")
  private java.util.UUID orderId = null;

  @JsonProperty("attempts")
  private Integer attempts = null;

  @JsonProperty("createdDate")
  private String createdDate = null;

  @JsonProperty("createdByName")
  private String createdByName = null;

  @JsonProperty("createdByEmail")
  private String createdByEmail = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("createAccountProcessingFailureDetails")
  private SubAccountErrorDetails createAccountProcessingFailureDetails = null;


  /**
   * targetAccount.
   *
   * @return SubAccountCreateWorker
   **/
  public SubAccountCreateWorker targetAccount(SubAccountCreateTargetAccount targetAccount) {
    this.targetAccount = targetAccount;
    return this;
  }

  /**
   * The target account being created.
   * @return targetAccount
   **/
  @Schema(required = true, description = "The target account being created")
  public SubAccountCreateTargetAccount getTargetAccount() {
    return targetAccount;
  }

  /**
   * setTargetAccount.
   **/
  public void setTargetAccount(SubAccountCreateTargetAccount targetAccount) {
    this.targetAccount = targetAccount;
  }


  /**
   * subscriptionDetails.
   *
   * @return SubAccountCreateWorker
   **/
  public SubAccountCreateWorker subscriptionDetails(SubAccountCreateSubscriptionDetails subscriptionDetails) {
    this.subscriptionDetails = subscriptionDetails;
    return this;
  }

  /**
   * The subscription info to create the account.
   * @return subscriptionDetails
   **/
  @Schema(required = true, description = "The subscription info to create the account")
  public SubAccountCreateSubscriptionDetails getSubscriptionDetails() {
    return subscriptionDetails;
  }

  /**
   * setSubscriptionDetails.
   **/
  public void setSubscriptionDetails(SubAccountCreateSubscriptionDetails subscriptionDetails) {
    this.subscriptionDetails = subscriptionDetails;
  }

  /**
   * The create account work id..
   * @return assetGroupWorkId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "The create account work id.")
  public java.util.UUID getAssetGroupWorkId() {
    return assetGroupWorkId;
  }

  /**
   * The asset group id the accounts belong to..
   * @return assetGroupId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "The asset group id the accounts belong to.")
  public java.util.UUID getAssetGroupId() {
    return assetGroupId;
  }

  /**
   * The type of asset group work..
   * @return assetGroupWorkType
   **/
  @Schema(description = "The type of asset group work.")
  public AssetGroupWorkTypeEnum getAssetGroupWorkType() {
    return assetGroupWorkType;
  }

  /**
   * The account creation status..
   * @return status
   **/
  @Schema(description = "The account creation status.")
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * The order id created by the creation work..
   * @return orderId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "The order id created by the creation work.")
  public java.util.UUID getOrderId() {
    return orderId;
  }

  /**
   * The number of times the work has been attempted..
   * @return attempts
   **/
  @Schema(description = "The number of times the work has been attempted.")
  public Integer getAttempts() {
    return attempts;
  }

  /**
   * The date the account creation work is initiated..
   * @return createdDate
   **/
  @Schema(description = "The date the account creation work is initiated.")
  public String getCreatedDate() {
    return createdDate;
  }

  /**
   * The name of the initiator of the account creation work..
   * @return createdByName
   **/
  @Schema(description = "The name of the initiator of the account creation work.")
  public String getCreatedByName() {
    return createdByName;
  }

  /**
   * The email of the creator of the account creation work..
   * @return createdByEmail
   **/
  @Schema(description = "The email of the creator of the account creation work.")
  public String getCreatedByEmail() {
    return createdByEmail;
  }

  /**
   * The message associated with the account creation work..
   * @return message
   **/
  @Schema(description = "The message associated with the account creation work.")
  public String getMessage() {
    return message;
  }

  /**
   * The processing failures if the work is in PendingError/ProcessingError status..
   * @return createAccountProcessingFailureDetails
   **/
  @Schema(description = "The processing failures if the work is in PendingError/ProcessingError status.")
  public SubAccountErrorDetails getCreateAccountProcessingFailureDetails() {
    return createAccountProcessingFailureDetails;
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
    SubAccountCreateWorker subAccountCreateWorker = (SubAccountCreateWorker) o;
    return Objects.equals(this.targetAccount, subAccountCreateWorker.targetAccount) &&
        Objects.equals(this.subscriptionDetails, subAccountCreateWorker.subscriptionDetails) &&
        Objects.equals(this.assetGroupWorkId, subAccountCreateWorker.assetGroupWorkId) &&
        Objects.equals(this.assetGroupId, subAccountCreateWorker.assetGroupId) &&
        Objects.equals(this.assetGroupWorkType, subAccountCreateWorker.assetGroupWorkType) &&
        Objects.equals(this.status, subAccountCreateWorker.status) &&
        Objects.equals(this.orderId, subAccountCreateWorker.orderId) &&
        Objects.equals(this.attempts, subAccountCreateWorker.attempts) &&
        Objects.equals(this.createdDate, subAccountCreateWorker.createdDate) &&
        Objects.equals(this.createdByName, subAccountCreateWorker.createdByName) &&
        Objects.equals(this.createdByEmail, subAccountCreateWorker.createdByEmail) &&
        Objects.equals(this.message, subAccountCreateWorker.message) &&
        Objects.equals(this.createAccountProcessingFailureDetails, subAccountCreateWorker.createAccountProcessingFailureDetails);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(targetAccount, subscriptionDetails, assetGroupWorkId, assetGroupId, assetGroupWorkType, status, orderId, attempts, createdDate, createdByName, createdByEmail, message, createAccountProcessingFailureDetails);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubAccountCreateWorker {\n");
    
    sb.append("    targetAccount: ").append(toIndentedString(targetAccount)).append("\n");
    sb.append("    subscriptionDetails: ").append(toIndentedString(subscriptionDetails)).append("\n");
    sb.append("    assetGroupWorkId: ").append(toIndentedString(assetGroupWorkId)).append("\n");
    sb.append("    assetGroupId: ").append(toIndentedString(assetGroupId)).append("\n");
    sb.append("    assetGroupWorkType: ").append(toIndentedString(assetGroupWorkType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    attempts: ").append(toIndentedString(attempts)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdByName: ").append(toIndentedString(createdByName)).append("\n");
    sb.append("    createdByEmail: ").append(toIndentedString(createdByEmail)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    createAccountProcessingFailureDetails: ").append(toIndentedString(createAccountProcessingFailureDetails)).append("\n");
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

