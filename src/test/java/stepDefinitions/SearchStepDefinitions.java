package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObject.Search;
import pageObject.SearchResults;

import static org.junit.Assert.assertEquals;

/**
 * Created by vanithakasala on 23/08/2016.
 */
public class SearchStepDefinitions {

    Search searchPage = new Search();
    SearchResults searchResultsPage = new SearchResults();

    @Given("^I am on the zoopla home page$")
    public void navigateToHomePage() throws Throwable {
        searchPage.navigateToHomePage();
    }

    @And("^I click on To rent tab$")
    public void iClickOnToRentTab() throws Throwable {
        searchPage.clickToRentTab();
    }

    @And("^I Enter \"([^\"]*)\" in the Search field$")
    public void iEnterInTheSearchField(String search_term) throws Throwable {
        searchPage.enterSearchTerm(search_term);
    }

    @And("^I Select Min rent to \"([^\"]*)\"$")
    public void setMinRentTo(String minPrice) throws Throwable {
        searchPage.selectMinimumRent(minPrice);
    }

    @And("^I Select Max rent to \"([^\"]*)\"$")
    public void setMaxRentTo(String maxPrice) throws Throwable {
        searchPage.selectMaximumRent(maxPrice);
    }

    @And("^I Select Property type  as \"([^\"]*)\"$")
    public void iSelectPropertyTypeAs(String houseType) throws Throwable {
        searchPage.selectPropertyType(houseType);
    }

    @When("^I Click on Search button$")
    public void iClickOnSearchButton() throws Throwable {
        searchPage.clickSearchButton();
    }

    @Then("^I see properties displayed are to rent in \"([^\"]*)\"$")
    public void iSeePropertiesDisplayedAreToRentIn(String location) throws Throwable {
        assertEquals(location, searchResultsPage.getLocation());
    }

    @And("^I see the default list view as \"([^\"]*)\"$")
    public void iSeeTheDefaultListViewAs(String flag) throws Throwable {
        assertEquals(flag, searchResultsPage.isListViewEnabled());
    }

    @And("^I see the grid view as \"([^\"]*)\"$")
    public void iSeeTheGridViewAs(String flag) throws Throwable {
        assertEquals(flag, searchResultsPage.isGridViewEnabled());
    }

    @And("^I see the map view as \"([^\"]*)\"$")
    public void iSeeTheMapViewAs(String flag) throws Throwable {
        assertEquals(flag, searchResultsPage.isMapViewEnabled());
    }
}
