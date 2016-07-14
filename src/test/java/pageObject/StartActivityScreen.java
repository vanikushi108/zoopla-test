package pageObject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Driver;
import util.DriverHelper;


/**
 * Created by KushiHarsh on 12/07/2016.
 */
public class StartActivityScreen {

    public void tapMenuBtn() throws Throwable {
        Thread.sleep(10000);
        Driver.myAndroidDriver.findElement(By.id("get_started_textview")).click();
        Thread.sleep(10000);
        Driver.myAndroidDriver.findElement(By.id("home_slidingmenu")).click();
    }
}
