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
    public void i_click_on_sign_up()   {

        signUpPage.tapOnSignUp();
    }

    @And("^I enter unregistered email address as \"([^\"]*)\"$")
    public void i_enter_my(String email) {

        signUpPage.enterEmail(email);
    }

    @Then("^I should be prompted to enter pincode as \"([^\"]*)\"$")
    public void i_should_be_prompted_to_enter_pincode(String pin) {

        signUpPage.enterPin();
    }

    @And("^I add my business name as \"([^\"]*)\"$")
    public void i_add_my_business_name(String business)   {

        signUpPage.businessName();
    }

    @And("^I click on button Finish$")
    public void i_click_button_finish()   {

        signUpPage.clickBtnFinish();
    }

    @And("^I click on GET STARTED$")
    public void i_click_get_started()   {

        signUpPage.clickGetStarted();
    }

    @Then("^I should see notification to get started$")
    public void i_should_see_notification_to_get_started() {

        signUpPage.verify_SignUp_Email();

    }
}
