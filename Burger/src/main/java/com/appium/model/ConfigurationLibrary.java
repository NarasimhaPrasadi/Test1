package com.appium.model;

public class ConfigurationLibrary {
	
	public static final String projectName = "WhataBurger";
	public static final String deviceName = "ba0bfc7a"; 
	public static final String fileName = "WhataBurger.apk";	
	public static final String platform_version="7.0";

	public static final String summaryResultPath = "src//main//java//com//appium//result";
	public static final String detailResultPath =  "src//main//java//com//appium//result//detailResult";
	public static final String videoPath = "src//main//java//com//appium//result//videos";
	public static final String imagePath = "src//main//java//com//appium//result//images";
	public static final String resultDirectory = "src//..//..//..//..//results";
	public static final String latestDirectory = "src//..//..//..//..//latest";

	public static int failCount = 0;
	public static int passCount = 0;
	public static int skipCount = 0;

	public static int failPercentage = 0;
	public static int passPercentage = 0;

	public static String executionStartTime = null;
	public static String executionEndTime = null;

	public static String xlpath_controller = "src//main//java//com//appium//input//Controller.xls";
	public static String xlsheet_controller = "ControllerSheet";
	public static String xlDataTable_controller = "ControllerData";

	public static String xlpath_login = "src//main//java//com//appium//input//data//Login.xls";
	public static String xlsheet_login = "ValidData";
	public static String xlsheet_login02 = "InValidData";
	public static String xlDataTable_login = "DataTable";

	public static int testPass = 0;
	public static int testFail = 0;

}

