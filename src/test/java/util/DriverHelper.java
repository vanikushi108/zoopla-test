package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by KushiHarsh on 12/07/2016.
 */
public class DriverHelper {


    public DriverHelper() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.myAndroidDriver), this);
    }


    }