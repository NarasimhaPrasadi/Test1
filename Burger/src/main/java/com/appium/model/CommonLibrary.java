package com.appium.model;
	
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import com.appium.pages.HomePage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
	
	public class CommonLibrary {
		AndroidDriver<MobileElement> driver;
		CommonLibrary comlib;
		HomePage home;
		ApplicationLibrary applib;
		Reports reports;
		DataManager datamanager;
		Dimension dsize;	
		String moduleName = "Common functionality";
		String testCaseName = getClass().getSimpleName();
		
		public CommonLibrary() {
			this.driver = (AndroidDriver<MobileElement>) driver;
		}
		
		private ExtLogger log = new ExtLogger(CommonLibrary.class.toString());

			public void initialize(String testCaseName, DataManager datamanager, CommonLibrary comlib, Reports reports)
				throws Exception {
	
			if (datamanager.executionController(testCaseName).equals("Yes")) {
		reports.scriptStartTime = comlib.getCurrentTime();
		reports.createFile(testCaseName);
	} else {
		   log.stepLog(testCaseName + " execution is skipped");
		   ConfigurationLibrary.skipCount++;
		   throw new SkipException(testCaseName + " execution is skipped");
		}
	
	}
	
	public void quit(String moduleName, String testCaseName, DataManager datamanager, CommonLibrary comlib,
			Reports reports) throws Exception {
		comlib.afterScript(reports, moduleName, testCaseName);
	   log.stepLog(testCaseName + " execution completed.");
	
	}
	
	
	public void init() {
		comlib = new CommonLibrary();
		applib = new ApplicationLibrary();
		reports = new Reports();
		datamanager = new DataManager();
	}
	
	/*
	 * Random numbers
	 */
	
	public int random() {
	
		int Maxnumber = 2000000000;
		int Minnumber = 1000000000;
		Random rn = new Random();
		int n = Maxnumber - Minnumber + 1;
		int i = rn.nextInt() % n;
		int randomNum = Minnumber + i;
		return randomNum;
	}
	/*
	 * Random Number for Specified range
	 */
	
	public int randomSpec(int Maxnumber, int Minnumber) {
	
		Random rn = new Random();
		int n = Maxnumber - Minnumber + 1;
		int i = rn.nextInt() % n;
		int randomNum = Minnumber + i;
		return randomNum;
	}
	
	/*
	 * Select an item form Dropdown.
	 * 
	 */
	public void select(WebDriver driver, String ID, String filter) {
	
		Select dropdown = new Select(driver.findElement(By.id(ID)));
		dropdown.selectByVisibleText(filter);
	
	}
	
	public boolean isElementPresent(WebDriver driver, By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	
	//Scroll until text Found
	public void swipeuntil(AndroidDriver<MobileElement> driver,String widgetText) {
		boolean found=false;
		while(!found)
		{
			try
			{
				driver.findElement(By.xpath("//android.widget.TextView[@text='"+ widgetText +"']"));
	 			found=true;
	 			}
			catch(Exception e)
			{
				Dimension size = driver.manage().window().getSize();
				int startx=size.width/2;
				int starty=(int)(size.height*0.5);
				int endx=size.width/2;
				int endy=(int)(size.height*0.2);
				driver.swipe(startx, starty, startx, endy, 1000);
			}
		}
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+ widgetText +"']")).click();
	}
	
	//Scroll until Button Found
	public void swipeuntilText(AndroidDriver<MobileElement> driver,String widgetText) {
		boolean found=false;
		while(!found)
		{
			try
			{
				driver.findElement(By.xpath("//android.widget.Button[@text='"+ widgetText +"']"));
	 			found=true;
	 			}
			catch(Exception e)
			{
				Dimension size = driver.manage().window().getSize();
				int startx=size.width/2;
				int starty=(int)(size.height*0.5);
				int endx=size.width/2;
				int endy=(int)(size.height*0.2);
				driver.swipe(startx, starty, startx, endy, 1000);
			}
		}
	}
	
	public void swipeuntilTextMatched(AndroidDriver<MobileElement> driver,String widgetText) {
		boolean found=false;
		while(!found)
		{
			try
			{
				driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='"+ widgetText +"']"));
	 			found=true;
	 			}
			catch(Exception e)
			{
				Dimension size = driver.manage().window().getSize();
				int startx=size.width/2;
				int starty=(int)(size.height*0.5);
				int endx=size.width/2;
				int endy=(int)(size.height*0.2);
				driver.swipe(startx, starty, startx, endy, 1000);
			}
		}
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='"+ widgetText +"']")).click();
	}
	
	public void HorizontalSwipe(AndroidDriver<MobileElement> driver,double percentage)
	{
		Dimension size =driver.manage().window().getSize();
		int height = size.getHeight();
		int width= size.getWidth();
		int y=(int)(height*percentage);
		int startx=(int)(width*0.75);
		int endx=(int)(width*0.20);
	    driver.swipe(startx,y,endx,y,1000);
	}
	
	public void HorizontalSwipeRightToLeft(AndroidDriver<MobileElement> driver,double percentage)
	{
		Dimension size =driver.manage().window().getSize();
		int height = size.getHeight();
		int width= size.getWidth();
		int y=(int)(height*percentage);
		int startx=(int)(width*0.75);
		int endx=(int)(width*0.20);
	    driver.swipe(endx, y, startx, y, 1000);
	}
	
	public void swipeHorizontalUntilTextMatched(AndroidDriver<MobileElement> driver,String widgetText,double percentage) {
		boolean found=false;
		while(!found)
		{
			try
			{
				driver.findElement(By.xpath("//android.widget.TextView[@text='"+ widgetText +"']"));
	 			found=true;
	 			}
			catch(Exception e)
			{
				Dimension size =driver.manage().window().getSize();
				int height = size.getHeight();
				int width= size.getWidth();
				int y=(int)(height*percentage);
				int startx=(int)(width*0.75);
				int endx=(int)(width*0.20);
			    driver.swipe(startx,y,endx,y,500);
			}
		}
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+ widgetText +"']")).click();
	}
		
	public void swipe(AndroidDriver<MobileElement> driver,int times)
	{
		for(int i=0;i<times;i++)
		{
			Dimension size1 = driver.manage().window().getSize();
			Double screenHeightStart1 = size1.getHeight() * 0.5;
			int scrollStart1 = screenHeightStart1.intValue();
			Double screenHeightEnd1 = size1.getHeight() * 0.2;
			int scrollEnd1 = screenHeightEnd1.intValue();
			driver.swipe(0,scrollStart1,0,scrollEnd1,2000);
		}
	}
	
	public void swipeHorizontal(AndroidDriver<MobileElement> driver,int times)
	{
		for(int i=0;i<times;i++)
		{
			Dimension dsize = driver.manage().window().getSize();
			int startx = (int) (dsize.width * 0.70);
			int endx = (int) (dsize.width * 0.30);
			int starty = (int) (dsize.height / 2);
			driver.swipe(startx, starty, endx, 0, 2000);
		 }
	}
	
	public void tapSearchKey(AndroidDriver<MobileElement> driver) throws InterruptedException
	{
		log.stepLog("Tap on Search key");
		int height =  driver.manage().window().getSize().getHeight();
		int width =  driver.manage().window().getSize().getWidth();			
		driver.tap(2, width-20, height-10, 1000);
		Thread.sleep(4000);
	}
	
	/*
		 * Capture screenshots
		 */
	public static void captureScreenshot(WebDriver driver, String ImageName) throws Exception {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(ConfigurationLibrary.imagePath + "//" + ImageName + ".jpg"));
	}
	
    /*
	 * Test case pass report
	 */
	public void pass(Reports reports, String moduleName, String testCaseName) throws Exception {
		ConfigurationLibrary.passCount = ConfigurationLibrary.passCount + 1;
		reports.summaryReport(moduleName, testCaseName, getExecutionTime(reports.scriptStartTime, getCurrentTime()),
				reports.pass);
		reports.closeFile();
	}
		/*
	 * Test case fail report
	 */
	public void fail(Reports reports, String moduleName, String tcName) throws Exception {
		ConfigurationLibrary.failCount = ConfigurationLibrary.failCount + 1;
		reports.summaryReport(moduleName, tcName, getExecutionTime(reports.scriptStartTime, getCurrentTime()),
				reports.fail);
		reports.closeFile();
	}
	
	/*
	 * System current date and time
	 */
	public String getCurrentTime() {
		Calendar cd = Calendar.getInstance();
		SimpleDateFormat datefor = new SimpleDateFormat("dd-MMM-yyyy HH-mm-ss");
		String date = datefor.format(cd.getTime());
		return date;
	}
	
	/*
	 * System current date and time
	 */
	public String getCurrentDate() {
		DateFormat datefor = new SimpleDateFormat("MM/dd/yyyy");
		Date dates = new Date();
		String date = datefor.format(dates);
		return date;
	}
	
	/*
	 * Method for after method
	 */
	public void afterTestRun() {
		if (Reports.testStatus) {
			Reports.passedTests++;
		} else {
			Reports.failedTests++;
		}
		Reports.testStatus = true;
	}
	
	/*
	 * Method for after class.
	 */
	public void afterScript(Reports reports, String moduleName, String testCaseName) throws Exception {
		// stopRecording();
		reports.executionHealthReport(moduleName);
		if (Reports.failedTests > 0) {
			fail(reports, moduleName, testCaseName);
		} else {
			pass(reports, moduleName, testCaseName);
		}
		Reports.failedTests = 0;
		Reports.passedTests = 0;
	}
	
	/*
	 * WebDriver wait
	 */
	
	public void ExplicitWait(WebDriver driver, By by) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	
	public String PatientId() {
		Random num = new Random();
		String patId = "PAT" + num.nextInt(111 * 123);
		return patId;
	}
	
	/*
	 * To verify if element is disabled
	 */
	
	public boolean isElementDisabled(WebDriver driver, By by) {
		WebElement element = driver.findElement(by);
		String text = element.getAttribute("class");
	if (text.contains("disabled"))
			return true;
		else
			return false;
	}
	
	/*
	 * To verify if element is checked
	 */
	
	public boolean isElementChecked(WebDriver driver, By by) {
		WebElement element = driver.findElement(by);
		String text = element.getAttribute("class");
	if (text.contains("checked"))
			return true;
		else
			return false;
	}
	
	/*
	 * Get execution time
	 */
	@SuppressWarnings("deprecation")
	public static String getExecutionTime(String executionStartTime, String executionEndTime) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH-mm-ss");
	SimpleDateFormat timeFor = new SimpleDateFormat("HH:mm:ss");
	
			Date endTime = sdf.parse(executionEndTime);
			Date startTime = sdf.parse(executionStartTime);
			endTime.setHours(endTime.getHours() - startTime.getHours());
			endTime.setMinutes(endTime.getMinutes() - startTime.getMinutes());
			endTime.setSeconds(endTime.getSeconds() - startTime.getSeconds());
	
			String date = timeFor.format(endTime);
			return date;
		}
	
	}
