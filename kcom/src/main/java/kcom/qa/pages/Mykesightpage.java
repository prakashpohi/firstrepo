package kcom.qa.pages;
import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import kcom.qa.base.Testbase;
import kcom.qa.util.Screenshot;

public class Mykesightpage extends Testbase {
	

	// Mykesightpage myK = new Mykesightpage();

	// ***********page factory-Object Repository***********
	
	@FindBy(xpath = "//a[@id='pt1:g1l1_3']")
	WebElement keysightlogo;

	@FindBy(xpath = "//div[@id='utillinks']")
	WebElement utillinks;
	

	@FindBy(xpath = "//li[@id='utilprofile']//span")
	WebElement Welcome;
	
	@FindBy(xpath = "//li[@id='utillogin']/span")
	WebElement Login;

	@FindBy(xpath = "//input[@id='username']")
	WebElement Username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement Password;

	@FindBy(xpath = "//input[@id='loginbtn']")
	WebElement Submit;
	

	@FindBy(xpath = "//a[@href='https://stgwww.keysight.com/my/faces/ser/updateProfilePage.jspx?lc=eng&cc=IN&returnURL=myagilent']")
	WebElement Myplofile;

	@FindBy(xpath = "//a[@href='https://stgwww.keysight.com/ssoauth/logout.jsp']")
	WebElement Logout;

	@FindBy(xpath = "//span[contains(text(),'Welcome back,')]")
	WebElement welcomebackmsg;

	@FindBy(xpath = "//table[@id='pt1:pb1_sb1:j_id_id30']/tbody/tr/td[5]/span")
	WebElement usernametextmsg;

	@FindBy(xpath = "//span[contains(text(),'Contact an Expert')]")
	WebElement contactexpertlink;

	@FindBy(xpath = "//a[@id='pt1:pb1_sb1:sdi1::disAcr']")
	WebElement Findtab;

	// @FindBy(xpath = "//a[@id='pt1:pb1_sb1:myPrdTab::disAcr']")
	// WebElement Myproductstab;

	@FindBy(xpath = "//div[@id='pt1:pb1_sb1:myPrdTab::ti']/div[2]")
	WebElement Myproductstab;

	@FindBy(xpath = "//button[@id='pt1:pb1_sb1:r11:0:gb1']")
	WebElement communityregisterbutton;

	// ***************UNDER MAIN TAB ****************

	@FindBy(xpath = "//span[@id='pt1:pb1_sb1:r1:0:s6:pgl14']/span")
	WebElement productwatchingtext;

	@FindBy(xpath = "//span[contains(text(),'Recently Viewed Products')]")
	WebElement recentvewedproducttext;

	@FindBy(xpath = "//span[contains(text(),'My Downloads History')]")
	WebElement mydownloadshistory;

	@FindBy(xpath = "//span[contains(text(),'Find Your Order')]")
	WebElement Findorder;

	@FindBy(xpath = "//input[@id='pt1:pb1_sb1:r3:0:sf1:inputText2::content']")
	WebElement CustomerPOtextbox;

	@FindBy(xpath = "//input[@id='pt1:pb1_sb1:r3:0:sf1:inputText3::content']")
	WebElement Keysightordernumtext;

	@FindBy(xpath = "//td[contains(text(),'Error: A value is required.')]")
	WebElement Errormsgfornoinput;

	@FindBy(xpath = "//span[contains(text(),'To find your order, fill in the following:')]")
	WebElement Fillthedetailsstatictext;

	@FindBy(xpath = "//select[@id='pt1:pb1_sb1:r3:0:sf1:selectOneChoice2::content']")
	WebElement CustomerPOdropdown;

	@FindBy(xpath = "//a[@id='pt1:pb1_sb1:r3:0:sf1:cb1']")
	WebElement Findbutton;

	@FindBy(xpath = "//select[@id='pt1:pb1_sb1:r3:0:sf1:selectOneChoice2::content']")
	WebElement Findorderdropdown1;

	@FindBy(xpath = "//select[@id='pt1:pb1_sb1:r3:0:sf1:selectOneChoice2::content']/option[1]")
	WebElement option1;

	@FindBy(xpath = "//select[@id='pt1:pb1_sb1:r3:0:sf1:selectOneChoice2::content']/option[2]")
	WebElement option2;

	@FindBy(xpath = "//select[@id='pt1:pb1_sb1:r3:0:sf1:selectOneChoice3::content']")
	WebElement Findorderdropdown2;

	@FindBy(xpath = "//span[contains(text(),'Service Order Status')]")
	WebElement Serviceorderstatuslink;

