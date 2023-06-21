package com.propertiesConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFiles {

	public static void main(String[] args) throws IOException
	{
		//creating properties file object instance
		Properties prop = new Properties();
		//create fileinputstream object instance
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\propertiesConcept\\OR.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("firstName"));
		System.out.println(prop.getProperty("lastName"));
		System.out.println(prop.getProperty("submitBtn"));
		//System.out.println(System.getProperty("user.dir"));
		
		
		
		
	}

}
