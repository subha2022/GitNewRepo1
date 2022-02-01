package com.lunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_005 extends BaseTest0
{

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		
		init();
		
		luncher("chromebrowser");
		
		navigateUrl("amazonurl");
		
		selectOption("amazondropbox_id", "Books");
				
		typeText("amazonsearchtextbox_name","Harry Potter");
		
		clickElement("amazonsearchbutton_xpath");
		
				
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Book");
		
		/*WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		loc.sendKeys("Book");
		
		driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();*/
	}

	

}
