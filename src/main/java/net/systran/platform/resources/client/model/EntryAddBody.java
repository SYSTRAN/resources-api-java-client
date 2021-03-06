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

import net.systran.platform.resources.client.model.EntryAddInput;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class EntryAddBody  {
  
  private EntryAddInput entry = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("entry")
  public EntryAddInput getEntry() {
    return entry;
  }
  public void setEntry(EntryAddInput entry) {
    this.entry = entry;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntryAddBody {\n");
    
    sb.append("  entry: ").append(entry).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
