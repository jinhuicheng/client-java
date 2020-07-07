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
import io.kubernetes.client.models.V1ObjectMeta;
import io.openkruise.client.models.KruiseAppsV1alpha1BroadcastJobSpec;
import io.openkruise.client.models.KruiseAppsV1alpha1BroadcastJobStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BroadcastJob is the Schema for the broadcastjobs API
 */
@ApiModel(description = "BroadcastJob is the Schema for the broadcastjobs API")

public class KruiseAppsV1alpha1BroadcastJob {

  public static final String group = "apps.kruise.io";
  public static final String version = "v1alpha1";
  public static final String plural = "broadcastjobs";

  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("spec")
  private KruiseAppsV1alpha1BroadcastJobSpec spec = null;

  @SerializedName("status")
  private KruiseAppsV1alpha1BroadcastJobStatus status = null;

  public KruiseAppsV1alpha1BroadcastJob apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public KruiseAppsV1alpha1BroadcastJob kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public KruiseAppsV1alpha1BroadcastJob metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public KruiseAppsV1alpha1BroadcastJob spec(KruiseAppsV1alpha1BroadcastJobSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @ApiModelProperty(value = "")
  public KruiseAppsV1alpha1BroadcastJobSpec getSpec() {
    return spec;
  }

  public void setSpec(KruiseAppsV1alpha1BroadcastJobSpec spec) {
    this.spec = spec;
  }

  public KruiseAppsV1alpha1BroadcastJob status(KruiseAppsV1alpha1BroadcastJobStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public KruiseAppsV1alpha1BroadcastJobStatus getStatus() {
    return status;
  }

  public void setStatus(KruiseAppsV1alpha1BroadcastJobStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1BroadcastJob kruiseAppsV1alpha1BroadcastJob = (KruiseAppsV1alpha1BroadcastJob) o;
    return Objects.equals(this.apiVersion, kruiseAppsV1alpha1BroadcastJob.apiVersion) &&
        Objects.equals(this.kind, kruiseAppsV1alpha1BroadcastJob.kind) &&
        Objects.equals(this.metadata, kruiseAppsV1alpha1BroadcastJob.metadata) &&
        Objects.equals(this.spec, kruiseAppsV1alpha1BroadcastJob.spec) &&
        Objects.equals(this.status, kruiseAppsV1alpha1BroadcastJob.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1BroadcastJob {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

