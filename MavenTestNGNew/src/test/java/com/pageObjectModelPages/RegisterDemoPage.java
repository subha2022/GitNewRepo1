package com.pageObjectModelPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterDemoPage 
{
	WebDriver driver;
	//Initializing the webElements Locator values using By class 
	By firstName = By.id("vfb-5");
	By lastName = By.name("vfb-7");
	By genderMale = By.xpath("//*[@id=\"vfb-8-1\"]");
	By emailID =  By.cssSelector("#vfb-14");
	By verificationNum = By.id("vfb-3");
	By submitBtn = By.id("vfb-4");

	/*Initializing the webElements Locator values using @FindBy annotation 
	@FindBy (id="vfb-5")
	@CacheLookup
	WebElement firstName;*/


	//Constructor
	public RegisterDemoPage (WebDriver driver)
	{
		this.driver = driver;
	}

	public void setFirstname(String fname) 
	{
		//driver.findElement(By.id("vfb-5")).sendKeys("Pabitra"); - previously we are doing like this
		driver.findElement(firstName).sendKeys(fname);
		// for page factory 
		//firstName.sendKeys(fname);
		Reporter.log("The first Name is :"+fname);

	}
	public void setLastname(String lname)
	{
		driver.findElement(lastName).sendKeys(lname);
		Reporter.log("The last Name is :"+lname);
	}
	public void selectMaleRadioBtn()
	{
		driver.findElement(genderMale).click();
		Reporter.log("Male radio Button is selected");
	}
	public void setEmailId(String emailId)
	{
		driver.findElement(emailID).sendKeys(emailId);
		Reporter.log("The Email Id is:"+emailId);
	}
	public void enterVerificationNum(String vnum)
	{
		driver.findElement(verificationNum).sendKeys(vnum);
		Reporter.log("The Verification Number is:"+vnum);
	}
	public void clickSubmitBtn()
	{
		driver.findElement(submitBtn).click();
		Reporter.log("Submit Button is clicked");

	}

}
