package com.testNG.Program;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Dependency_TestNG 
{
	@Test
	public void lunchApplication() {
		System.out.println("Application is lunched.");

		Assert.assertEquals("Page Title", "Pag Title", "Titles are Same");
	}

	@Test(dependsOnMethods= {"lunchApplication"})
	public void loginUser() {
		System.out.println("Succssfully Loging");
		Assert.assertEquals("Logi", "Login");
	}

	@Test(dependsOnMethods= {"loginUser"})
	public void CheckSavingAccountBalance() {
		System.out.println("Saving Account Balance is Displayed");
		Assert.assertEquals("Saving ccount", "Saving Account");
	}

	@Test(dependsOnMethods= {"CheckSavingAccountBalance","loginUser"})//Depends On Multiple Methods
	public void CheckCurrentAccountBalance() {
		System.out.println("Current Account Balance is Displayed");
		Assert.assertEquals("Current Account", "Current Account");
	}

	@Test(dependsOnMethods= {"CheckCurrentAccountBalance"})
	public void logOut() {
		System.out.println("Successfully LogOut");
		Assert.assertEquals("LogOut", "LogOut");
	}

	@Test(dependsOnMethods= {"logOut"},alwaysRun=true)
	public void closeApplication() {
		System.out.println("Applicaion is Closed");
		Assert.assertEquals("Closed", "Closed");
	}
	
	

}
