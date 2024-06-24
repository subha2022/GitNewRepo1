package com.selenium.advance.program;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_PopUp_Alert {

	public static void main(String[] args) throws InterruptedException 
	{
		String url="https://vinothqaacademy.com/alert-and-popup/";
		//Set property for Chrome driver 
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		//create object instance for chrome driver
		WebDriver driver= new ChromeDriver();
		
		WebDriverWait myWait = new WebDriverWait(driver,10);
		
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
		
		/* //handle alert without using switchTo.alert(), use explicit wait
		//1.Handling the AlertBox
				WebElement alertBox1 = driver.findElement(By.name("alertbox"));
				//Click the alert box
				alertBox1.click();
				System.out.println("Alert Box is clicked");
				Thread.sleep(3000);
				Alert myAlert = myWait.until(ExpectedConditions.alertIsPresent());
				
				System.out.println(myAlert.getText());
				
				//click on ok button 
				myAlert.accept();
				Thread.sleep(3000);*/
		
		//Close the application
		driver.close();
		
		
		
		
		
		
		
		

	}

}
