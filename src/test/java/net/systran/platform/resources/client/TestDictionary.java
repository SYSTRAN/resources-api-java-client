package net.systran.platform.resources.client;

import net.systran.platform.resources.client.api.DictionaryApi;
import net.systran.platform.resources.client.auth.ApiKeyAuth;
import net.systran.platform.resources.client.model.*;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static junit.framework.TestCase.assertNotNull;

import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestDictionary {
    public static String dictionaryId;

    public static DictionaryApi getDictionaryApi() throws IOException {
        ApiClient apc = new ApiClient();
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) apc.getAuthentication("apiKey");
        String apiKey = ApiClient.LoadAPIKey(".//apiKey.txt");
        apiKeyAuth.setApiKey(apiKey);
        return new DictionaryApi(apc);
    }

    public String getDictionaryId () throws IOException, ApiException {
        if (dictionaryId == null) {
            dictionaryId = getDictionaryIdByName("javaClientTest");
        }
        return dictionaryId;
    }

    public void setDictionaryId (String id) {
        dictionaryId = id;
    }

    public String getDictionaryIdByName(String name) throws IOException, ApiException {
        DictionaryApi api = getDictionaryApi();
        DictionariesListMatchFilter dictionariesListMatchFilter = new DictionariesListMatchFilter();
        dictionariesListMatchFilter.setRegexName(name);

        DictionariesListFilters dictionariesListFilters = new DictionariesListFilters();
        dictionariesListFilters.setMatch(dictionariesListMatchFilter);

        DictionariesListResponse dictionariesListResponse = api.resourcesDictionaryListPost(dictionariesListFilters);
        String id = null;
        if (dictionariesListResponse.getDictionaries().size() > 0) {
            id = dictionariesListResponse.getDictionaries().get(0).getId();
        }
        return id;
    }

    @Test
    public void test11ResourcesLookupSupportedLanguagesGet() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        LookupSupportedLanguageResponse lookupSupportedLanguageResponse = api.resourcesDictionaryLookupSupportedLanguagesGet(null, null, null);
        System.out.println(lookupSupportedLanguageResponse.toString());
    }

    @Test
    public void test12ResourcesLookupGet() throws ApiException, IOException {
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
    public void test13ResourcesLookupGetWithAutoComplete() throws ApiException, IOException {
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
    public void test21ResourcesDictionaryListPost() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        DictionariesListResponse dictionariesListResponse = api.resourcesDictionaryListPost(null);
        System.out.println(dictionariesListResponse.toString());
    }

    @Test
    public void test22ResourcesDictionaryAddPost() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        DictionaryAddInput dictionaryAddInput = new DictionaryAddInput();
        dictionaryAddInput.setName("javaClientTest");
        dictionaryAddInput.setSourceLang("en");
        dictionaryAddInput.setTargetLangs("fr");
        dictionaryAddInput.setType("UD");
        dictionaryAddInput.setComments("This is a dictionary created for java client testing purposes");

        DictionaryAddBody dictionaryAddBody = new DictionaryAddBody();
        dictionaryAddBody.setDictionary(dictionaryAddInput);

        DictionaryAddResponse dictionaryAddResponse = api.resourcesDictionaryAddPost(dictionaryAddBody);
        String dictionaryId = dictionaryAddResponse.getAdded().getId();
        assertNotNull(dictionaryId);
        setDictionaryId(dictionaryId);
        System.out.println(dictionaryAddResponse.toString());
    }

    @Test
    public void test23ResourcesDictionaryListPostWithMatchFilter() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        DictionariesListMatchFilter dictionariesListMatchFilter = new DictionariesListMatchFilter();
        dictionariesListMatchFilter.setRegexName("javaClientTest");

        DictionariesListFilters dictionariesListFilters = new DictionariesListFilters();
        dictionariesListFilters.setMatch(dictionariesListMatchFilter);

        DictionariesListResponse dictionariesListResponse = api.resourcesDictionaryListPost(dictionariesListFilters);
        System.out.println(dictionariesListResponse.toString());
    }

    @Test
    public void test24ResourcesDictionaryListPostWithSortFilter() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();

        DictionariesListSortFilter dictionariesListSortFilter = new DictionariesListSortFilter();
        dictionariesListSortFilter.setName(1);  // sort by dictionary name in "ascending" order

        DictionariesListFilters dictionariesListFilters = new DictionariesListFilters();
        dictionariesListFilters.setSort(dictionariesListSortFilter);

        DictionariesListResponse dictionariesListResponse = api.resourcesDictionaryListPost(dictionariesListFilters);
        System.out.println(dictionariesListResponse.toString());
    }

    @Test
    public void test31ResourcesDictionaryUpdatePostOnlyComments() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String dictionaryId = getDictionaryId();
        if (dictionaryId == null) {
            System.out.println("No dictionary id found to update");
            return;
        }
        DictionaryUpdateInput dictionaryUpdateInput = new DictionaryUpdateInput();
        dictionaryUpdateInput.setComments("This dictionary has been updated for client java test");

        DictionaryUpdateBody dictionaryUpdateBody = new DictionaryUpdateBody();
        dictionaryUpdateBody.setDictionary(dictionaryUpdateInput);

        DictionaryUpdateResponse dictionaryUpdateResponse = api.resourcesDictionaryUpdatePost(dictionaryId, dictionaryUpdateBody);
        System.out.println(dictionaryUpdateResponse.toString());
    }

    @Test
    public void test32ResourcesDictionaryUpdatePost() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String dictionaryId = getDictionaryId();
        if (dictionaryId == null) {
            System.out.println("No dictionary id found to update");
            return;
        }
        DictionaryUpdateInput dictionaryUpdateInput = new DictionaryUpdateInput();
        dictionaryUpdateInput.setName("javaClientTestUpdatedName");
        dictionaryUpdateInput.setSourceLang("en");
        dictionaryUpdateInput.setTargetLangs("fr");
        dictionaryUpdateInput.setComments("This dictionary has been updated for client java test");

        DictionaryUpdateBody dictionaryUpdateBody = new DictionaryUpdateBody();
        dictionaryUpdateBody.setDictionary(dictionaryUpdateInput);

        DictionaryUpdateResponse dictionaryUpdateResponse = api.resourcesDictionaryUpdatePost(dictionaryId, dictionaryUpdateBody);
        System.out.println(dictionaryUpdateResponse.toString());
    }

    @Test
    public void test41ResourcesDictionaryEntryListPost() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String dictionaryId = getDictionaryId();
        if (dictionaryId == null) {
            System.out.println("No dictionary id found to list entry");
            return;
        }
        EntriesListResponse entriesListResponse = api.resourcesDictionaryEntryListPost(dictionaryId, null);
        System.out.println(entriesListResponse.toString());
    }

    @Test
    public void test42ResourcesDictionaryEntryListPostWithSortFilter() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String dictionaryId = getDictionaryId();
        if (dictionaryId == null) {
            System.out.println("No dictionary id found to list entry");
            return;
        }
        EntriesListSortFilter entriesListSortFilter = new EntriesListSortFilter();
        entriesListSortFilter.setTarget(1); // sort by dictionary name in "ascending" order

        EntriesListFilters entriesListFilters = new EntriesListFilters();
        entriesListFilters.setSort(entriesListSortFilter);

        EntriesListResponse entriesListResponse = api.resourcesDictionaryEntryListPost(dictionaryId, entriesListFilters);
        System.out.println(entriesListResponse.toString());
    }

    @Test
    public void test43ResourcesDictionaryEntryListPostWithMatchFilter() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String dictionaryId = getDictionaryId();
        if (dictionaryId == null) {
            System.out.println("No dictionary id found to list entry");
            return;
        }
        EntriesListMatchFilter entriesListMatchFilter = new EntriesListMatchFilter();
        List<String> inTargetLanguages = new ArrayList<String>();
        inTargetLanguages.add("fr");
        entriesListMatchFilter.setInTargetLang(inTargetLanguages);

        EntriesListFilters entriesListFilters = new EntriesListFilters();
        entriesListFilters.setMatch(entriesListMatchFilter);

        EntriesListResponse entriesListResponse = api.resourcesDictionaryEntryListPost(dictionaryId, entriesListFilters);
        System.out.println(entriesListResponse.toString());
    }

    @Test
    public void test44ResourcesDictionaryEntryAddPost() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String dictionaryId = getDictionaryId();
        if (dictionaryId == null) {
            System.out.println("No dictionary id found to add entry");
            return;
        }
        EntryAddInput entryAddInput = new EntryAddInput();
        entryAddInput.setSourceLang("en");
        entryAddInput.setTargetLang("fr");
        entryAddInput.setSource("house");
        entryAddInput.setTarget("maison");

        EntryAddBody entryAddBody = new EntryAddBody();
        entryAddBody.setEntry(entryAddInput);

        EntryAddResponse entryAddResponse = api.resourcesDictionaryEntryAddPost(dictionaryId, entryAddBody);
        System.out.println(entryAddResponse.toString());
    }

    @Test
    public void test45ResourcesDictionaryEntryUpdatePostForSource() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String dictionaryId = getDictionaryId();
        if (dictionaryId == null) {
            System.out.println("No dictionary id found to update entry");
            return;
        }
        EntriesListResponse entriesListResponse = api.resourcesDictionaryEntryListPost(dictionaryId, null);
        if (entriesListResponse.getEntries().size() == 0 || entriesListResponse.getEntries().get(0).getSourceId() == null) {
            System.out.println("No entry found to update");
            return;
        }
        String sourceId = entriesListResponse.getEntries().get(0).getSourceId();
        EntryUpdateInput entryUpdateInput = new EntryUpdateInput();
        entryUpdateInput.setSourceLang("en");
        entryUpdateInput.setTargetLang("fr");
        entryUpdateInput.setSource("home");

        EntryUpdateBody entryUpdateBody = new EntryUpdateBody();
        entryUpdateBody.setSourceId(sourceId);
        entryUpdateBody.setUpdate(entryUpdateInput);

        EntryUpdateResponse entryUpdateResponse = api.resourcesDictionaryEntryUpdatePost(dictionaryId, entryUpdateBody);
        System.out.println(entryUpdateResponse.toString());
    }

    @Test
    public void test46ResourcesDictionaryEntryUpdatePostForTarget() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String dictionaryId = getDictionaryId();
        if (dictionaryId == null) {
            System.out.println("No dictionary id found to update entry");
            return;
        }
        EntriesListResponse entriesListResponse = api.resourcesDictionaryEntryListPost(dictionaryId, null);
        if (entriesListResponse.getEntries().size() == 0 || entriesListResponse.getEntries().get(0).getSourceId() == null) {
            System.out.println("No entry found to update");
            return;
        }
        String sourceId = entriesListResponse.getEntries().get(0).getSourceId();
        String targetId = entriesListResponse.getEntries().get(0).getTargetId();
        EntryUpdateInput entryUpdateInput = new EntryUpdateInput();
        entryUpdateInput.setSourceLang("en");
        entryUpdateInput.setTargetLang("fr");
        entryUpdateInput.setTarget("batiment");

        EntryUpdateBody entryUpdateBody = new EntryUpdateBody();
        entryUpdateBody.setSourceId(sourceId);
        entryUpdateBody.setTargetId(targetId);
        entryUpdateBody.setUpdate(entryUpdateInput);

        EntryUpdateResponse entryUpdateResponse = api.resourcesDictionaryEntryUpdatePost(dictionaryId, entryUpdateBody);
        System.out.println(entryUpdateResponse.toString());
    }

    @Test
    public void test47ResourcesDictionaryEntryUpdatePostForSourceAndTarget() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String dictionaryId = getDictionaryId();
        if (dictionaryId == null) {
            System.out.println("No dictionary id found to update entry");
            return;
        }
        EntriesListResponse entriesListResponse = api.resourcesDictionaryEntryListPost(dictionaryId, null);
        if (entriesListResponse.getEntries().size() == 0 || entriesListResponse.getEntries().get(0).getSourceId() == null) {
            System.out.println("No entry found to update");
            return;
        }
        String sourceId = entriesListResponse.getEntries().get(0).getSourceId();
        String targetId = entriesListResponse.getEntries().get(0).getTargetId();
        EntryUpdateInput entryUpdateInput = new EntryUpdateInput();
        entryUpdateInput.setSourceLang("en");
        entryUpdateInput.setSource("home");

        entryUpdateInput.setTargetLang("fr");
        entryUpdateInput.setTarget("batiment");

        EntryUpdateBody entryUpdateBody = new EntryUpdateBody();
        entryUpdateBody.setSourceId(sourceId);
        entryUpdateBody.setTargetId(targetId);
        entryUpdateBody.setUpdate(entryUpdateInput);

        EntryUpdateResponse entryUpdateResponse = api.resourcesDictionaryEntryUpdatePost(dictionaryId, entryUpdateBody);
        System.out.println(entryUpdateResponse.toString());
    }

    @Test
    public void test51ResourcesDictionaryEntryDeletePost() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        String dictionaryId = getDictionaryId();
        if (dictionaryId == null) {
            System.out.println("No dictionary id found to delete entry");
            return;
        }
        EntriesListResponse entriesListResponse = api.resourcesDictionaryEntryListPost(dictionaryId, null);
        if (entriesListResponse.getEntries().size() == 0 || entriesListResponse.getEntries().get(0).getSourceId() == null) {
            System.out.println("No entry found to delete");
            return;
        }
        String sourceId = entriesListResponse.getEntries().get(0).getSourceId();
        EntryDeleteInput entryDeleteInput = new EntryDeleteInput();
        entryDeleteInput.setSourceId(sourceId);

        EntryDeleteBody entryDeleteBody = new EntryDeleteBody();
        entryDeleteBody.setEntry(entryDeleteInput);

        EntryDeleteResponse entryDeleteResponse = api.resourcesDictionaryEntryDeletePost(dictionaryId, entryDeleteBody);
        System.out.println(entryDeleteResponse.toString());
    }

    @Test
    public void test52ResourcesDictionaryDeletePost() throws ApiException, IOException {
        DictionaryApi api = getDictionaryApi();
        DictionariesListMatchFilter dictionariesListMatchFilter = new DictionariesListMatchFilter();
        dictionariesListMatchFilter.setRegexName("javaClientTest");

        DictionariesListFilters dictionariesListFilters = new DictionariesListFilters();
        dictionariesListFilters.setMatch(dictionariesListMatchFilter);

        DictionariesListResponse dictionariesListResponse = api.resourcesDictionaryListPost(dictionariesListFilters);
        List<DictionaryOutput> dictionaries = dictionariesListResponse.getDictionaries();
        if (dictionaries.size() == 0) {
            System.out.println("No dictionary found to delete");
            return;
        }

        int i = 0;
        while (i < dictionaries.size()) {
            String dictionaryId = dictionaries.get(i).getId();
            if (dictionaryId != null) {
                api.resourcesDictionaryDeletePost(dictionaryId);
                System.out.println("dictionaryId " + dictionaryId + " has been deleted successfully");
            }
            i++;
        }
    }
}
