package com.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_CheckBox {

	public static void main(String[] args) throws InterruptedException 
	{
		String url="https://vinothqaacademy.com/demo-site/";
		String testNGXpath="vfb-20[]";
		
		//set properties for Chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver2.exe");
		
		// create instance for Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Lunch the application
		driver.get(url);
		
		//Maximize the window
		driver.manage().window().maximize();

		//Declaring the web element object
		WebElement testNGCheckBox = driver.findElement(By.name(testNGXpath));

		//Verify the testNG Check Box is displayed
		if(testNGCheckBox.isDisplayed())
		{
			System.out.println("testNG Check Box is Displayed");
		}else
		{
			System.out.println("testNG Check Box is not Displayed");
		}
		//Verify the testNG Check Box is enabled 
		if(testNGCheckBox.isEnabled())
		{
			System.out.println("testNG Check Box is enabled");	 
		}
		else
		{
			System.out.println("testNG Check Box is enabled");
		}
		Thread.sleep(3000);

		//Verify the testNG Check Box is Selected
		if(testNGCheckBox.isSelected())
		{
			System.out.println("testNG Check Box is Selected");
		}
		else
		{
			System.out.println("testNG Check Box is not Selected");
			//click Check Box Button
			testNGCheckBox.click();
		}
		
		//Verify the testNG Check Box is Selected 
		if(testNGCheckBox.isSelected())
		{
			System.out.println("testNG Check Box is Selected");
		}
		else
		{
			System.out.println("testNG Check Box is not Selected");
		}

		Thread.sleep(3000);
		//close the application
		driver.close();



	}

}
