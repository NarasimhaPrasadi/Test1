package com.BurgerApp.HomePageScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;

public class Sample {
	@Test
	public void lunchapp() throws MalformedURLException, InterruptedException {
		DesiredCapabilities Capabilities = new DesiredCapabilities();

		Capabilities.setCapability("automationName", "Appium");
		Capabilities.setCapability("platformName", "Android");
		Capabilities.setCapability("platformVersion", "7.0");
		Capabilities.setCapability("deviceName", "J7 Prime");
		Capabilities.setCapability("appPackage", "wb.mobile.cx.client.droid");
		Capabilities.setCapability("appActivity", "md51aa31b6da541c4803b34220dce779aa2.SplashScreen");
		Capabilities.setCapability("noReset", "true");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), Capabilities);
		Thread.sleep(5000);
		WebDriver wait;
}
}