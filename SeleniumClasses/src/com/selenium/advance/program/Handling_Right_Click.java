package com.selenium.advance.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Right_Click {

	public static void main(String[] args) 
	{
		// Storing the application url in the String Variable
		String url="https://demo.guru99.com/test/simple_context_menu.html";
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
		WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement pasteOptn = driver.findElement(By.xpath("//span[text()='Paste']"));
		//Perform the right click action
		ac.contextClick(rightClickMe).pause(3000).click(pasteOptn).perform();
		System.out.println("Right Click action is performed");
		
		//Click the Ok Button
		driver.switchTo().alert().accept();
		System.out.println("Alert is accepted");
		
		//Close the application
		driver.close();
		System.out.println("Application is closed");
		
		
		
		
		
						

	}

}
