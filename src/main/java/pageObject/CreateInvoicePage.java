package pageObject;

import org.openqa.selenium.By;
import util.Driver;

/**
 * Created by vanithakasala on 05/05/2016.
 */
public class CreateInvoicePage {

    public void verifyAddInvoiceButton() {

        Driver.driver.findElement(By.xpath("//*[@name='BtnNewInvoice']")).isDisplayed();
    }

    public void clickOnInvoice() throws Exception {

        Thread.sleep(3000);

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[5]")).click();
    }

    public void verifyNewInvoiceButton() {

        Driver.driver.findElement(By.xpath("//*[@name='New Invoice']")).isDisplayed();
    }

    public void addAmount(String amount) {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")).sendKeys(amount);
    }

    public void addInvoiceDescription(String InvoiceDescription) {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[4]")).sendKeys(InvoiceDescription);

    }

    public void addRecipientsName() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[5]")).click();

    }

    public void enterRecipientsName() throws Exception {

        for (int i = 0; i < 3; i++) {
            Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[5]/UIAKeyboard[1]/UIAKey[11]")).click();
        }
        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]")).click();

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[4]")).click();

    }

    public void addRecipientsEmail(String RecipientEmail) {

        String email = "vanikushi@mailinator.com";

        for (int i = 0, n = email.length(); i < n; i++) {
            char ch = email.charAt(i);
            Driver.driver.findElement(By.xpath("//*[@name='" + ch + "']")).click();
        }
    }

    public void clickOnSendButton() {

        Driver.driver.findElement(By.xpath("//*[@name='BtnSendEnabled']")).click();
    }

}