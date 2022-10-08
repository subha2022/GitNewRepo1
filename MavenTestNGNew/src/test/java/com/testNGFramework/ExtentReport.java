package com.testNGFramework;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
 ExtentSparkReporter spark;
 ExtentReports extent;
 ExtentTest test;
 @BeforeTest
 public void startReport()
 {
	 spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/ExtentReport/ExecutionReport.html");
	 extent = new ExtentReports();
	 extent.attachReporter(spark);
 }
 
 @Test(priority=1)
 public void lunchApplication()
 {
	 test = extent.createTest("Test Case 1", "Lunch Application Flow");
	 test.log(Status.PASS, "Application is lunched successfully");
 }
 @Test(priority=2)
 public void failedTestCase()
 {
	 test = extent.createTest("Test Case 2", "Lunch Application");
	 test.log(Status.FAIL, "Application is Failed");
 }
 @Test(priority=3)
 public void warningTestCase()
 {
	 test = extent.createTest("Test Case 3", "Lunch Application");
	 test.log(Status.WARNING, "Application has warning");
 }
 @Test(priority=4)
 public void skippingTestCase()
 {
	 test = extent.createTest("Test Case 4", "Lunch Application");
	 test.log(Status.SKIP, "Application is skipped");
 }
 @Test(priority=1)
 public void informtionTestCase()
 {
	 test = extent.createTest("Test Case 5", "Lunch Application");
	 test.log(Status.INFO, "Just for Information");
 }
	 @AfterTest
	 public void tearDown()
	 {
		 extent.flush();
	 }
	 

 
}
