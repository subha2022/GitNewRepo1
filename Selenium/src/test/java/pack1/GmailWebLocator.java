package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailWebLocator 
{

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("9853294636");
		driver.findElement(By.id("pass")).sendKeys("05021993sili");
		driver.findElement(By.name("login")).click();
		/*String s1 = driver.findElement(By.className("_9ay7")).getText();
		System.out.println(s1);*/
		driver.findElement(By.xpath("//input[starts-with(@type,'search')]")).sendKeys("Pabitra");
		Thread.sleep(2000);

	}

}
