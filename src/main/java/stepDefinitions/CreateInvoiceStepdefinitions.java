package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pageObject.CreateInvoicePage;
import pageObject.LoginPage;
import util.Driver;

/**
 * Created by vanithakasala on 10/05/2016.
 */
public class CreateInvoiceStepdefinitions {

    CreateInvoicePage createInvoicePage = PageFactory.initElements(Driver.driver, CreateInvoicePage.class);

    @Then("^I should see add invoice button$")
    public void i_see_add_invoice_button()  {
        createInvoicePage.verifyAddInvoiceButton();
    }

    @When("^I click on add invoice button$")
    public void i_click_on_add_invoice_button() throws Exception  {
        createInvoicePage.clickOnInvoice();
    }

    @Then("^I should see new invoice page$")
    public void i_should_see_new_invoice_page()  {
        createInvoicePage.verifyNewInvoiceButton();
    }

    @Then("^I add ammount GBP \"([^\"]*)\"$")
    public void i_add_ammount_GBP(String amount) throws Throwable {
        createInvoicePage.addAmount(amount);

          }

    @Then("^I add invoice description as \"([^\"]*)\"$")
    public void i_add_invoice_description(String InvoiceDescription) throws Throwable {

        createInvoicePage.addInvoiceDescription(InvoiceDescription);

         }

    @Then("^I add recipent name$")
    public void i_add_recipent_name() throws Throwable {
        createInvoicePage.addRecipientsName();

         }

    @Then("^I enter recipient name as Century Innovations Ltd$")
    public void i_enter_recipients_name_as() throws Throwable {
        createInvoicePage.enterRecipientsName();

    }

    @Then("^I add recipients email as \"([^\"]*)\"$")
    public void i_add_recipients_email(String RecipientEmail) throws Throwable {
        createInvoicePage.addRecipientsEmail(RecipientEmail);

         }

    @When("^I click on send button$")
    public void i_click_on_send_button() throws Throwable {
        createInvoicePage.clickOnSendButton();

    }

    @Then("^Client should receive invoice$")
    public void client_should_receive_invoice() throws Throwable {

    }




}
