package pack1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class Excel_Utility_File {
	//All the test data needs to be given in to the String Format in the Excel Sheet.infront of the any number u have to put '12345

	//HSSFWorkbook------->xls
	static XSSFWorkbook workBook;
	static XSSFSheet sheet;

	public Excel_Utility_File(String excelPath,String sheetName)
	{
		try {
			workBook = new XSSFWorkbook(excelPath);
			sheet =workBook.getSheet(sheetName);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Get Row count
	public int getRowCount()
	{
		int rowCount=0;
		try {
			rowCount=sheet.getPhysicalNumberOfRows();
		//	System.out.println("Total no of row= "+rowCount);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

		return rowCount;
	}
	
	//get the cell Data
	public String getCellData(int row, int col)
	{
		String cellData=null;
		try {
		cellData=sheet.getRow(row).getCell(col).getStringCellValue();
		//System.out.println("Total call Data = "+cellData);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return cellData;
		
	}

	/*public static void main(String[] args) {
		//Use Constructor Concept
		Excel_Utility_File excel = new Excel_Utility_File("C:\\Users\\pabitra\\git\\GitNewRepo1\\Selenium\\TestData\\RegisterDemoTestData.xlsx", "RegisterUser");
		//Call the Method
		//excel.getRowCount();
		//excel.getCellData(2, 2);
		
		int rowCount = excel.getRowCount();
		for(int row=1;row<rowCount;row++) {
			String url = excel.getCellData(row, 0);
			String title = excel.getCellData(row, 1);
			String firstName = excel.getCellData(row, 2);
			
			System.out.println(url);
			System.out.println(title);
			System.out.println(firstName);
		}
	}*/
}


