package com.seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassMouseOver {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://nxtgenaiacademy.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		//perform mouse over
		
		Actions action= new Actions(driver);
		WebElement qaAutomation=driver.findElement(By.linkText("QA AUTOMATION"));
		action.moveToElement(qaAutomation).perform();
		//driver.findElement(By.xpath("//span[contains(text(),'A to Z')]")).click();
		
		WebElement  pracAutomation = driver.findElement(By.xpath("//span[contains(text(),'Practice Automation')]"));
		action.moveToElement(pracAutomation).perform();
		//Click Demo site Registration form
		WebElement RegForm=driver.findElement(By.xpath("//span[contains(text(),'Demo Site – Registration Form')]"));
		RegForm.click();
		System.out.println("The Program is Executing Successfully");
		driver.close();
		
	}

}
