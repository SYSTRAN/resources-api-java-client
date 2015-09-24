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
public class EntryOutput  {
  
  private String source = null;
  private String target = null;
  private String partOfSpeech = null;
  private Integer priority = null;
  private String comments = null;
  private Integer sourceConfidence = null;
  private Integer targetConfidence = null;
  private String sourceLang = null;
  private String targetLang = null;
  private String sourceId = null;
  private String targetId = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("target")
  public String getTarget() {
    return target;
  }
  public void setTarget(String target) {
    this.target = target;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("partOfSpeech")
  public String getPartOfSpeech() {
    return partOfSpeech;
  }
  public void setPartOfSpeech(String partOfSpeech) {
    this.partOfSpeech = partOfSpeech;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
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
  @JsonProperty("sourceConfidence")
  public Integer getSourceConfidence() {
    return sourceConfidence;
  }
  public void setSourceConfidence(Integer sourceConfidence) {
    this.sourceConfidence = sourceConfidence;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("targetConfidence")
  public Integer getTargetConfidence() {
    return targetConfidence;
  }
  public void setTargetConfidence(Integer targetConfidence) {
    this.targetConfidence = targetConfidence;
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
  @JsonProperty("targetLang")
  public String getTargetLang() {
    return targetLang;
  }
  public void setTargetLang(String targetLang) {
    this.targetLang = targetLang;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("sourceId")
  public String getSourceId() {
    return sourceId;
  }
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("targetId")
  public String getTargetId() {
    return targetId;
  }
  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntryOutput {\n");
    
    sb.append("  source: ").append(source).append("\n");
    sb.append("  target: ").append(target).append("\n");
    sb.append("  partOfSpeech: ").append(partOfSpeech).append("\n");
    sb.append("  priority: ").append(priority).append("\n");
    sb.append("  comments: ").append(comments).append("\n");
    sb.append("  sourceConfidence: ").append(sourceConfidence).append("\n");
    sb.append("  targetConfidence: ").append(targetConfidence).append("\n");
    sb.append("  sourceLang: ").append(sourceLang).append("\n");
    sb.append("  targetLang: ").append(targetLang).append("\n");
    sb.append("  sourceId: ").append(sourceId).append("\n");
    sb.append("  targetId: ").append(targetId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
