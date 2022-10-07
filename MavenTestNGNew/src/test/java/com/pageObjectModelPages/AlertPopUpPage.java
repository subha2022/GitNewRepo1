package com.pageObjectModelPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPopUpPage {

	WebDriver driver;
	
	By alertPopUp = By.name("alertbox");
	By confirmAlertBox = By.name("confirmalertbox");
	By promptAlertBox = By.name("promptalertbox1234");
	
	public AlertPopUpPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickAlertPopUp()
	{
		driver.findElement(alertPopUp).click();
		System.out.println("Alert PopUp Button is clicked");
	}
	public void confirmAlertBox()
	{
		driver.findElement(confirmAlertBox).click();
		System.out.println("Cofirm Alert Box Button is clicked");
	}
	public void promptAlertBox()
	{
		driver.findElement(promptAlertBox).click();
		System.out.println("Prompt Alert Box Button is clicked");
	}
	

}
