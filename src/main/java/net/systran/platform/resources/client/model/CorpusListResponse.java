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
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class CorpusListResponse  {
  
  private List<Corpus> files = new ArrayList<Corpus>() ;
  private List<String> directories = new ArrayList<String>() ;

  
  /**
   * List of corpus files
   **/
  @ApiModelProperty(required = true, value = "List of corpus files")
  @JsonProperty("files")
  public List<Corpus> getFiles() {
    return files;
  }
  public void setFiles(List<Corpus> files) {
    this.files = files;
  }

  
  /**
   * List of directories. Returned only if directory parameter was specified in the request.
   **/
  @ApiModelProperty(value = "List of directories. Returned only if directory parameter was specified in the request.")
  @JsonProperty("directories")
  public List<String> getDirectories() {
    return directories;
  }
  public void setDirectories(List<String> directories) {
    this.directories = directories;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorpusListResponse {\n");
    
    sb.append("  files: ").append(files).append("\n");
    sb.append("  directories: ").append(directories).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
