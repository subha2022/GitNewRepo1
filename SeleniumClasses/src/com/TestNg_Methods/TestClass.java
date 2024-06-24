package com.TestNg_Methods;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {

	WebDriver driver;

	@BeforeClass
	public void lunchApp()
	{
		String url="https://vinothqaacademy.com/";
		//set system property for chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver2.exe");
		//Create driver object for chrome driver
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(url);
		//Maximize the application
		driver.manage().window().maximize();

	}
	@AfterClass
	public void closeApp()
	{
		driver.close();
	}
	@Test
	public void regDemo()
	{
		WebElement demoSiteLink = driver.findElement(By.linkText("Demo Sites"));
		Actions ac = new Actions(driver);
		ac.moveToElement(demoSiteLink).perform();
		
		WebElement practiceAutomationLink = driver.findElement(By.linkText("Practice Automation"));
		ac.moveToElement(practiceAutomationLink).perform();
		
		driver.findElement(By.linkText("Demo Site – Registration Form")).click();
		
	}
	@Test
	public void enterRegDetails()
	{
		driver.findElement(By.xpath("//input[@name='vfb-5']")).sendKeys("Subhasmita");
		System.out.println("First Name is entered");
		driver.findElement(By.id("vfb-7")).sendKeys("Jena");
		System.out.println("Last Name is entered");
		driver.findElement(By.id("vfb-31-2")).click();
		System.out.println("Female Button is checked");
	}
	@Test
	public void submitRegForm()
	{
		driver.findElement(By.name("vfb-submit")).click();
		System.out.println("application is submitted");
	}


}
