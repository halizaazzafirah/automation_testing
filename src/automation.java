import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;


import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class automation {

    public static void main (String args[]) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.android.calculator2");
        dc.setCapability("appActivity", ".Calculator");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);

        MobileElement el3 = (MobileElement) ad.findElementByAccessibilityId("delete");
        el3.click();
        MobileElement el4 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_6");
        el4.click();
        MobileElement el5 = (MobileElement) ad.findElementByAccessibilityId("multiply");
        el5.click();
        MobileElement el6 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_3");
        el6.click();
        MobileElement el7 = (MobileElement) ad.findElementByAccessibilityId("equals");
        el7.click();


        Assert.assertEquals(ad.findElementById("com.android.calculator2:id/eq").getText(),18);
    }
}
