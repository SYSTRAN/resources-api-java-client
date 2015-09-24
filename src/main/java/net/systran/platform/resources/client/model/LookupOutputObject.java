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

import net.systran.platform.resources.client.model.LookupMatchObject;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Output for a word
 **/
@ApiModel(description = "Output for a word")
public class LookupOutputObject  {
  
  private Boolean autoComplete = null;
  private Boolean sDictSeach = null;
  private List<LookupMatchObject> matches = new ArrayList<LookupMatchObject>() ;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("autoComplete")
  public Boolean getAutoComplete() {
    return autoComplete;
  }
  public void setAutoComplete(Boolean autoComplete) {
    this.autoComplete = autoComplete;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("sDictSeach")
  public Boolean getSDictSeach() {
    return sDictSeach;
  }
  public void setSDictSeach(Boolean sDictSeach) {
    this.sDictSeach = sDictSeach;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("matches")
  public List<LookupMatchObject> getMatches() {
    return matches;
  }
  public void setMatches(List<LookupMatchObject> matches) {
    this.matches = matches;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookupOutputObject {\n");
    
    sb.append("  autoComplete: ").append(autoComplete).append("\n");
    sb.append("  sDictSeach: ").append(sDictSeach).append("\n");
    sb.append("  matches: ").append(matches).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
