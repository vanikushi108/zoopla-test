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

    @FindBy(css = ".maps-area-name>b")
    private WebElement location;

    @FindBy(css = ".icon.icon-list")
    private WebElement listView;

    @FindBy(css = ".icon.icon-grid")
    private WebElement gridView;

    @FindBy(css = ".icon.icon-location")
    private WebElement mapView;

    public SearchResults() {
        PageFactory.initElements(webDriver, this);
    }

    public String getLocation() {
        FluentWait.findElement(webDriver, location);
        return location.getText();
    }

    public boolean isListViewEnabled() {
        FluentWait.findElement(webDriver, listView);
        return listView.isEnabled();
    }

    public boolean isGridViewEnabled() {
        FluentWait.findElement(webDriver, gridView);
        return gridView.isEnabled();
    }

    public boolean isMapViewEnabled() {
        FluentWait.findElement(webDriver, mapView);
        return mapView.isEnabled();
    }
}
