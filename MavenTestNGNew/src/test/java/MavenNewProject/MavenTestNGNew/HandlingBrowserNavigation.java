package MavenNewProject.MavenTestNGNew;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingBrowserNavigation {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("DATA SCIENCE")).click();
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println("Thank You");

	}

}
