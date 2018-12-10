package com.appium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.appium.model.ExtLogger;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LaunchScreenPage 
{
    private ExtLogger log = new ExtLogger(LaunchScreenPage.class.toString());
	WebDriverWait wait;
	AndroidDriver<MobileElement> driver;

	public LaunchScreenPage(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = (AndroidDriver<MobileElement>) driver;
		wait = new WebDriverWait(driver, 60);
	}
		
	/*********Launch Screen elements**********/
	@AndroidFindBy(id="wb.mobile.cx.client.droid:id/LaunchSignUpButton")
	public WebElement signUp;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Sign In']")
	public WebElement SignInButton;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Sign Up/In Later']")
	public WebElement SignInLater;
	
	public void signUpButton()
	{
		wait.until(ExpectedConditions.visibilityOf(signUp));
		log.stepLog("tap on SignUp");
		signUp.click();
	}		
	
	public void SignInTap()
	{
		log.stepLog("tap on SignIn button");
		SignInButton.click();
	}	
		
	public void signInButton()
	{
		wait.until(ExpectedConditions.visibilityOf(SignInButton));
		log.stepLog("tap on SignIn");
		SignInButton.click();
	}
	
	public void signInLater()
	{
		wait.until(ExpectedConditions.visibilityOf(SignInLater));
		log.stepLog("tap on SignInLater Link");
		SignInLater.click();
	}
		
	public boolean isSignInDisplayed()	
	{
		wait.until(ExpectedConditions.visibilityOf(SignInButton));
		log.stepLog("signIn button is Displayed");
		return SignInButton.isDisplayed();		
	}
	public boolean isSignUpDisplayed()	
	{
		wait.until(ExpectedConditions.visibilityOf(signUp));
		log.stepLog("signUp button is Displayed");
		return signUp.isDisplayed();		
	}
	
	public boolean isSignInLaterLinkDisplayed()
	{
		wait.until(ExpectedConditions.visibilityOf(SignInLater));
		log.stepLog("Verified SignInLater Link");
		return SignInLater.isDisplayed();
	}
}
