package com.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Browser_Navigation {

	public static void main(String[] args)
	{
		String url="https://itera-qa.azurewebsites.net/home/automation";
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Practice")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println("Thank You");
		driver.close();
		

		

		
	}

}
