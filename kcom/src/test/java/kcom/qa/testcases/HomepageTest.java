package kcom.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kcom.qa.base.Testbase;
import kcom.qa.pages.Homepage;
import kcom.qa.util.Screenshot;

public class HomepageTest extends Testbase {

	Homepage homepage;

	public HomepageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();

		homepage = new Homepage();
	}
	

	@Test
	public void LoginandLogoutfromHomepageTest() throws InterruptedException {
		homepage.startmethod();
		
		homepage.homepagelogin();
		homepage.navigatetoMyprofile();
		driver.findElement(By.xpath("//a[@id='pt1:g1l1_3']")).click();
		homepage.LogoutfromHomepage();
	}
	


	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			Screenshot.takescreenshot(result.getName());
		}
		driver.quit();
	}

}