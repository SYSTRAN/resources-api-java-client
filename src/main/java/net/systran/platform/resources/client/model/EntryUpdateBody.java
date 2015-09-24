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

import net.systran.platform.resources.client.model.EntryUpdateInput;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class EntryUpdateBody  {
  
  private String sourceId = null;
  private String targetId = null;
  private EntryUpdateInput update = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("update")
  public EntryUpdateInput getUpdate() {
    return update;
  }
  public void setUpdate(EntryUpdateInput update) {
    this.update = update;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntryUpdateBody {\n");
    
    sb.append("  sourceId: ").append(sourceId).append("\n");
    sb.append("  targetId: ").append(targetId).append("\n");
    sb.append("  update: ").append(update).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
