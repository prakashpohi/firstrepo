package kcom.qa.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import kcom.qa.base.Testbase;

public class FindApartSearchResultPage extends Testbase {

	// Page factory/ Object Repository

	@FindBy(xpath = "//a[@class='x12k']")
	WebElement viewlink;

	@FindBy(xpath = "//span[contains(text(),'Download to Excel')]")
	WebElement downloadtoexcel;
	
	@FindBy(xpath = "//span[contains(text(),'Print')]")
	WebElement print;
	

	@FindBy(xpath = "//span[contains(text(),' Detach')]")
	WebElement Detach;

	@FindBy(xpath = "//td[contains(text(),'Total Records')]")
	WebElement Totalrecords;

	@FindBy(xpath = "//div[@class='x1cu']//span[contains(text(),'Image')]")
	WebElement imagecolumn;

	@FindBy(xpath = "//div[@class='x1cu']//span[contains(text(),'Part Number')]")
	WebElement Partnumbercolumn;

	@FindBy(xpath = "//div[@class='x1cu']//span[contains(text(),'Part Description')]")
	WebElement PartDescriptioncolumn;

	@FindBy(xpath = "//div[@class='x1cu']//span[contains(text(),'Status')]")
	WebElement Statuscolumn;

	@FindBy(xpath = "//div[@class='x1cu']//span[contains(text(),'Reference')]")
	WebElement Referencecolumn;

	@FindBy(xpath = "//div[@class='x1cu']//span[contains(text(),'Price')]")
	WebElement Pricecolumn;

	@FindBy(xpath = "//a[@id='pt1:r1:0:pt1:j_id_id113pc2']")
	WebElement returntofindapartlink;

	@FindBy(xpath = "//span[contains(text(),'Find-A-Part: ')]")
	WebElement Findapartstaticmsg;

	@FindBy(xpath = "//span[contains(text(),'Part Number Matches')]")
	WebElement PartNumberMatchesstaticmsg;

	@FindBy(xpath = "//span[contains(text(),'Refine by Part Category')]")
	WebElement refinebypartmessage;

	@FindBy(xpath = "//div[@id='pt1:r1:0:pt1:rs1:j_id_id199pc2']/div")
	WebElement Pricedeclarationmsg;

	@FindBy(xpath = "//a[@id='pt1:r1:0:pt1:fc3_1']")
	WebElement FAQlink;

	@FindBy(xpath = "//td[contains(text(),'Columns') and @class='x138']")
	WebElement viewdropdowncolumn;

	@FindBy(xpath = "//td[contains(text(),'Reorder Columns...')]")
	WebElement viewdropdownreordercolumn;

	@FindBy(xpath = "//ul[@id='country']")
	WebElement Country;

	@FindBy(xpath = "//a[@title='United States']")
	WebElement US;

	@FindBy(xpath = "//a[@id='pt1:r1:0:pt1:rs1:pc1:t1:1:shp_1_pt_cil7']")
	WebElement ADDtoCARTbtn;
	
	@FindBy(xpath = "//a[contains(text(),'Continue Browsing')]")
	WebElement Continuebrowsing;
	
	
	@FindBy (xpath="//table[@id='pt1:r1:1:pt1:rs1:pc1:t1:c3::afrSI']/tbody/tr/td[1]/a[1]")
	WebElement PartdescSorting;
	
	@FindBy (xpath="//table[@id='pt1:r1:0:pt1:rs1:pc1:t1:c3::afrSI']//td[2]/a")
	WebElement PartdescSortDesending;
	
	@FindBy (xpath="//table[@id='pt1:r1:0:pt1:rs1:pc1:t1:c2::afrSI']/tbody/tr/td[1]/a[1]")
	WebElement PartnumSorting;
	
