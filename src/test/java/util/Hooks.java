package util;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import util.Driver;
/**
 * Created by vanithakasala on 26/05/2016.
 */
public class Hooks {


    @Before
    public void beforeScenario() {
//        Driver.getIOSDriver();
        Driver.getWebDriver();
    }

    @After
    public void tear(Scenario scenario) {
//        Driver.iOSdriver.quit();
        Driver.webDriver.quit();
    }
}

