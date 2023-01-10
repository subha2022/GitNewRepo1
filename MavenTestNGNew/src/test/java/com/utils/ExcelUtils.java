package com.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils
{
	static String projectPath;
	static XSSFWorkbook workBook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath,String sheetName)
	{
		try {
			
			workBook = new XSSFWorkbook(excelPath);
			sheet = workBook.getSheet(sheetName);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}


	public static void main(String[]args)
	{
		//getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}
	public static void getRowCount() 
	{
		try {
			int rowCounts=sheet.getPhysicalNumberOfRows();
			System.out.println("No of row counts:"+rowCounts);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}
	public static void getCellDataString(int rowNum, int colNum)
	{
		try {
			String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public static void getCellDataNumber(int rowNum, int colNum)
	{
		try {
			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

}
