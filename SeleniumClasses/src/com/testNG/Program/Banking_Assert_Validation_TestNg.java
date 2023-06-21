package com.testNG.Program;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Banking_Assert_Validation_TestNg {
	
	@Test(priority = 1)
	public void lunchApplication() {
		System.out.println("Application is lunched.");

		Assert.assertEquals("PAge Title", "Page Title", "Titles are Same");
	}

	@Test(priority = 2)
	public void loginUser() {
		System.out.println("Succssfully Loging");
		Assert.assertEquals("Login", "Login");
	}

	@Test(priority = 3)
	public void CheckSavingAccountBalance() {
		System.out.println("Saving Account Balance is Displayed");
		Assert.assertEquals("Saving Account", "Saving Account");
	}

	@Test(priority = 4)
	public void CheckCurrentAccountBalance() {
		System.out.println("Current Account Balance is Displayed");
		Assert.assertEquals("Current Account", "Current Account");
	}

	@Test(priority = 5)
	public void logOut() {
		System.out.println("Successfully LogOut");
		Assert.assertEquals("LogOut", "LogOut");
	}

	@Test(priority = 6)
	public void closeApplication() {
		System.out.println("Applicaion is Closed");
		Assert.assertEquals("Closed", "Closed");
	}

}
