package com.testNGFramework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenNavigationMethods {
  @BeforeMethod
  public void lunchApplication()
  {
	  System.out.println("Application is lunched");
  }
  @AfterMethod
  public void closeApplication()
  {
	  System.out.println("Application is closed");
  }
  @Test(priority = 1)
  public void navigateToRegistraionDemo()
  {
	 System.out.println("Page navigate to registration form"); 
  }
  @Test(priority = 2)
  public void navigateToAlertAndPopup()
  {
	 System.out.println("Page navigate to Alert and Popup"); 
  }
  @Test(priority = 3)
  public void navigateToMultipleWindows()
  {
	 System.out.println("Page navigate to Multiple Windows"); 
  }
  @Test(priority = 4)
  public void navigateToWebTable()
  {
	 System.out.println("Page navigate to Web Table"); 
  }
}
