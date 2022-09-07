package MavenNewProject.MavenTestNGNew;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingBrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		
		//Validating title
		
		//System.out.println(driver.getTitle());
		String actualTitle = driver.getTitle();
		String expectedTitle = "Demo Site - Registration Form – NxtGen A.I Academy";	
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Both the Titles are same");
			System.out.println("The Title of the page is:" + actualTitle);
		}else
		{
			System.out.println("Both the Titles are not same");
			System.out.println("The Actual link is:"+ actualTitle);
			System.out.println("The Expected link is:"+ expectedTitle);
		}
		
		driver.findElement(By.partialLinkText("DATA SCIENCE")).click();
    
	}

}
