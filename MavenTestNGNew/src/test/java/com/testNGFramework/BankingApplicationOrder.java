package com.testNGFramework;

import org.testng.annotations.Test;

public class BankingApplicationOrder {
  @Test(priority=1)
  public void lunchApplication() 
  {
	  System.out.println("Application is lunched");
  }
  @Test(priority=2)
  public void loginUser()
  {
	  System.out.println("login Successfully");
  }
  @Test(priority=3)
  public void checkSavingAccountBalance()
  {
	  System.out.println("Saving Account Balance is displayed");
  }
  @Test(priority=3)
  public void checkCurrentAccountBalance()
  {
	  System.out.println("Current Account Balance is displayed");
  }
  @Test(priority=5)
  public void logOut()
  {
	  System.out.println("logout successfully ");
  }
  @Test(priority=6)
  public void closeApplication()
  {
	  System.out.println("Application is closed ");
  }
}
