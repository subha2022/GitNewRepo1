package com.selenium.advance.program;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Frames_By_Name {

	public static void main(String[] args) throws InterruptedException 
	{
		String url="https://vinothqaacademy.com/iframe/";
		String url1="https://ui.vision/demo/webtest/frames/";
		//String url="https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html";
		
		//Set Properties for Chrome Driver
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");

		// Create object instance for chrome driver
		ChromeDriver driver = new ChromeDriver();

		//Lunch the application
		driver.get(url1);

		// Maximize the window
		driver.manage().window().maximize();

		/*//Active frame5
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		//click the link to interact with inner iframe element
		WebElement link = driver.findElement(By.xpath("//a[@href=\"https://a9t9.com\"]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", link);

		WebElement robotImage = driver.findElement(By.id("logo"));
		if(robotImage.isDisplayed())
		{
			System.out.println("Image is Dispalyed");
		}else
		{
			System.out.println("Image is not Dispalyed");
		}
		*/

		 //Active the home page Frame
		driver.switchTo().frame("homepage");

		//Click the Click here to view Click Here For Curriculum link
		driver.findElement(By.linkText("Click Here For Curriculum")).click();
		System.out.println("Link is clicked");

		//Switch back to default content
		driver.switchTo().defaultContent();

		//Active the pop up page frame
		driver.switchTo().frame("popuppage");
		//click go back to home link 
		driver.findElement(By.xpath("//a[@class='btn btn-default']")).click();
		System.out.println("Go back to home link is clicked");
		

		//Switch back to Default content
		driver.switchTo().defaultContent();
		
		//Active form page Frame
		driver.switchTo().frame("formpage");
		// Enter the first name
		driver.findElement(By.name("vfb-5")).sendKeys("Subhasmita");
		System.out.println("First Name is entered"); 

		/*//Active the list Frame
		driver.switchTo().frame("iframeResult");
		//Enter the first name
		driver.findElement(By.id("fname")).sendKeys("Subhasmita");
		//Enter the last name
		driver.findElement(By.id("lname")).sendKeys("Jena");
		//Click the submit button
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		//Switch back to Default content
		driver.switchTo().defaultContent();
		//click on run button
		driver.findElement(By.id("runbtn")).click();*/
		
		//close the application
		driver.close();













	}

}
