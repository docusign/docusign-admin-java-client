package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * OrganizationConnectHmacSecretsResponse.
 *
 */

public class OrganizationConnectHmacSecretsResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("secrets")
  private java.util.List<String> secrets = null;


  /**
   * secrets.
   *
   * @return OrganizationConnectHmacSecretsResponse
   **/
  public OrganizationConnectHmacSecretsResponse secrets(java.util.List<String> secrets) {
    this.secrets = secrets;
    return this;
  }
  
  /**
   * addSecretsItem.
   *
   * @return OrganizationConnectHmacSecretsResponse
   **/
  public OrganizationConnectHmacSecretsResponse addSecretsItem(String secretsItem) {
    if (this.secrets == null) {
      this.secrets = new java.util.ArrayList<>();
    }
    this.secrets.add(secretsItem);
    return this;
  }

  /**
   * Get secrets.
   * @return secrets
   **/
  @Schema(description = "")
  public java.util.List<String> getSecrets() {
    return secrets;
  }

  /**
   * setSecrets.
   **/
  public void setSecrets(java.util.List<String> secrets) {
    this.secrets = secrets;
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
    OrganizationConnectHmacSecretsResponse organizationConnectHmacSecretsResponse = (OrganizationConnectHmacSecretsResponse) o;
    return Objects.equals(this.secrets, organizationConnectHmacSecretsResponse.secrets);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(secrets);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationConnectHmacSecretsResponse {\n");
    
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
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

