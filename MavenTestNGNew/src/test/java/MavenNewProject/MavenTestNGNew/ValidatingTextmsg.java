package MavenNewProject.MavenTestNGNew;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidatingTextmsg {

	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	String url = "https://nxtgenaiacademy.com/demo-site/";
	driver.get(url);
	driver.manage().window().maximize();
	
	//positive scenario
	 WebElement regTitle = driver.findElement(By.xpath("(//div[@class='vfb-legend'])[1]"));
	 if(regTitle.isDisplayed())
	 {
		 System.out.println("The Registration title is displayed");
		 
		 // Validating the title text
		 String actRegTitle=regTitle.getText();
		 String expRegTitle="Register For Demo";
		 
		 if(actRegTitle.equals(expRegTitle))
		 {
			 System.out.println("Both the titles are same");
			 System.out.println("The actual registration title is: "+actRegTitle);
		 }else
		 {
			 System.out.println("Both the titles are not same");
			 System.out.println("The actual registration title is: "+actRegTitle);
			 System.out.println("The expected registration title is: "+expRegTitle);
		 }
	 }else
	 {
		 System.out.println("The Registration title is not displayed");
	 }
	
	driver.findElement(By.id("vfb-4")).click();
	
	// Negative Scenario
	
	WebElement FirstNameErrMsg= driver.findElement(By.xpath("(//label[contains(text(),'This field is required.')])[1]"));
	
	 if(FirstNameErrMsg.isDisplayed())
	 {
		 System.out.println("The First Name error message is displayed");
		 
		 // Validating the title text
		 String actFirstNameErrMsg = FirstNameErrMsg.getText();
		 String expFirstNameErrMsg = "This field is required.";
		 
		 if(actFirstNameErrMsg.equals(expFirstNameErrMsg))
		 {
			 System.out.println("Both the actual and expected First Name error Messages are same");
			 System.out.println("The actual First Name Error Message is: "+actFirstNameErrMsg);
		 }else
		 {
			 System.out.println("Both the actual and expected First Name error Messages are not same");
			 System.out.println("The actual First Name Error Message is: "+actFirstNameErrMsg);
			 System.out.println("The expected First Name Error Message is: "+expFirstNameErrMsg);
		 }
	 }else
	 {
		 System.out.println("The First Name error message is not displayed");
	 }
	
	
	
	
	}

}
