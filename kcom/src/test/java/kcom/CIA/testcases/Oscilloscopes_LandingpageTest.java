package kcom.CIA.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kcom.CIA.pages.Oscilloscopes_Landingpage;
import kcom.qa.base.Testbase;
import kcom.qa.pages.Homepage;
import kcom.qa.util.Screenshot;

public class Oscilloscopes_LandingpageTest extends Testbase {

	Oscilloscopes_Landingpage Osc_page;

	public Oscilloscopes_LandingpageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		Osc_page = new Oscilloscopes_Landingpage();
		
	}
	@Test
	public void HomepagelayoutTest() throws InterruptedException {
		Osc_page.startmethod();
		Homepage h= new Homepage();
		h.homepagelayout();
	}
	

	@Test
	public void validationofHeroimageTest() throws InterruptedException {
		Osc_page.startmethod();
		Osc_page.validationofHeroimage();
	}

	 @Test
	 public void CompareSeriesTest() throws InterruptedException{
		 Osc_page.startmethod();
	 Osc_page.CompareSeries();
	
	 }
	 @Test
	 public void CompareProductTest() throws InterruptedException{
		 Osc_page.startmethod();
	 Osc_page.CompareProduct();
	
	 }
	 
	 @Test
	 public void ProductsAndServiceLandingTest() throws InterruptedException{
		 Osc_page.startmethod();
	 Osc_page.ProductsAndServiceLanding();
	
	 }
	 
	 @Test
	 public void RequestQuoteTest() throws InterruptedException{
		 Osc_page.startmethod();
	 Osc_page.RequestQuote();
	
	 }
	 
		@AfterMethod
		public void teardown(ITestResult result) throws IOException {
			if (ITestResult.FAILURE == result.getStatus()) {
				Screenshot.takescreenshot(result.getName());
			}
			driver.quit();
		}
	
}







// @BeforeMethod
// public void setup(){
// System.setProperty("webdriver.chrome.driver", "D:\\eclipse mars 64
// bit\\chromedriver.exe");
// driver = new ChromeDriver();
// driver.manage().window().maximize();
// driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
// driver.get("https://stgwww.keysight.com/en/pcx-x2015004/oscilloscopes?nid=-32546.0.00&lc=eng&cc=US");
// }
// @Test
// public void checkbox(){
// try{Thread.sleep(10000);}catch(Exception e){}
// List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox'
// and @name='series']"));
// System.out.println(ele.get(1));
// System.out.println("number of chcek box available is " +ele.size());
// ele.get(0).click();
// System.out.println("##########" +ele.get(0).getText() +"%%%");
// }