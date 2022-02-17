package TestNGFrameWork;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest 
{
	WebDriver driver = null;
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in");
  }
  @Test
  public void f() 
  {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Toys");
	  driver.findElement(By.id("nav-search-submit-button")).click();
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.close();
	  System.out.println("Testing Successful");
  }

}
