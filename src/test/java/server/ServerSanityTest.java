//package server;
//
//import com.mashape.unirest.http.HttpResponse;
//import com.mashape.unirest.http.JsonNode;
//import com.mashape.unirest.http.Unirest;
//import com.mashape.unirest.http.exceptions.UnirestException;
//import java.io.IOException;
//
//
//public class ServerSanityTest {
//
//    @Before
//    public  void setup() throws IOException {
//
//    }
//
//
//    @Test
//    public void testLogin() throws UnirestException, NoSuchFieldException {
//        HttpResponse<JsonNode> request = Unirest.post("https://" + PropsReader.getPropValuesForEnv("server.api.url") + "/user/login")
//                .header("Content-Type","application/json")
//                .body("{\n" +
//                        "  \"header\": {\n" +
//                        "    \"version\": \"1.8.0\",\n" +
//                        "    \"av\": \"1.0\",\n" +
//                        "    \"lang\": \"he\",\n" +
//                        "    \"platform\": \"web\",\n" +
//                        "    \"client\": \"web\",\n" +
//                        "    \"os\": \"mac os 10.14.0\",\n" +
//                        "    \"device\": \"macintel\",\n" +
//                        "    \"browser\": \"chrome 69\"\n" +
//                        "  },\n" +
//                        "  \"payload\": {\n" +
//                        "    \"email\": \"israel@bring-bring.co.il\",\n" +
//                        "    \"password\": \"1234567Q\",\n" +
//                        "    \"storeId\": \"5b9f8a588182a0294756308e\"\n" +
//                        "  }\n" +
//                        "}")
//                .asJson();
//        Assert.assertEquals(request.getStatus(),200);
//        Assert.assertFalse((boolean) request.getBody().getObject().getJSONObject("data").get("getOffers"));
//        log4j.info(request.getBody().getObject().getJSONObject("data").get("getOffers"));
//
//    }
//
//    @Test
//    public void testEditUser() throws UnirestException {
//        HttpResponse<JsonNode> request = null;
//        try {
//            request = Unirest.post("https://" + PropsReader.getPropValuesForEnv("server.api.url") + "/user/edit")
//                    .header("Content-Type","application/json")
//                    .header("authorization", (String) returnLoginToken())
//                    .body("{\"header\":{\"version\":\"1.8.0\",\"av\":\"1.0\",\"lang\":\"he\",\"platform\":\"web\",\"client\":\"web\",\"os\":\"mac os 10.14.0\",\"device\":\"macintel\",\"browser\":\"chrome 70\",\"userId\":\"1h0cl63l2jecw1rge\"},\"payload\":{\"id\":\"1h0cl63l2jecw1rge\",\"name\":{\"first\":\"qq\",\"last\":\"qq\"},\"addresses\":[{\"city\":\"ירושלים\",\"street\":\"הר הצופים\",\"entrance\":\"5\",\"building\":\"4\",\"floor\":\"2\",\"apartment\":\"2\"}],\"phone\":\"0054560363\",\"phoneB\":\"\",\"storeId\":\"5a004dcb15def03fdababc46\"}}")
//                    .asJson();
//        } catch (UnirestException e) {
//            e.printStackTrace();
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        }
//        Assert.assertEquals(request.getStatus(),200);
//
//    }
//
//    public Object returnLoginToken() throws UnirestException, NoSuchFieldException {
//            HttpResponse<JsonNode> request = Unirest.post("https://" + PropsReader.getPropValuesForEnv("server.api.url") + "/user/login")
//                    .header("Content-Type","application/json")
//                    .body("{\n" +
//                            "  \"header\": {\n" +
//                            "    \"version\": \"1.8.0\",\n" +
//                            "    \"av\": \"1.0\",\n" +
//                            "    \"lang\": \"he\",\n" +
//                            "    \"platform\": \"web\",\n" +
//                            "    \"client\": \"web\",\n" +
//                            "    \"os\": \"mac os 10.14.0\",\n" +
//                            "    \"device\": \"macintel\",\n" +
//                            "    \"browser\": \"chrome 69\"\n" +
//                            "  },\n" +
//                            "  \"payload\": {\n" +
//                            "    \"email\": \"israel@bring-bring.co.il\",\n" +
//                            "    \"password\": \"1234567Q\",\n" +
//                            "    \"storeId\": \"5b9f8a588182a0294756308e\"\n" +
//                            "  }\n" +
//                            "}")
//                    .asJson();
//            Assert.assertEquals(request.getStatus(),200);
//        return request.getBody().getObject().getJSONObject("data").get("loginToken");
//
//    }
//}
//
