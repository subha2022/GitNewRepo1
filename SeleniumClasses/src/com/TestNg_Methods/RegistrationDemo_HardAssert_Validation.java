package com.TestNg_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationDemo_HardAssert_Validation {
	public WebDriver driver;
	String url = "https://nxtgenaiacademy.com/demo-site/";

	@BeforeClass
	public void lunchApplication() {
		// Set the system property for chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver2.exe");
		// Create object instance for chrome driver
		driver = new ChromeDriver();
		// Lunch the application
		driver.get(url);
		// Maximize the window
		driver.manage().window().maximize();
		Reporter.log("Application is lunched");

	}

	@AfterClass(alwaysRun=true)
	public void closeApplication() {
		driver.close();
		Reporter.log("Application is closed");

	}
	@Test(priority = 1)
	public void registerUser() {
		//Title Verification
		System.out.println("Title Validation Started");
		String actualTitle=driver.getTitle();
		String expectedTitle="Demo  – Registration Form – NxtGen A.I Academy";

		Assert.assertEquals(actualTitle, expectedTitle , "Titles are not same");

		//First Name Error Msg Verification
		System.out.println("First Name Error Message Verification");
		Assert.assertEquals(true, true , "First name error Messages are not same");

		//Last Name Error Msg Verification
		System.out.println("Last Name Error Message Verification");
		Assert.assertEquals(false, true , "Last name error Messages are not same");

		//Gender Error Msg Verification
		System.out.println("Gender Name Error Message Verification");
		Assert.assertEquals(true, true , "Gender name error Messages are not same");

		//EmailId Error Msg Verification
		System.out.println("EmailId Name Error Message Verification");
		Assert.assertEquals(true, true , "EmailId name error Messages are not same");

		//Verification Error Msg Validation
		System.out.println("Verification Name Error Message Verification");
		Assert.assertEquals(false, true , "Verification name error Messages are not same");
	}

}
