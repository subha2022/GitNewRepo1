package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day2 
{
	@BeforeMethod
	public void bMethod()
	{
		System.out.println("I am before method of day2");
	}
@Test
public void Verify()
{
	System.out.println("Verify the document is correct");
}
@AfterSuite
public void AfterSuite()
{
	System.out.println("I am executed last");
}
@AfterMethod
public void aMethod()
{
	System.out.println("I am after method of day2");
}

@Test(groups= {"Smoke"})
public void Download() 
{
System.out.println("Download the documents");	
}
}
