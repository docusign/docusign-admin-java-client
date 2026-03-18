package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * OrganizationConnectConfigResponse.
 *
 */

public class OrganizationConnectConfigResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("connectId")
  private String connectId = null;

  @JsonProperty("configurationType")
  private String configurationType = null;

  @JsonProperty("disabledBy")
  private String disabledBy = null;

  @JsonProperty("allowSalesforcePublish")
  private String allowSalesforcePublish = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("allowEnvelopePublish")
  private String allowEnvelopePublish = null;

  @JsonProperty("siteId")
  private Integer siteId = null;

  @JsonProperty("pausePublish")
  private String pausePublish = null;

  @JsonProperty("requiresAcknowledgement")
  private String requiresAcknowledgement = null;


  /**
   * connectId.
   *
   * @return OrganizationConnectConfigResponse
   **/
  public OrganizationConnectConfigResponse connectId(String connectId) {
    this.connectId = connectId;
    return this;
  }

  /**
   * Get connectId.
   * @return connectId
   **/
  @Schema(description = "")
  public String getConnectId() {
    return connectId;
  }

  /**
   * setConnectId.
   **/
  public void setConnectId(String connectId) {
    this.connectId = connectId;
  }


  /**
   * configurationType.
   *
   * @return OrganizationConnectConfigResponse
   **/
  public OrganizationConnectConfigResponse configurationType(String configurationType) {
    this.configurationType = configurationType;
    return this;
  }

  /**
   * Get configurationType.
   * @return configurationType
   **/
  @Schema(description = "")
  public String getConfigurationType() {
    return configurationType;
  }

  /**
   * setConfigurationType.
   **/
  public void setConfigurationType(String configurationType) {
    this.configurationType = configurationType;
  }


  /**
   * disabledBy.
   *
   * @return OrganizationConnectConfigResponse
   **/
  public OrganizationConnectConfigResponse disabledBy(String disabledBy) {
    this.disabledBy = disabledBy;
    return this;
  }

  /**
   * Get disabledBy.
   * @return disabledBy
   **/
  @Schema(description = "")
  public String getDisabledBy() {
    return disabledBy;
  }

  /**
   * setDisabledBy.
   **/
  public void setDisabledBy(String disabledBy) {
    this.disabledBy = disabledBy;
  }


  /**
   * allowSalesforcePublish.
   *
   * @return OrganizationConnectConfigResponse
   **/
  public OrganizationConnectConfigResponse allowSalesforcePublish(String allowSalesforcePublish) {
    this.allowSalesforcePublish = allowSalesforcePublish;
    return this;
  }

  /**
   * Get allowSalesforcePublish.
   * @return allowSalesforcePublish
   **/
  @Schema(description = "")
  public String getAllowSalesforcePublish() {
    return allowSalesforcePublish;
  }

  /**
   * setAllowSalesforcePublish.
   **/
  public void setAllowSalesforcePublish(String allowSalesforcePublish) {
    this.allowSalesforcePublish = allowSalesforcePublish;
  }


  /**
   * name.
   *
   * @return OrganizationConnectConfigResponse
   **/
  public OrganizationConnectConfigResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * accountId.
   *
   * @return OrganizationConnectConfigResponse
   **/
  public OrganizationConnectConfigResponse accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId.
   * @return accountId
   **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  /**
   * setAccountId.
   **/
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  /**
   * accountName.
   *
   * @return OrganizationConnectConfigResponse
   **/
  public OrganizationConnectConfigResponse accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Get accountName.
   * @return accountName
   **/
  @Schema(description = "")
  public String getAccountName() {
    return accountName;
  }

  /**
   * setAccountName.
   **/
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  /**
   * allowEnvelopePublish.
   *
   * @return OrganizationConnectConfigResponse
   **/
  public OrganizationConnectConfigResponse allowEnvelopePublish(String allowEnvelopePublish) {
    this.allowEnvelopePublish = allowEnvelopePublish;
    return this;
  }

  /**
   * Get allowEnvelopePublish.
   * @return allowEnvelopePublish
   **/
  @Schema(description = "")
  public String getAllowEnvelopePublish() {
    return allowEnvelopePublish;
  }

  /**
   * setAllowEnvelopePublish.
   **/
  public void setAllowEnvelopePublish(String allowEnvelopePublish) {
    this.allowEnvelopePublish = allowEnvelopePublish;
  }


  /**
   * siteId.
   *
   * @return OrganizationConnectConfigResponse
   **/
  public OrganizationConnectConfigResponse siteId(Integer siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * Get siteId.
   * @return siteId
   **/
  @Schema(description = "")
  public Integer getSiteId() {
    return siteId;
  }

  /**
   * setSiteId.
   **/
  public void setSiteId(Integer siteId) {
    this.siteId = siteId;
  }


  /**
   * pausePublish.
   *
   * @return OrganizationConnectConfigResponse
   **/
  public OrganizationConnectConfigResponse pausePublish(String pausePublish) {
    this.pausePublish = pausePublish;
    return this;
  }

  /**
   * Get pausePublish.
   * @return pausePublish
   **/
  @Schema(description = "")
  public String getPausePublish() {
    return pausePublish;
  }

  /**
   * setPausePublish.
   **/
  public void setPausePublish(String pausePublish) {
    this.pausePublish = pausePublish;
  }


  /**
   * requiresAcknowledgement.
   *
   * @return OrganizationConnectConfigResponse
   **/
  public OrganizationConnectConfigResponse requiresAcknowledgement(String requiresAcknowledgement) {
    this.requiresAcknowledgement = requiresAcknowledgement;
    return this;
  }

  /**
   * Get requiresAcknowledgement.
   * @return requiresAcknowledgement
   **/
  @Schema(description = "")
  public String getRequiresAcknowledgement() {
    return requiresAcknowledgement;
  }

  /**
   * setRequiresAcknowledgement.
   **/
  public void setRequiresAcknowledgement(String requiresAcknowledgement) {
    this.requiresAcknowledgement = requiresAcknowledgement;
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
    OrganizationConnectConfigResponse organizationConnectConfigResponse = (OrganizationConnectConfigResponse) o;
    return Objects.equals(this.connectId, organizationConnectConfigResponse.connectId) &&
        Objects.equals(this.configurationType, organizationConnectConfigResponse.configurationType) &&
        Objects.equals(this.disabledBy, organizationConnectConfigResponse.disabledBy) &&
        Objects.equals(this.allowSalesforcePublish, organizationConnectConfigResponse.allowSalesforcePublish) &&
        Objects.equals(this.name, organizationConnectConfigResponse.name) &&
        Objects.equals(this.accountId, organizationConnectConfigResponse.accountId) &&
        Objects.equals(this.accountName, organizationConnectConfigResponse.accountName) &&
        Objects.equals(this.allowEnvelopePublish, organizationConnectConfigResponse.allowEnvelopePublish) &&
        Objects.equals(this.siteId, organizationConnectConfigResponse.siteId) &&
        Objects.equals(this.pausePublish, organizationConnectConfigResponse.pausePublish) &&
        Objects.equals(this.requiresAcknowledgement, organizationConnectConfigResponse.requiresAcknowledgement);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(connectId, configurationType, disabledBy, allowSalesforcePublish, name, accountId, accountName, allowEnvelopePublish, siteId, pausePublish, requiresAcknowledgement);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationConnectConfigResponse {\n");
    
    sb.append("    connectId: ").append(toIndentedString(connectId)).append("\n");
    sb.append("    configurationType: ").append(toIndentedString(configurationType)).append("\n");
    sb.append("    disabledBy: ").append(toIndentedString(disabledBy)).append("\n");
    sb.append("    allowSalesforcePublish: ").append(toIndentedString(allowSalesforcePublish)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    allowEnvelopePublish: ").append(toIndentedString(allowEnvelopePublish)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    pausePublish: ").append(toIndentedString(pausePublish)).append("\n");
    sb.append("    requiresAcknowledgement: ").append(toIndentedString(requiresAcknowledgement)).append("\n");
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

