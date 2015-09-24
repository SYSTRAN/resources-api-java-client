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


@ApiModel(description = "")
public class CorpusSegmentAddResponse  {
  
  private List<String> segments = new ArrayList<String>() ;

  
  /**
   * List of added segments ids
   **/
  @ApiModelProperty(required = true, value = "List of added segments ids")
  @JsonProperty("segments")
  public List<String> getSegments() {
    return segments;
  }
  public void setSegments(List<String> segments) {
    this.segments = segments;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorpusSegmentAddResponse {\n");
    
    sb.append("  segments: ").append(segments).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
