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
import java.util.ArrayList;
import java.util.List;

/**
 * CloneSetScaleStrategy defines strategies for pods scale.
 */
@ApiModel(description = "CloneSetScaleStrategy defines strategies for pods scale.")

public class KruiseAppsV1alpha1CloneSetScaleStrategy {
  @SerializedName("podsToDelete")
  private List<String> podsToDelete = null;

  public KruiseAppsV1alpha1CloneSetScaleStrategy podsToDelete(List<String> podsToDelete) {
    this.podsToDelete = podsToDelete;
    return this;
  }

  public KruiseAppsV1alpha1CloneSetScaleStrategy addPodsToDeleteItem(String podsToDeleteItem) {
    if (this.podsToDelete == null) {
      this.podsToDelete = new ArrayList<String>();
    }
    this.podsToDelete.add(podsToDeleteItem);
    return this;
  }

   /**
   * PodsToDelete is the names of Pod should be deleted. Note that this list will be truncated for non-existing pod names.
   * @return podsToDelete
  **/
  @ApiModelProperty(value = "PodsToDelete is the names of Pod should be deleted. Note that this list will be truncated for non-existing pod names.")
  public List<String> getPodsToDelete() {
    return podsToDelete;
  }

  public void setPodsToDelete(List<String> podsToDelete) {
    this.podsToDelete = podsToDelete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1CloneSetScaleStrategy kruiseAppsV1alpha1CloneSetScaleStrategy = (KruiseAppsV1alpha1CloneSetScaleStrategy) o;
    return Objects.equals(this.podsToDelete, kruiseAppsV1alpha1CloneSetScaleStrategy.podsToDelete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(podsToDelete);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1CloneSetScaleStrategy {\n");
    
    sb.append("    podsToDelete: ").append(toIndentedString(podsToDelete)).append("\n");
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

