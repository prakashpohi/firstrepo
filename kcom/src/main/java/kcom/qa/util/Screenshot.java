package kcom.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import kcom.qa.base.Testbase;

public class Screenshot extends Testbase {

	public static void takescreenshot(String name) throws IOException {

		TakesScreenshot scrsht = ((TakesScreenshot) driver);
		File srcfile = scrsht.getScreenshotAs(OutputType.FILE);

		File destfile = new File("D:\\Failedcases/" + name + ".png");
		FileUtils.copyFile(srcfile, destfile);
	}

}


