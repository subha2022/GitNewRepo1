package com.TestNg_Methods;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScreenNavigation_Class {

	@BeforeClass
	public void lunchApplication() {
		System.out.println("Aplication is Lunched");
	}

	@AfterClass
	public void closeApplication() {
		System.out.println("Application is Closed");
	}

	@Test(priority=1)
	public void navigateToRegistrationForm() {
		System.out.println("Page Navigate to Register Form");
	}

	@Test(priority=2)
	public void navigateToAlertAndPopUp() {
		System.out.println("Page Navigate to Alert and PopUp");
	}

	@Test(priority=3)
	public void navigateToMultipleWindows() {
		System.out.println("Page Navigate to Multipule Windows");
	}

	@Test(priority=4)
	public void navigateToWebTable() {
		System.out.println("Page Navigate to WebTable");
	}
}
