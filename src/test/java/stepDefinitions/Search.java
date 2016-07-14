package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pageObject.LoginPage;
import pageObject.MenuScreen;
import pageObject.StartActivityScreen;
import util.Driver;


/**
 * Created by KushiHarsh on 12/07/2016.
 */
public class Search {

    MenuScreen menuScreen = PageFactory.initElements(Driver.myAndroidDriver, MenuScreen.class);
    StartActivityScreen startActivityScreen = PageFactory.initElements(Driver.myAndroidDriver, StartActivityScreen.class);

    @When("^I search for a product \"(.*?)\"$")
    public void i_search_for_a_product(String product) throws Throwable {

        startActivityScreen.tapMenuBtn();
    }

    @Then("^I see a relevant search results$")
    public void i_see_a_relevant_search_results() {
        Assert.assertTrue(menuScreen.isResultsFound());

    }
}