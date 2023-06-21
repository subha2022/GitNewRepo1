package com.selenium.advance.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handing_Static_Webtable 
{

	public static void main(String[] args)
	{
		// Set the System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		//Create object instance for chrome driver
		ChromeDriver driver = new ChromeDriver();
		//Store the Application url in the String Variable
		String url= "https://nxtgenaiacademy.com/webtable/";
		//Lunch the application
		driver.get(url);
		//Maximize the window
		driver.manage().window().maximize();
		
		String startXpath="//*/tbody/";
			
		//First Name
		 WebElement firstName = driver.findElement(By.xpath(startXpath+"tr[1]/td[2]"));
		 String firstNameValue= firstName.getText();
		 System.out.println("The First Name of the Employee:"+firstNameValue);
		//Last Name
		 WebElement lastName = driver.findElement(By.xpath(startXpath+"tr[2]/td[2]"));
		 String lastNameValue= lastName.getText();
		 System.out.println("The Last Name of the Employee:"+lastNameValue);
		//Gender
		 WebElement gender = driver.findElement(By.xpath(startXpath+"tr[3]/td[2]"));
		 String genderValue= gender.getText();
		 System.out.println("Gender of the Employee:"+genderValue);
		//Date of Birth
		 WebElement DOB = driver.findElement(By.xpath(startXpath+"tr[4]/td[2]"));
		 String DOBValue= DOB.getText();
		 System.out.println("Date of Birth of the Employee:"+DOBValue);
		//Born
		 WebElement bornPlace = driver.findElement(By.xpath(startXpath+"tr[5]/td[2]"));
		 String placeValue= bornPlace.getText();
		 System.out.println("Born place of the Employee:"+placeValue);
		//Title
		 WebElement title = driver.findElement(By.xpath(startXpath+"tr[6]/td[2]"));
		 String titleValue= title.getText();
		 System.out.println("Title of the Employee:"+titleValue);
		//Emp Number
		 WebElement empNumber = driver.findElement(By.xpath(startXpath+"tr[7]/td[2]"));
		 String empNumberValue= empNumber.getText();
		 System.out.println("The Employee Number of the Employee:"+empNumberValue);
		//Salary
		 String salaryValue= driver.findElement(By.xpath(startXpath+"tr[8]/td[2]")).getText();
		 System.out.println("Salary of the Employee:"+salaryValue);
		//Email id
		 WebElement emailID = driver.findElement(By.xpath(startXpath+"tr[9]/td[2]"));
		 String emailIDValue= emailID.getText();
		 System.out.println("The Email Id of the Employee:"+emailIDValue);
		 //Close the application
		 driver.close();
		

	}

}
