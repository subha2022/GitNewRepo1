package SeleniumFrameWork.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args)
	{
		
	//ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
		WebDriver driver1 =new ChromeDriver();
		driver1.get("https://flipkart.com");
		
		

	}

}
