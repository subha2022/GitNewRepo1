package com.testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BankingApplicationAssertOrder {
  @Test(priority=1)
  public void lunchApplication() 
  {
	  System.out.println("Application is lunched");
	  Assert.assertEquals("PageTitle", "PageTitle");
  }
  @Test(priority=2)
  public void loginUser()
  {
	  System.out.println("login Successfully");
	  Assert.assertEquals("Login", "Login");
  }
  @Test(priority=3, enabled=false)
  public void checkSavingAccountBalance()
  {
	  System.out.println("Saving Account Balance is displayed");
	  Assert.assertEquals(" Not Saving Account", "Saving Account");
  }
  @Test(priority=4)
  public void checkCurrentAccountBalance()
  {
	  System.out.println("Current Account Balance is displayed");
	  Assert.assertEquals("Current Account", "Current Account");
  }
  @Test(priority=5)
  public void logOut()
  {
	  System.out.println("logout successfully ");
	  Assert.assertEquals("Logout", "Logout");
  }
  @Test(priority=6)
  public void closeApplication()
  {
	  System.out.println("Application is closed ");
	  Assert.assertEquals("Closed", "Closed");
	  
  }
}
