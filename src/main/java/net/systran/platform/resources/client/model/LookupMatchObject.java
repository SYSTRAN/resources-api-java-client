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

import net.systran.platform.resources.client.model.LookupOtherExpression;
import net.systran.platform.resources.client.model.LookupTargetObject;
import java.util.*;
import net.systran.platform.resources.client.model.LookupSourceObject;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class LookupMatchObject  {
  
  private Boolean autoComplete = null;
  private String modelName = null;
  private LookupSourceObject source = null;
  private LookupTargetObject target = null;
  private List<LookupOtherExpression> otherExpressions = new ArrayList<LookupOtherExpression>() ;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("auto_complete")
  public Boolean getAutoComplete() {
    return autoComplete;
  }
  public void setAutoComplete(Boolean autoComplete) {
    this.autoComplete = autoComplete;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("model_name")
  public String getModelName() {
    return modelName;
  }
  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("source")
  public LookupSourceObject getSource() {
    return source;
  }
  public void setSource(LookupSourceObject source) {
    this.source = source;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("target")
  public LookupTargetObject getTarget() {
    return target;
  }
  public void setTarget(LookupTargetObject target) {
    this.target = target;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("other_expressions")
  public List<LookupOtherExpression> getOtherExpressions() {
    return otherExpressions;
  }
  public void setOtherExpressions(List<LookupOtherExpression> otherExpressions) {
    this.otherExpressions = otherExpressions;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookupMatchObject {\n");
    
    sb.append("  autoComplete: ").append(autoComplete).append("\n");
    sb.append("  modelName: ").append(modelName).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("  target: ").append(target).append("\n");
    sb.append("  otherExpressions: ").append(otherExpressions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
