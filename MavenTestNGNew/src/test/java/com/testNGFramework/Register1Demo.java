package com.testNGFramework;

import org.testng.annotations.Test;

public class Register1Demo {
	
  @Test(priority = 1)
  public void lunchApplication() 
  {
	  System.out.println("Application is lunched");
  }
  @Test(priority = 2)
  public void navigateToRegistrationDemoPage()
  {
	  System.out.println("Registration page is loading successfully");
  }
  @Test(priority = 3)
  public void registerUser()
  {
	  System.out.println("User is registered");
  }
  @Test(priority = 4)
  public void closeApplication()
  {
	  System.out.println("Application is closed");
  }
}
