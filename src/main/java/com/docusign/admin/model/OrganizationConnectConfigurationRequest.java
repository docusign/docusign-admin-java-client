package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.ConnectEventData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * OrganizationConnectConfigurationRequest.
 *
 */

public class OrganizationConnectConfigurationRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("connectId")
  private java.util.UUID connectId = null;

  @JsonProperty("configurationType")
  private String configurationType = null;

  @JsonProperty("allowEnvelopePublish")
  private String allowEnvelopePublish = null;

  @JsonProperty("urlToPublishTo")
  private String urlToPublishTo = null;

  @JsonProperty("deliveryMode")
  private String deliveryMode = null;

  @JsonProperty("events")
  private java.util.List<String> events = null;

  @JsonProperty("associatedFilterSelection")
  private String associatedFilterSelection = null;

  @JsonProperty("groupIds")
  private java.util.List<String> groupIds = null;

  @JsonProperty("accountIds")
  private java.util.List<String> accountIds = null;

  @JsonProperty("userIds")
  private java.util.List<String> userIds = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("signMessageWithX509Certificate")
  private String signMessageWithX509Certificate = null;

  @JsonProperty("includeOAuth")
  private String includeOAuth = null;

  @JsonProperty("includeHMAC")
  private String includeHMAC = null;

  @JsonProperty("pausePublish")
  private String pausePublish = null;

  @JsonProperty("eventData")
  private ConnectEventData eventData = null;


  /**
   * connectId.
   *
   * @return OrganizationConnectConfigurationRequest
   **/
  public OrganizationConnectConfigurationRequest connectId(java.util.UUID connectId) {
    this.connectId = connectId;
    return this;
  }

  /**
   * Get connectId.
   * @return connectId
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getConnectId() {
    return connectId;
  }

  /**
   * setConnectId.
   **/
  public void setConnectId(java.util.UUID connectId) {
    this.connectId = connectId;
  }


  /**
   * configurationType.
   *
   * @return OrganizationConnectConfigurationRequest
   **/
  public OrganizationConnectConfigurationRequest configurationType(String configurationType) {
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
   * allowEnvelopePublish.
   *
   * @return OrganizationConnectConfigurationRequest
   **/
  public OrganizationConnectConfigurationRequest allowEnvelopePublish(String allowEnvelopePublish) {
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
   * urlToPublishTo.
   *
   * @return OrganizationConnectConfigurationRequest
   **/
  public OrganizationConnectConfigurationRequest urlToPublishTo(String urlToPublishTo) {
    this.urlToPublishTo = urlToPublishTo;
    return this;
  }

  /**
   * Get urlToPublishTo.
   * @return urlToPublishTo
   **/
  @Schema(description = "")
  public String getUrlToPublishTo() {
    return urlToPublishTo;
  }

  /**
   * setUrlToPublishTo.
   **/
  public void setUrlToPublishTo(String urlToPublishTo) {
    this.urlToPublishTo = urlToPublishTo;
  }


  /**
   * deliveryMode.
   *
   * @return OrganizationConnectConfigurationRequest
   **/
  public OrganizationConnectConfigurationRequest deliveryMode(String deliveryMode) {
    this.deliveryMode = deliveryMode;
    return this;
  }

  /**
   * Get deliveryMode.
   * @return deliveryMode
   **/
  @Schema(description = "")
  public String getDeliveryMode() {
    return deliveryMode;
  }

  /**
   * setDeliveryMode.
   **/
  public void setDeliveryMode(String deliveryMode) {
    this.deliveryMode = deliveryMode;
  }


  /**
   * events.
   *
   * @return OrganizationConnectConfigurationRequest
   **/
  public OrganizationConnectConfigurationRequest events(java.util.List<String> events) {
    this.events = events;
    return this;
  }
  
  /**
   * addEventsItem.
   *
   * @return OrganizationConnectConfigurationRequest
   **/
  public OrganizationConnectConfigurationRequest addEventsItem(String eventsItem) {
    if (this.events == null) {
      this.events = new java.util.ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

  /**
   * Get events.
   * @return events
   **/
  @Schema(description = "")
  public java.util.List<String> getEvents() {
    return events;
  }

  /**
   * setEvents.
   **/
  public void setEvents(java.util.List<String> events) {
    this.events = events;
  }


  /**
   * associatedFilterSelection.
   *
   * @return OrganizationConnectConfigurationRequest
   **/
  public OrganizationConnectConfigurationRequest associatedFilterSelection(String associatedFilterSelection) {
    this.associatedFilterSelection = associatedFilterSelection;
    return this;
  }

  /**
   * Get associatedFilterSelection.
   * @return associatedFilterSelection
   **/
  @Schema(description = "")
  public String getAssociatedFilterSelection() {
    return associatedFilterSelection;
  }

  /**
   * setAssociatedFilterSelection.
   **/
  public void setAssociatedFilterSelection(String associatedFilterSelection) {
    this.associatedFilterSelection = associatedFilterSelection;
  }


  /**
   * groupIds.
   *
   * @return OrganizationConnectConfigurationRequest
   **/
  public OrganizationConnectConfigurationRequest groupIds(java.util.List<String> groupIds) {
    this.groupIds = groupIds;
    return this;
  }
  
  /**
   * addGroupIdsItem.
   *
   * @return OrganizationConnectConfigurationRequest
   **/
  public OrganizationConnectConfigurationRequest addGroupIdsItem(String groupIdsItem) {
    if (this.groupIds == null) {
      this.groupIds = new java.util.ArrayList<>();
    }
    this.groupIds.add(groupIdsItem);
    return this;
  }

  /**
   * Get groupIds.
   * @return groupIds
   **/
  @Schema(description = "")
  public java.util.List<String> getGroupIds() {
    return groupIds;
  }

  /**
   * setGroupIds.
   **/
  public void setGroupIds(java.util.List<String> groupIds) {
    this.groupIds = groupIds;
  }


  /**
   * accountIds.
   *
   * @return OrganizationConnectConfigurationRequest
   **/
  public OrganizationConnectConfigurationRequest accountIds(java.util.List<String> accountIds) {
    this.accountIds = accountIds;
    return this;
  }
  
  /**
   * addAccountIdsItem.
   *
   * @return OrganizationConnectConfigurationRequest
   **/
  public OrganizationConnectConfigurationRequest addAccountIdsItem(String accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new java.util.ArrayList<>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

  /**
   * Get accountIds.
   * @return accountIds
   **/
  @Schema(description = "")
  public java.util.List<String> getAccountIds() {
    return accountIds;
  }

  /**
   * setAccountIds.
   **/
  public void setAccountIds(java.util.List<String> accountIds) {
    this.accountIds = accountIds;
  }


  /**
   * userIds.
   *
   * @return OrganizationConnectConfigurationRequest
   **/
  public OrganizationConnectConfigurationRequest userIds(java.util.List<String> userIds) {
    this.userIds = userIds;
    return this;
  }
  
  /**
   * addUserIdsItem.
   *
   * @return OrganizationConnectConfigurationRequest
   **/
  public OrganizationConnectConfigurationRequest addUserIdsItem(String userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new java.util.ArrayList<>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

  /**
   * Get userIds.
   * @return userIds
   **/
  @Schema(description = "")
  public java.util.List<String> getUserIds() {
    return userIds;
  }

  /**
   * setUserIds.
   **/
  public void setUserIds(java.util.List<String> userIds) {
    this.userIds = userIds;
  }


  /**
   * name.
   *
   * @return OrganizationConnectConfigurationRequest
   **/
  public OrganizationConnectConfigurationRequest name(String name) {
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
   * signMessageWithX509Certificate.
   *
   * @return OrganizationConnectConfigurationRequest
   **/
  public OrganizationConnectConfigurationRequest signMessageWithX509Certificate(String signMessageWithX509Certificate) {
    this.signMessageWithX509Certificate = signMessageWithX509Certificate;
    return this;
  }

  /**
   * Get signMessageWithX509Certificate.
   * @return signMessageWithX509Certificate
   **/
  @Schema(description = "")
  public String getSignMessageWithX509Certificate() {
    return signMessageWithX509Certificate;
  }

  /**
   * setSignMessageWithX509Certificate.
   **/
  public void setSignMessageWithX509Certificate(String signMessageWithX509Certificate) {
    this.signMessageWithX509Certificate = signMessageWithX509Certificate;
  }


  /**
   * includeOAuth.
   *
   * @return OrganizationConnectConfigurationRequest
   **/
  public OrganizationConnectConfigurationRequest includeOAuth(String includeOAuth) {
    this.includeOAuth = includeOAuth;
    return this;
  }

  /**
   * Get includeOAuth.
   * @return includeOAuth
   **/
  @Schema(description = "")
  public String getIncludeOAuth() {
    return includeOAuth;
  }

  /**
   * setIncludeOAuth.
   **/
  public void setIncludeOAuth(String includeOAuth) {
    this.includeOAuth = includeOAuth;
  }


  /**
   * includeHMAC.
   *
   * @return OrganizationConnectConfigurationRequest
   **/
  public OrganizationConnectConfigurationRequest includeHMAC(String includeHMAC) {
    this.includeHMAC = includeHMAC;
    return this;
  }

  /**
   * Get includeHMAC.
   * @return includeHMAC
   **/
  @Schema(description = "")
  public String getIncludeHMAC() {
    return includeHMAC;
  }

  /**
   * setIncludeHMAC.
   **/
  public void setIncludeHMAC(String includeHMAC) {
    this.includeHMAC = includeHMAC;
  }


  /**
   * pausePublish.
   *
   * @return OrganizationConnectConfigurationRequest
   **/
  public OrganizationConnectConfigurationRequest pausePublish(String pausePublish) {
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
   * eventData.
   *
   * @return OrganizationConnectConfigurationRequest
   **/
  public OrganizationConnectConfigurationRequest eventData(ConnectEventData eventData) {
    this.eventData = eventData;
    return this;
  }

  /**
   * Get eventData.
   * @return eventData
   **/
  @Schema(description = "")
  public ConnectEventData getEventData() {
    return eventData;
  }

  /**
   * setEventData.
   **/
  public void setEventData(ConnectEventData eventData) {
    this.eventData = eventData;
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
    OrganizationConnectConfigurationRequest organizationConnectConfigurationRequest = (OrganizationConnectConfigurationRequest) o;
    return Objects.equals(this.connectId, organizationConnectConfigurationRequest.connectId) &&
        Objects.equals(this.configurationType, organizationConnectConfigurationRequest.configurationType) &&
        Objects.equals(this.allowEnvelopePublish, organizationConnectConfigurationRequest.allowEnvelopePublish) &&
        Objects.equals(this.urlToPublishTo, organizationConnectConfigurationRequest.urlToPublishTo) &&
        Objects.equals(this.deliveryMode, organizationConnectConfigurationRequest.deliveryMode) &&
        Objects.equals(this.events, organizationConnectConfigurationRequest.events) &&
        Objects.equals(this.associatedFilterSelection, organizationConnectConfigurationRequest.associatedFilterSelection) &&
        Objects.equals(this.groupIds, organizationConnectConfigurationRequest.groupIds) &&
        Objects.equals(this.accountIds, organizationConnectConfigurationRequest.accountIds) &&
        Objects.equals(this.userIds, organizationConnectConfigurationRequest.userIds) &&
        Objects.equals(this.name, organizationConnectConfigurationRequest.name) &&
        Objects.equals(this.signMessageWithX509Certificate, organizationConnectConfigurationRequest.signMessageWithX509Certificate) &&
        Objects.equals(this.includeOAuth, organizationConnectConfigurationRequest.includeOAuth) &&
        Objects.equals(this.includeHMAC, organizationConnectConfigurationRequest.includeHMAC) &&
        Objects.equals(this.pausePublish, organizationConnectConfigurationRequest.pausePublish) &&
        Objects.equals(this.eventData, organizationConnectConfigurationRequest.eventData);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(connectId, configurationType, allowEnvelopePublish, urlToPublishTo, deliveryMode, events, associatedFilterSelection, groupIds, accountIds, userIds, name, signMessageWithX509Certificate, includeOAuth, includeHMAC, pausePublish, eventData);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationConnectConfigurationRequest {\n");
    
    sb.append("    connectId: ").append(toIndentedString(connectId)).append("\n");
    sb.append("    configurationType: ").append(toIndentedString(configurationType)).append("\n");
    sb.append("    allowEnvelopePublish: ").append(toIndentedString(allowEnvelopePublish)).append("\n");
    sb.append("    urlToPublishTo: ").append(toIndentedString(urlToPublishTo)).append("\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    associatedFilterSelection: ").append(toIndentedString(associatedFilterSelection)).append("\n");
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    signMessageWithX509Certificate: ").append(toIndentedString(signMessageWithX509Certificate)).append("\n");
    sb.append("    includeOAuth: ").append(toIndentedString(includeOAuth)).append("\n");
    sb.append("    includeHMAC: ").append(toIndentedString(includeHMAC)).append("\n");
    sb.append("    pausePublish: ").append(toIndentedString(pausePublish)).append("\n");
    sb.append("    eventData: ").append(toIndentedString(eventData)).append("\n");
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

