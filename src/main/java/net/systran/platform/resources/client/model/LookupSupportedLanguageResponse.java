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

import net.systran.platform.resources.client.model.LookupLanguagePair;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class LookupSupportedLanguageResponse  {
  
  private String warning = null;
  private String error = null;
  private List<LookupLanguagePair> languagePairs = new ArrayList<LookupLanguagePair>() ;

  
  /**
   * Warning at request level
   **/
  @ApiModelProperty(value = "Warning at request level")
  @JsonProperty("warning")
  public String getWarning() {
    return warning;
  }
  public void setWarning(String warning) {
    this.warning = warning;
  }

  
  /**
   * Error at request level
   **/
  @ApiModelProperty(value = "Error at request level")
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  
  /**
   * Array of language pairs
   **/
  @ApiModelProperty(value = "Array of language pairs")
  @JsonProperty("languagePairs")
  public List<LookupLanguagePair> getLanguagePairs() {
    return languagePairs;
  }
  public void setLanguagePairs(List<LookupLanguagePair> languagePairs) {
    this.languagePairs = languagePairs;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookupSupportedLanguageResponse {\n");
    
    sb.append("  warning: ").append(warning).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("  languagePairs: ").append(languagePairs).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
