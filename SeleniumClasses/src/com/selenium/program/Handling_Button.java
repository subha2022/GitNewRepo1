package com.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Button {

	public static void main(String[] args) throws InterruptedException 
	{
		String url="https://itera-qa.azurewebsites.net/home/automation";
		String submitBtnName="submit";
		
		//set properties for Chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver1.exe");
		
		// create instance for Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Lunch the application
		driver.get(url);
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Declaring the web element object
		 WebElement submitBtn = driver.findElement(By.name(submitBtnName));
		 
		 //Verify the Submit is Displayed
		 if(submitBtn.isDisplayed())
		 {
			 System.out.println("Submit Button is Displayed");
		 }else
		 {
			 System.out.println("Submit Button is not Displayed");
		 }
		 //verify the Submit is Enabled
		 if(submitBtn.isEnabled())
		 {
			 System.out.println("Submit Button is enabled");
			 //enter the name
			 submitBtn.click();
			 //Another way for Submit the button
			// submitBtn.submit();
			 System.out.println("Submit Button is clicked");
		 }else
		 {
			 System.out.println("Submit Button is not enabled");
		 }
		 
		 Thread.sleep(3000);
		//close the application	 
		 driver.close();

	}

}
