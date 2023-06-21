package com.testNG.Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lunch_Youtube {

	public static void main(String[] args) throws InterruptedException 
	{
		String url="https://www.youtube.com/";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		 driver.findElement(By.name("search_query")).sendKeys("RD Automation Learning");
		 driver.findElement(By.id("search-icon-legacy")).click();
		 driver.manage().timeouts().wait(4000);
		 driver.close();
		 System.out.println("Program is executing successfully");
		 
		
		

	}

}
