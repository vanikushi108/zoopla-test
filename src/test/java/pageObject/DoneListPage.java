package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.Driver;

/**
 * Created by vanithakasala on 20/05/2016.
 */
    public class DoneListPage {


    public void swipeRight() {

//        Driver.driver.swipe(57, 123, 313, 123, 900);

    }

    public void clickDone() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[3]")).click();


    }

    public void verifyPaidInvoice() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")).isDisplayed();
    }

    public void swipeLeft() {
//        Driver.driver.swipe(250, 164, 2, 123, 900);

    }

    public void tapInvoice() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")).click();


    }

    public void verifyMoreButton() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[6]")).isDisplayed();
    }

    public void tapMoreButton() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[6]")).click();
    }

    public void tapDuplicate() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[4]")).click();
    }
    public void tapDelete() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[5]")).click();
    }

    public void verifyDeleteInvoice() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAActionSheet[1]/UIAScrollView[1]")).isDisplayed();
    }
    public void clickYes() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAActionSheet[1]/UIACollectionView[1]")).click();
    }


}





