package com.NxtGenAI.TestCase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pack1.ExcelReader;

public class TestingParameterizationTestNGExcel {
	
  @Test(dataProvider = "getData")
  public void registerUser(String firstName, String lastName,String pinCode) {
	  System.out.println(firstName);
	  System.out.println(lastName);
	  System.out.println(pinCode);
  }
  
  @DataProvider
  public Object[][] getData()
  {
	  String excelPath="C:\\Users\\pabitra\\git\\GitNewRepo1\\Selenium\\TestData\\DataProvider.xlsx";
	  String sheetName="Register User";
	  
	  ExcelReader excel = new ExcelReader(excelPath,sheetName);
	 int rowCount = excel.getRowCount();
	 int colCount = excel.getColumnCount();
	  
	  Object [][] data = new Object[rowCount-1][colCount];
	  for(int row=1;row<rowCount;row++)
	  {
		  for(int col=0;col<colCount;col++) {
			 String cellData = excel.getCellData(row, col);
			 data[row-1][col]=cellData;
			  
		  }
	  }
	  
	  data[0][0]="Subha";
	  data[0][1]="Smita";
	  
	  data[1][0]="Madhu";
	  data[1][1]="Smita";
	  
	  data[2][0]="Raja";
	  data[2][1]="Smita";
	  
	  return data;
  }
  
}
