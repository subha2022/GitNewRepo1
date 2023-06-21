package com.selenium.advance.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Frames_By_Index {

	public static void main(String[] args) throws InterruptedException
	{
		String url="https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html";
		//Set Properties for Chrome Driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver1.exe");
		
		// Create object instance for chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		//Lunch the application
		driver.get(url);
		
		// Maximize the window
		driver.manage().window().maximize();
		
		/*Active the list Frame
		driver.switchTo().frame(0);
		//Click the link
		driver.findElement(By.linkText("org.openqa.selenium.bidi.log")).click();
		System.out.println("Selenium bidi is clicked");
		
		//Switch back to default content
		driver.switchTo().defaultContent();*/
		
		//Active the another Frame
		driver.switchTo().frame(1);
		
		/*Click the link
		driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[7]/a")).click();
		System.out.println("Chrome Option link is clicked");*/
		
		driver.findElement(By.linkText("Action")).click();
		System.out.println("Action Option link is clicked");
		Thread.sleep(3000);
		
		//Switch back to default content
		driver.switchTo().defaultContent();
		
		//Active the another frame
		driver.switchTo().frame(2);
		Thread.sleep(3000);
		
		//Click the link
		driver.findElement(By.linkText("TREE")).click();
		System.out.println("Tree Link is clicked");
		
		//Close the application
		driver.close();
		
		
		

	}

}
