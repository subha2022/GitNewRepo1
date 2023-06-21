package com.testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BankingApplicationHardDependency {
 @Test
  public void lunchApplication() 
  {
	  System.out.println("Application is lunched");
	  Assert.assertEquals("PageTitle", "PageTitle");
  }
  @Test(dependsOnMethods = {"lunchApplication"} )
  public void loginUser()
  {
	  System.out.println("login Successfully");
	  Assert.assertEquals("Login", "Login");
  }
  @Test(dependsOnMethods = {"loginUser"} )
  public void checkSavingAccountBalance()
  {
	  System.out.println("Saving Account Balance is displayed");
	  Assert.assertEquals("notSaving Account", "Saving Account");
  }
  @Test(dependsOnMethods = {"checkSavingAccountBalance","loginUser"} )
  public void checkCurrentAccountBalance()
  {
	  System.out.println("Current Account Balance is displayed");
	  Assert.assertEquals("Current Account", "Current Account");
  }
  @Test(dependsOnMethods = {"checkCurrentAccountBalance"} )
  public void logOut()
  {
	  System.out.println("logout successfully ");
	  Assert.assertEquals("Logout", "Logout");
  }
  @Test(dependsOnMethods = {"logOut"} )
  public void closeApplication()
  {
	  System.out.println("Application is closed ");
	  Assert.assertEquals("Closed", "Closed");
	  
  }
}