	@FindBy(id = "pt1:pb1_sb1:r3:0:sf1:ot4")
	WebElement helpbtn;

	@FindBy(xpath = "//div[contains(text(),'No match was found for your query. Please try again.')]")
	WebElement errormessage;

	@FindBy(xpath = "//span[contains(text(),'Add a Capability')]")
	WebElement addcapability;

	// login iframeid= id="pt1:pb1_sb1:if02"

	@FindBy(xpath = "//input[@id='username']")
	WebElement usernamefield;

	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordfield;

	@FindBy(xpath = "//input[@id='loginbtn']")
	WebElement loginbtn;

	// ******************* UNDER MY PRODUCT*******************

	@FindBy(xpath = "//span[contains(text(),'Model Number')]")
	WebElement mdlnbr;

	@FindBy(xpath = "//span[contains(text(),'Status')]")
	WebElement status;

	@FindBy(xpath = "//span[contains(text(),'Latest Version')]")
	WebElement latestversion;

	@FindBy(xpath = "//div[contains(text(),'Technical Support')]")
	WebElement techsupport;

	@FindBy(xpath = "//img[@id='pt1:pb1_sb1:myprd:1:prdttId:0:gil1::icon']")
	WebElement techsupportlink;

	// ************MY PRODUCT AND ADD A
	// PRODUCT*************************************

	@FindBy(xpath = "//span[contains(text(),'Add a Product')]")
	WebElement addaProductlink;

	@FindBy(xpath = "//input[@id='pt1:pb1_sb1:myprd:0:popUpModelNo::content']")
	WebElement modelnumbertextbox;

	@FindBy(xpath = "//ul[@id='pt1:r1:0:modtxt_012::_afrautosuggestpopup']//li")
	WebElement firststmodelnumoption;

	@FindBy(xpath = "//input[@id='pt1:pb1_sb1:myprd:0:popUpSerialNo::content']")
	WebElement serialnumtextbox;

	@FindBy(xpath = "//button[@id='pt1:pb1_sb1:myprd:0:cb01']")
	WebElement addproductbtn;

	@FindBy(xpath = "//a[@id='pt1:pb1_sb1:myprd:0:cancel']")
	WebElement cancelbtn;

	@FindBy(xpath = "//td[@class='x16q']")
	WebElement errorfornovalue;

	@FindBy(xpath = "//ul[@id='pt1:pb1_sb1:myprd:0:popUpModelNo::_afrautosuggestpopup']/li")
	WebElement errorformin3char;

	@FindBy(xpath = "//div[@class='AFPopupMenuPopup']")
	WebElement suggestionresult;
	// **********on next page**********
	@FindBy(xpath = "//button[@id='pt1:r1:0:cb1']")
	WebElement registerbutton;

	@FindBy(xpath = "//span[contains(text(),'Add another product')]")
	WebElement Addanotherproduct;

	@FindBy(xpath = "//button[@id='pt1:r1:0:r3:0:cb1']")
	WebElement confirmbutton;

	@FindBy(xpath = "//a[@id='pt1:r1:0:gl2']")
	WebElement continuelink;

	// *************Find a part OR**************

	@FindBy(linkText = "Find a Part")
	WebElement Findapartlink;

	@FindBy(xpath = "//input[@id='pt1:pb1_sb1:r2:0:src_b_1:searchTerm_it1::content']")
	WebElement findaparttextbox;

	@FindBy(xpath = "//a[@id='pt1:pb1_sb1:r2:0:src_b_1:cb1']")
	WebElement findbutton;

	@FindBy(xpath = "//span[contains(text(),'View all Part Number Matches')]")
	WebElement allmatches;

	@FindBy(xpath = "//a[contains(text(),'Advanced Find-A-Part')]")
	WebElement advancefindapart;

	@FindBy(xpath = "//span[contains(text(),'No Matches Found')]")
	WebElement nomatchesfoundmsg;

	@FindBy(xpath = "//span[contains(text(),'Please change your query or use Advanced Find-A-Part')]")
	WebElement staticerrormessage;

	@FindBy(xpath = "//div[@class='AFNoteWindowContent']//table//div[@class='x16s']")
	WebElement errormessagefor2char;

	// ***************MY NEWS PORTLETS ***********************
	@FindBy(xpath = "//a[contains(text(),'Create account and set preferences')]")
	WebElement mynewsportletlogoutview;

	@FindBy(xpath = "//span[contains(text(),'Want to see more My News items? Update your preferences: ')]")
	WebElement mynewsportletloginview;
	
