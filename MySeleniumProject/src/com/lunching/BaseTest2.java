package com.lunching;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;


public class BaseTest2 
{
	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");//current project root directory
	public static FileInputStream fis;
	public static Properties mainprop;
	public static Properties childprop;
	
	public static void init() throws Exception
	{
						
		fis = new FileInputStream(projectpath+"\\environment.properties");
		mainprop = new Properties();
		mainprop.load(fis);
		 
		 String e = mainprop.getProperty("env");
		 System.out.println(e);
		 		
		 fis = new FileInputStream(projectpath+"\\"+e+".properties");
		 childprop=new Properties();
		 childprop.load(fis);
		 
		String url = childprop.getProperty("amazonurl");
		System.out.println(url);
		
	}	
		
	}


