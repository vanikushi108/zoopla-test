package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selectors.SearchSelectors;
import util.Driver;
import util.FluentWait;

/**
 * Created by vanithakasala on 23/08/2016.
 */
public class Search extends Driver {

    @FindBy(css="input[name=q]")
    private WebElement searchBox;

    @FindBy(css="input[name=userName]")
    private WebElement userName;

    @FindBy(css="button[name=btnG]")
    private WebElement submitButton;


    public Search(){
    	 PageFactory.initElements(webDriver, this);
    }

    public static void navigateToSearchPage() {
    	webDriver.get(SearchSelectors.GOOGLE_HOME_PAGE);
    }

    public void enterSearchTerm(String searchTerm) {
        searchBox = FluentWait.findElement(webDriver, searchBox);
        searchBox.sendKeys(searchTerm);
    }

    public SearchResults clickSubmitButton() {
    	submitButton = FluentWait.findElement(webDriver, submitButton);
    	submitButton.click();
        return new SearchResults();
    }
}
