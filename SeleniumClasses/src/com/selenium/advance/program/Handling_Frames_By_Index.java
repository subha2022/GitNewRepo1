package com.selenium.advance.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Frames_By_Index {

	public static void main(String[] args) throws InterruptedException
	{
		String url="https://vinothqaacademy.com/iframe/";
		//Set Properties for Chrome Driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

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
		driver.switchTo().frame(0);

		//Click the Click here to view Course Curriculum link
		driver.findElement(By.linkText("Click here to view Course Curriculum")).click();
		System.out.println("Link is clicked");
		Thread.sleep(3000);

		//Switch back to default content
		driver.switchTo().defaultContent();

		//Active the another frame
		driver.switchTo().frame(1);
		Thread.sleep(3000);

		//Click the ConfirmAlertBox link
		WebElement confirmAlertBoxLink =driver. findElement(By.name("confirmalertbox"));
		confirmAlertBoxLink.click();
		System.out.println("ConfirmAlertBox link is clicked");
		driver.switchTo().alert().accept();
		confirmAlertBoxLink.click();
		driver.switchTo().alert().dismiss();
		//Close the application
		driver.close();




	}

}
