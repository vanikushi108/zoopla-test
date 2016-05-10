package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import util.Driver;
import pageObject.SignUpPage;


public class SignUpStepDefinitions {

    SignUpPage signUpPage = PageFactory.initElements(Driver.driver, SignUpPage.class);

    @Given("^I click on sign up$")
    public void i_click_on_sign_up() throws Exception {

        signUpPage.tapOnSignUp();
    }

    @And("^I enter unregistered email address as \"([^\"]*)\"$")
    public void i_enter_my(String email) {

        signUpPage.enterEmail(email);
    }


//    @And("^I click on Next button$")
//    public void I_click_on_Next_button() {
//
//        signUpPage.tapOnNext();
//    }

    @Then("^I should be prompted to enter pincode as \"([^\"]*)\"$")
    public void i_should_be_prompted_to_enter_pincode(String pin) {

        signUpPage.enterPin();
    }

    @And("^I add my business name as \"([^\"]*)\"$")
    public void i_add_my_business_name(String business) {

        signUpPage.businessname();
    }

    @Then("^I should see notification to get started$")
    public void i_should_see_notification_to_get_started() {

    }
}
