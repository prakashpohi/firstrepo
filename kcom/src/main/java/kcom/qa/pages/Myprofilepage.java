package kcom.qa.pages;

import static org.testng.Assert.assertFalse;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import kcom.qa.base.Testbase;
import kcom.qa.testcases.MyprofilepageTest;

public class Myprofilepage extends Testbase {
	@FindBy(xpath = "//img[@alt='Keysight Technologies']")
	WebElement Companylogo;
	@FindBy(xpath = "//p[@id='portal']/a")
	WebElement myKlink;
	
	@FindBy(xpath = "//a[@id='pt1:gl1']")
	WebElement DeleteWebmaster;
	
	@FindBy(xpath = "//a[@id='pt1:gl2']")
	WebElement deleteprofile;
	
	@FindBy(xpath = "//a[@id='pt1:gl3']")
	WebElement Keysightprivacystatement;
	
	@FindBy(xpath = "//label[contains(text(),'Required Information')]")
	WebElement RequiredInformation;
	
	@FindBy(xpath = "//div[@id='pt1:pgl1']//span[contains(text(),'My Profile')]")
	WebElement MyProfileTEXT;

	@FindBy(xpath = "//label[contains(text(),'Profile information for:')]")
	WebElement ProfileINFOfor;

	@FindBy(xpath = "//span[@id='pt1:username::content']")
	WebElement USERNAME;
	
	@FindBy(xpath = "//span[contains(text(),'Contact an Expert')]")
	WebElement contactexpert;

	@FindBy(xpath = "//span[contains(text(),'Add a Capability')]")
	WebElement AddACapability;
	
	@FindBy(xpath = "//span[contains(text(),'My Profile')]")
	WebElement Myprofilestatictext;

	@FindBy(xpath = "//h1[contains(text(),'Preferences')]")
	WebElement Preferencestab;

	@FindBy(xpath = "//nobr[contains(text(),'Application Interests')]")
	WebElement ApplicationInterests;

	@FindBy(xpath = "//nobr[contains(text(),'Email Preferences')]")
	WebElement EmailPreferences;

	@FindBy(xpath = "//button[@id='pt1:cb1']")
	WebElement updateprofilebtn;

	@FindBy(xpath = "//a[@title='Collapse Preferences']")
	WebElement PreferencesexpandedICON;
	@FindBy(xpath = "//a[@title='Expand Preferences']")
	WebElement PreferencesdisableICON;
	@FindBy(xpath = "//input[@id='pt1:prodItr:0:sbc5::content']")
	WebElement PreferencesRFW;
	@FindBy(xpath = "//input[@id='pt1:prodItr:1:sbc5::content']")
	WebElement PreferencesDigital;
	@FindBy(xpath = "//input[@id='pt1:prodItr:2:sbc5::content']")
	WebElement PreferencesGeneral;
	@FindBy(xpath = "//input[@id='pt1:prodItr:3:sbc5::content']")
	WebElement PreferencesDAQ;
	@FindBy(xpath = "//input[@id='pt1:prodItr:4:sbc5::content']")
	WebElement Preferencessoftware;
	@FindBy(xpath = "//input[@id='pt1:prodItr:5:sbc5::content']")
	WebElement Preferencessyystem;
	@FindBy(xpath = "//input[@id='pt1:prodItr:6:sbc5::content']")
	WebElement PreferencesServices;

	@FindBy(xpath = "//a[@id='pt1:sdi12::disAcr' and @title='Hide this panel']")
	WebElement EmailPreferencedisabledICON;

	@FindBy(xpath = "//a[@id='pt1:sdi12::disAcr' and @title='Show this panel']")
	WebElement EmailPreferenceexpandedICON;

	@FindBy(xpath = "//label[contains(text(),'Language Preference')]")
	WebElement LanguagePreference;

	@FindBy(xpath = "//select[@id='pt1:soc4::content']")
	WebElement LanguagePreferencedropdown;

	// @FindBy(xpath = "//a[@id='pt1:pb2::_afrDscl']")
	// WebElement personalinfoexpandbtn;
	

	@FindBy(xpath = "//div[contains(text(),'Your profile has been successfully updated.')]")
	WebElement profileupdatedmsg;

	@FindBy(xpath = "//a[@id='pt1:gl5']")
	WebElement afterprofileupdatecontinuelink;

	// *********MY CAPABILITY ***************
	@FindBy(xpath = "//h1[@id='pt1:sdi13qq::head']//td[@class='x17r']")
	WebElement mycapabilitytext;
	@FindBy(xpath = "//a[@title='Collapse My Capabilities']")
	WebElement mycapabilitytextICON;
	@FindBy(xpath = "//a[@title='Expand My Capabilities']")
	WebElement mycapabilitytextdisableICON;
	
	@FindBy(xpath = "//h1[@id='pt1:sdi13qq::head']//td[@class='x17r']")
	WebElement onestepquoting;
	@FindBy(xpath = "//a[@id='pt1:sdi13qq::disAcr' and @title='Hide this panel']")
	WebElement onestepquotingexpandedICON;
	@FindBy(xpath = "//a[@id='pt1:sdi13qq::disAcr' and @title='Show this panel']")
	WebElement onestepquotingdisableICON;

