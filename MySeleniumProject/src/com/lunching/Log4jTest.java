package com.lunching;

import org.apache.log4j.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log4jTest extends BaseTest0
{
	private static final Logger log = Logger.getLogger(Log4jTest.class);

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		
		init();
		log.info("Init the properties files......");
		
		luncher("chromebrowser");
		log.info("Opened the browse : "+ p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to url : " +childprop.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id", "Books");
		log.info("Selected option Books by using locator : " +orProp.getProperty("amazondropbox_id"));
				
		typeText("amazonsearchtextbox_name"," Harry Potter");
		log.info("Enter the text Harry Potter By using locator : " + orProp.getProperty("amazonsearchtextbox_name"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked the element By using locator: " + orProp.getProperty("amazonsearchbutton_xpath"));
	}

}
