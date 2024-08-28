package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * AssetGroupAccountCloneSourceAccount.
 *
 */

public class AssetGroupAccountCloneSourceAccount implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private java.util.UUID id = null;

  @JsonProperty("externalAccountId")
  private Long externalAccountId = null;

  @JsonProperty("site")
  private String site = null;

  @JsonProperty("name")
  private String name = null;


  /**
   * id.
   *
   * @return AssetGroupAccountCloneSourceAccount
   **/
  public AssetGroupAccountCloneSourceAccount id(java.util.UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The source account id to clone from..
   * @return id
   **/
  @Schema(example = "00000000-0000-0000-0000-000000000000", required = true, description = "The source account id to clone from.")
  public java.util.UUID getId() {
    return id;
  }

  /**
   * setId.
   **/
  public void setId(java.util.UUID id) {
    this.id = id;
  }

  /**
   * The external account id of the source account..
   * @return externalAccountId
   **/
  @Schema(description = "The external account id of the source account.")
  public Long getExternalAccountId() {
    return externalAccountId;
  }

  /**
   * The site the source account is on..
   * @return site
   **/
  @Schema(description = "The site the source account is on.")
  public String getSite() {
    return site;
  }

  /**
   * The name of the source account..
   * @return name
   **/
  @Schema(description = "The name of the source account.")
  public String getName() {
    return name;
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
    AssetGroupAccountCloneSourceAccount assetGroupAccountCloneSourceAccount = (AssetGroupAccountCloneSourceAccount) o;
    return Objects.equals(this.id, assetGroupAccountCloneSourceAccount.id) &&
        Objects.equals(this.externalAccountId, assetGroupAccountCloneSourceAccount.externalAccountId) &&
        Objects.equals(this.site, assetGroupAccountCloneSourceAccount.site) &&
        Objects.equals(this.name, assetGroupAccountCloneSourceAccount.name);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(id, externalAccountId, site, name);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupAccountCloneSourceAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalAccountId: ").append(toIndentedString(externalAccountId)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

