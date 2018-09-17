package com.airtel.appiumDemo.scenarios;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidSetup {
    AppiumDriver<MobileElement> driver;

    public DesiredCapabilities setDesiredCapabilitiesRealDevice()  {
    	DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "OnePlus6");
		caps.setCapability("udid", "f2b69ba3"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "8.1.0");
		caps.setCapability("appPackage", "com.android.vending");
		caps.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");
		caps.setCapability("noReset", "true");

		return caps;
    }
}

