package com.selenium.advance.program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Implicit_Wait {

	public static void main(String[] args) 
	{
		WebDriver driver;
		// Set property for chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver2.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		//To Create Driver Object in Driver Interface
		 driver = new ChromeDriver(option);
		//Store the application link in String variable
		String url="https://demoqa.com/progress-bar";
		//Lunch the application
		driver.get(url);
		//Maximize the window
		driver.manage().window().maximize();
		//Implicit Wait for 10 seconds to all the web elements
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Click on start button
		driver.findElement(By.id("startStopButton")).click();
		System.out.println("Start button is clicked");

		WebElement reset=driver.findElement(By.id("resetButton"));
		reset.click();
		System.out.println("Reset button is clicked");
		//Close the application
		driver.close();
		System.out.println("Application is closed");
		

	}

}
