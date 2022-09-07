package com.webdriverscreenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Selfy7 {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		 
		Date dt = new Date();
		System.out.println(dt);
		String d = dt.toString().replace(':', '_').replace(' ', '_');
		System.out.println(d);
		
		File srcFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File("C:\\Users\\pabitra\\git\\GitNewRepo1\\MySeleniumProject\\failuarescreenshot\\"+d+"_"+"guru99.png"));
		Thread.sleep(2000);
		driver.quit();

	}

}
