package kcom.CIA.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kcom.CIA.pages.Events_Section_homepage;
import kcom.qa.base.Testbase;
import kcom.qa.util.Screenshot;

public class Event_sectionTest extends Testbase {

	Events_Section_homepage Event_sectionTest;

	public Event_sectionTest() {
		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();

		Event_sectionTest = new Events_Section_homepage();

	}

	@Test
	public void Eventsectionvalidation() {
		Event_sectionTest.startMethod();
		Event_sectionTest.Eventsection();
	}

	@AfterMethod
	public void teardown(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			Screenshot.takescreenshot(result.getName());
		}
		driver.quit();
	}
}
