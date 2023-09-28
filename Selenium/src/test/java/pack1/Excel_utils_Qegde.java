package pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_utils_Qegde {

	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static Workbook wb;
	public static Sheet ws;
	public static Row row;
	public static Cell cell;
	
	public static  int getRowCount(String xlFile , String xlSheet) throws IOException
	{
		fi = new FileInputStream(xlFile);
		wb = new XSSFWorkbook(fi);
		ws=wb.getSheet(xlSheet);
		int rowcount=ws.getLastRowNum();
		wb.close();
		return rowcount;
	}
	public static short getColumnCount(String xlFile, String xlSheet, int rowNum) throws IOException
	{
		fi= new FileInputStream(xlFile);
		wb= new XSSFWorkbook(fi);
		ws= wb.getSheet(xlSheet);
		row=ws.getRow(rowNum);
		short colCount=row.getLastCellNum();
		wb.close();
		return colCount;
	}
	
	public static String getCellData(String xlFile, String xlSheet, int rowNum, int colNum) throws IOException 
	{
		fi= new FileInputStream(xlFile);
		wb= new XSSFWorkbook(fi);
		ws= wb.getSheet(xlSheet);
		row=ws.getRow(rowNum);
		
		String data;
		try {
			cell=row.getCell(colNum);
			data=cell.getStringCellValue();
		} catch (Exception e) {
			data = "";
		}
		wb.close();
		return data;
	}
	public static void setCellData(String xlFile, String xlSheet,int rowNum, int colNum,String data) throws IOException
	{
		fi= new FileInputStream(xlFile);
		wb= new XSSFWorkbook(fi);
		ws= wb.getSheet(xlSheet);
		row=ws.getRow(rowNum);
		cell= row.createCell(colNum);
		cell.setCellValue(data);
		fo = new FileOutputStream(xlFile);
		wb.write(fo);
		wb.close();
	}
	
}
