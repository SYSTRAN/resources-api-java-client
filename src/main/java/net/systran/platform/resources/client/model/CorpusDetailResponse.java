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

import net.systran.platform.resources.client.model.Corpus;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class CorpusDetailResponse  {
  
  private Corpus corpus = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("corpus")
  public Corpus getCorpus() {
    return corpus;
  }
  public void setCorpus(Corpus corpus) {
    this.corpus = corpus;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorpusDetailResponse {\n");
    
    sb.append("  corpus: ").append(corpus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
