package com.selenium.program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Select_DropDown {

	public static void main(String[] args)
	{
		String url="https://nxtgenaiacademy.com/webtable/";

		//set properties for Chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver1.exe");

		// create instance for Chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Lunch the application
		driver.get(url);

		//Maximize the window
		driver.manage().window().maximize();
		
		WebElement programMultiSelect = driver.findElement(By.name("programming"));
		
		//Verify Multiple Select Drop Down list is Displayed
		if(programMultiSelect.isDisplayed())
		{
			
			//Create Select class object instance
			Select selctMulDropDown=new Select(programMultiSelect);
			String listValue1="JAVA";
			String listValue2="Ruby";
			
			//Select using Value
			selctMulDropDown.selectByValue(listValue1);
			
			//Select using Visible Text
			selctMulDropDown.selectByVisibleText(listValue2);
			
			//Select using Index
			selctMulDropDown.selectByIndex(4);
			
			//Deselecting 
			selctMulDropDown.deselectByVisibleText(listValue2);
			
			System.out.println("Multiple Select Drop Down list is Displayed");
		}else
		{
			System.out.println("Multiple Select Drop Down list is not Displayed");
		}
		//Close the application
		driver.close();
		
	}

}
