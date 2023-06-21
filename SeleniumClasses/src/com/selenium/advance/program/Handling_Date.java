package com.selenium.advance.program;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Date {
	public static void selectDate(WebElement calendar, String year, String monthName, String day, WebDriver driver)
			throws Exception {
		// Click on Calendar
		calendar.click();
		System.out.println("calender Link is clicked.");

		// Retrieve the current year and month
		WebElement date = driver.findElement(By.className("DayPicker-Caption"));
		String currentYear = date.getText();
		System.out.println(currentYear);

		// Next Button
		WebElement next = driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]"));
		System.out.println("Next button is working.");

		// Click on next arrow till we get the desired year
		if (!currentYear.contains(year)) {
			do {
				next.click();
			} while (!date.getText().contains(year));
		}
		System.out.println("The year selected is:" + year);

		// Select the month
		String currentMonth = date.getText();
		if (!currentMonth.contains(monthName)) {
			do {
				next.click();
			} while (!date.getText().contains(monthName));
		}
		System.out.println("The Month selected is:" + monthName);

		// Select the Date
		
		WebElement selectDepartDay = driver.findElement(By.xpath("//p[contains(text(),'"+day+"')]"));
		Thread.sleep(3000);
		selectDepartDay.click();
		
		System.out.println("The Date Selected is:" + day);
		
	}

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch URL
		driver.get("https://www.makemytrip.com/");
		System.out.println("Browser is Lunched.");
		driver.manage().window().maximize();

		// Click on Calendar
		Thread.sleep(3000);
		WebElement departure = driver.findElement(By.xpath("//span[contains(text(),'Departure')]"));
		WebElement returning = driver.findElement(By.xpath("//span[contains(text(),'Return')]"));

		// Selecting the Departure
		Handling_Date.selectDate(departure, "2024", "March", "7", driver);
		// Selecting the Return Date
		Handling_Date.selectDate(returning, "2024", "March", "8", driver);
		
		driver.close();
		
		System.out.println("Appliation is closed.");
	}

}