	@FindBy(xpath = "//h1[@id='pt1:sdi1::head']//td[@class='x17r']")
	WebElement productreg;
	@FindBy(xpath = "//a[@id='pt1:sdi1::disAcr' and @title='Hide this panel']")
	WebElement productregexpandedICON;
	@FindBy(xpath = "//a[@id='pt1:sdi1::disAcr' and @title='Show this panel']")
	WebElement productregdisableICON;

	// **************PERSONAL INFORMATION******************

	@FindBy(xpath = "//h1[contains(text(),'Personal Information')]")
	WebElement personalinformation;
	@FindBy(xpath = "//a[@title='Collapse Personal Information']")
	WebElement personalinfoexpandedICON;
	@FindBy(xpath = "//a[@title='Expand Personal Information']")
	WebElement personalinfodisableICON;
	@FindBy(xpath = "//input[@id='pt1:jobTitle::content']")
	WebElement jobtitletextbox;
	@FindBy(xpath = "//input[@id='pt1:it2::content']")
	WebElement personalinfoLastname;
	
	




	@FindBy(xpath = "//h1[contains(text(),'Change Password')]")
	WebElement changepasswordtext;

	@FindBy(xpath = "//a[@title='Expand Change Password']")
	WebElement changepassworddisabledICON;

	@FindBy(xpath = "//a[@title='Collapse Change Password']")
	WebElement changepasswordexpandedICON;

	@FindBy(xpath = "//div[@id='pt1:pb3::content']/span")
	WebElement keepyourcurrentpasswordTEXT;

	@FindBy(xpath = "//input[@id='pt1:it12::content']")
	WebElement Currentpassword;

	@FindBy(xpath = "//input[@id='pt1:it13::content']")
	WebElement Newpassword;

	@FindBy(xpath = "//input[@id='pt1:it14::content']")
	WebElement Confirmpassword;

	@FindBy(xpath = "//a[@id='pt1:gb1']")
	WebElement CancelButton;

	// **********initialization of OR *************
	public Myprofilepage() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public static void Myprofilestart() throws InterruptedException {
		Prerequities();
		Homepage homepage = new Homepage();
		Mykesightpage Mykeysightpage = homepage.clickonmykeysightlink();
		Myprofilepage Myprofilepage = Mykeysightpage.navigatetomyprofile();

	}
	
	
	
	public void updateprofile() throws InterruptedException {
		personalinfodisableICON.click();
		Thread.sleep(6000);
		personalinformation.click();
		jobtitletextbox.clear();
		jobtitletextbox.sendKeys(prop.getProperty("jobtitle"));
		updateprofilebtn.click();
		//Thread.sleep(20000);
		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(profileupdatedmsg));
		
