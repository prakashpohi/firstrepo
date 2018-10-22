package kcom.qa.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kcom.qa.base.Testbase;
import kcom.qa.pages.Homepage;
import kcom.qa.pages.Mykesightpage;
import kcom.qa.pages.Myprofilepage;
import kcom.qa.util.Screenshot;

public class MyprofilepageTest extends Testbase {
	Myprofilepage Myprofilepage;

	public MyprofilepageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException, IOException {
		initialization();
	
		Myprofilepage = new Myprofilepage();
		

	}

	
	
	// ******There is a bug for change password scenario*********
	// @Test(priority=6)
	// public void changepasswordTest() throws InterruptedException,
	// IOException{
	// Myprofilepage.changepassword();
	// }

	
	
	
	@Test(priority = 1)
	public void updateprofileTest() throws InterruptedException, IOException {
		Myprofilepage.Myprofilestart();
		
		Myprofilepage.updateprofile();
	}

	@Test(priority = 2)
	public void profilepageUITest() throws InterruptedException, IOException {
		Myprofilepage.Myprofilestart();
		Myprofilepage.profilepageUI();
	}

	@Test(priority = 3)
	public void ExpandANDpreferenceTest() throws InterruptedException, IOException {
		Myprofilepage.Myprofilestart();
		Myprofilepage.ExpandANDpreference();
	}

	@Test(priority = 4)
	public void validatepersonalinformationTest() throws InterruptedException, IOException {
		Myprofilepage.Myprofilestart();
		Myprofilepage.validatepersonalinformation();
	}

	@Test(priority = 5)
	public void validatecapabilityTest() throws InterruptedException {
		Myprofilepage.Myprofilestart();
		Myprofilepage.validatecapability();
	}

	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			Screenshot.takescreenshot(result.getName());
		}
		driver.quit();
	}
}
