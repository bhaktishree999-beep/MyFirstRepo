package com.campaign;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ObjectRepository.CampaignPage;
import com.ObjectRepository.CreateCampaignPage;
import com.ObjectRepository.HomePage;
import com.businessUtility.BaseClass;

public class TC001_CreateCampaignWithMandatoryFields extends BaseClass {
	
	@Test
	public void tC001_CreateCampaignWithMandatoryFields() throws IOException {
		//expected result
		String ExpectedResult = "Camp_01... ";
		
		//create object for utility class
//		FileUtility fileUtil = new FileUtility();
//		JavaUtility javaUtil = new JavaUtility();
//		WebDriverUtility webUtil = new WebDriverUtility();

		
		//random data
		String randomdata = javaUtil.generateRandomDate();
		
		//test data
		String CAMPAIGNNAME = fileUtil.readDataFromPropertiesFile("campaignname")+randomdata;
		String EXPECTEDCLOSINGDATE = fileUtil.readDataFromPropertiesFile("expectedclosingdate");
		
		
		//create object for POM classes
		homepage = new HomePage(driver);
		campaignpage = new CampaignPage(driver);
		createCampaignPage = new CreateCampaignPage(driver);
		
	
		//click on campaigns module
		driver.findElement(By.name("Campaigns")).click();
		
		//click on create campaign button
		driver.findElement(By.cssSelector("[title='Create Campaign...']")).click();
		
		//enter data into campaign name text field
		driver.findElement(By.name("campaignname")).sendKeys(CAMPAIGNNAME);
		
		//enter data into expected closing date
		driver.findElement(By.id("jscal_field_closingdate")).sendKeys(EXPECTEDCLOSINGDATE);
		
		//click on save button
		driver.findElement(By.name("button")).click();
		
		//capture actual result
		String actualresult = driver.findElement(By.id("Camp_01")).getText();
		
		//verify actual result with expected result
		Assert.assertEquals(actualresult, ExpectedResult);
	}
}
