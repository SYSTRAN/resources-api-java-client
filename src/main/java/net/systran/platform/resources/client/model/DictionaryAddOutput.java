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


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class DictionaryAddOutput  {
  
  private String id = null;
  private String name = null;
  private String sourceLang = null;
  private String targetLangs = null;
  private String comments = null;
  private String type = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("sourceLang")
  public String getSourceLang() {
    return sourceLang;
  }
  public void setSourceLang(String sourceLang) {
    this.sourceLang = sourceLang;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("targetLangs")
  public String getTargetLangs() {
    return targetLangs;
  }
  public void setTargetLangs(String targetLangs) {
    this.targetLangs = targetLangs;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("comments")
  public String getComments() {
    return comments;
  }
  public void setComments(String comments) {
    this.comments = comments;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryAddOutput {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  sourceLang: ").append(sourceLang).append("\n");
    sb.append("  targetLangs: ").append(targetLangs).append("\n");
    sb.append("  comments: ").append(comments).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
