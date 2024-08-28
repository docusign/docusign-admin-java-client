package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.AssetGroupAccountCloneSourceAccount;
import com.docusign.admin.model.AssetGroupAccountCloneTargetAccount;
import com.docusign.admin.model.SubAccountErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * AssetGroupAccountClone.
 *
 */

public class AssetGroupAccountClone implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("sourceAccount")
  private AssetGroupAccountCloneSourceAccount sourceAccount = null;

  @JsonProperty("targetAccount")
  private AssetGroupAccountCloneTargetAccount targetAccount = null;

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
   * The clone status.
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

  @JsonProperty("cloneRequestId")
  private java.util.UUID cloneRequestId = null;

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

  @JsonProperty("cloneProcessingFailureDetails")
  private SubAccountErrorDetails cloneProcessingFailureDetails = null;


  /**
   * sourceAccount.
   *
   * @return AssetGroupAccountClone
   **/
  public AssetGroupAccountClone sourceAccount(AssetGroupAccountCloneSourceAccount sourceAccount) {
    this.sourceAccount = sourceAccount;
    return this;
  }

  /**
   * The source account to be cloned from..
   * @return sourceAccount
   **/
  @Schema(required = true, description = "The source account to be cloned from.")
  public AssetGroupAccountCloneSourceAccount getSourceAccount() {
    return sourceAccount;
  }

  /**
   * setSourceAccount.
   **/
  public void setSourceAccount(AssetGroupAccountCloneSourceAccount sourceAccount) {
    this.sourceAccount = sourceAccount;
  }


  /**
   * targetAccount.
   *
   * @return AssetGroupAccountClone
   **/
  public AssetGroupAccountClone targetAccount(AssetGroupAccountCloneTargetAccount targetAccount) {
    this.targetAccount = targetAccount;
    return this;
  }

  /**
   * The target account to clone to..
   * @return targetAccount
   **/
  @Schema(required = true, description = "The target account to clone to.")
  public AssetGroupAccountCloneTargetAccount getTargetAccount() {
    return targetAccount;
  }

  /**
   * setTargetAccount.
   **/
  public void setTargetAccount(AssetGroupAccountCloneTargetAccount targetAccount) {
    this.targetAccount = targetAccount;
  }

  /**
   * The account clone work id..
   * @return assetGroupWorkId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "The account clone work id.")
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
   * The clone status..
   * @return status
   **/
  @Schema(description = "The clone status.")
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * The account entitlement/setting mirror request id created by the clone work..
   * @return cloneRequestId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "The account entitlement/setting mirror request id created by the clone work.")
  public java.util.UUID getCloneRequestId() {
    return cloneRequestId;
  }

  /**
   * The order id created by the clone work..
   * @return orderId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "The order id created by the clone work.")
  public java.util.UUID getOrderId() {
    return orderId;
  }

  /**
   * The number of times the work has been worked on..
   * @return attempts
   **/
  @Schema(description = "The number of times the work has been worked on.")
  public Integer getAttempts() {
    return attempts;
  }

  /**
   * The date the account clone work is created..
   * @return createdDate
   **/
  @Schema(description = "The date the account clone work is created.")
  public String getCreatedDate() {
    return createdDate;
  }

  /**
   * The name of the creator of the account clone work..
   * @return createdByName
   **/
  @Schema(description = "The name of the creator of the account clone work.")
  public String getCreatedByName() {
    return createdByName;
  }

  /**
   * The email of the creator of the account clone work..
   * @return createdByEmail
   **/
  @Schema(description = "The email of the creator of the account clone work.")
  public String getCreatedByEmail() {
    return createdByEmail;
  }

  /**
   * The message associated with the account clone work..
   * @return message
   **/
  @Schema(description = "The message associated with the account clone work.")
  public String getMessage() {
    return message;
  }

  /**
   * The processing failures if the work is in PendingError/ProcessingError status..
   * @return cloneProcessingFailureDetails
   **/
  @Schema(description = "The processing failures if the work is in PendingError/ProcessingError status.")
  public SubAccountErrorDetails getCloneProcessingFailureDetails() {
    return cloneProcessingFailureDetails;
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
    AssetGroupAccountClone assetGroupAccountClone = (AssetGroupAccountClone) o;
    return Objects.equals(this.sourceAccount, assetGroupAccountClone.sourceAccount) &&
        Objects.equals(this.targetAccount, assetGroupAccountClone.targetAccount) &&
        Objects.equals(this.assetGroupWorkId, assetGroupAccountClone.assetGroupWorkId) &&
        Objects.equals(this.assetGroupId, assetGroupAccountClone.assetGroupId) &&
        Objects.equals(this.assetGroupWorkType, assetGroupAccountClone.assetGroupWorkType) &&
        Objects.equals(this.status, assetGroupAccountClone.status) &&
        Objects.equals(this.cloneRequestId, assetGroupAccountClone.cloneRequestId) &&
        Objects.equals(this.orderId, assetGroupAccountClone.orderId) &&
        Objects.equals(this.attempts, assetGroupAccountClone.attempts) &&
        Objects.equals(this.createdDate, assetGroupAccountClone.createdDate) &&
        Objects.equals(this.createdByName, assetGroupAccountClone.createdByName) &&
        Objects.equals(this.createdByEmail, assetGroupAccountClone.createdByEmail) &&
        Objects.equals(this.message, assetGroupAccountClone.message) &&
        Objects.equals(this.cloneProcessingFailureDetails, assetGroupAccountClone.cloneProcessingFailureDetails);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(sourceAccount, targetAccount, assetGroupWorkId, assetGroupId, assetGroupWorkType, status, cloneRequestId, orderId, attempts, createdDate, createdByName, createdByEmail, message, cloneProcessingFailureDetails);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupAccountClone {\n");
    
    sb.append("    sourceAccount: ").append(toIndentedString(sourceAccount)).append("\n");
    sb.append("    targetAccount: ").append(toIndentedString(targetAccount)).append("\n");
    sb.append("    assetGroupWorkId: ").append(toIndentedString(assetGroupWorkId)).append("\n");
    sb.append("    assetGroupId: ").append(toIndentedString(assetGroupId)).append("\n");
    sb.append("    assetGroupWorkType: ").append(toIndentedString(assetGroupWorkType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    cloneRequestId: ").append(toIndentedString(cloneRequestId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    attempts: ").append(toIndentedString(attempts)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdByName: ").append(toIndentedString(createdByName)).append("\n");
    sb.append("    createdByEmail: ").append(toIndentedString(createdByEmail)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    cloneProcessingFailureDetails: ").append(toIndentedString(cloneProcessingFailureDetails)).append("\n");
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

