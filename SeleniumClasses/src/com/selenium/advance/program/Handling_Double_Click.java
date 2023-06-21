package com.selenium.advance.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Double_Click {

	public static void main(String[] args) throws InterruptedException
	{
		// Storing the application url in the String Variable
		String url="https://testautomationpractice.blogspot.com/";
		//Set system property for chrome driver
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		//Create object instance for chrome driver
		ChromeDriver driver = new ChromeDriver();
		//Lunch the application
		driver.get(url);
		//Maximize the window
		driver.manage().window().maximize();

		//create the object instance for Actions class
		Actions ac = new Actions(driver);
		//Declaring the web elements object
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		//Perform the double click action
		ac.doubleClick(doubleClick).perform();
		System.out.println("Double click acion is performed");
		Thread.sleep(3000);
		//Application closed
		driver.close();
		System.out.println("Application is closed");

	}

}
