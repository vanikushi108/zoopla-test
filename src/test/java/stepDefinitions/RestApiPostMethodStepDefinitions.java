package stepDefinitions;

import com.jayway.restassured.RestAssured;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.apache.commons.lang.RandomStringUtils;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

/**
 * Created by vanithakasala on 26/05/2016.
 */
public class RestApiPostMethodStepDefinitions {
    String randomString = RandomStringUtils.randomAlphabetic(10);

    @Given("^I access rest api post method1$")
    public void I_access_rest_api_post_method1() throws Throwable {

        System.out.println("rest API post example");

        RestAssured
                .given()
                    .contentType("application/json")
                    .body("[\n" +
                        "    {\n" +
                        "    \"_mid\": \"5735b863ad9a6303001d62112\",\n" +
                        "    \"messageName\": \"restapi-sentinvoice\",\n" +
                        "    \"description\": \"VanithaInvoice999\",\n" +
                        "    \"reference\": \"0011\",\n" +
                        "    \"net_amount\": 100001,\n" +
                        "    \"gross_amount\": 120001,\n" +
                        "    \"payment_term\": \"30\",\n" +
                        "    \"sent\": \"2016-05-13T11:20:03.730Z\",\n" +
                        "    \"is_deleted\": false,\n" +
                        "    \"folders\": [\n" +
                        "      {\n" +
                        "        \"name\": \"todo\",\n" +
                        "        \"date\": \"2016-05-13T11:20:03.730Z\"\n" +
                        "      }\n" +
                        "    ],\n" +
                        "    \"freelancersBusinessId\": \"5735b39a6af6d503004a02c9\",\n" +
                        "    \"from\": {\n" +
                        "      \"contact\": \"vanikushi999@mailinator.com\",\n" +
                        "      \"business\": {\n" +
                        "        \"vat-registration\": {\n" +
                        "          \"id\": \"5735b39b6af6d503004a02ca\",\n" +
                        "          \"freelancersBusinessId\": \"5735b39a6af6d503004a02c9\",\n" +
                        "          \"is_registered\": true,\n" +
                        "          \"registration_number\": \"6677\"\n" +
                        "        },\n" +
                        "        \"post_code\": \"fffghhhgg\",\n" +
                        "        \"registration_number\": \"fgghhgff\",\n" +
                        "        \"address_line_2\": \"drffggfdd\",\n" +
                        "        \"freelancerId\": \"5735b3976af6d503004a02c8\",\n" +
                        "        \"town\": \"dgghhhyg\",\n" +
                        "        \"logo\": \"https://s3-eu-west-1.amazonaws.com/hq-image-uploads/9A92DBDA-FE86-4C68-8E9E-4FA150CAD885.png\",\n" +
                        "        \"documents_folder\": \"/cfa7e0d0-8985-45aa-a2ea-3e32ff55e7fd/My Albert\",\n" +
                        "        \"bank-account\": {\n" +
                        "          \"id\": \"5735b39b6af6d503004a02cb\",\n" +
                        "          \"sort_code\": \"11-11-11\",\n" +
                        "          \"freelancersBusinessId\": \"5735b39a6af6d503004a02c9\",\n" +
                        "          \"account_number\": \"11228899\"\n" +
                        "        },\n" +
                        "        \"county\": \"cgrresrfgg\",\n" +
                        "        \"shared_link\": \"https://www.dropbox.com/sh/wpmges4qumdxyvj/AABx4nKDbkTouJZPcVUicKI5a?dl=0\",\n" +
                        "        \"country\": \"\",\n" +
                        "        \"address_line_1\": \"trefftrtggg\",\n" +
                        "        \"name\": \"Ggggggg\"\n" +
                        "      }\n" +
                        "    },\n" +
                        "    \"reference_components\": {\n" +
                        "      \"prefix\": \"\",\n" +
                        "      \"counter\": \"001\"\n" +
                        "    },\n" +
                        "    \"to\": {\n" +
                        "      \"contact\": \"vanikushi999@mailinator.com\",\n" +
                        "      \"business\": {\n" +
                        "        \"county\": \"\",\n" +
                        "        \"post_code\": \"CO10 7BQ\",\n" +
                        "        \"country\": \"\",\n" +
                        "        \"registration_number\": \"09491483\",\n" +
                        "        \"town\": \"SUDBURY\",\n" +
                        "        \"address_line_1\": \"THRUMS\",\n" +
                        "        \"address_line_2\": \"FOWES LANE\",\n" +
                        "        \"name\": \"V  COLL PRE COMMISSIONING SERVICES LTD\"\n" +
                        "      }\n" +
                        "    },\n" +
                        "    \"id\": \"5735b863ad9a6303001d62112\"\n" +
                        "  }\n" +
                        "]")
                .when()
                    .post("https://spiderpig-staging.herokuapp.com/api/messages")
                .then()
                    .statusCode(200)
                    .body("_mid", hasItems("5735b863ad9a6303001d62112"))
                    .body("from.business.bank-account.sort_code", hasItems("11-11-11"))
                    .body("from.business.bank-account.account_number", hasItems("11228899"))
                    .body(containsString("VanithaInvoice999"))
                    .body("from.contact", hasItems("vanikushi999@mailinator.com"));
    }

