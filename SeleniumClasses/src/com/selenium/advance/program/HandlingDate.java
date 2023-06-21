package com.selenium.advance.program;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDate {

	public static void main(String[] args) throws Exception {
		//Set the system property for chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		//Create instance of chrome variable
		ChromeDriver driver= new ChromeDriver();
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String url = "https://www.makemytrip.com/";
		//Lunch the application
				driver.get(url);
				//Maximize the window
				driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[contains(text(),'Departure')]")).click();
		System.out.println("Departure link is clicked.");
		Thread.sleep(3000);
		String dateXpath ="(//p[contains(text(),'14')])[1]";
		driver.findElement(By.xpath(dateXpath)).click();
		System.out.println("Date is selected");
		/*String year="2024";
		String month="May";
		String date="25";
		//Lunch the application
		driver.get(url);
		//Maximize the window
		driver.manage().window().maximize();

		//Click the calendar link
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label/span")).click();

		//Next Button
		WebElement nextButton = driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]"));
		Thread.sleep(3000);
		//Receive the month and year text
		WebElement Date=driver.findElement(By.className("DayPicker-Caption"));
		String currentYear=Date.getText();
		System.out.println(currentYear);

		//Click on next arrow button until we get the desire year
		if(!currentYear.contains(year)){
			do {
				nextButton.click();
			}while(!Date.getText().contains(year));

		}
		System.out.println("The Year Selected is:"+year);

		//Click on next button until we get the required month
		String cMonth=Date.getText();
		if(!cMonth.contains(month)) {
			do {
				nextButton.click();
			}while(!Date.getText().contains(month));

		}
		System.out.println("The Month Selected is:"+month);
		//Select the date
		WebElement selectDay = driver.findElement(By.xpath("//p[contains(text(),'"+date+"')]"));
		Thread.sleep(3000);
		selectDay.click();
		System.out.println("The Day Selected is:"+date);
	}*/


}


}


