package com.selenium.advance.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Frames_By_Name {

	public static void main(String[] args) 
	{
		String url="https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html";
		//Set Properties for Chrome Driver
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		
		// Create object instance for chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		//Lunch the application
		driver.get(url);
		
		// Maximize the window
		driver.manage().window().maximize();
		
		/*Frame Name=You can find it within the iframe tag
		 * packageListFrame
		 * packageFrame
		 * classFrame
		*/
		
		//Active the list Frame
		driver.switchTo().frame("packageListFrame");
		
		//Click the link
		driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
		System.out.println("Selenium Chrome link is clicked");
		
		//Switch back to default content
		driver.switchTo().defaultContent();
		
		//Active the package frame
		driver.switchTo().frame("packageFrame");
		//click the link 
		driver.findElement(By.xpath("/html/body/main/div/section[2]/ul/li/a")).click();
		System.out.println("ChromeDriverLogLevel link is clicked");
		
		//Switch back to Default content
		driver.switchTo().defaultContent();
		
		//Active Class Frame
		driver.switchTo().frame("classFrame");
		// Click the link
		driver.findElement(By.linkText("HELP")).click();
		System.out.println("Help link is clicked");

		//close the application
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
