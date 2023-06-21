package com.selenium.advance.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Banking_Dynamic_WebTable 
{

	public static void main(String[] args) throws InterruptedException
	{
		// Set the System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		//Create object instance for chrome driver
		ChromeDriver driver = new ChromeDriver();
		//Store the Application url in the String Variable
		String url= "https://business.alinma.com/cb/servlet/cb/jsp-ns/demo/en/landing.jsp?cu=bpayments/multipaybill-wait.jsp&module=bpayments";
		String AccNum="100003924";
		//Lunch the application
		driver.get(url);
		//Maximize the window
		driver.manage().window().maximize();

		//Step-1 Identify the Table
		String tableXapth="/html/body/div[3]/table[1]/tbody/tr[4]/td[4]/table[3]/tbody/tr[1]/td/table/tbody/tr/td[2]/table/tbody/tr[8]/td/table[1]/tbody/tr[7]/td/table/tbody";
		WebElement companyTable = driver.findElement(By.xpath(tableXapth));
		//Step-2 To locate the row of the table
		List<WebElement> rowsTable = companyTable.findElements(By.tagName("tr"));
		//Step-3 Find the total count of the rows
		int rowsCount=rowsTable.size();
		//System.out.println(rowsCount);
		//System.out.println("The total no of rows are:"+rowsCount);
		//Step-4 For loop - Loop will be executed till the last row of the table
		// Row = 0 : It starts from the 1st row
		//Labeling the loop
		outerloop:
			for(int row=0;row<rowsCount;row++)
			{
				// Step-5 To locate the column of the specified row
				List<WebElement> columnsTable = companyTable.findElements(By.tagName("td"));
				//Step-6 Find the total count of the cloumns
				int columnsCount=columnsTable.size();
				//Step-7 Nested For Loop -Loop will be executed till the last column of the table
				for(int col=0;col<columnsCount;col++)
				{
					//Step-8 Retrive all the cell text from column 
					String cellText = columnsTable.get(col).getText();
					//System.out.println(cellText);
					//Xpath of the row
					String startXpath="/html/body/div[3]/table[1]/tbody/tr[4]/td[4]/table[3]/tbody/tr[1]/td/table/tbody/tr/td[2]/table/tbody/tr[8]/td/table[1]/tbody/tr[7]/td/table/tbody/tr[5";
					String amtVal="500";
					//Step-9 Retrieving the company details based on the account number
					if(cellText.equals(AccNum))
					{

						//Company Name
						WebElement companyName = driver.findElement(By.xpath(startXpath+"]/td[2]"));
						String companyNameVal=companyName.getText();
						System.out.println("The Name of the company is:"+companyNameVal);
						//Nick Name
						String nickName=driver.findElement(By.xpath(startXpath+"]/td[3]")).getText();
						System.out.println("The Nick Name is:"+nickName);
						//Account Number
						String accNum=driver.findElement(By.xpath(startXpath+"]/td[5]")).getText();
						System.out.println("The Account Number is:"+accNum);
						//Click on the check Box
						WebElement checkBox = driver.findElement(By.id("checkBoxPayment3"));
						checkBox.click();
						System.out.println("002 - Saudi Electric Company is selected");
						//Amount 
						WebElement amount = driver.findElement(By.xpath(startXpath+"]/td[4]"));
						Actions act= new Actions(driver);
						Thread.sleep(3000);
						act.moveToElement(amount).click().keyDown(Keys.CONTROL).
						sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).sendKeys(amtVal).perform();;
						Thread.sleep(3000);
						driver.findElement(By.name("ADDPAYEE")).click();
						Thread.sleep(3000);
						System.out.println("The Amount is:"+amtVal);
						//Status
						String status=driver.findElement(By.xpath(startXpath+"]/td[6]")).getText();
						System.out.println("The Status is:"+status);
						//Date of Bill	
						String dateOfBill=driver.findElement(By.xpath(startXpath+"]/td[7]")).getText();
						System.out.println("The Date of the Bill is:"+dateOfBill);

						break outerloop;
					}
				}

			}

		//Close the application
		driver.close();
		System.out.println("Application is closed.");
	}

}
