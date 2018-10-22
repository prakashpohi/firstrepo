package kcom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import kcom.qa.base.Testbase;

public class FindApartSearchPage extends Testbase{
	

	@FindBy(xpath = "//span[contains(text(),'Advanced Find-A-Part')]")
	WebElement AdvanceFAPstatictext;
	
	@FindBy(xpath = "//span[contains(text(),'Find by Part or Product Number')]")
	WebElement FAPorProductNoStatictext;
	
	@FindBy(xpath = "//input[@id='pt1:r1:0:pt1:p001:it3::content']")
	WebElement findbypartTextbox;
	
	@FindBy(xpath = "//input[@id='pt1:r1:0:pt1:ps002:it31::content']")
	WebElement findbyproductTextbox;
	
	@FindBy(xpath = "//input[@id='pt1:r1:0:pt1:p001_5:it3_5::content']")
	WebElement findTextbox;
	
	@FindBy(xpath = "//a[@id='pt1:r1:0:pt1:p001:cb1']")
	WebElement findbypartButton;
	
	@FindBy (xpath="//span[contains(text(),'No Matches Found')]")
	WebElement Nomatchfoundforpartnum;
	
	@FindBy(xpath = "//a[@id='pt1:r1:0:pt1:ps002:cbs_1']")
	WebElement findbyproductButton;
	
	@FindBy(xpath = "//a[@id='pt1:r1:0:pt1:p001_5:cb1_5']")
	WebElement findButton;
	
	@FindBy(xpath = "//td[contains(text(),'Error: A value is required.')]")
	WebElement errormessagefornovalue;
	
	@FindBy(xpath = "//td[@class='x16q']")
	WebElement errormsgforlessthan3;
	
	@FindBy(xpath = "//a[@id='pt1:r1:1:pt1:j_id_id113pc2']")
	WebElement Returntofindapart;
	
	
	
	// **********initialization of OR *************
		public FindApartSearchPage() {
			super();
			PageFactory.initElements(driver, this);
		}
		
		
		public void stratmethod() {
			Prerequities();
			Homepage homepage = new Homepage();
			Mykesightpage Mykeysightpage = homepage.clickonmykeysightlink();
			FindApartSearchPage FindApartSearchPage = Mykeysightpage.clickonadvancefindapart();

			
		}
		

	public void validateallWebelement(){
		Assert.assertTrue(AdvanceFAPstatictext.isDisplayed());
		Assert.assertTrue(FAPorProductNoStatictext.isDisplayed());
		Assert.assertTrue(findbypartTextbox.isDisplayed());
		Assert.assertTrue(findbyproductTextbox.isDisplayed());
		Assert.assertTrue(findTextbox.isDisplayed());
		Assert.assertTrue(findbypartButton.isDisplayed());
		Assert.assertTrue(findbyproductButton.isDisplayed());
		Assert.assertTrue(findButton.isDisplayed());
		
	}
	
	public FindApartSearchResultPage FindBypart(){
		findbypartTextbox.clear();
		findbypartTextbox.sendKeys("1258963");
		findbypartButton.click();
				
		if(Nomatchfoundforpartnum.isDisplayed()){
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("No matches found for the enter part number");
			Returntofindapart.click();
		}
		
		findbypartTextbox.sendKeys(prop.getProperty("productpartnum"));
		findbypartButton.click();
		return new FindApartSearchResultPage();
	}
	
	public FindApartSearchResultPage FindByproduct(){
		findbyproductTextbox.clear();
		findbyproductTextbox.sendKeys(prop.getProperty("productnum"));
		findbyproductButton.click();
		if(Nomatchfoundforpartnum.isDisplayed()){
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("No matches found for the enter product number");
		}
		return new FindApartSearchResultPage();
		
	}
		
	public FindApartSearchResultPage FindBypartORproduct(){
		findTextbox.clear();
		findTextbox.sendKeys(prop.getProperty("productpartnum"));
		findButton.click();
		return new FindApartSearchResultPage();	
		
	}
		
		public void validateFindbypart() throws InterruptedException{
			findbypartButton.click();
			Thread.sleep(3000);
			Assert.assertTrue(errormessagefornovalue.isDisplayed());
			findbypartTextbox.sendKeys("1");
			findbypartButton.click();
			Thread.sleep(3000);
			Assert.assertTrue(errormsgforlessthan3.isDisplayed());
		}
		
	
	}
