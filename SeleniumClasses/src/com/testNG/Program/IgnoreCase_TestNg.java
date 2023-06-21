package com.testNG.Program;

import org.testng.annotations.Test;

public class IgnoreCase_TestNg {
	@Test(priority = 1)
	public void lunchAppliction() {
		System.out.println("Application is lunched.");
	}

	@Test(priority = 2)
	public void maxApplication() {
		System.out.println("Application is Maximized.");
	}

	@Test(priority = 3 , enabled=false)
	public void searchText() {
		System.out.println("Text is Searched.");
	}

	@Test(priority = 4)
	public void closeAppliction() {

		System.out.println("Application is closed.");

	}
}