	@FindBy(xpath = "//a[@href='/my/faces/ser/updateProfilePage.jspx']")
	WebElement MNmyprofile;
	

	// *********************MY DOWNLOADS HISTORY*******************

	@FindBy(xpath = "//span[contains(text(),'Downloaded Item')]")
	WebElement downloadeditemtext;

	@FindBy(xpath = "//span[contains(text(),'Content Type')]")
	WebElement ContentTypetext;

	@FindBy(xpath = "//th[@id='pt1:pb1_sb1:r18:0:t1:c1']//span[contains(text(),'Downloaded')]")
	WebElement DownloadedText;

	@FindBy(xpath = "//span[contains(text(),'Remove')]")
	WebElement Removetext;

	@FindBy(xpath = "//a[@id='pt1:pb1_sb1:r18:0:t1:0:cil1']")
	WebElement remove_x_btn;

	@FindBy(xpath = "//a[@id='pt1:pb1_sb1:r18:0:t1:0:gil1']/span")
	WebElement recentdownloaded;
	
	//***************** MY WATCHLIST*************************
	//product page
	@FindBy(xpath = "//b[@id='wlicon']")
	WebElement EYEICONonProductPage;
	@FindBy(xpath = "//p[@id='watchlist']//a[1]")
	WebElement AddtowatchlistTextfield;
	@FindBy(xpath = "//p[@id='watchlist']//a[1]")
	WebElement VIsitmywatchlistLink;
	@FindBy(xpath = "//li[@id='portal']/a")
	WebElement Mykeysightlink;
		
	//********************	
	
	@FindBy(xpath = "//div[@id='pt1:pb1_sb1:pgWL1']//td[2]")
	WebElement MYwatchlistheading;
	
	@FindBy(xpath = "//div[@id='pt1:pb1_sb1:pgWL1']//td[1]")
	WebElement MYwatchlistheadingICON;
	@FindBy(xpath = "//div[@id='pt1:pb1_sb1:r1:0:s6:t1:pgl12']")
	WebElement ProductTextunderMYwatchlist;
	@FindBy(xpath = "//th[@id='pt1:pb1_sb1:r1:0:s6:t1:c1']")
	WebElement PriceTextunderMYwatchlist;
	@FindBy(xpath = "//th[@id='pt1:pb1_sb1:r1:0:s6:t1:c7']")
	WebElement SpecialOfferTextunderMYwatchlist;
	
	@FindBy(xpath = "//td[contains(text(),'You can add products from product pages on our website or from Recently Viewed Products below.')]")
	WebElement nothinginwatchlist;
	
	@FindBy(xpath = "//span[@id='pt1:pb1_sb1:r1:0:s6:pgl14']")
	WebElement productonwatchlist;
	
	@FindBy(xpath = "//div[@id='pt1:pb1_sb1:r1:0:s6:t1::db']//table[@class='x11e x122']//tr[1]/td[1]/span/a")
	WebElement removefromwatchlisticon;
	
		
	@FindBy(xpath = "//div[@id='pt1:pb1_sb1:r1:0:s6:t1::db']//table[@class='x11e x122']//tr[1]/td[1]/span/a")
	WebElement FirstWatchingEYEicon;
	
	@FindBy(xpath = "//div[@id='pt1:pb1_sb1:r1:0:s6:t1::db']//table[@class='x11e x122']//tr[2]/td[1]/span/a")
	WebElement SecondWatchingEYEicon;
	
	@FindBy(xpath = "//div[@id='pt1:pb1_sb1:r1:0:s6:t1::db']//table/tbody/tr[1]//td[2]/table/tbody/tr/td[4]/table//a[1]")
	WebElement FirstWatchingLINK;
	
	@FindBy(xpath = "//div[@id='pt1:pb1_sb1:r1:0:s6:t1::db']//table/tbody/tr[2]//td[2]/table/tbody/tr/td[4]/table//a[1]")
	WebElement SecondWatchingLINK;
	
	@FindBy(xpath = "//div[@id='pt1:pb1_sb1:r1:0:s6:t1::db']//table/tbody/tr[1]//td[2]/table/tbody/tr/td[4]/table//a[1]/img")
	WebElement FirstWatchingMagicon;
	
	@FindBy(xpath = "//div[@id='pt1:pb1_sb1:r1:0:s6:t1::db']//table/tbody/tr[2]//td[2]/table/tbody/tr/td[4]/table//a[1]/img")
	WebElement SecondWatchingMagicon;
	
