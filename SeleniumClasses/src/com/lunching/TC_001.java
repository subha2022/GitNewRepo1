package com.lunching;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001 extends BaseTest1
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		init();
		
		luncher("chromebrowser");
		
		navigateUrl("amazonurl");
 
	}

}
