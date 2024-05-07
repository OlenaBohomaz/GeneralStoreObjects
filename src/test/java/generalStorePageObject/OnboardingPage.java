package generalStorePageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class OnboardingPage {
    @AndroidFindBy(id="com.androidsample.generalstore:id/splashscreen")
    private WebElement bucket;

    @AndroidFindBy(id="com.androidsample.generalstore:id/toolbar_title")
    private WebElement title;

    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"Select the country where you want to shop\"]")
    private WebElement selectCountryText;

    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"Your Name\"]")
    private WebElement  yourNameText;

    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"Gender\"]")
    private WebElement  genderText;

    @AndroidFindBy(id="android:id/text1")
    private WebElement  country;

    @AndroidFindBy(xpath="//android.widget.ImageView")
    private WebElement  picture;

    @AndroidFindBy(xpath="//android.widget.Spinner[@resource-id=\"com.androidsample.generalstore:id/spinnerCountry\"]")
    private WebElement  spinnerCountry;

    @AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
    private WebElement  maleRadio;

    @AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
    private WebElement  femaleRadio;

    @AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
    private WebElement  inputName;

    @AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
    private WebElement  button;


    public  OnboardingPage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public boolean isTitleDisplayed(){return title.isDisplayed();}
    public boolean isTitleEnabled(){return title.isEnabled();}
    public boolean isBucketDisplayed(){
        return bucket.isDisplayed();
    }

    public WebElement getTitle(){
        return title;
}
    public boolean isSCountryDisplayed(){return country.isDisplayed();}
    public boolean isCountryTextEnabled(){return country.isEnabled();}
    public String getCountryTextAttribute(){return country.getAttribute("text");}
    public boolean isInputNameDisplayed(){return inputName.isDisplayed();}
    public boolean isInputNameEnabled(){return inputName.isEnabled();}

    public void inputClick() {inputName.click();}
    public void enterName(String name) {
        inputName.sendKeys(name);
    }

    public void hideKeyboard(){
        driver.hideKeyboard();
    };
}
