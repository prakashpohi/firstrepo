package kcom.CIA.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kcom.CIA.pages.HowtoBuy;
import kcom.qa.base.Testbase;
import kcom.qa.util.Screenshot;

public class HowtoBuyTest extends Testbase {

	HowtoBuy HowtoBuy;
	public HowtoBuyTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {

		initialization();
		HowtoBuy = new HowtoBuy();
	}
	
	@Test
	public void HowToBuyCheck() throws InterruptedException{
		HowtoBuy.startmethod();
		HowtoBuy.HowToBuyScenario();
		
	}
	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			Screenshot.takescreenshot(result.getName());
		}
		driver.quit();
	}
}
