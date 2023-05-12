package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * LinkResponse.
 *
 */

public class LinkResponse {
  @JsonProperty("rel")
  private String rel = null;

  @JsonProperty("href")
  private String href = null;


  /**
   * rel.
   *
   * @return LinkResponse
   **/
  public LinkResponse rel(String rel) {
    this.rel = rel;
    return this;
  }

  /**
   * Get rel.
   * @return rel
   **/
  @Schema(description = "")
  public String getRel() {
    return rel;
  }

  /**
   * setRel.
   **/
  public void setRel(String rel) {
    this.rel = rel;
  }


  /**
   * href.
   *
   * @return LinkResponse
   **/
  public LinkResponse href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Get href.
   * @return href
   **/
  @Schema(description = "")
  public String getHref() {
    return href;
  }

  /**
   * setHref.
   **/
  public void setHref(String href) {
    this.href = href;
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
    LinkResponse linkResponse = (LinkResponse) o;
    return Objects.equals(this.rel, linkResponse.rel) &&
        Objects.equals(this.href, linkResponse.href);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(rel, href);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkResponse {\n");
    
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

