package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 
{
	@Test
	public void Taxcollectorlogin()
	{
		System.out.println("Login the application");
	}
	
	@Test(groups= {"Smoke"})
	public void putInsepctionReport()
	{
		System.out.println("Give the inspection report");
	}
	@Parameters({"URL","KEY"})
	@Test
	public void submitReport(String urlname, String keyval) 
	{
		System.out.println("Submit the applicaton to the Officer");
		System.out.println(urlname);
		System.out.println(keyval);
	}
	
	
	
}
