package com.verifications;

import com.aventstack.extentreports.Status;
import com.lunching.BaseTest0;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify3 extends BaseTest0
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		
		init();
		test = report.createTest("Verify3");

		luncher("chromebrowser");
		test.log(Status.INFO, "Lunching Browser");
		
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigating to application ");
				
		driver.manage().window().maximize();
	
		String expectedLink = "customer Service";
		
		if(!isLinksEqual(expectedLink))
			reportfailure("Both links are not equal...");
			//System.out.println("Both links are not equal....");
		else
			reportsuccess("Both links are euqal....");
			//System.out.println("Both links are equal....");
		
		report.flush();
		
		driver.close();
	}

	}
