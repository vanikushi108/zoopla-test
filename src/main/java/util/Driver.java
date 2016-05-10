package util;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.URL;

public class Driver {

    public static RemoteWebDriver driver;

    public static void initDriver() {
        try {

            File appDir = new File("/Users/vanithakasala/albert");
            File app = new File(appDir, "Albert.app");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(CapabilityType.VERSION, "9.3");
            capabilities.setCapability(CapabilityType.PLATFORM, "Mac");
            capabilities.setCapability("platformName", "iOS");
            capabilities.setCapability("deviceName", "iPhone 6 Plus");
            capabilities.setCapability("platformVersion", "9.3");
            capabilities.setCapability("app", app.getAbsolutePath());
            //  Appium lancher url provided below
            driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

        } catch (Exception e) {
            System.out.println("Error on intializing Albert App");
        }
    }
}
