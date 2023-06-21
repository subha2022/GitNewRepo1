package com.seleniumAdvanced;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingMultipleTabs {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://nxtgenaiacademy.com/multiplewindows/";
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Parent Browser is opened");
		
		Thread.sleep(3000);
		
		// click on new browser window
		driver.findElement(By.name("newbrowsertab453")).click();
		System.out.println("Child Browser is opened");
		
		//Retrieve id of each browser opened by the chrome driver
		// one way we can find window id
		System.out.println(driver.getWindowHandles());
		
		// another way . These two lines are common for all
		Set<String> windowId = driver.getWindowHandles();
		Iterator <String> iterator = windowId.iterator();
		
		// Storing each window id to respective variables
		// if want another window we can assign like iterator.next();
		String parentWindow = iterator.next();
		String childWindow =iterator.next();
		//String subWindow =iterator.next();
		
		System.out.println("The Patrent Window id is:"+parentWindow);
		System.out.println("The Child Window id is:"+childWindow);
		
		// Active the child browser
		driver.switchTo().window(childWindow);
		Thread.sleep(3000);
		// Maximize the Child window
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		//click on data science = child window
		driver.findElement(By.partialLinkText("DATA SCIENCE")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		// Active the parent window
		driver.switchTo().window(parentWindow);
		Thread.sleep(3000);
		
		// Click on the Home link in the parent window
		driver.findElement(By.partialLinkText("HOME")).click();
		Thread.sleep(3000);
		driver.close();
		System.out.println("Program is Executed successfully ");

	}

}
