package com.selenium.advance.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseOver {

	public static void main(String[] args) throws InterruptedException 
	{
		String url="https://nxtgenaiacademy.com/";
		// Set properties for Firefox driver
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		//Create object instance for Firefox Driver
		FirefoxDriver driver = new FirefoxDriver();
		//Lunch the application
		driver.get(url);
		//Maximize the window
		driver.manage().window().maximize();
		
		//Create object instance for Actions class by passing webdriver instance
		Actions ac =new Actions(driver);
		//Performing the mouse hover action on the demo site
		WebElement demosites = driver.findElement(By.xpath("(//a[text()='Demo Sites'])[2]"));
		ac.moveToElement(demosites).perform();
		
		Thread.sleep(3000);
		
		//performing the mouse hover action on the Practice Automation
		WebElement praAutomation = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div[3]/div[2]/div[2]/ul/li[3]/ul/li/a"));
		ac.moveToElement(praAutomation).perform();
		
		Thread.sleep(3000);
		
		//Click Registration Form
		driver.findElement(By.linkText("Demo Site – Registration Form")).click();
		
		Thread.sleep(3000);
		
		//Close the application
		driver.close();
		
		
		
		

	}

}
