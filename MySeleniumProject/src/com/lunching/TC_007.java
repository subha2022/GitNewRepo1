package com.lunching;

import org.apache.log4j.Logger;

import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_007 extends BaseTest0
{
	
	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		
		init();
		test = report.createTest("TC_007");
		test.log(Status.INFO, "Init the properties files......");
		
		luncher("chromebrowser");
		test.log(Status.INFO, "Opened the browse : "+ p.getProperty("chromebrowser"));
		
		
		navigateUrl("amazonurl");
		test.log(Status.PASS, "Navigated to url : " +childprop.getProperty("amazonurl"));
		
		
		selectOption("amazondropbox_id", "Books");
		test.log(Status.FAIL, "Selected option Books by using locator : " +orProp.getProperty("amazondropbox_id"));
		
				
		typeText("amazonsearchtextbox_name"," Harry Potter");
		test.log(Status.PASS, "Enter the text Harry Potter By using locator : " + orProp.getProperty("amazonsearchtextbox_name"));
		
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.INFO, "Clicked the element By using locator: " + orProp.getProperty("amazonsearchbutton_xpath"));
		
		report.flush();
	}
	

}
