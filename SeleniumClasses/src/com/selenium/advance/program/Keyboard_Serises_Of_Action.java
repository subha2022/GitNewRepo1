package com.selenium.advance.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Serises_Of_Action {

	public static void main(String[] args)
	{
		//Parameterize input value
		String url="https://www.google.com/";
		String value="Selenium";
		// Set the system property for chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver2.exe");
		
		//Create the driver instance for chrome driver
		ChromeDriver driver = new ChromeDriver();
		//Lunch the url
		driver.get(url);
		//Maximize the window
		driver.manage().window().maximize();
		
		//Create object instance for Actions class by passing webdriver instance
		Actions ac =new Actions(driver);
		//Declaring the web element object
		WebElement searchBox = driver.findElement(By.name("q"));
		
		//Method-1 using action class
		ac.moveToElement(searchBox).keyDown(searchBox,Keys.SHIFT)
		.sendKeys(searchBox, value).keyUp(searchBox,Keys.SHIFT).pause(3000).sendKeys(Keys.ENTER).perform();
		
		/*Method-2 using action interface
		
		Action seriesOfAction= ac.moveToElement(searchBox).
				keyDown(searchBox,Keys.SHIFT).sendKeys(searchBox,value).
				keyUp(searchBox,Keys.SHIFT).pause(3000).sendKeys(Keys.ENTER).build();
		
		seriesOfAction.perform();*/
		System.out.println("Value is searched:"+ value);
		
	
		
		//close the application
		driver.close();

	}

}
