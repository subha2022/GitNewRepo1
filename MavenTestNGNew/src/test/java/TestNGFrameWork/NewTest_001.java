package TestNGFrameWork;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest_001
{
  WebDriver driver = null;
  @BeforeMethod
  public void setupTest() 
  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
  }
  
  @Test
  public void googleSearch() 
  {
	  driver.findElement(By.name("q")).sendKeys("Success");
	  driver.findElement(By.name("btnK")).click();
  }

  @AfterMethod
  public void EndTest() 
  {
	  driver.close();
	  System.out.println("Test Case Running Successfully");
  }

}
