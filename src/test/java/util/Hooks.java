package util;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import util.Driver;

public class Hooks {


    @Before
    public void beforeScenario() {

        System.out.println("Before Scenario");

        //opening IOS driver in Simulator for native app
        Driver.initDriver();

        //opening android driver in Simulator for native app
        Driver.androidDriver();

        //opening firefox browser for web
        Driver.firefoxDriver();

    }

    @After
    public void tear(Scenario scenario) {


        //closing appium driver in simulator
        Driver.driver.quit();

        //closing appium driver in simulator
        Driver.myAndroidDriver.quit();

        //closing firefox browser
        Driver.ffDriver.quit();

        System.out.println("After Scenario");
    }
}

