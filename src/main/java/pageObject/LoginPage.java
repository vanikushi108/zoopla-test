package pageObject;

import org.openqa.selenium.By;
import util.Driver;

/**
 * Created by vanithakasala on 05/05/2016.
 */
public class LoginPage {

    public void tapOnLogin() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
    }

    public void ValidEmailId() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys("test1002@mailinator.com");
    }

    public void tapOnnext() {

        Driver.driver.findElement(By.xpath("//*[@name='BtnNextEnabled']")).click();
    }

    public void validPinCode() {
        for (int i = 0; i < 4; i++) {
            Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[3]")).click();
        }
    }
}