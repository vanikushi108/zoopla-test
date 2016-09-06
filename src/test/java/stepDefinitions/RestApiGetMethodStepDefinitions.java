package stepDefinitions;

import com.jayway.restassured.RestAssured;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import javax.xml.ws.Response;

import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

import org.apache.commons.lang.RandomStringUtils;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by vanithakasala on 26/05/2016.
 */
public class RestApiGetMethodStepDefinitions {
    String randomString = RandomStringUtils.randomAlphabetic(10);
    @Given("^I enter rest api using get method$")
    public void i_enter_rest_api_using_get_method() throws Throwable {

        System.out.println("rest API get example");
            RestAssured
                .given()
                    .contentType("application/json")
                .when()
                    .get("https://restapi-get-staging.heroku.com/api/messages/5735b89a6303001d62161108")
                .then()
                    .statusCode(200)
                    .body("_mid", containsString("5735b863ad9a6303001d62161108"))
                    .body(containsString("Invoice21"))
                    .body("freelancersBusinessId", containsString("5735b39a6af6d503004a02c9"))
                    .body("folders.name", hasItems("todo"))
                    .body("from.business.bank-account.account_number", containsString("05225893"))
                    .body("from.business.bank-account.sort_code", containsString("15-78-89"))
                    .body("folders.date", hasItems("2016-05-13T11:20:03.730Z"))
            ;
    }

    @Then("^We should response (\\d+) OK$")
    public void we_should_response_OK(int arg1) throws Throwable {

    }
}