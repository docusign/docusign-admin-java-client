package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.DomainResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DomainsResponse
 */

public class DomainsResponse {
  @JsonProperty("reserved_domains")
  private java.util.List<DomainResponse> reservedDomains = null;

  public DomainsResponse reservedDomains(java.util.List<DomainResponse> reservedDomains) {
    this.reservedDomains = reservedDomains;
    return this;
  }

  public DomainsResponse addReservedDomainsItem(DomainResponse reservedDomainsItem) {
    if (this.reservedDomains == null) {
      this.reservedDomains = new java.util.ArrayList<DomainResponse>();
    }
    this.reservedDomains.add(reservedDomainsItem);
    return this;
  }

   /**
   * Get reservedDomains
   * @return reservedDomains
  **/
  @ApiModelProperty(value = "")
  public java.util.List<DomainResponse> getReservedDomains() {
    return reservedDomains;
  }

  public void setReservedDomains(java.util.List<DomainResponse> reservedDomains) {
    this.reservedDomains = reservedDomains;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainsResponse domainsResponse = (DomainsResponse) o;
    return Objects.equals(this.reservedDomains, domainsResponse.reservedDomains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservedDomains);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainsResponse {\n");
    
    sb.append("    reservedDomains: ").append(toIndentedString(reservedDomains)).append("\n");
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