	@FindBy (xpath="//table[@id='pt1:r1:0:pt1:rs1:pc1:t1:c4::afrSI']/tbody/tr/td[1]/a[1]")
	WebElement StatusSorting;
	
	
	
	
	
	
	public FindApartSearchResultPage() {
		super();
		PageFactory.initElements(driver, this);
	}

	// ***************ACTIONS ********************
	
	public void Stratmethod() {
		Prerequities();
		Homepage homepage = new Homepage();
		Mykesightpage Mykeysightpage = homepage.clickonmykeysightlink();
		FindApartSearchResultPage FindApartPage = Mykeysightpage.myKfindapart();

	}
	
	
	public void ADDtoCART(){
		Country.click();
		US.click();
		ADDtoCARTbtn.click();
		
		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(Continuebrowsing));
		
		String parentwindowhandle = driver.getWindowHandle();
		for (String childtab : driver.getWindowHandles()) {
			driver.switchTo().window(childtab);
			
			Continuebrowsing.click();
		}
		//driver.switchTo().frame("afr::PushIframe");
		
	}
	
	public void validateSorting() throws InterruptedException{
		PartDescriptioncolumn.click();
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//th[@id='pt1:r1:1:pt1:rs1:pc1:t1:c3']"))).build().perform();
		Thread.sleep(3000);
//		PartdescSorting.click();
		Assert.assertTrue(driver.findElement(By.xpath("//td[contains(text(),'7 MM Center Conductor')]")).isDisplayed());
		PartdescSortDesending.click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.xpath("//a[@id='pt1:r1:0:pt1:rs1:pc1:t1:50:j_id_id146pc2']")).isDisplayed());
//		Partnumbercolumn.click();
//		//PartnumSorting.click();
//		Statuscolumn.click();
//		//StatusSorting.click();
	}

	public void validateAddtocartforUS() {
		Country.click();
		US.click();
		Assert.assertTrue(ADDtoCARTbtn.isDisplayed());
	}

	public void validateALLwebelements() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(viewlink.isDisplayed());
		Assert.assertTrue(downloadtoexcel.isDisplayed());
		Assert.assertTrue(imagecolumn.isDisplayed());
		Assert.assertTrue(Partnumbercolumn.isDisplayed());
		Assert.assertTrue(PartDescriptioncolumn.isDisplayed());
		Assert.assertTrue(Statuscolumn.isDisplayed());
		Assert.assertTrue(Referencecolumn.isDisplayed());
		Assert.assertTrue(returntofindapartlink.isDisplayed());
		Assert.assertTrue(Findapartstaticmsg.isDisplayed());
		Assert.assertTrue(refinebypartmessage.isDisplayed());
		Assert.assertTrue(Pricedeclarationmsg.isDisplayed());
		//Assert.assertFalse(ADDtoCARTbtn.isDisplayed());
	}

	public void clickonFAQ() {
		FAQlink.click();
	}

	public FindApartSearchPage returntofindapart() {
		returntofindapartlink.click();
		return new FindApartSearchPage();
	}

	public void validatevewdropdown() throws InterruptedException {
		String parentwindowhandle = driver.getWindowHandle();
		viewlink.click();
		Thread.sleep(2000);
		Assert.assertTrue(viewdropdowncolumn.isDisplayed());
		Assert.assertTrue(viewdropdownreordercolumn.isDisplayed());
		Findapartstaticmsg.click();
		print.click();
		
		Thread.sleep(3000);
		
	    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    driver.findElement(By.xpath("//div[contains(text(),'Rows 1 - 25 of 782')]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Rows 1 - 25 of 782')]")).isDisplayed());

	    driver.close();
	    driver.switchTo().window(tabs2.get(0));
		
		
		
		
		
		
		
//		for (String childtab : driver.getWindowHandles()) {
//			driver.switchTo().window(childtab);
//			Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Rows 1 - 25 of 782')]")).isDisplayed());
//			driver.close();
//		}
//		driver.switchTo().defaultContent();
		downloadtoexcel.click();
		
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
