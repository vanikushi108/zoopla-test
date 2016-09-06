package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import util.Driver;
import pageObject.LoginPage;

/**
 * Created by vanithakasala on 26/05/2016.
 */
public class LoginStepDefinitions {

    LoginPage loginPage = PageFactory.initElements(Driver.iOSdriver, LoginPage.class);

    @Given("^I click on Login$")
    public void i_tap_on_Login() {
        loginPage.tapOnLogin();
    }

    @And("^I enter valid email address$")
    public void i_enter_valid_email_address() {
        loginPage.ValidEmailId();
    }

    @And("^I click on Next button$")
    public void i_tap_on_Next_button() {
        loginPage.tapOnnext();
    }

    @When("^I enter a valid pincode$")
    public void i_enter_a_valid_pincode() {
        loginPage.validPinCode();
    }


}
