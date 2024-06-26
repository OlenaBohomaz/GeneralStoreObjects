package generalStorePageObject.steps;

import generalStorePageObject.DesiredCapabilitiesConfig;
import generalStorePageObject.OnboardingPage;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;



public class OnboardingStepsTest {
    private AndroidDriver driver;
    private OnboardingPage onboardingPage;
    private WebDriverWait wait;
    private static final Logger logger = LoggerFactory.getLogger(OnboardingStepsTest.class);

    @Before
    public void setup() throws Exception {
        try {
            DesiredCapabilities capabilities = DesiredCapabilitiesConfig.getDesiredCapabilities();
            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
            onboardingPage = new OnboardingPage(driver);
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            logger.info("App opened successfully");
        }
        catch (Exception e) {
            logger.error("Failed to open the app", e);
            throw e;
     //       e.printStackTrace();
        }
    }


    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    @Step("I open the app")
    @Given("I open the app")
    public void iOpenTheApp() throws Exception {
//        DesiredCapabilities capabilities = DesiredCapabilitiesConfig.getDesiredCapabilities();
//        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
//        onboardingPage = new OnboardingPage(driver);
//        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Step("I check if the bucket is displayed")

    @When("I check if the bucket is displayed")
    public void iCheckIfTheBucketIsDisplayed() {

//        assert onboardingPage.isBucketDisplayed() : "ERROR!!! bucket is not displayed";
        Assert.assertTrue("ERROR!!! bucket is not displayed", onboardingPage.isBucketDisplayed());

    }

    @Then("the bucket should be present")
    public void theBucketShouldBePresent() {
        System.out.println("bucket is present");
    }

    @Step("I check if the title is displayed")
    @When("I check if the title is displayed")
        public void iCheckTheTitleIsDisplayed() {
          wait.until(ExpectedConditions.visibilityOf(onboardingPage.getTitle()));
        Assert.assertTrue("ERROR!!! title is not displayed", onboardingPage.isTitleDisplayed());

    }

    @Then("the title should be present")
    public void theTitleShouldBePresent() {
        System.out.println("title is present");
    }

    @Step("I check if the title is not clickable")
    @When("I check if the title is not clickable")
    public void iCheckIsTheTitleNotClickable() {
        assertFalse("ERROR!!! the title is clickable", onboardingPage.titleClickableAttribute().equals("true"));
    }

    @Then("the title should not be clickable")
    public void TitleIsNotClickable() {
        System.out.println("the title is not clickable");
    }

   @Step("I check if the title is enabled")
    @When("I check if the title is enabled")
    public void iCheckIsTitleEnabled() {
        assert onboardingPage.isTitleEnabled() : "ERROR!!! title is not enabled!!";
    }

    @Then("the title should be enabled")
        public void titleIsEnabled() {
            System.out.println("The title is enabled");
        }
    @Step("I check if the select country text is displayed")
        @When("I check if the select country text is displayed")
    public void iCheckIsSelectCountryDisplayed() {
        assert onboardingPage.isSCountryDisplayed() : "ERROR!!! country is not displayed!!";
    }
    @Then("the select country text should be present")
    public void selectCountryTextIsDisplayed() {
        System.out.println("The Select country text is displayled");
    }

    @Step("I check if the country text is enabled")
    @When("I check if the country text is enabled")
    public void iCheckIfTheCountryTextEnabled() {
        assert onboardingPage.isCountryTextEnabled() : "ERROR!!! Country text is not enabled!!";
    }
    @Then("the country text should be enabled")
    public void countryTextIsEnabled() {
        System.out.println("The country text is enabled");
    }

    @Step("I check if the country text is correct")
    @When("I check if the country text is correct")
    public void isCountryTextCorrect() {
        String expectedCountryText = "Afghanistan";
        String actualCountryText = onboardingPage.getCountryText();
        assertEquals("Country text is not equal Afganistan", expectedCountryText, actualCountryText);
    }

    @Then("the country text should be Afghanistan")
    public void countryTextIsCorrect() {
        System.out.println("The country text is correct");
    }

   @Step("I check if the input name is displayed")
    @When("I check if the input name is displayed")
    public void iCheckIfTheInputNameIsDisplayed() {
        assert onboardingPage.isInputNameDisplayed() : "ERROR!!! Input name is not displayed!!";
    }
    @Then("the input name should be displayed")
    public void inputNameIsDisplayed() {
        System.out.println("The input name is displayed");
    }

    @Step("I check if the input name is enabled")
    @When("I check if the input name is enabled")
    public void iCheckIfTheInputNameIsEnabled() {
        assert onboardingPage.isInputNameEnabled() : "ERROR!!! Input name is not enabled!!";
    }
    @Then("the input name should be enabled")
    public void inputNameIsEnabled() {
        System.out.println("The input name is enabled");
    }

    @Step("I click on the input field")
    @When("I click on the input field")
    public void iClickOnTheInputField() {
       onboardingPage.inputClick();
    }
    @Then("input field is focused")
    public void inputFieldIsFocused() {

        System.out.println("The input field is focused");
    }

    @Step("I enter the name {string}")
    @When("I enter the name {string}")
    public void iEnterTheName(String name) {
        onboardingPage.enterName(name);
    }
    @Then("the name should be entered")
    public void inputNameIsEntered() {
        System.out.println("The input name is entered");
    }

    @Step("I check if the female radio button is displayed")
    @When("I check if the female radio button is displayed")
    public void iCheckIfTheFemailButtonIsDisplayed() {
        assert onboardingPage.isFFemailDisplayed() : "ERROR!!! Femail button is not displayed!!";
    }
    @Then("the female radio button should be displayed")
    public void femailRadioButtonIsDisplayed() {
        System.out.println("The Femail button is displayed");
    }

    @Step("I check if the female radio button is unchecked")
    @When("I check if the female radio button is unchecked")
    public void iCheckIfTheFemailIsUnchecked() {
        assertFalse("ERROR!!! the femail radio  is unchecked", onboardingPage.isFemailUncheked().equals("true"));
    }
    @Then("the female radio button should be unchecked")
    public void femailRadioButtonIsUnchecked() {
        System.out.println("The Femail button is unchecked");
    }

    @Step("I click on the femail radio button")
    @When("I click on the femail radio button")
    public void iClickTheFemailButton() {
        onboardingPage.femailClick();
    }
    @Then("the femail radio button is clicked")
    public void femailRadioButtonIsClicked() {
        System.out.println("The Femail button is clicked");
    }
    @Step("I hide the keyboard")
    @When("I hide the keyboard")
    public void iHideTheKeyboard() {
        driver.hideKeyboard();
    }
    @Then("the keyboard is hidden")
    public void keyboardIsHidden() {
        System.out.println("The keyboard is hidden");
    }
@Step("I check if the submit button is enabled")
    @When("I check if the submit button is enabled")
    public void iCheckIfTheSubmitButtonIsEnabled() {
        assert onboardingPage.isSubmitButtoneEnabled() : "ERROR!!! submit button is not enabled!!";
    }
    @Then("the submit button should be enabled")
    public void submitButtonIsEnabled() {
        System.out.println("The submit button is enabled");
    }

    @Step("I click on the Submit button")
    @When("I click on the Submit button")
    public void iClickTheSubmitButtond() {
        onboardingPage.buttonClick();
    }

    @Then("the submit button is clicked")
    public void submitButtonIsClicked() {
        System.out.println("The submit button is clicked");
    }


    }










