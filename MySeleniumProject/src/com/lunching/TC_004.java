package com.lunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_004 extends BaseTest0
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new FirefoxDriver();
		//driver.navigate().to("https://www.iciccbank.com/");
		
		init();
		
		luncher("chromebrowser");
		
		navigateUrl("iciciurl");
	}

}
