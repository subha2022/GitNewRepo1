package com.lunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLunching1 
{

	public static void main(String[] args)
	{
		WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		//System.setProperty("webdriver.gecko.driver", "E:/driver/geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		//FirefoxDriver driver1 = new FirefoxDriver();
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com");
		System.out.println("Application is lunched");

	}

}
