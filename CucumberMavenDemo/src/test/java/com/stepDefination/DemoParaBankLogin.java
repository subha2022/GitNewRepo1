package com.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoParaBankLogin {
	public WebDriver driver;
	@Given("lunch the application")
	public void lunch_the_application() {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver1.exe");
		  driver = new ChromeDriver();
		  driver.get("https://parabank.parasoft.com/parabank/index.htm");
		  driver.manage().window().maximize();
		  System.out.println("The application is lunched successfully");
	}

	@When("valid user name and passwordare entered")
	public void valid_user_name_and_passwordare_entered() {
		driver.findElement(By.name("username")).sendKeys("s");
		driver.findElement(By.name("password")).sendKeys("s");
		
		 System.out.println("user name and password are entered successfully");
	}

	@When("click the login button")
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

	@Then("logout of the application")
	public void logout_of_the_application() {
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		 System.out.println("logout of the application successfully");
	}

	@Then("close the url")
	public void close_the_url() {
		 driver.quit();
		 System.out.println("The application is closed successfully"); 
	}
	@When("invalid user name and password are entered")
	public void invalid_user_name_and_password_are_entered() {
		driver.findElement(By.name("username")).sendKeys("subha123");
		driver.findElement(By.name("password")).sendKeys("subha123");
		
		 System.out.println("user name and password are entered successfully");
	}

	@Then("unable to login")
	public void unable_to_login() {
		WebElement erromsg = driver.findElement(By.xpath("//p[contains(@class,'error')]"));
		String ErrorTxt=erromsg.getText();
		 System.out.println("unable to login. Display the error message is"+ErrorTxt);
	}

}
