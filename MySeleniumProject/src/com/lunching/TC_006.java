package com.lunching;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_006 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.navigate().forward();
		driver.navigate().refresh();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("MyGlamm Lipstick");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[contains(text(),'MyGlamm LIT Liquid Matte Lipstick (Slow Fade), 3 g - PETA Approved, Cruelty-Free & Vegan')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='add-to-cart-button'])[1]")).click();
		//driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();	
		driver.findElement(By.cssSelector("#add-to-cart-button")).click();
		driver.close();
		
	}

}
