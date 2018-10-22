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

public class MynewsTest extends Testbase {
	Mykesightpage Mykeysightpage;

	public MynewsTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException, IOException {
		initialization();
		Mykeysightpage = new Mykesightpage();

	}

	@Test(priority = 1)
	public void mynewsportletTest() throws InterruptedException {
		Mykeysightpage.Mynewsstart();
		Mykeysightpage.Mynewsportletloggedin();
	}

	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			Screenshot.takescreenshot(result.getName());
		}
		driver.quit();
	}
}
