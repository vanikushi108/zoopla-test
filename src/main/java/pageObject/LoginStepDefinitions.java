package pageObject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;


public class LoginStepDefinitions {

    AppConnector app = AppConnector.getInstance(); //new AppConnector();
    RemoteWebDriver driver = app.sharedDriver();
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

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

    @Then("^I logout$")
    public void I_logout() {
        loginPage.logout();
    }
}
