package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.URL;

public class Driver {

    public static AppiumDriver driver;

    public static WebDriver ffDriver;

    public static void initDriver() {
        try {

            String workingDir = System.getProperty("user.dir");
            System.out.println("Current working directory" + workingDir);

            File appDir = new File(workingDir + "/app");
            File app = new File(appDir, "Albert.app");

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(CapabilityType.VERSION, "9.3");
            capabilities.setCapability(CapabilityType.PLATFORM, "Mac");
            capabilities.setCapability("platformName", "iOS");
            capabilities.setCapability("deviceName", "iPhone 6 Plus");
            capabilities.setCapability("platformVersion", "9.3");
            capabilities.setCapability("app", app.getAbsolutePath());
            //  Appium lancher url provided below
            driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

        } catch (Exception e) {
            System.out.println("Error on intializing Albert App");
        }
    }

    public static void firefoxDriver() {
        try {
            ffDriver = new FirefoxDriver();
        } catch (Exception e) {
            System.out.println("Error on intializing firefox browser");
        }
    }
}

