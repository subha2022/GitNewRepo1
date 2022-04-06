package TestNGFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeOptions option= new ChromeOptions();
		 option.addArguments("--disable-notifications");
		  WebDriver driver  = new ChromeDriver(option);
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  		  
		  driver.findElement(By.id("email")).sendKeys("9853294636");
		  driver.findElement(By.id("pass")).sendKeys("05021993sili");
		  driver.findElement(By.name("login")).click();
		  //driver.findElement(By.linkText("Account")).click();
		  driver.findElement(By.partialLinkText("Log Out")).click();
		  
		  //driver.close();
		  System.out.println("This test case is completed sucessfully");

	}

}
