package com.lunching;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

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
			ChromeOptions option = new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\pabitra\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 6");
			
			// How to Handle Notification
			option.addArguments("--disable-notifications");
			option.addArguments("--start-maximized"); //to get maximized the window
			option.addArguments("--ignore-certificate-errors-spki-list"); //for certificate error
			//option.addArguments("--proxy-server=https://192.168.10.1.9898");//for proxy ip settings and port
						
			driver = new ChromeDriver(option);
		}
				
		else if(p.getProperty(browser).equals("firefox"))
		{
			ProfilesIni p =new ProfilesIni();
			FirefoxProfile profile = p.getProfile("Jan2022FF");
			
			FirefoxOptions option = new FirefoxOptions();
			option.setProfile(profile);
			
			// Notifications
			profile.setPreference("dom.webnotifications.enabled", false);
			
			// Certificate Errors
			
			profile.setAcceptUntrustedCertificates(true);
			profile.setAssumeUntrustedCertificateIssuer(false);
			
			// How to  work with Proxy Settings
			profile.setPreference("network.proxy.type", 1);
			profile.setPreference("network.proxy.socks", "192.168.10.1");
			profile.setPreference("network.proxy.socks_port", 1744);
			
			driver = new FirefoxDriver(option);
			
		}
	}

	public static void navigateUrl(String url)
	{
		driver.get(childprop.getProperty(url));
	}
	public static void clickElement(String locator )
	{
		driver.findElement(By.xpath(locator)).click();
	}

	public static void typeText(String locator, String text)
	{
		driver.findElement(By.name(locator)).sendKeys(text);
	}

	public static void selectOption(String locator, String option)
	{
		driver.findElement(By.id(locator)).sendKeys(option);
	}

}



