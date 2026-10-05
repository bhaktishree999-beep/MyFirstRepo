package com.contacts;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ObjectRepository.ContactPage;
import com.ObjectRepository.CreateContactPage;
import com.ObjectRepository.HomePage;
import com.businessUtility.BaseClass;

public class TC005_CreateContactsWithMandatoryField extends BaseClass {
	
	@Test
	public void tc005_CreateContactsWithMandatoryField() throws IOException {
		
		        //expected result
				String ExpectedResult = "Cont_... ";
				
				//create object for utility class
//				FileUtility fileUtil = new FileUtility();
//				JavaUtility javaUtil = new JavaUtility();
//				WebDriverUtility webUtil = new WebDriverUtility();

				
				//random data
				String randomdata = javaUtil.generateRandomDate();
				
				//test data
				String LASTNAME = fileUtil.readDataFromPropertiesFile("lastname")+randomdata;
				
				
				//create object for POM classes
				homepage = new HomePage(driver);
				contactPage = new ContactPage(driver);
				createContactPage = new CreateContactPage(driver);
				
			
				//click on contacts module
				driver.findElement(By.name("Contacts")).click();
				
				//click on create contact button
				driver.findElement(By.cssSelector("[title='Create Contact...']")).click();
				
				//enter data into last name text field
				driver.findElement(By.name("lastname")).sendKeys(LASTNAME);
									
				//click on save button
				driver.findElement(By.name("button")).click();
				
				//capture actual result
				String actualresult = driver.findElement(By.id("Cont")).getText();
				
				//verify actual result with expected result
				Assert.assertEquals(actualresult, ExpectedResult);
			}
		}

	