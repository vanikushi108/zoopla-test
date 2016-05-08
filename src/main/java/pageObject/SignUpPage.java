package pageObject;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import util.Driver;


import static util.DataStorage.*;
import static util.DataStorage.add;

/**
 * Created by vanithakasala on 05/05/2016.
 */
public class SignUpPage {

    int uniqueId = (int) (System.currentTimeMillis() & 0xfffffff);
    String randomString = RandomStringUtils.randomAlphabetic(10);

    public void tapOnSignUp() {

        Driver.driver.findElement(By.xpath("//*[@name='BtnSignUpEnabled']")).click();
    }

    public void enterEmail(String email) {
        email = generateEmailAddress(email);
        add(EMAIL_KEY, email);
        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys(get(EMAIL_KEY));

    }

    private String generateEmailAddress(String email) {

        if (email.equals("random")) {
            String randomEmail = randomString + String.valueOf(uniqueId) + "@mailinator.com";
            email = randomEmail.toLowerCase();

        }
        return email;
    }

    public void tapOnNext() {

        Driver.driver.findElement(By.xpath("//*[@name='BtnNextEnabled']")).click();

    }

    public void enterPin() {

        for (int i = 0; i < 8; i++) {
            Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[3]")).click();
        }
    }

    public void businessname() {
        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys("Century Innovations Ltd");

    }
}