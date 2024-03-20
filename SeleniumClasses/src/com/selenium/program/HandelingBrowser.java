package com.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelingBrowser {

	public static void main(String[] args) 
	{
		String url="https://nxtgenaiacademy.com/demo-site/";
		//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver2.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		// Validating the text
		WebElement actText = driver.findElement(By.xpath("//img[contains(@class,'img-responsive logo_transparent_static visible')]"));
		String actualRes=actText.getText();
		System.out.println(actualRes);
		String expectedRes="NxtGen A.I Academy";

		if(actualRes.equals(expectedRes))
		{
			System.out.println("Both the Display Messages are same");
			System.out.println("The Display Message of the page is:" + actualRes);
		}else
		{
			System.out.println("Both the Display Messages are not same");
			System.out.println("The Actual Display Message of the page is:" + actualRes);
			System.out.println("The Expected Display Message of the page is:" + expectedRes);
		}
		driver.close();

	}

}
