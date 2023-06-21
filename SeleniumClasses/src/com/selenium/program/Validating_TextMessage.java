package com.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validating_TextMessage {

	public static void main(String[] args)
	{
		String url="https://nxtgenaiacademy.com/demo-site/";
				
		//set properties for Chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver1.exe");
		
		// create instance for Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Lunch the application
		driver.get(url);
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Positive Scenario
		
		WebElement regTitle = driver.findElement(By.xpath("(//div[@class='vfb-legend'])[1]"));
		
		//Validating Registration Title is displayed
		if(regTitle.isDisplayed())
		{
			System.out.println("Registration Title is Displayed");
			
			//Validating the title text
			String regActualText = regTitle.getText();
			String regExpectedText="Register For Demo";
			
			if(regActualText.equals(regExpectedText))
			{
				System.out.println("Both the Texts are same");
				System.out.println("The Actual Text is:"+regActualText);
			}else
			{
				System.out.println("Both the Texts are not same");
				System.out.println("The Actual Text is:"+regActualText);
				System.out.println("The Expected Text is:"+regExpectedText);
			}
		}else
		{
			System.out.println("Registration Title is Displayed");
		}
		
		//click the submit button
		driver.findElement(By.id("vfb-4")).click();
		
		//Negative Scenario
		
		WebElement firstNameErrMsg = driver.findElement(By.xpath("(//label[@class='vfb-error'])[1]"));
		//Verify First Name Error Message is displayed
		if(firstNameErrMsg.isDisplayed())
		{
			System.out.println("First Name Error message is displayed");
			//Verify the Error Text Message
			String actualErrTextMsg=firstNameErrMsg.getText();
			String expaectedErrTextMsg="This field is required.";
			
			if(actualErrTextMsg.equals(expaectedErrTextMsg))
			{
				System.out.println("Both the error text messages are same");
				System.out.println("The actual error message is:"+actualErrTextMsg);
			}else
			{
				System.out.println("Both the error text messages are same");
				System.out.println("The actual error message is:"+actualErrTextMsg);
				System.out.println("The Expaceted error message is:"+expaectedErrTextMsg);
			}
		}else
		{
			System.out.println("First Name Error message is not displayed");
		}
		//close the application
		driver.close();
				

	}

}
