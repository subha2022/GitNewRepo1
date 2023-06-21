package com.selenium.advance.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_ToolTip {

	public static void main(String[] args) throws InterruptedException 
	{
		// Storing the application url in the String Variable
		String url="https://www.google.com/imghp?hl=en";
		//Set system property for chrome driver
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver2.exe");
		//Create object instance for chrome driver
		ChromeDriver driver = new ChromeDriver();
		//Lunch the application
		driver.get(url);
		//Maximize the window
		driver.manage().window().maximize();

		//create the object instance for Actions class
		Actions ac = new Actions(driver);
		//Declaring the web elements object
		WebElement googleSearch = driver.findElement(By.name("q"));
		ac.moveToElement(googleSearch).perform();
		//Validating the tool tip message
		String actText=googleSearch.getAttribute("aria-label");
		String expText="Google Search";
		
		if(actText.equals(expText))
		{
			System.out.println("Both the texts are same");
			System.out.println("The Actual Text is:"+actText);
		}else
		{
			System.out.println("Both the texts are not same");
			System.out.println("The Actual Text is:"+actText);
			System.out.println("The Expected Text is:"+expText);
		}
		
		Thread.sleep(3000);
		//Close the application
		driver.close();
		System.out.println("Application is closed");
	}

}
