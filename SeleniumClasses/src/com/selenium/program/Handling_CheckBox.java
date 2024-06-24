package com.selenium.program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_CheckBox {

	public static void main(String[] args) throws InterruptedException 
	{
		String url="https://vinothqaacademy.com/demo-site/";
		String testNGXpath="vfb-20[]";
		
		//set properties for Chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		// create instance for Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Lunch the application
		driver.get(url);
		
		//Maximize the window
		driver.manage().window().maximize();

		//Declaring the web element object
		WebElement testNGCheckBox = driver.findElement(By.name(testNGXpath));

		//Verify the testNG Check Box is displayed
		if(testNGCheckBox.isDisplayed())
		{
			System.out.println("testNG Check Box is Displayed");
		}else
		{
			System.out.println("testNG Check Box is not Displayed");
		}
		//Verify the testNG Check Box is enabled 
		if(testNGCheckBox.isEnabled())
		{
			System.out.println("testNG Check Box is enabled");	 
		}
		else
		{
			System.out.println("testNG Check Box is enabled");
		}
		Thread.sleep(3000);

		//Verify the testNG Check Box is Selected
		if(testNGCheckBox.isSelected())
		{
			System.out.println("testNG Check Box is Selected");
		}
		else
		{
			System.out.println("testNG Check Box is not Selected");
			//click Check Box Button
			testNGCheckBox.click();
		}
		
		//Verify the testNG Check Box is Selected 
		if(testNGCheckBox.isSelected())
		{
			System.out.println("testNG Check Box is Selected");
		}
		else
		{
			System.out.println("testNG Check Box is not Selected");
		}
		
		//1.Selecting all check boxes
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='vfb-checkbox  ']"));
		/*for(int i=0;i<checkBoxes.size();i++)
		{
			checkBoxes.get(i).click();
		}
		
		//enhanced for loop
		for(WebElement checkBox:checkBoxes)
		{
			checkBox.click();
		}
		
		//2.Select last 3 check boxes
		 //total no of check boxes-how many checkboxes wants to select=starting index
		  //6-3=3(starting index)		
		  for(int i=3;i<checkBoxes.size();i++)
		  {
			  checkBoxes.get(i).click();
		  }
		//3. 1st 3 check boxes
		for(int i=0;i<3;i++) {
			checkBoxes.get(i).click();
		}
		Thread.sleep(3000);
		//4. unselect check boxes if they are selected
		for(int i=0;i<3;i++) 
		{
			if(checkBoxes.get(i).isSelected()) {
				checkBoxes.get(i).click();
			}
			
		}*/
		Thread.sleep(3000);
		//close the application
		driver.close();



	}
}
