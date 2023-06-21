package com.selenium.advance.program;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_Wait {

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
		//Declaring reset button
		WebElement reset;
		//Fluent Wait
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.withMessage("Fluent Wait in implemented")
				.ignoring(NoSuchElementException.class);
		 
		reset = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@id,'resetButton')]")));
		// Click on Reset Button
		reset.click();
		System.out.println("Reset button is clicked");
		//close the Application
		driver.close();
		System.out.println("Application is closed");
	}

}
