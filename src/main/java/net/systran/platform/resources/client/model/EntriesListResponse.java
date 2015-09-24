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
import net.systran.platform.resources.client.model.EntryOutput;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class EntriesListResponse  {
  
  private Integer totalNoLimit = null;
  private List<EntryOutput> entries = new ArrayList<EntryOutput>() ;

  
  /**
   * Number of entries without skip/limit filter
   **/
  @ApiModelProperty(value = "Number of entries without skip/limit filter")
  @JsonProperty("totalNoLimit")
  public Integer getTotalNoLimit() {
    return totalNoLimit;
  }
  public void setTotalNoLimit(Integer totalNoLimit) {
    this.totalNoLimit = totalNoLimit;
  }

  
  /**
   * List of entries
   **/
  @ApiModelProperty(value = "List of entries")
  @JsonProperty("entries")
  public List<EntryOutput> getEntries() {
    return entries;
  }
  public void setEntries(List<EntryOutput> entries) {
    this.entries = entries;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntriesListResponse {\n");
    
    sb.append("  totalNoLimit: ").append(totalNoLimit).append("\n");
    sb.append("  entries: ").append(entries).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
