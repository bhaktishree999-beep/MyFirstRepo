package com.leads;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ObjectRepository.CreateContactPage;
import com.ObjectRepository.CreateLeadsPage;
import com.ObjectRepository.HomePage;
import com.ObjectRepository.LeadsPage;
import com.businessUtility.BaseClass;

public class TC003_CreateLeadsWithMandatoryField extends BaseClass {
	
	@Test
	public void tc003_CreateLeadsWithMandatoryField() throws IOException {
		
		        //expected result
				String ExpectedResult = "Lead_... ";
				
				//create object for utility class
//				FileUtility fileUtil = new FileUtility();
//				JavaUtility javaUtil = new JavaUtility();
//				WebDriverUtility webUtil = new WebDriverUtility();

				
				//random data
				String randomdata = javaUtil.generateRandomDate();
				
				//test data
				String LASTNAME = fileUtil.readDataFromPropertiesFile("lastname")+randomdata;
				String COMPANYNAME = fileUtil.readDataFromPropertiesFile("companyname");
				
				
				//create object for POM classes
				homepage = new HomePage(driver);
				leadspage = new LeadsPage(driver);
				createLeadsPage = new CreateLeadsPage(driver);
				
			
				//click on contacts module
				driver.findElement(By.name("Leads")).click();
				
				//click on create contact button
				driver.findElement(By.cssSelector("[title='Create Lead...']")).click();
				
				//enter data into last name text field
				driver.findElement(By.name("lastname")).sendKeys(LASTNAME);
				
				//enter company name into company name text field
				driver.findElement(By.name("company")).sendKeys(COMPANYNAME);
									
				//click on save button
				driver.findElement(By.name("button")).click();
				
				//capture actual result
				String actualresult = driver.findElement(By.id("Lead")).getText();
				
				//verify actual result with expected result
				Assert.assertEquals(actualresult, ExpectedResult);
			}
		}

