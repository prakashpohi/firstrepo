package kcom.qa.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kcom.qa.base.Testbase;
import kcom.qa.pages.FindApartSearchPage;
import kcom.qa.pages.Homepage;
import kcom.qa.pages.Mykesightpage;
import kcom.qa.util.Screenshot;

public class FindApartSearchPageTest extends Testbase {

	FindApartSearchPage FindApartSearchPage;

	public FindApartSearchPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		
		FindApartSearchPage =new  FindApartSearchPage();
	}

	@Test(priority = 1)
	public void validateallWebelementTest() throws InterruptedException {
		FindApartSearchPage.stratmethod();
		FindApartSearchPage.validateallWebelement();
		FindApartSearchPage.validateFindbypart();
	}

	@Test(priority = 2)
	public void FindBypartTest() {
		FindApartSearchPage.stratmethod();
		FindApartSearchPage.FindBypart();
	}

	@Test(priority = 3)
	public void FindByproductTest() {
		FindApartSearchPage.stratmethod();
		FindApartSearchPage.FindByproduct();
	}

	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			Screenshot.takescreenshot(result.getName());
		}
		driver.quit();
	}

}
