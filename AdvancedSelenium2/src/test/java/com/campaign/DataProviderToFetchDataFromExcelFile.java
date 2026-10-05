package com.campaign;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderToFetchDataFromExcelFile {
	
	@DataProvider
	public String[][] dataprovider(){
		
		String data[][] = {{"admin1","admin@1"},{"admin2","admin@2"},{"admin3","admin@3"}};
		
		return data;
	}
		@Test (dataProvider = "dataprovider")
		public void test() throws EncryptedDocumentException, IOException {
			
			FileInputStream fis = new FileInputStream("./src/test/resources/dataprovidertestdata.xlsx");
			
			Workbook wb = WorkbookFactory.create(fis);
			
			Sheet sheet = wb.getSheet("Sheet1");
			
			int lastrownum = sheet.getLastRowNum();
			short lastcellnum = sheet.getRow(0).getLastCellNum();
						
			for (int i = 1; i<=lastrownum; i++) {
				
				for(int j=0;j<lastcellnum;j++) {
					
					String value = sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.println(value);
		}
			
	}}}
	
	
	
	
	

		
