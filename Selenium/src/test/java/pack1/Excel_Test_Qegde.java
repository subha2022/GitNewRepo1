package pack1;

import java.io.IOException;

public class Excel_Test_Qegde {

	public static void main(String[] args) throws IOException 
	{
		//int x = Excel_utils.getRowCount("E:\\testData.xlsx", "Login");

		//short x=Excel_utils.getColumnCount("E:\\testData.xlsx", "Login",0);

		//String x=Excel_utils_Qegde.getCellData("E:\\testData.xlsx", "Login", 0, 1);
		//System.out.println(x);
		
		Excel_utils_Qegde.setCellData("E:\\testData.xlsx", "Login", 2, 2, "fail");



	}

}
