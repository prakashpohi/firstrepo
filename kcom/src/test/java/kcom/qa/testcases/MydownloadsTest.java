package kcom.qa.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kcom.qa.base.Testbase;
import kcom.qa.pages.Homepage;
import kcom.qa.pages.Mykesightpage;
import kcom.qa.util.Screenshot;

public class MydownloadsTest extends Testbase {

	Mykesightpage Mykeysightpage;

	public MydownloadsTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		
		Mykeysightpage = new Mykesightpage();
	}

	@Test(priority = 1)
	public void mydownloadhistoryTest() throws InterruptedException {
		Mykeysightpage.Mydownloadstart();
		Thread.sleep(3000);
		Mykeysightpage.mydownloadhistory();

	}

	@Test(priority = 2)
	public void ValidateMyDownloadTest() throws InterruptedException {
		Mykeysightpage.Mydownloadstart();
		Mykeysightpage.login();
		Mykeysightpage.clickonmydownloadlink();
	}

	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			Screenshot.takescreenshot(result.getName());
		}
		driver.quit();
	}
}