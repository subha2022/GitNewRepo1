package com.testNG.Program;
import org.testng.annotations.Test;

public class Alphabetic_Order 
{
@Test(priority=1)
public void lunchApplication() //2nd one
{
	System.out.println("Application is Lunched.");
}
@Test(priority=2,dependsOnMethods={"lunchApplication"})
public void maxApplication()  //3rd
{
	System.out.println("Application is Maximized.");
}
@Test(priority=3,dependsOnMethods={"maxApplication"})
public void searchText() //4th
{
	System.out.println("Text is Searched.");
}
@Test(priority=4)
public void closeApplication() //It will execute 1st
{
	
	System.out.println("Application is closed.");
	
}
}
