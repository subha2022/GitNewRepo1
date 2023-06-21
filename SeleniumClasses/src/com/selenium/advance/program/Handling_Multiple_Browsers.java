package com.selenium.advance.program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Multiple_Browsers 
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
		
		//Click on the new browser window
		driver.findElement(By.xpath("(//*[@id=\"button1\"])[1]")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
		System.out.println("Child Window is Opened");
				
		//Can retrieve any number of windows id in the list 
		//System.out.println(driver.getWindowHandles()); 
		
		//Get window's Id's
		Set<String>WindowId=driver.getWindowHandles();
		Iterator<String>Iterator = WindowId.iterator();
		//Storing Window Id to the respective windows
		String homePage=Iterator.next();//Home page
		String nextPage=Iterator.next();//New Window Page
		
		//Display the Respective window id's
		System.out.println("Parent Page window id is:"+homePage);
		System.out.println("Child Page window id is:"+nextPage);
		
		//Switch the control to the new window and perform all the operation in new window
		driver.switchTo().window(nextPage);
		System.out.println("Child page is activated");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Click the python for automation in the child page
		driver.findElement(By.linkText("Python for Automation")).click();
		System.out.println("Python for Automation page is opened");
		
		Thread.sleep(3000);
		//Close the Child Window
		driver.close();
		System.out.println("Child page is closed");
		//Switch back the control to the Parent window and perform the operation in parent window
		driver.switchTo().window(homePage);
		System.out.println("Parent window is activated");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//click on the Course Offered  tab  in the parent page
		driver.findElement(By.linkText("Course Offered")).click();
		System.out.println("Course Offered page is opened");
		Thread.sleep(3000);
		//Close the application
		driver.close();
		System.out.println("Parent page is closed");
		
	
		

	}

}
