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

import net.systran.platform.resources.client.model.CorpusSegmentTarget;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class CorpusSegment  {
  
  private String id = null;
  private String lang = null;
  private String source = null;
  private List<CorpusSegmentTarget> targets = new ArrayList<CorpusSegmentTarget>() ;

  
  /**
   * Identifier
   **/
  @ApiModelProperty(required = true, value = "Identifier")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
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
   * List of target texts
   **/
  @ApiModelProperty(required = true, value = "List of target texts")
  @JsonProperty("targets")
  public List<CorpusSegmentTarget> getTargets() {
    return targets;
  }
  public void setTargets(List<CorpusSegmentTarget> targets) {
    this.targets = targets;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorpusSegment {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  lang: ").append(lang).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("  targets: ").append(targets).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
