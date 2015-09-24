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
public class DictionaryUpdateOutput  {
  
  private String name = null;
  private String sourceLang = null;
  private String targetLangs = null;
  private String comments = null;

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryUpdateOutput {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  sourceLang: ").append(sourceLang).append("\n");
    sb.append("  targetLangs: ").append(targetLangs).append("\n");
    sb.append("  comments: ").append(comments).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
