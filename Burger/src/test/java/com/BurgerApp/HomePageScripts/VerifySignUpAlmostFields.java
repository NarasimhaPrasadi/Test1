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

public class VerifySignUpAlmostFields 
{
	private ExtLogger log = new ExtLogger(VerifySignUpAlmostFields.class.toString());
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
	public void VerifySignUpAlmostField()
	{
		try {
			home = new HomePage(driver);
			launch = new LaunchScreenPage(driver);
					
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
							
			launch.signInButton();

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
		
			try {
				Assert.assertTrue(home.isFirstnameDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Verify isFirstnamepresent field", "Verify isFirstnamepresent field", "isFirstnamepresent field is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Verify isFirstnamepresent field", "Verify isFirstnamepresent field", "isFirstnamepresent field is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in isFirstnamepresent Title" +e.getMessage());
				Assert.assertTrue(false);
			}
			
			try {
				Assert.assertTrue(home.isLastnameDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Verify isLastnamepresent field", "Verify isLastnamepresent field", "isLastnamepresent field is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Verify isLastnamepresent field", "Verify isLastnamepresent field", "isLastnamepresent field is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in isLastnamepresent Title" +e.getMessage());
				Assert.assertTrue(false);
			}
			
			try {
				Assert.assertTrue(home.isZipCodeDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Verify ZipCode field", "Verify ZipCode field", "ZipCode field is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Verify ZipCode field", "Verify ZipCode field", "ZipCode field is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in isBirthdaypresent Title" +e.getMessage());
				Assert.assertTrue(false);
			}
			
			try {
				Assert.assertTrue(home.isBirthdayDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Verify isBirthdaypresent field", "Verify isBirthdaypresent field", "isBirthdaypresent field is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Verify isBirthdaypresent field", "Verify isBirthdaypresent field", "isBirthdaypresent field is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in isBirthdaypresent Title" +e.getMessage());
				Assert.assertTrue(false);
			}
			
			try {
				Assert.assertTrue(home.isEmailDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Verify isEmailpresent field", "Verify isEmailpresent field", "isEmailpresent field is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Verify isEmailpresent field", "Verify isEmailpresent field", "isEmailpresent field is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in isEmailpresent Title" +e.getMessage());
				Assert.assertTrue(false);
			}
							
		} catch (Exception e) {
			reports.writeIntoFile(driver, testCaseName,  "Burgerpage", "Burgerpage","Burgerpage", reports.fail, e.getMessage(), comlib.getCurrentTime());			
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
