package com.NxtGenAI.TestCase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGParameterization {
	
	
  @Test(dataProvider = "getData")
  public void registerUser(String firstName, String lastName) {
	  System.out.println(firstName);
	  System.out.println(lastName);
  }
  
  //table name can be anything -getData
  //Every data is passed is an object
  //If any Mismatch in the column value  we will get the exception 
  
  @DataProvider
  public Object[][] getData()
  {
	  Object [][] data = new Object[3][2];
	  
	  data[0][0]="Subha";
	  data[0][1]="Smita";
	  
	  data[1][0]="Madhu";
	  data[1][1]="Smita";
	  
	  data[2][0]="Raja";
	  data[2][1]="Smita";
	  
	  return data;
  }
}
