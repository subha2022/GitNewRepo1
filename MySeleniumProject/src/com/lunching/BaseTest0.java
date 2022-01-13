package com.lunching;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest0 {
	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");//current project root directory
	public static Properties p;
	public static FileInputStream fis;
	public static Properties mainprop;
	public static Properties childprop;
		
	public static void init() throws Exception
	{
		fis = new FileInputStream(projectpath+"\\data.properties");
		p = new Properties();
		p.load(fis);
		String value = p.getProperty("firefoxbrowser");
		System.out.println(value);
		
		fis = new FileInputStream(projectpath+"\\environment.properties");
		mainprop = new Properties();
		mainprop.load(fis);
		
		 String e = mainprop.getProperty("env");
		 System.out.println(e);
		 		
		 fis = new FileInputStream(projectpath+"\\"+e+".properties");
		 childprop=new Properties();
		 childprop.load(fis);
		 
		String url = childprop.getProperty("amazonurl");
		System.out.println(url);
		
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
		driver.get(childprop.getProperty(url));
	}

}



