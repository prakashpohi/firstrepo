package kcom.CIA.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kcom.CIA.pages.HowtoBuy;
import kcom.CIA.pages.TechnicalSupport;
import kcom.qa.base.Testbase;
import kcom.qa.util.Screenshot;

public class TechSupportTest extends Testbase {
	
	TechnicalSupport TechnicalSupport;

	public TechSupportTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {

		initialization();
		TechnicalSupport = new TechnicalSupport();
	}
	
	@Test
	public void HowToBuyCheck() throws InterruptedException{
		TechnicalSupport.startmethod();
		TechnicalSupport.Techsupport();
		
	}
	
	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			Screenshot.takescreenshot(result.getName());
		}
		driver.quit();
	}
	
}
