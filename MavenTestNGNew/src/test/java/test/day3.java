package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 
{
	@BeforeTest(timeOut = 1000)
	public void TestData() 
	{
		System.out.println("This is the pre-requisite");
	}
	@Test(groups= {"Smoke"})
	public void loginUser()
	{
		System.out.println("Login the user application");
		Assert.assertTrue(false);
	}
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("I am excuted first");
	}

	@Test(dependsOnMethods = {"submit"} )
	public void loginOfficial()
	{
		System.out.println("Login the official site");
	}
	@AfterTest
	public void TestcaseComplete()
	{
		System.out.println("It is complete");
	}
	@Test(dataProvider = "getData")
	public void submit(String username, String password) 
	{
		System.out.println("Submit the applicaton to the Tax Collector");
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[3][2];
		//1st data
		data[0][0]="1st User Name";
		data[0][1]="1st Password";
		//2nd data
		data[1][0]="2nd User Name";
		data[1][1]="2nd Password";
		//3rd data
		data[2][0]="3rd User Name";
		data[2][1]="3rd Password";
		return data;
	}
	
	
}
