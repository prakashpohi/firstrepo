package kcom.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kcom.qa.base.Testbase;
import kcom.qa.pages.Homepage;
import kcom.qa.pages.Mykesightpage;
import kcom.qa.util.Screenshot;

public class MyKPortalTest extends Testbase {
	Mykesightpage Mykeysightpage;

	public MyKPortalTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException, IOException {
		initialization();
		Mykeysightpage = new Mykesightpage();
	}

	@Test(priority = 1)
	public void ValidateproductpageTest() throws InterruptedException {
		Mykeysightpage.MyKportalstart();
		Mykeysightpage.Validateproductpage();
	}

	@Test(priority = 2)
	public void watchlistloggedinviewTest() throws InterruptedException {
		Mykeysightpage.MyKportalstart();
		Mykeysightpage.watchlistloggedinview();

	}

	@Test(priority = 3)
	public void watchlistloggedoutviewTest() throws InterruptedException {
		Mykeysightpage.MyKportalstart();
		Mykeysightpage.watchlistloggedoutview();
	}

	@Test(priority = 4)
	public void watchlistpublicviewTest() throws InterruptedException {
		Mykeysightpage.MyKportalstart();
		Mykeysightpage.watchlistpublicview();
	}

	@Test(priority = 5)
	public void MYKPUBLICviewTest() {
		Mykeysightpage.MyKportalstart();
		Mykeysightpage.MYKPUBLICview();
	}

	@Test(priority = 7)
	public void MYKRememberedviewTest() throws InterruptedException {
		Mykeysightpage.MyKportalstart();
		Mykeysightpage.MYKRememberedview();
	}

	@Test(priority = 6)
	public void MYKloggedinviewTest() throws InterruptedException {
		Mykeysightpage.MyKportalstart();
		Mykeysightpage.MYKloggedinview();
	}

	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			Screenshot.takescreenshot(result.getName());
		}
		driver.quit();
	}
}
