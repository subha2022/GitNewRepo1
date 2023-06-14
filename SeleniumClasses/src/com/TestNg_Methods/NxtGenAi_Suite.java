package com.TestNg_Methods;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NxtGenAi_Suite {

	WebDriver driver = null;

	@BeforeSuite(groups = { "Smoke", "Sanity", "Regression" })
	public void lunchApplication() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Application is Lunched.");
	}

	@AfterSuite(groups = { "Smoke", "Sanity", "Regression" })
	public void closeApplication() {
		driver.close();
		System.out.println("Application is Closed.");
	}

	@Test(groups = { "Smoke", "Sanity", "Regression" }, priority = 1)
	public void navigateToRegisterDemo() {

		WebElement demoSite = driver.findElement(By.linkText("Demo Sites"));
		Actions ac = new Actions(driver);
		ac.moveToElement(demoSite).perform();
		System.out.println("Registration Demo is Displayed.");
		WebElement prcAutomation = driver.findElement(By.linkText("Practice Automation"));
		ac.moveToElement(prcAutomation).perform();
	}

	@Test(groups = { "Smoke", "Sanity", "Regression" }, priority = 2)
	public void registerForDomo() {
		Actions ac = new Actions(driver);
		WebElement demoRegForm = driver
				.findElement(By.xpath("(//a[contains(text(),'Demo Site – Registration Form')])[2]"));
		ac.moveToElement(demoRegForm).perform();
		System.out.println("User is Registered.");
	}

	@Test(groups = { "Smoke", "Sanity", "Regression" }, priority = 3)
	public void navigateToPythonForDataScience() {
		Actions ac = new Actions(driver);
		WebElement pythonForAutomation = driver.findElement(By.linkText("Python for Automation"));
		ac.moveToElement(pythonForAutomation).perform();
		System.out.println("Python for Data Science Page is Displayed.");
	}

	@Test(groups = { "Sanity", "Regression" }, priority = 4)
	public void navigateToAutomationWindow() {
		driver.findElement(By
				.xpath("(//li[@class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-4133\"])[2]"))
				.click();
		;
		System.out.println("Automation Window is Dislayed.");
	}

	@Test(groups = { "Sanity", "Regression" }, priority = 5)
	public void handelNewBrowserWindow() {
		driver.findElement(By.xpath("//*[@id=\"button1\"]")).click();
		// Get window's Id's
		Set<String> WindowId = driver.getWindowHandles();
		Iterator<String> Iterator = WindowId.iterator();
		// Storing Window Id to the respective windows
		String homePage = Iterator.next();// Home page
		String nextPage = Iterator.next();// New Window Page

		// Display the Respective window id's
		System.out.println("Parent Page window id is:" + homePage);
		System.out.println("Child Page window id is:" + nextPage);

		// Switch the control to the new window and perform all the operation in new
		// window
		driver.switchTo().window(nextPage);
		System.out.println("Child page is activated");
		driver.manage().window().maximize();
		driver.close();
		// Switch the control to the Home page
		driver.switchTo().window(homePage);
		System.out.println("New Browser Window is Handled.");
	}

	@Test(groups = { "Regression" }, priority = 6)
	public void handleNewMessageWindow() {
		driver.findElement(By.xpath("//*[@id=\"button1\"]")).click();
		// Get Windows Id's
		Set<String> windowsId = driver.getWindowHandles();
		Iterator<String> Iterator = windowsId.iterator();
		// Storing Window Id to the respective windows
		String homePage = Iterator.next();
		String nextPage = Iterator.next();
		// Display the Respective window id's
		System.out.println("Parent Page Window Id is" + homePage);
		System.out.println("Child Page Window Id is" + nextPage);
		// Switch the control to the new window and perform all the operation in new
		// window
		driver.switchTo().window(nextPage);
		driver.manage().window().maximize();
		driver.close();
		// Switch the control to the Home page
		driver.switchTo().window(homePage);
		System.out.println("New Message Window is Handled.");
	}

	@Test(groups = { "Regression" }, priority = 7)
	public void handelNewTab() {
		driver.findElement(By.name("145newbrowsertab234")).click();
		//Get Windows Id's
		Set<String> windowId = driver.getWindowHandles();
		Iterator<String>Iterator =windowId.iterator();
		//Storing WIndow Id's 
		String homepage = Iterator.next();
		String nextPage = Iterator.next();
		
		//Display the Respective window Id's
		System.out.println("Patent Window Id's"+homepage);
		System.out.println("Child Window Id's"+nextPage);
		//Switch the control to the next page 
		driver.switchTo().window(nextPage);
		driver.manage().window().maximize();
		driver.close();
		driver.switchTo().window(homepage);
		System.out.println("New Tab is Handled.");
	}

	@Test(groups = { "Sanity", "Regression" }, priority = 8)
	public void navigateToAutomationAlertPopUp() {
		System.out.println("Alert Popup is Displayed.");
	}

	@Test(groups = { "Sanity", "Regression" }, priority = 9)
	public void handleConfirmAlertPopUp() {
		System.out.println("Confirm Alert PopUp is Handled.");
	}

	@Test(groups = { "Regression" }, priority = 10)
	public void handelAlertPopUp() {
		System.out.println("Alert PopUp is Handled");
	}

	@Test(groups = { "Regression" }, priority = 11)
	public void handelPromptPopUp() {
		System.out.println("Prompt PopUp is Handled.");
	}

	@Test(groups = { "Sanity", "Regression" }, priority = 12)
	public void navigateToAUtomationTable() {
		System.out.println("Automation Table is Displayed.");
	}

	@Test(groups = { "Sanity", "Regression" }, priority = 13)
	public void extractEmployeeDetails() {
		System.out.println("Employee Details is Extracted.");
	}
}
