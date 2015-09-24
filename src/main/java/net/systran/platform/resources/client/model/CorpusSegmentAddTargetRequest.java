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

import net.systran.platform.resources.client.model.CorpusAddSegmentTarget;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class CorpusSegmentAddTargetRequest  {
  
  private String corpusId = null;
  private String segId = null;
  private List<CorpusAddSegmentTarget> targets = new ArrayList<CorpusAddSegmentTarget>() ;

  
  /**
   * Corpus identifier
   **/
  @ApiModelProperty(required = true, value = "Corpus identifier")
  @JsonProperty("corpusId")
  public String getCorpusId() {
    return corpusId;
  }
  public void setCorpusId(String corpusId) {
    this.corpusId = corpusId;
  }

  
  /**
   * Segment identifier
   **/
  @ApiModelProperty(required = true, value = "Segment identifier")
  @JsonProperty("segId")
  public String getSegId() {
    return segId;
  }
  public void setSegId(String segId) {
    this.segId = segId;
  }

  
  /**
   * List of targets
   **/
  @ApiModelProperty(required = true, value = "List of targets")
  @JsonProperty("targets")
  public List<CorpusAddSegmentTarget> getTargets() {
    return targets;
  }
  public void setTargets(List<CorpusAddSegmentTarget> targets) {
    this.targets = targets;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorpusSegmentAddTargetRequest {\n");
    
    sb.append("  corpusId: ").append(corpusId).append("\n");
    sb.append("  segId: ").append(segId).append("\n");
    sb.append("  targets: ").append(targets).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
