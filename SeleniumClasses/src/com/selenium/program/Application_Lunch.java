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

	public static void main(String[] args) throws InterruptedException
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
		//String url="https://vinothqaacademy.com/multiplewindows/";
		String url="https://vinothqaacademy.com/demo-site/";
		driver.get(url);
		driver.manage().window().maximize();
		//String pageTitle = driver.getTitle();
		//System.out.println(pageTitle);
		String nameid="vfb-5";
		String name="Subhasmita";
		WebElement firstName = driver.findElement(By.name("vfb-5"));
		if(firstName.isDisplayed())
		{
			System.out.println("First Name is displayed");
		}else
		{
			System.out.println("First Name is not displayed");
		}
		
		if(firstName.isEnabled())
		{
			System.out.println("First Name is enabled");
			firstName.sendKeys(name);
		}else
		{
			System.out.println("First name is not enabled");
		}
		Thread.sleep(3000);
		firstName.clear();
		driver.close();
	
	}
}
