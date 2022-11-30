package com.selenium.program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Application_Lunch {

	public static void main(String[] args)
	{
		String url="https://nxtgenaiacademy.com/";
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.close();
		System.out.println("The Application is successfully lunched with Chrome Browser");
		

	}

}
