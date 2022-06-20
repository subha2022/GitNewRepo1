package MavenNewProject.MavenTestNGNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_001 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.close();

	}

}
  