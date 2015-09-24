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
public class EntryAddOutput  {
  
  private String confidence = null;
  private String sourceId = null;
  private String targetId = null;
  private String pos = null;
  private String targetPos = null;
  private String source = null;
  private String target = null;
  private String type = null;
  private String status = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("confidence")
  public String getConfidence() {
    return confidence;
  }
  public void setConfidence(String confidence) {
    this.confidence = confidence;
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("pos")
  public String getPos() {
    return pos;
  }
  public void setPos(String pos) {
    this.pos = pos;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("targetPos")
  public String getTargetPos() {
    return targetPos;
  }
  public void setTargetPos(String targetPos) {
    this.targetPos = targetPos;
  }

  
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
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntryAddOutput {\n");
    
    sb.append("  confidence: ").append(confidence).append("\n");
    sb.append("  sourceId: ").append(sourceId).append("\n");
    sb.append("  targetId: ").append(targetId).append("\n");
    sb.append("  pos: ").append(pos).append("\n");
    sb.append("  targetPos: ").append(targetPos).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("  target: ").append(target).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
