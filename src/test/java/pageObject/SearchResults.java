package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;
import util.FluentWait;

import java.util.List;

/**
 * Created by vanithakasala on 23/08/2016.
 */
public class SearchResults extends Driver {

    @FindAll({@FindBy(css = "#rso .g .rc .r a"),
            @FindBy(css = "#rso .g ._Zfh ._ksh a")

    })
    private List<WebElement> listOfResults;

    @FindBy(css = "#rso .g")
    private WebElement firstSearchResult;

    public SearchResults() {
        PageFactory.initElements(webDriver, this);
    }

    public boolean isLinkWithinSetOfResults(String expectedHref) {

        FluentWait.findElement(webDriver, firstSearchResult);

        String actualHref;

        for (WebElement element : listOfResults) {

            actualHref = element.getAttribute("href");

            if (actualHref.equals(expectedHref)) {
                return true;
            }
        }
        return false;
    }
}
