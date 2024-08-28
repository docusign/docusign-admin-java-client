package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.SubscriptionProvisionModelAccountCreateCreateAccountDetails;
import com.docusign.admin.model.SubscriptionProvisionModelAccountCreateCreateSubAccountDetails;
import com.docusign.admin.model.SubscriptionProvisionModelChangeEvent;
import com.docusign.admin.model.SubscriptionProvisionModelServiceErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * SubscriptionProvisionModelAssetGroupWork.
 *
 */

public class SubscriptionProvisionModelAssetGroupWork implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("AssetGroupWorkId")
  private java.util.UUID assetGroupWorkId = null;

  @JsonProperty("AssetGroupId")
  private java.util.UUID assetGroupId = null;

  /**
   * Gets or Sets assetGroupWorkType
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

  @JsonProperty("AssetGroupWorkType")
  private AssetGroupWorkTypeEnum assetGroupWorkType = null;

  /**
   * Gets or Sets status
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

  @JsonProperty("Status")
  private StatusEnum status = null;

  @JsonProperty("OrderId")
  private java.util.UUID orderId = null;

  @JsonProperty("TargetAccountId")
  private java.util.UUID targetAccountId = null;

  @JsonProperty("SourceAccountId")
  private java.util.UUID sourceAccountId = null;

  @JsonProperty("SourceAccountExternalId")
  private Long sourceAccountExternalId = null;

  @JsonProperty("SourceAccountName")
  private String sourceAccountName = null;

  @JsonProperty("SourceAccountSite")
  private String sourceAccountSite = null;

  @JsonProperty("CloneRequestId")
  private java.util.UUID cloneRequestId = null;

  @JsonProperty("CloneAccountDetails")
  private SubscriptionProvisionModelAccountCreateCreateAccountDetails cloneAccountDetails = null;

  @JsonProperty("CreateSubAccountDetails")
  private SubscriptionProvisionModelAccountCreateCreateSubAccountDetails createSubAccountDetails = null;

  @JsonProperty("Attempts")
  private Integer attempts = null;

  @JsonProperty("RetryOn")
  private String retryOn = null;

  @JsonProperty("Message")
  private String message = null;

  @JsonProperty("CreatedByName")
  private String createdByName = null;

  @JsonProperty("CreatedByEmail")
  private String createdByEmail = null;

  @JsonProperty("ErrorDetails")
  private SubscriptionProvisionModelServiceErrorDetails errorDetails = null;

  @JsonProperty("OldAssetGroupSubscriptionId")
  private java.util.UUID oldAssetGroupSubscriptionId = null;

  @JsonProperty("NewAssetGroupSubscriptionId")
  private java.util.UUID newAssetGroupSubscriptionId = null;

  @JsonProperty("SourceSystem")
  private String sourceSystem = null;

  @JsonProperty("SourceId")
  private String sourceId = null;

  @JsonProperty("CreatedBy")
  private String createdBy = null;

  /**
   * Gets or Sets createdByType
   */
  public enum CreatedByTypeEnum {
    APPLICATION("Application"),
    
    USER("User"),
    
    GENERIC("Generic"),
    
    RESTAPIAUTH("RestAPIAuth"),
    
    RESOURCE("Resource"),
    
    RESTRICTED("Restricted");

    private String value;

    CreatedByTypeEnum(String value) {
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
    public static CreatedByTypeEnum fromValue(String value) {
      for (CreatedByTypeEnum b : CreatedByTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("CreatedByType")
  private CreatedByTypeEnum createdByType = null;

  @JsonProperty("CreatedDate")
  private String createdDate = null;

  @JsonProperty("UpdatedBy")
  private String updatedBy = null;

  /**
   * Gets or Sets updatedByType
   */
  public enum UpdatedByTypeEnum {
    APPLICATION("Application"),
    
    USER("User"),
    
    GENERIC("Generic"),
    
    RESTAPIAUTH("RestAPIAuth"),
    
    RESOURCE("Resource"),
    
    RESTRICTED("Restricted");

    private String value;

    UpdatedByTypeEnum(String value) {
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
    public static UpdatedByTypeEnum fromValue(String value) {
      for (UpdatedByTypeEnum b : UpdatedByTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("UpdatedByType")
  private UpdatedByTypeEnum updatedByType = null;

  @JsonProperty("UpdatedDate")
  private String updatedDate = null;

  @JsonProperty("UpdateHistory")
  private java.util.List<SubscriptionProvisionModelChangeEvent> updateHistory = null;


  /**
   * assetGroupWorkId.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork assetGroupWorkId(java.util.UUID assetGroupWorkId) {
    this.assetGroupWorkId = assetGroupWorkId;
    return this;
  }

  /**
   * Get assetGroupWorkId.
   * @return assetGroupWorkId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getAssetGroupWorkId() {
    return assetGroupWorkId;
  }

  /**
   * setAssetGroupWorkId.
   **/
  public void setAssetGroupWorkId(java.util.UUID assetGroupWorkId) {
    this.assetGroupWorkId = assetGroupWorkId;
  }


  /**
   * assetGroupId.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork assetGroupId(java.util.UUID assetGroupId) {
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
   * assetGroupWorkType.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork assetGroupWorkType(AssetGroupWorkTypeEnum assetGroupWorkType) {
    this.assetGroupWorkType = assetGroupWorkType;
    return this;
  }

  /**
   * Get assetGroupWorkType.
   * @return assetGroupWorkType
   **/
  @Schema(description = "")
  public AssetGroupWorkTypeEnum getAssetGroupWorkType() {
    return assetGroupWorkType;
  }

  /**
   * setAssetGroupWorkType.
   **/
  public void setAssetGroupWorkType(AssetGroupWorkTypeEnum assetGroupWorkType) {
    this.assetGroupWorkType = assetGroupWorkType;
  }


  /**
   * status.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status.
   * @return status
   **/
  @Schema(description = "")
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * orderId.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork orderId(java.util.UUID orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId.
   * @return orderId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getOrderId() {
    return orderId;
  }

  /**
   * setOrderId.
   **/
  public void setOrderId(java.util.UUID orderId) {
    this.orderId = orderId;
  }


  /**
   * targetAccountId.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork targetAccountId(java.util.UUID targetAccountId) {
    this.targetAccountId = targetAccountId;
    return this;
  }

  /**
   * Get targetAccountId.
   * @return targetAccountId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getTargetAccountId() {
    return targetAccountId;
  }

  /**
   * setTargetAccountId.
   **/
  public void setTargetAccountId(java.util.UUID targetAccountId) {
    this.targetAccountId = targetAccountId;
  }


  /**
   * sourceAccountId.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork sourceAccountId(java.util.UUID sourceAccountId) {
    this.sourceAccountId = sourceAccountId;
    return this;
  }

  /**
   * Get sourceAccountId.
   * @return sourceAccountId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getSourceAccountId() {
    return sourceAccountId;
  }

  /**
   * setSourceAccountId.
   **/
  public void setSourceAccountId(java.util.UUID sourceAccountId) {
    this.sourceAccountId = sourceAccountId;
  }


  /**
   * sourceAccountExternalId.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork sourceAccountExternalId(Long sourceAccountExternalId) {
    this.sourceAccountExternalId = sourceAccountExternalId;
    return this;
  }

  /**
   * Get sourceAccountExternalId.
   * @return sourceAccountExternalId
   **/
  @Schema(description = "")
  public Long getSourceAccountExternalId() {
    return sourceAccountExternalId;
  }

  /**
   * setSourceAccountExternalId.
   **/
  public void setSourceAccountExternalId(Long sourceAccountExternalId) {
    this.sourceAccountExternalId = sourceAccountExternalId;
  }


  /**
   * sourceAccountName.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork sourceAccountName(String sourceAccountName) {
    this.sourceAccountName = sourceAccountName;
    return this;
  }

  /**
   * Get sourceAccountName.
   * @return sourceAccountName
   **/
  @Schema(description = "")
  public String getSourceAccountName() {
    return sourceAccountName;
  }

  /**
   * setSourceAccountName.
   **/
  public void setSourceAccountName(String sourceAccountName) {
    this.sourceAccountName = sourceAccountName;
  }


  /**
   * sourceAccountSite.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork sourceAccountSite(String sourceAccountSite) {
    this.sourceAccountSite = sourceAccountSite;
    return this;
  }

  /**
   * Get sourceAccountSite.
   * @return sourceAccountSite
   **/
  @Schema(description = "")
  public String getSourceAccountSite() {
    return sourceAccountSite;
  }

  /**
   * setSourceAccountSite.
   **/
  public void setSourceAccountSite(String sourceAccountSite) {
    this.sourceAccountSite = sourceAccountSite;
  }


  /**
   * cloneRequestId.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork cloneRequestId(java.util.UUID cloneRequestId) {
    this.cloneRequestId = cloneRequestId;
    return this;
  }

  /**
   * Get cloneRequestId.
   * @return cloneRequestId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getCloneRequestId() {
    return cloneRequestId;
  }

  /**
   * setCloneRequestId.
   **/
  public void setCloneRequestId(java.util.UUID cloneRequestId) {
    this.cloneRequestId = cloneRequestId;
  }


  /**
   * cloneAccountDetails.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork cloneAccountDetails(SubscriptionProvisionModelAccountCreateCreateAccountDetails cloneAccountDetails) {
    this.cloneAccountDetails = cloneAccountDetails;
    return this;
  }

  /**
   * Get cloneAccountDetails.
   * @return cloneAccountDetails
   **/
  @Schema(description = "")
  public SubscriptionProvisionModelAccountCreateCreateAccountDetails getCloneAccountDetails() {
    return cloneAccountDetails;
  }

  /**
   * setCloneAccountDetails.
   **/
  public void setCloneAccountDetails(SubscriptionProvisionModelAccountCreateCreateAccountDetails cloneAccountDetails) {
    this.cloneAccountDetails = cloneAccountDetails;
  }


  /**
   * createSubAccountDetails.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork createSubAccountDetails(SubscriptionProvisionModelAccountCreateCreateSubAccountDetails createSubAccountDetails) {
    this.createSubAccountDetails = createSubAccountDetails;
    return this;
  }

  /**
   * Get createSubAccountDetails.
   * @return createSubAccountDetails
   **/
  @Schema(description = "")
  public SubscriptionProvisionModelAccountCreateCreateSubAccountDetails getCreateSubAccountDetails() {
    return createSubAccountDetails;
  }

  /**
   * setCreateSubAccountDetails.
   **/
  public void setCreateSubAccountDetails(SubscriptionProvisionModelAccountCreateCreateSubAccountDetails createSubAccountDetails) {
    this.createSubAccountDetails = createSubAccountDetails;
  }


  /**
   * attempts.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork attempts(Integer attempts) {
    this.attempts = attempts;
    return this;
  }

  /**
   * Get attempts.
   * @return attempts
   **/
  @Schema(description = "")
  public Integer getAttempts() {
    return attempts;
  }

  /**
   * setAttempts.
   **/
  public void setAttempts(Integer attempts) {
    this.attempts = attempts;
  }


  /**
   * retryOn.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork retryOn(String retryOn) {
    this.retryOn = retryOn;
    return this;
  }

  /**
   * Get retryOn.
   * @return retryOn
   **/
  @Schema(description = "")
  public String getRetryOn() {
    return retryOn;
  }

  /**
   * setRetryOn.
   **/
  public void setRetryOn(String retryOn) {
    this.retryOn = retryOn;
  }


  /**
   * message.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message.
   * @return message
   **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  /**
   * setMessage.
   **/
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * createdByName.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork createdByName(String createdByName) {
    this.createdByName = createdByName;
    return this;
  }

  /**
   * Get createdByName.
   * @return createdByName
   **/
  @Schema(description = "")
  public String getCreatedByName() {
    return createdByName;
  }

  /**
   * setCreatedByName.
   **/
  public void setCreatedByName(String createdByName) {
    this.createdByName = createdByName;
  }


  /**
   * createdByEmail.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork createdByEmail(String createdByEmail) {
    this.createdByEmail = createdByEmail;
    return this;
  }

  /**
   * Get createdByEmail.
   * @return createdByEmail
   **/
  @Schema(description = "")
  public String getCreatedByEmail() {
    return createdByEmail;
  }

  /**
   * setCreatedByEmail.
   **/
  public void setCreatedByEmail(String createdByEmail) {
    this.createdByEmail = createdByEmail;
  }


  /**
   * errorDetails.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork errorDetails(SubscriptionProvisionModelServiceErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails.
   * @return errorDetails
   **/
  @Schema(description = "")
  public SubscriptionProvisionModelServiceErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(SubscriptionProvisionModelServiceErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }


  /**
   * oldAssetGroupSubscriptionId.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork oldAssetGroupSubscriptionId(java.util.UUID oldAssetGroupSubscriptionId) {
    this.oldAssetGroupSubscriptionId = oldAssetGroupSubscriptionId;
    return this;
  }

  /**
   * Get oldAssetGroupSubscriptionId.
   * @return oldAssetGroupSubscriptionId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getOldAssetGroupSubscriptionId() {
    return oldAssetGroupSubscriptionId;
  }

  /**
   * setOldAssetGroupSubscriptionId.
   **/
  public void setOldAssetGroupSubscriptionId(java.util.UUID oldAssetGroupSubscriptionId) {
    this.oldAssetGroupSubscriptionId = oldAssetGroupSubscriptionId;
  }


  /**
   * newAssetGroupSubscriptionId.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork newAssetGroupSubscriptionId(java.util.UUID newAssetGroupSubscriptionId) {
    this.newAssetGroupSubscriptionId = newAssetGroupSubscriptionId;
    return this;
  }

  /**
   * Get newAssetGroupSubscriptionId.
   * @return newAssetGroupSubscriptionId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getNewAssetGroupSubscriptionId() {
    return newAssetGroupSubscriptionId;
  }

  /**
   * setNewAssetGroupSubscriptionId.
   **/
  public void setNewAssetGroupSubscriptionId(java.util.UUID newAssetGroupSubscriptionId) {
    this.newAssetGroupSubscriptionId = newAssetGroupSubscriptionId;
  }


  /**
   * sourceSystem.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork sourceSystem(String sourceSystem) {
    this.sourceSystem = sourceSystem;
    return this;
  }

  /**
   * Get sourceSystem.
   * @return sourceSystem
   **/
  @Schema(description = "")
  public String getSourceSystem() {
    return sourceSystem;
  }

  /**
   * setSourceSystem.
   **/
  public void setSourceSystem(String sourceSystem) {
    this.sourceSystem = sourceSystem;
  }


  /**
   * sourceId.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

  /**
   * Get sourceId.
   * @return sourceId
   **/
  @Schema(description = "")
  public String getSourceId() {
    return sourceId;
  }

  /**
   * setSourceId.
   **/
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  /**
   * createdBy.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy.
   * @return createdBy
   **/
  @Schema(description = "")
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * setCreatedBy.
   **/
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  /**
   * createdByType.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork createdByType(CreatedByTypeEnum createdByType) {
    this.createdByType = createdByType;
    return this;
  }

  /**
   * Get createdByType.
   * @return createdByType
   **/
  @Schema(description = "")
  public CreatedByTypeEnum getCreatedByType() {
    return createdByType;
  }

  /**
   * setCreatedByType.
   **/
  public void setCreatedByType(CreatedByTypeEnum createdByType) {
    this.createdByType = createdByType;
  }


  /**
   * createdDate.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate.
   * @return createdDate
   **/
  @Schema(description = "")
  public String getCreatedDate() {
    return createdDate;
  }

  /**
   * setCreatedDate.
   **/
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }


  /**
   * updatedBy.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * Get updatedBy.
   * @return updatedBy
   **/
  @Schema(description = "")
  public String getUpdatedBy() {
    return updatedBy;
  }

  /**
   * setUpdatedBy.
   **/
  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }


  /**
   * updatedByType.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork updatedByType(UpdatedByTypeEnum updatedByType) {
    this.updatedByType = updatedByType;
    return this;
  }

  /**
   * Get updatedByType.
   * @return updatedByType
   **/
  @Schema(description = "")
  public UpdatedByTypeEnum getUpdatedByType() {
    return updatedByType;
  }

  /**
   * setUpdatedByType.
   **/
  public void setUpdatedByType(UpdatedByTypeEnum updatedByType) {
    this.updatedByType = updatedByType;
  }


  /**
   * updatedDate.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork updatedDate(String updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

  /**
   * Get updatedDate.
   * @return updatedDate
   **/
  @Schema(description = "")
  public String getUpdatedDate() {
    return updatedDate;
  }

  /**
   * setUpdatedDate.
   **/
  public void setUpdatedDate(String updatedDate) {
    this.updatedDate = updatedDate;
  }


  /**
   * updateHistory.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork updateHistory(java.util.List<SubscriptionProvisionModelChangeEvent> updateHistory) {
    this.updateHistory = updateHistory;
    return this;
  }
  
  /**
   * addUpdateHistoryItem.
   *
   * @return SubscriptionProvisionModelAssetGroupWork
   **/
  public SubscriptionProvisionModelAssetGroupWork addUpdateHistoryItem(SubscriptionProvisionModelChangeEvent updateHistoryItem) {
    if (this.updateHistory == null) {
      this.updateHistory = new java.util.ArrayList<>();
    }
    this.updateHistory.add(updateHistoryItem);
    return this;
  }

  /**
   * Get updateHistory.
   * @return updateHistory
   **/
  @Schema(description = "")
  public java.util.List<SubscriptionProvisionModelChangeEvent> getUpdateHistory() {
    return updateHistory;
  }

  /**
   * setUpdateHistory.
   **/
  public void setUpdateHistory(java.util.List<SubscriptionProvisionModelChangeEvent> updateHistory) {
    this.updateHistory = updateHistory;
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
    SubscriptionProvisionModelAssetGroupWork subscriptionProvisionModelAssetGroupWork = (SubscriptionProvisionModelAssetGroupWork) o;
    return Objects.equals(this.assetGroupWorkId, subscriptionProvisionModelAssetGroupWork.assetGroupWorkId) &&
        Objects.equals(this.assetGroupId, subscriptionProvisionModelAssetGroupWork.assetGroupId) &&
        Objects.equals(this.assetGroupWorkType, subscriptionProvisionModelAssetGroupWork.assetGroupWorkType) &&
        Objects.equals(this.status, subscriptionProvisionModelAssetGroupWork.status) &&
        Objects.equals(this.orderId, subscriptionProvisionModelAssetGroupWork.orderId) &&
        Objects.equals(this.targetAccountId, subscriptionProvisionModelAssetGroupWork.targetAccountId) &&
        Objects.equals(this.sourceAccountId, subscriptionProvisionModelAssetGroupWork.sourceAccountId) &&
        Objects.equals(this.sourceAccountExternalId, subscriptionProvisionModelAssetGroupWork.sourceAccountExternalId) &&
        Objects.equals(this.sourceAccountName, subscriptionProvisionModelAssetGroupWork.sourceAccountName) &&
        Objects.equals(this.sourceAccountSite, subscriptionProvisionModelAssetGroupWork.sourceAccountSite) &&
        Objects.equals(this.cloneRequestId, subscriptionProvisionModelAssetGroupWork.cloneRequestId) &&
        Objects.equals(this.cloneAccountDetails, subscriptionProvisionModelAssetGroupWork.cloneAccountDetails) &&
        Objects.equals(this.createSubAccountDetails, subscriptionProvisionModelAssetGroupWork.createSubAccountDetails) &&
        Objects.equals(this.attempts, subscriptionProvisionModelAssetGroupWork.attempts) &&
        Objects.equals(this.retryOn, subscriptionProvisionModelAssetGroupWork.retryOn) &&
        Objects.equals(this.message, subscriptionProvisionModelAssetGroupWork.message) &&
        Objects.equals(this.createdByName, subscriptionProvisionModelAssetGroupWork.createdByName) &&
        Objects.equals(this.createdByEmail, subscriptionProvisionModelAssetGroupWork.createdByEmail) &&
        Objects.equals(this.errorDetails, subscriptionProvisionModelAssetGroupWork.errorDetails) &&
        Objects.equals(this.oldAssetGroupSubscriptionId, subscriptionProvisionModelAssetGroupWork.oldAssetGroupSubscriptionId) &&
        Objects.equals(this.newAssetGroupSubscriptionId, subscriptionProvisionModelAssetGroupWork.newAssetGroupSubscriptionId) &&
        Objects.equals(this.sourceSystem, subscriptionProvisionModelAssetGroupWork.sourceSystem) &&
        Objects.equals(this.sourceId, subscriptionProvisionModelAssetGroupWork.sourceId) &&
        Objects.equals(this.createdBy, subscriptionProvisionModelAssetGroupWork.createdBy) &&
        Objects.equals(this.createdByType, subscriptionProvisionModelAssetGroupWork.createdByType) &&
        Objects.equals(this.createdDate, subscriptionProvisionModelAssetGroupWork.createdDate) &&
        Objects.equals(this.updatedBy, subscriptionProvisionModelAssetGroupWork.updatedBy) &&
        Objects.equals(this.updatedByType, subscriptionProvisionModelAssetGroupWork.updatedByType) &&
        Objects.equals(this.updatedDate, subscriptionProvisionModelAssetGroupWork.updatedDate) &&
        Objects.equals(this.updateHistory, subscriptionProvisionModelAssetGroupWork.updateHistory);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(assetGroupWorkId, assetGroupId, assetGroupWorkType, status, orderId, targetAccountId, sourceAccountId, sourceAccountExternalId, sourceAccountName, sourceAccountSite, cloneRequestId, cloneAccountDetails, createSubAccountDetails, attempts, retryOn, message, createdByName, createdByEmail, errorDetails, oldAssetGroupSubscriptionId, newAssetGroupSubscriptionId, sourceSystem, sourceId, createdBy, createdByType, createdDate, updatedBy, updatedByType, updatedDate, updateHistory);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProvisionModelAssetGroupWork {\n");
    
    sb.append("    assetGroupWorkId: ").append(toIndentedString(assetGroupWorkId)).append("\n");
    sb.append("    assetGroupId: ").append(toIndentedString(assetGroupId)).append("\n");
    sb.append("    assetGroupWorkType: ").append(toIndentedString(assetGroupWorkType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    targetAccountId: ").append(toIndentedString(targetAccountId)).append("\n");
    sb.append("    sourceAccountId: ").append(toIndentedString(sourceAccountId)).append("\n");
    sb.append("    sourceAccountExternalId: ").append(toIndentedString(sourceAccountExternalId)).append("\n");
    sb.append("    sourceAccountName: ").append(toIndentedString(sourceAccountName)).append("\n");
    sb.append("    sourceAccountSite: ").append(toIndentedString(sourceAccountSite)).append("\n");
    sb.append("    cloneRequestId: ").append(toIndentedString(cloneRequestId)).append("\n");
    sb.append("    cloneAccountDetails: ").append(toIndentedString(cloneAccountDetails)).append("\n");
    sb.append("    createSubAccountDetails: ").append(toIndentedString(createSubAccountDetails)).append("\n");
    sb.append("    attempts: ").append(toIndentedString(attempts)).append("\n");
    sb.append("    retryOn: ").append(toIndentedString(retryOn)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    createdByName: ").append(toIndentedString(createdByName)).append("\n");
    sb.append("    createdByEmail: ").append(toIndentedString(createdByEmail)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    oldAssetGroupSubscriptionId: ").append(toIndentedString(oldAssetGroupSubscriptionId)).append("\n");
    sb.append("    newAssetGroupSubscriptionId: ").append(toIndentedString(newAssetGroupSubscriptionId)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdByType: ").append(toIndentedString(createdByType)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedByType: ").append(toIndentedString(updatedByType)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    updateHistory: ").append(toIndentedString(updateHistory)).append("\n");
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

