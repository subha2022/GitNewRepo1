package com.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Image {

	public static void main(String[] args)
	{
		String url="https://vinothqaacademy.com/demo-site/";
		String imageXpath="//img[@alt='Automation']";
		
		//set properties for Chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		// create instance for Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Lunch the application
		driver.get(url);
		
		//Maximize the window
		driver.manage().window().maximize();
		
		WebElement robotImage = driver.findElement(By.xpath(imageXpath));
		
		//Verify the Robot Image is displayed 
		if(robotImage.isDisplayed())
		{
			System.out.println("Robot Image is displayed");
		}else
		{
			System.out.println("Robot Image is not dispalyed");
		}
		
		//Verify the Logo is displayed
		WebElement pageLogo = driver.findElement(By.xpath("//img[@alt='Vinoth Q.A Academy']"));
		
		if(pageLogo.isDisplayed())
		{
			System.out.println("Page Logo is displayed");
		}else
		{
			System.out.println("Page Logo is not displayed");
		}
		//close the application
		driver.close();
		
		


	}

}
