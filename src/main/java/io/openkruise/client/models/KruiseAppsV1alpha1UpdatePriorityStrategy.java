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
import io.openkruise.client.models.KruiseAppsV1alpha1UpdatePriorityOrderTerm;
import io.openkruise.client.models.KruiseAppsV1alpha1UpdatePriorityWeightTerm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UpdatePriorityStrategy is the strategy to define priority for pods update. Only one of orderPriority and weightPriority can be set.
 */
@ApiModel(description = "UpdatePriorityStrategy is the strategy to define priority for pods update. Only one of orderPriority and weightPriority can be set.")

public class KruiseAppsV1alpha1UpdatePriorityStrategy {
  @SerializedName("orderPriority")
  private List<KruiseAppsV1alpha1UpdatePriorityOrderTerm> orderPriority = null;

  @SerializedName("weightPriority")
  private List<KruiseAppsV1alpha1UpdatePriorityWeightTerm> weightPriority = null;

  public KruiseAppsV1alpha1UpdatePriorityStrategy orderPriority(List<KruiseAppsV1alpha1UpdatePriorityOrderTerm> orderPriority) {
    this.orderPriority = orderPriority;
    return this;
  }

  public KruiseAppsV1alpha1UpdatePriorityStrategy addOrderPriorityItem(KruiseAppsV1alpha1UpdatePriorityOrderTerm orderPriorityItem) {
    if (this.orderPriority == null) {
      this.orderPriority = new ArrayList<KruiseAppsV1alpha1UpdatePriorityOrderTerm>();
    }
    this.orderPriority.add(orderPriorityItem);
    return this;
  }

   /**
   * Order priority terms, pods will be sorted by the value of orderedKey. For example: &#x60;&#x60;&#x60; orderPriority: - orderedKey: key1 - orderedKey: key2 &#x60;&#x60;&#x60; First, all pods which have key1 in labels will be sorted by the value of key1. Then, the left pods which have no key1 but have key2 in labels will be sorted by the value of key2 and put behind those pods have key1.
   * @return orderPriority
  **/
  @ApiModelProperty(value = "Order priority terms, pods will be sorted by the value of orderedKey. For example: ``` orderPriority: - orderedKey: key1 - orderedKey: key2 ``` First, all pods which have key1 in labels will be sorted by the value of key1. Then, the left pods which have no key1 but have key2 in labels will be sorted by the value of key2 and put behind those pods have key1.")
  public List<KruiseAppsV1alpha1UpdatePriorityOrderTerm> getOrderPriority() {
    return orderPriority;
  }

  public void setOrderPriority(List<KruiseAppsV1alpha1UpdatePriorityOrderTerm> orderPriority) {
    this.orderPriority = orderPriority;
  }

  public KruiseAppsV1alpha1UpdatePriorityStrategy weightPriority(List<KruiseAppsV1alpha1UpdatePriorityWeightTerm> weightPriority) {
    this.weightPriority = weightPriority;
    return this;
  }

  public KruiseAppsV1alpha1UpdatePriorityStrategy addWeightPriorityItem(KruiseAppsV1alpha1UpdatePriorityWeightTerm weightPriorityItem) {
    if (this.weightPriority == null) {
      this.weightPriority = new ArrayList<KruiseAppsV1alpha1UpdatePriorityWeightTerm>();
    }
    this.weightPriority.add(weightPriorityItem);
    return this;
  }

   /**
   * Weight priority terms, pods will be sorted by the sum of all terms weight.
   * @return weightPriority
  **/
  @ApiModelProperty(value = "Weight priority terms, pods will be sorted by the sum of all terms weight.")
  public List<KruiseAppsV1alpha1UpdatePriorityWeightTerm> getWeightPriority() {
    return weightPriority;
  }

  public void setWeightPriority(List<KruiseAppsV1alpha1UpdatePriorityWeightTerm> weightPriority) {
    this.weightPriority = weightPriority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1UpdatePriorityStrategy kruiseAppsV1alpha1UpdatePriorityStrategy = (KruiseAppsV1alpha1UpdatePriorityStrategy) o;
    return Objects.equals(this.orderPriority, kruiseAppsV1alpha1UpdatePriorityStrategy.orderPriority) &&
        Objects.equals(this.weightPriority, kruiseAppsV1alpha1UpdatePriorityStrategy.weightPriority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderPriority, weightPriority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1UpdatePriorityStrategy {\n");
    
    sb.append("    orderPriority: ").append(toIndentedString(orderPriority)).append("\n");
    sb.append("    weightPriority: ").append(toIndentedString(weightPriority)).append("\n");
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

