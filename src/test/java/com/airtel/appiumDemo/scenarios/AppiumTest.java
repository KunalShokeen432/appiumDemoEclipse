package com.airtel.appiumDemo.scenarios;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumTest {
	
	DesiredCapabilities capsRealDevice;
	AndroidSetup setup = new AndroidSetup();
	
	@BeforeClass
	public void setupBeforeClass() throws MalformedURLException {
		capsRealDevice = setup.setDesiredCapabilitiesRealDevice();
	}

	@Test
	public void launchPlayStoreTest() throws InterruptedException, MalformedURLException {
		AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capsRealDevice);
	}

}

