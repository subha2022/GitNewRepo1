package com.java.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceExceptionDemo {

	public static void main(String[] args) 
	{
		System.setProperty("weddriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement textField=driver.findElement(By.id("ta1"));
		textField.sendKeys("Subhasmita");
		
		driver.findElement(By.linkText("compendiumdev")).click();
		driver.navigate().back();
		
		textField.clear(); // it will give the Stale element exception
	}

}
