package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		//1- some string search for it
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		List<WebElement> searchedesult = driver.findElements(By.linkText("a"));
		System.out.println(searchedesult.size());
		//2-count all links
		
		for(WebElement list:searchedesult)
		{
			System.out.println(list.getText() );
		}
		//3-Click on each link using for loop
		//4-get window id's for every window
		//5-close specific browser window






		driver.close();


	}

}
