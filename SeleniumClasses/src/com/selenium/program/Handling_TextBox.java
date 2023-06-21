package com.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_TextBox 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		String url="https://itera-qa.azurewebsites.net/home/automation";
		String nameId="name";
		String name="Subhasmita";
		
		//set properties for Chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver1.exe");
		
		// create instance for Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Lunch the application
		driver.get(url);
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Declaring the web element object
		 WebElement fullName = driver.findElement(By.id(nameId));
		 
		 //Verify the name is Displayed
		 if(fullName.isDisplayed())
		 {
			 System.out.println("Name is Displayed");
		 }else
		 {
			 System.out.println("Name is not Displayed");
		 }
		 //verify the name is Enabled
		 if(fullName.isEnabled())
		 {
			 System.out.println("Name is enabled");
			 //enter the name
			 fullName.sendKeys("Subhasmita");
			 System.out.println("Full Name is:"+name);
		 }else
		 {
			 System.out.println("Name is not enabled");
		 }
		 
		 Thread.sleep(3000);
		 //clear first name
		 fullName.clear();
		 Thread.sleep(3000);
		 
		//close the application
		 driver.close();
		 
		 
		 
				
		
		
	
		
		

	}

}
