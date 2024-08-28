package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.SubscriptionProvisionModelAssetGroupWork;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * SubscriptionProvisionModelAssetGroupWorkResult.
 *
 */

public class SubscriptionProvisionModelAssetGroupWorkResult implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("AssetGroupWork")
  private SubscriptionProvisionModelAssetGroupWork assetGroupWork = null;

  @JsonProperty("Message")
  private String message = null;

  @JsonProperty("Success")
  private Boolean success = null;


  /**
   * assetGroupWork.
   *
   * @return SubscriptionProvisionModelAssetGroupWorkResult
   **/
  public SubscriptionProvisionModelAssetGroupWorkResult assetGroupWork(SubscriptionProvisionModelAssetGroupWork assetGroupWork) {
    this.assetGroupWork = assetGroupWork;
    return this;
  }

  /**
   * Get assetGroupWork.
   * @return assetGroupWork
   **/
  @Schema(description = "")
  public SubscriptionProvisionModelAssetGroupWork getAssetGroupWork() {
    return assetGroupWork;
  }

  /**
   * setAssetGroupWork.
   **/
  public void setAssetGroupWork(SubscriptionProvisionModelAssetGroupWork assetGroupWork) {
    this.assetGroupWork = assetGroupWork;
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
   * Get success.
   * @return success
   **/
  @Schema(description = "")
  public Boolean isSuccess() {
    return success;
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
    SubscriptionProvisionModelAssetGroupWorkResult subscriptionProvisionModelAssetGroupWorkResult = (SubscriptionProvisionModelAssetGroupWorkResult) o;
    return Objects.equals(this.assetGroupWork, subscriptionProvisionModelAssetGroupWorkResult.assetGroupWork) &&
        Objects.equals(this.message, subscriptionProvisionModelAssetGroupWorkResult.message) &&
        Objects.equals(this.success, subscriptionProvisionModelAssetGroupWorkResult.success);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(assetGroupWork, message, success);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProvisionModelAssetGroupWorkResult {\n");
    
    sb.append("    assetGroupWork: ").append(toIndentedString(assetGroupWork)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

