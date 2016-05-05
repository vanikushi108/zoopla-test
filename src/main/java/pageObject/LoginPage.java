package pageObject;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.URL;

import static pageObject.DataStorage.*;

/**
 * Created by vanithakasala on 05/05/2016.
 */
public class LoginPage {

    AppConnector app = AppConnector.getInstance();
    RemoteWebDriver driver = app.sharedDriver();

    public void tapOnLogin() {

        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
    }

    public void ValidEmailId() {

        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys("test1002@mailinator.com");
    }

    public void tapOnnext() {

        driver.findElement(By.xpath("//*[@name='BtnNextEnabled']")).click();
    }

    public void validPinCode() {
        for (int i = 0; i < 4; i++) {
            driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[3]")).click();
        }
    }

    public void logout() {
        app.quitDriver();
    }
}