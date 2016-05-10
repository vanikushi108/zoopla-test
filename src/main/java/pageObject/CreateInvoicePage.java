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

    public void clickOnInvoice() {

        Driver.driver.findElement(By.xpath("//*[@name='BtnNewInvoice']")).click();
    }

    public void verifyNewInvoiceButton() {

        Driver.driver.findElement(By.xpath("//*[@name='New Invoice']")).isDisplayed();
    }

    public void addAmount() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")).sendKeys("1000");
    }

    public void addInvoiceDescription() {


        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[4]")).sendKeys("New April Invoice");

    }


    public void addRecipientsName() {


        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[5]")).click();

    }

    public void enterRecipientsName() throws Exception {

        for (int i = 0; i < 3; i++) {
            Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[5]/UIAKeyboard[1]/UIAKey[11]")).click();
        }
        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]")).click();

        Driver.driver.findElement(By.xpath("//*[@name='done']")).click();

    }

    public void addRecipientsEmail() {


        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[6]/UIATextField[1]")).sendKeys("vanitha@getalbert.com");

    }

    public void clickOnSendButton() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
    }


}