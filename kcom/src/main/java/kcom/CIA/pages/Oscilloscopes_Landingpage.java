package kcom.CIA.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import kcom.qa.base.Testbase;
import kcom.qa.pages.Homepage;

public class Oscilloscopes_Landingpage extends Testbase {

	// *********PAGE FACTORY /OR ***************

	@FindBy(linkText = "PRODUCTS + SERVICES")
	WebElement product;

	@FindBy(xpath = "//span[contains(text(),'Oscilloscopes + Analyzers')]")
	WebElement Oscilloscopes;

	@FindBy(xpath = "//a[@href='https://stgwww.keysight.com/en/pcx-x2015004/oscilloscopes?nid=-32546.0.00&lc=eng&cc=US']")
	WebElement Oscilloscopes1;

	@FindBy(xpath = "//div[@id='hero']")
	WebElement HeroImgSection;

	@FindBy(xpath = "//div[@id='heroctrl']/b[1]")
	WebElement HeroImgDOT1;

	@FindBy(xpath = "//div[@id='heroctrl']/b[2]")
	WebElement HeroImgDOT2;
	@FindBy(xpath = "//div[@id='hero']/div[2]//a")
	WebElement HeroImg2statictext;

	@FindBy(xpath = "//div[@id='heroctrl']/b[3]")
	WebElement HeroImgDOT3;
	@FindBy(xpath = "//div[@id='hero']/div[3]//a")
	WebElement HeroImg3statictext;
	

	@FindBy(xpath = "//table[@class='cmptbl collapse']/tbody/tr/td/a")
	WebElement FirstSeriesfirstproduct;
	@FindBy(xpath = "//div[@id='quote_2766199']")
	WebElement FirstSeriesfirstproductRQ;
	@FindBy(xpath = "//div[@id='quote_2766199']//div[@class='gaqoverlay show']/ul/li/a")
	WebElement Getquote;
	
	@FindBy(xpath = "//div[@id='userinfo']")
	WebElement userdetails;
	@FindBy(xpath = "//div[@id='userinfo']//input[@name='email']")
	WebElement emailID;
	@FindBy(xpath = "//div[@id='userinfo']//input[@name='lastName']")
	WebElement lastname;
	@FindBy(xpath = "//div[@id='userinfo']//input[@name='firstName']")
	WebElement firstName;
	@FindBy(xpath = "//div[@id='userinfo']//input[@name='company']")
	WebElement companyName;
	@FindBy(xpath = "//div[@id='userinfo']//input[@name='phone']")
	WebElement phone;
	@FindBy(xpath = "//div[@id='userinfo']//input[@name='address1']")
	WebElement address1;
	@FindBy(xpath = "//div[@id='userinfo']//input[@name='city']")
	WebElement city;
	@FindBy(xpath = "//div[@id='userinfo']//input[@name='state']")
	WebElement state;
	@FindBy(xpath = "//div[@id='userinfo']//input[@name='postalCode']")
	WebElement postalCode;
	
	@FindBy(xpath = "//div[@id='userinfo']//select[@name='location']")
	WebElement locationdropdown;
	@FindBy(xpath = "//div[@id='userinfo']//input[@id='tfa_Plantopurchasewi']")
	WebElement purchaseradiobtn;
	@FindBy(xpath = "//div[@id='userinfo']//input[@id='tfa_No']")
	WebElement purchaseradiobtn2;
	@FindBy(xpath = "//div[@id='userinfo']//a[@class='button checkout']")
	WebElement RequestButton;
	@FindBy(xpath = "//h1[contains(text(),'Thank You for Using Online Instant Quoting')]")
	WebElement ThankyouMsg;
	
	
	// @**************Compare series page factory*************

	@FindBy(xpath = "//div[@id='tabcontentwrapper']/div//table[@class='cmptbl collapse']/tbody/tr/td/a")
	WebElement FirstSeries;
	
	@FindBy(xpath = "//div[@id='tabcontentwrapper']/div//table[@class='cmptbl collapse']/tbody/tr/td//input")
	WebElement ONEXseriescomparechkBOX;
	@FindBy(xpath = "//div[@id='tabcontentwrapper']/div//table[@class='cmptbl collapse']/tbody/tr[7]/td//input")
	WebElement TWOXseriescomparechkBOX;
	
