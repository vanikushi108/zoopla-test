package util;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import util.Driver;

public class Hooks {


    @Before
    public void beforeScenario() {

        System.out.println("Before Scenario");

        //opening appium driver in Simulator for native app
        Driver.initDriver();

        //opening firefox browser for web
//        Driver.firefoxDriver();

    }

   @After
    public void tear(Scenario scenario) {


        //closing appium driver in simulator
        Driver.driver.quit();

        //closing firefox browser
//        Driver.ffDriver.quit();

       System.out.println("After Scenario");
    }
}

