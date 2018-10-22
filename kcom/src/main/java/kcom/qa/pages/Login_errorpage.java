package kcom.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kcom.qa.base.Testbase;

public class Login_errorpage extends Testbase{

	
	
	@FindBy(xpath="//input[@id='username']")
	WebElement usernamefield;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement passwordfield;
	@FindBy(xpath="//input[@id='loginbtn']")
	WebElement loginbtn;
	
	@FindBy(xpath="//td[@style='color:#ed5e1a;']")
	WebElement loginerrormessage;
	
	
	
	
	public Login_errorpage() {
		super();
		PageFactory.initElements(driver, this);

	}
	
	
	public void Startmethod() throws InterruptedException {
		Prerequities();
		Homepage homepage = new Homepage();
		
		Login_errorpage Login_errorpage = homepage.Validateloginerrormsg();

	}
	
	public boolean Errorlogin() {
		

		loginbtn.click();
		boolean message = loginerrormessage.isDisplayed();
		return message;
	}
	
	
	public static void Relogin(){
		driver.findElement(By.xpath("//a[contains(text(),'Log back in')]")).click();
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@id='loginbtn']")).click();
	}
}
