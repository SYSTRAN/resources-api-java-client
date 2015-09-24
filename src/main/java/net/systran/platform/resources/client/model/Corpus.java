/*
 * Copyright © 2015 SYSTRAN Software, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.systran.platform.resources.client.model;

import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;

@ApiModel(description = "")
public class Corpus  {
  
  private String id = null;
  private String name = null;
  private String createdAt = null;
  private String format = null;
  private Integer nbSegments = null;
  private String sourceLang = null;
  private List<String> targetLangs = new ArrayList<String>() ;
  public enum StatusEnum {
    pending("pending"), error("error"), ok("ok"); 

    private final String text;
    private static Map<String, StatusEnum> namesMap = new HashMap<String, StatusEnum>();
    
    static { 
      namesMap.put("pending", pending);
      namesMap.put("error", error);
      namesMap.put("ok", ok);
    }
    
    private StatusEnum(final String text) {
      this.text = text;
    }

    @JsonCreator
    public static StatusEnum forValue(String value) throws Exception {
      if (namesMap.get(value) == null) {
        throw new Exception("Invalid enum value");
      }

      return namesMap.get(value);
    }

    @Override
    public String toString() {
      return text;
    }
  };
  private StatusEnum status = null;

  
  /**
   * Identifier
   **/
  @ApiModelProperty(required = true, value = "Identifier")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Name
   **/
  @ApiModelProperty(required = true, value = "Name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Creation date
   **/
  @ApiModelProperty(required = true, value = "Creation date")
  @JsonProperty("createdAt")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  
  /**
   * Format
   **/
  @ApiModelProperty(required = true, value = "Format")
  @JsonProperty("format")
  public String getFormat() {
    return format;
  }
  public void setFormat(String format) {
    this.format = format;
  }

  
  /**
   * Number of segments
   **/
  @ApiModelProperty(required = true, value = "Number of segments")
  @JsonProperty("nbSegments")
  public Integer getNbSegments() {
    return nbSegments;
  }
  public void setNbSegments(Integer nbSegments) {
    this.nbSegments = nbSegments;
  }

  
  /**
   * Source language
   **/
  @ApiModelProperty(required = true, value = "Source language")
  @JsonProperty("sourceLang")
  public String getSourceLang() {
    return sourceLang;
  }
  public void setSourceLang(String sourceLang) {
    this.sourceLang = sourceLang;
  }

  
  /**
   * Target languages
   **/
  @ApiModelProperty(required = true, value = "Target languages")
  @JsonProperty("targetLangs")
  public List<String> getTargetLangs() {
    return targetLangs;
  }
  public void setTargetLangs(List<String> targetLangs) {
    this.targetLangs = targetLangs;
  }

  
  /**
   * Corpus status
   **/
  @ApiModelProperty(required = true, value = "Corpus status")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Corpus {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  format: ").append(format).append("\n");
    sb.append("  nbSegments: ").append(nbSegments).append("\n");
    sb.append("  sourceLang: ").append(sourceLang).append("\n");
    sb.append("  targetLangs: ").append(targetLangs).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
