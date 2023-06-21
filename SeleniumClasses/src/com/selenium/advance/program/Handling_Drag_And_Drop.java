package com.selenium.advance.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Drag_And_Drop {

	public static void main(String[] args) throws InterruptedException 
	{
		//Name of the Url
		String url="https://testautomationpractice.blogspot.com/";
		//set the system property for chrome driver
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver2.exe");
		//Create driver instance for chrome driver
		ChromeDriver driver = new ChromeDriver();
		//Lunch the application 
		driver.get(url);
		//Maximize the window
		driver.manage().window().maximize();

		//Create object instance for Actions class
		Actions ac=new Actions(driver);

		//Declare the Web Elements
		WebElement dragMe = driver.findElement(By.id("draggable"));
		WebElement dropped = driver.findElement(By.id("droppable"));
		//Perform the drag and drop action 
		ac.dragAndDrop(dragMe, dropped).perform();;
		Thread.sleep(3000);
		System.out.println("Drag and Drop action is performed");

		//close the application
		driver.close();
		System.out.println("Application is closed");

	}

}
