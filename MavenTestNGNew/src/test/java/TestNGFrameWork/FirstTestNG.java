package TestNGFrameWork;


import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNG
{
	@Test(priority=1,description = "This test case will perform login functionality")
	public void login()
	{
		System.out.println("This statement for login");
		//Assert.assertEquals(12, 13);
		
	}
	@Test(priority=2,description = "This test case will add items in Basket",enabled = false)
	public void select()
	{
		System.out.println("This statement for select");
	}@Test(priority=3,description = "This test case will perform login functionality")
	public void logout()
	{
		System.out.println("This statement for logout");
	}
	
}
