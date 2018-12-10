package com.appium.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.appium.model.CommonLibrary;
import com.appium.model.ExtLogger;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage 
{
    private ExtLogger log = new ExtLogger(HomePage.class.toString());
	WebDriverWait wait;
	CommonLibrary comlib;
	AndroidDriver<MobileElement> driver;

	public HomePage(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = (AndroidDriver<MobileElement>) driver;
		wait = new WebDriverWait(driver, 60);
		comlib = new CommonLibrary();
	}
		
	/*********Screen elements**********/
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/LaunchSignUpButton")
	public WebElement signUp;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Sign In']")
	public WebElement SignInButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Forgot Password?']")
	public WebElement ForgotPassword;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/EmailIdEdTxtview")
	public WebElement EmailId;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/SubmitButton")
	public WebElement SubmitButton;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/SignInGoogleButton")
	public WebElement googlePlus;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/SignInFacebookButton")
	public WebElement facebookIcon;
		
	@AndroidFindBy(xpath="//android.widget.Button[@text='Agree']")
	public WebElement Agree;
	
	@AndroidFindBy(xpath="//*[@class='android.widget.Button'][2]")
	public MobileElement allowAppPermission;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/globalPositiveButton")
	public List<WebElement> ReadAcceptedList;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='No network connection']")
	public WebElement NoNetworkConnection;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/globalPositiveButton")
	public WebElement ReadAccepted;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/globalPositiveButtonTwo")
	public WebElement globalPositiveButtonTwo;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/globalTitle")
	public WebElement globalTitle;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/globalNegativeButton")
	public WebElement globalNegativeButton;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/globalText")
	public WebElement globalText;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Skip']")
	public WebElement SkipRewards;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/toolbar_logo_container")
	public WebElement LogoText;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/birthdayText")
	public WebElement birthday;	
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/globalTitle")
	public WebElement atleast13yearsAlert;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/ageVerificationText")
	public WebElement ageVerification;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Done']")
	public WebElement Done;	
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/inputLayoutEmail")
	public WebElement EmailSignUpAlmost;	
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/globalPositiveButton")
	public WebElement Ok;	
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/signUpEmailTitle")
	public WebElement signUpEmailTitle;	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Email or Phone']")
	public WebElement emailEditFb;
	
	@AndroidFindBy(xpath="(//*[@class='android.widget.EditText'])[2]")
	public WebElement PasswordEditFb;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='LOG IN']")
	public WebElement LOGINButtonFb;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='LOG INTO ANOTHER ACCOUNT']")
	public WebElement LoginAnotheraccount;
	
	@AndroidFindBy(xpath="//android.widget.ListView[@index='1']")
	public List<WebElement> chooseAccount;
	
	@AndroidFindBy(id="com.google.android.gms:id/title")
	public WebElement chooseAccountBurger;
	
	@AndroidFindBy(xpath="//android.widget.TextView")
	public List<WebElement> chooseAccountDisplayName;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Agree']")
	public WebElement AgreeButton;
	
	//Browser with no Fb app installed
	@AndroidFindBy(id="m_login_email")
	public WebElement emailBrowser;
	
	@AndroidFindBy(id="u_0_3")
	public WebElement ContinueFb;
	
	@AndroidFindBy(id="m_login_password")
	public WebElement PasswordBrowser;
	
	@AndroidFindBy(id="u_0_5")
	public WebElement LoginButton;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Disagree']")
	public WebElement disagree;

	
	/*******************Create Google account**********/
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Use another account']")
	public WebElement useAnotherAccount;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Or create a new account']")
	public WebElement createAccount;
	
	@AndroidFindBy(xpath="//android.widget.CheckBox[@text='I have read the Terms and Conditions']")
	public WebElement ReadConditions;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/inputLayoutFirstName")
	public WebElement firstName;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/inputLayoutLastName")
	public WebElement lastName;
	
	@AndroidFindBy(id="collectNameNext")
	public WebElement Next;
	
	@AndroidFindBy(xpath="//android.view.View[@text='NEXT']")
	public WebElement Next1;
	
	@AndroidFindBy(id="month-label")
	public WebElement monthLabel;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='January']")
	public WebElement monthJan;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Day']")
	public WebElement day;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Year']")
	public WebElement year;
	
	@AndroidFindBy(id="gender-label")
	public WebElement Gender;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Male']")
	public WebElement Male;
	
	@AndroidFindBy(id="username")
	public WebElement UsernameGmailcom;
	
	@AndroidFindBy(id="passwd")
	public WebElement passwdCreate;
	
	@AndroidFindBy(id="passwd-again")
	public WebElement passwdCreateConfirm;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/agreeTermsSignUpButton")
	public WebElement agreeTermsSignUp;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/EmailEditText")
	public WebElement EmailSignIn;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/PasswordEditText")
	public WebElement PasswordSignIn;
	
	@AndroidFindBy(className="android.widget.TextView")
	public ArrayList<MobileElement> Accounts;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/toolbar_title_image")
	public WebElement toolbarTitle;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc='Navigate up']")
	public WebElement Navigateup;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/quicklinksImageView")
	public WebElement quicklinksImageView;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/quicklinksTextView")
	public WebElement quicklinksTextView;

	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/orangeBarTextView")
	public WebElement OrderFavouritesHomeScreen;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/btDelete")
	public WebElement Delete;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/btMarkAsRead")
	public WebElement MarkAsRead;
	
	@AndroidFindBy(xpath="//android.widget.RelativeLayout[@index='2']//android.widget.FrameLayout[@index='0']//android.widget.RelativeLayout[@index='1']/android.widget.TextView")
	public WebElement FirstMessage;
	
	@AndroidFindBy(xpath="//android.widget.RelativeLayout[@index='2']//android.widget.FrameLayout[@index='1']//android.widget.RelativeLayout[@index='1']/android.widget.TextView")
	public WebElement SecondMessage;
	
	@AndroidFindBy(xpath="//android.widget.RelativeLayout[@index='2']//android.widget.FrameLayout[@index='2']//android.widget.RelativeLayout[@index='1']/android.widget.TextView")
	public WebElement ThirdMessage;
	
	@AndroidFindBy(xpath="//android.widget.RelativeLayout[@index='2']//android.widget.FrameLayout[@index='3']//android.widget.RelativeLayout[@index='1']/android.widget.TextView")
	public WebElement FourthMessage;
	
	@AndroidFindBy(xpath="//android.widget.RelativeLayout[@index='2']//android.widget.FrameLayout[@index='4']//android.widget.RelativeLayout[@index='1']/android.widget.TextView")
	public WebElement FifthMessage;
	
    @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Menu']")
	public WebElement MenuList;
    
    @AndroidFindBy(id="wb.mobile.cx.client.droid:id/progressBar")
   	public List<WebElement> progressBar;
    
    @AndroidFindBy(id="wb.mobile.cx.client.droid:id/edit")
   	public WebElement editDashBoard;
    
    @AndroidFindBy(id="wb.mobile.cx.client.droid:id/editFavoritesButton")
   	public WebElement editFavoritesButton;
    
    @AndroidFindBy(xpath="//android.widget.TextView[@text='Update']")
   	public WebElement Update;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Order']")
	public WebElement Order;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Locations']")
	public WebElement Locations;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Ok, Thanks']")
	public WebElement LocationServicesTurnedOFF;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Use GPS to quickly find locations near you?']")
	public WebElement GpsNotEnabledMessage;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='No']")
	public WebElement No;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/dontAskButton")
	public WebElement dontAskButton;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/action_location_switch")
	public WebElement SwitchView;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Ok, Got It']")
	public WebElement GotItButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Delete']")
	public WebElement DeleteButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Edit']")
	public WebElement EditButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Order']")
	public WebElement OrderButton;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Start New Order']")
	public WebElement startNewOrderButton;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Community']")
	public WebElement Community;

	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Our Story']")
	public WebElement OurStory;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Account History']")
	public WebElement AccountHistory;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Close']")
	public List<WebElement> Close;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Close']")
	public WebElement CloseIcon;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Payment']")
	public WebElement Payments;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Rewards']")
	public WebElement Rewards;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Select Location & Pickup']")
	public WebElement SelectLocationPickUp;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/smallLinkImageView")
	public WebElement settingsIcon;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/locationHeaderTextView")
	public WebElement Location;
	
	@FindBy(id="wb.mobile.cx.client.droid:id/FacebookSettingLayout")
	public WebElement Facebook;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Settings']")
	public List<WebElement> Settings;
	
	@AndroidFindBy(xpath="//*[android.widget.TextView[@text='Edit Profile Image']]")
	public List<WebElement> profileImage;
	
	@AndroidFindBy(xpath="//*[android.widget.TextView[@text='Passcode Lock']]")
	public List<WebElement> PasscodeLock;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Complete Sign Up']")
	public WebElement completeSignUp;
	
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/zipCodeEditText")
	public WebElement zipCode;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Yes, Sign Out']")
	public WebElement YesSignOut;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Visit Whataburger.com']")
	public WebElement VisitWhataburgerDotcom;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Visit the Whatastore']")
	public WebElement VisitWhataStore;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Terms and Conditions']")
	public WebElement TermConditions;
	
	@AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Privacy Policy']")
	public WebElement PrivacyPolicy;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Reload']")
	public WebElement Reload;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Manage']")
	public WebElement Manage;
	
	public void Reload()
	{
		wait.until(ExpectedConditions.visibilityOf(Reload));
		log.stepLog("Tap on Reload");
		Reload.click();
		OkGotItTap();
	}
	
	public void Manage()
	{
		wait.until(ExpectedConditions.visibilityOf(Manage));
		log.stepLog("Tap on Manage");
		Manage.click();
		OkGotItTap();
	}
	
	public void signUpButton()
	{
		wait.until(ExpectedConditions.visibilityOf(signUp));
		log.stepLog("tap on SignUp");
		signUp.click();
	}
		
	public void AgreeButton()
	{
		wait.until(ExpectedConditions.visibilityOf(Agree));
		log.stepLog("tap on Agree button");
		Agree.click();
	}
	
	public void DeleteButton()
	{
		wait.until(ExpectedConditions.visibilityOf(DeleteButton));
		log.stepLog("tap on DeleteButton");
		DeleteButton.click();
		wait.until(ExpectedConditions.visibilityOf(ReadAccepted));
		log.stepLog("Tap on DeleteFavorite Button");
		ReadAccepted.click();
	}
	
	public void EditButton()
	{
		wait.until(ExpectedConditions.visibilityOf(EditButton));
		log.stepLog("tap on EditButton");
		EditButton.click();
		wait.until(ExpectedConditions.visibilityOf(ReadAccepted));
		log.stepLog("Tap on Rename Favorite Order Button");
		ReadAccepted.click();
		wait.until(ExpectedConditions.visibilityOf(ReadAccepted));
		log.stepLog("Tap on Rename and Continue Button");
		ReadAccepted.click();
	}
	
	public void EditItemsOnly() throws IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(EditButton));
		log.stepLog("tap on EditButton");
		EditButton.click();
		wait.until(ExpectedConditions.visibilityOf(globalPositiveButtonTwo));
		log.stepLog("Tap on globalPositiveButtonTwo Button");
		globalPositiveButtonTwo.click();
		wait.until(ExpectedConditions.invisibilityOfAllElements(progressBar));
		WifiDisable();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		FluentWait<WebDriver> wait = new WebDriverWait(driver, 10);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(Update));
		log.stepLog("Tap on Update Button");
		Update.click();
	}
	
	public void OrderButton()
	{
		wait.until(ExpectedConditions.visibilityOf(OrderButton));
		log.stepLog("tap on OrderButton");
		OrderButton.click();
	}
	
	public void SignInTap()
	{
		wait.until(ExpectedConditions.visibilityOf(SignInButton));
		log.stepLog("tap on SignIn button");
		SignInButton.click();
	}
	
	public void SignInScreenLoginWithCredential(String userName,String password)
	{					
		log.stepLog("Enter valid credentials");
		EmailSignIn.sendKeys(userName);
		PasswordSignIn.sendKeys(password);
		SignInButton.click();
	}
		
	public void signInButton()
	{
		wait.until(ExpectedConditions.visibilityOf(SignInButton));
		log.stepLog("tap on SignIn");
		SignInButton.click();
	}	
	
	public void FogotPassword()
	{
		wait.until(ExpectedConditions.visibilityOf(ForgotPassword));
		log.stepLog("tap on ForgotPassword Link");
		ForgotPassword.click();
		wait.until(ExpectedConditions.visibilityOf(EmailId));
		EmailId.sendKeys("vaibhavkanavalli@hotmail.com");
		SubmitButton.click();
	}	
	
	public void googlePlusClick()
	{
		wait.until(ExpectedConditions.visibilityOf(googlePlus));
		log.stepLog("tap on googlePlus");
		googlePlus.click();
	}	
	
	public void googlePlustap() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(googlePlus));
		log.stepLog("tap on googlePlus");
		googlePlus.click();	
		wait.until(ExpectedConditions.visibilityOf(chooseAccountBurger));
		 ArrayList<MobileElement> ls = Accounts;
		 for(int j=0;j<=ls.size();j++)
		 { 
		 ls.get(ls.size() - 1).click();
		 }
		wait.until(ExpectedConditions.visibilityOf(birthday));
		log.stepLog("Almost screen displayed");
	}
		
	  public void FbBrowser() throws InterruptedException
	  {
		  wait.until(ExpectedConditions.visibilityOf(emailBrowser));
		  log.stepLog("Login with credentials");
		  emailBrowser.sendKeys("Whataburgerapril@gmail.com");
		  PasswordBrowser.sendKeys("burger01");
		  LoginButton.click();
		  wait.until(ExpectedConditions.visibilityOf(ContinueFb));
		  ContinueFb.click();
	  }
	  
	  public void FbBrowserSettingsScreen() throws InterruptedException
	  {
		  wait.until(ExpectedConditions.visibilityOf(emailBrowser));
		  log.stepLog("Login with credentials");
		  emailBrowser.sendKeys("Whataburgerapril@gmail.com");
		  PasswordBrowser.sendKeys("burger01");
		  LoginButton.click();
		  wait.until(ExpectedConditions.visibilityOf(ContinueFb));
		  ContinueFb.click();
		  wait.until(ExpectedConditions.visibilityOf(GotItButton));
		  GotItButton.click();
		  log.stepLog("Logged In scucess");
	  }
	  
	  public void withFbApp() throws InterruptedException, IOException
	  {
 		log.stepLog("Facebook App is installed");
		wait.until(ExpectedConditions.visibilityOf(emailEditFb));
		emailEditFb.sendKeys("Whataburgerapril@gmail.com");
		PasswordEditFb.click();
		PasswordEditFb.sendKeys("burger01");
		driver.hideKeyboard();
		LOGINButtonFb.click();
	  }
	  
	  public void withoutCredentialFbAppLogin() throws InterruptedException, IOException
	  {
 		log.stepLog("Facebook App is installed");
	  }
	  
	  public void FbSettingsPopUp()
	  {
		wait.until(ExpectedConditions.visibilityOf(GotItButton));
 		log.stepLog("Facebook App is installed");
 		GotItButton.click();
	  }
	  
	public void facebookLogin() throws InterruptedException, IOException
	{
		boolean isPresent = driver.isAppInstalled("com.facebook.katana");
		if(isPresent)
		{
			withFbApp();
		}
		else
		{
			FbBrowserSettingsScreen();
		}	
    }
	
	public void facebookSignup() throws InterruptedException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(facebookIcon));
		log.stepLog("tap on facebookIcon");
		facebookIcon.click();	
		boolean isPresent = driver.isAppInstalled("com.facebook.katana");
		if(isPresent)
		{
			withFbApp();
		}
		else
		{
			FbBrowser();
		}	
    }
	
	public void facebookSignInWithoutCredential() throws InterruptedException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(facebookIcon));
		log.stepLog("tap on facebookIcon");
		facebookIcon.click();	
		boolean isPresent = driver.isAppInstalled("com.facebook.katana");
		if(isPresent)
		{
			withoutCredentialFbAppLogin();
		}
		else
		{
			FbBrowser();
		}	
    }
	
	public void facebookTap()
	{
		wait.until(ExpectedConditions.visibilityOf(Facebook));
		log.stepLog("tap on facebookIcon");
		Facebook.click();
	}
    
	 public void WifiDisable() throws IOException, InterruptedException
	 {
			try {
				Runtime.getRuntime().exec("adb shell am broadcast -a io.appium.settings.wifi --es setstatus disable");
			}
			catch (IOException e) {
				// TODO: handle exception
			}
	 }
	 
	 public void WifiEnable() throws InterruptedException, IOException
	 {
		Runtime.getRuntime().exec("adb shell am broadcast -a io.appium.settings.wifi --es setstatus enable");
	 }
	 
	 public void OrderFavouriteTitle()
	 {
		isMenuDisplayed();
		wait.until(ExpectedConditions.visibilityOf(quicklinksImageView));
		wait.until(ExpectedConditions.visibilityOf(quicklinksTextView));
		isLogoDisplayed();
		LogoText.getText();		
		quicklinksTextView.getText();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		FluentWait<WebDriver> wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("wb.mobile.cx.client.droid:id/orangeBarTextView")));
		wait.until(ExpectedConditions.visibilityOf(OrderFavouritesHomeScreen));
		log.stepLog("Tap on OrderFavourites Title");
		OrderFavouritesHomeScreen.click();
	 }
	 
	 public void OrderLocations()
	{
		wait.until(ExpectedConditions.visibilityOf(Navigateup));
		Navigateup.click();
		log.stepLog("tap on Locations");
		wait.until(ExpectedConditions.visibilityOf(Locations));
		Locations.click();
 	}
	
	public void Locations() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(Navigateup));
		log.stepLog("tap on Hamburg Menu");
		Navigateup.click();
		wait.until(ExpectedConditions.visibilityOf(Locations));
		log.stepLog("tap on Locations");
		Locations.click();
 	}
	
	public void Orders() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(Navigateup));
		log.stepLog("tap on Hamburg Menu");
		Navigateup.click();
		wait.until(ExpectedConditions.visibilityOf(Order));
		log.stepLog("tap on Order");
		Order.click();
 	}
		
	public void startNewOrder(){
		wait.until(ExpectedConditions.visibilityOf(startNewOrderButton));
		log.stepLog("Tap on Start new order button");
		startNewOrderButton.click();
	}
	
	public void SwitchView(){
		wait.until(ExpectedConditions.visibilityOf(SwitchView));
		SwitchView.click();
		log.stepLog("Tap on SwitchView");
	}
	
	public void GpsDisabledAlertPopup(){
		wait.until(ExpectedConditions.visibilityOf(No));
		log.stepLog("Verified Popup");
		No.click();
		log.stepLog("Tap on No button");
	}
	
	public void DoNotAskMessagePopUpGpsDisabled(){
		wait.until(ExpectedConditions.visibilityOf(dontAskButton));
		log.stepLog("Verified Popup");
		dontAskButton.click();
		log.stepLog("Tap on Donot Ask Button");
	}
	
	public void GpsEnabledAlertPopup(){
		wait.until(ExpectedConditions.visibilityOf(startNewOrderButton));
		log.stepLog("Tap on Start new order button");
		startNewOrderButton.click();
		wait.until(ExpectedConditions.visibilityOf(GotItButton));
		log.stepLog("Verified popup");
		GotItButton.click();
		log.stepLog("Tap on Ok button");
	}
	
	public void PopupEnableGps(){
		wait.until(ExpectedConditions.visibilityOf(startNewOrderButton));
		log.stepLog("Tap on Start new order button");
		startNewOrderButton.click();
		wait.until(ExpectedConditions.visibilityOf(ReadAccepted));
		log.stepLog("Tap on ReadAccepted");
		ReadAccepted.click();
	}
	  
	public void checkWifiDisabled() throws IOException, InterruptedException
	{
		wait.until(ExpectedConditions.invisibilityOfAllElements(progressBar));
		WifiDisable();
		isglobalNegativeButtonDisplayed();
		isglobalTextDisplayed();
		isglobalTitleDisplayed();
	}
	
	public void ReadAccepted(){
		isglobalNegativeButtonDisplayed();
		wait.until(ExpectedConditions.visibilityOf(ReadAccepted));
		log.stepLog("Tap on ReadAccepted");
		ReadAccepted.click();
		wait.until(ExpectedConditions.invisibilityOfAllElements(progressBar));
	}
	
	public void MenuBar(){
		wait.until(ExpectedConditions.visibilityOf(Navigateup));
		log.stepLog("Tap on Menu Bar");
		Navigateup.click();
	}
	
	public void MenuList()
	{
		wait.until(ExpectedConditions.visibilityOf(MenuList));
		log.stepLog("Tap on Menu List");
		MenuList.click();
		OkGotItTap();
	}
	
	public void InProgressDisplayed()
	 {
		 wait.until(ExpectedConditions.invisibilityOfAllElements(progressBar));
	 }
	 
	 public void VerifyFirstMessage() throws IOException, InterruptedException{
			wait.until(ExpectedConditions.visibilityOf(FirstMessage));
			FirstMessage.getText();
			WifiDisable();
			wait.until(ExpectedConditions.invisibilityOfAllElements(progressBar));
			log.stepLog("ProgressBar verified");
			log.stepLog("Wifi is disabled");
	 }
	 
	public void community() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(Community));
		log.stepLog("Tap on Community");
		Community.click();
		OkGotItTap();
		Thread.sleep(2000);
	}
	
	public void VisitWhataburgerDotCom()
	{
		wait.until(ExpectedConditions.visibilityOf(VisitWhataburgerDotcom));
		log.stepLog("Tap on Visit Whataburger.com");
		VisitWhataburgerDotcom.click();
		OkGotItTap();
	}
	
	public void PrivacyPolicy()
	{
		wait.until(ExpectedConditions.visibilityOf(PrivacyPolicy));
		log.stepLog("Tap on PrivacyPolicy");
		PrivacyPolicy.click();
		OkGotItTap();
	}
	
	public void VisitWhataStore()
	{
		wait.until(ExpectedConditions.visibilityOf(VisitWhataStore));
		log.stepLog("Tap on VisitWhataStore");
		VisitWhataStore.click();
		OkGotItTap();
	}
	
	public void termsAndconditions()
	{
		wait.until(ExpectedConditions.visibilityOf(TermConditions));
		log.stepLog("Tap on TermConditions");
		TermConditions.click();
		OkGotItTap();
	}
	
	public void ourStory()
	{
		wait.until(ExpectedConditions.visibilityOf(OurStory));
		log.stepLog("Tap on OurStory");
		OurStory.click();
		OkGotItTap();
	}
	
	//Check Close in Payment Menu
	public void Payments()
	{
		wait.until(ExpectedConditions.visibilityOf(Payments));
		log.stepLog("tap on Payments menu");
		Payments.click();
		Boolean isPresent = Close.size() > 0;
		if(isPresent)
		{
			wait.until(ExpectedConditions.visibilityOf(CloseIcon));
			CloseIcon.click();
			OkGotItTap();
		}
		else {
			OkGotItTap();
		}
	}
	
	//Check Close in Rewards Menu
		public void Rewards(){
			wait.until(ExpectedConditions.visibilityOf(Rewards));
			log.stepLog("tap on Rewards menu");
			Rewards.click();
			Boolean isPresent = Close.size() > 0;
			if(isPresent)
			{  
				wait.until(ExpectedConditions.visibilityOf(CloseIcon));
				CloseIcon.click();
				OkGotItTap();
			}
			else {
				OkGotItTap();
			}
		}
	
	public void Signout(){
		wait.until(ExpectedConditions.visibilityOf(Navigateup));
		log.stepLog("tap on hamburg menu");
		Navigateup.click();
		comlib.swipeuntilTextMatched(driver, "Sign Out");
		wait.until(ExpectedConditions.visibilityOf(YesSignOut));
		log.stepLog("Tap on Signout");
		YesSignOut.click();
	}
	
	public void hamBurgMenuSettings(){
		wait.until(ExpectedConditions.visibilityOf(Navigateup));
		log.stepLog("tap on hamBurg Menu");
		Navigateup.click();
	}
	
	public void FirstMessage() throws IOException, InterruptedException{
		wait.until(ExpectedConditions.invisibilityOfAllElements(progressBar));
		log.stepLog("ProgressBar verified");
		WifiDisable();
		log.stepLog("Wifi is disabled");
		wait.until(ExpectedConditions.visibilityOf(FirstMessage));
		FirstMessage.getText();
     	wait.until(ExpectedConditions.visibilityOf(SecondMessage));
     	SecondMessage.getText();
     	wait.until(ExpectedConditions.visibilityOf(ThirdMessage));
		FirstMessage.click();
		Boolean isPresent = Close.size() > 0;
		if(isPresent)
		{
	     	wait.until(ExpectedConditions.visibilityOf(CloseIcon));
	     	CloseIcon.click();
	     	isNoNetworkConnectionPopupDisplayed();
			OkGotItTap();
		}
		else {
	     	isNoNetworkConnectionPopupDisplayed();
			OkGotItTap();
		}
	}
	
	public void SecondMessage(){	
        wait.until(ExpectedConditions.visibilityOf(Navigateup));
		driver.navigate().back();
     	wait.until(ExpectedConditions.visibilityOf(SecondMessage));
     	log.stepLog(SecondMessage.getText());
		SecondMessage.click();
	}
	
	public void ThirdMessage(){
		OkGotItTap();
		wait.until(ExpectedConditions.visibilityOf(Navigateup));
		driver.navigate().back();
     	wait.until(ExpectedConditions.visibilityOf(ThirdMessage));
     	log.stepLog(ThirdMessage.getText());
     	ThirdMessage.click();
	}
	
	public void FourthMessage(){
		OkGotItTap();
		wait.until(ExpectedConditions.visibilityOf(Navigateup));
		driver.navigate().back();
     	wait.until(ExpectedConditions.visibilityOf(FourthMessage));
     	log.stepLog(FourthMessage.getText());
     	FourthMessage.click();
	}
	
	public void FifthMessage(){
		OkGotItTap();
		wait.until(ExpectedConditions.visibilityOf(Navigateup));
		driver.navigate().back();
     	wait.until(ExpectedConditions.visibilityOf(FifthMessage));
     	log.stepLog(FifthMessage.getText());
     	FifthMessage.click();
     	isNoNetworkConnectionPopupDisplayed();
		OkGotItTap();
		wait.until(ExpectedConditions.visibilityOf(Navigateup));
		driver.navigate().back();
	}
	
		public void settingsIcon(){
		wait.until(ExpectedConditions.visibilityOf(settingsIcon));
		log.stepLog("tap on Settings Icon");
		settingsIcon.click();
	   }
	  
	public boolean isMenuListDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(MenuList));
		return MenuList.isDisplayed();
	}
	
	
	public void OkGotItTap()
	{
		wait.until(ExpectedConditions.visibilityOf(GotItButton));
        log.stepLog("Click on Ok button");
        GotItButton.click();
	}
	
	public void NavigateupTap() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(Navigateup));
		log.stepLog("tap on hamburg menu");
		Navigateup.click();
		settingsIcon.click();
    	comlib.swipe(driver,3);
 	}
	
	public void signUpAlmost() throws InterruptedException
	{
		birthday.click();
	    Done.click();
	    zipCode.sendKeys("74816");
	    completeSignUp.click();
		wait.until(ExpectedConditions.visibilityOf(atleast13yearsAlert));
		log.stepLog("Displayed alert message for 13 years");
		Ok.click();
	}

	public void signUpAlmostyearChange() throws InterruptedException
	{
		birthday.click();
		((AndroidElement)(driver.findElementByXPath("//android.widget.NumberPicker[@index='2']//android.widget.Button[@index='0']"))).sendKeys("2000");
	     Done.click();
		 zipCode.sendKeys("78413");
	    completeSignUp.click();
		wait.until(ExpectedConditions.visibilityOf(ageVerification));
		log.stepLog("Displayed ageVerification popup message");
	}
	
	public void signUpAlmostyearChangeDisagree() throws InterruptedException
	{
		birthday.click();
		((AndroidElement)(driver.findElementByXPath("//android.widget.NumberPicker[@index='2']//android.widget.Button[@index='0']"))).sendKeys("2000");
	     Done.click();
	    zipCode.sendKeys("78413");
	    completeSignUp.click();
		wait.until(ExpectedConditions.visibilityOf(ageVerification));
		log.stepLog("Displayed ageVerification popup message");
	}
	
	public void disagree()
	{
		wait.until(ExpectedConditions.visibilityOf(disagree));
		disagree.click();
	}
		
	public void TermsandAgreement() throws InterruptedException
	{
		Agree.click();
		log.stepLog("Tap on agree button");
		boolean ele = agreeTermsSignUp.isEnabled();
		log.stepLog("Verify Agree button status:"+ele);
		Thread.sleep(4000);
		ReadConditions.click();
		wait.until(ExpectedConditions.visibilityOf(AgreeButton));
		AgreeButton.click();
		log.stepLog("Tap on agree button");
	}
	
	public void Fbskip() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(SkipRewards));
		log.stepLog("tap on SkipRewards");
		SkipRewards.click();
		boolean ele = ReadAcceptedList.size()>0;
     	if(ele)
		{
    		wait.until(ExpectedConditions.visibilityOf(ReadAccepted));
    		ReadAccepted.click();
		}
		wait.until(ExpectedConditions.visibilityOf(allowAppPermission));
		allowAppPermission.click();
		wait.until(ExpectedConditions.visibilityOf(LogoText));
		log.stepLog("Logged in sucess with Logo");
	}
	
	public void skipWithoutSignIn()
	{
		wait.until(ExpectedConditions.visibilityOf(SkipRewards));
		log.stepLog("tap on SkipRewards");
		SkipRewards.click();	
		wait.until(ExpectedConditions.visibilityOf(allowAppPermission));
		allowAppPermission.click();
	}
	
	public void DeleteButtonTapMessage()
	 {
		 wait.until(ExpectedConditions.visibilityOf(Delete));
		 log.stepLog("Tap on Delete button");
		 Delete.click();
	 }
	
	public void MarkReadButton()
	 {
		 wait.until(ExpectedConditions.visibilityOf(MarkAsRead));
		 log.stepLog("Tap on MarkAsRead button");
		 MarkAsRead.click();
	 }
	
	public void editDashBoard()
	{
		wait.until(ExpectedConditions.visibilityOf(editDashBoard));
		editDashBoard.click();
	}
	MobileElement ele1= driver.findElement(By.xpath("//android.widget.FrameLayout[@index='2']"));
	MobileElement ele2= driver.findElement(By.xpath("//android.widget.FrameLayout[@index='3']"));
	public void ArrangefavouritesDashBoard()
	{
		wait.until(ExpectedConditions.visibilityOf(editFavoritesButton));
		editFavoritesButton.click();
		wait.until(ExpectedConditions.visibilityOf(Done));
		TouchAction action  = new TouchAction(driver);
		action.longPress(ele1).waitAction(1000).moveTo(ele2).release().perform();
	}
	
	public boolean isGotItButtonDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(GotItButton));
		log.stepLog("Verified No network connection popup");
		return GotItButton.isDisplayed();
	}
	
	public boolean isMenuDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(Navigateup));
		log.stepLog("Verified Menu");
		return Navigateup.isDisplayed();
	}
	
	public boolean isLogoDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(LogoText));
		log.stepLog("Logged in sucess with Logo");
		return LogoText.isDisplayed();
	}
	
	public boolean isGpsDisabledAlertPopupDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(GpsNotEnabledMessage));
		return GpsNotEnabledMessage.isDisplayed();
	}
	
	public boolean isYesSignOutDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(YesSignOut));
		log.stepLog("Signout sucess");
		return YesSignOut.isDisplayed();
	}
	
	public boolean isfacebookButtonDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(Facebook));
		log.stepLog("facebook buton verified");
		return Facebook.isDisplayed();
	}
	
	public boolean isLocationDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(Navigateup));
		return Navigateup.isDisplayed();
 	}
	
	public boolean isEmailScreenDisplayed()
	{	
		wait.until(ExpectedConditions.visibilityOf(EmailSignIn));
		return EmailSignIn.isDisplayed();
	}
	
	public boolean isSkipPresentDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(SkipRewards));
		return SkipRewards.isDisplayed();	
	}
	
	public boolean isFirstnameDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(firstName));
		log.stepLog("First Name verified");
		return firstName.isDisplayed();	
	}
	
	public boolean isLastnameDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(lastName));
		log.stepLog("last Name verified");
		return lastName.isDisplayed();	
	}
	
	public boolean isBirthdayDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(birthday));
		log.stepLog("Birthday field is Verified");
		return birthday.isDisplayed();	
	}
	
	public boolean isEmailDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(EmailSignUpAlmost));
		log.stepLog("Email Id is Verified");
		return EmailSignUpAlmost.isDisplayed();	
	}
	
	public boolean isZipCodeDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(zipCode));
		log.stepLog("zipcode filed is Verified");
		return zipCode.isDisplayed();	
	}

	public boolean isSignUpEmailTitleDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(signUpEmailTitle));
		log.stepLog("SignUp EmailTitle is Verified");
		return signUpEmailTitle.isDisplayed();	
	}
	
	public boolean isfacebookIconDisplayed()
	{	
    	wait.until(ExpectedConditions.visibilityOf(facebookIcon));
    	log.stepLog("Verified facebook icon");
		return facebookIcon.isDisplayed();
	}

	public boolean isAgeVerificationDisplayed()	
	{
		wait.until(ExpectedConditions.visibilityOf(ageVerification));
		log.stepLog("age Verification is Displayed");
		return ageVerification.isDisplayed();		
	}
	
	public boolean isGooglePlusDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(googlePlus));
		log.stepLog("Verify googlePlus Icon");
		return googlePlus.isDisplayed();
	}
	
	public boolean isAgreeDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(Agree));
		return Agree.isDisplayed();
	}
	
	public boolean isdisagreeDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(disagree));
		return disagree.isDisplayed();
	}
	public boolean isNoLocationsFoundDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(LocationServicesTurnedOFF));
		log.stepLog("Verified LocationServicesTurnedOFF popup");
		return LocationServicesTurnedOFF.isDisplayed();
	}
	
	public boolean isNoNetworkConnectionPopupDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(GotItButton));
		log.stepLog("No Network Connection Popup verified");
		return GotItButton.isDisplayed();
	}
	
	 public boolean isSignUpButtonDisplayed()
	 {
		 wait.until(ExpectedConditions.visibilityOf(signUp));
		 return signUp.isDisplayed();
	 }
	 
	 public boolean isglobalNegativeButtonDisplayed()
	 {
		 wait.until(ExpectedConditions.visibilityOf(globalNegativeButton));
		 log.stepLog(globalNegativeButton.getText());
		 return globalNegativeButton.isDisplayed();
	 }
	 
	 public boolean isglobalTextDisplayed()
	 {
		 wait.until(ExpectedConditions.visibilityOf(globalText));
		 return globalText.isDisplayed();
	 }	 
	 
	 public boolean isglobalTitleDisplayed()
	 {
		 wait.until(ExpectedConditions.visibilityOf(globalTitle));
		 return globalTitle.isDisplayed();
	 }
	 
	 public boolean isDeleteButtonDisplayed()
	 {
		 wait.until(ExpectedConditions.visibilityOf(Delete));
		 log.stepLog("Delete button verified");
		 return Delete.isDisplayed();
	 }
	 
	 public boolean isMarkAsReadButtonDisplayed()
	 {
		 wait.until(ExpectedConditions.visibilityOf(MarkAsRead));
		 log.stepLog("MarkAsRead button verified");
		 return MarkAsRead.isDisplayed();
	 }	 
}
