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

import net.systran.platform.resources.client.model.LookupResults;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class LookupResponse  {
  
  private String warning = null;
  private String error = null;
  private List<LookupResults> outputs = new ArrayList<LookupResults>() ;

  
  /**
   * Warning at request level
   **/
  @ApiModelProperty(value = "Warning at request level")
  @JsonProperty("warning")
  public String getWarning() {
    return warning;
  }
  public void setWarning(String warning) {
    this.warning = warning;
  }

  
  /**
   * Error at request level
   **/
  @ApiModelProperty(value = "Error at request level")
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  
  /**
   * Array of lookup result
   **/
  @ApiModelProperty(value = "Array of lookup result")
  @JsonProperty("outputs")
  public List<LookupResults> getOutputs() {
    return outputs;
  }
  public void setOutputs(List<LookupResults> outputs) {
    this.outputs = outputs;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookupResponse {\n");
    
    sb.append("  warning: ").append(warning).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("  outputs: ").append(outputs).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
