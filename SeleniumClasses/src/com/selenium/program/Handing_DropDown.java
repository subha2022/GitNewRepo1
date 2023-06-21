package com.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handing_DropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		String url="https://itera-qa.azurewebsites.net/home/automation";

		//set properties for Chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		// create instance for Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Lunch the application
		driver.get(url);

		//Maximize the window
		driver.manage().window().maximize();

		WebElement dropDown = driver.findElement(By.xpath("//select[@class='custom-select']"));
		//Verify the Select Option Drop Down is Displayed
		if(dropDown.isDisplayed())
		{
			System.out.println("Select Option drop down is displayed");
		}else
		{
			System.out.println("Select Option drop down is not displayed");
		}

		//Verify the Select Option Drop Down is Enabled
		if(dropDown.isEnabled())
		{
			System.out.println("Select Option drop down is enabled");
		}else
		{
			System.out.println("Select Option drop down is not enabled");
		}
		
		//Create Select Class object instance
		Select selectOpt=new Select(dropDown);
		String listvalueOne="Norway";
		String listValueTwo="3";
		
		if(dropDown.isEnabled())
		{
			//Select using  Visible Text
			selectOpt.selectByVisibleText(listvalueOne);
			Thread.sleep(3000);
			//Select using Value
			selectOpt.selectByValue(listValueTwo);
			Thread.sleep(3000);
			//Select using Index 
			selectOpt.selectByIndex(5);
			Thread.sleep(3000);
			
		}else
		{
			System.out.println("Select Option drop down is not enabled");
		}
		//Close the application
		driver.close();

	}

}
