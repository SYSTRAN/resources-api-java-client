package net.systran.platform.resources.client;

import net.systran.platform.resources.client.api.CorpusApi;
import net.systran.platform.resources.client.auth.ApiKeyAuth;
import net.systran.platform.resources.client.model.*;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import static junit.framework.TestCase.assertNotNull;

import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCorpus {
    public static CorpusApi getCorpusApi() throws IOException {
        ApiClient apc = new ApiClient();
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) apc.getAuthentication("apiKey");
        String apiKey = ApiClient.LoadAPIKey(".//apiKey.txt");
        apiKeyAuth.setApiKey(apiKey);
        return new CorpusApi(apc);
    }

    @Test
    public void test11CleanExistedCorpus() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        List<String> corpusIds = new ArrayList<String>();
        String prefix = "javaClientTest";
        CorpusListResponse corpusListResponse = api.resourcesCorpusListGet(null, null, null, null, prefix, null, null);
        List<Corpus> corpus = corpusListResponse.getFiles();
        if (corpus.size() > 0) {
            int i = 0;
            while (i < corpus.size()) {
                if (corpus.get(i).getId() != null) {
                    corpusIds.add(corpus.get(i).getId());
                }
                i++;
            }

            if (corpusIds.size() > 0) {
                CorpusDeleteResponse corpusDeleteResponse = api.resourcesCorpusDeletePost(corpusIds, null);
                System.out.println(corpusDeleteResponse.toString());
            }
        }
    }

    @Test
    public void test12ResourcesCorpusListGet() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        CorpusListResponse corpusListResponse = api.resourcesCorpusListGet(null, null, null, null, null, null, null);
        System.out.println(corpusListResponse.toString());
    }

    @Test
    public void test21ResourcesCorpusAddPost() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String lang = "en";
        String name = "javaClientTestAddCorpus";
        CorpusAddResponse corpusAddResponse = api.resourcesCorpusAddPost(name, lang, null, null);
        System.out.println(corpusAddResponse.toString());
    }

    @Test
    public void test22ResourcesCorpusImportPost() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String input = "#TM\n" +
                "#EN\tFR\n" +
                "This is a test \t Ceci est un test";
        String format = "text/bitext";
        String name = "javaClientTestImportCorpus";
        CorpusImportResponse corpusImportResponse = api.resourcesCorpusImportPost(name, input, null, format, null, null);
        System.out.println(corpusImportResponse.toString());
    }

    @Test
    public void test23ResourcesCorpusImportPostWithFile() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        File inputFile = new File(".//src//test//java//net//systran//platform//resources//client//corpus.txt");
        String format = "text/bitext";
        String name = "javaClientTestFileImport";
        CorpusImportResponse corpusImportResponse = api.resourcesCorpusImportPost(name, null, inputFile, format, null, null);
        System.out.println(corpusImportResponse.toString());
    }

    @Test
    public void test31ResourcesCorpusListGetWithSourceAndTarget() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String source = "en";
        String target = "fr";
        CorpusListResponse corpusListResponse = api.resourcesCorpusListGet(source, target, null, null, null, null, null);
        System.out.println(corpusListResponse.toString());
    }

    public String getAnCorpusIdByPrefix(String prefix) throws IOException, ApiException {
        CorpusApi api = getCorpusApi();
        CorpusListResponse corpusListResponse = api.resourcesCorpusListGet(null, null, null, null, prefix, null, null);
        String id = null;
        if (corpusListResponse.getFiles().size() > 0) {
            id = corpusListResponse.getFiles().get(0).getId();
        }
        return id;
    }

    @Test
    public void test32ResourcesCorpusListGetWithPrefix() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String prefix = "javaClientTest";
        CorpusListResponse corpusListResponse = api.resourcesCorpusListGet(null, null, null, null, prefix, null, null);
        System.out.println(corpusListResponse.toString());
    }

    @Test
    public void test33ResourcesCorpusExistsGet() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String name = "javaClientTestAddCorpus";
        CorpusExistsResponse corpusExistsResponse = api.resourcesCorpusExistsGet(name, null);
        System.out.println(corpusExistsResponse.toString());
    }

    @Test
    public void test34ResourcesCorpusDetailsGet() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String id = getAnCorpusIdByPrefix("javaClientTest");
        if (id == null) {
            System.out.println("No corpus id found to get detail information");
            return;
        }
        CorpusDetailResponse corpusDetailResponse = api.resourcesCorpusDetailsGet(id, null);
        assertNotNull(corpusDetailResponse);
        System.out.println(corpusDetailResponse.toString());
    }

    @Test
    public void test35ResourcesCorpusExportGet() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String id = getAnCorpusIdByPrefix("javaClientTest");
        if (id == null) {
            System.out.println("No corpus id found to export data");
            return;
        }
        InputStream in = api.resourcesCorpusExportGet(id, null, null);
        File out = new File (".//src//test//java//net//systran//platform//resources//client//exportedCorpus.xml");
        FileUtils.copyInputStreamToFile(in, out);
        System.out.println("exported corpus in : " + out.getAbsolutePath());
    }

    @Test
    public void test36ResourcesCorpusExportGetWithFormat() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String id = getAnCorpusIdByPrefix("javaClientTest");
        if (id == null) {
            System.out.println("No corpus id found to export data");
            return;
        }
        String format = "text/bitext";
        InputStream in = api.resourcesCorpusExportGet(id, format, null);
        File out = new File (".//src//test//java//net//systran//platform//resources//client//exportedCorpus.txt");
        FileUtils.copyInputStreamToFile(in, out);
        System.out.println("exported corpus in : " + out.getAbsolutePath());
    }

    @Test
    public void test37ResourcesCorpusUpdatePost() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String id = getAnCorpusIdByPrefix("javaClientTest");
        if (id == null) {
            System.out.println("No corpus id found to update data");
            return;
        }
        String name = "javaClientTestUpdatedName";
        CorpusUpdateResponse corpusUpdateResponse = api.resourcesCorpusUpdatePost(id, name, null, null);
        System.out.println(corpusUpdateResponse.toString());
    }

    @Test
    public void test41ResourcesCorpusSegmentListGet() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String id = getAnCorpusIdByPrefix("javaClientTest");
        if (id == null) {
            System.out.println("No corpus id found to get segment list");
            return;
        }
        CorpusSegmentListResponse corpusSegmentListResponse = api.resourcesCorpusSegmentListGet(id, null, null, null);
        System.out.println(corpusSegmentListResponse.toString());
    }

    @Test
    public void test42ResourcesCorpusSegmentAddPost() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();

        CorpusAddSegmentTarget corpusAddSegmentTarget = new CorpusAddSegmentTarget();
        corpusAddSegmentTarget.setLang("fr");
        corpusAddSegmentTarget.setTarget("C'est une belle maison");

        List<CorpusAddSegmentTarget> listSegmentTargets = new ArrayList<CorpusAddSegmentTarget>();
        listSegmentTargets.add(corpusAddSegmentTarget);

        CorpusAddSegment corpusAddSegment = new CorpusAddSegment();
        corpusAddSegment.setLang("en");
        corpusAddSegment.setSource("This is a beautiful house");
        corpusAddSegment.setTargets(listSegmentTargets);

        List<CorpusAddSegment> listCorpusAddSegment = new ArrayList<CorpusAddSegment>();
        listCorpusAddSegment.add(corpusAddSegment);

        CorpusSegmentAddRequest corpusSegmentAddRequest = new CorpusSegmentAddRequest();
        String id = getAnCorpusIdByPrefix("javaClientTest");
        if (id == null) {
            System.out.println("No corpus id found to add a segment");
            return;
        }
        corpusSegmentAddRequest.setCorpusId(id);
        corpusSegmentAddRequest.setSegments(listCorpusAddSegment);

        CorpusSegmentAddResponse corpusSegmentAddResponse = api.resourcesCorpusSegmentAddPost(corpusSegmentAddRequest, null);
        System.out.println(corpusSegmentAddResponse.toString());
    }

    @Test
    public void test43ResourcesCorpusSegmentUpdatePostForSource() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String id = getAnCorpusIdByPrefix("javaClientTest");
        if (id == null) {
            System.out.println("No corpus id found to update a segment");
            return;
        }
        CorpusSegmentListResponse corpusSegmentListResponse = api.resourcesCorpusSegmentListGet(id, null, null, null);
        List<CorpusSegment> segments = corpusSegmentListResponse.getSegments();
        if (segments.size() == 0 || segments.get(0).getId() == null) {
            System.out.println("No segment found to update");
            return;
        }
        String segId = segments.get(0).getId();
        String source = "This is a very beautiful house";
        CorpusSegmentUpdateResponse corpusSegmentUpdateResponse = api.resourcesCorpusSegmentUpdatePost(id, segId, source, null, null, null, null);
        System.out.println(corpusSegmentUpdateResponse.toString());
    }

    @Test
    public void test44ResourcesCorpusSegmentUpdatePostForTarget() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String id = getAnCorpusIdByPrefix("javaClientTest");
        if (id == null) {
            System.out.println("No corpus id found to update a segment");
            return;
        }
        CorpusSegmentListResponse corpusSegmentListResponse = api.resourcesCorpusSegmentListGet(id, null, null, null);
        List<CorpusSegment> segments = corpusSegmentListResponse.getSegments();
        if (segments.size() == 0 || segments.get(0).getId() == null) {
            System.out.println("No segment found to update");
            return;
        }

        CorpusSegment segment = segments.get(0);
        String segId = segment.getId();

        if (segment.getTargets().size() == 0 || segment.getTargets().get(0).getId() == null) {
            System.out.println("No target found in segment to update");
            return;
        }
        String targetId = segment.getTargets().get(0).getId();
        String targetLang = "fr";
        String targetText = "Ceci est une très belle maison";

        CorpusSegmentUpdateResponse corpusSegmentUpdateResponse = api.resourcesCorpusSegmentUpdatePost(id, segId, null, targetId, targetText, targetLang, null);
        System.out.println(corpusSegmentUpdateResponse.toString());
    }

    @Test
    public void test45ResourcesCorpusSegmentTargetAddPost() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String id = getAnCorpusIdByPrefix("javaClientTest");
        if (id == null) {
            System.out.println("No corpus id found to add a target to segment");
            return;
        }
        CorpusSegmentListResponse corpusSegmentListResponse = api.resourcesCorpusSegmentListGet(id, null, null, null);
        List<CorpusSegment> segments = corpusSegmentListResponse.getSegments();
        if (segments.size() == 0 || segments.get(0).getId() == null) {
            System.out.println("No segment found to update");
            return;
        }
        String segId = segments.get(0).getId();

        CorpusAddSegmentTarget corpusAddSegmentTarget = new CorpusAddSegmentTarget();
        corpusAddSegmentTarget.setLang("fr");
        corpusAddSegmentTarget.setTarget("C'est une magnifique maison");

        List<CorpusAddSegmentTarget> corpusAddSegmentTargetList = new ArrayList<CorpusAddSegmentTarget>();
        corpusAddSegmentTargetList.add(corpusAddSegmentTarget);

        CorpusSegmentAddTargetRequest corpusSegmentAddTargetRequest = new CorpusSegmentAddTargetRequest();
        corpusSegmentAddTargetRequest.setCorpusId(id);
        corpusSegmentAddTargetRequest.setSegId(segId);
        corpusSegmentAddTargetRequest.setTargets(corpusAddSegmentTargetList);

        CorpusSegmentAddTargetResponse corpusSegmentAddTargetResponse = api.resourcesCorpusSegmentTargetAddPost(corpusSegmentAddTargetRequest, null);
        System.out.println(corpusSegmentAddTargetResponse.toString());
    }

    @Test
    public void test51ResourcesCorpusMatchGet() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String source = "en";
        String target = "fr";

        List<String> corpusIds = new ArrayList<String>();
        String id = getAnCorpusIdByPrefix("javaClientTest");
        if (id == null) {
            System.out.println("No corpus id found for match operation");
            return;
        }
        corpusIds.add(id);

        List<String> inputs = new ArrayList<String>();
        inputs.add("This is a test");
        inputs.add("This is a beautiful house");

        CorpusMatchResponse corpusMatchResponse = api.resourcesCorpusMatchGet(corpusIds, inputs, source, target, null, null, null);
        System.out.println(corpusMatchResponse.toString());
    }

    @Test
    public void test61ResourcesCorpusSegmentTargetDeletePost() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String id = getAnCorpusIdByPrefix("javaClientTest");
        if (id == null) {
            System.out.println("No corpus id found to delete a target in segment");
            return;
        }
        CorpusSegmentListResponse corpusSegmentListResponse = api.resourcesCorpusSegmentListGet(id, null, null, null);
        List<CorpusSegment> segments = corpusSegmentListResponse.getSegments();
        if (segments.size() == 0 || segments.get(0).getId() == null) {
            System.out.println("No segment found to delete target");
            return;
        }

        CorpusSegment segment = segments.get(0);
        String segId = segment.getId();

        if (segment.getTargets().size() == 0 || segment.getTargets().get(0).getId() == null) {
            System.out.println("No target found in segment to delete");
            return;
        }
        String targetId = segment.getTargets().get(0).getId();
        List<String> targetIds = new ArrayList<String>();
        targetIds.add(targetId);

        CorpusSegmentDeleteTargetResponse corpusSegmentDeleteTargetResponse = api.resourcesCorpusSegmentTargetDeletePost(id, segId, targetIds, null);
        System.out.println(corpusSegmentDeleteTargetResponse.toString());
    }

    @Test
    public void test62ResourcesCorpusSegmentDeletePost() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String id = getAnCorpusIdByPrefix("javaClientTest");
        if (id == null) {
            System.out.println("No corpus id found to delete a segment");
            return;
        }
        CorpusSegmentListResponse corpusSegmentListResponse = api.resourcesCorpusSegmentListGet(id, null, null, null);
        List<CorpusSegment> segments = corpusSegmentListResponse.getSegments();
        if (segments.size() == 0 || segments.get(0).getId() == null) {
            System.out.println("No segment found to delete");
            return;
        }
        String segId = segments.get(0).getId();
        List<String> segmentIds = new ArrayList<String>();
        segmentIds.add(segId);

        CorpusSegmentDeleteResponse corpusSegmentDeleteResponse = api.resourcesCorpusSegmentDeletePost(id, segmentIds, null);
        System.out.println(corpusSegmentDeleteResponse.toString());
    }

    @Test
    public void test63ResourcesCorpusDeleteGet() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        List<String> corpusIds = new ArrayList<String>();
        String prefix = "javaClientTest";
        CorpusListResponse corpusListResponse = api.resourcesCorpusListGet(null, null, null, null, prefix, null, null);
        List<Corpus> corpus = corpusListResponse.getFiles();
        if (corpus.size() == 0) {
            System.out.println("No corpus id found to delete");
            return;
        }

        int i = 0;
        while (i < corpus.size()) {
            if (corpus.get(i).getId() != null) {
                corpusIds.add(corpus.get(i).getId());
            }
            i++;
        }

        if (corpusIds.size() == 0) {
            System.out.println("No corpus id found to delete");
            return;
        }

        CorpusDeleteResponse corpusDeleteResponse = api.resourcesCorpusDeletePost(corpusIds, null);
        System.out.println(corpusDeleteResponse.toString());
    }
}
