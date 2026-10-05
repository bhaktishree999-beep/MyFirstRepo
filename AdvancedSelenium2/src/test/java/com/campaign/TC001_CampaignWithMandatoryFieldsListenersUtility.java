package com.campaign;

import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.GenericUtility.RetryAnalyzer;
import com.businessUtility.BaseClass;

@Listeners(com.GenericUtility.ListenerUtility.class)

public class TC001_CampaignWithMandatoryFieldsListenersUtility extends BaseClass {
	
	@Test (retryAnalyzer = RetryAnalyzer.class)
	
	public void test() {
		
		String ExpectedResult = "Title Page";
		
		Reporter.log("Test case executing...",true);
		Assert.assertEquals("abc", "abc");
		Reporter.log("Test case Executed...",true);
		
//		driver.getTitle();
//		String ActualResult = driver.getTitle();
//		Assert.assertEquals(ActualResult, ExpectedResult);
	}

}
