package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

import static util.Driver.iOSdriver;

/**
 * Created by vanithakasala on 05/05/2016.
 */
public class LoginPage {

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")
    private WebElement Login;

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")
    private WebElement EmailId;

    @FindBy(xpath = "//*[@name='BtnNextEnabled']")
    private WebElement Next;

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[3]")
    private WebElement PinCode;

    public LoginPage(){
        PageFactory.initElements(iOSdriver, this);
    }

    public void tapOnLogin() {
        Login.click();
    }

    public void ValidEmailId() {
        EmailId.sendKeys("test1002@mailinator.com");
    }

    public void tapOnnext() {
        Next.click();
    }

    public void validPinCode() {
        for (int i = 0; i < 4; i++) {
            PinCode.click();
        }
    }
}