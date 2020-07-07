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
import io.openkruise.client.models.KruiseAppsV1alpha1AdvancedStatefulSetTemplateSpec;
import io.openkruise.client.models.KruiseAppsV1alpha1StatefulSetTemplateSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SubsetTemplate defines the subset template under the UnitedDeployment. UnitedDeployment will provision every subset based on one workload templates in SubsetTemplate.
 */
@ApiModel(description = "SubsetTemplate defines the subset template under the UnitedDeployment. UnitedDeployment will provision every subset based on one workload templates in SubsetTemplate.")

public class KruiseAppsV1alpha1SubsetTemplate {
  @SerializedName("advancedStatefulSetTemplate")
  private KruiseAppsV1alpha1AdvancedStatefulSetTemplateSpec advancedStatefulSetTemplate = null;

  @SerializedName("statefulSetTemplate")
  private KruiseAppsV1alpha1StatefulSetTemplateSpec statefulSetTemplate = null;

  public KruiseAppsV1alpha1SubsetTemplate advancedStatefulSetTemplate(KruiseAppsV1alpha1AdvancedStatefulSetTemplateSpec advancedStatefulSetTemplate) {
    this.advancedStatefulSetTemplate = advancedStatefulSetTemplate;
    return this;
  }

   /**
   * AdvancedStatefulSet template
   * @return advancedStatefulSetTemplate
  **/
  @ApiModelProperty(value = "AdvancedStatefulSet template")
  public KruiseAppsV1alpha1AdvancedStatefulSetTemplateSpec getAdvancedStatefulSetTemplate() {
    return advancedStatefulSetTemplate;
  }

  public void setAdvancedStatefulSetTemplate(KruiseAppsV1alpha1AdvancedStatefulSetTemplateSpec advancedStatefulSetTemplate) {
    this.advancedStatefulSetTemplate = advancedStatefulSetTemplate;
  }

  public KruiseAppsV1alpha1SubsetTemplate statefulSetTemplate(KruiseAppsV1alpha1StatefulSetTemplateSpec statefulSetTemplate) {
    this.statefulSetTemplate = statefulSetTemplate;
    return this;
  }

   /**
   * StatefulSet template
   * @return statefulSetTemplate
  **/
  @ApiModelProperty(value = "StatefulSet template")
  public KruiseAppsV1alpha1StatefulSetTemplateSpec getStatefulSetTemplate() {
    return statefulSetTemplate;
  }

  public void setStatefulSetTemplate(KruiseAppsV1alpha1StatefulSetTemplateSpec statefulSetTemplate) {
    this.statefulSetTemplate = statefulSetTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1SubsetTemplate kruiseAppsV1alpha1SubsetTemplate = (KruiseAppsV1alpha1SubsetTemplate) o;
    return Objects.equals(this.advancedStatefulSetTemplate, kruiseAppsV1alpha1SubsetTemplate.advancedStatefulSetTemplate) &&
        Objects.equals(this.statefulSetTemplate, kruiseAppsV1alpha1SubsetTemplate.statefulSetTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advancedStatefulSetTemplate, statefulSetTemplate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1SubsetTemplate {\n");
    
    sb.append("    advancedStatefulSetTemplate: ").append(toIndentedString(advancedStatefulSetTemplate)).append("\n");
    sb.append("    statefulSetTemplate: ").append(toIndentedString(statefulSetTemplate)).append("\n");
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

