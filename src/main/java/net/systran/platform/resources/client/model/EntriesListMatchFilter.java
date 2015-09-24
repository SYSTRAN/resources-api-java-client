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
public class EntriesListMatchFilter  {
  
  private List<String> inSource = new ArrayList<String>() ;
  private List<String> ninSource = new ArrayList<String>() ;
  private String regexSource = null;
  private List<String> inTarget = new ArrayList<String>() ;
  private List<String> ninTarget = new ArrayList<String>() ;
  private String regexTarget = null;
  private List<String> inPartOfSpeech = new ArrayList<String>() ;
  private List<String> ninPartOfSpeech = new ArrayList<String>() ;
  private String regexComments = null;
  private List<String> inTargetLang = new ArrayList<String>() ;
  private List<String> ninTargetLang = new ArrayList<String>() ;
  private Integer minPriority = null;
  private Integer maxPriority = null;
  private List<Integer> inPriority = new ArrayList<Integer>() ;
  private List<Integer> ninPriority = new ArrayList<Integer>() ;
  private Integer minSourceConfidence = null;
  private Integer maxSourceConfidence = null;
  private List<Integer> inSourceConfidence = new ArrayList<Integer>() ;
  private List<Integer> ninSourceConfidence = new ArrayList<Integer>() ;
  private Integer minTargetConfidence = null;
  private Integer maxTargetConfidence = null;
  private List<Integer> inTargetConfidence = new ArrayList<Integer>() ;
  private List<Integer> ninTargetConfidence = new ArrayList<Integer>() ;

  
  /**
   * Match all entries with source present in a subset of values
   **/
  @ApiModelProperty(value = "Match all entries with source present in a subset of values")
  @JsonProperty("inSource")
  public List<String> getInSource() {
    return inSource;
  }
  public void setInSource(List<String> inSource) {
    this.inSource = inSource;
  }

  
  /**
   * Match all entries with source not present in a subset of values
   **/
  @ApiModelProperty(value = "Match all entries with source not present in a subset of values")
  @JsonProperty("ninSource")
  public List<String> getNinSource() {
    return ninSource;
  }
  public void setNinSource(List<String> ninSource) {
    this.ninSource = ninSource;
  }

  
  /**
   * Match all entries with source containing the specified value
   **/
  @ApiModelProperty(value = "Match all entries with source containing the specified value")
  @JsonProperty("regexSource")
  public String getRegexSource() {
    return regexSource;
  }
  public void setRegexSource(String regexSource) {
    this.regexSource = regexSource;
  }

  
  /**
   * Match all entries with target present in a subset of values
   **/
  @ApiModelProperty(value = "Match all entries with target present in a subset of values")
  @JsonProperty("inTarget")
  public List<String> getInTarget() {
    return inTarget;
  }
  public void setInTarget(List<String> inTarget) {
    this.inTarget = inTarget;
  }

  
  /**
   * Match all entries with target not present in a subset of values
   **/
  @ApiModelProperty(value = "Match all entries with target not present in a subset of values")
  @JsonProperty("ninTarget")
  public List<String> getNinTarget() {
    return ninTarget;
  }
  public void setNinTarget(List<String> ninTarget) {
    this.ninTarget = ninTarget;
  }

  
  /**
   * Match all entries with target containing the specified value
   **/
  @ApiModelProperty(value = "Match all entries with target containing the specified value")
  @JsonProperty("regexTarget")
  public String getRegexTarget() {
    return regexTarget;
  }
  public void setRegexTarget(String regexTarget) {
    this.regexTarget = regexTarget;
  }

  
  /**
   * Match all entries with part of speech present in a subset of values
   **/
  @ApiModelProperty(value = "Match all entries with part of speech present in a subset of values")
  @JsonProperty("inPartOfSpeech")
  public List<String> getInPartOfSpeech() {
    return inPartOfSpeech;
  }
  public void setInPartOfSpeech(List<String> inPartOfSpeech) {
    this.inPartOfSpeech = inPartOfSpeech;
  }

  
  /**
   * Match all entries with part of speech not present in a subset of values
   **/
  @ApiModelProperty(value = "Match all entries with part of speech not present in a subset of values")
  @JsonProperty("ninPartOfSpeech")
  public List<String> getNinPartOfSpeech() {
    return ninPartOfSpeech;
  }
  public void setNinPartOfSpeech(List<String> ninPartOfSpeech) {
    this.ninPartOfSpeech = ninPartOfSpeech;
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
   * Match all entries with target lang present in a subset of values
   **/
  @ApiModelProperty(value = "Match all entries with target lang present in a subset of values")
  @JsonProperty("inTargetLang")
  public List<String> getInTargetLang() {
    return inTargetLang;
  }
  public void setInTargetLang(List<String> inTargetLang) {
    this.inTargetLang = inTargetLang;
  }

  
  /**
   * Match all entries with target lang not present in a subset of values
   **/
  @ApiModelProperty(value = "Match all entries with target lang not present in a subset of values")
  @JsonProperty("ninTargetLang")
  public List<String> getNinTargetLang() {
    return ninTargetLang;
  }
  public void setNinTargetLang(List<String> ninTargetLang) {
    this.ninTargetLang = ninTargetLang;
  }

  
  /**
   * Match all entries with priority equal and over specified value
   **/
  @ApiModelProperty(value = "Match all entries with priority equal and over specified value")
  @JsonProperty("minPriority")
  public Integer getMinPriority() {
    return minPriority;
  }
  public void setMinPriority(Integer minPriority) {
    this.minPriority = minPriority;
  }

  
  /**
   * Match all entries with priority under and equal specified value
   **/
  @ApiModelProperty(value = "Match all entries with priority under and equal specified value")
  @JsonProperty("maxPriority")
  public Integer getMaxPriority() {
    return maxPriority;
  }
  public void setMaxPriority(Integer maxPriority) {
    this.maxPriority = maxPriority;
  }

  
  /**
   * Match all entries with priority present in a subset of values
   **/
  @ApiModelProperty(value = "Match all entries with priority present in a subset of values")
  @JsonProperty("inPriority")
  public List<Integer> getInPriority() {
    return inPriority;
  }
  public void setInPriority(List<Integer> inPriority) {
    this.inPriority = inPriority;
  }

  
  /**
   * Match all entries with priority not present in a subset of values
   **/
  @ApiModelProperty(value = "Match all entries with priority not present in a subset of values")
  @JsonProperty("ninPriority")
  public List<Integer> getNinPriority() {
    return ninPriority;
  }
  public void setNinPriority(List<Integer> ninPriority) {
    this.ninPriority = ninPriority;
  }

  
  /**
   * Match all entries with source confidence equal and over specified value
   **/
  @ApiModelProperty(value = "Match all entries with source confidence equal and over specified value")
  @JsonProperty("minSourceConfidence")
  public Integer getMinSourceConfidence() {
    return minSourceConfidence;
  }
  public void setMinSourceConfidence(Integer minSourceConfidence) {
    this.minSourceConfidence = minSourceConfidence;
  }

  
  /**
   * Match all entries with source confidence under and equal specified value
   **/
  @ApiModelProperty(value = "Match all entries with source confidence under and equal specified value")
  @JsonProperty("maxSourceConfidence")
  public Integer getMaxSourceConfidence() {
    return maxSourceConfidence;
  }
  public void setMaxSourceConfidence(Integer maxSourceConfidence) {
    this.maxSourceConfidence = maxSourceConfidence;
  }

  
  /**
   * Match all entries with sourceConfidence present in a subset of values
   **/
  @ApiModelProperty(value = "Match all entries with sourceConfidence present in a subset of values")
  @JsonProperty("inSourceConfidence")
  public List<Integer> getInSourceConfidence() {
    return inSourceConfidence;
  }
  public void setInSourceConfidence(List<Integer> inSourceConfidence) {
    this.inSourceConfidence = inSourceConfidence;
  }

  
  /**
   * Match all entries with sourceConfidence not present in a subset of values
   **/
  @ApiModelProperty(value = "Match all entries with sourceConfidence not present in a subset of values")
  @JsonProperty("ninSourceConfidence")
  public List<Integer> getNinSourceConfidence() {
    return ninSourceConfidence;
  }
  public void setNinSourceConfidence(List<Integer> ninSourceConfidence) {
    this.ninSourceConfidence = ninSourceConfidence;
  }

  
  /**
   * Match all entries with target confidence equal and over specified value
   **/
  @ApiModelProperty(value = "Match all entries with target confidence equal and over specified value")
  @JsonProperty("minTargetConfidence")
  public Integer getMinTargetConfidence() {
    return minTargetConfidence;
  }
  public void setMinTargetConfidence(Integer minTargetConfidence) {
    this.minTargetConfidence = minTargetConfidence;
  }

  
  /**
   * Match all entries with target confidence under and equal specified value
   **/
  @ApiModelProperty(value = "Match all entries with target confidence under and equal specified value")
  @JsonProperty("maxTargetConfidence")
  public Integer getMaxTargetConfidence() {
    return maxTargetConfidence;
  }
  public void setMaxTargetConfidence(Integer maxTargetConfidence) {
    this.maxTargetConfidence = maxTargetConfidence;
  }

  
  /**
   * Match all entries with targetConfidence present in a subset of values
   **/
  @ApiModelProperty(value = "Match all entries with targetConfidence present in a subset of values")
  @JsonProperty("inTargetConfidence")
  public List<Integer> getInTargetConfidence() {
    return inTargetConfidence;
  }
  public void setInTargetConfidence(List<Integer> inTargetConfidence) {
    this.inTargetConfidence = inTargetConfidence;
  }

  
  /**
   * Match all entries with targetConfidence not present in a subset of values
   **/
  @ApiModelProperty(value = "Match all entries with targetConfidence not present in a subset of values")
  @JsonProperty("ninTargetConfidence")
  public List<Integer> getNinTargetConfidence() {
    return ninTargetConfidence;
  }
  public void setNinTargetConfidence(List<Integer> ninTargetConfidence) {
    this.ninTargetConfidence = ninTargetConfidence;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntriesListMatchFilter {\n");
    
    sb.append("  inSource: ").append(inSource).append("\n");
    sb.append("  ninSource: ").append(ninSource).append("\n");
    sb.append("  regexSource: ").append(regexSource).append("\n");
    sb.append("  inTarget: ").append(inTarget).append("\n");
    sb.append("  ninTarget: ").append(ninTarget).append("\n");
    sb.append("  regexTarget: ").append(regexTarget).append("\n");
    sb.append("  inPartOfSpeech: ").append(inPartOfSpeech).append("\n");
    sb.append("  ninPartOfSpeech: ").append(ninPartOfSpeech).append("\n");
    sb.append("  regexComments: ").append(regexComments).append("\n");
    sb.append("  inTargetLang: ").append(inTargetLang).append("\n");
    sb.append("  ninTargetLang: ").append(ninTargetLang).append("\n");
    sb.append("  minPriority: ").append(minPriority).append("\n");
    sb.append("  maxPriority: ").append(maxPriority).append("\n");
    sb.append("  inPriority: ").append(inPriority).append("\n");
    sb.append("  ninPriority: ").append(ninPriority).append("\n");
    sb.append("  minSourceConfidence: ").append(minSourceConfidence).append("\n");
    sb.append("  maxSourceConfidence: ").append(maxSourceConfidence).append("\n");
    sb.append("  inSourceConfidence: ").append(inSourceConfidence).append("\n");
    sb.append("  ninSourceConfidence: ").append(ninSourceConfidence).append("\n");
    sb.append("  minTargetConfidence: ").append(minTargetConfidence).append("\n");
    sb.append("  maxTargetConfidence: ").append(maxTargetConfidence).append("\n");
    sb.append("  inTargetConfidence: ").append(inTargetConfidence).append("\n");
    sb.append("  ninTargetConfidence: ").append(ninTargetConfidence).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
