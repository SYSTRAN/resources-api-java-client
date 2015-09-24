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

package net.systran.platform.resources.client.api;

import net.systran.platform.resources.client.ApiException;
import net.systran.platform.resources.client.ApiClient;
import net.systran.platform.resources.client.Configuration;

import net.systran.platform.resources.client.model.*;

import java.util.*;

import net.systran.platform.resources.client.model.CorpusAddResponse;
import net.systran.platform.resources.client.model.CorpusDeleteResponse;
import net.systran.platform.resources.client.model.CorpusDetailResponse;
import net.systran.platform.resources.client.model.CorpusExistsResponse;
import java.io.File;
import net.systran.platform.resources.client.model.CorpusImportResponse;
import net.systran.platform.resources.client.model.CorpusListResponse;
import net.systran.platform.resources.client.model.CorpusMatchResponse;
import net.systran.platform.resources.client.model.CorpusSegmentAddRequest;
import net.systran.platform.resources.client.model.CorpusSegmentAddResponse;
import net.systran.platform.resources.client.model.CorpusSegmentDeleteResponse;
import net.systran.platform.resources.client.model.CorpusSegmentListResponse;
import net.systran.platform.resources.client.model.CorpusSegmentAddTargetResponse;
import net.systran.platform.resources.client.model.CorpusSegmentAddTargetRequest;
import net.systran.platform.resources.client.model.CorpusSegmentDeleteTargetResponse;
import net.systran.platform.resources.client.model.CorpusSegmentUpdateResponse;
import net.systran.platform.resources.client.model.CorpusUpdateResponse;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.InputStream;
import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class CorpusApi {
  private ApiClient apiClient;

  public CorpusApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CorpusApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add a new corpus
   * Add a new empty corpus.\n
   * @param name Corpus name. The name also contains the directories (ex: \&quot;/myproject/firstPass/PersonalCorpus\&quot;)
   * @param lang Language code ([details](#description_langage_code_values))
   * @param tag Tag for the the corpus (this parameter can be repeated)
   * @param callback Javascript callback function name for JSONP Support\n
   * @return CorpusAddResponse
   */
  public CorpusAddResponse resourcesCorpusAddPost (String name, String lang, List<String> tag, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
       throw new ApiException(400, "Missing the required parameter 'name' when calling resourcesCorpusAddPost");
    }
    
    // verify the required parameter 'lang' is set
    if (lang == null) {
       throw new ApiException(400, "Missing the required parameter 'lang' when calling resourcesCorpusAddPost");
    }
    

    // create path and map variables
    String path = "/resources/corpus/add".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (name != null)
      queryParams.put("name", apiClient.parameterToString(name));
    if (lang != null)
      queryParams.put("lang", apiClient.parameterToString(lang));
    if (tag != null)
      queryParams.put("tag", apiClient.parameterToString(tag));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (CorpusAddResponse) apiClient.deserialize(response, "", CorpusAddResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Delete corpus
   * Delete a corpus.\n
   * @param corpusId Corpus identifier (this parameter can be repeated)
   * @param callback Javascript callback function name for JSONP Support\n
   * @return CorpusDeleteResponse
   */
  public CorpusDeleteResponse resourcesCorpusDeletePost (List<String> corpusId, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'corpusId' is set
    if (corpusId == null) {
       throw new ApiException(400, "Missing the required parameter 'corpusId' when calling resourcesCorpusDeletePost");
    }
    

    // create path and map variables
    String path = "/resources/corpus/delete".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (corpusId != null)
      queryParams.put("corpusId", apiClient.parameterToString(corpusId));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (CorpusDeleteResponse) apiClient.deserialize(response, "", CorpusDeleteResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Detail corpus
   * Get detailed information about a corpus.\n
   * @param corpusId Corpus identifier
   * @param callback Javascript callback function name for JSONP Support\n
   * @return CorpusDetailResponse
   */
  public CorpusDetailResponse resourcesCorpusDetailsGet (String corpusId, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'corpusId' is set
    if (corpusId == null) {
       throw new ApiException(400, "Missing the required parameter 'corpusId' when calling resourcesCorpusDetailsGet");
    }
    

    // create path and map variables
    String path = "/resources/corpus/details".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (corpusId != null)
      queryParams.put("corpusId", apiClient.parameterToString(corpusId));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (CorpusDetailResponse) apiClient.deserialize(response, "", CorpusDetailResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Corpus Exists
   * Check if a corpus exists\n
   * @param name Corpus name. The name also contains the directories (ex: \&quot;/myproject/firstPass/PersonalCorpus\&quot;)
   * @param callback Javascript callback function name for JSONP Support\n
   * @return CorpusExistsResponse
   */
  public CorpusExistsResponse resourcesCorpusExistsGet (String name, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
       throw new ApiException(400, "Missing the required parameter 'name' when calling resourcesCorpusExistsGet");
    }
    

    // create path and map variables
    String path = "/resources/corpus/exists".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (name != null)
      queryParams.put("name", apiClient.parameterToString(name));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (CorpusExistsResponse) apiClient.deserialize(response, "", CorpusExistsResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Export corpus
   * Download a corpus in an expected format.\n
   * @param corpusId Corpus identifier
   * @param format The expected corpus format\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return InputStream
   */
  public InputStream resourcesCorpusExportGet (String corpusId, String format, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'corpusId' is set
    if (corpusId == null) {
       throw new ApiException(400, "Missing the required parameter 'corpusId' when calling resourcesCorpusExportGet");
    }
    

    // create path and map variables
    String path = "/resources/corpus/export".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (corpusId != null)
      queryParams.put("corpusId", apiClient.parameterToString(corpusId));
    if (format != null)
      queryParams.put("format", apiClient.parameterToString(format));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/x-tmx+xml", "text/bitext"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (InputStream) apiClient.deserialize(response, "", InputStream.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Import corpus
   * Add a new corpus from an existing corpus.\n
   * @param name Corpus name. The name also contains the directories (ex: \&quot;/myproject/firstPass/PersonalCorpus\&quot;)
   * @param input Content of the existing corpus\n\n**Either `input` or `inputFile` is required**\n
   * @param inputFile Content of the existing corpus\n\n**Either `input` or `inputFile` is required**\n
   * @param format Format of the input corpus.\n
   * @param tag Tag for the the corpus (this parameter can be repeated)
   * @param callback Javascript callback function name for JSONP Support\n
   * @return CorpusImportResponse
   */
  public CorpusImportResponse resourcesCorpusImportPost (String name, String input, File inputFile, String format, List<String> tag, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
       throw new ApiException(400, "Missing the required parameter 'name' when calling resourcesCorpusImportPost");
    }
    

    // create path and map variables
    String path = "/resources/corpus/import".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (name != null)
      queryParams.put("name", apiClient.parameterToString(name));
    if (input != null)
      queryParams.put("input", apiClient.parameterToString(input));
    if (format != null)
      queryParams.put("format", apiClient.parameterToString(format));
    if (tag != null)
      queryParams.put("tag", apiClient.parameterToString(tag));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "multipart/form-data", "application/x-www-form-urlencoded", "*/*"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if (inputFile != null) {
        hasFields = true;
        mp.field("inputFile", inputFile.getName());
        mp.bodyPart(new FileDataBodyPart("inputFile", inputFile, MediaType.MULTIPART_FORM_DATA_TYPE));
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (CorpusImportResponse) apiClient.deserialize(response, "", CorpusImportResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List corpora
   * List available corpora. Parameters can be used to restrict the list of returned corpora.\n
   * @param sourceLang Source language code ([details](#description_langage_code_values))
   * @param targetLang Target language code ([details](#description_langage_code_values))
   * @param withoutPending Filter out corpora in \&quot;pending\&quot; status\n
   * @param withoutError Filter out corpora in \&quot;error\&quot; status\n
   * @param prefix Prefix of the corpus name\n
   * @param directory If specified, response will return the content of this directory, including corpora and directories. This list can can also be filtered by the prefix parameter.\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return CorpusListResponse
   */
  public CorpusListResponse resourcesCorpusListGet (String sourceLang, String targetLang, Boolean withoutPending, Boolean withoutError, String prefix, String directory, String callback) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/resources/corpus/list".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (sourceLang != null)
      queryParams.put("sourceLang", apiClient.parameterToString(sourceLang));
    if (targetLang != null)
      queryParams.put("targetLang", apiClient.parameterToString(targetLang));
    if (withoutPending != null)
      queryParams.put("withoutPending", apiClient.parameterToString(withoutPending));
    if (withoutError != null)
      queryParams.put("withoutError", apiClient.parameterToString(withoutError));
    if (prefix != null)
      queryParams.put("prefix", apiClient.parameterToString(prefix));
    if (directory != null)
      queryParams.put("directory", apiClient.parameterToString(directory));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (CorpusListResponse) apiClient.deserialize(response, "", CorpusListResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Corpus Match
   * Find sentences in the corpus that match the input text from a given threshold.\n
   * @param corpusId Corpus identifier (this parameter can be repeated)
   * @param input Text is used to perform the match operation (this parameter can be repeated)\n
   * @param sourceLang Source language code ([details](#description_langage_code_values))
   * @param targetLang Target language code ([details](#description_langage_code_values))
   * @param threshold The fuzzy match threshold from which a sentence will be considered as a match result\n
   * @param limit Limit the number of returned matches. Only first matches within the \&quot;limit\&quot; will be returned\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return CorpusMatchResponse
   */
  public CorpusMatchResponse resourcesCorpusMatchGet (List<String> corpusId, List<String> input, String sourceLang, String targetLang, Double threshold, Integer limit, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'corpusId' is set
    if (corpusId == null) {
       throw new ApiException(400, "Missing the required parameter 'corpusId' when calling resourcesCorpusMatchGet");
    }
    
    // verify the required parameter 'input' is set
    if (input == null) {
       throw new ApiException(400, "Missing the required parameter 'input' when calling resourcesCorpusMatchGet");
    }
    
    // verify the required parameter 'sourceLang' is set
    if (sourceLang == null) {
       throw new ApiException(400, "Missing the required parameter 'sourceLang' when calling resourcesCorpusMatchGet");
    }
    
    // verify the required parameter 'targetLang' is set
    if (targetLang == null) {
       throw new ApiException(400, "Missing the required parameter 'targetLang' when calling resourcesCorpusMatchGet");
    }
    

    // create path and map variables
    String path = "/resources/corpus/match".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (corpusId != null)
      queryParams.put("corpusId", apiClient.parameterToString(corpusId));
    if (input != null)
      queryParams.put("input", apiClient.parameterToString(input));
    if (sourceLang != null)
      queryParams.put("sourceLang", apiClient.parameterToString(sourceLang));
    if (targetLang != null)
      queryParams.put("targetLang", apiClient.parameterToString(targetLang));
    if (threshold != null)
      queryParams.put("threshold", apiClient.parameterToString(threshold));
    if (limit != null)
      queryParams.put("limit", apiClient.parameterToString(limit));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (CorpusMatchResponse) apiClient.deserialize(response, "", CorpusMatchResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Add corpus segments
   * Add segments in a corpus.\n
   * @param body List of segments to add
   * @param callback Javascript callback function name for JSONP Support\n
   * @return CorpusSegmentAddResponse
   */
  public CorpusSegmentAddResponse resourcesCorpusSegmentAddPost (CorpusSegmentAddRequest body, String callback) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException(400, "Missing the required parameter 'body' when calling resourcesCorpusSegmentAddPost");
    }
    

    // create path and map variables
    String path = "/resources/corpus/segment/add".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (CorpusSegmentAddResponse) apiClient.deserialize(response, "", CorpusSegmentAddResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Delete corpus segments
   * Delete segments in a corpus.\n
   * @param corpusId Corpus identifier
   * @param segId Segment Id (this parameter can be repeated)
   * @param callback Javascript callback function name for JSONP Support\n
   * @return CorpusSegmentDeleteResponse
   */
  public CorpusSegmentDeleteResponse resourcesCorpusSegmentDeletePost (String corpusId, List<String> segId, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'corpusId' is set
    if (corpusId == null) {
       throw new ApiException(400, "Missing the required parameter 'corpusId' when calling resourcesCorpusSegmentDeletePost");
    }
    
    // verify the required parameter 'segId' is set
    if (segId == null) {
       throw new ApiException(400, "Missing the required parameter 'segId' when calling resourcesCorpusSegmentDeletePost");
    }
    

    // create path and map variables
    String path = "/resources/corpus/segment/delete".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (corpusId != null)
      queryParams.put("corpusId", apiClient.parameterToString(corpusId));
    if (segId != null)
      queryParams.put("segId", apiClient.parameterToString(segId));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (CorpusSegmentDeleteResponse) apiClient.deserialize(response, "", CorpusSegmentDeleteResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List corpus segments
   * List segments in a corpus.\n
   * @param corpusId Corpus identifier
   * @param skip Skip first found segments in the response\n
   * @param limit Limit the number of returned segments\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return CorpusSegmentListResponse
   */
  public CorpusSegmentListResponse resourcesCorpusSegmentListGet (String corpusId, Integer skip, Integer limit, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'corpusId' is set
    if (corpusId == null) {
       throw new ApiException(400, "Missing the required parameter 'corpusId' when calling resourcesCorpusSegmentListGet");
    }
    

    // create path and map variables
    String path = "/resources/corpus/segment/list".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (corpusId != null)
      queryParams.put("corpusId", apiClient.parameterToString(corpusId));
    if (skip != null)
      queryParams.put("skip", apiClient.parameterToString(skip));
    if (limit != null)
      queryParams.put("limit", apiClient.parameterToString(limit));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (CorpusSegmentListResponse) apiClient.deserialize(response, "", CorpusSegmentListResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Add corpus segment targets
   * Add targets to a segment in a corpus.\n
   * @param body List of targets to add
   * @param callback Javascript callback function name for JSONP Support\n
   * @return CorpusSegmentAddTargetResponse
   */
  public CorpusSegmentAddTargetResponse resourcesCorpusSegmentTargetAddPost (CorpusSegmentAddTargetRequest body, String callback) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException(400, "Missing the required parameter 'body' when calling resourcesCorpusSegmentTargetAddPost");
    }
    

    // create path and map variables
    String path = "/resources/corpus/segment/target/add".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (CorpusSegmentAddTargetResponse) apiClient.deserialize(response, "", CorpusSegmentAddTargetResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Delete corpus segment targets
   * Delete segment targets in a corpus.\n
   * @param corpusId Corpus identifier
   * @param segId Segment Id
   * @param targetId Target id (this parameter can be repeated)
   * @param callback Javascript callback function name for JSONP Support\n
   * @return CorpusSegmentDeleteTargetResponse
   */
  public CorpusSegmentDeleteTargetResponse resourcesCorpusSegmentTargetDeletePost (String corpusId, String segId, List<String> targetId, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'corpusId' is set
    if (corpusId == null) {
       throw new ApiException(400, "Missing the required parameter 'corpusId' when calling resourcesCorpusSegmentTargetDeletePost");
    }
    
    // verify the required parameter 'segId' is set
    if (segId == null) {
       throw new ApiException(400, "Missing the required parameter 'segId' when calling resourcesCorpusSegmentTargetDeletePost");
    }
    
    // verify the required parameter 'targetId' is set
    if (targetId == null) {
       throw new ApiException(400, "Missing the required parameter 'targetId' when calling resourcesCorpusSegmentTargetDeletePost");
    }
    

    // create path and map variables
    String path = "/resources/corpus/segment/target/delete".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (corpusId != null)
      queryParams.put("corpusId", apiClient.parameterToString(corpusId));
    if (segId != null)
      queryParams.put("segId", apiClient.parameterToString(segId));
    if (targetId != null)
      queryParams.put("targetId", apiClient.parameterToString(targetId));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (CorpusSegmentDeleteTargetResponse) apiClient.deserialize(response, "", CorpusSegmentDeleteTargetResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Update corpus segment
   * Update a segment in a corpus.\n
   * @param corpusId Corpus identifier
   * @param segId Segment Id
   * @param source Source text
   * @param targetId Target id
   * @param target Target text. `targetId` is required if `target` is specified.
   * @param targetLang Target language. `targetId` is required if `targetLang` is specified.
   * @param callback Javascript callback function name for JSONP Support\n
   * @return CorpusSegmentUpdateResponse
   */
  public CorpusSegmentUpdateResponse resourcesCorpusSegmentUpdatePost (String corpusId, String segId, String source, String targetId, String target, String targetLang, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'corpusId' is set
    if (corpusId == null) {
       throw new ApiException(400, "Missing the required parameter 'corpusId' when calling resourcesCorpusSegmentUpdatePost");
    }
    
    // verify the required parameter 'segId' is set
    if (segId == null) {
       throw new ApiException(400, "Missing the required parameter 'segId' when calling resourcesCorpusSegmentUpdatePost");
    }
    

    // create path and map variables
    String path = "/resources/corpus/segment/update".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (corpusId != null)
      queryParams.put("corpusId", apiClient.parameterToString(corpusId));
    if (segId != null)
      queryParams.put("segId", apiClient.parameterToString(segId));
    if (source != null)
      queryParams.put("source", apiClient.parameterToString(source));
    if (targetId != null)
      queryParams.put("targetId", apiClient.parameterToString(targetId));
    if (target != null)
      queryParams.put("target", apiClient.parameterToString(target));
    if (targetLang != null)
      queryParams.put("targetLang", apiClient.parameterToString(targetLang));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (CorpusSegmentUpdateResponse) apiClient.deserialize(response, "", CorpusSegmentUpdateResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Update corpus properties
   * Update properties of a corpus.\n
   * @param corpusId Corpus identifier
   * @param name Corpus name. The name also contains the directories (ex: \&quot;/myproject/firstPass/PersonalCorpus\&quot;)
   * @param tag Tag for the the corpus (this parameter can be repeated)
   * @param callback Javascript callback function name for JSONP Support\n
   * @return CorpusUpdateResponse
   */
  public CorpusUpdateResponse resourcesCorpusUpdatePost (String corpusId, String name, List<String> tag, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'corpusId' is set
    if (corpusId == null) {
       throw new ApiException(400, "Missing the required parameter 'corpusId' when calling resourcesCorpusUpdatePost");
    }
    

    // create path and map variables
    String path = "/resources/corpus/update".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (corpusId != null)
      queryParams.put("corpusId", apiClient.parameterToString(corpusId));
    if (name != null)
      queryParams.put("name", apiClient.parameterToString(name));
    if (tag != null)
      queryParams.put("tag", apiClient.parameterToString(tag));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (CorpusUpdateResponse) apiClient.deserialize(response, "", CorpusUpdateResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
