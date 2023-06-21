package com.selenium.advance.program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Explicit_Wait {

	public static void main(String[] args) 
	{
		// Set property for chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver2.exe");
		//To Create Driver Object in Driver Interface
		WebDriver driver = new ChromeDriver();
		//Store the application link in String variable
		String url="https://demoqa.com/progress-bar";
		//Lunch the application
		driver.get(url);
		//Maximize the window
		driver.manage().window().maximize();
		//Click on start button
		driver.findElement(By.id("startStopButton")).click();
		System.out.println("Start button is clicked");
		
		WebElement reset;
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver,20);
		reset = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetButton")));
		
		reset.click();
		System.out.println("Reset Button is clicked");
		//Close the application
		driver.close();
		System.out.println("Application is closed");
	}

}
