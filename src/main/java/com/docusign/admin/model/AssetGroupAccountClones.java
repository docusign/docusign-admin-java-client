package com.docusign.admin.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.admin.model.AssetGroupAccountClone;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * AssetGroupAccountClones.
 *
 */

public class AssetGroupAccountClones implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("assetGroupWorks")
  private java.util.List<AssetGroupAccountClone> assetGroupWorks = null;

  /**
   * The list of asset group accounts..
   * @return assetGroupWorks
   **/
  @Schema(description = "The list of asset group accounts.")
  public java.util.List<AssetGroupAccountClone> getAssetGroupWorks() {
    return assetGroupWorks;
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
    AssetGroupAccountClones assetGroupAccountClones = (AssetGroupAccountClones) o;
    return Objects.equals(this.assetGroupWorks, assetGroupAccountClones.assetGroupWorks);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(assetGroupWorks);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupAccountClones {\n");
    
    sb.append("    assetGroupWorks: ").append(toIndentedString(assetGroupWorks)).append("\n");
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

