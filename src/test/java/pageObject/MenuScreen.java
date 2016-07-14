package pageObject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import junit.framework.Assert;
import org.openqa.selenium.By;
import util.Driver;
import util.DriverHelper;

/**
 * Created by KushiHarsh on 12/07/2016.
 */
public class MenuScreen {


    public void searchProduct() {

        Driver.myAndroidDriver.findElement(By.xpath("//*[@id='home_slidingmenu']")).sendKeys("suits");

    }

    public boolean isResultsFound() {

        return Driver.myAndroidDriver.findElement(By.xpath("//*[@id='see_all_textview']")).isDisplayed();
    }

}
