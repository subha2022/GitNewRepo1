package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XL_Test_Qegde {
	public static void main(String[] args) throws IOException{
		
	
	/*FileInputStream fi = new FileInputStream("E:\\testData.xlsx") ;
	//System.out.println("Code is executed");
	Workbook wb = new XSSFWorkbook(fi);
	wb.createSheet("DemoSheet"); //how to create a sheet
	
	FileOutputStream fo = new FileOutputStream("E:\\testData.xlsx");
	wb.write(fo);
	wb.close();*/
	
	//Getting Row and Column count
	/*FileInputStream fi = new FileInputStream("E:\\testData.xlsx");
	Workbook wb = new XSSFWorkbook(fi);
	
	Sheet ws = wb.getSheet("Login"); //how to access a existing sheet
	int rowCount = ws.getLastRowNum(); //how to count rows in a sheet-wroksheetobj+getLastRowNum();
	System.out.println(rowCount);
	
	Row row1 = ws.getRow(0);
	Row row2 = ws.getRow(1);
	
	short row1ColuCount = row1.getLastCellNum(); //how to count column in a sheet-rowobj+getLastCellNum();
	short row2ColuCount = row2.getLastCellNum();
	System.out.println(row1ColuCount);
	System.out.println(row2ColuCount);
	wb.close();*/
		
	// Getting the cell data from excel
		
	/*	FileInputStream fi = new FileInputStream("E:\\testData.xlsx");
		Workbook wb =new XSSFWorkbook(fi);
		Sheet ws = wb.getSheet("EmpData");
		int rowCount = ws.getLastRowNum();
		for(int i=1;i<=rowCount;i++)
		{
			Row row1 = ws.getRow(i);
			Cell c1,c2,c3,c4;
			c1=row1.getCell(0);
			c2=row1.getCell(1);
			c3=row1.getCell(2);
			c4=row1.getCell(3);
			String empno = c1.getStringCellValue();
			String empName = c2.getStringCellValue();
			double salary = c3.getNumericCellValue();
			boolean status = c4.getBooleanCellValue();
			System.out.println(empno+"  "+empName+" "+salary+" "+status+" ");
		}
		
		wb.close();*/
		
		//Handle NUll Point Exception that occurs when no data present in excel cell
		
	/*	FileInputStream fi = new FileInputStream("E:\\testData.xlsx");
		Workbook wb = new XSSFWorkbook(fi);
		Sheet ws = wb.getSheet("Login");
		Row row = ws.getRow(1);
		try {
			Cell c = row.getCell(2);
			String data = c.getStringCellValue();
			System.out.println(data);
			
		} catch (Exception e) {
			System.out.println("No Data Found!");
		}
		wb.close();*/
		
		//Write Data in Excel sheet Cell
		
		FileInputStream fi = new FileInputStream("E:\\testData.xlsx");
		Workbook wb = new XSSFWorkbook(fi);
		Sheet ws = wb.getSheet("Login");
		Row r = ws.getRow(1);
		Cell c = r.createCell(2);
		c.setCellValue("Pass");
		
		FileOutputStream fo = new FileOutputStream("E:\\testData.xlsx");
		wb.write(fo);
		
		wb.close();
		
	}

}
