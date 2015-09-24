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

import net.systran.platform.resources.client.model.CorpusMatch;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class CorpusMatches  {
  
  private String form = null;
  private List<CorpusMatch> matches = new ArrayList<CorpusMatch>() ;

  
  /**
   * Searched form
   **/
  @ApiModelProperty(required = true, value = "Searched form")
  @JsonProperty("form")
  public String getForm() {
    return form;
  }
  public void setForm(String form) {
    this.form = form;
  }

  
  /**
   * List of matches
   **/
  @ApiModelProperty(required = true, value = "List of matches")
  @JsonProperty("matches")
  public List<CorpusMatch> getMatches() {
    return matches;
  }
  public void setMatches(List<CorpusMatch> matches) {
    this.matches = matches;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorpusMatches {\n");
    
    sb.append("  form: ").append(form).append("\n");
    sb.append("  matches: ").append(matches).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
