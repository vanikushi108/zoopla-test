package pageObject;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.io.File;
import java.net.URL;

import static pageObject.DataStorage.*;
import static pageObject.DataStorage.add;

/**
 * Created by vanithakasala on 05/05/2016.
 */
public class SignUpPage {

    int uniqueId = (int) (System.currentTimeMillis() & 0xfffffff);
    String randomString = RandomStringUtils.randomAlphabetic(10);

    AppConnector app = AppConnector.getInstance();
    RemoteWebDriver driver = app.sharedDriver();

    public void tapOnSignUp() {

        driver.findElement(By.xpath("//*[@name='BtnSignUpEnabled']")).click();
    }

    public void enterEmail(String email) {
        email = generateEmailAddress(email);
        add(EMAIL_KEY, email);
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys(get(EMAIL_KEY));

    }

    private String generateEmailAddress(String email) {

        if (email.equals("random")) {
            String randomEmail = randomString + String.valueOf(uniqueId) + "@mailinator.com";
            email = randomEmail.toLowerCase();

        }
        return email;
    }

    public void tapOnNext() {

        driver.findElement(By.xpath("//*[@name='BtnNextEnabled']")).click();

    }

    public void enterPin(){

        for (int i = 0; i < 8; i++) {
            driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[3]")).click();
        }
    }

    public void businessname(){
        driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys("Century Innovations Ltd");

    }
}