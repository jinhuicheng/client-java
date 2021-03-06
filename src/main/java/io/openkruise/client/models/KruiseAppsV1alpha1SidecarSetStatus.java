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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SidecarSetStatus defines the observed state of SidecarSet
 */
@ApiModel(description = "SidecarSetStatus defines the observed state of SidecarSet")

public class KruiseAppsV1alpha1SidecarSetStatus {
  @SerializedName("matchedPods")
  private Integer matchedPods = null;

  @SerializedName("observedGeneration")
  private Long observedGeneration = null;

  @SerializedName("readyPods")
  private Integer readyPods = null;

  @SerializedName("updatedPods")
  private Integer updatedPods = null;

  public KruiseAppsV1alpha1SidecarSetStatus matchedPods(Integer matchedPods) {
    this.matchedPods = matchedPods;
    return this;
  }

   /**
   * matchedPods is the number of Pods whose labels are matched with this SidecarSet&#39;s selector and are created after sidecarset creates
   * @return matchedPods
  **/
  @ApiModelProperty(required = true, value = "matchedPods is the number of Pods whose labels are matched with this SidecarSet's selector and are created after sidecarset creates")
  public Integer getMatchedPods() {
    return matchedPods;
  }

  public void setMatchedPods(Integer matchedPods) {
    this.matchedPods = matchedPods;
  }

  public KruiseAppsV1alpha1SidecarSetStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * observedGeneration is the most recent generation observed for this SidecarSet. It corresponds to the SidecarSet&#39;s generation, which is updated on mutation by the API Server.
   * @return observedGeneration
  **/
  @ApiModelProperty(value = "observedGeneration is the most recent generation observed for this SidecarSet. It corresponds to the SidecarSet's generation, which is updated on mutation by the API Server.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public KruiseAppsV1alpha1SidecarSetStatus readyPods(Integer readyPods) {
    this.readyPods = readyPods;
    return this;
  }

   /**
   * readyPods is the number of matched Pods that have a ready condition
   * @return readyPods
  **/
  @ApiModelProperty(required = true, value = "readyPods is the number of matched Pods that have a ready condition")
  public Integer getReadyPods() {
    return readyPods;
  }

  public void setReadyPods(Integer readyPods) {
    this.readyPods = readyPods;
  }

  public KruiseAppsV1alpha1SidecarSetStatus updatedPods(Integer updatedPods) {
    this.updatedPods = updatedPods;
    return this;
  }

   /**
   * updatedPods is the number of matched Pods that are injected with the latest SidecarSet&#39;s containers
   * @return updatedPods
  **/
  @ApiModelProperty(required = true, value = "updatedPods is the number of matched Pods that are injected with the latest SidecarSet's containers")
  public Integer getUpdatedPods() {
    return updatedPods;
  }

  public void setUpdatedPods(Integer updatedPods) {
    this.updatedPods = updatedPods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1SidecarSetStatus kruiseAppsV1alpha1SidecarSetStatus = (KruiseAppsV1alpha1SidecarSetStatus) o;
    return Objects.equals(this.matchedPods, kruiseAppsV1alpha1SidecarSetStatus.matchedPods) &&
        Objects.equals(this.observedGeneration, kruiseAppsV1alpha1SidecarSetStatus.observedGeneration) &&
        Objects.equals(this.readyPods, kruiseAppsV1alpha1SidecarSetStatus.readyPods) &&
        Objects.equals(this.updatedPods, kruiseAppsV1alpha1SidecarSetStatus.updatedPods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchedPods, observedGeneration, readyPods, updatedPods);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1SidecarSetStatus {\n");
    
    sb.append("    matchedPods: ").append(toIndentedString(matchedPods)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    readyPods: ").append(toIndentedString(readyPods)).append("\n");
    sb.append("    updatedPods: ").append(toIndentedString(updatedPods)).append("\n");
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

