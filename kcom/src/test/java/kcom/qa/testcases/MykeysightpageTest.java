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

public class MykeysightpageTest extends Testbase {

	Mykesightpage Mykeysightpage;

	public MykeysightpageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		Mykeysightpage = new Mykesightpage();
	}

	@Test(priority = 1)
	public void MyKeysightUItest() throws InterruptedException {
		Mykeysightpage.MyKeysightstart();
		Mykeysightpage.statictext();
		Mykeysightpage.statictext2();
		boolean flag3 = Mykeysightpage.validatefindbutton();
		Assert.assertTrue(flag3);
		Mykeysightpage.validatetextbox();
		Mykeysightpage.validatedropdown1();
		Mykeysightpage.validatepagetitle();
		Mykeysightpage.validateexpertlink();
		Mykeysightpage.validatewelcomebackmsg();

	}
	
	@Test(priority = 3)
	public void loginTest() throws InterruptedException {
		Mykeysightpage.MyKeysightstart();
		Mykeysightpage.login();
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void errormsgforinvalidPOandORDERnumTest() {
		Mykeysightpage.MyKeysightstart();
		Mykeysightpage.errormsgforinvalidPOandORDERnum();

	}



	@Test(priority = 4)
	public void clikonhelpbtnTest() throws InterruptedException {
		Mykeysightpage.MyKeysightstart();
		String title = Mykeysightpage.clikonhelpbtn();
		System.out.println(title);
		Assert.assertEquals(title,
				"Order Status Frequently Asked Questions | Keysight (formerly Agilent’s Electronic Measurement)");
	}
	
	



	@Test(priority = 5)
	public void validationofproductcolumnTest() {
		Mykeysightpage.MyKeysightstart();
		Mykeysightpage.validationofproductcolumn();
	}

	// *******************FIND A PART TEST CASES *****************

	@Test(priority = 6)
	public void validationfor2charTest() throws InterruptedException {
		Mykeysightpage.MyKeysightstart();
		Mykeysightpage.validationfor2char();

	}

	@Test(priority = 7)
	public void wrongpartnumTest() {
		Mykeysightpage.MyKeysightstart();
		Mykeysightpage.wrongpartnum();
	}

	@Test(priority = 8)
	public void clickonadvancefindapartTest() {
		Mykeysightpage.MyKeysightstart();
		Mykeysightpage.clickonadvancefindapart();
	}

	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			Screenshot.takescreenshot(result.getName());
		}
		driver.quit();
	}

}
