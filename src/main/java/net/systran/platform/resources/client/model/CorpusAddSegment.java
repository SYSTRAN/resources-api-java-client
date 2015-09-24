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

import net.systran.platform.resources.client.model.CorpusAddSegmentTarget;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class CorpusAddSegment  {
  
  private String lang = null;
  private String source = null;
  private List<CorpusAddSegmentTarget> targets = new ArrayList<CorpusAddSegmentTarget>() ;

  
  /**
   * Language
   **/
  @ApiModelProperty(required = true, value = "Language")
  @JsonProperty("lang")
  public String getLang() {
    return lang;
  }
  public void setLang(String lang) {
    this.lang = lang;
  }

  
  /**
   * Source text
   **/
  @ApiModelProperty(required = true, value = "Source text")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  
  /**
   * List of targets
   **/
  @ApiModelProperty(required = true, value = "List of targets")
  @JsonProperty("targets")
  public List<CorpusAddSegmentTarget> getTargets() {
    return targets;
  }
  public void setTargets(List<CorpusAddSegmentTarget> targets) {
    this.targets = targets;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorpusAddSegment {\n");
    
    sb.append("  lang: ").append(lang).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("  targets: ").append(targets).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
