package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pageObject.ToDoListPage;
import util.Driver;

/**
 * Created by vanithakasala on 19/05/2016.
 */
public class ToDolistStepdefinitions {


    ToDoListPage toDolistPage = PageFactory.initElements(Driver.driver, ToDoListPage .class);

    @When("^I see the Todolist button$")
    public void i_see_the_Todolist_button() {
        toDolistPage.verifyToDoList();
    }


    @When("^I tap on my Invoice number$")
    public void i_tap_on_my_Invoice_number()  {
        toDolistPage.tapOnInvoice();


    }

    @Then("^I should see Invoice details page$")
    public void i_should_see_Invoice_details_page()   {

    }
    @And("^I see more button on  my Invoice Page$")
    public void i_see_more_button_on_my_Invoice_Page()  {
        toDolistPage.verifyMore();

    }

    @When("^I click on more button$")
    public void i_click_on_more_button() {
        toDolistPage.tapMore();



    }

    @When("^I see Duplicate Button$")
    public void i_see_Duplicate_Button() {
        toDolistPage.tapDuplicate();

    }
    @When("^I click on Duplicate Button$")
    public void i_click_on_Duplicate_Button()  {
        toDolistPage.clickDuplicate();

    }

    @When("^I see duplicate invoice in Todolist$")
    public void i_see_duplicate_invoice_in_Todolist() {

    }


    @Given("^I see Delete button$")
    public void i_see_Delete_button()  {
        toDolistPage.verifyDelete();

    }

    @Given("^I click on Delete button$")
    public void i_click_on_Delete_button() {
        toDolistPage.clickDelete();

    }
    @And("^I see delete this invoice$")
    public void I_see_delete_this_invoice() {
        toDolistPage.verifyDeleteInvoice();
    }

    @And("^I click on yes$")
    public void I_click_on_yes() {
        toDolistPage.clickYes();
    }



    }





