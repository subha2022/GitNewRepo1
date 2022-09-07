package TestNGFrameWork;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class NewTest_002
{
	WebDriver driver;
  @SuppressWarnings("deprecation")
@BeforeMethod
  public void beforeMethod() 
  {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions option = new ChromeOptions();
	  option.addArguments("--disable-notifications");
	  driver = new ChromeDriver(option);
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	 
  }
  @Test
  public void f()
  {
	  driver.findElement(By.id("email")).sendKeys("9853294636");
	  driver.findElement(By.id("pass")).sendKeys("05021993sili");
	  driver.findElement(By.name("login")).click();
	  
  }

  @AfterMethod
  public void afterMethod() throws Exception 
  {
	  
		  System.out.println("This test case is completed sucessfully");
  }

}
