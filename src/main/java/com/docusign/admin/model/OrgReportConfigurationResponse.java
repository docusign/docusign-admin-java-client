package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OrgReportConfigurationResponse.
 *
 */

public class OrgReportConfigurationResponse {
  @JsonProperty("is_account_limit_disabled")
  private Boolean isAccountLimitDisabled = null;

  @JsonProperty("custom_dates_enabled")
  private Boolean customDatesEnabled = null;

  @JsonProperty("enabled_report_types")
  private java.util.List<Integer> enabledReportTypes = null;


  /**
   * isAccountLimitDisabled.
   *
   * @return OrgReportConfigurationResponse
   **/
  public OrgReportConfigurationResponse isAccountLimitDisabled(Boolean isAccountLimitDisabled) {
    this.isAccountLimitDisabled = isAccountLimitDisabled;
    return this;
  }

  /**
   * Get isAccountLimitDisabled.
   * @return isAccountLimitDisabled
   **/
  @ApiModelProperty(value = "")
  public Boolean isIsAccountLimitDisabled() {
    return isAccountLimitDisabled;
  }

  /**
   * setIsAccountLimitDisabled.
   **/
  public void setIsAccountLimitDisabled(Boolean isAccountLimitDisabled) {
    this.isAccountLimitDisabled = isAccountLimitDisabled;
  }


  /**
   * customDatesEnabled.
   *
   * @return OrgReportConfigurationResponse
   **/
  public OrgReportConfigurationResponse customDatesEnabled(Boolean customDatesEnabled) {
    this.customDatesEnabled = customDatesEnabled;
    return this;
  }

  /**
   * Get customDatesEnabled.
   * @return customDatesEnabled
   **/
  @ApiModelProperty(value = "")
  public Boolean isCustomDatesEnabled() {
    return customDatesEnabled;
  }

  /**
   * setCustomDatesEnabled.
   **/
  public void setCustomDatesEnabled(Boolean customDatesEnabled) {
    this.customDatesEnabled = customDatesEnabled;
  }


  /**
   * enabledReportTypes.
   *
   * @return OrgReportConfigurationResponse
   **/
  public OrgReportConfigurationResponse enabledReportTypes(java.util.List<Integer> enabledReportTypes) {
    this.enabledReportTypes = enabledReportTypes;
    return this;
  }
  
  /**
   * addEnabledReportTypesItem.
   *
   * @return OrgReportConfigurationResponse
   **/
  public OrgReportConfigurationResponse addEnabledReportTypesItem(Integer enabledReportTypesItem) {
    if (this.enabledReportTypes == null) {
      this.enabledReportTypes = new java.util.ArrayList<>();
    }
    this.enabledReportTypes.add(enabledReportTypesItem);
    return this;
  }

  /**
   * Get enabledReportTypes.
   * @return enabledReportTypes
   **/
  @ApiModelProperty(value = "")
  public java.util.List<Integer> getEnabledReportTypes() {
    return enabledReportTypes;
  }

  /**
   * setEnabledReportTypes.
   **/
  public void setEnabledReportTypes(java.util.List<Integer> enabledReportTypes) {
    this.enabledReportTypes = enabledReportTypes;
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
    OrgReportConfigurationResponse orgReportConfigurationResponse = (OrgReportConfigurationResponse) o;
    return Objects.equals(this.isAccountLimitDisabled, orgReportConfigurationResponse.isAccountLimitDisabled) &&
        Objects.equals(this.customDatesEnabled, orgReportConfigurationResponse.customDatesEnabled) &&
        Objects.equals(this.enabledReportTypes, orgReportConfigurationResponse.enabledReportTypes);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(isAccountLimitDisabled, customDatesEnabled, enabledReportTypes);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgReportConfigurationResponse {\n");
    
    sb.append("    isAccountLimitDisabled: ").append(toIndentedString(isAccountLimitDisabled)).append("\n");
    sb.append("    customDatesEnabled: ").append(toIndentedString(customDatesEnabled)).append("\n");
    sb.append("    enabledReportTypes: ").append(toIndentedString(enabledReportTypes)).append("\n");
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

