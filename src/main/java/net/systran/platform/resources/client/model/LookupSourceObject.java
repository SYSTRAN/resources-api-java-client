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
public class LookupSourceObject  {
  
  private String inflection = null;
  private String info = null;
  private String lemma = null;
  private String phonetic = null;
  private String pos = null;
  private String term = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("inflection")
  public String getInflection() {
    return inflection;
  }
  public void setInflection(String inflection) {
    this.inflection = inflection;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("info")
  public String getInfo() {
    return info;
  }
  public void setInfo(String info) {
    this.info = info;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lemma")
  public String getLemma() {
    return lemma;
  }
  public void setLemma(String lemma) {
    this.lemma = lemma;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("phonetic")
  public String getPhonetic() {
    return phonetic;
  }
  public void setPhonetic(String phonetic) {
    this.phonetic = phonetic;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("pos")
  public String getPos() {
    return pos;
  }
  public void setPos(String pos) {
    this.pos = pos;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("term")
  public String getTerm() {
    return term;
  }
  public void setTerm(String term) {
    this.term = term;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookupSourceObject {\n");
    
    sb.append("  inflection: ").append(inflection).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("  lemma: ").append(lemma).append("\n");
    sb.append("  phonetic: ").append(phonetic).append("\n");
    sb.append("  pos: ").append(pos).append("\n");
    sb.append("  term: ").append(term).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
