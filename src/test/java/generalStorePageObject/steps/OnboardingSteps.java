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
    public void iCheckTheTitleIsDisplayed(){
      //  wait.until(ExpectedConditions.visibilityOf(onboardingPage.getTitle()));
        assert onboardingPage.isTitleDisplayed() : "ERROR!!! title is not displayed";
    }
    @Then("the title should be present")
    public void theTitleShouldBePresent(){ System.out.println("title is present"); }

    @When("I check if the title is  not clickable")
    public String iCheckIsTheTitleNotClickable() {
        assert onboardingPage.titleClickableAttribute().equals("true"): "ERROR!!! the title is clickable";
        return iCheckIsTheTitleNotClickable();
}
@Then("the title should not be clackable")
    public void TitleIsNotClickable(){
    System.out.println("the title is not clickable");
}

}
