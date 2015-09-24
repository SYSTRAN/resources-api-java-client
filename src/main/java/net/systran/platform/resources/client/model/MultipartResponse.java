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

import java.io.InputStream;
import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MultipartResponse {
  private String detectedLanguage;
  private Float detectedLanguageConfidence;
  private InputStream output;
  private InputStream source;

  /**
   * Get the detected language if the source language was not provided or set to "auto".
   */
  @ApiModelProperty(value = "The detected language")
  @JsonProperty("detectedLanguage")
  public String getDetectedLanguage() {
      return detectedLanguage;
  }
  public void setDetectedLanguage(String detectedLanguage) {
      this.detectedLanguage = detectedLanguage;
  }

  /**
   * Get the confidence of the language detection if the source language was not provided or set to "auto".
   */
  @ApiModelProperty(value = "The confidence of the language detection")
  @JsonProperty("detectedLanguageConfidence")
  public Float getDetectedLanguageConfidence() {
      return detectedLanguageConfidence;
  }
  public void setDetectedLanguageConfidence(Float detectedLanguageConfidence) {
      this.detectedLanguageConfidence = detectedLanguageConfidence;
  }

  /**
   * Get the translated file stream.
   */
  public InputStream getOutput() {
      return output;
  }
  public void setOutput(InputStream output) {
      this.output = output;
  }

  /**
   * Get the source file stream.
   */
  public InputStream getSource() {
      return source;
  }
  public void setSource(InputStream source) {
      this.source = source;
  }

}
