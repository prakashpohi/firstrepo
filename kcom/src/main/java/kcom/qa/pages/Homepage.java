package kcom.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import kcom.qa.base.Testbase;

public class Homepage extends Testbase {

	// *********PAGE FACTORY /OR ***************

	@FindBy(linkText = "PRODUCTS + SERVICES")
	WebElement product;
	
	@FindBy(xpath = "//span[contains(text(),'Oscilloscopes + Analyzers')]")
	WebElement Oscilloscopes;
	
	@FindBy(xpath = "//a[@href='https://stgwww.keysight.com/en/pcx-x2015004/oscilloscopes?nid=-32546.0.00&lc=eng&cc=US']")
	WebElement Oscilloscopes1;
	
	@FindBy(linkText = "InfiniiVision 1000 X-Series Oscilloscopes")
	WebElement thousandseries;
	
	@FindBy(xpath = "//a[contains(text(),'DSOX1102A Oscilloscope: 70/100 MHz, 2 Analog Channels')]")
	WebElement firstproduct;
	
	@FindBy(xpath = "//a[@title='Keysight']/img")
	WebElement companyimage;

	@FindBy(linkText = "MYKEYSIGHT")
	WebElement Mykeysight;
	
	@FindBy(xpath="//a[@id='util-login']")
	WebElement loginimage;
	
	@FindBy(xpath="//img[@class='util-loggedin']")
	WebElement Loggedinloginimage;
	
	@FindBy(xpath="//img[@class='util-remembered']")
	WebElement Rememberedloginimage;
	
	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='loginbtn']")
	WebElement loginbtn;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement Logoutbtn;
	
	@FindBy(xpath="//a[contains(text(),'My Profile')]")
	WebElement Myprofile;
	
	@FindBy(xpath="//a[@href='https://stgwww.keysight.com/my/faces/ser/forgotPasswordPage.jspx']")
	WebElement fogotpasswordlink;
	
	@FindBy(xpath="//a[@id='register']")
	WebElement Registrationlink;
	
	@FindBy(xpath="//a[@id='util-quote']")
	WebElement homepagekart;
	
	@FindBy(xpath="//div[@id='gnavbar']")
	WebElement homepageHeader;
	@FindBy(xpath="//div[@id='footer']")
	WebElement homepageFooter;
	@FindBy(xpath="//div[@class='panel style-normalText bg-dark-purple-tint1  ']")
	WebElement homepageEventSection;
	@FindBy(xpath="//div[@id='toputil']")
	WebElement homepageUtilitybar;
	//**********PAGE FACTORY INITIALILATION***************
		public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
		
	//*************ACTIONS *******************
		
		public void startmethod() {
			Prerequities();
		}
		
		
		public Login_errorpage Validateloginerrormsg() throws InterruptedException {
			loginimage.click();
			Thread.sleep(3000);
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@frameborder='0']")));
			wait = new WebDriverWait(driver,50);
			wait.until(ExpectedConditions.visibilityOf(loginbtn));
			loginbtn.click();
			return new Login_errorpage();
		}
		
		public void homepagelayout(){
			driver.findElement(By.xpath("//a[@title='Keysight Technologies Home']/img")).click();
			wait = new WebDriverWait(driver,120);
			wait.until(ExpectedConditions.visibilityOf(homepageEventSection));
			Assert.assertTrue(homepageHeader.isDisplayed());
			Assert.assertTrue(homepageFooter.isDisplayed());
			Assert.assertTrue(homepageEventSection.isDisplayed());
			Assert.assertTrue(homepageUtilitybar.isDisplayed());
			
		}
	
	public void Viewproduct() throws InterruptedException {
		Thread.sleep(2000);
		wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(product));
		product.click();
		Thread.sleep(4000);
		Actions action= new Actions(driver);
		action.moveToElement(Oscilloscopes).build().perform();
		Thread.sleep(4000);
		Oscilloscopes1.click();
		thousandseries.click();
		firstproduct.click();
	}	
	
	public Mykesightpage clickonmykeysightlink() {
		Mykeysight.click();
		return new Mykesightpage();
	}

	public boolean validatecompanyname() {
		return companyimage.isDisplayed();
	}
	
	public void homepagelogin() throws InterruptedException{
		Assert.assertTrue(companyimage.isDisplayed());
		loginimage.click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@frameborder='0']")));
		wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOf(loginbtn));
		username.clear();
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginbtn.click();
		Thread.sleep(5000);
		
		//driver.switchTo().defaultContent();
	}
	
	public void LogoutfromHomepage() throws InterruptedException {
//		Homepage H = new Homepage();
//		H.homepagelogin();
	//	companyimage.click();
		wait = new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='util-icon util-loggedin']")));
		driver.findElement(By.xpath("//div[@class='util-icon util-loggedin']")).click();
		Thread.sleep(2000);
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@frameborder='0']")));
		wait.until(ExpectedConditions.visibilityOf(Logoutbtn));
		Logoutbtn.click();
		wait = new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'You are now logged out.')]")));
		Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'You are now logged out.')]")).isDisplayed());
	}
	
	public void navigatetoMyprofile() throws InterruptedException {
//		Homepage H = new Homepage();
//		H.homepagelogin();
		//companyimage.click();
		
		wait = new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='util-icon util-loggedin']")));
		driver.findElement(By.xpath("//div[@class='util-icon util-loggedin']")).click();
		Thread.sleep(2000);
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@frameborder='0']")));
		wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOf(Myprofile));
		Myprofile.click();
		
	}
	
	
}
