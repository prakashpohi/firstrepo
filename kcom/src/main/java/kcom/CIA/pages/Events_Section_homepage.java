package kcom.CIA.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import kcom.qa.base.Testbase;

public class Events_Section_homepage extends Testbase {
	
	
	// *********PAGE FACTORY /OR ***************

		@FindBy(xpath = "//h2[contains(text(),'Upcoming Events')]")
		WebElement Upcoming_events;
		@FindBy(xpath = "//div[@class='video embed iframe']//b")
		WebElement events_video;
		@FindBy(xpath = "//a[contains(text(),'View All Events')]")
		WebElement viewallevent;
	
		
		
		//**********PAGE FACTORY INITIALILATION***************
		public Events_Section_homepage() {
		PageFactory.initElements(driver, this);
	}
	
		
	//*************ACTIONS *******************
		
		public void startMethod() {
			Prerequities();
		}
		
		public void Eventsection(){
			
			Assert.assertTrue(Upcoming_events.isDisplayed());
			Assert.assertTrue(events_video.isDisplayed());
			Assert.assertTrue(viewallevent.isDisplayed());
			viewallevent.click();
			driver.getTitle();
			//Assert.assertEquals("Technical Support: Electronic Measurement | Keysight (formerly Agilent’s Electronic Measurement)", driver.getTitle());
		}	
		
		
		
		
		

}
