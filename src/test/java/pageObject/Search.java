package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import selectors.SearchSelectors;
import util.Driver;
import util.FluentWait;

/**
 * Created by vanithakasala on 23/08/2016.
 */
public class Search extends Driver {

    @FindBy(css=".search-input-location-placeholder-1")
    private WebElement searchBox;

    @FindBy(css="input[name=userName]")
    private WebElement userName;

    @FindBy(css="#search-submit")
    private WebElement searchButton;

    @FindBy(css="#search-tabs-to-rent>span")
    private WebElement ToRentTab;

    @FindBy(css="#rent_price_min_per_month")
    private WebElement minimumRent;

    @FindBy(css="#rent_price_max_per_month")
    private WebElement maximumRent;

    @FindBy(css="#property_type")
    private WebElement propertyType;

    public Search(){
    	 PageFactory.initElements(webDriver, this);
    }

    public static void navigateToHomePage() {
    	webDriver.get(SearchSelectors.ZOOPLA_HOME_PAGE);
    }

    public void enterSearchTerm(String searchTerm) {
        searchBox = FluentWait.findElement(webDriver, searchBox);
        searchBox.click();
        searchBox.sendKeys(searchTerm);
    }

    public void clickToRentTab() {
        ToRentTab = FluentWait.findElement(webDriver, ToRentTab);
        ToRentTab.click();
    }

    public void selectMinimumRent(String minimumPrice) {
        Select dropdown = new Select(minimumRent);
        dropdown.selectByVisibleText(minimumPrice);
    }

    public void selectMaximumRent(String maximumPrice) {
        Select dropdown = new Select(maximumRent);
        dropdown.selectByVisibleText(maximumPrice);
    }

    public void selectPropertyType(String houseType) {
        Select dropdown = new Select(propertyType);
        dropdown.selectByVisibleText(houseType);
    }

    public SearchResults clickSearchButton() {
        searchButton = FluentWait.findElement(webDriver, searchButton);
        searchButton.click();
        return new SearchResults();
    }
}
