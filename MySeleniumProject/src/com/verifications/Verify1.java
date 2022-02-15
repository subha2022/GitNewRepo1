package com.verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify1 
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//String actualLink = driver.findElement(By.linkText("Customer Service")).getText();
		String actualLink = driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
		String expectedLink = "Customer Serv";
		
		System.out.println("Actual Link : "+ actualLink);
		System.out.println("Expected Link :"+ expectedLink);
		
		// compare these are equal or not
		
		//if(actualLink.equals(expectedLink)) // checks for equality of a string and case also
		//if(actualLink.equals(expectedLink)) // it checks only equality ignore the case
		if(actualLink.contains(expectedLink)) // when we check part of portion make sure the case must be equal
		System.out.println("Both links are equal.........");
		else
		System.out.println("Both links are not equal.......");
		
		driver.close();
		

	}

}