package com.TestNg_Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenNavigation_CoustomizeListener {

	public static WebDriver driver;
	public static Actions ac ;

	@BeforeClass

	public void lunchApplication() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Application is Lunched.");
		
	}

	@AfterClass
	public void closeApplication() {
		driver.close();
		System.out.println("Application is Closed.");

	}

	@Test(priority=1)
	public static void navigateToRegistrationForm() {
		WebElement demoSite = driver.findElement(By.linkText("Demo Sites"));
		ac = new Actions(driver);
		ac.moveToElement(demoSite).perform();
		System.out.println("Registration Demo is Displayed.");
		WebElement prcAutomation = driver.findElement(By.linkText("Practice Automation"));
		ac.moveToElement(prcAutomation).perform();
		System.out.println("Page Navigate to Register Form");
		
	}
	@Test( priority = 2)
	public void registerForDomo() {
		 ac = new Actions(driver);
		WebElement demoRegForm = driver	.findElement(By.xpath("(//a[contains(text(),'Demo Site – Registration Form')])[2]"));
		ac.moveToElement(demoRegForm).perform();
		System.out.println("User is Registered.");
	}

	@Test(priority=2)
	public void navigateToAlertAndPopUp() {
		ScreenNavigation_CoustomizeListener.navigateToRegistrationForm();
		driver.findElement(By.xpath("(//a[contains(text(),'Demo Site – nAlert and Popup')])[2]")).click();
		System.out.println("Page Navigate to Alert and PopUp");
	}

	@Test(priority=3)
	public void navigateToMultipleWindows() throws InterruptedException {
		ScreenNavigation_CoustomizeListener.navigateToRegistrationForm();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[contains(text(),'Demo Site – WebTable')])[2]")).click();
		System.out.println("Page Navigate to Multipule Windows");
	}

	@Test(priority=4)
	public void navigateToWebTable() {
		ScreenNavigation_CoustomizeListener.navigateToRegistrationForm();
		driver.findElement(By.xpath("(//a[contains(text(),'Demo Site – WebTable')])[2]")).click();
		System.out.println("Page Navigate to WebTable");
		throw new SkipException("Skipping WebTable Navigation for demo purpose");
	}


}
