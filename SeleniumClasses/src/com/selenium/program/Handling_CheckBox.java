package com.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_CheckBox {

	public static void main(String[] args) throws InterruptedException 
	{
		String url="https://itera-qa.azurewebsites.net/home/automation";
		String weekXpath="//label[@class='form-check-label']/input[@id='thursday']";
		
		//set properties for Chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver1.exe");
		
		// create instance for Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Lunch the application
		driver.get(url);
		
		//Maximize the window
		driver.manage().window().maximize();

		//Declaring the web element object
		WebElement thrusdayCheckBox = driver.findElement(By.xpath(weekXpath));

		//Verify the Thursday Check Box is displayed
		if(thrusdayCheckBox.isDisplayed())
		{
			System.out.println("Thursday Check Box is Displayed");
		}else
		{
			System.out.println("Thursday Check Box is not Displayed");
		}
		//Verify the Thursday Check Box is enabled 
		if(thrusdayCheckBox.isEnabled())
		{
			System.out.println("Thursday Check Box is enabled");	 
		}
		else
		{
			System.out.println("Thursday Check Box is enabled");
		}
		Thread.sleep(3000);

		//Verify the Thursday Check Box is Selected
		if(thrusdayCheckBox.isSelected())
		{
			System.out.println("Thursday Check Box is Selected");
		}
		else
		{
			System.out.println("Thursday Check Box is not Selected");
			//click Check Box Button
			thrusdayCheckBox.click();
		}
		
		//Verify the Thursday Check Box is Selected 
		if(thrusdayCheckBox.isSelected())
		{
			System.out.println("Thursday Check Box is Selected");
		}
		else
		{
			System.out.println("Thursday Check Box is not Selected");
		}

		Thread.sleep(3000);
		//close the application
		driver.close();



	}

}
