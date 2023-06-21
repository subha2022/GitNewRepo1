package com.selenium.advance.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Dynamic_WebTable 
{

	public static void main(String[] args) 
	{
		// Set the System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		//Create object instance for chrome driver
		ChromeDriver driver = new ChromeDriver();
		//Store the Application url in the String Variable
		String url= "https://money.rediff.com/gainers/bsc/daily/groupa";
		String companyName="Action Construction";
		//Lunch the application
		driver.get(url);
		//Maximize the window
		driver.manage().window().maximize();

		//Step-1 Identify the table
		String tableXpath ="//*[@id=\"leftcontainer\"]/table";
		WebElement companyTable = driver.findElement(By.xpath(tableXpath));
		//Step-2 To locate the row of the table
		List <WebElement> rowsTable=companyTable.findElements(By.tagName("tr"));
		//Step-3 Find the total count of the row
		int rowsCount=rowsTable.size();
		//System.out.println("The total no of rows are:"+rowsCount);
		//Step-4 For loop - Loop will be executed till the last row of the table
		// Row = 0 : It starts from the 1st row
		//Labeling the loop
		outerloop:
			for(int row=0;row<rowsCount;row++)
			{
				// Step-5 To locate the column of the specified row
				List<WebElement> columnsTable = companyTable.findElements(By.tagName("td"));
				//Step-6 Find the total count of the row
				int columnsCount=columnsTable.size();
				//Step-7 Nested For Loop - Loop will be executed till the last  cell of the specified column of the table
				for(int column=0;column<columnsCount;column++)
				{
					//Step-8 Retrieve all the cell text
					String cellText = columnsTable.get(column).getText();
					//System.out.println(cellText);
					//Xpath of the row
					String startXpath="//*[@id=\"leftcontainer\"]/table/tbody/tr[";
					//Step-9 Retrieving the company details based on the company name
					if(cellText.equals(companyName) && cellText!=null)
					{
						//Company Name
						WebElement companyNameObj = driver.findElement(By.xpath(startXpath+(row+1)+"]/td[1]/a"));
						String companyNameVal=companyNameObj.getText();
						System.out.println("The Company name is:"+companyNameVal);
						//Group
						String groupval = driver.findElement(By.xpath(startXpath+(row+1)+"]/td[2]")).getText();
						System.out.println("The Group of the Company:"+groupval);
						//Previous Close Rs.
						String prvsClose = driver.findElement(By.xpath(startXpath+(row+1)+"]/td[3]")).getText();
						System.out.println("The Previous Close Rate of the Company:"+prvsClose);
						//Current Price Rs.
						String curntPice = driver.findElement(By.xpath(startXpath+(row+1)+"]/td[4]")).getText();
						System.out.println("The Current Price of the Company:"+curntPice);
						// % Change
						String perChange = driver.findElement(By.xpath(startXpath+(row+1)+"]/td[5]")).getText();
						System.out.println("The Percantage Change of the Company:"+perChange);

						break outerloop;
					}

				}

			}
		//Close the application
		driver.close();
		System.out.println("The application is closed.");

	}

}
