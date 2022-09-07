package switchings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameSwitching {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//a[contains(text(),'org.openqa.selenium')]")).click();
		
		driver.switchTo().defaultContent();//for come out from frame
		
		driver.switchTo().frame(driver.findElement(By.name("packageFrame")));// if the element present inside the frame then we should switchto the frame.
		
		driver.findElement(By.linkText("Alert")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("classFrame")));
		driver.findElement(By.linkText("dismiss")).click();
		
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
