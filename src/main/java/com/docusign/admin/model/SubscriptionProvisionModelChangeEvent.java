package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * SubscriptionProvisionModelChangeEvent.
 *
 */

public class SubscriptionProvisionModelChangeEvent implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("EventDate")
  private String eventDate = null;

  @JsonProperty("Action")
  private String action = null;

  @JsonProperty("TraceToken")
  private java.util.UUID traceToken = null;


  /**
   * eventDate.
   *
   * @return SubscriptionProvisionModelChangeEvent
   **/
  public SubscriptionProvisionModelChangeEvent eventDate(String eventDate) {
    this.eventDate = eventDate;
    return this;
  }

  /**
   * Get eventDate.
   * @return eventDate
   **/
  @Schema(description = "")
  public String getEventDate() {
    return eventDate;
  }

  /**
   * setEventDate.
   **/
  public void setEventDate(String eventDate) {
    this.eventDate = eventDate;
  }


  /**
   * action.
   *
   * @return SubscriptionProvisionModelChangeEvent
   **/
  public SubscriptionProvisionModelChangeEvent action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action.
   * @return action
   **/
  @Schema(description = "")
  public String getAction() {
    return action;
  }

  /**
   * setAction.
   **/
  public void setAction(String action) {
    this.action = action;
  }


  /**
   * traceToken.
   *
   * @return SubscriptionProvisionModelChangeEvent
   **/
  public SubscriptionProvisionModelChangeEvent traceToken(java.util.UUID traceToken) {
    this.traceToken = traceToken;
    return this;
  }

  /**
   * Get traceToken.
   * @return traceToken
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", description = "")
  public java.util.UUID getTraceToken() {
    return traceToken;
  }

  /**
   * setTraceToken.
   **/
  public void setTraceToken(java.util.UUID traceToken) {
    this.traceToken = traceToken;
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
    SubscriptionProvisionModelChangeEvent subscriptionProvisionModelChangeEvent = (SubscriptionProvisionModelChangeEvent) o;
    return Objects.equals(this.eventDate, subscriptionProvisionModelChangeEvent.eventDate) &&
        Objects.equals(this.action, subscriptionProvisionModelChangeEvent.action) &&
        Objects.equals(this.traceToken, subscriptionProvisionModelChangeEvent.traceToken);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(eventDate, action, traceToken);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProvisionModelChangeEvent {\n");
    
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    traceToken: ").append(toIndentedString(traceToken)).append("\n");
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

