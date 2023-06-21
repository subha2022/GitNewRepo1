package com.selenium.advance.program;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleValueSelect {

	public static void main(String[] args)
	{
		//Parameterize input value
		String url="https://www.google.com/";
		String value="Selenium";
		// Set the system property for chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver2.exe");

		//Create the driver instance for chrome driver
		ChromeDriver driver = new ChromeDriver();
		//Lunch the url
		driver.get(url);
		//Maximize the window
		driver.manage().window().maximize();

		//Create object instance for Actions class by passing webdriver instance
		Actions ac =new Actions(driver);
	}

}
