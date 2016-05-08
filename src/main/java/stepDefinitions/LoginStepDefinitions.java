package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import util.Driver;
import pageObject.LoginPage;


public class LoginStepDefinitions {

    LoginPage loginPage = PageFactory.initElements(Driver.driver, LoginPage.class);

    @Given("^I tap on Login$")
    public void i_tap_on_Login() {
        loginPage.tapOnLogin();
    }

    @And("^I enter valid email address$")
    public void i_enter_valid_email_address() {
        loginPage.ValidEmailId();
    }

    @And("^I tap on Next button$")
    public void i_tap_on_Next_button() {
        loginPage.tapOnnext();
    }

    @When("^I enter a valid pincode$")
    public void i_enter_a_valid_pincode() {
        loginPage.validPinCode();
    }

    @Then("^login successful$")
    public void login_successful() {

    }
}