    @Then("^We should get response (\\d+) OK for post method$")
    public void we_should_get_response_OK_for_post_method(int arg1) throws Throwable {

    }

    @Given("^Rest API Post generate JSON from Hash Map \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void i_access_rest_api_post_method_create_invoice_from_examples_CEN_Vanitha_Kasala_CenturyIn(String midValue, String invoice, String firstName, String lastName, String businessName, String sortCode, String AccountNum, String netAmount) throws Throwable {


        System.out.println("Creating JSON from a HashMap");

        /* Create JSON from a HashMap */
        Map<String, Object> jsonAsMapInvoice = new HashMap<String, Object>();

        jsonAsMapInvoice.put("_mid", randomString);
        jsonAsMapInvoice.put("messageName", "restapi-sentinvoice");
        jsonAsMapInvoice.put("description", invoice);
        jsonAsMapInvoice.put("messageName", "restapi-sentinvoice");
        jsonAsMapInvoice.put("description", "Invoice21");
        jsonAsMapInvoice.put("reference", "0011");
        jsonAsMapInvoice.put("net_amount", netAmount);
        jsonAsMapInvoice.put("gross_amount", 12000);
        jsonAsMapInvoice.put("payment_term", "2016-05-13T11:20:03.730Z");
        jsonAsMapInvoice.put("is_deleted", false);
        jsonAsMapInvoice.put("folders.name", "todo");
        jsonAsMapInvoice.put("folders.date", "2016-05-13T11:20:03.730Z");
        jsonAsMapInvoice.put("freelancersBusinessId", "5735b39a6af6d503004a02c9");
        jsonAsMapInvoice.put("from.contact", "vanith4561@mailinator.com");
        jsonAsMapInvoice.put("from.business.vat-registration.id", "5735b39b6af6d503004a02ca");
        jsonAsMapInvoice.put("from.business.vat-registration.freelancersBusinessId", "5735b39a6af6d503004a02c9");
        jsonAsMapInvoice.put("from.business.vat-registration.is_registered", true);
        jsonAsMapInvoice.put("from.business.vat-registration.registration_number", "6677");
        jsonAsMapInvoice.put("from.business.post_code", "fffghhhgg");
        jsonAsMapInvoice.put("from.business.registration_number", "fgghhgff");
        jsonAsMapInvoice.put("from.business.address_line_2", "drffggfdd");
        jsonAsMapInvoice.put("from.business.freelancerId", "5735b3976af6d503004a02c8");
        jsonAsMapInvoice.put("from.business.town", "dgghhhyg");
        jsonAsMapInvoice.put("from.business.logo", "https://s3-eu-west-1.amazonaws.com/hq-image-uploads/9A92DBDA-FE86-4C68-8E9E-4FA150CAD885.png");
        jsonAsMapInvoice.put("from.business.documents_folder", "/cfa7e0d0-8985-45aa-a2ea-3e32ff55e7fd/My Albert");
        jsonAsMapInvoice.put("from.business.bank-account.id", AccountNum);
        jsonAsMapInvoice.put("from.business.bank-account.sort_code", sortCode);
        jsonAsMapInvoice.put("from.business.bank-account.freelancersBusinessId", "5735b39a6af6d503004a02c9");
        jsonAsMapInvoice.put("from.business.county", "cgrresrfgg");
        jsonAsMapInvoice.put("from.business.shared_link", "https://www.dropbox.com/sh/wpmges4qumdxyvj/AABx4nKDbkTouJZPcVUicKI5a?dl=0");

        RestAssured
                .given()
                    .contentType("application/json")
                    .body(jsonAsMapInvoice)
                .when()
                    .post("https://spiderpig-staging.herokuapp.com/api/messages")
                .then()
                    .statusCode(200)
                    .body("_mid", hasItems(randomString))
                    .body("from.business.bank-account.sort_code", hasItems("11-11-11"))
                    .body("from.business.bank-account.account_number", hasItems("11228899"))
                    .body(containsString("VanithaInvoice999"))
                    .body("from.contact", hasItems("vanikushi999@mailinator.com"));
    }
}