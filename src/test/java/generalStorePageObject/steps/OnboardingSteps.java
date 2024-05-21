package generalStorePageObject.steps;

import generalStorePageObject.DesiredCapabilitiesConfig;
import generalStorePageObject.OnboardingPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class OnboardingSteps {
    private AndroidDriver driver;
    private OnboardingPage onboardingPage;
    private WebDriverWait wait;
    private String name;

    @Given("I open the app")
    public void iOpenTheApp() throws Exception {
        DesiredCapabilities capabilities = DesiredCapabilitiesConfig.getDesiredCapabilities();
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        onboardingPage = new OnboardingPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @When("I check if the bucket is displayed")
    public void iCheckIfTheBucketIsDisplayed() {
        assert onboardingPage.isBucketDisplayed() : "ERROR!!! bucket is not displayed";
    }

    @Then("the bucket should be present")
    public void theBucketShouldBePresent() {
        System.out.println("bucket is present");
    }

    @When("I check if the title is displayed")
    public void iCheckTheTitleIsDisplayed() {
        //  wait.until(ExpectedConditions.visibilityOf(onboardingPage.getTitle()));
        assert onboardingPage.isTitleDisplayed() : "ERROR!!! title is not displayed";
    }

    @Then("the title should be present")
    public void theTitleShouldBePresent() {
        System.out.println("title is present");
    }

    @When("I check if the title is not clickable")
    public void iCheckIsTheTitleNotClickable() {
        assertFalse("ERROR!!! the title is clickable", onboardingPage.titleClickableAttribute().equals("true"));

    }

    @Then("the title should not be clickable")
    public void TitleIsNotClickable() {
        System.out.println("the title is not clickable");
    }

    @When("I check if the title is enabled")
    public void iCheckIsTitleEnabled() {
        assert onboardingPage.isTitleEnabled() : "ERROR!!! title is not enabled!!";
    }

    @Then("the title should be enabled")
        public void titleIsEnabled() {
            System.out.println("The title is enabled");
        }

        @When("I check if the country text is correct")
    public void isCountryTextCorrect(){
       String expectedCountryText = "Afghanistan";
       String actualCountryText = onboardingPage.getCountryText();
       assertEquals("Country text is not equal Afganistan", expectedCountryText, actualCountryText);
        }
    }

