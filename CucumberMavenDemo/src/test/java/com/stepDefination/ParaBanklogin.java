package com.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParaBanklogin 
{
	public WebDriver driver;
	@Given("to navigate the url")
	public void to_navigate_the_url() {
	  System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver1.exe");
	  driver = new ChromeDriver();
	  driver.get("https://parabank.parasoft.com/parabank/index.htm");
	  driver.manage().window().maximize();
	  System.out.println("The application is lunched successfully");
	}

	@When("enter the user name and password")
	public void enter_the_user_name_and_password() {
	    
		driver.findElement(By.name("username")).sendKeys("automation12345");
		driver.findElement(By.name("password")).sendKeys("automation12345");
		
		 System.out.println("user name and password are entered successfully");
	}

	@And("click the login button")
	public void click_the_login_button() {
	    driver.findElement(By.xpath("//div[contains(@class,'login')]/input[@type='submit']")).click();
		 System.out.println("clicked on the login button successfully");
	}

	@Then("display the user homepage")
	public void display_the_user_homepage() {
	   String ActTitle =driver.getTitle();
	   String ExpTitle="ParaBank | Accounts Overview";
	   
	   if(ActTitle.endsWith(ExpTitle))
	   {
		   System.out.println("User home page is displayed");
		   System.out.println("Title of the page is : "+ ActTitle);
	   }
	   else
	   {
		   System.out.println("Both actual and expected titles are not same ");
		   System.out.println("Actual Title of the page is : "+ ActTitle);
		   System.out.println("Expacted Title of the page is : "+ ExpTitle);
	   }
		 System.out.println("The homepage is displayed successfully");
	}

	@And("logout of the application")
	public void logout_of_the_application() {
	    driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		 System.out.println("logout of the application successfully");
	}

	@And("close the url")
	public void close_the_url() {
	    driver.quit();
		 System.out.println("The application is closed successfully");
	}

}
