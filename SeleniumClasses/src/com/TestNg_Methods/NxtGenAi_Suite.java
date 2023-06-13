package com.TestNg_Methods;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NxtGenAi_Suite {
	@BeforeSuite(groups = { "Smoke", "Sanity", "Regression" })
	public void lunchApplication() {
		System.out.println("Application is Lunched.");
	}

	@AfterSuite(groups = { "Smoke", "Sanity", "Regression" })
	public void closeApplication() {
		System.out.println("Application is Closed.");
	}

	@Test(groups = { "Smoke", "Sanity", "Regression" }, priority = 1)
	public void navigateToRegisterDemo() {
		System.out.println("Registration Demo is Displayed.");
	}

	@Test(groups = { "Smoke", "Sanity", "Regression" }, priority = 2)
	public void registerForDomo() {
		System.out.println("User is Registered.");
	}

	@Test(groups = { "Smoke", "Sanity", "Regression" }, priority = 3)
	public void navigateToPythonForDataScience() {
		System.out.println("Python for Data Science Page is Displayed.");
	}

	@Test(groups = { "Sanity", "Regression" }, priority = 4)
	public void navigateToAutomationWindow() {
		System.out.println("Automation Window is Dislayed.");
	}

	@Test(groups = { "Sanity", "Regression" }, priority = 5)
	public void handelNewBrowserWindow() {
		System.out.println("New Browser Window is Handled.");
	}

	@Test(groups = { "Regression" }, priority = 6)
	public void handleNewMessageWindow() {
		System.out.println("New Message Window is Handled.");
	}

	@Test(groups = { "Regression" }, priority = 7)
	public void handelNewTab() {
		System.out.println("New Tab is Handled.");
	}

	@Test(groups = { "Sanity", "Regression" }, priority = 8)
	public void navigateToAutomationAlertPopUp() {
		System.out.println("Alert Popup is Displayed.");
	}

	@Test(groups = { "Sanity", "Regression" }, priority = 9)
	public void handleConfirmAlertPopUp() {
		System.out.println("Confirm Alert PopUp is Handled.");
	}

	@Test(groups = { "Regression" }, priority = 10)
	public void handelAlertPopUp() {
		System.out.println("Alert PopUp is Handled");
	}

	@Test(groups = { "Regression" }, priority = 11)
	public void handelPromptPopUp() {
		System.out.println("Prompt PopUp is Handled.");
	}

	@Test(groups = { "Sanity", "Regression" }, priority = 12)
	public void navigateToAUtomationTable() {
		System.out.println("Automation Table is Displayed.");
	}

	@Test(groups = { "Sanity", "Regression" }, priority = 13)
	public void extractEmployeeDetails() {
		System.out.println("Employee Details is Extracted.");
	}
}
