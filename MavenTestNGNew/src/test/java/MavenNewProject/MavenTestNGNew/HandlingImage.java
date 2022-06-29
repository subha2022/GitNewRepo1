package MavenNewProject.MavenTestNGNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingImage {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);
		driver.manage().window().maximize();
		//Robot Image
		WebElement robotImage = driver.findElement(By.xpath("//img[@class='attachment-large size-large']"));
		
		if(robotImage.isDisplayed())
		{
			System.out.println("Robot Image is displayed");
			// Get the image text=Automation
			
		/*	System.out.println(robotImage.getAttribute("alt"));
			System.out.println(robotImage.getAttribute("src"));
			System.out.println(robotImage.getAttribute("sizes"));*/
			
		String robotText = robotImage.getAttribute("alt");
		System.out.println("The Robot Text is: "+robotText);
		}else
		{
			System.out.println("Robot Image is not displayed");
		}
		 WebElement logo = driver.findElement(By.xpath("//img[@class='custom-logo']"));
		 
		 if(logo.isDisplayed())
		 {
			 System.out.println("logo is displayed");
			String actlogoText = logo.getAttribute("alt");
			String expectedlogoText ="NxtGen A.I Academy";
			if(actlogoText.equals(expectedlogoText))
			{
			System.out.println("Both logo text are equal");
			System.out.println("The actlogo text is:"+actlogoText);
			//click
			logo.click();
			
			}
			else
			{
				System.out.println("Both logo text are not equal");
				System.out.println("The actlogo text is:"+actlogoText);
				System.out.println("The expected logo text is:"+expectedlogoText);
				
			}
			 
			 
		 }else
		 {
			 System.out.println("logo is not displayed");
		 }
		
			}
	
	
}
