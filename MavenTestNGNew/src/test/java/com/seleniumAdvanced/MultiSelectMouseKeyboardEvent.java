package com.seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiSelectMouseKeyboardEvent {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/selectable";
		driver.get(url);
		driver.manage().window().maximize();
		
		//click on Grid Button
		
		driver.findElement(By.id("demo-tab-grid")).click();
		
		
		WebElement one = driver.findElement(By.xpath("//li[contains(text(),'One')]"));
		WebElement two= driver.findElement(By.xpath("//li[contains(text(),'Two')]"));
		WebElement three = driver.findElement(By.xpath("//li[contains(text(),'Three')]"));
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL)
			.click(one).pause(3000)
			.click(two).pause(3000)
			.click(three).keyUp(Keys.CONTROL).perform();
		System.out.println("The Program is Executing Successfully");
		driver.close();

	}

}