	@FindBy(xpath = "//div[@id='pt1:pb1_sb1:r1:0:s6:t2::db']//table[@class='x11e x122']//tr[1]/td[1]/span/a")
	WebElement FirstViewedEYEicon;
	
	@FindBy(xpath = "//div[@id='pt1:pb1_sb1:r1:0:s6:t2::db']//table[@class='x11e x122']//tr[2]/td[1]/span/a")
	WebElement SecondViewedEYEicon;
	
	
	
	// **********initialization of OR *************
	public Mykesightpage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
//*******************ACTIONS OF MY WATCHLIST********************
	
	public void Mydownloadstart() {
		Prerequities();
		Homepage homepage = new Homepage();
		Mykesightpage Mykeysightpage = homepage.clickonmykeysightlink();
	}
	
	public void MyKeysightstart() {
		Prerequities();
		Homepage homepage = new Homepage();
		Mykesightpage Mykeysightpage = homepage.clickonmykeysightlink();
	}
	
	public void MyKportalstart() {
		Prerequities();
		Homepage homepage = new Homepage();
		Mykesightpage Mykeysightpage = homepage.clickonmykeysightlink();
	}
	
	public void Mynewsstart() {
		Prerequities();
		Homepage homepage = new Homepage();
		Mykesightpage Mykeysightpage = homepage.clickonmykeysightlink();
	}
	

	
	
	
	
	public void Validateproductpage() throws InterruptedException{
		keysightlogo.click();
		Homepage homepage = new Homepage();
		homepage.Viewproduct();
		Assert.assertTrue(EYEICONonProductPage.isDisplayed());
		System.out.println(AddtowatchlistTextfield.getText());
		Assert.assertEquals(AddtowatchlistTextfield.getText(), "Add to My Watchlist");
		EYEICONonProductPage.click();
		Thread.sleep(2000);
		Assert.assertEquals(AddtowatchlistTextfield.getText(), "Product on My Watchlist");
		Assert.assertTrue(VIsitmywatchlistLink.isDisplayed());

	}
	
	
		public void watchlistloggedinview() throws InterruptedException {
			
			
			driver.findElement(By.xpath("//a[@id='pt1:g1l1_3']")).click();
			Homepage myK = new Homepage();
			myK.homepagelogin();
			myK.clickonmykeysightlink();
			
			keysightlogo.click();
			Thread.sleep(10000);
			Homepage homepage = new Homepage();
			homepage.Viewproduct();
			
			String S= AddtowatchlistTextfield.getText();
			System.out.println(S);
			
			if(S.equalsIgnoreCase("Product on My Watchlist")) {
				System.out.println("product already on watchlist");
			}else{
				
				EYEICONonProductPage.click();
				System.out.println("product added to watchlist");

			}
			Mykeysightlink.click();
			Assert.assertTrue(MYwatchlistheading.isDisplayed());
			Assert.assertTrue(MYwatchlistheadingICON.isDisplayed());
			Assert.assertTrue(FirstWatchingEYEicon.isDisplayed());
			Assert.assertTrue(FirstWatchingLINK.isDisplayed());
			//Assert.assertTrue(FirstWatchingMagicon.isDisplayed());
			Assert.assertTrue(productonwatchlist.isDisplayed());
			FirstWatchingLINK.click();
			
			EYEICONonProductPage.click();
			Mykeysightlink.click();
			//Assert.assertTrue(nothinginwatchlist.isDisplayed());
			
		}
	
	public void watchlistpublicview() throws InterruptedException {
		Assert.assertTrue(nothinginwatchlist.isDisplayed());
		keysightlogo.click();
		Homepage homepage = new Homepage();
		homepage.Viewproduct();
		
			
		EYEICONonProductPage.click();
		
		Mykeysightlink.click();
		Assert.assertTrue(productonwatchlist.isDisplayed());
		FirstWatchingLINK.click();
		EYEICONonProductPage.click();
		Mykeysightlink.click();
		Assert.assertTrue(nothinginwatchlist.isDisplayed());

		}
	
	


