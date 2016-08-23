package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObject.Search;
import pageObject.SearchResults;

/**
 * Created by vanithakasala on 23/08/2016.
 */
public class SearchStepDefinitions {

    Search searchPage = new Search();
    SearchResults searchResultsPage = new SearchResults();

    @Given("^I am on the google search page$")
    public void navigateToSearch() throws Throwable {
        searchPage.navigateToSearchPage();
    }

    @When("^I search for the term \"([^\"]*)\"$")
    public void I_search_for_the_term(String search_term) throws Throwable {
        searchPage.enterSearchTerm(search_term);
        searchResultsPage = searchPage.clickSubmitButton();
    }

    @Then("^the E Fundamentals company website link is returned within the results$")
    public void the_E_Fundamentals_company_website_link_is_returned_within_the_results() throws Throwable {

        String expectedHref = "http://www.ef.uk.com/";
        boolean actualResult = searchResultsPage.isLinkWithinSetOfResults(expectedHref);
        Assert.assertEquals("The E Fundamentals company website link has not been returned within the results", true, actualResult);
    }
}
