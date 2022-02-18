package com.lunching;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main_001 extends Main
{

	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	luncher1("chrome");
	navigeturl("https://www.flipkart.com");
	}

}
