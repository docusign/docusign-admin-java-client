package com.docusign.admin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** OASIRROrganizationAccountSettingsErrorDataResponse. */
public class OASIRROrganizationAccountSettingsErrorDataResponse {
  @JsonProperty("account_id")
  private String accountId = null;

  @JsonProperty("account_name")
  private String accountName = null;

  @JsonProperty("error")
  private String error = null;

  @JsonProperty("error_key")
  private String errorKey = null;

  @JsonProperty("setting_key")
  private String settingKey = null;

  /**
   * accountId.
   *
   * @return OASIRROrganizationAccountSettingsErrorDataResponse
   */
  public OASIRROrganizationAccountSettingsErrorDataResponse accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId.
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public String getAccountId() {
    return accountId;
  }

  /** setAccountId. */
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * accountName.
   *
   * @return OASIRROrganizationAccountSettingsErrorDataResponse
   */
  public OASIRROrganizationAccountSettingsErrorDataResponse accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Get accountName.
   *
   * @return accountName
   */
  @ApiModelProperty(value = "")
  public String getAccountName() {
    return accountName;
  }

  /** setAccountName. */
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  /**
   * error.
   *
   * @return OASIRROrganizationAccountSettingsErrorDataResponse
   */
  public OASIRROrganizationAccountSettingsErrorDataResponse error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error.
   *
   * @return error
   */
  @ApiModelProperty(value = "")
  public String getError() {
    return error;
  }

  /** setError. */
  public void setError(String error) {
    this.error = error;
  }

  /**
   * errorKey.
   *
   * @return OASIRROrganizationAccountSettingsErrorDataResponse
   */
  public OASIRROrganizationAccountSettingsErrorDataResponse errorKey(String errorKey) {
    this.errorKey = errorKey;
    return this;
  }

  /**
   * Get errorKey.
   *
   * @return errorKey
   */
  @ApiModelProperty(value = "")
  public String getErrorKey() {
    return errorKey;
  }

  /** setErrorKey. */
  public void setErrorKey(String errorKey) {
    this.errorKey = errorKey;
  }

  /**
   * settingKey.
   *
   * @return OASIRROrganizationAccountSettingsErrorDataResponse
   */
  public OASIRROrganizationAccountSettingsErrorDataResponse settingKey(String settingKey) {
    this.settingKey = settingKey;
    return this;
  }

  /**
   * Get settingKey.
   *
   * @return settingKey
   */
  @ApiModelProperty(value = "")
  public String getSettingKey() {
    return settingKey;
  }

  /** setSettingKey. */
  public void setSettingKey(String settingKey) {
    this.settingKey = settingKey;
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
    OASIRROrganizationAccountSettingsErrorDataResponse
        oaSIRROrganizationAccountSettingsErrorDataResponse =
            (OASIRROrganizationAccountSettingsErrorDataResponse) o;
    return Objects.equals(
            this.accountId, oaSIRROrganizationAccountSettingsErrorDataResponse.accountId)
        && Objects.equals(
            this.accountName, oaSIRROrganizationAccountSettingsErrorDataResponse.accountName)
        && Objects.equals(this.error, oaSIRROrganizationAccountSettingsErrorDataResponse.error)
        && Objects.equals(
            this.errorKey, oaSIRROrganizationAccountSettingsErrorDataResponse.errorKey)
        && Objects.equals(
            this.settingKey, oaSIRROrganizationAccountSettingsErrorDataResponse.settingKey);
  }

  /** Returns the HashCode. */
  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, error, errorKey, settingKey);
  }

  /** Converts the given object to string. */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OASIRROrganizationAccountSettingsErrorDataResponse {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorKey: ").append(toIndentedString(errorKey)).append("\n");
    sb.append("    settingKey: ").append(toIndentedString(settingKey)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
