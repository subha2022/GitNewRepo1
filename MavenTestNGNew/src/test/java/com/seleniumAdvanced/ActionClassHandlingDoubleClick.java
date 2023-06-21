package com.seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassHandlingDoubleClick 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String url = "https://demoqa.com/buttons";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement doubleClickMe = driver.findElement(By.id("doubleClickBtn"));
		
		//perform the double click
		//Method 1= doubleClick()
		
		Actions action = new Actions(driver);
		action.doubleClick(doubleClickMe).perform();
		System.out.println("The Double click option is clicked");
		
		//Method 2 = moveToElement()
		//action.moveToElement(doubleClickMe).doubleClick().perform();
		
		driver.close();
		
		

	}

}
