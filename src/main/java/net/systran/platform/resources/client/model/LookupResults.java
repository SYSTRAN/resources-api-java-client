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

import net.systran.platform.resources.client.model.LookupOutputObject;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class LookupResults  {
  
  private LookupOutputObject output = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("output")
  public LookupOutputObject getOutput() {
    return output;
  }
  public void setOutput(LookupOutputObject output) {
    this.output = output;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookupResults {\n");
    
    sb.append("  output: ").append(output).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
