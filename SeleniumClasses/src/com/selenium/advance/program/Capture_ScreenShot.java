package com.selenium.advance.program;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;


public class Capture_ScreenShot {

	public static void main(String[] args) throws IOException {
		String url = "https://nxtgenaiacademy.com/demo-site/";
		// Set the system property for chrome browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver2.exe");
		// Create object instance for chrome driver
		ChromeDriver driver = new ChromeDriver();
		// Lunch the application
		driver.get(url);
		// Maximize the window
		driver.manage().window().maximize();
		System.out.println("Application is lunched");
		
		//Take the screenshot. To taking the screen shot we have to add apache commons Io jar file
		//Take the entire screen 
		TakesScreenshot scrnShot = ((TakesScreenshot)driver);
		//call getScreenshotAs method to create the image
		File file=scrnShot.getScreenshotAs(OutputType.FILE);
		
		//Copy file to the permanent Location
		FileUtils.copyFile(file, new File(".\\ScreenShot\\HomePage.jpg"));
		
		//Take screen shot for failure condition
		try {
			//Name Locator
			driver.findElement(By.name("vfb-submittt")).click();
		}catch (Throwable e) {
			File file1=scrnShot.getScreenshotAs(OutputType.FILE);	
			FileUtils.copyFile(file, new File(".\\ScreenShot\\ErrorPage.jpg"));
		}
		
		
		driver.close();
		System.out.println("Application is closed");
	}


}