	public void watchlistloggedoutview() throws InterruptedException {
		//*******will be delete*******
		
		driver.findElement(By.xpath("//a[@id='pt1:g1l1_3']")).click();
		Homepage myKk = new Homepage();
		myKk.homepagelogin();
		myKk.clickonmykeysightlink();
		

		Mykesightpage myK = new Mykesightpage();
		myK.logout();
		driver.findElement(By.xpath("//p[@id='breadcrumb']/a")).click();
		Thread.sleep(2000);
		Homepage homepage = new Homepage();
		homepage.Viewproduct();
		String S= AddtowatchlistTextfield.getText();
		System.out.println(S);
		
		if(S.equalsIgnoreCase("Product on My Watchlist")) {
			System.out.println("product already on watchlist");
			}else{
				EYEICONonProductPage.click();
				System.out.println("product added to watchlist");
			}
		Mykeysightlink.click();
		Assert.assertTrue(productonwatchlist.isDisplayed());
		FirstWatchingLINK.click();
		EYEICONonProductPage.click();
		String parentwindowhandle = driver.getWindowHandle();

		Thread.sleep(5000);
		for (String childtab : driver.getWindowHandles()) {
			driver.switchTo().window(childtab);
			driver.findElement(By.xpath("//a[@id='fancybox-close']")).click();
			//driver.close();

		}
//*****	have to write for relogin	 
//		Thread.sleep(3000);
//		Actions action = new Actions(driver);
//		action.moveToElement(utillinks).build().perform();
//		Login.click();
//	//checking for Iframes	
//		int size = driver.findElements(By.tagName("iframe")).size();
//		System.out.println("************"+size);
//		driver.switchTo().frame(0);
//		wait = new WebDriverWait(driver,50);
//		wait.until(ExpectedConditions.visibilityOf(Password));
//		driver.findElement(By.xpath("//th[contains(text(),'Password:')]")).click();
//		Password.sendKeys(prop.getProperty("password"));
//		Submit.click();
//		Thread.sleep(3000);
//		EYEICONonProductPage.click();
//		Mykeysightlink.click();
//	//	Assert.assertTrue(nothinginwatchlist.isDisplayed());
//		
	}
	
	/*
	Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		
		
	
	*/
	
	// *****************ACTIONS RELATED TO MY NEWS PORTLET*****************

		public void mynewsportletloggedout() throws InterruptedException {
			Thread.sleep(2000);
			Assert.assertTrue(mynewsportletlogoutview.isDisplayed());
		}
		
		public void Mynewsportletloggedin() throws InterruptedException{	
			Mykesightpage myK = new Mykesightpage();
			myK.login();

			Actions action = new Actions(driver);
			action.moveToElement(utillinks).build().perform();
			Welcome.click();
			Myplofile.click();
			
			
			Myprofilepage profile = new Myprofilepage();
			profile.ExpandANDpreference();
			MNmyprofile.click();
			profile.changepreference();

		}
		
	
	

	// ************ACTIONS RELATED TO MY DOWNLOADS HISTORY*****************

	public void mydownloadhistory() throws InterruptedException {
		driver.findElement(By.xpath("//img[@alt='Keysight Technologies']")).click();
		Homepage myK = new Homepage();
		myK.homepagelogin();
		myK.clickonmykeysightlink();
		Thread.sleep(3000);
		Myproductstab.click();
		//driver.switchTo().frame("")
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.moveToElement(techsupportlink).build().perform();
		techsupportlink.click();
		String parentwindowhandle = driver.getWindowHandle();

		Thread.sleep(3000);
		for (String childtab : driver.getWindowHandles()) {
			driver.switchTo().window(childtab);
		}
		driver.findElement(By.xpath("//span[contains(text(),'Drivers, Firmware & Software')]")).click();
		driver.findElement(By.xpath("//a[@href='https://stgwww.keysight.com/main/software.jspx?ckey="
				+ "1687129&lc=eng&cc=IN&nid=-32448.809585&id=1687129']/strong")).click();
		driver.findElement(By.xpath("//a[@class='download origGated']/strong")).click();
		

	}
	
	public void clickonmydownloadlink() throws InterruptedException {
		Assert.assertTrue(downloadeditemtext.isDisplayed());
		Assert.assertTrue(ContentTypetext.isDisplayed());
		Assert.assertTrue(DownloadedText.isDisplayed());
		Assert.assertTrue(Removetext.isDisplayed());
		Assert.assertTrue(remove_x_btn.isDisplayed());
		Assert.assertTrue(recentdownloaded.isDisplayed());
		String s = recentdownloaded.getText();
		System.out.println("###########################################");
		System.out.println(s);
		recentdownloaded.click();
		String parentwindowhandle = driver.getWindowHandle();

		Thread.sleep(3000);
		for (String childtab : driver.getWindowHandles()) {
			driver.switchTo().window(childtab);
		}
		String pagetitle = driver.findElement(By.xpath("//div[@id='groupheading']/h1")).getText();
		System.out.println("###########################################");
		System.out.println(pagetitle);
		Assert.assertEquals(s, pagetitle);
	}

