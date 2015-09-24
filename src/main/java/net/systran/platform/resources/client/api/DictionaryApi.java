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

import net.systran.platform.resources.client.model.DictionaryAddResponse;
import net.systran.platform.resources.client.model.DictionaryAddBody;
import net.systran.platform.resources.client.model.EntryAddResponse;
import net.systran.platform.resources.client.model.EntryAddBody;
import net.systran.platform.resources.client.model.EntryDeleteBody;
import net.systran.platform.resources.client.model.EntryDeleteResponse;
import net.systran.platform.resources.client.model.DictionariesImportResponse;
import java.io.File;
import net.systran.platform.resources.client.model.EntriesListResponse;
import net.systran.platform.resources.client.model.EntriesListFilters;
import net.systran.platform.resources.client.model.EntryUpdateBody;
import net.systran.platform.resources.client.model.EntryUpdateResponse;
import net.systran.platform.resources.client.model.DictionariesListResponse;
import net.systran.platform.resources.client.model.DictionariesListFilters;
import net.systran.platform.resources.client.model.LookupResponse;
import net.systran.platform.resources.client.model.LookupSupportedLanguageResponse;
import net.systran.platform.resources.client.model.SupportedLanguagesResponse;
import net.systran.platform.resources.client.model.DictionaryUpdateBody;
import net.systran.platform.resources.client.model.DictionaryUpdateResponse;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.InputStream;
import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class DictionaryApi {
  private ApiClient apiClient;

  public DictionaryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DictionaryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Add dictionary
   * Add a new dictionary.
   * @param input Input with dictionary information
   * @return DictionaryAddResponse
   */
  public DictionaryAddResponse resourcesDictionaryAddPost (DictionaryAddBody input) throws ApiException {
    Object postBody = input;
    
    // verify the required parameter 'input' is set
    if (input == null) {
       throw new ApiException(400, "Missing the required parameter 'input' when calling resourcesDictionaryAddPost");
    }
    

    // create path and map variables
    String path = "/resources/dictionary/add".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    final String[] accepts = {
      
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
        return (DictionaryAddResponse) apiClient.deserialize(response, "", DictionaryAddResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Delete a dictionary
   * Delete an existing dictionary.
   * @param dictionaryId Dictionary Id
   * @return void
   */
  public void resourcesDictionaryDeletePost (String dictionaryId) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'dictionaryId' is set
    if (dictionaryId == null) {
       throw new ApiException(400, "Missing the required parameter 'dictionaryId' when calling resourcesDictionaryDeletePost");
    }
    

    // create path and map variables
    String path = "/resources/dictionary/delete".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (dictionaryId != null)
      queryParams.put("dictionaryId", apiClient.parameterToString(dictionaryId));
    

    

    final String[] accepts = {
      
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
        return ; 
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Add an entry
   * Add a new entry to an existing dictionary.
   * @param dictionaryId Dictionary Id
   * @param input Input with dictionary id and entries information
   * @return EntryAddResponse
   */
  public EntryAddResponse resourcesDictionaryEntryAddPost (String dictionaryId, EntryAddBody input) throws ApiException {
    Object postBody = input;
    
    // verify the required parameter 'dictionaryId' is set
    if (dictionaryId == null) {
       throw new ApiException(400, "Missing the required parameter 'dictionaryId' when calling resourcesDictionaryEntryAddPost");
    }
    
    // verify the required parameter 'input' is set
    if (input == null) {
       throw new ApiException(400, "Missing the required parameter 'input' when calling resourcesDictionaryEntryAddPost");
    }
    

    // create path and map variables
    String path = "/resources/dictionary/entry/add".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (dictionaryId != null)
      queryParams.put("dictionaryId", apiClient.parameterToString(dictionaryId));
    

    

    final String[] accepts = {
      
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
        return (EntryAddResponse) apiClient.deserialize(response, "", EntryAddResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Delete an entry
   * Delete an entry in an existing dictionary.
   * @param dictionaryId Dictionary Id
   * @param input Input with dictionary id + entry id (src or tgt) to delete
   * @return EntryDeleteResponse
   */
  public EntryDeleteResponse resourcesDictionaryEntryDeletePost (String dictionaryId, EntryDeleteBody input) throws ApiException {
    Object postBody = input;
    
    // verify the required parameter 'dictionaryId' is set
    if (dictionaryId == null) {
       throw new ApiException(400, "Missing the required parameter 'dictionaryId' when calling resourcesDictionaryEntryDeletePost");
    }
    
    // verify the required parameter 'input' is set
    if (input == null) {
       throw new ApiException(400, "Missing the required parameter 'input' when calling resourcesDictionaryEntryDeletePost");
    }
    

    // create path and map variables
    String path = "/resources/dictionary/entry/delete".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (dictionaryId != null)
      queryParams.put("dictionaryId", apiClient.parameterToString(dictionaryId));
    

    

    final String[] accepts = {
      
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
        return (EntryDeleteResponse) apiClient.deserialize(response, "", EntryDeleteResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Import entries
   * Import entries to an existing dictionary.
   * @param dictionaryId Id of the dictionary where to import entries
   * @param sourceLang Source lang of the entries to import
   * @param inputFile File with entries to import
   * @return DictionariesImportResponse
   */
  public DictionariesImportResponse resourcesDictionaryEntryImportPost (String dictionaryId, String sourceLang, File inputFile) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'dictionaryId' is set
    if (dictionaryId == null) {
       throw new ApiException(400, "Missing the required parameter 'dictionaryId' when calling resourcesDictionaryEntryImportPost");
    }
    
    // verify the required parameter 'sourceLang' is set
    if (sourceLang == null) {
       throw new ApiException(400, "Missing the required parameter 'sourceLang' when calling resourcesDictionaryEntryImportPost");
    }
    
    // verify the required parameter 'inputFile' is set
    if (inputFile == null) {
       throw new ApiException(400, "Missing the required parameter 'inputFile' when calling resourcesDictionaryEntryImportPost");
    }
    

    // create path and map variables
    String path = "/resources/dictionary/entry/import".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (dictionaryId != null)
      queryParams.put("dictionaryId", apiClient.parameterToString(dictionaryId));
    if (sourceLang != null)
      queryParams.put("sourceLang", apiClient.parameterToString(sourceLang));
    

    

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
        return (DictionariesImportResponse) apiClient.deserialize(response, "", DictionariesImportResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List entries
   * List entries for a specific dictionary.
   * @param dictionaryId Dictionary Id
   * @param filters Different filters that can be applied to the list functionality (skip/limit/sort/match)
   * @return EntriesListResponse
   */
  public EntriesListResponse resourcesDictionaryEntryListPost (String dictionaryId, EntriesListFilters filters) throws ApiException {
    Object postBody = filters;
    
    // verify the required parameter 'dictionaryId' is set
    if (dictionaryId == null) {
       throw new ApiException(400, "Missing the required parameter 'dictionaryId' when calling resourcesDictionaryEntryListPost");
    }
    

    // create path and map variables
    String path = "/resources/dictionary/entry/list".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (dictionaryId != null)
      queryParams.put("dictionaryId", apiClient.parameterToString(dictionaryId));
    

    

    final String[] accepts = {
      
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
        return (EntriesListResponse) apiClient.deserialize(response, "", EntriesListResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Update an entry
   * Update an entry in an existing dictionary.
   * @param dictionaryId Dictionary Id
   * @param input Input with dictionary id + entry id (src or tgt) to delete
   * @return EntryUpdateResponse
   */
  public EntryUpdateResponse resourcesDictionaryEntryUpdatePost (String dictionaryId, EntryUpdateBody input) throws ApiException {
    Object postBody = input;
    
    // verify the required parameter 'dictionaryId' is set
    if (dictionaryId == null) {
       throw new ApiException(400, "Missing the required parameter 'dictionaryId' when calling resourcesDictionaryEntryUpdatePost");
    }
    
    // verify the required parameter 'input' is set
    if (input == null) {
       throw new ApiException(400, "Missing the required parameter 'input' when calling resourcesDictionaryEntryUpdatePost");
    }
    

    // create path and map variables
    String path = "/resources/dictionary/entry/update".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (dictionaryId != null)
      queryParams.put("dictionaryId", apiClient.parameterToString(dictionaryId));
    

    

    final String[] accepts = {
      
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
        return (EntryUpdateResponse) apiClient.deserialize(response, "", EntryUpdateResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List dictionaries
   * List the dictionaries.
   * @param filters Different filters that can be applied to the list functionality (skip/limit/sort/match)
   * @return DictionariesListResponse
   */
  public DictionariesListResponse resourcesDictionaryListPost (DictionariesListFilters filters) throws ApiException {
    Object postBody = filters;
    

    // create path and map variables
    String path = "/resources/dictionary/list".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    final String[] accepts = {
      
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
        return (DictionariesListResponse) apiClient.deserialize(response, "", DictionariesListResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lookup
   * Lookup words from a source language to a target language.
   * @param source Language code of the source text\n
   * @param target Language code in which to lookup the source text\n
   * @param input Input word (the &#39;input&#39; parameter can be repeated)\n
   * @param autocomplete With this option, if the input word is not found in the source language, it will be filled in with autocompletion to perform the lookup\n\nDefault: false\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return LookupResponse
   */
  public LookupResponse resourcesDictionaryLookupGet (String source, String target, List<String> input, Boolean autocomplete, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'source' is set
    if (source == null) {
       throw new ApiException(400, "Missing the required parameter 'source' when calling resourcesDictionaryLookupGet");
    }
    
    // verify the required parameter 'target' is set
    if (target == null) {
       throw new ApiException(400, "Missing the required parameter 'target' when calling resourcesDictionaryLookupGet");
    }
    
    // verify the required parameter 'input' is set
    if (input == null) {
       throw new ApiException(400, "Missing the required parameter 'input' when calling resourcesDictionaryLookupGet");
    }
    

    // create path and map variables
    String path = "/resources/dictionary/lookup".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (source != null)
      queryParams.put("source", apiClient.parameterToString(source));
    if (target != null)
      queryParams.put("target", apiClient.parameterToString(target));
    if (input != null)
      queryParams.put("input", apiClient.parameterToString(input));
    if (autocomplete != null)
      queryParams.put("autocomplete", apiClient.parameterToString(autocomplete));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      
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
        return (LookupResponse) apiClient.deserialize(response, "", LookupResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lookup Supported Languages
   * List of language pairs in which lookup is supported. This list can be limited to a specific source language or target language.\n
   * @param source Language code of the source text\n
   * @param target Language code into which to translate the source text\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return LookupSupportedLanguageResponse
   */
  public LookupSupportedLanguageResponse resourcesDictionaryLookupSupportedLanguagesGet (String source, String target, String callback) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/resources/dictionary/lookup/supportedLanguages".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (source != null)
      queryParams.put("source", apiClient.parameterToString(source));
    if (target != null)
      queryParams.put("target", apiClient.parameterToString(target));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      
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
        return (LookupSupportedLanguageResponse) apiClient.deserialize(response, "", LookupSupportedLanguageResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Supported Languages
   * Get supported languages by dictionaries
   * @return SupportedLanguagesResponse
   */
  public SupportedLanguagesResponse resourcesDictionarySupportedLanguagesGet () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/resources/dictionary/supportedLanguages".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    final String[] accepts = {
      
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
        return (SupportedLanguagesResponse) apiClient.deserialize(response, "", SupportedLanguagesResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Update a dictionary
   * Update an existing dictionary.
   * @param dictionaryId Dictionary Id
   * @param input Input with dictionary id
   * @return DictionaryUpdateResponse
   */
  public DictionaryUpdateResponse resourcesDictionaryUpdatePost (String dictionaryId, DictionaryUpdateBody input) throws ApiException {
    Object postBody = input;
    
    // verify the required parameter 'dictionaryId' is set
    if (dictionaryId == null) {
       throw new ApiException(400, "Missing the required parameter 'dictionaryId' when calling resourcesDictionaryUpdatePost");
    }
    
    // verify the required parameter 'input' is set
    if (input == null) {
       throw new ApiException(400, "Missing the required parameter 'input' when calling resourcesDictionaryUpdatePost");
    }
    

    // create path and map variables
    String path = "/resources/dictionary/update".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (dictionaryId != null)
      queryParams.put("dictionaryId", apiClient.parameterToString(dictionaryId));
    

    

    final String[] accepts = {
      
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
        return (DictionaryUpdateResponse) apiClient.deserialize(response, "", DictionaryUpdateResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
