package MavenNewProject.MavenTestNGNew;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingBrowserNavigation {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("About Me")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		System.out.println("Thank You");

	}

}
