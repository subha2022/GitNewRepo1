package com.TestNg_Methods;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Banking_Soft_Assert 
{
	SoftAssert softAssert = new SoftAssert();
	@Test(priority = 1)
	public void lunchApplication() {
		System.out.println("Application is lunched.");

		softAssert.assertEquals("Page Title", "Page Title", "Titles are not Same");
	}

	@Test(priority = 2)
	public void loginUser() {
		System.out.println("Succssfully Loging");
		softAssert.assertEquals("Logi", "Login","Titles are not same.");
		softAssert.assertAll();
	}

	@Test(priority = 3)
	public void CheckSavingAccountBalance() {
		System.out.println("Saving Account Balance is Displayed");
		softAssert.assertEquals("Saving Account", "Saving Account");
	}

	@Test(priority = 4)
	public void CheckCurrentAccountBalance() {
		System.out.println("Current Account Balance is Displayed");
		softAssert.assertEquals("Current Account", "Current Account");
	}

	@Test(priority = 5)
	public void logOut() {
		System.out.println("Successfully LogOut");
		softAssert.assertEquals("LogOut", "LogOut");
	}

	@Test(priority = 6)
	public void closeApplication() {
		System.out.println("Applicaion is Closed");
		softAssert.assertEquals("Closed", "Closed");
	}
	
}
