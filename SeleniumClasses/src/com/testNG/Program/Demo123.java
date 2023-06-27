package com.testNG.Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo123
{
	WebDriver driver;
	
	public static void main(String[] args) throws Exception {

		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.gecko.driver",".\\Drivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		String url="https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Application is Lunched.");
		

		WebElement demoSite = driver.findElement(By.linkText("Demo Sites"));
		Actions ac= new Actions(driver);
		ac.moveToElement(demoSite).perform();
		System.out.println("Registration Demo is Displayed.");
		
		WebElement prcAutomation = driver.findElement(By.linkText("Practice Automation"));
		ac.moveToElement(prcAutomation).perform();
	
		WebElement demoRegForm = driver.findElement(By.xpath("(//a[contains(text(),'Demo Site – Registration Form')])[2]"));
		Thread.sleep(3000);
		ac.moveToElement(demoRegForm).perform();
		System.out.println("User is Registered.");
		System.out.println("This is new Line");
		System.out.println("This is 2ndnew Line"); 

	}
}
