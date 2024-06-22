package generalStorePageObject;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.nio.file.Paths;

public class DesiredCapabilitiesConfig {
    public static DesiredCapabilities getDesiredCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:deviceName", "Galaxy A51");
        capabilities.setCapability("appium:udid", "R58NA5CK9ME");

        capabilities.setCapability("platformName", "Android");
        //for setup apk on device 15 str.
        String appPath = Paths.get("src/test/java/generalStorePageObject/General-Store.apk").toAbsolutePath().toString();
        capabilities.setCapability("appium:app", appPath);

        capabilities.setCapability("appium:appPackage", "com.androidsample.generalstore");
        capabilities.setCapability("appium:appActivity", ".SplashActivity");
        capabilities.setCapability("appium:automationName", "UIAutomator2");

        //for setup apk on device 23 str.
        capabilities.setCapability("appium:fullReset", "true");
        return capabilities;
    }

}
