package synchronizations;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/progress-bar";
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Parent Browser is opened");
		
		// Click on start button
		driver.findElement(By.id("startStopButton")).click();
		
		WebElement reset;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		reset = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetButton")));
		
		reset.click();
		System.out.println("Reset Button is clicked");
		
		
		
		//driver.findElement(By.id("resetButton")).click();
	}

}
