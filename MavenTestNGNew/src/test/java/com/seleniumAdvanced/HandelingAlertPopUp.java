package com.seleniumAdvanced;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingAlertPopUp {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://nxtgenaiacademy.com/alertandpopup/";
		driver.get(url);
		driver.manage().window().maximize();
		
		//1.Handling Alert Box
		WebElement alertBox = driver.findElement(By.name("alertbox"));
		alertBox.click();
		Thread.sleep(3000);
		
		//Capture the message
		String alertBoxMsg=driver.switchTo().alert().getText();
		System.out.println(alertBoxMsg);
		Thread.sleep(3000);
		// click on ok button
		driver.switchTo().alert().accept();
		
		//2 confirm alert box
		WebElement crfmAlertBox = driver.findElement(By.name("confirmalertbox"));
		System.out.println(crfmAlertBox);
		crfmAlertBox.click();
		Thread.sleep(3000);
		
		//Capture the message
		String cfrmAlertMsg = driver.switchTo().alert().getText();
		System.out.println(cfrmAlertMsg);
		
		Thread.sleep(3000);
		// for click ok button
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		crfmAlertBox.click();
		
		// for cancel ok button
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		// 3. Handling Prompt Alert Box
		
		WebElement promptAlertBox = driver.findElement(By.name("promptalertbox1234"));
		promptAlertBox.click();
		Thread.sleep(3000);
		//Activate the alert popup alternative way
		Alert alt = driver.switchTo().alert();
		//Capture the message
		String promptAlertMsg =alt.getText();
		System.out.println(promptAlertMsg);
		//Enter Yes
		alt.sendKeys("Yes");
		Thread.sleep(3000);
		alt.accept();
		Thread.sleep(3000);
		
		promptAlertBox.click();
		Thread.sleep(3000);
		alt.sendKeys("No");
		Thread.sleep(3000);
		alt.dismiss();
		Thread.sleep(3000);
		driver.close();
		

	}

}
