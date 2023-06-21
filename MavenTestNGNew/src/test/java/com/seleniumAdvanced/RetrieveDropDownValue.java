package com.seleniumAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrieveDropDownValue
{

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement countryDropDown = driver.findElement(By.id("vfb-13-country"));
		Select cdropDown = new Select(countryDropDown) ;
		List<WebElement> values = cdropDown.getOptions();
		System.out.println(values);
		
		int valueCount=values.size();
		for(int i=0;i<valueCount;i++)
		{
			String options = values.get(i).getText(); 
			
			System.out.println(options);
		}
		driver.close();

	}

}
