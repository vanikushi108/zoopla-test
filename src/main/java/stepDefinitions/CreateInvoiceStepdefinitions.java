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
    public void i_see_add_invoice_button()    {
        createInvoicePage.verifyAddInvoiceButton();
    }

    @When("^I click on add invoice button$")
    public void i_click_on_add_invoice_button()   {
        createInvoicePage.clickOnInvoice();
    }

    @Then("^I should see new invoice page$")
    public void i_should_see_new_invoice_page()    {
        createInvoicePage.verifyNewInvoiceButton();
    }

    @Then("^I add amount GBP \"([^\"]*)\"$")
    public void i_add_ammount_GBP(String amount)   {
        createInvoicePage.addAmount(amount);

    }

    @Then("^I add invoice description as \"([^\"]*)\"$")
    public void i_add_invoice_description(String InvoiceDescription)   {

        createInvoicePage.addInvoiceDescription(InvoiceDescription);

    }

    @Then("^I add recipient name$")
    public void i_add_recipent_name()   {
        createInvoicePage.addRecipientsName();

    }

    @Then("^I enter recipient name as Century Innovations Ltd$")
    public void i_enter_recipients_name_as()   {
        createInvoicePage.enterRecipientsName();

    }

    @Then("^I add recipients email as \"([^\"]*)\"$")
    public void i_add_recipients_email(String RecipientEmail)   {
        createInvoicePage.addRecipientsEmail(RecipientEmail);

    }

    @When("^I click on send button$")
    public void i_click_on_send_button()   {
        createInvoicePage.clickOnSendButton();

    }

    @Then("^Client should receive invoice$")
    public void client_should_receive_invoice()    {

        createInvoicePage.verify_Invoice_Email();

    }

    @Then("^I click on Alert No Send Now$")
    public void I_click_on_Alert_No_Send_Now()    {

        createInvoicePage.clickOnAlertNoSendNow();

    }

    @Then("^I click on Alert Yes add info$")
    public void I_click_on_Alert_Yes_add_info()   {

        createInvoicePage.clickOnAlertYesAddInfo();

    }

    @Then("^click on VAT$")
    public void I_click_on_vat()   {

        createInvoicePage.clickOnVat();

    }

    @Then("^I select vat as ON$")
    public void I_select_vat_on()   {

        createInvoicePage.selectVatAsON();

    }

    @Then("^I click on Bank Account$")
    public void I_click_on_bank_account()   {

        createInvoicePage.clickOnBankAccount();

    }

    @Then("^I enter vat number$")
    public void I_enter_vat_number()   {

        createInvoicePage.enterVatNumber();
    }

    @Then("^I click on done$")
    public void I_click_On_done()   {

        createInvoicePage.selectDone();
    }

    @Then("^I click on close button$")
    public void I_click_on_close_button()   {

        createInvoicePage.clickOnCloseButton();
    }

    @Then("^I click on save button$")
    public void I_click_On_save_button()   {

        createInvoicePage.clickSaveButton();
    }

    @Then("^I add my bank account number$")
    public void I_add_my_bank_account_number()   {

        createInvoicePage.enterBankAccountNumber();
    }

    @Then("^I add my bank sort code$")
    public void I_add_my_bank_sort_code()   {

        createInvoicePage.enterBankSortCode();
    }

    @When("^I wait for (\\d+) seconds$")
    public void iWaitForSeconds(int waitTime) throws Throwable {
        waitAndLogProgress(waitTime);
    }

    private void waitAndLogProgress(int waitTime) throws InterruptedException {

        for (int i = 0; i < waitTime; i++) {
            Thread.sleep(1000);
        }

    }

}
