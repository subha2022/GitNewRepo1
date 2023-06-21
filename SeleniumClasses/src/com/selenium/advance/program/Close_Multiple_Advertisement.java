package com.selenium.advance.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Close_Multiple_Advertisement {

	public static void main(String[] args) throws InterruptedException
	{
		// Set the system property for the chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		//Creating instance of Chrome driver
		ChromeDriver driver = new ChromeDriver();	

		// Store the Url in String 
		String url = "https://www.makemytrip.com/";		

		// Launch the application
		driver.get(url);

		// Maximize the application
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Close the advertisement
		WebElement adv = driver.findElement(By.xpath("//span[contains(@class,'ic_circularclose_grey')]"));
		adv.click();
		System.out.println("Advertisement is closed");
		
		
		
		
		


	}

}
