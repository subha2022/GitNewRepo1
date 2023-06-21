package com.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_RadioButton {

	public static void main(String[] args) throws InterruptedException 
	{
		String url="https://itera-qa.azurewebsites.net/home/automation";
		String femaleId="female";
		
		//set properties for Chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver1.exe");
		
		// create instance for Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Lunch the application
		driver.get(url);
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Declaring the web element object
		 WebElement femaleRadioBtn = driver.findElement(By.id(femaleId));
		 
		 //Verify the Female Radio Button is Displayed
		 if(femaleRadioBtn.isDisplayed())
		 {
			 System.out.println("Female Radio Button is Displayed");
		 }else
		 {
			 System.out.println("Female Radio Button is not Displayed");
		 }
		 //Verify the Female Radio Button is Enabled
		 if(femaleRadioBtn.isEnabled())
		 {
			 System.out.println("Female Radio Button is enabled");
			 
			 System.out.println("Female Radio Button is clicked");
		 }else
		 {
			 System.out.println("Female Radio Button is not enabled");
		 }
		 
		 //Verify the Female Radio Button is Selected
		 if(femaleRadioBtn.isSelected())
		 {
			 System.out.println("Female Radio Button is Selected");
		 }
		 else
		 {
			 System.out.println("Female Radio Button is not Selected");
			//click Radio Button
			 femaleRadioBtn.click();
		 }
		 //Verify the Radio Button is Selected
		 if(femaleRadioBtn.isSelected())
		 {
			 System.out.println("Female Radio Button is Selected");
		 }
		 else
		 {
			 System.out.println("Female Radio Button is not Selected");
			
		 }
		 
		 Thread.sleep(3000);
		//close the application 
		 driver.close();


	}

}
