package com.lunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main 
{
public static WebDriver driver;
public static void luncher1(String browser)
{
	if(browser.equals("chrome"))
	{
		driver = new ChromeDriver();
	}
			
	else if(browser.equals("firefox"))
	{
		driver = new FirefoxDriver();
	}
}

public static void  navigeturl(String url)
{
	driver.get(url);
}
}
