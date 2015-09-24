package net.systran.platform.resources.client;

import net.systran.platform.resources.client.api.DictionaryApi;
import net.systran.platform.resources.client.auth.ApiKeyAuth;
import net.systran.platform.resources.client.model.*;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestDictionary {
    public static DictionaryApi getDictionaryApi() throws IOException {
        ApiClient apc = new ApiClient();
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) apc.getAuthentication("apiKey");
        String apiKey = ApiClient.LoadAPIKey(".//apiKey.txt");
        apiKeyAuth.setApiKey(apiKey);
        return new DictionaryApi(apc);
    }

    @Test
    public void testResourcesLookupSupportedLanguagesGet() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        LookupSupportedLanguageResponse lookupSupportedLanguageResponse = api.resourcesDictionaryLookupSupportedLanguagesGet(null, null, null);
        System.out.println(lookupSupportedLanguageResponse.toString());
    }

    @Test
    public void testResourcesLookupGet() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String source = "en";
        String target = "fr";
        List<String> inputs = new ArrayList<String>();
        inputs.add("test");
        inputs.add("work");
        LookupResponse lookupResponse = api.resourcesDictionaryLookupGet(source, target, inputs, null, null);
        System.out.println(lookupResponse.toString());
    }

    @Test
    public void testResourcesLookupGetWithAutoComplete() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String source = "en";
        String target = "fr";
        Boolean autoComplete = true;
        List<String> inputs = new ArrayList<String>();
        inputs.add("workaroun");
        LookupResponse lookupResponse = api.resourcesDictionaryLookupGet(source, target, inputs, autoComplete, null);
        System.out.println(lookupResponse.toString());
    }

    @Test
    public void testResourcesDictionaryListPost() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        DictionariesListResponse dictionariesListResponse = api.resourcesDictionaryListPost(null);
        System.out.println(dictionariesListResponse.toString());
    }

    @Test
    public void testResourcesDictionaryAddPost() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        DictionaryAddInput dictionaryAddInput = new DictionaryAddInput();
        dictionaryAddInput.setName("testJavaClient");
        dictionaryAddInput.setSourceLang("en");
        dictionaryAddInput.setTargetLangs("fr");
        dictionaryAddInput.setComments("This is a dictionary created for client java test");

        DictionaryAddBody dictionaryAddBody = new DictionaryAddBody();
        dictionaryAddBody.setDictionary(dictionaryAddInput);

        DictionaryAddResponse dictionaryAddResponse = api.resourcesDictionaryAddPost(dictionaryAddBody);
        System.out.println(dictionaryAddResponse.toString());
    }

    @Test
    public void testResourcesDictionaryListPostWithMatchFilter() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        DictionariesListMatchFilter dictionariesListMatchFilter = new DictionariesListMatchFilter();
        dictionariesListMatchFilter.setRegexName("test");

        DictionariesListFilters dictionariesListFilters = new DictionariesListFilters();
        dictionariesListFilters.setMatch(dictionariesListMatchFilter);

        DictionariesListResponse dictionariesListResponse = api.resourcesDictionaryListPost(dictionariesListFilters);
        System.out.println(dictionariesListResponse.toString());
    }

    @Test
    public void testResourcesDictionaryListPostWithSortFilter() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();

        DictionariesListSortFilter dictionariesListSortFilter = new DictionariesListSortFilter();
        dictionariesListSortFilter.setName(1);  // sort by dictionary name in "ascending" order

        DictionariesListFilters dictionariesListFilters = new DictionariesListFilters();
        dictionariesListFilters.setSort(dictionariesListSortFilter);

        DictionariesListResponse dictionariesListResponse = api.resourcesDictionaryListPost(dictionariesListFilters);
        System.out.println(dictionariesListResponse.toString());
    }

    @Test
    public void testResourcesDictionaryUpdatePostOnlyComments() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String dictionaryId = "55c0a88275314374575ae4d4";
        DictionaryUpdateInput dictionaryUpdateInput = new DictionaryUpdateInput();
        dictionaryUpdateInput.setComments("This dictionary has been updated for client java test");

        DictionaryUpdateBody dictionaryUpdateBody = new DictionaryUpdateBody();
        dictionaryUpdateBody.setDictionary(dictionaryUpdateInput);

        System.out.println("Use a valid 'dictionaryId' and uncomment below codes to test");
        //DictionaryUpdateResponse dictionaryUpdateResponse = api.resourcesDictionaryUpdatePost(dictionaryId, dictionaryUpdateBody);
        //System.out.println(dictionaryUpdateResponse.toString());
    }

    @Test
    public void testResourcesDictionaryUpdatePost() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String dictionaryId = "55c0a88275314374575ae4d4";
        DictionaryUpdateInput dictionaryUpdateInput = new DictionaryUpdateInput();
        dictionaryUpdateInput.setName("testJavaClient");
        dictionaryUpdateInput.setSourceLang("en");
        dictionaryUpdateInput.setTargetLangs("fr");
        dictionaryUpdateInput.setComments("This dictionary has been updated for client java test");

        DictionaryUpdateBody dictionaryUpdateBody = new DictionaryUpdateBody();
        dictionaryUpdateBody.setDictionary(dictionaryUpdateInput);

        System.out.println("Use a valid 'dictionaryId' and uncomment below codes to test");
        //DictionaryUpdateResponse dictionaryUpdateResponse = api.resourcesDictionaryUpdatePost(dictionaryId, dictionaryUpdateBody);
        //System.out.println(dictionaryUpdateResponse.toString());
    }

    @Test
    public void testResourcesDictionaryDeletePost() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String dictionaryId = "55db168775314374575ae630";

        System.out.println("Use a valid 'dictionaryId' and uncomment below codes to test");
        //api.resourcesDictionaryDeletePost(dictionaryId);
        //System.out.println("dictionaryId " + dictionaryId + " has been deleted successfully");
    }

    @Test
    public void testResourcesDictionaryEntryListPost() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String dictionaryId = "55c0a88275314374575ae4d4";

        System.out.println("Use a valid 'dictionaryId' and uncomment below codes to test");
        //EntriesListResponse entriesListResponse = api.resourcesDictionaryEntryListPost(dictionaryId, null);
        //System.out.println(entriesListResponse.toString());
    }

    @Test
    public void testResourcesDictionaryEntryListPostWithSortFilter() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String dictionaryId = "55c0a88275314374575ae4d4";
        EntriesListSortFilter entriesListSortFilter = new EntriesListSortFilter();
        entriesListSortFilter.setTarget(1); // sort by dictionary name in "ascending" order

        EntriesListFilters entriesListFilters = new EntriesListFilters();
        entriesListFilters.setSort(entriesListSortFilter);

        System.out.println("Use a valid 'dictionaryId' and uncomment below codes to test");
        //EntriesListResponse entriesListResponse = api.resourcesDictionaryEntryListPost(dictionaryId, entriesListFilters);
        //System.out.println(entriesListResponse.toString());
    }

    @Test
    public void testResourcesDictionaryEntryListPostWithMatchFilter() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String dictionaryId = "55c0a88275314374575ae4d4";
        EntriesListMatchFilter entriesListMatchFilter = new EntriesListMatchFilter();
        List<String> inTargetLanguages = new ArrayList<String>();
        inTargetLanguages.add("fr");
        entriesListMatchFilter.setInTargetLang(inTargetLanguages);

        EntriesListFilters entriesListFilters = new EntriesListFilters();
        entriesListFilters.setMatch(entriesListMatchFilter);

        System.out.println("Use a valid 'dictionaryId' and uncomment below codes to test");
        //EntriesListResponse entriesListResponse = api.resourcesDictionaryEntryListPost(dictionaryId, entriesListFilters);
        //System.out.println(entriesListResponse.toString());
    }

    @Test
    public void testResourcesDictionaryEntryAddPost() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String dictionaryId = "55c0a88275314374575ae4d4";

        EntryAddInput entryAddInput = new EntryAddInput();
        entryAddInput.setSourceLang("en");
        entryAddInput.setTargetLang("fr");
        entryAddInput.setSource("house");
        entryAddInput.setTarget("maison");

        EntryAddBody entryAddBody = new EntryAddBody();
        entryAddBody.setEntry(entryAddInput);

        System.out.println("Use a valid 'dictionaryId' and uncomment below codes to test");
        //EntryAddResponse entryAddResponse = api.resourcesDictionaryEntryAddPost(dictionaryId, entryAddBody);
        //System.out.println(entryAddResponse.toString());
    }

    @Test
    public void testResourcesDictionaryEntryUpdatePostForSource() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String dictionaryId = "55c0a88275314374575ae4d4";

        EntryUpdateInput entryUpdateInput = new EntryUpdateInput();
        entryUpdateInput.setSourceLang("en");
        entryUpdateInput.setTargetLang("fr");
        entryUpdateInput.setSource("home");

        EntryUpdateBody entryUpdateBody = new EntryUpdateBody();
        entryUpdateBody.setSourceId("55c0aa3c75314374575ae4d6");
        entryUpdateBody.setUpdate(entryUpdateInput);

        System.out.println("Use a valid 'dictionaryId', 'sourceId' and uncomment below codes to test");
        //EntryUpdateResponse entryUpdateResponse = api.resourcesDictionaryEntryUpdatePost(dictionaryId, entryUpdateBody);
        //System.out.println(entryUpdateResponse.toString());
    }

    @Test
    public void testResourcesDictionaryEntryUpdatePostForTarget() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String dictionaryId = "55c0a88275314374575ae4d4";

        EntryUpdateInput entryUpdateInput = new EntryUpdateInput();
        entryUpdateInput.setSourceLang("en");
        entryUpdateInput.setTargetLang("fr");
        entryUpdateInput.setTarget("batiment");

        EntryUpdateBody entryUpdateBody = new EntryUpdateBody();
        entryUpdateBody.setSourceId("55c0aa3c75314374575ae4d6");
        entryUpdateBody.setTargetId("55c0abdd75314374575ae4d7");
        entryUpdateBody.setUpdate(entryUpdateInput);

        System.out.println("Use a valid 'dictionaryId', 'sourceId', 'targetId' and uncomment below codes to test");
        //EntryUpdateResponse entryUpdateResponse = api.resourcesDictionaryEntryUpdatePost(dictionaryId, entryUpdateBody);
        //System.out.println(entryUpdateResponse.toString());
    }

    @Test
    public void testResourcesDictionaryEntryUpdatePostForSourceAndTarget() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String dictionaryId = "55c0a88275314374575ae4d4";

        EntryUpdateInput entryUpdateInput = new EntryUpdateInput();
        entryUpdateInput.setSourceLang("en");
        entryUpdateInput.setSource("home");

        entryUpdateInput.setTargetLang("fr");
        entryUpdateInput.setTarget("batiment");

        EntryUpdateBody entryUpdateBody = new EntryUpdateBody();
        entryUpdateBody.setSourceId("55c0aa3c75314374575ae4d6");
        entryUpdateBody.setTargetId("55c0abdd75314374575ae4d7");
        entryUpdateBody.setUpdate(entryUpdateInput);

        System.out.println("Use a valid 'dictionaryId', 'sourceId', 'targetId' and uncomment below codes to test");
        //EntryUpdateResponse entryUpdateResponse = api.resourcesDictionaryEntryUpdatePost(dictionaryId, entryUpdateBody);
        //System.out.println(entryUpdateResponse.toString());
    }

    @Test
    public void testResourcesDictionaryEntryDeletePost() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String dictionaryId = "55c0a88275314374575ae4d4";
        EntryDeleteInput entryDeleteInput = new EntryDeleteInput();
        entryDeleteInput.setSourceId("55c0c6e775314374575ae4db");

        EntryDeleteBody entryDeleteBody = new EntryDeleteBody();
        entryDeleteBody.setEntry(entryDeleteInput);

        System.out.println("Use a valid 'dictionaryId', 'sourceId' and uncomment below codes to test");
        //EntryDeleteResponse entryDeleteResponse = api.resourcesDictionaryEntryDeletePost(dictionaryId, entryDeleteBody);
        //System.out.println(entryDeleteResponse.toString());
    }
}
