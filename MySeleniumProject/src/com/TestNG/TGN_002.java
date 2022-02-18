package com.TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TGN_002 
{
	 WebDriver driver = null;
	 
	 @Test
 	public void f() 
	  {
		  driver.findElement(By.name("q")).sendKeys("eyeliner");
	  }
  @BeforeMethod
  public void beforeMethod()
  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/"); 
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.close();
  }

}
