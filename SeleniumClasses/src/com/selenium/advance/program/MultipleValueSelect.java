package com.selenium.advance.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleValueSelect {

	public static void main(String[] args) throws InterruptedException
	{
		//Parameterize input value
		String url="https://demoqa.com/selectable/";
		// Set the system property for chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver2.exe");

		//Create the driver instance for chrome driver
		ChromeDriver driver = new ChromeDriver();
		//Lunch the url
		driver.get(url);
		//Maximize the window
		driver.manage().window().maximize();
		
		//Click on Grid Tab
		driver.findElement(By.id("demo-tab-grid")).click();
		//Declaring the web elements object
		 WebElement oneTab = driver.findElement(By.xpath("(//li[@class=\"list-group-item list-group-item-action\"])[1]"));
		 WebElement twoTab = driver.findElement(By.xpath("(//li[@class=\"list-group-item list-group-item-action\"])[2]"));
		 WebElement threeTab = driver.findElement(By.xpath("(//li[@class=\"list-group-item list-group-item-action\"])[3]"));
		 WebElement fourTab = driver.findElement(By.xpath("(//li[@class=\"list-group-item list-group-item-action\"])[4]"));

		//Create object instance for Actions class by passing webdriver instance
		Actions ac =new Actions(driver);
		
		//To select multiple values
		ac.keyDown(Keys.CONTROL).click(oneTab).pause(3000
				).click(threeTab).click(fourTab).keyUp(Keys.CONTROL);
		
		//To perform the action
		ac.perform();
		System.out.println("Multiple Value is Selected");
		
		Thread.sleep(3000);
		//Close the application
		driver.close();
		System.out.println("Application is closed");
	}

}
