package com.seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingStaticWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://nxtgenaiacademy.com/webtable/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.xpath("//*/tbody/tr[1]/td[2]"));
		String firstNameValue =firstName.getText();
		System.out.println("The First Name is:"+firstNameValue);
		
		WebElement EmpNumber = driver.findElement(By.xpath("//td[contains(text(),'101010')]"));
		String EmpNum=EmpNumber.getText();
		System.out.println("The First Name is:"+EmpNum);
		
		//Another way
		String emailId = driver.findElement(By.xpath("//td[contains(text(),'sundarpichai@gmail.com')]")).getText();
		System.out.println("The Email Id is:"+emailId);
		
		driver.close();
	}

}
