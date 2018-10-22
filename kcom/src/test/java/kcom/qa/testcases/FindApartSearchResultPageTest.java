package kcom.qa.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kcom.qa.base.Testbase;
import kcom.qa.pages.FindApartSearchResultPage;
import kcom.qa.pages.Homepage;
import kcom.qa.pages.Mykesightpage;
import kcom.qa.util.Screenshot;

public class FindApartSearchResultPageTest extends Testbase {

	// FindApartPage FindApartPage;
	FindApartSearchResultPage FindApartPage;

	public FindApartSearchResultPageTest() {
		super();

	}

	@BeforeMethod
	public void setup() {
		initialization();
		
		FindApartPage = new FindApartSearchResultPage();
	}

	@Test(priority = 1)
	public void validateALLwebelementsTest() throws InterruptedException {
		FindApartPage.Stratmethod();
		FindApartPage.validateALLwebelements();
		FindApartPage.returntofindapart();
	}

	@Test(priority = 2)
	public void validateSortingTest() throws InterruptedException {
		FindApartPage.Stratmethod();
		FindApartPage.validateSorting();
	}

	@Test(priority = 3)
	public void validatevewdropdownTest() throws InterruptedException {
		FindApartPage.Stratmethod();
		FindApartPage.validatevewdropdown();
	}

	@Test(priority = 4)
	public void validateAddtocartforUSTest() {
		FindApartPage.Stratmethod();
		FindApartPage.validateAddtocartforUS();
	}

	@Test(priority = 5)
	public void ADDtoCARTTEst() {
		FindApartPage.Stratmethod();
		FindApartPage.ADDtoCART();

	}

	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			Screenshot.takescreenshot(result.getName());
		}
		driver.quit();
	}
}
