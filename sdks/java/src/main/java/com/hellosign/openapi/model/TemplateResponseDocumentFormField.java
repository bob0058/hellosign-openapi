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
import com.hellosign.openapi.model.TemplateResponseFieldAvgTextLength;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.hellosign.openapi.JSON;


import com.hellosign.openapi.ApiException;
/**
 * TemplateResponseDocumentFormField
 */
@JsonPropertyOrder({
    TemplateResponseDocumentFormField.JSON_PROPERTY_API_ID,
    TemplateResponseDocumentFormField.JSON_PROPERTY_NAME,
    TemplateResponseDocumentFormField.JSON_PROPERTY_TYPE,
    TemplateResponseDocumentFormField.JSON_PROPERTY_SIGNER,
    TemplateResponseDocumentFormField.JSON_PROPERTY_X,
    TemplateResponseDocumentFormField.JSON_PROPERTY_Y,
    TemplateResponseDocumentFormField.JSON_PROPERTY_WIDTH,
    TemplateResponseDocumentFormField.JSON_PROPERTY_HEIGHT,
    TemplateResponseDocumentFormField.JSON_PROPERTY_REQUIRED,
    TemplateResponseDocumentFormField.JSON_PROPERTY_GROUP,
    TemplateResponseDocumentFormField.JSON_PROPERTY_AVG_TEXT_LENGTH,
    TemplateResponseDocumentFormField.JSON_PROPERTY_IS_MULTILINE,
    TemplateResponseDocumentFormField.JSON_PROPERTY_ORIGINAL_FONT_SIZE,
    TemplateResponseDocumentFormField.JSON_PROPERTY_FONT_FAMILY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateResponseDocumentFormField {
  public static final String JSON_PROPERTY_API_ID = "api_id";
  private String apiId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * The type of this form field. See [field types](/api/reference/constants/#field-types).
   */
  public enum TypeEnum {
    CHECKBOX("checkbox"),
    
    CHECKBOX_MERGE("checkbox-merge"),
    
    DATE_SIGNED("date_signed"),
    
    DROPDOWN("dropdown"),
    
    HYPERLINK("hyperlink"),
    
    INITIALS("initials"),
    
    SIGNATURE("signature"),
    
    RADIO("radio"),
    
    TEXT("text"),
    
    TEXT_MERGE("text-merge");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_SIGNER = "signer";
  private String signer;

  public static final String JSON_PROPERTY_X = "x";
  private Integer x;

  public static final String JSON_PROPERTY_Y = "y";
  private Integer y;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Integer height;

  public static final String JSON_PROPERTY_REQUIRED = "required";
  private Boolean required;

  public static final String JSON_PROPERTY_GROUP = "group";
  private String group;

  public static final String JSON_PROPERTY_AVG_TEXT_LENGTH = "avg_text_length";
  private TemplateResponseFieldAvgTextLength avgTextLength;

  public static final String JSON_PROPERTY_IS_MULTILINE = "isMultiline";
  private Boolean isMultiline;

  public static final String JSON_PROPERTY_ORIGINAL_FONT_SIZE = "originalFontSize";
  private Integer originalFontSize;

  public static final String JSON_PROPERTY_FONT_FAMILY = "fontFamily";
  private String fontFamily;

  public TemplateResponseDocumentFormField() { 
  }

  public TemplateResponseDocumentFormField apiId(String apiId) {
    this.apiId = apiId;
    return this;
  }

   /**
   * A unique id for the form field.
   * @return apiId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique id for the form field.")
  @JsonProperty(JSON_PROPERTY_API_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApiId() {
    return apiId;
  }


  @JsonProperty(JSON_PROPERTY_API_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiId(String apiId) {
    this.apiId = apiId;
  }


  public TemplateResponseDocumentFormField name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the form field.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the form field.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public TemplateResponseDocumentFormField type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of this form field. See [field types](/api/reference/constants/#field-types).
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of this form field. See [field types](/api/reference/constants/#field-types).")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public TemplateResponseDocumentFormField signer(String signer) {
    this.signer = signer;
    return this;
  }

   /**
   * The signer of the Form Field.
   * @return signer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The signer of the Form Field.")
  @JsonProperty(JSON_PROPERTY_SIGNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSigner() {
    return signer;
  }


  @JsonProperty(JSON_PROPERTY_SIGNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSigner(String signer) {
    this.signer = signer;
  }


  public TemplateResponseDocumentFormField x(Integer x) {
    this.x = x;
    return this;
  }

   /**
   * The horizontal offset in pixels for this form field.
   * @return x
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The horizontal offset in pixels for this form field.")
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getX() {
    return x;
  }


  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setX(Integer x) {
    this.x = x;
  }


  public TemplateResponseDocumentFormField y(Integer y) {
    this.y = y;
    return this;
  }

   /**
   * The vertical offset in pixels for this form field.
   * @return y
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The vertical offset in pixels for this form field.")
  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getY() {
    return y;
  }


  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setY(Integer y) {
    this.y = y;
  }


  public TemplateResponseDocumentFormField width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * The width in pixels of this form field.
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The width in pixels of this form field.")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(Integer width) {
    this.width = width;
  }


  public TemplateResponseDocumentFormField height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * The height in pixels of this form field.
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The height in pixels of this form field.")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(Integer height) {
    this.height = height;
  }


  public TemplateResponseDocumentFormField required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Boolean showing whether or not this field is required.
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Boolean showing whether or not this field is required.")
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequired() {
    return required;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequired(Boolean required) {
    this.required = required;
  }


  public TemplateResponseDocumentFormField group(String group) {
    this.group = group;
    return this;
  }

   /**
   * The name of the group this field is in. If this field is not a group, this defaults to &#x60;null&#x60;.
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the group this field is in. If this field is not a group, this defaults to `null`.")
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroup() {
    return group;
  }


  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroup(String group) {
    this.group = group;
  }


  public TemplateResponseDocumentFormField avgTextLength(TemplateResponseFieldAvgTextLength avgTextLength) {
    this.avgTextLength = avgTextLength;
    return this;
  }

   /**
   * Get avgTextLength
   * @return avgTextLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AVG_TEXT_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TemplateResponseFieldAvgTextLength getAvgTextLength() {
    return avgTextLength;
  }


  @JsonProperty(JSON_PROPERTY_AVG_TEXT_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvgTextLength(TemplateResponseFieldAvgTextLength avgTextLength) {
    this.avgTextLength = avgTextLength;
  }


  public TemplateResponseDocumentFormField isMultiline(Boolean isMultiline) {
    this.isMultiline = isMultiline;
    return this;
  }

   /**
   * Whether this form field is multiline text.
   * @return isMultiline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this form field is multiline text.")
  @JsonProperty(JSON_PROPERTY_IS_MULTILINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsMultiline() {
    return isMultiline;
  }


  @JsonProperty(JSON_PROPERTY_IS_MULTILINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsMultiline(Boolean isMultiline) {
    this.isMultiline = isMultiline;
  }


  public TemplateResponseDocumentFormField originalFontSize(Integer originalFontSize) {
    this.originalFontSize = originalFontSize;
    return this;
  }

   /**
   * Original font size used in this form field&#39;s text.
   * @return originalFontSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Original font size used in this form field's text.")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_FONT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOriginalFontSize() {
    return originalFontSize;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_FONT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalFontSize(Integer originalFontSize) {
    this.originalFontSize = originalFontSize;
  }


  public TemplateResponseDocumentFormField fontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
    return this;
  }

   /**
   * Font family used in this form field&#39;s text.
   * @return fontFamily
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Font family used in this form field's text.")
  @JsonProperty(JSON_PROPERTY_FONT_FAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFontFamily() {
    return fontFamily;
  }


  @JsonProperty(JSON_PROPERTY_FONT_FAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
  }


  /**
   * Return true if this TemplateResponseDocumentFormField object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateResponseDocumentFormField templateResponseDocumentFormField = (TemplateResponseDocumentFormField) o;
    return Objects.equals(this.apiId, templateResponseDocumentFormField.apiId) &&
        Objects.equals(this.name, templateResponseDocumentFormField.name) &&
        Objects.equals(this.type, templateResponseDocumentFormField.type) &&
        Objects.equals(this.signer, templateResponseDocumentFormField.signer) &&
        Objects.equals(this.x, templateResponseDocumentFormField.x) &&
        Objects.equals(this.y, templateResponseDocumentFormField.y) &&
        Objects.equals(this.width, templateResponseDocumentFormField.width) &&
        Objects.equals(this.height, templateResponseDocumentFormField.height) &&
        Objects.equals(this.required, templateResponseDocumentFormField.required) &&
        Objects.equals(this.group, templateResponseDocumentFormField.group) &&
        Objects.equals(this.avgTextLength, templateResponseDocumentFormField.avgTextLength) &&
        Objects.equals(this.isMultiline, templateResponseDocumentFormField.isMultiline) &&
        Objects.equals(this.originalFontSize, templateResponseDocumentFormField.originalFontSize) &&
        Objects.equals(this.fontFamily, templateResponseDocumentFormField.fontFamily);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiId, name, type, signer, x, y, width, height, required, group, avgTextLength, isMultiline, originalFontSize, fontFamily);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateResponseDocumentFormField {\n");
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    signer: ").append(toIndentedString(signer)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    avgTextLength: ").append(toIndentedString(avgTextLength)).append("\n");
    sb.append("    isMultiline: ").append(toIndentedString(isMultiline)).append("\n");
    sb.append("    originalFontSize: ").append(toIndentedString(originalFontSize)).append("\n");
    sb.append("    fontFamily: ").append(toIndentedString(fontFamily)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (apiId != null) {
        if (isFileTypeOrListOfFiles(apiId)) {
            fileTypeFound = true;
        }

        if (apiId.getClass().equals(java.io.File.class) ||
            apiId.getClass().equals(Integer.class) ||
            apiId.getClass().equals(String.class) ) {
            map.put("api_id", apiId);
        } else if (isListOfFile(apiId)) {
            for(int i = 0; i< getListSize(apiId); i++) {
                map.put("api_id[" + i + "]", getFromList(apiId, i));
            }
        }
        else {
            map.put("api_id", JSON.getDefault().getMapper().writeValueAsString(apiId));
        }
    }
    if (name != null) {
        if (isFileTypeOrListOfFiles(name)) {
            fileTypeFound = true;
        }

        if (name.getClass().equals(java.io.File.class) ||
            name.getClass().equals(Integer.class) ||
            name.getClass().equals(String.class) ) {
            map.put("name", name);
        } else if (isListOfFile(name)) {
            for(int i = 0; i< getListSize(name); i++) {
                map.put("name[" + i + "]", getFromList(name, i));
            }
        }
        else {
            map.put("name", JSON.getDefault().getMapper().writeValueAsString(name));
        }
    }
    if (type != null) {
        if (isFileTypeOrListOfFiles(type)) {
            fileTypeFound = true;
        }

        if (type.getClass().equals(java.io.File.class) ||
            type.getClass().equals(Integer.class) ||
            type.getClass().equals(String.class) ) {
            map.put("type", type);
        } else if (isListOfFile(type)) {
            for(int i = 0; i< getListSize(type); i++) {
                map.put("type[" + i + "]", getFromList(type, i));
            }
        }
        else {
            map.put("type", JSON.getDefault().getMapper().writeValueAsString(type));
        }
    }
    if (signer != null) {
        if (isFileTypeOrListOfFiles(signer)) {
            fileTypeFound = true;
        }

        if (signer.getClass().equals(java.io.File.class) ||
            signer.getClass().equals(Integer.class) ||
            signer.getClass().equals(String.class) ) {
            map.put("signer", signer);
        } else if (isListOfFile(signer)) {
            for(int i = 0; i< getListSize(signer); i++) {
                map.put("signer[" + i + "]", getFromList(signer, i));
            }
        }
        else {
            map.put("signer", JSON.getDefault().getMapper().writeValueAsString(signer));
        }
    }
    if (x != null) {
        if (isFileTypeOrListOfFiles(x)) {
            fileTypeFound = true;
        }

        if (x.getClass().equals(java.io.File.class) ||
            x.getClass().equals(Integer.class) ||
            x.getClass().equals(String.class) ) {
            map.put("x", x);
        } else if (isListOfFile(x)) {
            for(int i = 0; i< getListSize(x); i++) {
                map.put("x[" + i + "]", getFromList(x, i));
            }
        }
        else {
            map.put("x", JSON.getDefault().getMapper().writeValueAsString(x));
        }
    }
    if (y != null) {
        if (isFileTypeOrListOfFiles(y)) {
            fileTypeFound = true;
        }

        if (y.getClass().equals(java.io.File.class) ||
            y.getClass().equals(Integer.class) ||
            y.getClass().equals(String.class) ) {
            map.put("y", y);
        } else if (isListOfFile(y)) {
            for(int i = 0; i< getListSize(y); i++) {
                map.put("y[" + i + "]", getFromList(y, i));
            }
        }
        else {
            map.put("y", JSON.getDefault().getMapper().writeValueAsString(y));
        }
    }
    if (width != null) {
        if (isFileTypeOrListOfFiles(width)) {
            fileTypeFound = true;
        }

        if (width.getClass().equals(java.io.File.class) ||
            width.getClass().equals(Integer.class) ||
            width.getClass().equals(String.class) ) {
            map.put("width", width);
        } else if (isListOfFile(width)) {
            for(int i = 0; i< getListSize(width); i++) {
                map.put("width[" + i + "]", getFromList(width, i));
            }
        }
        else {
            map.put("width", JSON.getDefault().getMapper().writeValueAsString(width));
        }
    }
    if (height != null) {
        if (isFileTypeOrListOfFiles(height)) {
            fileTypeFound = true;
        }

        if (height.getClass().equals(java.io.File.class) ||
            height.getClass().equals(Integer.class) ||
            height.getClass().equals(String.class) ) {
            map.put("height", height);
        } else if (isListOfFile(height)) {
            for(int i = 0; i< getListSize(height); i++) {
                map.put("height[" + i + "]", getFromList(height, i));
            }
        }
        else {
            map.put("height", JSON.getDefault().getMapper().writeValueAsString(height));
        }
    }
    if (required != null) {
        if (isFileTypeOrListOfFiles(required)) {
            fileTypeFound = true;
        }

        if (required.getClass().equals(java.io.File.class) ||
            required.getClass().equals(Integer.class) ||
            required.getClass().equals(String.class) ) {
            map.put("required", required);
        } else if (isListOfFile(required)) {
            for(int i = 0; i< getListSize(required); i++) {
                map.put("required[" + i + "]", getFromList(required, i));
            }
        }
        else {
            map.put("required", JSON.getDefault().getMapper().writeValueAsString(required));
        }
    }
    if (group != null) {
        if (isFileTypeOrListOfFiles(group)) {
            fileTypeFound = true;
        }

        if (group.getClass().equals(java.io.File.class) ||
            group.getClass().equals(Integer.class) ||
            group.getClass().equals(String.class) ) {
            map.put("group", group);
        } else if (isListOfFile(group)) {
            for(int i = 0; i< getListSize(group); i++) {
                map.put("group[" + i + "]", getFromList(group, i));
            }
        }
        else {
            map.put("group", JSON.getDefault().getMapper().writeValueAsString(group));
        }
    }
    if (avgTextLength != null) {
        if (isFileTypeOrListOfFiles(avgTextLength)) {
            fileTypeFound = true;
        }

        if (avgTextLength.getClass().equals(java.io.File.class) ||
            avgTextLength.getClass().equals(Integer.class) ||
            avgTextLength.getClass().equals(String.class) ) {
            map.put("avg_text_length", avgTextLength);
        } else if (isListOfFile(avgTextLength)) {
            for(int i = 0; i< getListSize(avgTextLength); i++) {
                map.put("avg_text_length[" + i + "]", getFromList(avgTextLength, i));
            }
        }
        else {
            map.put("avg_text_length", JSON.getDefault().getMapper().writeValueAsString(avgTextLength));
        }
    }
    if (isMultiline != null) {
        if (isFileTypeOrListOfFiles(isMultiline)) {
            fileTypeFound = true;
        }

        if (isMultiline.getClass().equals(java.io.File.class) ||
            isMultiline.getClass().equals(Integer.class) ||
            isMultiline.getClass().equals(String.class) ) {
            map.put("isMultiline", isMultiline);
        } else if (isListOfFile(isMultiline)) {
            for(int i = 0; i< getListSize(isMultiline); i++) {
                map.put("isMultiline[" + i + "]", getFromList(isMultiline, i));
            }
        }
        else {
            map.put("isMultiline", JSON.getDefault().getMapper().writeValueAsString(isMultiline));
        }
    }
    if (originalFontSize != null) {
        if (isFileTypeOrListOfFiles(originalFontSize)) {
            fileTypeFound = true;
        }

        if (originalFontSize.getClass().equals(java.io.File.class) ||
            originalFontSize.getClass().equals(Integer.class) ||
            originalFontSize.getClass().equals(String.class) ) {
            map.put("originalFontSize", originalFontSize);
        } else if (isListOfFile(originalFontSize)) {
            for(int i = 0; i< getListSize(originalFontSize); i++) {
                map.put("originalFontSize[" + i + "]", getFromList(originalFontSize, i));
            }
        }
        else {
            map.put("originalFontSize", JSON.getDefault().getMapper().writeValueAsString(originalFontSize));
        }
    }
    if (fontFamily != null) {
        if (isFileTypeOrListOfFiles(fontFamily)) {
            fileTypeFound = true;
        }

        if (fontFamily.getClass().equals(java.io.File.class) ||
            fontFamily.getClass().equals(Integer.class) ||
            fontFamily.getClass().equals(String.class) ) {
            map.put("fontFamily", fontFamily);
        } else if (isListOfFile(fontFamily)) {
            for(int i = 0; i< getListSize(fontFamily); i++) {
                map.put("fontFamily[" + i + "]", getFromList(fontFamily, i));
            }
        }
        else {
            map.put("fontFamily", JSON.getDefault().getMapper().writeValueAsString(fontFamily));
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

