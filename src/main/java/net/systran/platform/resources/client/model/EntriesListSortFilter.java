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
public class EntriesListSortFilter  {
  
  private Integer source = null;
  private Integer target = null;
  private Integer partOfSpeech = null;
  private Integer priority = null;
  private Integer comments = null;
  private Integer sourceConfidence = null;
  private Integer targetConfidence = null;
  private Integer targetLang = null;

  
  /**
   * 1/-1 for ascending/descending order on source field
   **/
  @ApiModelProperty(value = "1/-1 for ascending/descending order on source field")
  @JsonProperty("source")
  public Integer getSource() {
    return source;
  }
  public void setSource(Integer source) {
    this.source = source;
  }

  
  /**
   * 1/-1 for ascending/descending order on target field
   **/
  @ApiModelProperty(value = "1/-1 for ascending/descending order on target field")
  @JsonProperty("target")
  public Integer getTarget() {
    return target;
  }
  public void setTarget(Integer target) {
    this.target = target;
  }

  
  /**
   * 1/-1 for ascending/descending order on partOfSpeech field
   **/
  @ApiModelProperty(value = "1/-1 for ascending/descending order on partOfSpeech field")
  @JsonProperty("partOfSpeech")
  public Integer getPartOfSpeech() {
    return partOfSpeech;
  }
  public void setPartOfSpeech(Integer partOfSpeech) {
    this.partOfSpeech = partOfSpeech;
  }

  
  /**
   * 1/-1 for ascending/descending order on priority field
   **/
  @ApiModelProperty(value = "1/-1 for ascending/descending order on priority field")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  
  /**
   * 1/-1 for ascending/descending order on comments field
   **/
  @ApiModelProperty(value = "1/-1 for ascending/descending order on comments field")
  @JsonProperty("comments")
  public Integer getComments() {
    return comments;
  }
  public void setComments(Integer comments) {
    this.comments = comments;
  }

  
  /**
   * 1/-1 for ascending/descending order on sourceConfidence field
   **/
  @ApiModelProperty(value = "1/-1 for ascending/descending order on sourceConfidence field")
  @JsonProperty("sourceConfidence")
  public Integer getSourceConfidence() {
    return sourceConfidence;
  }
  public void setSourceConfidence(Integer sourceConfidence) {
    this.sourceConfidence = sourceConfidence;
  }

  
  /**
   * 1/-1 for ascending/descending order on targetConfidence field
   **/
  @ApiModelProperty(value = "1/-1 for ascending/descending order on targetConfidence field")
  @JsonProperty("targetConfidence")
  public Integer getTargetConfidence() {
    return targetConfidence;
  }
  public void setTargetConfidence(Integer targetConfidence) {
    this.targetConfidence = targetConfidence;
  }

  
  /**
   * 1/-1 for ascending/descending order on targetLang field
   **/
  @ApiModelProperty(value = "1/-1 for ascending/descending order on targetLang field")
  @JsonProperty("targetLang")
  public Integer getTargetLang() {
    return targetLang;
  }
  public void setTargetLang(Integer targetLang) {
    this.targetLang = targetLang;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntriesListSortFilter {\n");
    
    sb.append("  source: ").append(source).append("\n");
    sb.append("  target: ").append(target).append("\n");
    sb.append("  partOfSpeech: ").append(partOfSpeech).append("\n");
    sb.append("  priority: ").append(priority).append("\n");
    sb.append("  comments: ").append(comments).append("\n");
    sb.append("  sourceConfidence: ").append(sourceConfidence).append("\n");
    sb.append("  targetConfidence: ").append(targetConfidence).append("\n");
    sb.append("  targetLang: ").append(targetLang).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
