package generalStorePageObject;

import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesConfig {
    public static DesiredCapabilities getDesiredCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:deviceName", "Galaxy A51");
        capabilities.setCapability("appium:udid", "R58NA5CK9ME");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:appPackage", "com.androidsample.generalstore");
        capabilities.setCapability("appium:appActivity", ".SplashActivity");
        capabilities.setCapability("appium:automationName", "UIAutomator2");
        return capabilities;
    }

}
