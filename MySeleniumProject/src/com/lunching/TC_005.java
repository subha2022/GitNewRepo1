package com.lunching;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_005 extends BaseTest0
{
	private static final Logger log = Logger.getLogger(TC_005.class);
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		
		init();
		log.info("Init the properties files....");
		luncher("chromebrowser");
		log.info("Opened the browse : "+ p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to url : " +childprop.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id", "Books");
		log.info("Selected option Books by using locator : " +orProp.getProperty("amazondropbox_id"));
				
		typeText("amazonsearchtextbox_name","Harry Potter");
		log.info("Enter the text Harry Potter By using locator : " + orProp.getProperty("amazonsearchtextbox_name"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked the element By using locator: " + orProp.getProperty("amazonsearchbutton_xpath"));
				
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Book");
		
		/*WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		loc.sendKeys("Book");
		
		driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();*/
	}

	

}
