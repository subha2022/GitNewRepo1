package com.TestNg_Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class MultiBrowserTesting {
	
	public WebDriver driver;
	
	@Parameters({"Browser","Url"})//read the value from xml file
	
	@BeforeClass
	public void lunchApplication(String Browser,String Url)
	{
		if(Browser.equalsIgnoreCase("chrome"))
		{
			// Set the system property for chrome browser
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver2.exe");
			// Create object instance for chrome driver
			driver = new ChromeDriver();
			// Lunch the application
			driver.get(Url);
			// Maximize the window
			driver.manage().window().maximize();
			Reporter.log("Application is lunched");
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			// Set the system property for chrome browser
			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
			// Create object instance for chrome driver
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		// Lunch the application
		driver.get(Url);
		// Maximize the window
		driver.manage().window().maximize();
		Reporter.log("Application is lunched");

	}
	@AfterClass
	public void closeApplication()
	{
		driver.close();
		Reporter.log("Application is closed");
	}

	
}
