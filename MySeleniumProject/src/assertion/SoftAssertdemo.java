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
	String expectedTitle = "Amazon.in: Amazon Prime";
		
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualTitle, expectedTitle);
		//s.assertTrue(actualTitle.equals(expectedTitle), "Both Titles are not equal...");
		driver.findElement(By.linkText("Mobiles")).click();
		s.assertAll();
	


	}

}
