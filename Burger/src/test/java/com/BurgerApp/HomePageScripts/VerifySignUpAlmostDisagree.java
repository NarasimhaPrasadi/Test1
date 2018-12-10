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

public class VerifySignUpAlmostDisagree 
{
	private ExtLogger log = new ExtLogger(VerifySignUpAlmostDisagree.class.toString());
	AndroidDriver<MobileElement> driver=null;
	HomePage home;
	LaunchScreenPage launch;
	CommonLibrary comlib;
	ApplicationLibrary applib;
	Reports reports;
	DataManager datamanager;
	String moduleName = "Verify SignUpAlmostDisagree";
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
			launch = new LaunchScreenPage(driver);
					
			try {
				Assert.assertTrue(launch.isSignUpDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Verify SignUp button", "Verify SignUp button", "launch screen is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Verify SignUp button", "Verify SignUp button", "launch screen is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in SignUp" +e.getMessage());
				Assert.assertTrue(false);
			}
			launch.signUpButton();
			
			try {
				Assert.assertTrue(home.isGooglePlusDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Verify googleplus button", "Tap on googleplus", "SignUpAlmostscreen  is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Verify googleplus button", "Tap on googleplus", "SignUpAlmostscreen  is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in SignUpAlmostscreen screen" +e.getMessage());
				Assert.assertTrue(false);
			}
			home.googlePlustap();
			home.signUpAlmostyearChangeDisagree();
			
			try {
				Assert.assertTrue(home.isAgeVerificationDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Verify ageVerification Title", "Verify ageVerification Title", "ageVerification Title is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Verify ageVerification Title", "Verify ageVerification Title", "ageVerification Title is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in ageVerification Title" +e.getMessage());
				Assert.assertTrue(false);
			}
			try {
				Assert.assertTrue(home.isdisagreeDisplayed());
				reports.writeIntoFile(driver, testCaseName, "Verify isdisagree", "Tap on isdisagree", "Popup screen is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName, "Verify isdisagree", "Tap on disagree", "Popup screen is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in launch screen" +e.getMessage());
				Assert.assertTrue(false);
			}
			
			home.disagree();
			try {
				Assert.assertTrue(home.isSignUpButtonDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Verify SignUp Screen", "Verify SignUp Screen", "SignUp Screen screen is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Verify SignUp Screen", "Verify SignUp Screen", "SignUp screen is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in Verify SignUp Screen" +e.getMessage());
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
