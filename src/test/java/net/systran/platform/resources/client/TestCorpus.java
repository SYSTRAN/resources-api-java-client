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

public class TestCorpus {
    public static CorpusApi getCorpusApi() throws IOException {
        ApiClient apc = new ApiClient();
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) apc.getAuthentication("apiKey");
        String apiKey = ApiClient.LoadAPIKey(".//apiKey.txt");
        apiKeyAuth.setApiKey(apiKey);
        return new CorpusApi(apc);
    }

    @Test
    public void testResourcesCorpusListGet() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        CorpusListResponse corpusListResponse = api.resourcesCorpusListGet(null, null, null, null, null, null, null);
        System.out.println(corpusListResponse.toString());
    }

    @Test
    public void testResourcesCorpusListGetWithSourceAndTarget() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String source = "en";
        String target = "fr";
        CorpusListResponse corpusListResponse = api.resourcesCorpusListGet(source, target, null, null, null, null, null);
        System.out.println(corpusListResponse.toString());
    }

    @Test
    public void testResourcesCorpusListGetWithPrefix() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String prefix = "testImport";
        CorpusListResponse corpusListResponse = api.resourcesCorpusListGet(null, null, null, null, prefix, null, null);
        System.out.println(corpusListResponse.toString());
    }

    @Test
    public void testResourcesCorpusAddPost() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String name = "testAddCorpus";
        String lang = "en";
        CorpusAddResponse corpusAddResponse = api.resourcesCorpusAddPost(name, lang, null, null);
        System.out.println(corpusAddResponse.toString());
    }

    @Test
    public void testResourcesCorpusImportPost() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String name = "testImport";
        String input = "#TM\n" +
                "#EN\tFR\n" +
                "This is a test \t Ceci est un test";
        String format = "text/bitext";
        CorpusImportResponse corpusImportResponse = api.resourcesCorpusImportPost(name, input, null, format, null, null);
        System.out.println(corpusImportResponse.toString());
    }

    @Test
    public void testResourcesCorpusImportPostWithFile() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String name = "testFileImport";
        File inputFile = new File(".//src//test//java//net//systran//platform//resources//client//corpus.txt");
        String format = "text/bitext";
        CorpusImportResponse corpusImportResponse = api.resourcesCorpusImportPost(name, null, inputFile, format, null, null);
        System.out.println(corpusImportResponse.toString());
    }

    @Test
    public void testResourcesCorpusExistsGet() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String name = "testImport";
        CorpusExistsResponse corpusExistsResponse = api.resourcesCorpusExistsGet(name, null);
        System.out.println(corpusExistsResponse.toString());
    }

    @Test
    public void testResourcesCorpusDetailsGet() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String id = "55b62288158ad061c6aaa509";

        System.out.println("Use a valid 'id' and uncomment below codes to test");
        //CorpusDetailResponse corpusDetailResponse = api.resourcesCorpusDetailsGet(id, null);
        //System.out.println(corpusDetailResponse.toString());
    }

    @Test
    public void testResourcesCorpusExportGet() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String id = "55b62288158ad061c6aaa509";

        System.out.println("Use a valid 'id' and uncomment below codes to test");
        /*InputStream in = api.resourcesCorpusExportGet(id, null, null);
        File out = new File (".//src//test//java//net//systran//platform//resources//client//exportedCorpus.xml");
        FileUtils.copyInputStreamToFile(in, out);
        System.out.println("exported corpus in : " + out.getAbsolutePath());*/
    }

    @Test
    public void testResourcesCorpusExportGetWithFormat() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String id = "55b62288158ad061c6aaa509";
        String format = "text/bitext";

        System.out.println("Use a valid 'id' and uncomment below codes to test");
        /*InputStream in = api.resourcesCorpusExportGet(id, format, null);
        File out = new File (".//src//test//java//net//systran//platform//resources//client//exportedCorpus.txt");
        FileUtils.copyInputStreamToFile(in, out);
        System.out.println("exported corpus in : " + out.getAbsolutePath());*/
    }

    @Test
    public void testResourcesCorpusDeleteGet() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        List<String> corpusIds = new ArrayList<String>();
        corpusIds.add("55b6222e158ad061c6aaa505");

        System.out.println("Use a valid 'corpusIds' and uncomment below codes to test");
        //CorpusDeleteResponse corpusDeleteResponse = api.resourcesCorpusDeletePost(corpusIds, null);
        //System.out.println(corpusDeleteResponse.toString());
    }

    @Test
    public void testResourcesCorpusUpdatePost() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String id = "55b62288158ad061c6aaa509";
        String name = "testImportJavaClient";

        System.out.println("Use a valid 'id' and uncomment below codes to test");
        //CorpusUpdateResponse corpusUpdateResponse = api.resourcesCorpusUpdatePost(id, name, null, null);
        //System.out.println(corpusUpdateResponse.toString());
    }

    @Test
    public void testResourcesCorpusSegmentListGet() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String id = "55b62288158ad061c6aaa509";

        System.out.println("Use a valid 'id' and uncomment below codes to test");
        //CorpusSegmentListResponse corpusSegmentListResponse = api.resourcesCorpusSegmentListGet(id, null, null, null);
        //System.out.println(corpusSegmentListResponse.toString());
    }

    @Test
    public void testResourcesCorpusSegmentAddPost() throws ApiException, IOException {
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
        corpusSegmentAddRequest.setCorpusId("55b62288158ad061c6aaa509");
        corpusSegmentAddRequest.setSegments(listCorpusAddSegment);

        System.out.println("Use a valid 'id' and uncomment below codes to test");
        //CorpusSegmentAddResponse corpusSegmentAddResponse = api.resourcesCorpusSegmentAddPost(corpusSegmentAddRequest, null);
        //System.out.println(corpusSegmentAddResponse.toString());
    }

    @Test
    public void testResourcesCorpusSegmentDeletePost() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String id = "55b62288158ad061c6aaa509";
        List<String> segmentIds = new ArrayList<String>();
        segmentIds.add("55b62288158ad061c6aaa508.55c0dda6fd400171d6f8428d");

        System.out.println("Use a valid 'id', 'segmentIds' and uncomment below codes to test");
        //CorpusSegmentDeleteResponse corpusSegmentDeleteResponse = api.resourcesCorpusSegmentDeletePost(id, segmentIds, null);
        //System.out.println(corpusSegmentDeleteResponse.toString());
    }

    @Test
    public void testResourcesCorpusSegmentUpdatePostForSource() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String id = "55b62288158ad061c6aaa509";
        String segId = "55b62288158ad061c6aaa508.55c0df68fd400171d6f84290";
        String source = "This is a very beautiful house";

        System.out.println("Use a valid 'id', 'segId' and uncomment below codes to test");
        //CorpusSegmentUpdateResponse corpusSegmentUpdateResponse = api.resourcesCorpusSegmentUpdatePost(id, segId, source, null, null, null, null);
        //System.out.println(corpusSegmentUpdateResponse.toString());
    }

    @Test
    public void testResourcesCorpusSegmentUpdatePostForTarget() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String id = "55b62288158ad061c6aaa509";
        String segId = "55b62288158ad061c6aaa508.55c0df68fd400171d6f84290";
        String targetId = "55c0df68fd400171d6f84291";
        String targetLang = "fr";
        String targetText = "Ceci est une très belle maison";

        System.out.println("Use a valid 'id', 'segId', 'targetId' and uncomment below codes to test");
        //CorpusSegmentUpdateResponse corpusSegmentUpdateResponse = api.resourcesCorpusSegmentUpdatePost(id, segId, null, targetId, targetText, targetLang, null);
        //System.out.println(corpusSegmentUpdateResponse.toString());
    }

    @Test
    public void testResourcesCorpusSegmentTargetAddPost() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String id = "55b62288158ad061c6aaa509";
        String segId = "55b62288158ad061c6aaa508.55c0df68fd400171d6f84290";

        CorpusAddSegmentTarget corpusAddSegmentTarget = new CorpusAddSegmentTarget();
        corpusAddSegmentTarget.setLang("fr");
        corpusAddSegmentTarget.setTarget("C'est une magnifique maison");

        List<CorpusAddSegmentTarget> corpusAddSegmentTargetList = new ArrayList<CorpusAddSegmentTarget>();
        corpusAddSegmentTargetList.add(corpusAddSegmentTarget);

        CorpusSegmentAddTargetRequest corpusSegmentAddTargetRequest = new CorpusSegmentAddTargetRequest();
        corpusSegmentAddTargetRequest.setCorpusId(id);
        corpusSegmentAddTargetRequest.setSegId(segId);
        corpusSegmentAddTargetRequest.setTargets(corpusAddSegmentTargetList);

        System.out.println("Use a valid 'id', 'segId' and uncomment below codes to test");
        //CorpusSegmentAddTargetResponse corpusSegmentAddTargetResponse = api.resourcesCorpusSegmentTargetAddPost(corpusSegmentAddTargetRequest, null);
        //System.out.println(corpusSegmentAddTargetResponse.toString());
    }

    @Test
    public void testResourcesCorpusSegmentTargetDeletePost() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String id = "55b62288158ad061c6aaa509";
        String segId = "55b62288158ad061c6aaa508.55c0dda6fd400171d6f8428d";
        List<String> targetIds = new ArrayList<String>();
        targetIds.add("55c0e342fd400171d6f842912");

        System.out.println("Use a valid 'id', 'segId', 'targetIds' and uncomment below codes to test");
        //CorpusSegmentDeleteTargetResponse corpusSegmentDeleteTargetResponse = api.resourcesCorpusSegmentTargetDeletePost(id, segId, targetIds, null);
        //System.out.println(corpusSegmentDeleteTargetResponse.toString());
    }

    @Test
    public void testResourcesCorpusMatchGet() throws ApiException, IOException {
        CorpusApi api = getCorpusApi();
        String source = "en";
        String target = "fr";

        List<String> corpusIds = new ArrayList<String>();
        corpusIds.add("55b62288158ad061c6aaa509");

        List<String> inputs = new ArrayList<String>();
        inputs.add("This is a test");
        inputs.add("This is a beautiful house");

        System.out.println("Use a valid 'id' and uncomment below codes to test");
        //CorpusMatchResponse corpusMatchResponse = api.resourcesCorpusMatchGet(corpusIds, inputs, source, target, null, null, null);
        //System.out.println(corpusMatchResponse.toString());
    }
}
