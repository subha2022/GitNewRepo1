package com.lunching;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest1 
{
	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");//current project root directory
	public static Properties p;
	public static FileInputStream fis;
	
		
	public static void init() throws Exception
	{
		fis = new FileInputStream(projectpath+"\\data.properties");
		p = new Properties();
		p.load(fis);
		String value = p.getProperty("firefoxbrowser");
		System.out.println(value);
		
		}
			
	public static void luncher(String browser)
	{
					
		if(p.getProperty(browser).equals("chrome"))
		{
			driver = new ChromeDriver();
		}
				
		else if(p.getProperty(browser).equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
	}

	public static void navigateUrl(String url)
	{
		driver.get(p.getProperty(url));
	}

}


