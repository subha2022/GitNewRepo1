package com.seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelingDynamicWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://money.rediff.com/gainers/bse/daily/groupa";
		String compname ="Raymond Ltd";
		driver.get(url);
		driver.manage().window().maximize();

		// Identify the table
		WebElement companyTable =driver.findElement(By.xpath("//table[contains(@class,'dataTable')]"));

		// To locate the row of the table
		List<WebElement>rowTable= companyTable.findElements(By.tagName("tr"));

		// Find the total count of row
		int rowCount = rowTable.size();
		//System.out.println(rowCount);

		// for loop = it will execute till the last row of the table
		outerloop:
		for(int row=0;row<rowCount;row++)
		{
			//To locate the columns of the specified row
			List<WebElement>columnRow=rowTable.get(row).findElements(By.tagName("td"));

			//Find the total count of the column
			int columnCount=columnRow.size();
			//System.out.println(columnCount);

			// Nested For Loop= Loop will be executed till the last column of the table
			for(int col=0;col<columnCount;col++)
			{
				//To retrieve all the cell text
				String cellText = columnRow.get(col).getText();
				//System.out.println(cellText);
				//Retrieving the company details based on the company name
				if(cellText.equals(compname))
				{
					//Company name
					WebElement companyNameValue=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+row+"]/td[1]/a"));
					String companyName=companyNameValue.getText();
					System.out.println(companyName);
					//Group Name
					String groupName= driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+row+"]/td[2]")).getText();
					System.out.println(groupName);
					// click on the company name
					companyNameValue.click();
					
					break outerloop;
				}

			}
		
		
		}

		driver.close();

	}

}
