package com.seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFramename {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String url = "https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html";
		driver.get(url);
		driver.manage().window().maximize();

		//packageListFrame , packageFrame

		// Activate the list frame
		driver.switchTo().frame("packageListFrame");
		// click the link
		driver.findElement(By.xpath("/html/body/main/ul/li[4]/a")).click();
		System.out.println("Selenium Chrome link is clicked");

		// Mandatory Step = Switch back to default content
		driver.switchTo().defaultContent();

		// Activate the package frame
		driver.switchTo().frame("packageFrame");

		// click the link
		driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[7]/a")).click();
		System.out.println("Chrome Option link is clicked");

		driver.switchTo().defaultContent();

		// Activate the package frame
		driver.switchTo().frame("classFrame");

		// click the link
		driver.findElement(By.linkText("HELP")).click();
		System.out.println("Help Option link is clicked");



	}

}
