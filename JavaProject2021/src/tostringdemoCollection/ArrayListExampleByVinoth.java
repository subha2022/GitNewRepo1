package tostringdemoCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExampleByVinoth {

	public static void main(String[] args) 
	{
		ArrayList obj = new ArrayList();
		obj.add(123);
		obj.add("Subha");
		obj.add(true);
		obj.add(45.5f);
		System.out.println(obj);
		
		// Typecasting issue will occure for above program
		
		//Generic Array List
		ArrayList<String> emp = new ArrayList<String>();
		emp.add("Smita");
		emp.add("Sili");
		emp.add("Pabitra");
		emp.add("Subha");
		emp.add("Sili"); // duplicate is allowed
		
		System.out.println(emp);
		
	System.out.println("**************for loop*****************");
	
	for(int i=0;i<emp.size();i++)
	{
		System.out.println("The Name of the employee:"+emp.get(i));
	}
		
	System.out.println("**************for each*****************");
	
	for(String name :emp)
	{
		System.out.println("The name of the employee:"+name);
	}
		
	System.out.println("**************Iterator*****************");	
	
	Iterator itr =emp.iterator();
	while(itr.hasNext())

	{
		System.out.println(itr.next());
	}
	System.out.println("**************methods*****************");
	System.out.println(emp.size());
	System.out.println(emp.set(0, "Abc"));
	System.out.println(emp.get(0));
	System.out.println(emp);
	
	Collections.sort(emp);
	System.out.println(emp);
	
	System.out.println(emp.remove(3));
	System.out.println(emp);
	
	System.out.println(emp.remove("Abc"));
	System.out.println(emp);
	
	/*System.out.println(emp.removeAll(emp));
	System.out.println(emp);*/
	
	}
}

	
	
	


