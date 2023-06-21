package com.seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassKeyboardActions {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement searchBox=driver.findElement(By.name("q"));
		
		//Method 1= using Action Class
		Actions action= new Actions(driver);
		action.moveToElement(searchBox)
		.keyDown(searchBox, Keys.SHIFT)
		.sendKeys(searchBox, "selenium").keyUp(searchBox, Keys.SHIFT)
		.pause(3000).sendKeys(Keys.ENTER).perform();
	

	}

}