	// ******************ACTIONS UNDER MAIN TAB *************************

	public void statictext() {
		//boolean Findorderflag = Findorder.isDisplayed();
		Assert.assertTrue(Findorder.isDisplayed());
	}

	public void statictext2() {
		Assert.assertTrue(Fillthedetailsstatictext.isDisplayed());


	}

	public void validatetextbox() {
		Assert.assertTrue(CustomerPOtextbox.isDisplayed());
	}

	public boolean validatefindbutton() {
		boolean findbtn = Findbutton.isDisplayed();
		return findbtn;
	}

	public void validatedropdown1() {

		Assert.assertTrue(Findorderdropdown1.isDisplayed());
		Select dropdown1 = new Select(Findorderdropdown1);
		Findorderdropdown1.click();
		Assert.assertTrue(option1.isDisplayed());
		Assert.assertTrue(option2.isDisplayed());
		// dropdown1.selectByVisibleText("Keysight Order Number");
		Assert.assertTrue(option1.isSelected());
	}

	public String searchorder() {
		CustomerPOtextbox.sendKeys(prop.getProperty("CustomerPOnum"));
		Keysightordernumtext.sendKeys(prop.getProperty("Keysightordernum"));
		Findbutton.click();
		String pagetitle = driver.getTitle();
		return pagetitle;
	}

	public void errormsgforinvalidPOandORDERnum() {
		CustomerPOtextbox.sendKeys("45212");
		Keysightordernumtext.sendKeys("89622");
		Findbutton.click();
		Assert.assertTrue(errormessage.isDisplayed());
	}

	public String clikonhelpbtn() throws InterruptedException {
		String parentwindowhandle = driver.getWindowHandle();

		helpbtn.click();
		Thread.sleep(3000);
		for (String childtab : driver.getWindowHandles()) {
			driver.switchTo().window(childtab);
		}
		String pagetitle = driver.getTitle();
		return pagetitle;
	}

	public FindApartSearchPage clickonfindapart() {
		Findapartlink.click();
		return new FindApartSearchPage();
	}

	public void validatewelcomebackmsg() throws InterruptedException {
		Mykesightpage login = new Mykesightpage();
		login.login();
		Assert.assertTrue(welcomebackmsg.isDisplayed());
		Assert.assertTrue(usernametextmsg.isDisplayed());
	}

	public void validatepagetitle() {

		Assert.assertEquals(driver.getTitle(), "myKeysight | Keysight Technologies");
	}

	public void validateexpertlink() {
		Assert.assertTrue(contactexpertlink.isDisplayed());
	}

	public void addcapability() {
		addcapability.click();
	}

	// *************ACTIONS RELATED TO LOGIN *******************

