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

/**
 * Corpus match
 **/
@ApiModel(description = "Corpus match")
public class CorpusMatch  {
  
  private String source = null;
  private String target = null;
  private Double score = null;
  private Double penalty = null;
  private String align = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("target")
  public String getTarget() {
    return target;
  }
  public void setTarget(String target) {
    this.target = target;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("score")
  public Double getScore() {
    return score;
  }
  public void setScore(Double score) {
    this.score = score;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("penalty")
  public Double getPenalty() {
    return penalty;
  }
  public void setPenalty(Double penalty) {
    this.penalty = penalty;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("align")
  public String getAlign() {
    return align;
  }
  public void setAlign(String align) {
    this.align = align;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorpusMatch {\n");
    
    sb.append("  source: ").append(source).append("\n");
    sb.append("  target: ").append(target).append("\n");
    sb.append("  score: ").append(score).append("\n");
    sb.append("  penalty: ").append(penalty).append("\n");
    sb.append("  align: ").append(align).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
