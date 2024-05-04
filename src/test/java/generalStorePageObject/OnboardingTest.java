package generalStorePageObject;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.time.Duration;

public class OnboardingTest {
    public static void main(String[] args) throws Exception {
        DesiredCapabilities capabilities = DesiredCapabilitiesConfig.getDesiredCapabilities();
        AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        OnboardingPage onboardingPage = new OnboardingPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        if (onboardingPage.isBucketDisplayed()){
            System.out.println("bucket is present");
        } else {
            System.out.println("ERROR!!! bucket is not displayed");
        }
    wait.until(ExpectedConditions.visibilityOf(onboardingPage.getTitle()));
        if (onboardingPage.isTitleDisplayed()){
            System.out.println("title is present");
        } else {
            System.out.println("ERROR!!! title is not displayed");
        }

        String clickableAttribute = onboardingPage.getTitle().getAttribute("clickable");
        if ("false".equals(clickableAttribute)) {
            System.out.println("Element is not clickable.");
        } else {
            System.out.println("TEST FAILED! Element is clickable!!!");
        }
        if(onboardingPage.isTitleEnabled()){
            System.out.println("Title is enabled");
        } else {
            System.out.println("ERROR!!! Title is not enabled");
        }

        if (onboardingPage.isSelectCountryTextDisplayed()){
            System.out.println("SelectCountryText is present");
        } else {
            System.out.println("ERROR!!! SelectCountryText is not displayed");
        }
        if (onboardingPage.isSelectCountryTextEnabled()){
            System.out.println("SelectCountryText is enabled");
        } else {
            System.out.println("ERROR!!! SelectCountryText is not enabled");
        }
        if (onboardingPage.se)
    }
}
