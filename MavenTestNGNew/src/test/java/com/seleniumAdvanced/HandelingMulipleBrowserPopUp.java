package com.seleniumAdvanced;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelingMulipleBrowserPopUp 
{

	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("disable-notifications");
	
		WebDriver driver = new ChromeDriver(opts);
		String url = "https://ezmob.com/self-serve-platform/?utm_source=PopIN&utm_campaign=15856477615&utm_term=online%20pop%20up%20ads&utm_content=574547780116&gclid=CjwKCAjwqJSaBhBUEiwAg5W9p7de5UxMHYZ1H6Dxs4BPJ8LZAAaaD28VroWg_ybaReyWnOJdpKCEhRoCQpcQAvD_BwE";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		System.out.println("Parent Browser is opened");

		/*//System.out.println(driver.getWindowHandles());
		String mainWindowId = driver.getWindowHandle();
		String childWindowId = driver.getWindowHandle();
		driver.switchTo().window(childWindowId).close();*/
		
		
		/*Set<String> childWindowId = driver.getWindowHandles();
		
		for(String handel : childWindowId)
		{
			if(! handel.equals(mainWindowId))
				driver.switchTo().window(handel);
			Thread.sleep(3000);
			driver.close();
			
		}*/
		System.out.println("Program is executing successfully");




	}

}
