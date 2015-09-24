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
public class CorpusSegmentUpdateResponse  {
  
  private Boolean updated = null;

  
  /**
   * Segment updated
   **/
  @ApiModelProperty(required = true, value = "Segment updated")
  @JsonProperty("updated")
  public Boolean getUpdated() {
    return updated;
  }
  public void setUpdated(Boolean updated) {
    this.updated = updated;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorpusSegmentUpdateResponse {\n");
    
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
