package generalStorePageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class OnboardingPage {
    @AndroidFindBy(id="com.androidsample.generalstore:id/splashscreen")
    private WebElement bucket;

    @AndroidFindBy(id="com.androidsample.generalstore:id/toolbar_title")
    private WebElement title;

    public  OnboardingPage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public boolean isTitleDisplayed(){return title.isDisplayed();}
    public boolean isBucketDisplayed(){
        return bucket.isDisplayed();
    }

    public WebElement getTitle(){
        return title;
}
}
