package synchronizations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoExplicitWait
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe\\");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String gt = driver.getTitle();
		System.out.println(gt);
		driver.findElement(By.id("email")).sendKeys("9853294636");
		driver.findElement(By.name("pass")).sendKeys("05021993sili");
		driver.findElement(By.name("login")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Friends")));
		element.click();
		
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("All Friends")));
		element1.click();
		
		
		driver.quit();
	}

}
