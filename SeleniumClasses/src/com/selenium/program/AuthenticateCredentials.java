package com.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticateCredentials {

	public static void main(String[] args) throws InterruptedException {

		// Set the system property for the chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver1.exe");

		//Creating instance of Chrome driver
		WebDriver driver = new ChromeDriver();	
		
		// Syntax to Authenticate 
		//https://username:password@URL 
				
		// Url without authenticate 
		//String url = "http://the-internet.herokuapp.com/basic_auth"; 				
	
		// Url with authenticate 
		String url = "http://admin:admin@the-internet.herokuapp.com/basic_auth";		
		
		// Launch the application
		driver.get(url);

		// Maximize the application
		driver.manage().window().maximize();
		
		// Declaring the WebElement object
		WebElement msg = driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]"));
				
		// Validate the Greeting Message
		String actWelcomeMsg = msg.getText();		
		String expWelcomeMsg = "Congratulations! You must have the proper credentials.";
		
		if(actWelcomeMsg.equals(expWelcomeMsg)) {
			System.out.println("The actual and expected greeting message are same");
			System.out.println("The Welcome Message is"+ actWelcomeMsg);
		}
		else
		{
			System.out.println("The actual and expected Welcome message are not same");
			System.out.println("The actual Welcome message is "+ actWelcomeMsg);
			System.out.println("The expected Welcome message is"+ expWelcomeMsg);
		}
					
		Thread.sleep(3000);
		
		// Close the application
		driver.close();
		
	}

}
