package test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class BasicTest {

    private AppiumDriver driver;

    @Before
    public void openApp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Redmi Note 11");
        cap.setCapability("udid", "50e388b3");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "11");

        cap.setCapability("appPackage", "com.example.flutter2");
        cap.setCapability("appActivity", "com.example.flutter2.MainActivity");
        cap.setCapability("ignoreHiddenApiPolicyError", "true");

        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new AppiumDriver(url, cap);
        System.out.println("Application started");
    }

    @Test
    public void sampleTest() {

        // works with AndroidDriver, AppiumDriver
        WebElement e = driver.findElement(By.xpath("//android.widget.EditText[1]"));
        e.click();

        //method 1
        //driver.getKeyboard().pressKey("dddd");

        //method 2
        //Actions action = new Actions(driver);
        //action.sendKeys(driver.findElement(By.xpath("//android.widget.EditText[1]")), "lll").perform();

        //method 3
        //driver.getKeyboard().sendKeys("gggggggkjndvck");

    }
}
