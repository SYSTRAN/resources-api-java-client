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

import net.systran.platform.resources.client.model.DictionaryOutput;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class DictionariesListResponse  {
  
  private Integer totalNoLimit = null;
  private List<DictionaryOutput> dictionaries = new ArrayList<DictionaryOutput>() ;

  
  /**
   * Number of dictionaries without skip/limit filter
   **/
  @ApiModelProperty(value = "Number of dictionaries without skip/limit filter")
  @JsonProperty("totalNoLimit")
  public Integer getTotalNoLimit() {
    return totalNoLimit;
  }
  public void setTotalNoLimit(Integer totalNoLimit) {
    this.totalNoLimit = totalNoLimit;
  }

  
  /**
   * List of dictionaries
   **/
  @ApiModelProperty(value = "List of dictionaries")
  @JsonProperty("dictionaries")
  public List<DictionaryOutput> getDictionaries() {
    return dictionaries;
  }
  public void setDictionaries(List<DictionaryOutput> dictionaries) {
    this.dictionaries = dictionaries;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionariesListResponse {\n");
    
    sb.append("  totalNoLimit: ").append(totalNoLimit).append("\n");
    sb.append("  dictionaries: ").append(dictionaries).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
