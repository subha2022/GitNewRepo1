package com.TestNG;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.lunching.BaseTest0;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TGN_001 extends BaseTest0
{
	 @BeforeMethod
	  public void startProcess() throws Exception 
	  {
		 System.out.println("Before Method");
		 WebDriverManager.chromedriver().setup();
			init();
			test = report.createTest("TNG_001");
			test.log(Status.INFO, "Init the properties files......");
			
			luncher("chromebrowser");
			test.log(Status.INFO, "Opened the browse : "+ p.getProperty("chromebrowser"));
			
			
			navigateUrl("amazonurl");
			test.log(Status.PASS, "Navigated to url : " +childprop.getProperty("amazonurl"));  
	  }
  @Test
  public void amazon()
  {
	  System.out.println("Test Method");
	  selectOption("amazondropbox_id", "Books");
		test.log(Status.FAIL, "Selected option Books by using locator : " +orProp.getProperty("amazondropbox_id"));
		
				
		typeText("amazonsearchtextbox_name"," Harry Potter");
		test.log(Status.PASS, "Enter the text Harry Potter By using locator : " + orProp.getProperty("amazonsearchtextbox_name"));
		
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.INFO, "Clicked the element By using locator: " + orProp.getProperty("amazonsearchbutton_xpath"));
  }
 

  @AfterMethod
  public void endProcess()
  {
	  System.out.println("After Method");
	  report.flush(); 
	  driver.close();
  }

}
