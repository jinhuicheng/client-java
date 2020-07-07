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
import io.openkruise.client.models.KruiseAppsV1alpha1RollingUpdateStatefulSetStrategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.
 */
@ApiModel(description = "StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.")

public class KruiseAppsV1alpha1StatefulSetUpdateStrategy {
  @SerializedName("rollingUpdate")
  private KruiseAppsV1alpha1RollingUpdateStatefulSetStrategy rollingUpdate = null;

  @SerializedName("type")
  private String type = null;

  public KruiseAppsV1alpha1StatefulSetUpdateStrategy rollingUpdate(KruiseAppsV1alpha1RollingUpdateStatefulSetStrategy rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
    return this;
  }

   /**
   * RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
   * @return rollingUpdate
  **/
  @ApiModelProperty(value = "RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.")
  public KruiseAppsV1alpha1RollingUpdateStatefulSetStrategy getRollingUpdate() {
    return rollingUpdate;
  }

  public void setRollingUpdate(KruiseAppsV1alpha1RollingUpdateStatefulSetStrategy rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
  }

  public KruiseAppsV1alpha1StatefulSetUpdateStrategy type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
   * @return type
  **/
  @ApiModelProperty(value = "Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1StatefulSetUpdateStrategy kruiseAppsV1alpha1StatefulSetUpdateStrategy = (KruiseAppsV1alpha1StatefulSetUpdateStrategy) o;
    return Objects.equals(this.rollingUpdate, kruiseAppsV1alpha1StatefulSetUpdateStrategy.rollingUpdate) &&
        Objects.equals(this.type, kruiseAppsV1alpha1StatefulSetUpdateStrategy.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rollingUpdate, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1StatefulSetUpdateStrategy {\n");
    
    sb.append("    rollingUpdate: ").append(toIndentedString(rollingUpdate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

