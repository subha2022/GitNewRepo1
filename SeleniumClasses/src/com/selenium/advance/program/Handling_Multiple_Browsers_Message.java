package com.selenium.advance.program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Multiple_Browsers_Message 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Storing the url in String
		String url = "https://vinothqaacademy.com/multiplewindows/";
		//Set the system property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		//Create instance variable for Chrome Driver
		ChromeDriver driver = new ChromeDriver();
		//Lunch the Application
		driver.get(url);
		//Maximize the window
		driver.manage().window().maximize();
		System.out.println("Parent window is opened");

		Thread.sleep(3000);

		//Click the New Message Window Tab 
		WebElement newMsgWindow = driver.findElement(By.name("123newmessagewindow321"));
		newMsgWindow.click();
		System.out.println("New Message Window is opened");

		//Get the window Id's 
		Set<String>windowId=driver.getWindowHandles();
		Iterator<String>iterator=windowId.iterator();

		//Storing window id's in the respective window
		String homePage=iterator.next();
		String newMsgWnd=iterator.next();
		//Displaying the respective Window id's
		System.out.println("Parent window id is:"+homePage);
		System.out.println("Child window id is:"+newMsgWnd);
		//Switching the control to the child window to perform the activity
		driver.switchTo().window(newMsgWnd);
		System.out.println("New Message Window is activated");
		Thread.sleep(3000);
		driver.close();
		System.out.println("Child Window is closed");

		//Switching control back to the parent window to perform the activity
		driver.switchTo().window(homePage);
		System.out.println("Parent Window is activated");
		Thread.sleep(3000);
		//Click Free Youtube Courses link in the parent window
		Actions ac = new Actions(driver);
		WebElement freeyoutubeCoursesLink = driver.findElement(By.linkText("Free YouTube Courses"));
		ac.moveToElement(freeyoutubeCoursesLink).perform();
		System.out.println("Free YouTube Courses link is mouse overed");
		Thread.sleep(3000);
		WebElement freeqavideoCoursesLink = driver.findElement(By.xpath("(//a[text()='Free QA Video Courses'])[2]"));
		ac.moveToElement(freeqavideoCoursesLink).perform();
		System.out.println("Free QA Video Courses link is mouse overed");
		driver.findElement(By.linkText("Manual Testing")).click();
		System.out.println("Manual Testing page is opened");
		Thread.sleep(3000);
		//Close the application
		driver.close();
		System.out.println("Parent Window is Closed");



	}

}
