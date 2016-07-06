package pageObject;

import org.openqa.selenium.By;
import util.Driver;

/**
 * Created by vanithakasala on 19/05/2016.
 */
public class ToDoListPage {


    public void verifyToDoList() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAImage[5]")).isDisplayed();
    }


    public void tapOnInvoice() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[1]")).click();

    }

    public void verifyMore() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[6]")).isDisplayed();
    }

    public void tapMore() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[6]")).click();
    }

    public void tapDuplicate() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[4]"));
    }

    public void clickDuplicate() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[4]")).click();
    }

    public void verifyDelete() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[5]"));
    }

    public void clickDelete() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[5]")).click();
    }
    public void verifyDeleteInvoice() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAActionSheet[1]/UIAScrollView[1]")).isDisplayed();
    }
    public void clickYes() {

        Driver.driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAActionSheet[1]/UIACollectionView[1]")).click();
    }
}

