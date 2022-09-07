package MavenNewProject.MavenTestNGNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingButton {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);
		driver.manage().window().maximize();
		
		 WebElement submitBtn = driver.findElement(By.id("vfb-4"));
		 if(submitBtn.isDisplayed())
		 {
			 System.out.println("Submit Button is displayed");
		 }else
		 {
			 System.out.println("Submit Button is not displayed");
		 }
		 if(submitBtn.isEnabled())
		 {
			 System.out.println("Submit Button is Enabled");
			 Thread.sleep(4000);
			 submitBtn.click();
		 }else
		 {
			 System.out.println("Submit Button is not Enabled");
		 }
		

	}

}
