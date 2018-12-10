package com.BurgerApp.LocationScripts;

import java.io.IOException;
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
import com.appium.pages.LocationPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SearchLocationByZipCode 
{
	private ExtLogger log = new ExtLogger(SearchLocationByZipCode.class.toString());
	AndroidDriver<MobileElement> driver=null;
	HomePage home;
	LaunchScreenPage launch;
	LocationPage locations;
	CommonLibrary comlib;
	ApplicationLibrary applib;
	Reports reports;
	DataManager datamanager;
	String moduleName = "Verify Location by Zipcode";
	String testCaseName = getClass().getSimpleName();

	public void init() throws IOException {
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
	public void VerifyLocationbyZipCode()
	{
		try {
			home = new HomePage(driver);
			launch = new LaunchScreenPage(driver);
			locations = new LocationPage(driver);
			
			try {
				Assert.assertTrue(launch.isSignInDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Verify SignIn button", "Verify SignIn button", "launch screen is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e){
				reports.writeIntoFile(driver, testCaseName,  "Verify SignIn button", "Verify SignIn button", "launch screen is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in Verified" +e.getMessage());
				Assert.assertTrue(false);
			}
				
			home.SignInTap();
			
			try {
				Assert.assertTrue(home.isEmailScreenDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Tap on SignIn button", "Verify SignIn button", "SignInScreen is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Tap on SignIn button", "Verify SignIn button", "SignInScreen is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in Verified" +e.getMessage());
				Assert.assertTrue(false);
			}
			
			home.SignInScreenLoginWithCredential("Vaibhavkanavalli@hotmail.com","burger01");
			
			try {
				Assert.assertTrue(home.isSkipPresentDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Verify SignIn button", "Tap on SignIn button", "SignInScreen is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Verify SignIn button", "Tap on SignIn button", "SignInScreen is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in Verified" +e.getMessage());
				Assert.assertTrue(false);
			}
			
			home.Fbskip();
            home.Locations();
            home.GpsDisabledAlertPopup();

            locations.LocationSearchByZipCode();
            comlib.tapSearchKey(driver);
            
            try {
            	Assert.assertTrue(locations.isLocatedBurgerStoreZipCode());
				reports.writeIntoFile(driver, testCaseName,  "Tap on Search key", "Verify Located stores and Tap","Location is clickable", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Tap on Search key", "Verify Located stores and Tap", "Location is clickable", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in Verified" +e.getMessage());
				Assert.assertTrue(false);
			}
            locations.LocatedBurgerStoreZipCode();
            
            try {
            	Assert.assertTrue(locations.isBartonSpringsDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Verify Barton Springs & S 1st displayed", "Verify Barton Springs & S 1st displayed","Barton Springs & S 1st is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Verify Barton Springs & S 1st displayed", "Verify Barton Springs & S 1st displayed", "Barton Springs & S 1st is verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in Verified" +e.getMessage());
				Assert.assertTrue(false);
			}
            
            try {
            	Assert.assertTrue(locations.isBurger346Displayed());
				reports.writeIntoFile(driver, testCaseName,  "Verify Whataburger #346 displayed", "Verify Whataburger #346 displayed","Whataburger #346 is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Verify Whataburger #346 displayed", "Verify Whataburger #346 displayed", "Whataburger #346 is verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in Verified" +e.getMessage());
				Assert.assertTrue(false);
			}
            
            try {
            	Assert.assertTrue(locations.isBartonSpringsDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Verify 601 Barton Springs Rd Displayed", "Verify 601 Barton Springs Rd Displayed","601 Barton Springs Rd is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Verify 601 Barton Springs Rd Displayed", "Verify 601 Barton Springs Rd Displayed", "601 Barton Springs Rd is verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in Verified" +e.getMessage());
				Assert.assertTrue(false);
			}
            
            try {
            	Assert.assertTrue(locations.isAustinDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Verify Austin, TX 78704 Displayed", "Verify Austin, TX 78704 Displayed","Austin, TX 78704 is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Verify Austin, TX 78704 Displayed", "Verify Austin, TX 78704 Displayed", "Austin, TX 78704 is verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in Verified" +e.getMessage());
				Assert.assertTrue(false);
			}
            
            locations.addressLayoutTap();    
            locations.ShareLinkTap();
            
            try {
            	Assert.assertTrue(locations.isShareLinksDisplayed());
				reports.writeIntoFile(driver, testCaseName,  "Verify ShareLinks", "Verify ShareLinks","ShareLinks is verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Verify ShareLinks", "Verify ShareLinks", "ShareLinks is not verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in Verified" +e.getMessage());
				Assert.assertTrue(false);
			}
        	
 					
			} catch (Exception e) {
				reports.writeIntoFile(driver, testCaseName, "Exception", "Tried performing action using Android driver", "Exception occured", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in SettingsFacebook" +e.getMessage());
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
