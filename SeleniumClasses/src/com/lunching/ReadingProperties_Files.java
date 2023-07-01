package com.lunching;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties_Files 
{
	
	public static void main(String[] args) throws IOException 
	{
		Properties prop = new Properties();//To read the properties files
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\lunching\\OR.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("firstName"));
		System.out.println(prop.getProperty("lastName"));
		System.out.println(prop.getProperty("submitBtn"));
		//System.out.println(System.getProperty("user.dir"));
	}

}
