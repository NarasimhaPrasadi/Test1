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

public class VerifySignUpGooglePlus 
{
	private ExtLogger log = new ExtLogger(VerifySignUpGooglePlus.class.toString());
	AndroidDriver<MobileElement> driver=null;
	HomePage home;
	LaunchScreenPage launch;
	CommonLibrary comlib;
	ApplicationLibrary applib;
	Reports reports;
	DataManager datamanager;
	String moduleName = "Verify Google Plus";
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
			Runtime.getRuntime().exec("adb shell pm clear wb.mobile.cx.client.droid");
			driver = applib.launchAndroidApplication(driver, "uiautomator2");
			
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
				Assert.assertTrue(launch.isSignUpDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Verify signUp Button", "Tap on signUp Button ", "SignUp button is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Verify signUp Button", "Tap on signUp Button ", "SignUp button is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in SignUp" +e.getMessage());
				Assert.assertTrue(false);
			}
							
			launch.signUpButton();

			try {
				Assert.assertTrue(home.isGooglePlusDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Tap on googleplus", "Verify SignUp Almost screen", "signUpAlmost screen  is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Verify googleplus screen", "Verify SignUp Almost screen", "signUpAlmost screen is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in SignUp screen" +e.getMessage());
				Assert.assertTrue(false);
			}
			
			home.googlePlustap();
			home.signUpAlmost();
		
			try {
				Assert.assertTrue(home.isSignUpEmailTitleDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Verify signUpEmail Title", "Verify signUpEmail Title", "signUpEmail Title is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Verify signUpEmail Title", "Verify signUpEmail Title", "signUpEmail Title is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in signUpEmail Title" +e.getMessage());
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
