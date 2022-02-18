package com.lunching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example_01 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/companies/market-capitalisation/groupa");
		driver.manage().window().maximize();
		String price = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[4]/td[4]")).getText(); //static way
		System.out.println(price);
		
		String p = driver.findElement(By.xpath("//a[contains(text(),'Infosys')]/parent::*/following-sibling::td[3]")).getText(); //dynamic way
		System.out.println(p);
	}

}
