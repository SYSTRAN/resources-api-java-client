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
public class DictionariesImportResponse  {
  
  private Integer duplicates = null;
  private Integer inserted = null;
  private Integer total = null;

  
  /**
   * Number of entries that was already present in the dictionary
   **/
  @ApiModelProperty(value = "Number of entries that was already present in the dictionary")
  @JsonProperty("duplicates")
  public Integer getDuplicates() {
    return duplicates;
  }
  public void setDuplicates(Integer duplicates) {
    this.duplicates = duplicates;
  }

  
  /**
   * Number of entries succesfully inserted
   **/
  @ApiModelProperty(value = "Number of entries succesfully inserted")
  @JsonProperty("inserted")
  public Integer getInserted() {
    return inserted;
  }
  public void setInserted(Integer inserted) {
    this.inserted = inserted;
  }

  
  /**
   * Number of entries processed
   **/
  @ApiModelProperty(value = "Number of entries processed")
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionariesImportResponse {\n");
    
    sb.append("  duplicates: ").append(duplicates).append("\n");
    sb.append("  inserted: ").append(inserted).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
