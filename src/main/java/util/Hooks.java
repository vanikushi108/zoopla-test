package util;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import util.Driver;

public class Hooks {


    @Before
    public void beforeScenario() {

        System.out.println("Before Scenario");

        Driver.initDriver();
        Driver.firefoxDriver();

    }

   @After
    public void tear(Scenario scenario) {

        Driver.driver.quit();
        Driver.ffDriver.quit();

       System.out.println("After Scenario");
    }
}

