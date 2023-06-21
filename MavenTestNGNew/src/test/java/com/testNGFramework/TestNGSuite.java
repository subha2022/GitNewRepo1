package com.testNGFramework;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGSuite {
	@BeforeSuite
	  public void lunchApplication() 
	  {
		  System.out.println("Application is lunched");
	  }
	@AfterSuite
	  public void closeApplication()
	  {
		  System.out.println("Application is closed");
	  }
	  @Test(priority = 1)
	  public void navigateToRegistrationDemoPage()
	  {
		  System.out.println("Registration page is displayed");
	  }
	  @Test(priority = 2)
	  public void registerForDemo()
	  {
		  System.out.println("User is registered");
	  }
	  @Test(priority = 3)
	  public void navigateToPythonForDataScience()
	  {
		  System.out.println("Python For DataScience is registered");
	  }
	  @Test(priority = 4)
	  public void navigateToAutomationWindow()
	  {
		  System.out.println("Automation Window is registered");
	  }
	  @Test(priority = 5)
	  public void handelNewBrowserWindow()
	  {
		  System.out.println("Handel New Browser Window is handled");
	  }
	  @Test(priority = 6)
	  public void handelNewMessageWindow()
	  {
		  System.out.println("New Message Window is registered");
	  }
	  @Test(priority = 7)
	  public void handelNewTab()
	  {
		  System.out.println("New Tab is registered");
	  }
	  @Test(priority = 8)
	  public void navigateToAutomationAlertPopup()
	  {
		  System.out.println("Alert PopUp is registered");
	  }
	  @Test(priority = 9)
	  public void handelConfirmAlertPopup()
	  {
		  System.out.println("Confirm alert popup is displayed");
	  }
	  @Test(priority = 10)
	  public void handelAlertPopup()
	  {
		  System.out.println("Alert PopUp is displayed");
	  }
	  @Test(priority = 11)
	  public void handelPromptPopUp()
	  {
		  System.out.println("Prompt PopUp is displayed");
	  }
	  @Test(priority = 12)
	  public void navigateToAutomationTable()
	  {
		  System.out.println("AutomationTable is displayed");
	  }
	  @Test(priority = 13)
	  public void extractEmployeeDetails()
	  {
		  System.out.println("Employee Details is extracted");
	  }
	  
	 
	}