		String parentwindowhandle = driver.getWindowHandle();
		for (String childtab : driver.getWindowHandles()) {
			driver.switchTo().window(childtab);
			
			profileupdatedmsg.click();
			afterprofileupdatecontinuelink.click();
		}
		//myKlink.click();
		Thread.sleep(5000);
		Mykesightpage myK = new Mykesightpage();
		myK.navigatetomyprofileFORloggedinuser();
		Thread.sleep(5000);
		personalinfodisableICON.click();
		Thread.sleep(6000);
		personalinformation.click();
		String S1 = jobtitletextbox.getAttribute("value");
		String S2 = prop.getProperty("jobtitle");
		Assert.assertEquals(S1, S2);
		
	}
	
	public void changepassword() throws InterruptedException {
		changepassworddisabledICON.click();
		Thread.sleep(6000);
		changepasswordtext.click();
		Currentpassword.sendKeys(prop.getProperty("password"));
//		System.out.println("************");
//		System.out.println(Newpassword.getCssValue("color"));
		Newpassword.sendKeys("Keys");
		Thread.sleep(1000);
		Confirmpassword.click();
//validation for new password field		
		Assert.assertTrue(driver.findElement(By.xpath("//tr[@class='p_AFError x1zk x1u']")).isDisplayed());
		Newpassword.clear();
		Newpassword.sendKeys("Keysight@1");
		Confirmpassword.sendKeys("Keysight@1");
		updateprofilebtn.click();
		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(profileupdatedmsg));
		String parentwindowhandle = driver.getWindowHandle();
		for (String childtab : driver.getWindowHandles()) {
			driver.switchTo().window(childtab);
			profileupdatedmsg.click();
			afterprofileupdatecontinuelink.click();
		}
		Mykesightpage myK = new Mykesightpage();
		Thread.sleep(5000);
		myK.logout();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Log back in')]")).click();
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@id='loginbtn']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'Welcome back,')]")).isDisplayed());

		
	}
	
	public void profilepageUI() {
		Assert.assertTrue(myKlink.isDisplayed());
		Assert.assertTrue(Myprofilestatictext.isDisplayed());
		Assert.assertTrue(ProfileINFOfor.isDisplayed());
		Assert.assertTrue(USERNAME.isDisplayed());
		Assert.assertTrue(contactexpert.isDisplayed());
		Assert.assertTrue(AddACapability.isDisplayed());
		Assert.assertTrue(CancelButton.isDisplayed());
		Assert.assertTrue(updateprofilebtn.isDisplayed());
		Assert.assertTrue(mycapabilitytext.isDisplayed());
		Assert.assertTrue(mycapabilitytextICON.isDisplayed());
		Assert.assertTrue(Preferencestab.isDisplayed());
		Assert.assertTrue(changepasswordtext.isDisplayed());
		Assert.assertTrue(personalinformation.isDisplayed());
		Assert.assertTrue(LanguagePreference.isDisplayed());
		Assert.assertTrue(Companylogo.isDisplayed());
		
		Assert.assertTrue(DeleteWebmaster.isDisplayed());
		Assert.assertTrue(deleteprofile.isDisplayed());
		Assert.assertTrue(Keysightprivacystatement.isDisplayed());
		Assert.assertTrue(RequiredInformation.isDisplayed());
	
	}
	
	
	

	public void validatepersonalinformation() throws InterruptedException, IOException {
		Assert.assertTrue(personalinfodisableICON.isDisplayed());
		personalinfodisableICON.click();
		Thread.sleep(50000);
		Assert.assertTrue(personalinfoexpandedICON.isDisplayed());
		myKlink.click();
		Mykesightpage myK = new Mykesightpage();
		myK.logout();
		myKlink.click();
		myK.navigatetomyprofile();

		Assert.assertTrue(personalinfodisableICON.isDisplayed());
		personalinfodisableICON.click();
		Thread.sleep(50000);
		Assert.assertTrue(personalinfoexpandedICON.isDisplayed());
		jobtitletextbox.clear();
		jobtitletextbox.sendKeys(prop.getProperty("jobtitle"));
		updateprofilebtn.click();
		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(profileupdatedmsg));
		String parentwindowhandle = driver.getWindowHandle();

		for (String childtab : driver.getWindowHandles()) {
			driver.switchTo().window(childtab);
			profileupdatedmsg.click();
			afterprofileupdatecontinuelink.click();
		}

	}

	public void validatecapability() throws InterruptedException {
		Assert.assertTrue(onestepquoting.isDisplayed());
		Assert.assertTrue(onestepquotingexpandedICON.isDisplayed());
		Assert.assertTrue(productregdisableICON.isDisplayed());
		productregdisableICON.click();
		Thread.sleep(5000);
		Assert.assertTrue(onestepquotingexpandedICON.isDisplayed());
		Assert.assertTrue(productregexpandedICON.isDisplayed());

		onestepquotingexpandedICON.click();
		Thread.sleep(5000);
		Assert.assertTrue(onestepquotingdisableICON.isDisplayed());
		Assert.assertTrue(productregexpandedICON.isDisplayed());

	}

	public void ExpandANDpreference() throws InterruptedException {

		// *********Check for Expand *************
		Assert.assertTrue(PreferencesexpandedICON.isDisplayed());
		PreferencesexpandedICON.click();
		Thread.sleep(5000);
		Assert.assertTrue(PreferencesdisableICON.isDisplayed());
		PreferencesdisableICON.click();
		Thread.sleep(5000);
		personalinfodisableICON.click();
		Thread.sleep(5000);

		// ****************Check for preference selected or not*******

		personalinformation.click();
		if (PreferencesRFW.isSelected()) {
			PreferencesRFW.click();
		}
		if (PreferencesDigital.isSelected()) {
			PreferencesDigital.click();
		}
		if (PreferencesGeneral.isSelected()) {
			PreferencesGeneral.click();
		}
		if (PreferencesDAQ.isSelected()) {
			PreferencesDAQ.click();
		}
		if (Preferencessoftware.isSelected()) {
			Preferencessoftware.click();
		}
		if (Preferencessyystem.isSelected()) {
			Preferencessyystem.click();
		}
		if (PreferencesServices.isSelected()) {
			PreferencesServices.click();
		}

		updateprofilebtn.click();
		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(profileupdatedmsg));

		String parentwindowhandle = driver.getWindowHandle();

		for (String childtab : driver.getWindowHandles()) {
			driver.switchTo().window(childtab);
			profileupdatedmsg.click();
			afterprofileupdatecontinuelink.click();
		}

		//Assert.assertTrue(driver.findElement(By.xpath("//div[@id='pt1:pb1_sb1:r12:0:pgl13']")).isDisplayed());

	}

	public void changepreference() throws InterruptedException {
		Thread.sleep(3000);
		PreferencesRFW.click();
		updateprofilebtn.click();
		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(profileupdatedmsg));

		String parentwindowhandle = driver.getWindowHandle();

		for (String childtab : driver.getWindowHandles()) {
			driver.switchTo().window(childtab);
			profileupdatedmsg.click();
			afterprofileupdatecontinuelink.click();
		}

		//Assert.assertTrue(driver.findElement(By.xpath("//div[@id='pt1:pb1_sb1:r12:0:pgl13']")).isDisplayed());
	}

}