	public void login() throws InterruptedException {
		try {
			driver.switchTo().frame("pt1:pb1_sb1:if02");
			usernamefield.clear();
			usernamefield.sendKeys(prop.getProperty("username"));
			passwordfield.clear();
			passwordfield.sendKeys(prop.getProperty("password"));
			loginbtn.click();
		} catch (Exception e) {
			
			driver.findElement(By.xpath("//a[@id='pt1:g1l1_3']")).click();
			wait = new WebDriverWait(driver,180);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id='util-login']"))));
			Homepage h = new Homepage();
			h.homepagelogin();
			h.clickonmykeysightlink();
			
			e.printStackTrace();
		}
	}



	// ***************ACTIONS RELATED TO FIND A PART IN MYKEYSIGHT PAGE


	// Find a part iframe id = afr::PushIframe

	public FindApartSearchResultPage myKfindapart() {
		Myproductstab.click();
		findaparttextbox.clear();
		findaparttextbox.sendKeys(prop.getProperty("productpartnum"));
		findbutton.click();
		if (allmatches.isDisplayed()) {
			allmatches.click();
		} else if (nomatchesfoundmsg.isDisplayed()) {
			System.out.println("please enter a valid part number");

		}
		return new FindApartSearchResultPage();
	}

	public void validationfor2char() throws InterruptedException {
		Myproductstab.click();
		findaparttextbox.sendKeys("12");
		findbutton.click();
		Thread.sleep(3000);
		Assert.assertTrue(errormessagefor2char.isDisplayed());
	}

	public void wrongpartnum() {
		Myproductstab.click();
		findaparttextbox.clear();
		findaparttextbox.sendKeys("89562");
		findbutton.click();
		boolean msg1 = nomatchesfoundmsg.isDisplayed();
		Assert.assertTrue(msg1);
		boolean msg2 = staticerrormessage.isDisplayed();
		Assert.assertTrue(msg2);
	}

	public FindApartSearchPage clickonadvancefindapart() {
		Myproductstab.click();
		// driver.switchTo().frame("afr::PushIframe");
		advancefindapart.click();
		return new FindApartSearchPage();
	}

	// ********************ACTIONS for add a Product ******************

	public void addaproduct() {
		Myproductstab.click();
		addaProductlink.click();
		for (String childtab : driver.getWindowHandles()) {
			driver.switchTo().window(childtab);
		}

		modelnumbertextbox.clear();
		modelnumbertextbox.sendKeys(prop.getProperty("modelnum"));
		serialnumtextbox.sendKeys(prop.getProperty("serialnum"));
		addproductbtn.click();
	}

	public void validatemodelnumfield() {
		Myproductstab.click();
		addaProductlink.click();
		for (String childtab : driver.getWindowHandles()) {
			driver.switchTo().window(childtab);
		}
		modelnumbertextbox.sendKeys("111");
		Assert.assertTrue(suggestionresult.isDisplayed());
		modelnumbertextbox.clear();
		modelnumbertextbox.sendKeys("11");
		Assert.assertFalse(suggestionresult.isDisplayed());
	}

	public void validateerrorfornovalue() {
		Myproductstab.click();
		addaProductlink.click();
		for (String childtab : driver.getWindowHandles()) {
			driver.switchTo().window(childtab);
		}
		addproductbtn.click();
		Assert.assertTrue(errorfornovalue.isDisplayed());
	}

	public void validatemsgforlesstahn3char() {
		Myproductstab.click();
		addaProductlink.click();
		for (String childtab : driver.getWindowHandles()) {
			driver.switchTo().window(childtab);
		}
		modelnumbertextbox.sendKeys(prop.getProperty("n1"));
		addproductbtn.click();
		Assert.assertTrue(errorformin3char.isDisplayed());
	}

	// **********************My products column validation*******************

	public void validationofproductcolumn() {
		Myproductstab.click();
		Assert.assertTrue(mdlnbr.isDisplayed());
		Assert.assertTrue(status.isDisplayed());
		Assert.assertTrue(latestversion.isDisplayed());
		// Assert.assertTrue(techsupport.isDisplayed());
	}

	public void validateMykeysightUI() {
		Assert.assertTrue(Findtab.isDisplayed());
		Assert.assertTrue(Myproductstab.isDisplayed());
		Assert.assertTrue(productwatchingtext.isDisplayed());
		Assert.assertTrue(recentvewedproducttext.isDisplayed());
		Assert.assertTrue(Findbutton.isDisplayed());
	}

	
	//***********************ACTIONS for MY Keysight portlet TEST******************
	
		public void MYKloggedinview() throws InterruptedException{
			driver.findElement(By.xpath("//a[@id='pt1:g1l1_3']")).click();
			Homepage myKk = new Homepage();
			myKk.homepagelogin();
			myKk.clickonmykeysightlink();

			Assert.assertTrue(welcomebackmsg.isDisplayed());
			Assert.assertTrue(contactexpertlink.isDisplayed());
			Assert.assertTrue(Findtab.isDisplayed());
			Assert.assertTrue(Myproductstab.isDisplayed());
			Assert.assertTrue(contactexpertlink.isDisplayed());
			Assert.assertTrue(communityregisterbutton.isDisplayed());
			Assert.assertTrue(productwatchingtext.isDisplayed());
			Assert.assertTrue(recentvewedproducttext.isDisplayed());
			Assert.assertTrue(mydownloadshistory.isDisplayed());
			Assert.assertTrue(Findorder.isDisplayed());
			Assert.assertTrue(CustomerPOtextbox.isDisplayed());
			Assert.assertTrue(Findbutton.isDisplayed());
			Assert.assertTrue(mynewsportletloginview.isDisplayed());
			Assert.assertTrue(addcapability.isDisplayed());

			Myproductstab.click();
			driver.findElement(By.xpath("//span[contains(text(),'myKeysight')]")).click();

			Assert.assertTrue(mdlnbr.isDisplayed());
			Assert.assertTrue(status.isDisplayed());
			Assert.assertTrue(latestversion.isDisplayed());
			Assert.assertTrue(advancefindapart.isDisplayed());
			Assert.assertTrue(findbutton.isDisplayed());
	
		
		}
		
		
		public void MYKPUBLICview(){
			String a =driver.findElement(By.xpath("//span[contains(text(),'Welcome to your myKeysight Page')]")).getText();
			Assert.assertEquals(a, "Welcome to your myKeysight Page");
			
			Assert.assertTrue(contactexpertlink.isDisplayed());
			Assert.assertTrue(Findtab.isDisplayed());
			Assert.assertTrue(Myproductstab.isDisplayed());
			//Assert.assertTrue(loginbtn.isDisplayed());
			Assert.assertTrue(communityregisterbutton.isDisplayed());
			Assert.assertTrue(productwatchingtext.isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//td[contains(text(),'You can add products from product pages "
					+ "on our website or from Recently Viewed Products below.')]")).isDisplayed());
			
			Assert.assertTrue(recentvewedproducttext.isDisplayed());
			Assert.assertTrue(mydownloadshistory.isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'Register for myKeysight to"
					+ " have the ability to see your download history.')]")).isDisplayed());
			
			Assert.assertTrue(Findorder.isDisplayed());
			Assert.assertTrue(CustomerPOtextbox.isDisplayed());
			Assert.assertTrue(Findbutton.isDisplayed());
			Assert.assertTrue(mynewsportletlogoutview.isDisplayed());

			Myproductstab.click();
			driver.findElement(By.xpath("//span[contains(text(),'Welcome to your myKeysight Page')]")).click();
			
			//driver.switchTo().frame("afr::PushIframe");
			Assert.assertTrue(mdlnbr.isDisplayed());
			Assert.assertTrue(status.isDisplayed());
			Assert.assertTrue(latestversion.isDisplayed());
			Assert.assertTrue(advancefindapart.isDisplayed());
			Assert.assertTrue(findbutton.isDisplayed());

		}
		
		
		public void MYKRememberedview() throws InterruptedException{
			driver.findElement(By.xpath("//a[@id='pt1:g1l1_3']")).click();
			Homepage myKk = new Homepage();
			myKk.homepagelogin();
			myKk.clickonmykeysightlink();

			Mykesightpage myK = new Mykesightpage();
			myK.logout();

			Thread.sleep(2000);
			driver.findElement(By.xpath("//p[@id='portal']/a")).click();
			Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'Welcome to your myKeysight Page')]")).isDisplayed());

			Assert.assertTrue(contactexpertlink.isDisplayed());
			Assert.assertTrue(Findtab.isDisplayed());
			Assert.assertTrue(Myproductstab.isDisplayed());
			//Assert.assertTrue(loginbtn.isDisplayed());
			Assert.assertTrue(productwatchingtext.isDisplayed());
			Assert.assertTrue(recentvewedproducttext.isDisplayed());
			Assert.assertTrue(mydownloadshistory.isDisplayed());
			Assert.assertTrue(Findorder.isDisplayed());
			Assert.assertTrue(CustomerPOtextbox.isDisplayed());
			Assert.assertTrue(Findbutton.isDisplayed());
			Assert.assertTrue(mynewsportletloginview.isDisplayed());

			Myproductstab.click();
			driver.findElement(By.xpath("//span[contains(text(),'Welcome to your myKeysight Page')]")).click();

			Assert.assertTrue(mdlnbr.isDisplayed());
			Assert.assertTrue(status.isDisplayed());
			Assert.assertTrue(latestversion.isDisplayed());
			Assert.assertTrue(advancefindapart.isDisplayed());
			Assert.assertTrue(findbutton.isDisplayed());

		}
		
	public void logout(){
		Actions action = new Actions(driver);
		action.moveToElement(utillinks).build().perform();
		Welcome.click();
		Logout.click();
		boolean status=driver.findElement(By.xpath("//p[contains(text(),'You are now logged out.')]")).isDisplayed();
		if(status){
			System.out.println("Successfully Logged Out");
		}else{
			driver.navigate().refresh();
		}
	}	
	
	public Myprofilepage navigatetomyprofile() throws InterruptedException{
		driver.findElement(By.xpath("//a[@id='pt1:g1l1_3']")).click();
		Homepage myKk = new Homepage();
		myKk.homepagelogin();
		myKk.clickonmykeysightlink();

		Actions action = new Actions(driver);
		action.moveToElement(utillinks).build().perform();
		Welcome.click();
		Myplofile.click();
		return new Myprofilepage();
		   
	}
	
	public void navigatetomyprofileFORloggedinuser(){
		Actions action = new Actions(driver);
		action.moveToElement(utillinks).build().perform();
		Welcome.click();
		Myplofile.click();

		
	}
	

}
