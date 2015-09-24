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

import net.systran.platform.resources.client.model.EntriesListSortFilter;
import net.systran.platform.resources.client.model.EntriesListMatchFilter;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class EntriesListFilters  {
  
  private Integer skip = null;
  private Integer limit = null;
  private EntriesListSortFilter sort = null;
  private EntriesListMatchFilter match = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("skip")
  public Integer getSkip() {
    return skip;
  }
  public void setSkip(Integer skip) {
    this.skip = skip;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("sort")
  public EntriesListSortFilter getSort() {
    return sort;
  }
  public void setSort(EntriesListSortFilter sort) {
    this.sort = sort;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("match")
  public EntriesListMatchFilter getMatch() {
    return match;
  }
  public void setMatch(EntriesListMatchFilter match) {
    this.match = match;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntriesListFilters {\n");
    
    sb.append("  skip: ").append(skip).append("\n");
    sb.append("  limit: ").append(limit).append("\n");
    sb.append("  sort: ").append(sort).append("\n");
    sb.append("  match: ").append(match).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
