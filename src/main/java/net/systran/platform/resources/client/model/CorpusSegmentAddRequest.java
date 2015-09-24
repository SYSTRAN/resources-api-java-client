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

import net.systran.platform.resources.client.model.CorpusAddSegment;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class CorpusSegmentAddRequest  {
  
  private String corpusId = null;
  private List<CorpusAddSegment> segments = new ArrayList<CorpusAddSegment>() ;

  
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
   * List of segments to add
   **/
  @ApiModelProperty(required = true, value = "List of segments to add")
  @JsonProperty("segments")
  public List<CorpusAddSegment> getSegments() {
    return segments;
  }
  public void setSegments(List<CorpusAddSegment> segments) {
    this.segments = segments;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorpusSegmentAddRequest {\n");
    
    sb.append("  corpusId: ").append(corpusId).append("\n");
    sb.append("  segments: ").append(segments).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
