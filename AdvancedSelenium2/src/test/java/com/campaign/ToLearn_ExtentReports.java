package com.campaign;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearn_ExtentReports {
	
	@Test
	public void test() {
		
		//create object for ExtentSparkReporter class
		ExtentSparkReporter spark = new ExtentSparkReporter("./reports/report.html");
		
		//create object for ExtentReports class
		ExtentReports reports = new ExtentReports();
		
		//call attachReporter() and pass spark reference
		reports.attachReporter(spark);
		
		//call createTest() and store it
		ExtentTest test = reports.createTest("Sample Test Report");
		
		//printing statement
		Reporter.log("Testcase Executed",true);
		Assert.assertEquals("abc","abc");
		
		//call log and pass arguments
	 	test.log(Status.PASS, "Test case pass");
	//  test.log(Status.FAIL, "Test case failed");
	//  test.log(Status.SKIP, "Test case skipped");
		
		//save the report
		reports.flush();
	}

}
