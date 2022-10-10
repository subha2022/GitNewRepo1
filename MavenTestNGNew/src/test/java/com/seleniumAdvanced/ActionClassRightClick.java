package com.seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassRightClick {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://demo.guru99.com/test/simple_context_menu.html";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement rightClick = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		WebElement deleteOption = driver.findElement(By.xpath("//span[contains(text(),'Delete')]"));
		Actions action= new Actions(driver);
		
		//perform right click
		action.contextClick(rightClick).click(deleteOption).perform();
		Thread.sleep(3000);
		
		// click the ok button popup
		driver.switchTo().alert().accept();
		driver.close();
		System.out.println("The program is success");
		
		
		

	}

}
