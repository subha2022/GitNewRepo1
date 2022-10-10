package MavenNewProject.MavenTestNGNew;

import org.testng.annotations.Test;

public class FirstTestNGScript 
{
	@Test(priority=1)
	public void login()
	{
		System.out.println("This statement for login");
	}
	@Test(priority=2)
	public void select()
	{
		System.out.println("This statement for select");
	}@Test(priority=3)
	public void logout()
	{
		System.out.println("This statement for logout");
	}
	
}
