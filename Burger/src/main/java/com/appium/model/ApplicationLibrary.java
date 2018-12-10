package com.appium.model;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
/**
 * 
 * @author VijaySimha
 *
 */

public class ApplicationLibrary {

	public  AndroidDriver<MobileElement> launchAndroidApplication(AndroidDriver<MobileElement> driver,String automationName) throws Exception {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigurationLibrary.deviceName);
		capabilities.setCapability("automationName", automationName);
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", ConfigurationLibrary.platform_version);
		capabilities.setCapability("newCommandTimeout", 400);
		capabilities.setCapability("appPackage", "wb.mobile.cx.client.droid");
		capabilities.setCapability("appActivity", "md51aa31b6da541c4803b34220dce779aa2.SplashScreen");
	    capabilities.setCapability("noReset","true");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		return driver;
	}
}
	
	
