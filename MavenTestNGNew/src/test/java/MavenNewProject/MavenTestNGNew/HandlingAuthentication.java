package MavenNewProject.MavenTestNGNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAuthentication {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//syntax to authenticate
		//String url = "http://username:password@the..............."
		String url="https://admin:admin@the-internet.herokuapp.com/basic_auth";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement msg = driver.findElement(By.xpath("//div[contains(@class,'example')]/p[text()]"));
		
		String actMsg = msg.getText();
		String expMsg = "Congratulations! You must have the proper credentials.";
		
		if(actMsg.equals(expMsg))
		{
			System.out.println("Both the Messages are same");
			System.out.println("The Message is:"+actMsg);
		}else
		{
			System.out.println("Both the Messages are not same");
			System.out.println("The Message is:"+actMsg);
			System.out.println("The Message is:"+expMsg);
		}
		driver.close();
				 
		
	}

}
