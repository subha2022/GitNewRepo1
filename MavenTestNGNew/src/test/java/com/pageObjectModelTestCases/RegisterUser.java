package com.pageObjectModelTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pageObjectModelPages.RegisterDemoPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterUser 
{
	public WebDriver driver;
	@Test(priority = 1)
	public void lunchApplication() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		Reporter.log("Application is lunched");
	}
	@Test(priority = 2)
	public void registerUser() 
	{
		RegisterDemoPage regUser = new RegisterDemoPage(driver);
	/* for page factory 
		RegisterDemoPage regUser = PageFactory.initElements(driver,RegisterDemoPage.class);*/
		regUser.setFirstname("Pabitra");
		regUser.setLastname("Pradhan");
		regUser.selectMaleRadioBtn();
		regUser.setEmailId("pabitra@gmail.com");
		regUser.enterVerificationNum("89");
		regUser.clickSubmitBtn();

	}
	@Test(priority = 3)
	public void closeApplication() 
	{
		driver.close();
		Reporter.log("The Application is closed");
	}
}
