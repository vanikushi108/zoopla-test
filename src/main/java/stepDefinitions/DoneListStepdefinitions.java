package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pageObject.CreateInvoicePage;
import pageObject.DoneListPage;
import pageObject.ToDoListPage;
import util.Driver;

/**
 * Created by vanithakasala on 20/05/2016.
 */
public class DoneListStepdefinitions {

    DoneListPage doneListPage = PageFactory.initElements(Driver.driver, DoneListPage.class);

    @When("^I swipe Right on my invoice number$")
    public void i_swipe_Right_on_my_invoice_number() throws Throwable {
        doneListPage.swipeRight();

    }

    @When("^I click on my donelist$")
    public void i_click_on_my_donelist() {

        doneListPage.clickDone();

    }

    @Then("^I see my paid invoice in donelist$")
    public void i_see_my_paid_invoice_in_donelist() {

        doneListPage.verifyPaidInvoice();


    }

    @When("^I swipe left on my invoice number$")
    public void i_swipe_left_on_my_invoice_number() throws Throwable {

        doneListPage.swipeLeft();
    }

    @When("^I tap on my paid invoice in donelist$")
    public void i_tap_on_my_paid_invoice_in_done_list() throws Throwable {

        doneListPage.tapInvoice();
    }

    @And("^I check more button$")
    public void i_check_more_button() throws Throwable {
        doneListPage.verifyMoreButton();

    }
    @And("^I tap on more button$")
    public void i_tap_on_more_button()throws Throwable{
        doneListPage.tapMoreButton();
    }
    @When("^ I click on Duplicate Button$")
    public void when_i_click_on_delete_button()throws Throwable{

        doneListPage.tapDuplicate();
    }
    @When("^ I click on Delete button$")
    public void i_click_on_Delete_button()throws Throwable{

        doneListPage.tapDelete();

    }

    @When("^I check Delete this invoice$")
    public void i_check_Delete_this_invoice() throws Throwable {

        doneListPage.verifyDeleteInvoice();

    }
    @And ("^I click on Yes$")
    public void i_click_on_yes()throws Throwable{
        doneListPage.clickYes();

    }
}
