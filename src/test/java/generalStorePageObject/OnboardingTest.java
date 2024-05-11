package generalStorePageObject;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.net.URL;
import java.time.Duration;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class OnboardingTest {
    public static void main(String[] args) throws Exception {
        DesiredCapabilities capabilities = DesiredCapabilitiesConfig.getDesiredCapabilities();
        AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        OnboardingPage onboardingPage = new OnboardingPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        String name = readNameFromJsonFile();

        if (onboardingPage.isBucketDisplayed()) {
            System.out.println("bucket is present");
        } else {
            System.out.println("ERROR!!! bucket is not displayed");
        }
        wait.until(ExpectedConditions.visibilityOf(onboardingPage.getTitle()));
        if (onboardingPage.isTitleDisplayed()) {
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
        if (onboardingPage.isTitleEnabled()) {
            System.out.println("Title is enabled");
        } else {
            System.out.println("ERROR!!! Title is not enabled");
        }

        if (onboardingPage.isSCountryDisplayed()) {
            System.out.println("SelectCountryText is present");
        } else {
            System.out.println("ERROR!!! SelectCountryText is not displayed");
        }
        if (onboardingPage.isCountryTextEnabled()) {
            System.out.println("CountryText is enabled");
        } else {
            System.out.println("ERROR!!! CountryText is not enabled");
        }
        if (onboardingPage.getCountryTextAttribute().equals("Afghanistan")) {
            System.out.println("CountryText is correct");
        } else {
            System.out.println("ERROR!!! CountryText is not correct");
        }

        if (onboardingPage.isInputNameDisplayed()) {
            System.out.println("InputName is displayed ");
        } else {
            System.out.println("ERROR!!!InputName is not displayed");
        }
        if (onboardingPage.isInputNameEnabled()) {
            System.out.println("InputName is enabled ");
        } else {
            System.out.println("ERROR!!!InputName is not enabled");
        }
        onboardingPage.inputClick();
        onboardingPage.enterName(name);
        System.out.println("Name read from JSON file: " + name);
        driver.hideKeyboard();

        if (onboardingPage.isFFemailDisplayed()){
            System.out.println("femailRadio is displayed");
        } else {
            System.out.println("ERROR!!! femailRadio is not displayed");
        }

        if(onboardingPage.isFemailUncheked().equals("false")){
            System.out.println("femailRadio is unchecked");
        } else {
            System.out.println("ERROR!!! femailRadio is not unchecked");
        }


        if (onboardingPage.isSubmitButtoneEnabled()){
            System.out.println("button is enabled");
        } else {
            System.out.println("ERROR! Button is enabled ");
        }
    }  private static String readNameFromJsonFile () {
            JSONParser parser = new JSONParser();
            String name = null;
            try {
                String filePath = "src/test/java/generalStorePageObject/name.json";
                Object obj = parser.parse(new FileReader(filePath));
                JSONObject jsonObject = (JSONObject) obj;
                name = (String) jsonObject.get("name");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return name;
        }





}

