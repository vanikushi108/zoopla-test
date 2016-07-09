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

    public void enterRecipientsName() {

        String name = "Aaa";

        for (int i = 0, n = name.length(); i < n; i++) {
            char ch = name.charAt(i);
            Driver.driver.findElement(By.xpath("//*[@name='" + ch + "']")).click();
        }

//        for (int i = 0; i < 3; i++) {
//            Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[5]/UIAKeyboard[1]/UIAKey[11]")).click();
//        }
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

//        Driver.driver.findElement(By.xpath("//*[@name='BtnSendEnabled']")).click();

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
    }

    public void clickOnAlertNoSendNow() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[3]")).click();
    }

    public void clickOnAlertYesAddInfo() {
        Driver.driver.findElement(By.xpath("//*[@name='Yes, add info']")).click();
    }

    public void verify_Invoice_Email() {

        Driver.ffDriver.get("https://mailinator.com/inbox2.jsp?public_to=vanikushi#/#public_maildirdiv");

        Driver.ffDriver.findElement(By.xpath("//*[@id='row_public_1464341764-100042682636-vanikushi']/div[2]/div[5]/div")).click();
    }

    public void clickOnVat() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[5]")).click();
    }

    public void clickOnBankAccount() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[6]")).click();
    }

    public void selectVatAsON() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIASwitch[1]")).click();
    }


    public void enterVatNumber() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")).sendKeys("45656567");
    }

    public void selectDone() {

        Driver.driver.findElement(By.xpath("//*[@name='done']")).click();
    }

    public void clickOnCloseButton() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[8]")).click();
    }

    public void clickSaveButton() {

        Driver.driver.findElement(By.xpath("//*[@name='save']")).click();
    }

    // public void enterBankAccountNumber() {

    //  Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")).sendKeys("33339999");
    //}

    public void enterBankSortCode() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[2]")).sendKeys("224466");
    }

    public void clickOnPreviewInvoice() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[7]")).click();
    }


    public void tapOnArrowIcon() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
    }

    public void tapOnInvoiceNumber() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[6]")).click();
    }


    public void tapOnNumberForThisInvoice() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAButton[1]")).click();
    }


    public void tapOnOptionalPrefix() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIATextField[2]")).click();
    }

    public void enterOptionalPrefix(String optionalPrefix) {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIATextField[2]")).sendKeys(optionalPrefix);
    }


    public void tapOnNumber(){
        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIATextField[3]")).click();

    }


    public void enterNumber(String number) {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIATextField[3]")).clear();

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIATextField[3]")).sendKeys(number);
    }



    public void tapOnSave(){
        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[5]")).click();

    }

    public void tapOnDone(){
        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[5]")).click();

    }

    public void tapOnCancel(){
        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[5]")).click();
    }
}

