package kcom.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;

import kcom.qa.base.Testbase;
import kcom.qa.pages.Homepage;
import kcom.qa.pages.Mykesightpage;
import kcom.qa.util.Screenshot;

public class FindAPartTest extends Testbase{
	
	Mykesightpage Mykeysightpage;
	
	public FindAPartTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException, IOException {
		initialization();
		Homepage homepage = new Homepage();
		Mykeysightpage = homepage.clickonmykeysightlink();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
