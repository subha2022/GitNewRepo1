package tostringdemoCollection;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> emp = new HashSet<String>();
		emp.add("Smita");
		emp.add("Sili");
		emp.add("Pabitra");// Insertion order is not preserved
		emp.add("Subha");
		emp.add("Sili"); // duplicate is not allowed
		
		System.out.println(emp);

	}

}
