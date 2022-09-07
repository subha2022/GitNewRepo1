package MavenNewProject.MavenTestNGNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingTextBox {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement firstName= driver.findElement(By.id("vfb-5"));
		if(firstName.isDisplayed())
		{
			System.out.println("The firstName is displayed");
		}else
		{
			System.out.println("The firstName is not displayed");
		}
		
		if(firstName.isEnabled())
		{
			System.out.println("The firstName is enabled");
			firstName.sendKeys("SUBHA");
			// Retrieve the entered value from text box
			
		String name = firstName.getAttribute("value");
		System.out.println("The Retrive value of firstname is:"+name);
			
		}else
		{
			System.out.println("The firstNmae is not enabled");
		}
		firstName.clear();
				
		Thread.sleep(3000);
		driver.close();
		
	}

}
