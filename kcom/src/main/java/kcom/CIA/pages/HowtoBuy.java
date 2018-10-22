package kcom.CIA.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import kcom.qa.base.Testbase;

public class HowtoBuy extends Testbase {

	// @**************How to buy page factory*************
	@FindBy(xpath = "//a[@id='util-search']")
	WebElement SearchICON;
	@FindBy(xpath = "//input[@id='header-search-input']")
	WebElement SearchBOX;
	@FindBy(xpath = "//button[@id='header-search-submit']")
	WebElement SearchButton;
	@FindBy(xpath = "//h4[@id='baseprice']")
	WebElement baseprice;
	@FindBy(xpath = "//table[@id='lifecycle']")
	WebElement soldByDetails;
	@FindBy(xpath = "//a[contains(text(),'Check availability')]")
	WebElement CheckavailabilityLink;

	@FindBy(xpath = "//a[@id='HowToBuyOrRent']")
	WebElement howtobuylink;
	@FindBy(xpath = "//div[@id='accBuyrent']//a")
	WebElement orderfromkeysight;
	@FindBy(xpath = "//div[@id='groupheading']/h1")
	WebElement howtobuyheading;
	@FindBy(xpath = "//div[@id='glancetext']//h1")
	WebElement ProductDescheading;

	@FindBy(xpath = "//th[contains(text(),'toll-free')]")
	WebElement Tollfreeno;
	@FindBy(xpath = "//th[contains(text(),'fax')]")
	WebElement fax;
	@FindBy(xpath = "//th[contains(text(),'address')]")
	WebElement address;
	@FindBy(xpath = "//div[@id='countrydisclaimer']")
	WebElement priceDeclaration;

	@FindBy(xpath = "//div[@id='countrymenu']//a[contains(text(),'more...')]")
	WebElement morecountry;
	@FindBy(xpath = "//a[contains(text(),'Iceland')]")
	WebElement iceland;
	@FindBy(xpath = "//a[contains(text(),'Agree and Proceed')]")
	WebElement agreeandcontinue;
	@FindBy(xpath = "//span[contains(text(),'Contact a Reseller')]")
	WebElement contactAresellertext;

	@FindBy(xpath = "//strong[contains(text(),'Request Quote')]")
	WebElement RequestQuote;
	@FindBy(xpath = "//div[@class='gaqoverlay show']/ul//a")
	WebElement GetQuote;

	// **********PAGE FACTORY INITIALILATION***************
	public HowtoBuy() {
		PageFactory.initElements(driver, this);
	}
	// **********ACTIONS***************
	
	public void startmethod() {
		
		Prerequities();
	}
	

	public void HowToBuyScenario() throws InterruptedException {
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(SearchICON));
		SearchICON.click();
		SearchBOX.sendKeys(prop.getProperty("Productnumber"));
//		wait = new WebDriverWait(driver, 60);
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@href='https://stgwww.keysight.com/main/redirector.jspx?action=ref&cc=IN&lc=eng&cname=PRODUCT&ckey=x202266']/span"))));
//		driver.findElement(By.xpath("//a[@href='https://stgwww.keysight.com/main/redirector.jspx?action=ref&cc=IN&lc=eng&cname=PRODUCT&ckey=x202266']/span")).click();;
		
		SearchButton.click();
		
	
		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@id='country']"))));
		driver.findElement(By.xpath("//ul[@id='country']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='countrymenu']//a[@title='United States']")).click();
		Assert.assertTrue(baseprice.isDisplayed());
		Assert.assertTrue(soldByDetails.isDisplayed());
		Assert.assertTrue(CheckavailabilityLink.isDisplayed());
		howtobuylink.click();
		Thread.sleep(3000);
		orderfromkeysight.click();

		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(howtobuyheading));
		Assert.assertTrue(howtobuyheading.isDisplayed());
		Assert.assertTrue(ProductDescheading.isDisplayed());
		Assert.assertTrue(Tollfreeno.isDisplayed());
		Assert.assertTrue(fax.isDisplayed());
		Assert.assertTrue(address.isDisplayed());
		Assert.assertTrue(priceDeclaration.isDisplayed());

		driver.findElement(By.xpath("//ul[@id='country']")).click();
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(morecountry));
		morecountry.click();
		iceland.click();
		Thread.sleep(50000);
		
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(4000);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(contactAresellertext));
		Assert.assertTrue(contactAresellertext.isDisplayed());

		driver.findElement(By.xpath("//ul[@id='country']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='countrymenu']//a[@title='United States']")).click();

		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(RequestQuote));
		RequestQuote.click();
		Thread.sleep(3000);
		GetQuote.click();
	}
}
