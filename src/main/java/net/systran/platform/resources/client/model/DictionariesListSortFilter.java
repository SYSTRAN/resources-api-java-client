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
public class DictionariesListSortFilter  {
  
  private Integer nbEntries = null;
  private Integer comments = null;
  private Integer name = null;
  private Integer sourceLang = null;
  private Integer targetLangs = null;

  
  /**
   * 1/-1 for ascending/descending order on nbEntries field
   **/
  @ApiModelProperty(value = "1/-1 for ascending/descending order on nbEntries field")
  @JsonProperty("nbEntries")
  public Integer getNbEntries() {
    return nbEntries;
  }
  public void setNbEntries(Integer nbEntries) {
    this.nbEntries = nbEntries;
  }

  
  /**
   * 1/-1 for ascending/descending order on comments field
   **/
  @ApiModelProperty(value = "1/-1 for ascending/descending order on comments field")
  @JsonProperty("comments")
  public Integer getComments() {
    return comments;
  }
  public void setComments(Integer comments) {
    this.comments = comments;
  }

  
  /**
   * 1/-1 for ascending/descending order on name field
   **/
  @ApiModelProperty(value = "1/-1 for ascending/descending order on name field")
  @JsonProperty("name")
  public Integer getName() {
    return name;
  }
  public void setName(Integer name) {
    this.name = name;
  }

  
  /**
   * 1/-1 for ascending/descending order on sourceLang field
   **/
  @ApiModelProperty(value = "1/-1 for ascending/descending order on sourceLang field")
  @JsonProperty("sourceLang")
  public Integer getSourceLang() {
    return sourceLang;
  }
  public void setSourceLang(Integer sourceLang) {
    this.sourceLang = sourceLang;
  }

  
  /**
   * 1/-1 for ascending/descending order on targetLangs field
   **/
  @ApiModelProperty(value = "1/-1 for ascending/descending order on targetLangs field")
  @JsonProperty("targetLangs")
  public Integer getTargetLangs() {
    return targetLangs;
  }
  public void setTargetLangs(Integer targetLangs) {
    this.targetLangs = targetLangs;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionariesListSortFilter {\n");
    
    sb.append("  nbEntries: ").append(nbEntries).append("\n");
    sb.append("  comments: ").append(comments).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  sourceLang: ").append(sourceLang).append("\n");
    sb.append("  targetLangs: ").append(targetLangs).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
