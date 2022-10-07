package com.webdriverscreenshots;


import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShot {

	public static void main(String[] args) throws Exception {
	//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		System.out.println("Application is lunched");
		
		// Take Screen Shot
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		// call getScreenShortAs method to create the image file
		File file = scrShot.getScreenshotAs(OutputType.FILE);
		
		// copy file to the location
		FileUtils.copyFile(file, new File(".\\failuarescreenshot\\ Homepage.jpg"));
		
		// Screen Shot Failure condition
		try
		{
			driver.findElementByName("vfb-submiiit").click();
		}catch(Throwable e)
		{
			File file1 = scrShot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File(".\\failuarescreenshot\\ Errorpage.jpg"));
			
		}
		
				
		
		
	}

}
