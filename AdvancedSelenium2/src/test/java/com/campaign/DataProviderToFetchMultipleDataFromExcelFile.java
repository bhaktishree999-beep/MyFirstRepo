package com.campaign;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderToFetchMultipleDataFromExcelFile {
	
	@DataProvider
	public Object[][] dataprovider() throws EncryptedDocumentException, IOException{
		
		FileInputStream fis = new FileInputStream("./src/test/resources/dataprovidertestdata.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("Sheet1");
		
		int lastrownum = sheet.getLastRowNum();
		short lastcellnum = sheet.getRow(0).getLastCellNum();
		
		Object[][] objarr = new Object[lastrownum][lastcellnum];
		
		for (int i = 1; i<=lastrownum; i++) {
			
			for(int j=0;j<lastcellnum;j++) {
				
				objarr[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				
			}
				
		}
			return objarr;
	}
	
      @Test (dataProvider = "dataprovider")
      public void test(String username, String password) {
	
    	 Reporter.log(username, true);
    	 Reporter.log(password, true);
			
      }
}

		
