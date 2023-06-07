package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertdemo {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	String actualTitle = driver.getTitle();
	String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualTitle, expectedTitle);
		System.out.println("Both the titles are same");
		//s.assertTrue(actualTitle.equals(expectedTitle), "Both Titles are not equal...");
		driver.findElement(By.linkText("Mobiles")).click();
		System.out.println("Mobiles link is Clicked");
		s.assertAll();
		//Close the application
		driver.close();
		System.out.println("Application is closed");
	


	}

}
