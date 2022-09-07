package MavenNewProject.MavenTestNGNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingRadioButton {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement femaleRadioBtn = driver.findElement(By.id("vfb-8-2"));
		
		if(femaleRadioBtn.isDisplayed())
		{
			System.out.println("Female Radio Button is displayed");
		}else
		{
			System.out.println("Female Radio Button is not displayed");
		}
		
		if(femaleRadioBtn.isEnabled())
		{
			System.out.println("Female Radio Button is Enabled");
		}else
		{
			System.out.println("Female Radio Button is not Enable");
		}
		
		if(femaleRadioBtn.isSelected())
		{
			System.out.println("Female Radio Button is Selected");
		}else
		{
			System.out.println("Female Radio Button is not Selected");
			femaleRadioBtn.click();
		}

	}

}
