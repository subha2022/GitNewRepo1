package MavenNewProject.MavenTestNGNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropdownList {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// lunch the application
		String url ="https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);
		// Maximize
		driver.manage().window().maximize(); 
		
		// select the country drop down
		WebElement countryDropDown = driver.findElement(By.id("vfb-13-country"));
		String countryOne = "India";
		String countryTwo = "United States of America";
		if(countryDropDown.isDisplayed())
		{
			System.out.println("The Country Drop Down list is displayed");
			
			//Create the object instance for the select class
			Select cDropDown = new Select(countryDropDown);
			//Select by visible text
			cDropDown.selectByVisibleText(countryOne);
			System.out.println("The Selected Country is:" +countryOne);
			
			Thread.sleep(3000);
			
			// Select by Value
			cDropDown.selectByValue(countryTwo);
			System.out.println("The Selected Country is:" +countryTwo);
			
			Thread.sleep(3000);
			
			// Select by Index=9 means Aurstralia
			
			cDropDown.selectByIndex(9);
			
		}else
		{
			System.out.println("The Country Drop Down list is not displayed");
		}
		
	}

}
