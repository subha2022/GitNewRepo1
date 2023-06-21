package com.selenium.program;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Application_Lunch {

	public static void main(String[] args)
	{
		/*String url="https://nxtgenaiacademy.com/";
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver1.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.close();
		System.out.println("The Application is successfully lunched with Chrome Browser");*/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://nxtgenaiacademy.com/multiplewindows/");
		driver.manage().window().maximize();
		
		
		
		driver.close();
	
	}
}
