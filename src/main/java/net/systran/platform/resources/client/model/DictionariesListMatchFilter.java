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

import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class DictionariesListMatchFilter  {
  
  private List<String> inSourceLang = new ArrayList<String>() ;
  private List<String> ninSourceLang = new ArrayList<String>() ;
  private List<String> inTargetLangs = new ArrayList<String>() ;
  private String regexComments = null;
  private List<Integer> inNbEntries = new ArrayList<Integer>() ;
  private List<Integer> ninNbEntries = new ArrayList<Integer>() ;
  private Integer minNbEntries = null;
  private Integer maxNbEntries = null;
  private List<String> inName = new ArrayList<String>() ;
  private List<String> ninName = new ArrayList<String>() ;
  private String regexName = null;

  
  /**
   * Match all dictionaries with sourceLang present in a subset of values
   **/
  @ApiModelProperty(value = "Match all dictionaries with sourceLang present in a subset of values")
  @JsonProperty("inSourceLang")
  public List<String> getInSourceLang() {
    return inSourceLang;
  }
  public void setInSourceLang(List<String> inSourceLang) {
    this.inSourceLang = inSourceLang;
  }

  
  /**
   * Match all dictionaries with sourceLang not present in a subset of values
   **/
  @ApiModelProperty(value = "Match all dictionaries with sourceLang not present in a subset of values")
  @JsonProperty("ninSourceLang")
  public List<String> getNinSourceLang() {
    return ninSourceLang;
  }
  public void setNinSourceLang(List<String> ninSourceLang) {
    this.ninSourceLang = ninSourceLang;
  }

  
  /**
   * Match all dictionaries with targetLang from a subset of values present in targetLangs property
   **/
  @ApiModelProperty(value = "Match all dictionaries with targetLang from a subset of values present in targetLangs property")
  @JsonProperty("inTargetLangs")
  public List<String> getInTargetLangs() {
    return inTargetLangs;
  }
  public void setInTargetLangs(List<String> inTargetLangs) {
    this.inTargetLangs = inTargetLangs;
  }

  
  /**
   * Match all entries with comments containing the specified value
   **/
  @ApiModelProperty(value = "Match all entries with comments containing the specified value")
  @JsonProperty("regexComments")
  public String getRegexComments() {
    return regexComments;
  }
  public void setRegexComments(String regexComments) {
    this.regexComments = regexComments;
  }

  
  /**
   * Match all dictionaries with nbEntries present in a subset of values
   **/
  @ApiModelProperty(value = "Match all dictionaries with nbEntries present in a subset of values")
  @JsonProperty("inNbEntries")
  public List<Integer> getInNbEntries() {
    return inNbEntries;
  }
  public void setInNbEntries(List<Integer> inNbEntries) {
    this.inNbEntries = inNbEntries;
  }

  
  /**
   * Match all dictionaries with nbEntries not present in a subset of values
   **/
  @ApiModelProperty(value = "Match all dictionaries with nbEntries not present in a subset of values")
  @JsonProperty("ninNbEntries")
  public List<Integer> getNinNbEntries() {
    return ninNbEntries;
  }
  public void setNinNbEntries(List<Integer> ninNbEntries) {
    this.ninNbEntries = ninNbEntries;
  }

  
  /**
   * Match all entries with nbEntries equal and over specified value
   **/
  @ApiModelProperty(value = "Match all entries with nbEntries equal and over specified value")
  @JsonProperty("minNbEntries")
  public Integer getMinNbEntries() {
    return minNbEntries;
  }
  public void setMinNbEntries(Integer minNbEntries) {
    this.minNbEntries = minNbEntries;
  }

  
  /**
   * Match all entries with nbEntries under and equal specified value
   **/
  @ApiModelProperty(value = "Match all entries with nbEntries under and equal specified value")
  @JsonProperty("maxNbEntries")
  public Integer getMaxNbEntries() {
    return maxNbEntries;
  }
  public void setMaxNbEntries(Integer maxNbEntries) {
    this.maxNbEntries = maxNbEntries;
  }

  
  /**
   * Match all entries with name present in a subset of values
   **/
  @ApiModelProperty(value = "Match all entries with name present in a subset of values")
  @JsonProperty("inName")
  public List<String> getInName() {
    return inName;
  }
  public void setInName(List<String> inName) {
    this.inName = inName;
  }

  
  /**
   * Match all entries with name not present in a subset of values
   **/
  @ApiModelProperty(value = "Match all entries with name not present in a subset of values")
  @JsonProperty("ninName")
  public List<String> getNinName() {
    return ninName;
  }
  public void setNinName(List<String> ninName) {
    this.ninName = ninName;
  }

  
  /**
   * Match all entries with name containing the specified value
   **/
  @ApiModelProperty(value = "Match all entries with name containing the specified value")
  @JsonProperty("regexName")
  public String getRegexName() {
    return regexName;
  }
  public void setRegexName(String regexName) {
    this.regexName = regexName;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionariesListMatchFilter {\n");
    
    sb.append("  inSourceLang: ").append(inSourceLang).append("\n");
    sb.append("  ninSourceLang: ").append(ninSourceLang).append("\n");
    sb.append("  inTargetLangs: ").append(inTargetLangs).append("\n");
    sb.append("  regexComments: ").append(regexComments).append("\n");
    sb.append("  inNbEntries: ").append(inNbEntries).append("\n");
    sb.append("  ninNbEntries: ").append(ninNbEntries).append("\n");
    sb.append("  minNbEntries: ").append(minNbEntries).append("\n");
    sb.append("  maxNbEntries: ").append(maxNbEntries).append("\n");
    sb.append("  inName: ").append(inName).append("\n");
    sb.append("  ninName: ").append(ninName).append("\n");
    sb.append("  regexName: ").append(regexName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
