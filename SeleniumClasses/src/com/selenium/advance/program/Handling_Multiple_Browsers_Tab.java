package com.selenium.advance.program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiple_Browsers_Tab 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Save the application in String
		String url = "https://nxtgenaiacademy.com/multiplewindows/";
		// Set System Property for Chrome Browser
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//Create instance variable for chrome browser
		ChromeDriver driver = new ChromeDriver();
		//Lunch the application
		driver.get(url);

		//Maximize the windows
		driver.manage().window().maximize();
		System.out.println("Parent Window is Opened");

		Thread.sleep(3000);
		
		//Click the new browser tab
		driver.findElement(By.linkText("New Browser Tab")).click();
		System.out.println("New Browser Tab page is opened");

		//Get the window id's
		Set<String>windowId=driver.getWindowHandles();
		Iterator<String>Iterator=windowId.iterator();
		
		//Storing window id's in respective windows
		String homePage=Iterator.next();
		String newPage=Iterator.next();
		
		//Display the respective window id's
		System.out.println("Home page window id is :"+homePage);
		System.out.println("Child page window id is :"+newPage);
		
		//Switching the control to the child page to perform the operation
		driver.switchTo().window(newPage);
		System.out.println("Child window page is activated");
		Thread.sleep(3000);
		//Maximize the child window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Click on the About Me in the child window
		driver.findElement(By.linkText("About Me")).click();
		System.out.println("About Me page is opened");
		Thread.sleep(3000);
		
		//Close the child window
		driver.close();
		
		//Switching the control to the parent window to perform operation
		driver.switchTo().window(homePage);
		System.out.println("Parent window is activated");
		Thread.sleep(3000);
		//Click on the Course Offered Tab in the parent window
		driver.findElement(By.linkText("Course Offered"));
		System.out.println("Course Offered Page is opened");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Close the application
		driver.close();
		System.out.println("Parent window is closed");
		
		
		
	}

}
