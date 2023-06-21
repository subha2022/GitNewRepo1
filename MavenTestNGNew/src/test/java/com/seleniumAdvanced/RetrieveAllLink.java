package com.seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrieveAllLink {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://nxtgenaiacademy.com/python/";
		driver.get(url);
		driver.manage().window().maximize();
		
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		
		
		for(WebElement list :allLink)
		{
		System.out.println(list.getText()+ "-"+list.getAttribute("href"));
		}
		driver.close();

	}

}
