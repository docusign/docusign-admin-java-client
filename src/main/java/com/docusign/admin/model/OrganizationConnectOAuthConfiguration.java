package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * OrganizationConnectOAuthConfiguration.
 *
 */

public class OrganizationConnectOAuthConfiguration implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("authorizationServerUrl")
  private String authorizationServerUrl = null;

  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("clientSecret")
  private String clientSecret = null;

  @JsonProperty("scope")
  private String scope = null;

  @JsonProperty("customParameter")
  private java.util.Map<String, String> customParameter = null;


  /**
   * authorizationServerUrl.
   *
   * @return OrganizationConnectOAuthConfiguration
   **/
  public OrganizationConnectOAuthConfiguration authorizationServerUrl(String authorizationServerUrl) {
    this.authorizationServerUrl = authorizationServerUrl;
    return this;
  }

  /**
   * Get authorizationServerUrl.
   * @return authorizationServerUrl
   **/
  @Schema(description = "")
  public String getAuthorizationServerUrl() {
    return authorizationServerUrl;
  }

  /**
   * setAuthorizationServerUrl.
   **/
  public void setAuthorizationServerUrl(String authorizationServerUrl) {
    this.authorizationServerUrl = authorizationServerUrl;
  }


  /**
   * clientId.
   *
   * @return OrganizationConnectOAuthConfiguration
   **/
  public OrganizationConnectOAuthConfiguration clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Get clientId.
   * @return clientId
   **/
  @Schema(description = "")
  public String getClientId() {
    return clientId;
  }

  /**
   * setClientId.
   **/
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  /**
   * clientSecret.
   *
   * @return OrganizationConnectOAuthConfiguration
   **/
  public OrganizationConnectOAuthConfiguration clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Get clientSecret.
   * @return clientSecret
   **/
  @Schema(description = "")
  public String getClientSecret() {
    return clientSecret;
  }

  /**
   * setClientSecret.
   **/
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  /**
   * scope.
   *
   * @return OrganizationConnectOAuthConfiguration
   **/
  public OrganizationConnectOAuthConfiguration scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope.
   * @return scope
   **/
  @Schema(description = "")
  public String getScope() {
    return scope;
  }

  /**
   * setScope.
   **/
  public void setScope(String scope) {
    this.scope = scope;
  }


  /**
   * customParameter.
   *
   * @return OrganizationConnectOAuthConfiguration
   **/
  public OrganizationConnectOAuthConfiguration customParameter(java.util.Map<String, String> customParameter) {
    this.customParameter = customParameter;
    return this;
  }

  /**
   * putCustomParameterItem.
   *
   * @return OrganizationConnectOAuthConfiguration
   **/
  public OrganizationConnectOAuthConfiguration putCustomParameterItem(String key, String customParameterItem) {
    if (this.customParameter == null) {
      this.customParameter = new java.util.HashMap<>();
    }
    this.customParameter.put(key, customParameterItem);
    return this;
  }

  /**
   * Get customParameter.
   * @return customParameter
   **/
  @Schema(description = "")
  public java.util.Map<String, String> getCustomParameter() {
    return customParameter;
  }

  /**
   * setCustomParameter.
   **/
  public void setCustomParameter(java.util.Map<String, String> customParameter) {
    this.customParameter = customParameter;
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
    OrganizationConnectOAuthConfiguration organizationConnectOAuthConfiguration = (OrganizationConnectOAuthConfiguration) o;
    return Objects.equals(this.authorizationServerUrl, organizationConnectOAuthConfiguration.authorizationServerUrl) &&
        Objects.equals(this.clientId, organizationConnectOAuthConfiguration.clientId) &&
        Objects.equals(this.clientSecret, organizationConnectOAuthConfiguration.clientSecret) &&
        Objects.equals(this.scope, organizationConnectOAuthConfiguration.scope) &&
        Objects.equals(this.customParameter, organizationConnectOAuthConfiguration.customParameter);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(authorizationServerUrl, clientId, clientSecret, scope, customParameter);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationConnectOAuthConfiguration {\n");
    
    sb.append("    authorizationServerUrl: ").append(toIndentedString(authorizationServerUrl)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    customParameter: ").append(toIndentedString(customParameter)).append("\n");
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

