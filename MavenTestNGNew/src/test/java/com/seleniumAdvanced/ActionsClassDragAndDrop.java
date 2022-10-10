package com.seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDragAndDrop {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/droppable/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement dragMe=driver.findElement(By.id("draggable"));
		WebElement dropHere = driver.findElement(By.id("droppable"));
		Actions action= new Actions(driver);
		//perform drag and drop
		action.dragAndDrop(dragMe, dropHere).perform();
		driver.close();
	}

	

}
