package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
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
//    public static RemoteWebDriver driver;

    public static WebDriver ffDriver;
    public static String runType;
    public DesiredCapabilities capabilities = new DesiredCapabilities();
    public static final String USERNAME = "tr-risk-fsp";
    public static final String ACCESS_KEY = "36691385-0c41-4a05-ac44-d5f48f76bc1f";
    public static final String SauceURL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";


    public static void initDriver() {
        runType = (System.getProperty("runType") == null) ? "local" : System.getProperty("runType");
        try {
                if (runType.equalsIgnoreCase("saucelabs")){
                    System.out.println("step1");

                    DesiredCapabilities caps = new DesiredCapabilities();
                    caps.setCapability("username", "tr-risk-fsp");
                    caps.setCapability("access-key","36691385-0c41-4a05-ac44-d5f48f76bc1f");
                    caps.setCapability("platform","OS X 10.10");
                    caps.setCapability("appiumVersion", "1.5.3");
                    caps.setCapability("deviceName",System.getProperty("device"));
                    caps.setCapability("deviceOrientation", "portrait");
                    caps.setCapability("platformVersion",System.getProperty("iOSversion"));
                    caps.setCapability("platformName", "iOS");

                    caps.setCapability("app","sauce-storage:Albert.zip");
                    caps.setCapability("idleTimeout", "999");
                    caps.setCapability("maxDuration", "10800");
                    caps.setCapability("commandTimeout", "600");

                    caps.setCapability("recordVideo", false);
                    caps.setCapability("recordScreenshots", false);
                    caps.setCapability("recordLogs", false);

                    caps.setCapability("name", "native app in "+System.getProperty("device")+" in iOS "+System.getProperty("iOSversion"));

                    caps.setCapability("passed", "true");
                    System.out.println("step2");
                    //  Appium launcher for Iphone url provided below
                    driver = new IOSDriver(new URL(SauceURL), caps);
                    System.out.println("step3");




                }else {
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

                    //  Appium launcher for Iphone url provided below
                    driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

                }

        } catch (Exception e) {
            System.out.println("Error on intializing Albert App");
        }
    }

    public static void androidDriver() {
        try {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "5.1.1");
            capabilities.setCapability("deviceName", "HTC ONE");
            capabilities.setCapability("appPackage", "com.asos.app");
            capabilities.setCapability("noReset", true);
            capabilities.setCapability("appActivity", "com.asos.app.ui.activities.HomeActivity");

            //  Appium launcher for android url provided below
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            System.out.println("step1");

        } catch (Exception e) {
            System.out.println("Error on intializing Android Driver");
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

