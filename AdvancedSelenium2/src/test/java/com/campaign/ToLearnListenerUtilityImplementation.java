package com.campaign;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.GenericUtility.ListenerUtility.class)

public class ToLearnListenerUtilityImplementation {
	
	@Test
	public void test() throws IOException {
		
		Reporter.log("Testcase Executed - Line 1",true);
		Reporter.log("Testcase Executed - Line 2",true);
		Reporter.log("Testcase Executed - Line 3",true);
	//  Assert.assertEquals("abc", "acc");
		Reporter.log("Testcase Executed - Line 4",true);
		Reporter.log("Testcase Executed - Line 5",true);
		
		
		//create object for chrome driver class
		WebDriver driver = new ChromeDriver();
		
		//typecast driver reference into TakesScreenshot reference
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//call getScreenshotAs() and pass OutputType argument, store it
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		String time = LocalDateTime.now().toString().replace(":", "_");
		
		//create destinstion file path, create object for file class
		File dest = new File("./errorshots/img.png");
		
		//copy temp into dest
		FileHandler.copy(temp, dest);
		
	}
}