	//****************Compare product page factory************
	@FindBy(xpath = "//table[@class='cmptbl collapse']/tbody/tr[1]/td/label/input")
	WebElement FirstproductselecttocompareCheckbox;
	@FindBy(xpath = "//table[@class='cmptbl collapse']/tbody/tr[2]/td/label/input")
	WebElement SecondproductselecttocompareCheckbox;
	@FindBy(xpath = "//table[@class='cmptbl collapse checks']/tbody/tr[1]/td/label/span")
	WebElement Productcompare;
	
	
	
	// **********PAGE FACTORY INITIALILATION***************
	public Oscilloscopes_Landingpage() {
		PageFactory.initElements(driver, this);
	}
	// **********ACTIONS***************
	
	public void startmethod() throws InterruptedException {
		Prerequities();
		NavigatetoOscilloscopePage();		
	}
	
	public void CompareProduct(){
		FirstSeries.click();
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(FirstproductselecttocompareCheckbox));
		FirstproductselecttocompareCheckbox.click();
		SecondproductselecttocompareCheckbox.click();
		Productcompare.click();
	}
	
	public void CompareSeries() {

		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox' and @name='series']"));

		ele.get(0).click();
		ele.get(1).click();
		List<WebElement> series = driver.findElements(By.xpath("//span[contains(text(),'Compare Series')]"));
		series.get(0).click();

	}
	
	public void RequestQuote() throws InterruptedException{
		FirstSeries.click();
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(FirstSeriesfirstproduct));
		FirstSeriesfirstproductRQ.click();
		Thread.sleep(3000);
		Getquote.click();
		Thread.sleep(10000);
				
		Set<String>s = driver.getWindowHandles();
		System.out.println(s.size());
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='utilquoteform']/iframe")));
		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(userdetails));
		
//		String parentwindowhandle = driver.getWindowHandle();
//		for (String childtab : driver.getWindowHandles()) {
//			driver.switchTo().window(childtab);
			
			emailID.clear();
			emailID.sendKeys(prop.getProperty("username"));
			lastname.clear();
			lastname.sendKeys("pohi");
			firstName.clear();
			firstName.sendKeys("prakash");
			companyName.clear();
			companyName.sendKeys("TCS");
			phone.clear();
			phone.sendKeys("9985697456");
			address1.clear();
			address1.sendKeys("waverock");
			city.clear();
			city.sendKeys("Hyderabad");
			state.clear();
			state.sendKeys("Telangana");
			postalCode.clear();
			postalCode.sendKeys("500084");
			
			Select country = new Select(locationdropdown);
			country.selectByVisibleText("Telangana");
			
			Thread.sleep(5000);
			Select distributor = new Select(driver.findElement(By.xpath("//select[@name='distributor']")));
			distributor.selectByIndex(1);
			//distributor.selectByVisibleText("Synergy Measurement Technologies Pvt. Ltd.");
			
			purchaseradiobtn.click();
			purchaseradiobtn2.click();
			RequestButton.click();
			Thread.sleep(5000);
			wait = new WebDriverWait(driver, 120);
			wait.until(ExpectedConditions.visibilityOf(ThankyouMsg));
			Assert.assertTrue(ThankyouMsg.isDisplayed());
	
			
	}
	
	public void NavigatetoOscilloscopePage() throws InterruptedException {
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(product));
		product.click();
		Thread.sleep(4000);
		Actions action = new Actions(driver);
		action.moveToElement(Oscilloscopes).build().perform();
		Thread.sleep(4000);
		Oscilloscopes1.click();
	}

	public void validationofHeroimage() {
		Assert.assertTrue(HeroImgSection.isDisplayed());
		HeroImgDOT2.click();
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
		}
		Assert.assertTrue(HeroImg2statictext.isDisplayed());
		HeroImgDOT3.click();
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
		}
		Assert.assertTrue(HeroImg3statictext.isDisplayed());

		HeroImgDOT2.click();
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
		}
		HeroImg2statictext.click();
		System.out.println(driver.getTitle());
		Assert.assertEquals("Oscilloscope | Keysight (formerly Agilent’s Electronic Measurement)", driver.getTitle());
	}


	
	public void ProductsAndServiceLanding(){
		Assert.assertTrue(FirstSeries.isDisplayed());
		String Seriesname= FirstSeries.getText();
		FirstSeries.click();
		String Actual=driver.findElement(By.xpath("//div[@class='section main']/h1")).getText();
		System.out.println(Seriesname);
		System.out.println(Actual);
		
		Assert.assertEquals(Seriesname, Actual);
		driver.findElement(By.xpath("//p[@id='breadcrumb']/a[4]")).click();
	}
	
	


}
