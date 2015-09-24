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

import net.systran.platform.resources.client.model.LookupExpressionObject;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class LookupTargetObject  {
  
  private String context = null;
  private String domain = null;
  private String entryId = null;
  private List<LookupExpressionObject> expressions = new ArrayList<LookupExpressionObject>() ;
  private List<String> invmeanings = new ArrayList<String>() ;
  private String lemma = null;
  private String rank = null;
  private String synonym = null;
  private String variant = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("context")
  public String getContext() {
    return context;
  }
  public void setContext(String context) {
    this.context = context;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("entry_id")
  public String getEntryId() {
    return entryId;
  }
  public void setEntryId(String entryId) {
    this.entryId = entryId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("expressions")
  public List<LookupExpressionObject> getExpressions() {
    return expressions;
  }
  public void setExpressions(List<LookupExpressionObject> expressions) {
    this.expressions = expressions;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("invmeanings")
  public List<String> getInvmeanings() {
    return invmeanings;
  }
  public void setInvmeanings(List<String> invmeanings) {
    this.invmeanings = invmeanings;
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
  @JsonProperty("rank")
  public String getRank() {
    return rank;
  }
  public void setRank(String rank) {
    this.rank = rank;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("synonym")
  public String getSynonym() {
    return synonym;
  }
  public void setSynonym(String synonym) {
    this.synonym = synonym;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("variant")
  public String getVariant() {
    return variant;
  }
  public void setVariant(String variant) {
    this.variant = variant;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookupTargetObject {\n");
    
    sb.append("  context: ").append(context).append("\n");
    sb.append("  domain: ").append(domain).append("\n");
    sb.append("  entryId: ").append(entryId).append("\n");
    sb.append("  expressions: ").append(expressions).append("\n");
    sb.append("  invmeanings: ").append(invmeanings).append("\n");
    sb.append("  lemma: ").append(lemma).append("\n");
    sb.append("  rank: ").append(rank).append("\n");
    sb.append("  synonym: ").append(synonym).append("\n");
    sb.append("  variant: ").append(variant).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
