package com.campaign;

import java.time.LocalDateTime;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearn_LocalDateTime {
	
	@Test
	public void test() {
		
		LocalDateTime localdatetime = LocalDateTime.now();
		System.out.println(localdatetime);
		System.out.println("time is:" + localdatetime+".......");
		String ref = "time is:" + localdatetime+".......";
		String time = localdatetime.toString();
		Reporter.log(time,true);
		String timestamp = time.replace(",", "_");
		Reporter.log(timestamp,true);
		
		String timeStamp = timeStamp();
		Reporter.log(timestamp,true);
	}

	public String timeStamp() {
		String time = LocalDateTime.now().toString().replace(":", "_");
		return time;
	}
}
