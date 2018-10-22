package kcom.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kcom.qa.base.Testbase;
import kcom.qa.pages.Homepage;
import kcom.qa.pages.Login_errorpage;
import kcom.qa.pages.Mykesightpage;
import kcom.qa.util.Screenshot;

public class Login_errorpageTest extends Testbase {

	Login_errorpage Login_errorpage;

	public Login_errorpageTest() {

		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();
		
		Login_errorpage = new Login_errorpage();
	}

	@Test
	public void ValidateloginerrormsgTest() throws InterruptedException {
		Login_errorpage.Startmethod();
		boolean msg = Login_errorpage.Errorlogin();
		Assert.assertTrue(msg);

	}

	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			Screenshot.takescreenshot(result.getName());
		}
		driver.quit();
	}
}
