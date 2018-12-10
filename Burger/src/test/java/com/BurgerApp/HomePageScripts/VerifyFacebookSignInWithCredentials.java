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

public class VerifyFacebookSignInWithCredentials 
{
	private ExtLogger log = new ExtLogger(VerifyFacebookSignInWithCredentials.class.toString());
	AndroidDriver<MobileElement> driver=null;
	HomePage home;
	LaunchScreenPage launch;
	CommonLibrary comlib;
	ApplicationLibrary applib;
	Reports reports;
	DataManager datamanager;
	String moduleName = "Verify FacebookSignIn";
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
			driver = applib.launchAndroidApplication(driver,"uiautomator2");
			
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
	public void VerifyFacebookSignWithCredential()
	{
		try {
			home = new HomePage(driver);
			launch = new LaunchScreenPage(driver);
					
			try {
				Assert.assertTrue(launch.isSignUpDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Verify SignUp button", "Verify SignUp button", "launch screen is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Verify SignUp button", "Verify SignUp button", "launch screen is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in Verified" +e.getMessage());
				Assert.assertTrue(false);
			}
				
			launch.signInButton();
			try {
				Assert.assertTrue(home.isfacebookIconDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Tap on facebook", "Tap on facebook", "facebook  is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Tap on facebook", "Verify facebook ", "facebook  is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in SignUp screen" +e.getMessage());
				Assert.assertTrue(false);
			}
			home.facebookSignup();
			home.Fbskip();

			try {
				Assert.assertTrue(home.isLocationDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Tap on Skip", "Verify Home screen", "Home screen  is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Tap on Skip", "Verify Home screen", "Home screen is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in SignUp screen" +e.getMessage());
				Assert.assertTrue(false);
			}
			home.Signout();

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
