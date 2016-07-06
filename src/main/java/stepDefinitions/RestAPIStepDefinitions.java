package stepDefinitions;

import com.jayway.restassured.RestAssured;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import javax.xml.ws.Response;

import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

/**
 * Created by vanithakasala on 26/05/2016.
 */
public class RestAPIStepDefinitions {

    @Given("^I enter rest api using get method$")
    public void i_enter_rest_api_using_get_method() throws Throwable {

        System.out.println("test1");
        RestAssured
                .get("https://spiderpig-staging.herokuapp.com/api/messages/5735b863ad9a6303001d62161108")
                .then()
                .statusCode(200);

        System.out.println("test2");

        RestAssured
                .get("https://spiderpig-staging.herokuapp.com/api/messages/5735b863ad9a6303001d62161108")
                .then()
                .body(containsString("Invoice21"));

        System.out.println("test3");
                when()
                .get("https://spiderpig-staging.herokuapp.com/api/messages/5735b863ad9a6303001d62161108")
                .then()
                .body("_mid", containsString("5735b863ad9a6303001d62161108"));

        System.out.println("test4");
        when()
                .get("https://spiderpig-staging.herokuapp.com/api/messages/5735b863ad9a6303001d62161108")
                .then()
                .body("freelancersBusinessId", containsString("5735b39a6af6d503004a02c9"));

        System.out.println("test5");
        when()
                .get("https://spiderpig-staging.herokuapp.com/api/messages/5735b863ad9a6303001d62161108")
                .then()
                .body("folders.name", hasItems("todo"));

        System.out.println("test6");
        when()
                .get("https://spiderpig-staging.herokuapp.com/api/messages/5735b863ad9a6303001d62161108")
                .then()
                .body("folders.date", hasItems("2016-05-13T11:20:03.730Z"));

    }

    @Then("^We should response (\\d+) OK$")
    public void we_should_response_OK(int arg1) throws Throwable {

    }




}