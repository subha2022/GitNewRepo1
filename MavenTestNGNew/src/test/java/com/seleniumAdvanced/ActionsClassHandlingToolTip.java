package com.seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassHandlingToolTip {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String url ="https://www.google.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement googleSearchBox= driver.findElement(By.name("q"));
		//Create Actions class object instance 
		Actions action = new Actions(driver);
		// moveToElement
		action.moveToElement(googleSearchBox).build().perform();
		
		//Validate the ToolTip message
		String actMsg=googleSearchBox.getAttribute("title");
		String expMsg="Search";
		if(actMsg.equals(expMsg))
		{
			System.out.println("Both the titles are same");
			System.out.println("The actual Message is:"+actMsg);
		}else
		{
			System.out.println("Both the titles are not same");
			System.out.println("The actual Message is:"+actMsg);
			System.out.println("The actual Message is:"+expMsg);
		}
		driver.close();
		
				

	}

}
