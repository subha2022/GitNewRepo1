package com.lunching;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_002 extends BaseTest1
{

	public static void main(String[] args) throws Exception 
	{
				
		WebDriverManager.firefoxdriver().setup();
		
		init();

		luncher("firefoxbrowser");
		navigateUrl("bestbuyurl");
	}

}
 