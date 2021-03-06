/*
 * Kruise
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.openkruise.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.openkruise.client.models.KruiseAppsV1alpha1RollingUpdateSidecarSet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SidecarSetUpdateStrategy indicates the strategy that the SidecarSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.
 */
@ApiModel(description = "SidecarSetUpdateStrategy indicates the strategy that the SidecarSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.")

public class KruiseAppsV1alpha1SidecarSetUpdateStrategy {
  @SerializedName("rollingUpdate")
  private KruiseAppsV1alpha1RollingUpdateSidecarSet rollingUpdate = null;

  public KruiseAppsV1alpha1SidecarSetUpdateStrategy rollingUpdate(KruiseAppsV1alpha1RollingUpdateSidecarSet rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
    return this;
  }

   /**
   * Get rollingUpdate
   * @return rollingUpdate
  **/
  @ApiModelProperty(value = "")
  public KruiseAppsV1alpha1RollingUpdateSidecarSet getRollingUpdate() {
    return rollingUpdate;
  }

  public void setRollingUpdate(KruiseAppsV1alpha1RollingUpdateSidecarSet rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1SidecarSetUpdateStrategy kruiseAppsV1alpha1SidecarSetUpdateStrategy = (KruiseAppsV1alpha1SidecarSetUpdateStrategy) o;
    return Objects.equals(this.rollingUpdate, kruiseAppsV1alpha1SidecarSetUpdateStrategy.rollingUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rollingUpdate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1SidecarSetUpdateStrategy {\n");
    
    sb.append("    rollingUpdate: ").append(toIndentedString(rollingUpdate)).append("\n");
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

