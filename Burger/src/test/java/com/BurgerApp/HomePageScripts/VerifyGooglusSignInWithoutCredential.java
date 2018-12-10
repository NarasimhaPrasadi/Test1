package com.BurgerApp.HomePageScripts;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appium.model.ApplicationLibrary;
import com.appium.model.CommonLibrary;
import com.appium.model.ConfigurationLibrary;
import com.appium.model.DataManager;
import com.appium.model.ExtLogger;
import com.appium.model.Reports;
import com.appium.pages.HomePage;
import com.appium.pages.LaunchScreenPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class VerifyGooglusSignInWithoutCredential 
{
	private ExtLogger log = new ExtLogger(VerifyGooglusSignInWithoutCredential.class.toString());
	AndroidDriver<MobileElement> driver=null;
	HomePage home;
	LaunchScreenPage launch;
	CommonLibrary comlib;
	ApplicationLibrary applib;
	Reports reports;
	DataManager datamanager;
	String moduleName = "Verify Homescreen";
	String testCaseName = getClass().getSimpleName();

	public void init() {
		comlib = new CommonLibrary();
		applib = new ApplicationLibrary();
		reports = new Reports();
		datamanager = new DataManager();
	}
	
	@BeforeClass
	public void startUp() throws Exception {
		init();
		if(datamanager.executionController(testCaseName).equals("Yes")) {
			reports.scriptStartTime = comlib.getCurrentTime();
			reports.createFile(testCaseName);
			driver = applib.launchAndroidApplication(driver, "Appium");
			
		} else {
			System.out.println(testCaseName + " execution is skipped");
			ConfigurationLibrary.skipCount++;
			throw new SkipException(testCaseName + " execution is skipped");
		}
	}
	
	@BeforeMethod
	public void beforeTest(Method methodName) throws Exception {
		reports.writeTestName(methodName.getName());
	}
	
	@Test
	public void VerifySignUp()
	{
		try {
			home = new HomePage(driver);
			launch =new LaunchScreenPage(driver);
					
			try {
				Assert.assertTrue(launch.isSignInDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Verify SignIn Button", "Tap on SignIn Button ", "SignIn button is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Verify SignIn Button", "Tap on SignIn Button ", "SignIn button is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in SignIn" +e.getMessage());
				Assert.assertTrue(false);
			}
							
			launch.signInButton();

			try {
				Assert.assertTrue(home.isGooglePlusDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Tap on googleplus", "Verify SignUp Almost screen", "signUpAlmost screen  is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Verify googleplus screen", "Verify SignUp Almost screen", "signUpAlmost screen is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in SignIn screen" +e.getMessage());
				Assert.assertTrue(false);
			}
			
			home.googlePlusClick();
		
			try {
				Assert.assertTrue(home.isLogoDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Verify LogoPresent", "Verify isLogoPresent", "LogoPresent Title is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Verify LogoPresent", "Verify isLogoPresent", "LogoPresent Title is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in LogoPresent Title" +e.getMessage());
				Assert.assertTrue(false);
			}
							
		} catch (Exception e) {
			reports.writeIntoFile(driver, testCaseName, "Exception", "Tried performing action using Android driver", "Exception occured", reports.fail, e.getMessage(), comlib.getCurrentTime());
			log.stepLog("Exception in BurgerScript" +e.getMessage());
			Assert.assertTrue(false);
		}
	 }
	
	@AfterMethod
	public void afterTest() throws Exception {
		comlib.afterTestRun();
	}

	@AfterClass
	public void tearDown() throws Exception {
		comlib.afterScript(reports, moduleName, testCaseName);
		driver.quit();
		log.stepLog(testCaseName + " execution completed.");
	}
}
