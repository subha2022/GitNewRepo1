package com.selenium.advance.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_PopUp_Alert {

	public static void main(String[] args) throws InterruptedException 
	{
		String url="https://nxtgenaiacademy.com/alertandpopup/";
		//Set property for Chrome driver 
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		//create object instance for chrome driver
		ChromeDriver driver= new ChromeDriver();
		//lunch the application
		driver.navigate().to(url);
		//Maximize the window
		driver.manage().window().maximize();
		
		//1.Handling the AlertBox
		WebElement alertBox = driver.findElement(By.name("alertbox"));
		//Click the alert box
		alertBox.click();
		System.out.println("Alert Box is clicked");
		Thread.sleep(3000);
		
		//Capture the alert box message
		String alertBoxMsg=driver.switchTo().alert().getText();
		System.out.println(alertBoxMsg);
		
		//click on ok button 
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		//2. Handling Confirm Alert Box
		WebElement confirmAlertBox = driver.findElement(By.name("confirmalertbox"));
		//click the confirm alert box
		confirmAlertBox.click();
		Thread.sleep(3000);
		
		//capture confirm alert box message
		String confirmAlertMsg = driver.switchTo().alert().getText();
		System.out.println(confirmAlertMsg);
		
		//click on ok button
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		confirmAlertBox.click();
		Thread.sleep(3000);
		//Click cancel button
		driver.switchTo().alert().dismiss();
		
		//3.Handling Prompt Alert Box
		WebElement promptAlertBox = driver.findElement(By.name("promptalertbox1234"));
		promptAlertBox.click();
		Thread.sleep(3000);
		//Capture Prompt alert box message
		String promptAlertMsg = driver.switchTo().alert().getText();
		System.out.println(promptAlertMsg);
		
		//click on ok button
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		promptAlertBox.click();
		Thread.sleep(3000);
		//click on cancel button
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		//Close the application
		driver.close();
		
		
		
		
		
		
		
		

	}

}
