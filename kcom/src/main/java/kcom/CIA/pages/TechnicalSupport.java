package kcom.CIA.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import kcom.qa.base.Testbase;
import kcom.qa.util.Screenshot;

public class TechnicalSupport extends Testbase {
	
	
	// *********PAGE FACTORY /OR ***************
	@FindBy(linkText = "PRODUCTS + SERVICES")
	WebElement product;
	@FindBy(xpath = "//span[contains(text(),'Oscilloscopes + Analyzers')]")
	WebElement Oscilloscopes;
	@FindBy(xpath = "//a[@href='https://stgwww.keysight.com/en/pcx-x2015004/oscilloscopes?nid=-32546.0.00&lc=eng&cc=US']")
	WebElement Oscilloscopes1;
	
	@FindBy(xpath = "//input[@id='searchterm']")
	WebElement Searchbox;
	@FindBy(xpath = "//div[@id='searchleft']//p[1]/a[2]")
	WebElement Techsupport;
	
	@FindBy(xpath = "//div[@class='tabnav']//li[2]")
	WebElement DriversTAB;
	@FindBy(xpath = "//div[@class='tabnav']//li[1]")
	WebElement DocLibraryTAB;
	@FindBy(xpath = "//div[@class='tabnav']//li[3]")
	WebElement FAQTAB;
	@FindBy(xpath = "//div[@class='tabnav']//li[3]")
	WebElement DissForumTAB;
	
	
	@FindBy(xpath = "//div[@id='tabwrapper']//div[@style='position: static;'][2]//h4[contains(text(),'By Type of Content')]")
	WebElement BytypeofContentText;
	@FindBy(xpath = "//div[@id='tabwrapper']//div[@style='position: static;'][2]//select")
	WebElement sorting;
	@FindBy(xpath = "//div[@id='tabwrapper']//div[@style='position: static;'][2]//div[@class='filters']/ul/li[1]/a")
	WebElement specification;
	@FindBy(xpath = "//div[@id='tabwrapper']//div[@style='position: static;'][2]//div[@class='filters']/ul/li/a[contains(text(),'Press Releases')]")
	WebElement pressrelease;
	@FindBy(xpath = "//div[@id='tabwrapper']//p[@id='clearfilters']")
	WebElement removeFilter;

	
	@FindBy(xpath = "//p[contains(text(),'None available for this product.')]")
	WebElement DriversTABdetails;
	
	
	@FindBy(xpath = "//div[@id='tabwrapper']//div[@style='position: static;'][2]//h4[contains(text(),'By Topic')]")
	WebElement FAQbytopictext;
	@FindBy(xpath = "//div[@id='tabwrapper']//div[@style='position: static;']//div[@class='records']//select")
	WebElement FAQsorting;
	@FindBy(xpath = "//a[contains(text(),'Licensing')]")
	WebElement FAQLicensing;
	
	@FindBy(xpath = "//a[@href='/main/techSupport.jspx?cc=IN&lc=eng&nid=-32510.1150549&t=80037.k.1&pageMode=FQ']")
	WebElement FAQclearfilter;
	
	//**********PAGE FACTORY INITIALILATION***************
	public TechnicalSupport() {
	PageFactory.initElements(driver, this);
}
	
//*************ACTIONS *******************
	
	public void startmethod() {
		Prerequities();
		
	}
	
	public void Techsupport() throws InterruptedException{
		
		Thread.sleep(2000);
		wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(product));
		product.click();
		Thread.sleep(4000);
		Actions action= new Actions(driver);
		action.moveToElement(Oscilloscopes).build().perform();
		Thread.sleep(4000);
		Oscilloscopes1.click();
		wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(Searchbox));
		Searchbox.sendKeys(prop.getProperty("Productnumber"));
		Thread.sleep(3000);
		Techsupport.click();
		wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(DocLibraryTAB));
		
		Assert.assertTrue(DocLibraryTAB.isDisplayed());
		Assert.assertTrue(DriversTAB.isDisplayed());
		Assert.assertTrue(FAQTAB.isDisplayed());
		Assert.assertTrue(DissForumTAB.isDisplayed());
		
		Assert.assertTrue(BytypeofContentText.isDisplayed());
		Assert.assertTrue(sorting.isDisplayed());
		Assert.assertTrue(specification.isDisplayed());
		Assert.assertTrue(pressrelease.isDisplayed());
		specification.click();
		wait = new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.visibilityOf(removeFilter));
		Assert.assertTrue(removeFilter.isDisplayed());
		removeFilter.click();
		Thread.sleep(10000);
				
		DriversTAB.click();
		Thread.sleep(3000);
		Assert.assertTrue(DriversTABdetails.isDisplayed());
		
		FAQTAB.click();
		wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(FAQbytopictext));
		Assert.assertTrue(FAQbytopictext.isDisplayed());
		Assert.assertTrue(FAQsorting.isDisplayed());
		Assert.assertTrue(FAQLicensing.isDisplayed());
		FAQLicensing.click();
		wait.until(ExpectedConditions.visibilityOf(FAQclearfilter));
		Assert.assertTrue(FAQclearfilter.isDisplayed());
		FAQclearfilter.click();
		Thread.sleep(5000);
		
		
	}
	
	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			Screenshot.takescreenshot(result.getName());
		}
		driver.quit();
	}
}
