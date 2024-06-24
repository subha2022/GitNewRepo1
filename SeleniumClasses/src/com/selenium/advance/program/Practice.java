package com.selenium.advance.program;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		//Save the application in String
		String url = "https://vinothqaacademy.com/multiplewindows/";
		// Set System Property for Chrome Browser
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver2.exe");

		//Create instance variable for chrome browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Lunch the application
		driver.get(url);

		//Maximize the windows
		driver.manage().window().maximize();
		System.out.println("Parent Window is Opened");
		
		WebElement newBrowserWindow = driver.findElement(By.name("newbrowserwindow123"));
		newBrowserWindow.click();
		driver.manage().window().maximize();
		System.out.println("Child window is opened");
		
		Set<String> windowsId = driver.getWindowHandles();
		Iterator<String>iterator=windowsId.iterator();
		
		String homePage = iterator.next();
		String nextPage = iterator.next();
		
		System.out.println("Home Page id:"+homePage);
		System.out.println("Child Page id:"+nextPage);
		driver.switchTo().window(nextPage);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Selenium Online Training")).click();
		System.out.println("Selenium Online Training page is opened");
		driver.close();
		
		driver.switchTo().window(homePage);
		driver.findElement(By.linkText("Home")).click();
		System.out.println("Home page is opend");
		

		driver.close();
	}

}
