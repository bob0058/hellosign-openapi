/*
 * Dropbox Sign API
 * Dropbox Sign v3 API
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: apisupport@hellosign.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.hellosign.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.hellosign.openapi.JSON;


import com.hellosign.openapi.ApiException;
/**
 * This allows the requester to specify editor options when a preparing a document
 */
@ApiModel(description = "This allows the requester to specify editor options when a preparing a document")
@JsonPropertyOrder({
    SubEditorOptions.JSON_PROPERTY_ALLOW_EDIT_SIGNERS,
    SubEditorOptions.JSON_PROPERTY_ALLOW_EDIT_DOCUMENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubEditorOptions {
  public static final String JSON_PROPERTY_ALLOW_EDIT_SIGNERS = "allow_edit_signers";
  private Boolean allowEditSigners = false;

  public static final String JSON_PROPERTY_ALLOW_EDIT_DOCUMENTS = "allow_edit_documents";
  private Boolean allowEditDocuments = false;

  public SubEditorOptions() { 
  }

  public SubEditorOptions allowEditSigners(Boolean allowEditSigners) {
    this.allowEditSigners = allowEditSigners;
    return this;
  }

   /**
   * Allows requesters to edit the list of signers
   * @return allowEditSigners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allows requesters to edit the list of signers")
  @JsonProperty(JSON_PROPERTY_ALLOW_EDIT_SIGNERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowEditSigners() {
    return allowEditSigners;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_EDIT_SIGNERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowEditSigners(Boolean allowEditSigners) {
    this.allowEditSigners = allowEditSigners;
  }


  public SubEditorOptions allowEditDocuments(Boolean allowEditDocuments) {
    this.allowEditDocuments = allowEditDocuments;
    return this;
  }

   /**
   * Allows requesters to edit documents, including delete and add
   * @return allowEditDocuments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allows requesters to edit documents, including delete and add")
  @JsonProperty(JSON_PROPERTY_ALLOW_EDIT_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowEditDocuments() {
    return allowEditDocuments;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_EDIT_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowEditDocuments(Boolean allowEditDocuments) {
    this.allowEditDocuments = allowEditDocuments;
  }


  /**
   * Return true if this SubEditorOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubEditorOptions subEditorOptions = (SubEditorOptions) o;
    return Objects.equals(this.allowEditSigners, subEditorOptions.allowEditSigners) &&
        Objects.equals(this.allowEditDocuments, subEditorOptions.allowEditDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowEditSigners, allowEditDocuments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubEditorOptions {\n");
    sb.append("    allowEditSigners: ").append(toIndentedString(allowEditSigners)).append("\n");
    sb.append("    allowEditDocuments: ").append(toIndentedString(allowEditDocuments)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (allowEditSigners != null) {
        if (isFileTypeOrListOfFiles(allowEditSigners)) {
            fileTypeFound = true;
        }

        if (allowEditSigners.getClass().equals(java.io.File.class) ||
            allowEditSigners.getClass().equals(Integer.class) ||
            allowEditSigners.getClass().equals(String.class) ) {
            map.put("allow_edit_signers", allowEditSigners);
        } else if (isListOfFile(allowEditSigners)) {
            for(int i = 0; i< getListSize(allowEditSigners); i++) {
                map.put("allow_edit_signers[" + i + "]", getFromList(allowEditSigners, i));
            }
        }
        else {
            map.put("allow_edit_signers", JSON.getDefault().getMapper().writeValueAsString(allowEditSigners));
        }
    }
    if (allowEditDocuments != null) {
        if (isFileTypeOrListOfFiles(allowEditDocuments)) {
            fileTypeFound = true;
        }

        if (allowEditDocuments.getClass().equals(java.io.File.class) ||
            allowEditDocuments.getClass().equals(Integer.class) ||
            allowEditDocuments.getClass().equals(String.class) ) {
            map.put("allow_edit_documents", allowEditDocuments);
        } else if (isListOfFile(allowEditDocuments)) {
            for(int i = 0; i< getListSize(allowEditDocuments); i++) {
                map.put("allow_edit_documents[" + i + "]", getFromList(allowEditDocuments, i));
            }
        }
        else {
            map.put("allow_edit_documents", JSON.getDefault().getMapper().writeValueAsString(allowEditDocuments));
        }
    }
    } catch (Exception e) {
        throw new ApiException(e);
    }

    return fileTypeFound ? map : new HashMap<>();
  }

  private boolean isFileTypeOrListOfFiles(Object obj) throws Exception {
    return obj.getClass().equals(java.io.File.class) || isListOfFile(obj);
  }

  private boolean isListOfFile(Object obj) throws Exception {
      return obj instanceof java.util.List && !isListEmpty(obj) && getFromList(obj, 0) instanceof java.io.File;
  }

  private boolean isListEmpty(Object obj) throws Exception {
    return (boolean) Class.forName(java.util.List.class.getName()).getMethod("isEmpty").invoke(obj);
  }

  private Object getFromList(Object obj, int index) throws Exception {
    return Class.forName(java.util.List.class.getName()).getMethod("get", int.class).invoke(obj, index);
  }

  private int getListSize(Object obj) throws Exception {
    return (int) Class.forName(java.util.List.class.getName()).getMethod("size").invoke(obj);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

