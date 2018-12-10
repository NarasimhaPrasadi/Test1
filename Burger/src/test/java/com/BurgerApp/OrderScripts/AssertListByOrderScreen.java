package com.BurgerApp.OrderScripts;

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

public class AssertListByOrderScreen 
{
	private ExtLogger log = new ExtLogger(AssertListByOrderScreen.class.toString());
	AndroidDriver<MobileElement> driver=null;
	HomePage home;
	LaunchScreenPage launch;
	LocationPage locations;
	CommonLibrary comlib;
	ApplicationLibrary applib;
	Reports reports;
	DataManager datamanager;
	String moduleName = "Verify Oder Screen";
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
	public void VerifyAssertListByOrderScreen()
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
			
			home.SignInScreenLoginWithCredential("vijaysimha531@gmail.com","burgeR01");
			
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
            home.Orders();
           // home.startNewOrder();
            home.GpsDisabledAlertPopup();        
            locations.LocationSearchByCity();
            comlib.tapSearchKey(driver);          
            locations.LakeWayStore();
            locations.navigateToNextScreen();
           
           try {
                Assert.assertTrue(locations.isOrderHeader());
				reports.writeIntoFile(driver, testCaseName,  "Tap on DineIn Link", "Verify Order header","order Screen Verified", reports.pass, "", comlib.getCurrentTime());
			}
			catch(Exception e)
			{
				reports.writeIntoFile(driver, testCaseName,  "Tap on DineIn Link", "Verify Order header", "order Screen Verified", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in order Screen" +e.getMessage());
				Assert.assertTrue(false);
			}
            locations.listOnmenuItemTextViewBurgers();
            locations.isChickenCategoryHeaderDisplayed();
            locations.listOnChickenCategory();
            locations.listOnAllTimeFavouritesCategory(); 
            comlib.swipe(driver,1);
            locations.isBreakfastCategoryDisplayed();
            locations.listOnBreakfastCategory();
            comlib.swipe(driver,1);
            locations.iskidsCategoryDisplayed();
            locations.listOnkidsCategory();
            /* comlib.swipe(driver,2);
            locations.BreakfastCategory();
            locations.listOnBreakfastCategory(driver);
             comlib.swipe(driver,1);
             locations.listOnkidsCategory(driver);
            locations.listOnSlidesSaladsCategory();
            locations.listOnDessertsSnacksCategory();
            comlib.swipe(driver,3);
            locations.listOnDrinkShakesCategory();
            locations.listOnlistUnder550CaloriesCategory(driver);
            locations.Under550CaloriesCategory();
            
           comlib.swipeHorizontal(driver, 2);
           comlib.swipe(driver,1);
           locations.listOnAllTimeFavouritesCategory(driver);*/

         
  		
			} catch (Exception e) {
				reports.writeIntoFile(driver, testCaseName, "Exception", "Tried performing action using Android driver", "Exception occured", reports.fail, e.getMessage(), comlib.getCurrentTime());
				log.stepLog("Exception in Locations" +e.getMessage());
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
