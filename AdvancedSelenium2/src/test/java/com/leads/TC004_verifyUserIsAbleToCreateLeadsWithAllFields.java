package com.leads;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.GenericUtility.FileUtility;
import com.GenericUtility.JavaUtility;
import com.GenericUtility.WebDriverUtility;
import com.ObjectRepository.LoginPage;

public class TC004_verifyUserIsAbleToCreateLeadsWithAllFields {
	
	    //driver initialization
		WebDriver driver = null;
		
		@BeforeSuite
		public void beforesuite() {
			Reporter.log("BeforeSuite - Database Connectivity established", true);
		}
		@AfterSuite
		public void afterSuite() {
			Reporter.log("AfterSuite - Database Connectivity terminated",true);
		}
		@BeforeTest
		public void beforetest() {
			Reporter.log("BeforeTest - report starts",true);
		}
		@AfterTest
		public void aftertest() {
			Reporter.log("AfterTest - report backup",true);	
		}
		@BeforeClass
		public void beforeclass() {
			Reporter.log("BeforeClass -launch browser",true);

			//create object for chrome driver class
		    driver=new ChromeDriver();

			//maximize browser
			driver.manage().window().maximize();
			
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
		@AfterClass
		public void afterclass() {
			Reporter.log("AfterClass - close browser",true);
			
			//close browser
			driver.quit();
		}
		@BeforeMethod
		public void beforemethod() throws IOException, InterruptedException {
			//print
			Reporter.log("BeforeMethod - login to application",true);
			//create object for utility class
			FileUtility fileUtil = new FileUtility();
			
			//read data from the properties file
			String URL = fileUtil.readDataFromPropertiesFile("url");
			String USERNAME = fileUtil.readDataFromPropertiesFile("username");
			String PASSWORD = fileUtil.readDataFromPropertiesFile("password");
			
			//navigate to url
			driver.get(URL);
			
			Thread.sleep(2000);	
			
			//create object for POM class
			LoginPage loginpage = new LoginPage(driver);	
			loginpage.login(USERNAME, PASSWORD);	
		}
			@AfterMethod
			public void aftermethod() {
			Reporter.log("AfterMethod - logout to application",true);
		}
	
			@Test
			public void test() throws InterruptedException, IOException {
				//print
				Reporter.log("Test - testcase executed",true);
}
}
		
		
//				//create object FileInputStream class from java
//				//fetching the file
//				FileInputStream fis = new FileInputStream("./src/test/resources/commondata.properties");
//				
//				//Create object for file type class (Properties)
//				//open the file
//				Properties prop = new Properties();
//				
//				//load the data into the test script
//				prop.load(fis);
//				
//				//read data from the loaded file
//				String URL = prop.getProperty("url");
//				String USERNAME = prop.getProperty("username");
//				String PASSWORD = prop.getProperty("password");
				
		
				//create object for utility class
//				FileUtility fileUtil = new FileUtility();
//				JavaUtility javaUtil = new JavaUtility();
//		
//				//read data from the properties file
//				String URL = fileUtil.readDataFromPropertiesFile("url");
//				String USERNAME = fileUtil.readDataFromPropertiesFile("username");
//				String PASSWORD = fileUtil.readDataFromPropertiesFile("password");
//				
//				
//				
//		        Reporter.log(URL,true);
//		        Reporter.log(USERNAME,true);
//		        Reporter.log(PASSWORD,true);
//		
//		//create object for chromedriver class
//		WebDriver driver=new ChromeDriver();
//		
//		
//		
//		
//		//maximize the browser
//	    //driver.manage().window().maximize();
//		WebDriverUtility webUtil = new WebDriverUtility();
//		webUtil.toMaximize(driver);
//		
//		
//		
//		
//		//hard wait
//		Thread.sleep(2000);
//		
//		//navigate to url
//	    driver.get(URL);
//				
//		Thread.sleep(2000);

		//create object for POM class
		//LoginPage loginpage = new LoginPage(driver);
//		//loginpage.getUsernameTextField.sendkeys(USERNAME);
//		//loginpage.getPasswordTextField.sendkeys(PASSWORD);
//		//loginpage.getLoginButton.click();
//
//		//driver.findElement(By.name("username").sendkeys("USERNAME"));
//		//driver.findElement(By.name("username").sendkeys("USERNAME"));
//		//driver.findElement(By.name("username").sendkeys("USERNAME"));

//		loginpage.login(USERNAME, PASSWORD);
				
//		//enter username into username textfield
//		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//				
//		Thread.sleep(2000);
//				
//		//enter password into password textfield
//		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//				
//		Thread.sleep(2000);
//				
//		//click on login button
//		driver.findElement(By.id("submitButton")).click();
//				
//		Thread.sleep(2000);
//				
//		//click on leads option
//		driver.findElement(By.linkText("Leads")).click();
//				
//		Thread.sleep(2000);
//				
//		//click on  create leads button
//		driver.findElement(By.cssSelector("[title='Create Lead...']")).click();
//				
//		Thread.sleep(2000);
//		
//		//identify and store check button
//		WebElement element = driver.findElement(By.xpath("//select[@name='salutationtype']")); 		
//		//create object for select class and pass the web element into the constructor
//		Select sc = new Select(element);		
//		Thread.sleep(2000);		
//		//select the option from the list using index
//		sc.selectByIndex(3);
//		
//		Thread.sleep(2000);
//		
//		//enter First name into First name text field
//		driver.findElement(By.name("firstname")).sendKeys("Bhaktishree");
//		
//		Thread.sleep(2000);
//		
//		//enter last name into last name text field
//		driver.findElement(By.name("lastname")).sendKeys("Biswal");
//		
//		Thread.sleep(2000);
//		
//		//enter company name into company name text field
//		driver.findElement(By.name("company")).sendKeys("TCS");
//		
//		Thread.sleep(2000);
//		
//		//enter title into title textfield
//		driver.findElement(By.name("designation")).sendKeys("Software Engineer");
//		
//		Thread.sleep(2000);
//				
//		//click on save button
//		driver.findElement(By.name("button")).click();
				
		
		
		
		
		
			