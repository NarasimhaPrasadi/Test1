package com.appium.pages;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.appium.model.CommonLibrary;
import com.appium.model.ExtLogger;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LocationPage {
	private ExtLogger log = new ExtLogger(LocationPage.class.toString());
	WebDriverWait wait;
	CommonLibrary comlib;
	AndroidDriver<MobileElement> driver;

	public LocationPage(AndroidDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = (AndroidDriver<MobileElement>) driver;
		wait = new WebDriverWait(driver, 60);
		comlib = new CommonLibrary();
	}

	/********* Launch Screen elements **********/
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='San Antonio, TX 78216']")
	public WebElement SanAntonio;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='8481 N US Highway 281']")
	public WebElement HighWay;

	@AndroidFindBy(id = "wb.mobile.cx.client.droid:id/refreshButton")
	public WebElement refreshButton;

	@AndroidFindBy(id = "wb.mobile.cx.client.droid:id/menuItemTextView")
	public WebElement MenuItemOrderScreenBurgers;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Whataburger #661']")
	public WebElement Whataburger661;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Hwy 281 & Sunset']")
	public WebElement Hwy281;

	@AndroidFindBy(id = "wb.mobile.cx.client.droid:id/addressLayout")
	public WebElement addressLayout;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='You have no favorite locations.']")
	public WebElement NoFavoritelocations;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='All-Time Favorites']")
	public WebElement AllTimeFavorites;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Breakfast']")
	public WebElement Breakfast;

	@AndroidFindBy(id = "wb.mobile.cx.client.droid:id/NavigationImage")
	public WebElement ArrowSearchLocation;

	@AndroidFindBy(id = "wb.mobile.cx.client.droid:id/shareButton")
	public WebElement ShareLink;

	@AndroidFindBy(id = "wb.mobile.cx.client.droid:id/facebookButton")
	public WebElement FacebookShare;

	@AndroidFindBy(id = "wb.mobile.cx.client.droid:id/textButton")
	public WebElement TextShare;

	@AndroidFindBy(id = "wb.mobile.cx.client.droid:id/navToNextScreenImageView")
	public WebElement NextScreenAddressLayout;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
	public WebElement Continue;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Add to My Order']")
	public WebElement AddMyOrder;

	@AndroidFindBy(id = "wb.mobile.cx.client.droid:id/globalNegativeButton")
	public WebElement globalNegativeButton;

	@AndroidFindBy(id = "wb.mobile.cx.client.droid:id/dropDownImage")
	public WebElement drpDownImage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='What Comes With It']")
	public WebElement WhatComesIt;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Dine In']")
	public WebElement DineIn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Drive Thru']")
	public WebElement DriveThru;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Earn & Reedem Rewards']")
	public WebElement EarnReedemRewards;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Take Out']")
	public WebElement TakeOut;

	@AndroidFindBy(xpath = "//android.view.View[@index='0']")
	public WebElement StoreFloresville;

	@AndroidFindBy(xpath = "//android.view.View[@index='4']")
	public WebElement AustinStoreByFakeGps;

	@AndroidFindBy(id = "wb.mobile.cx.client.droid:id/milesNumText")
	public WebElement milesNumber;

	@AndroidFindBy(id = "wb.mobile.cx.client.droid:id/durationText")
	public WebElement durationText;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Order']")
	public WebElement OrderLocation;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Order']")
	public WebElement OrderHeader;

	@AndroidFindBy(xpath = "//android.view.View[@index='0']")
	public WebElement LocatedBurgerStoreCity;

	@AndroidFindBy(xpath = "//android.view.View[@index='0']")
	public WebElement LocatedBurgerStoreUnitId;

	@AndroidFindBy(xpath = "//android.view.View[@index='11']")
	public WebElement LakeWayStore;
	
	@AndroidFindBy(id = "wb.mobile.cx.client.droid:id/favCheckBox")
	public WebElement favCheckBox;

	@AndroidFindBy(xpath = "//android.view.View[@index='15']")
	public WebElement LaVernia;

	@AndroidFindBy(xpath = "//android.view.View[@index='2']")
	public WebElement LocatedBurgerStoreZipCode;

	@AndroidFindBy(xpath = "//android.view.View[@index='0']")
	public WebElement LocatedBurgerStoreState;

	@AndroidFindBy(xpath = "//android.view.View[@index='0']")
	public WebElement LocatedBurgerStoreAddress;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Barton Springs & S 1st']")
	public WebElement BartonSprings;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Start New Order']")
	public WebElement StartNewOrderButton;

	@AndroidFindBy(id = "com.android.settings:id/switch_widget")
	public WebElement LocationSwitch;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Whataburger #346']")
	public WebElement Burger346;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='601 Barton Springs Rd']")
	public WebElement Barton601;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Austin, TX 78704']")
	public WebElement Austin;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Edit']")
	public WebElement EditButton;

	@AndroidFindBy(id = "wb.mobile.cx.client.droid:id/LocationsSearchEditText")
	public WebElement AddressCityZip;

	@AndroidFindBy(id = "wb.mobile.cx.client.droid:id/toolbar_title_left")
	public WebElement Messages;

	@AndroidFindBy(className = "android.widget.ImageButton")
	public WebElement BackLocations;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Select Location & Pickup']")
	public WebElement SelectLocationPickupTitle;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='NEARBY']")
	public WebElement NEARBY;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='FAVORITE']")
	public WebElement FavoriteTab;
	
	@AndroidFindBy(xpath ="//android.widget.Button[@text='Filter']")
	public WebElement Filter;

	@AndroidFindBy(id = "wb.mobile.cx.client.droid:id/selectPickupMethodTitle")
	public WebElement selectPickupMethodTitle;
	
	@AndroidFindBy(id = "wb.mobile.cx.client.droid:id/HowToSaveFavoriteButton")
	public WebElement HowToSaveFavoriteButton;
	
	@AndroidFindBy(id = "wb.mobile.cx.client.droid:id/globalTitle")
	public WebElement globalTitle;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Ok, Got It']")
	public WebElement GotItButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Bullard, TX 75757']")
	public WebElement BullardAddress;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='651 South Doctor M. Roper Parkway']")
	public WebElement BullardTX;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='9039542900']")
	public WebElement MobileNo;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Mobile-Order']")
	public WebElement MobileOrder;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Rewards']")
	public WebElement Rewards;

	@AndroidFindBy(id = "wb.mobile.cx.client.droid:id/addressLine1")
	public WebElement address1;

	@AndroidFindBy(id = "wb.mobile.cx.client.droid:id/addressLine2")
	public WebElement address2;

	@AndroidFindBy(id = "wb.mobile.cx.client.droid:id/phoneText")
	public WebElement phone;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='0']//android.support.v7.widget.RecyclerView//android.widget.LinearLayout/android.widget.TextView")
	public List<MobileElement> listBurgersCategory;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='1']//android.support.v7.widget.RecyclerView//android.widget.LinearLayout/android.widget.TextView")
	public List<MobileElement> listOnChickenCategory;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='2']//android.support.v7.widget.RecyclerView//android.widget.LinearLayout/android.widget.TextView")
	public List<MobileElement> listOnAllTimeFavoritesCategory;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='5']//android.support.v7.widget.RecyclerView//android.widget.LinearLayout/android.widget.TextView")
	public List<MobileElement> listOnSlidesSaladsCategory;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='6']//android.support.v7.widget.RecyclerView//android.widget.LinearLayout/android.widget.TextView")
	public List<MobileElement> listOndessertSnacksCategory;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='7']//android.support.v7.widget.RecyclerView//android.widget.LinearLayout/android.widget.TextView")
	public List<MobileElement> listOnDrinkShakesCategory;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='8']//android.support.v7.widget.RecyclerView//android.widget.LinearLayout/android.widget.TextView")
	public List<MobileElement> listUnder550CaloriesCategory;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Under 550 Calories']")
	public MobileElement Under550CaloriesCategoryHead;

	@AndroidFindBy(xpath = "//android.support.v7.widget.RecyclerView[@index='1']//android.widget.LinearLayout[@index='3']//android.support.v7.widget.RecyclerView//android.widget.LinearLayout/android.widget.TextView")
	public List<MobileElement> listOnBreakfastCategory;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='4']//android.support.v7.widget.RecyclerView//android.widget.LinearLayout/android.widget.TextView")
	public List<MobileElement> listOnkidsCategory;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Kids']")
	public MobileElement kidsCategory;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Chicken']")
	public MobileElement ChickenCategory;

	@AndroidFindBy(id = "wb.mobile.cx.client.droid:id/emailButton")
	public MobileElement EmailShare;

	public void ShareLinkTap() {
		wait.until(ExpectedConditions.visibilityOf(ShareLink));
		log.stepLog("tap on ShareLink");
		ShareLink.click();
	}

	public void addressLayoutTap() {
		wait.until(ExpectedConditions.visibilityOf(addressLayout));
		log.stepLog("tap on addressLayout");
		addressLayout.click();
	}

	public void FavouriteLocation() {
		wait.until(ExpectedConditions.visibilityOf(favCheckBox));
		String favheart = favCheckBox.getAttribute("checked");
		if(favheart.equals("true"))
		{
			favCheckBox.click();
			wait.until(ExpectedConditions.visibilityOf(FavoriteTab));
			FavoriteTab.click();
		}
		else
		{
			wait.until(ExpectedConditions.visibilityOf(FavoriteTab));
			FavoriteTab.click();
		}
	}
	
	public void FavouriteTabLink() {
		wait.until(ExpectedConditions.visibilityOf(favCheckBox));
		String favheart = favCheckBox.getAttribute("checked");
		if(favheart.equals("true"))
		{
			favCheckBox.click();
			wait.until(ExpectedConditions.visibilityOf(FavoriteTab));
			FavoriteTab.click();
			wait.until(ExpectedConditions.visibilityOf(HowToSaveFavoriteButton));
			HowToSaveFavoriteButton.click();
		}
		else
		{
			wait.until(ExpectedConditions.visibilityOf(FavoriteTab));
			FavoriteTab.click();
			wait.until(ExpectedConditions.visibilityOf(HowToSaveFavoriteButton));
			HowToSaveFavoriteButton.click();
		}
	}

	public void FavouriteHeartPickUpScreen() {
		wait.until(ExpectedConditions.visibilityOf(FavoriteTab));
	    FavoriteTab.click();
		wait.until(ExpectedConditions.visibilityOf(favCheckBox));
		favCheckBox.click();
	}
	
	public void DineIn() {
		wait.until(ExpectedConditions.visibilityOf(DineIn));
		log.stepLog("tap on DineIn Link");
		DineIn.click();
	}

	public void DriveThru() {
		wait.until(ExpectedConditions.visibilityOf(DriveThru));
		log.stepLog("tap on DriveThru Link");
		DriveThru.click();
	}

	public void EarnRedeemRewards() {
		wait.until(ExpectedConditions.visibilityOf(EarnReedemRewards));
		log.stepLog("tap on EarnReedemRewards Link");
		EarnReedemRewards.click();
	}

	public void TakeOut() {
		wait.until(ExpectedConditions.visibilityOf(TakeOut));
		log.stepLog("tap on TakeOut Link");
		TakeOut.click();
	}

	public void Continue() {
		wait.until(ExpectedConditions.visibilityOf(Continue));
		log.stepLog("tap on Continue button");
		Continue.click();
	}
	
	public void navigateToNextScreen() {
		wait.until(ExpectedConditions.visibilityOf(NextScreenAddressLayout));
		log.stepLog("Tap on Navigate button");
		NextScreenAddressLayout.click();
	}

	public void ShareTap() {
		wait.until(ExpectedConditions.visibilityOf(ShareLink));
		log.stepLog("tap on Share Link");
		ShareLink.click();
	}

	public void ArrowSearchLocation() {
		wait.until(ExpectedConditions.visibilityOf(ArrowSearchLocation));
		log.stepLog("tap on ArrowSearchLocation");
		ArrowSearchLocation.click();
		wait.until(ExpectedConditions.visibilityOf(GotItButton));
		log.stepLog("Verified Popup");
	}

	public void MobileOrderingPopUp() {
		wait.until(ExpectedConditions.visibilityOf(GotItButton));
		log.stepLog("Tap on Mobile Ordering Popup");
		GotItButton.click();
	}

	public void EditButton() {
		wait.until(ExpectedConditions.visibilityOf(EditButton));
		comlib.swipe(driver, 2);
	}

	public void listOnSlidesSaladsCategory() {
		HashSet<String> uniqueList = new HashSet<String>();

		List<MobileElement> list1 = listOnSlidesSaladsCategory;
		String text1 = null;
		List<String> textlist = new ArrayList<String>();
		for (int j = 0; j < list1.size(); j++) {
			text1 = list1.get(j).getText();
			textlist.add(text1);
		}
		uniqueList.addAll(textlist);
		list1.clear();

		log.stepLog("**********Verify Slides and Salads Category List**********");
		for (String slides : uniqueList) {
			if (slides.equalsIgnoreCase("Apple & Cranberry Chicken Salad")) {
				log.stepLog("Apple & Cranberry Chicken Salad Verified");
			}
			if (slides.equalsIgnoreCase("Apple Slices")) {
				log.stepLog("Apple Slices Verified");
			}
			if (slides.equalsIgnoreCase("Garden Salad")) {
				log.stepLog("Garden Salad Verified");
			}
		}
	}

	public void LocationSwitch() {
		wait.until(ExpectedConditions.visibilityOf(LocationSwitch));
		log.stepLog("LocationSwitch is verified");
		LocationSwitch.click();
	}

	public void OrderMenutap() {
		wait.until(ExpectedConditions.visibilityOf(ChickenCategory));
		log.stepLog("Chicken Category is verified");
		ChickenCategory.click();
	}

	public void AustinStoreByFakeGps() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(AustinStoreByFakeGps));
		log.stepLog("AustinStore is verified");
		AustinStoreByFakeGps.click();
		wait.until(ExpectedConditions.visibilityOf(GotItButton));
		log.stepLog("Click on Ok button");
		GotItButton.click();
	}

	public void listOnDessertsSnacksCategory() {
		HashSet<String> uniqueList = new HashSet<String>();

		List<MobileElement> list1 = listOndessertSnacksCategory;
		String text1 = null;
		List<String> textlist = new ArrayList<String>();
		for (int j = 0; j < list1.size(); j++) {
			text1 = list1.get(j).getText();
			textlist.add(text1);
		}
		uniqueList.addAll(textlist);
		list1.clear();

		log.stepLog("**********Verify Dessert and snacks Category List***********");
		for (String drinks : uniqueList) {
			if (drinks.equalsIgnoreCase("Cinnamon Roll")) {
				log.stepLog("Cinnamon Roll Verified");
			}
			if (drinks.equalsIgnoreCase("Fruit Chews")) {
				log.stepLog("Fruit Chews Verified");
			}
		}
	}

	public void listOnDrinkShakesCategory() {
		HashSet<String> uniqueList = new HashSet<String>();

		List<MobileElement> list1 = listOnDrinkShakesCategory;
		String text1 = null;
		List<String> textlist = new ArrayList<String>();
		for (int j = 0; j < list1.size(); j++) {
			text1 = list1.get(j).getText();
			textlist.add(text1);
		}
		uniqueList.addAll(textlist);
		list1.clear();

		log.stepLog("**********Verify Drinks and Shakes Category List***********");
		for (String drinks : uniqueList) {
			if (drinks.equalsIgnoreCase("Soft Drink")) {
				log.stepLog("Soft Drink Verified");
			}
		}
	}

	public void listOnlistUnder550CaloriesCategory(AndroidDriver<MobileElement> driver) {
		HashSet<String> uniqueList = new HashSet<String>();
		for (int i = 0; i < 5; i++) {
			List<MobileElement> list1 = listUnder550CaloriesCategory;
			String text1 = null;
			List<String> textlist = new ArrayList<String>();
			for (int j = 0; j < list1.size(); j++) {
				text1 = list1.get(j).getText();
				textlist.add(text1);
			}
			uniqueList.addAll(textlist);
			list1.clear();
			Dimension dsize = driver.manage().window().getSize();
			int startx = (int) (dsize.width * 0.80);
			int endx = (int) (dsize.width * 0.10);
			int starty = (int) (dsize.height / 2);
			driver.swipe(startx, starty, endx, 0, 2000);
		}

		log.stepLog("**********Verify Under 550 Calories Category List**********");
		for (String under550 : uniqueList) {
			System.out.println(under550);
		}
	}

	public void listOnBreakfastCategory() {
			ArrayList<String> arrl = new ArrayList<String>();
			    arrl.add("Taquito with Cheese");
		        arrl.add("Biscuit");
		        arrl.add("Pancake Platter");
		        arrl.add("Biscuit and Gravy");
		        arrl.add("Jalapeno Cheddar Biscuit Sandwich");
		        arrl.add("Honey Butter Chicken Biscuit"); 	
		        arrl.add("Pancakes");
		        arrl.add("Breakfast Platter");
		        arrl.add("Egg and Cheese Biscuit");
		        arrl.add("Biscuit Sandwich");
		        arrl.add("Cinnamon Roll");
		        arrl.add("Chorizo Taquito");
		        arrl.add("Breakfast On A Bun®");
		        arrl.add("Egg Sandwich");
		        arrl.add("Hash Brown Sticks");

		HashSet<String> uniqueList = new HashSet<String>();
		for (int i = 0; i < 9; i++) {
			List<MobileElement> list1 = listOnBreakfastCategory;
			String text1 = null;
			List<String> textlist = new ArrayList<String>();
			for (int j = 0; j < list1.size(); j++) {
				text1 = list1.get(j).getText();
				textlist.add(text1);
			}
			uniqueList.addAll(textlist);
			list1.clear();
			comlib.HorizontalSwipe(driver, 0.90);
		}
		System.out.println(uniqueList);
		System.out.println("-------------------------");
		/*boolean AllTimeFavourites = arrl.toString().equalsIgnoreCase(uniqueList.toString());
		if(AllTimeFavourites)
		{
			log.stepLog("Verified Breakfast Category List");
		}
		else
		{
			log.stepLog("Breakfast Category element not exist");
		}*/
	}

	public void listOnkidsCategory() {
		/*ArrayList<String> arrl = new ArrayList<String>();
	    arrl.add("Whataburger® Patty Melt");
        arrl.add("Sweet & Spicy Bacon Burger");
        arrl.add("Green Chile Double");
        arrl.add("Chop House Cheddar Burger");
        arrl.add("Honey BBQ Chicken Strip Sandwich");
        arrl.add("Monterey Melt"); 	*/
		HashSet<String> uniqueList = new HashSet<String>();
		for (int i = 0; i < 2; i++) {

			List<MobileElement> list1 = listOnkidsCategory;
			String text1 = null;
			List<String> textlist = new ArrayList<String>();
			for (int j = 0; j < list1.size(); j++) {
				text1 = list1.get(j).getText();
				textlist.add(text1);
			}
			uniqueList.addAll(textlist);
			list1.clear();
			Dimension dsize = driver.manage().window().getSize();
			int startx = (int) (dsize.width * 0.70);
			int endx = (int) (dsize.width * 0.30);
			int starty = (int) (dsize.height / 2);
			driver.swipe(startx, starty, endx, 0, 500);
		}
	      System.out.println(uniqueList);
	}

	public void listOnAllTimeFavouritesCategory() {
	
		ArrayList<String> arrl = new ArrayList<String>();
	    arrl.add("Whataburger® Patty Melt");
        arrl.add("Sweet & Spicy Bacon Burger");
        arrl.add("Green Chile Double");
        arrl.add("Chop House Cheddar Burger");
        arrl.add("Honey BBQ Chicken Strip Sandwich");
        arrl.add("Monterey Melt"); 	
		HashSet<String> uniqueList = new HashSet<String>();
		for (int i = 0; i < 3; i++) {
			List<MobileElement> list1 = listOnAllTimeFavoritesCategory;
			String text1 = null;
			List<String> textlist = new ArrayList<String>();
			for (int j = 0; j < list1.size(); j++) {
				text1 = list1.get(j).getText();
				textlist.add(text1);
			}
			uniqueList.addAll(textlist);
			list1.clear();
			comlib.HorizontalSwipe(driver, 0.80);
		}
		System.out.println(uniqueList);
		System.out.println("-------------------------");
		/*boolean AllTimeFavourites = arrl.toString().equalsIgnoreCase(uniqueList.toString());
		if(AllTimeFavourites)
		{
			log.stepLog("Verified AllTimeFavourites Category List");
		}
		else
		{
			log.stepLog("AllTimeFavourites Category List not exist");
		}*/
	}

	public void listOnmenuItemTextViewBurgers() throws InterruptedException {
			ArrayList<String> arrl = new ArrayList<String>();
		    arrl.add("Avocado Bacon Burger");
	        arrl.add("Double Meat Whataburger®");
	        arrl.add("Whataburger®");
	        arrl.add("Mushroom Swiss Burger");
	        arrl.add("Double Meat Whataburger Jr.®");
	        arrl.add("Bacon & Cheese Whataburger®");
	        arrl.add("Jalapeno & Cheese Whataburger®"); 	
	        arrl.add("Whataburger Jr.®");
	        arrl.add("Triple Meat Whataburger®");


		/*String[] expected = {"Avocado Bacon Burger","Double Meat Whataburger®","Whataburger®","Mushroom Swiss Burger","Double Meat Whataburger Jr.®",
				"Bacon & Cheese Whataburger®","Jalapeno & Cheese Whataburger®","Whataburger Jr.®","Triple Meat Whataburger®"};*/
		HashSet<String> uniqueList = new HashSet<String>();
		for (int i = 0; i < 3; i++) {
			List<MobileElement> list1 = listBurgersCategory;
			String text1 = null;
			List<String> textlist = new ArrayList<String>();
			for (int j = 0; j < list1.size(); j++) {
				text1 = list1.get(j).getText();
				textlist.add(text1);
			}
			uniqueList.addAll(textlist);
			list1.clear();
			comlib.HorizontalSwipe(driver, 0.20);
		}
		System.out.println(uniqueList);
	}
	
	public void RefreshButtonTap() {
		wait.until(ExpectedConditions.visibilityOf(refreshButton));
		log.stepLog("RefreshButton is clickable");
		refreshButton.click();
	}
	
	public void listOnChickenCategory() {
		HashSet<String> arrl = new HashSet<String>();
	    arrl.add("Grilled Chicken Melt");
        arrl.add("Whatachick'n® Bites 6 pcs");
        arrl.add("Whatachick'n® Strips 3 pcs");
        arrl.add("Grilled Chicken Sandwich");
        arrl.add("Whatachick'n® Bites 9 pcs");
        arrl.add("Chicken Fajita Taco"); 	
        arrl.add("Whatachick'n® Sandwich ");
		HashSet<String> uniqueList = new HashSet<String>();
		for (int i = 0; i < 3; i++) {
			List<MobileElement> list1 = listOnChickenCategory;
			String text1 = null;
			List<String> textlist = new ArrayList<String>();
			for (int j = 0; j < list1.size(); j++) {
				text1 = list1.get(j).getText();
				textlist.add(text1);
			}
			uniqueList.addAll(textlist);
			list1.clear();
			Dimension dsize = driver.manage().window().getSize();
			int startx = (int) (dsize.width * 0.70);
			int endx = (int) (dsize.width * 0.30);
			int starty = (int) (dsize.height / 2);
			driver.swipe(startx, starty, endx, 0, 500);
		}
		System.out.println(uniqueList);
		System.out.println("-------------------------");

			/*boolean chickenCategory = arrl.toString().equalsIgnoreCase(uniqueList.toString());
			if(chickenCategory)
			{
				log.stepLog("Verified Chicken Category List");
			}
			else
			{
				log.stepLog("Chicken Category text not exist");
			}*/
		}


	public void CustomizeScreenDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(WhatComesIt));
		log.stepLog("Customize screen verified");
		wait.until(ExpectedConditions.visibilityOf(drpDownImage));
		drpDownImage.click();
	}

	public void LocatedBurgerStore() {
		wait.until(ExpectedConditions.visibilityOf(LocatedBurgerStoreUnitId));
		log.stepLog("Location is clickable");
		LocatedBurgerStoreUnitId.click();
		wait.until(ExpectedConditions.visibilityOf(addressLayout));
	}

	public void LakeWayStore() {
		wait.until(ExpectedConditions.visibilityOf(LakeWayStore));
		log.stepLog("Location is clickable");
		LakeWayStore.click();
	}
	
	public void Leander() {
		wait.until(ExpectedConditions.visibilityOf(LocatedBurgerStoreUnitId));
		log.stepLog("Location is clickable");
		LocatedBurgerStoreUnitId.click();
	}
	
	public void FavouritSymbol() {
		wait.until(ExpectedConditions.visibilityOf(LakeWayStore));
		log.stepLog("Location is clickable");
		LakeWayStore.click();
	}

	public void globalNegativeButton() {
		wait.until(ExpectedConditions.visibilityOf(globalNegativeButton));
		log.stepLog("Popup verified and clicked");
		globalNegativeButton.click();
	}

	public void RefreshButton() {
		wait.until(ExpectedConditions.visibilityOf(refreshButton));
		log.stepLog("RefreshButton is clickable");
		refreshButton.click();
		wait.until(ExpectedConditions.visibilityOf(StoreFloresville));
	}

	public void RefreshLocationStore(AndroidDriver<MobileElement> driver) {
		wait.until(ExpectedConditions.visibilityOf(LaVernia));
		Dimension dsize = driver.manage().window().getSize();
		int startx = (int) (dsize.width * 0.80);
		int endx = (int) (dsize.width * 0.10);
		int starty = (int) (dsize.height / 2);
		driver.swipe(startx, starty, endx, 0, 500);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOf(refreshButton));
	}

	public void OrderLocation() {
		wait.until(ExpectedConditions.visibilityOf(OrderLocation));
		log.stepLog("OrderLocation is clickable");
		OrderLocation.click();
	}

	public void LocatedBurgerStoreState() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(LocatedBurgerStoreState));
		log.stepLog("Store State is clickable");
		LocatedBurgerStoreState.click();
		wait.until(ExpectedConditions.visibilityOf(addressLayout));
	}
	public void LocatedBurgerStoreCity() {
		wait.until(ExpectedConditions.visibilityOf(LocatedBurgerStoreCity));
		log.stepLog("Location is clickable");
		LocatedBurgerStoreCity.click();
	}

	public void LocationbBack() {
		wait.until(ExpectedConditions.visibilityOf(BackLocations));
		log.stepLog("tap on back button");
		BackLocations.click();
		wait.until(ExpectedConditions.visibilityOf(AddressCityZip));
		log.stepLog("Verify Location screen");
	}
	
	public void OrderScreenBack() {
		wait.until(ExpectedConditions.visibilityOf(BackLocations));
		log.stepLog("tap on back button");
		BackLocations.click();
	}

	public void LocatedBurgerStoreZipCode() {
		wait.until(ExpectedConditions.visibilityOf(LocatedBurgerStoreZipCode));
		log.stepLog("Location is clickable");
		LocatedBurgerStoreZipCode.click();
	}
	
	public void globalTitle() {
		wait.until(ExpectedConditions.visibilityOf(globalTitle));
		log.stepLog("GlobalTitle is clickable");
		globalTitle.click();
	}
	
	public void LocatedBurgerStoreAddress() {
		wait.until(ExpectedConditions.visibilityOf(LocatedBurgerStoreAddress));
		log.stepLog("Location is clickable");
		LocatedBurgerStoreAddress.click();
	}

	public void LocationPickUp() {
		wait.until(ExpectedConditions.visibilityOf(AddressCityZip));
		AddressCityZip.click();
		AddressCityZip.sendKeys("661");
	}

	public void LocationSearchByCity() {
		wait.until(ExpectedConditions.visibilityOf(AddressCityZip));
		AddressCityZip.click();
		AddressCityZip.sendKeys("Austin");
	}

	public void LocationSearchByInvalidCity() {
		wait.until(ExpectedConditions.visibilityOf(AddressCityZip));
		AddressCityZip.click();
		AddressCityZip.sendKeys("Austis");
	}
	
	public void LocationSearchByCitySanantonio() {
		wait.until(ExpectedConditions.visibilityOf(AddressCityZip));
		AddressCityZip.click();
		AddressCityZip.sendKeys("San antonio");
	}

	public void LocationSearchByState() {
		wait.until(ExpectedConditions.visibilityOf(AddressCityZip));
		AddressCityZip.click();
		AddressCityZip.sendKeys("Texas");
	}

	public void LocationSearchByAddress() {
		wait.until(ExpectedConditions.visibilityOf(AddressCityZip));
		AddressCityZip.click();
		AddressCityZip.sendKeys("651 South Doctor M Roper Parkway");
	}

	public void LocationSearchByInValidAddress() {
		wait.until(ExpectedConditions.visibilityOf(AddressCityZip));
		AddressCityZip.click();
		AddressCityZip.sendKeys("Bangalore");
	}

	public void LocationSearchByZipCode() {
		wait.until(ExpectedConditions.visibilityOf(AddressCityZip));
		AddressCityZip.click();
		AddressCityZip.sendKeys("73301");
	}

	public void LocationSearchByInValidZipCode() {
		wait.until(ExpectedConditions.visibilityOf(AddressCityZip));
		AddressCityZip.click();
		AddressCityZip.sendKeys("73301978");
	}
	
	public void Filter()
	{
		wait.until(ExpectedConditions.visibilityOf(Filter));
		Filter.click();
	}

	public boolean isLocatedBurgerStoreZipCode() {
		wait.until(ExpectedConditions.visibilityOf(LocatedBurgerStoreZipCode));
		log.stepLog("ZipCode is centered");
		return LocatedBurgerStoreZipCode.isDisplayed();
	}

	public boolean isLocatedBurgerStoreAddress() {
		wait.until(ExpectedConditions.visibilityOf(LocatedBurgerStoreAddress));
		log.stepLog("Store Address is centered");
		return LocatedBurgerStoreAddress.isDisplayed();
	}
	
	public boolean isMessageScreenDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(Messages));
		log.stepLog("Verify Messages screen");
		return Messages.isDisplayed();
	}

	public boolean isStartNewOrderButtonDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(StartNewOrderButton));
		log.stepLog("StartNewOrderButton is verified");
		return StartNewOrderButton.isDisplayed();
	}

	public boolean isLocatedBurgerStoreState() {
		wait.until(ExpectedConditions.visibilityOf(LocatedBurgerStoreState));
		log.stepLog("Store State is verified");
		return LocatedBurgerStoreState.isDisplayed();
	}

	public boolean isLocatedBurgerStoreByCity() {
		wait.until(ExpectedConditions.visibilityOf(LocatedBurgerStoreCity));
		log.stepLog("Austin Location verified");
		return LocatedBurgerStoreCity.isDisplayed();
	}

	public boolean isNoLocationsPopupDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(GotItButton));
		log.stepLog("No Location Popup verified");
		return GotItButton.isDisplayed();
	}

	public boolean isNoNetworkConnectionPopupDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(GotItButton));
		log.stepLog("No Network Connection Popup verified");
		return GotItButton.isDisplayed();
	}

	public boolean isMilesLayoutDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(milesNumber));
		log.stepLog("milesNumber is verified");
		wait.until(ExpectedConditions.visibilityOf(durationText));
		log.stepLog("durationText is verified");
		return durationText.isDisplayed();
	}
	
	public boolean isShareLinksDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(ShareLink));
		if (EmailShare.isDisplayed()) {
			log.stepLog("Email Link is verified");
		}
		if (TextShare.isDisplayed()) {
			log.stepLog("Text Link is verified");
		}
		if (FacebookShare.isDisplayed()) {
			log.stepLog("Facebook Link is verified");
			return true;
		} else {
			return false;
		}
	}

	public boolean isPickUpMethodPopupDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(DineIn));
		if (DineIn.isDisplayed()) {
			log.stepLog("DineIn Link is verified");
		}
		if (DriveThru.isDisplayed()) {
			log.stepLog("Drive thru Link is verified");
		}
		if (TakeOut.isDisplayed()) {
			log.stepLog("TakeOut Link is verified");
			return true;
		} else {
			return false;
		}
	}

	public boolean isrefreshButtonLocated() {
		wait.until(ExpectedConditions.visibilityOf(refreshButton));
		log.stepLog("Refresh button verified");
		return refreshButton.isDisplayed();
	}
	
	public boolean isMobileOrderDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(MobileOrder));
		log.stepLog("MobileOrder is verified");
		return MobileOrder.isDisplayed();
	}
	
	public boolean isChickenCategoryHeaderDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(ChickenCategory));
		log.stepLog("ChickenCategory Text verified");
		return ChickenCategory.isDisplayed();
	}
	
	public boolean isRewardsDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(Rewards));
		log.stepLog("Rewards is verified");
		return Rewards.isDisplayed();
	}

	public boolean isAddressDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(address1));
		if (address1.isDisplayed()) {
			log.stepLog("Address1 is verified");
		}
		if (address2.isDisplayed()) {
			log.stepLog("Address2 is verified");
		}
		if (phone.isDisplayed()) {
			log.stepLog("Phone number is verified");
			return true;
		} else {
			return false;
		}
	}

	public boolean AllTimeFavoritesCategory() {
		wait.until(ExpectedConditions.visibilityOf(AllTimeFavorites));
		return AllTimeFavorites.isDisplayed();
	}

	public boolean IsAustinStoreByFakeGpsDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(AustinStoreByFakeGps));
		log.stepLog("Store Verified");
		return AustinStoreByFakeGps.isDisplayed();
	}

	public boolean isSelectLocationPickupTitleDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(SelectLocationPickupTitle));
		log.stepLog("Select Location and Pickup Title verified");
		return SelectLocationPickupTitle.isDisplayed();
	}

	public boolean isNearByTextDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(NEARBY));
		log.stepLog("NearBy Title verified");
		return NEARBY.isDisplayed();
	}

	public boolean isFavouriteTextDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(FavoriteTab));
		log.stepLog("favourite Title verified");
		return FavoriteTab.isDisplayed();
	}

	public boolean isselectPickupMethodTitleDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(selectPickupMethodTitle));
		log.stepLog("selectPickupMethod Title verified");
		return selectPickupMethodTitle.isDisplayed();
	}

	public boolean isFilterDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(FavoriteTab));
		log.stepLog("favourite Title verified");
		return FavoriteTab.isDisplayed();
	}

	public boolean Under550CaloriesCategory() {
		wait.until(ExpectedConditions.visibilityOf(Under550CaloriesCategoryHead));
		return Under550CaloriesCategoryHead.isDisplayed();
	}

	public boolean isBreakfastCategoryDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(Breakfast));
		return Breakfast.isDisplayed();
	}
	
	public boolean iskidsCategoryDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(kidsCategory));
		return Breakfast.isDisplayed();
	}

	public boolean isDriveThruDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(DriveThru));
		log.stepLog("DriveThru is Displayed");
		return DriveThru.isDisplayed();
	}

	public boolean isDineInDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(DineIn));
		log.stepLog("DineIn is Displayed");
		return DineIn.isDisplayed();
	}

	public boolean isTakeOutDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(TakeOut));
		log.stepLog("TakeOut is Displayed");
		return TakeOut.isDisplayed();
	}

	public boolean isBullardAddressDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(BullardAddress));
		log.stepLog("BullardAddress is Displayed");
		return BullardAddress.isDisplayed();
	}

	public boolean isBullardTXDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(BullardTX));
		log.stepLog("BullardTX is Displayed");
		return BullardTX.isDisplayed();
	}

	public boolean isAddressLayoutDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(addressLayout));
		log.stepLog("Verified Address Layout");
		return addressLayout.isDisplayed();
	}

	public boolean isNoFavoritelocationsDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(NoFavoritelocations));
		log.stepLog("Verified NoFavoritelocations");
		return NoFavoritelocations.isDisplayed();
	}

	public boolean isMobileNoDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(MobileNo));
		log.stepLog("MobileNo is Displayed");
		return MobileNo.isDisplayed();
	}

	public boolean isWhataburger661Displayed() {
		wait.until(ExpectedConditions.visibilityOf(Whataburger661));
		log.stepLog("Whataburger661 is Displayed");
		return Whataburger661.isDisplayed();
	}

	public boolean isSanAntonioDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(SanAntonio));
		log.stepLog("SanAntonio is Displayed");
		return SanAntonio.isDisplayed();
	}

	public boolean isHighWayDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(HighWay));
		log.stepLog("HighWay is Displayed");
		return HighWay.isDisplayed();
	}

	public boolean isHwy281Displayed() {
		wait.until(ExpectedConditions.visibilityOf(Hwy281));
		log.stepLog("Hwy281 is Displayed");
		return Hwy281.isDisplayed();
	}

	public boolean isLocationPickUpDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(AddressCityZip));
		return AddressCityZip.isDisplayed();
	}
	
	public boolean isLocationStoresDisplayedForCityAustin() {
		wait.until(ExpectedConditions.visibilityOf(LakeWayStore));
		return LakeWayStore.isDisplayed();
	}

	public boolean isBartonSpringsDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(BartonSprings));
		log.stepLog("BartonSprings is Displayed");
		return BartonSprings.isDisplayed();
	}

	public boolean isOrderHeader() {
		wait.until(ExpectedConditions.visibilityOf(OrderHeader));
		log.stepLog("OrderHeader is Displayed");
		return OrderHeader.isDisplayed();
	}

	public boolean isBurger346Displayed() {
		wait.until(ExpectedConditions.visibilityOf(Burger346));
		log.stepLog("Burger346 is Displayed");
		return Burger346.isDisplayed();
	}

	public boolean isBarton601Displayed() {
		wait.until(ExpectedConditions.visibilityOf(Barton601));
		log.stepLog("Barton601 is Displayed");
		return Barton601.isDisplayed();
	}

	public boolean isAustinDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(Austin));
		log.stepLog("Austin is Displayed");
		return Austin.isDisplayed();
	}
	
	public boolean isGlobalTitleDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(globalTitle));
		log.stepLog(globalTitle.getText());
		log.stepLog("MobileOrder popup is verified");
		return globalTitle.isDisplayed();
	}
	
	public boolean is651Displayed() {
		wait.until(ExpectedConditions.visibilityOf(EmailShare));
		log.stepLog("EmailShare is verified");
		return EmailShare.isDisplayed();
	}
}
