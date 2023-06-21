package com.selenium.advance.program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiple_Browsers_Message 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Storing the url in String
		String url = "https://nxtgenaiacademy.com/multiplewindows/";
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
		WebElement newMsgWindow = driver.findElement(By.name("newmessagewindow321"));
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
		//Click Free Automation Courses link in the parent window
		driver.findElement(By.linkText("Free Automation Courses")).click();
		System.out.println("Free Automation Courses page is opened");
		Thread.sleep(3000);
		//Close the application
		driver.close();
		System.out.println("Parent Window is Closed");



	}

}
