package com.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingBrowser {

	public static void main(String[] args) 
	{
		String url="https://itera-qa.azurewebsites.net/home/automation";
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		// Validating the text
		WebElement actText = driver.findElement(By.xpath("//div[@class='jumbotron']/h1[@class='display-3']"));
		String actualRes=actText.getText();
		String expectedRes="Test automation practice form";

		if(actualRes.equals(expectedRes))
		{
			System.out.println("Both the Display Messages are same");
			System.out.println("The Display Message of the page is:" + actualRes);
		}else
		{
			System.out.println("Both the Display Messages are not same");
			System.out.println("The Actual Display Message of the page is:" + actualRes);
			System.out.println("The Expected Display Message of the page is:" + expectedRes);
		}
		driver.close();

	}

}
