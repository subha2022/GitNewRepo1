package tostringdemoCollection;

import java.util.HashMap;

public class HashMapExamle {

	public static void main(String[] args) 
	{
		HashMap<String, String> empDetails =new HashMap<String, String>();
		
		System.out.println(empDetails.put("FirstName", "SubhaSmita"));
		System.out.println(empDetails.put("LastName", "Jena"));
		System.out.println(empDetails.put("Gender", "female"));
		System.out.println(empDetails.put("Email", "subhasmitadoll@gmail.com"));
		System.out.println(empDetails.put("City", "Bangalore"));
		
		System.out.println(empDetails);
		
		
		System.out.println("************Methods***************");
		System.out.println(empDetails.size());
		System.out.println(empDetails.get("Email"));
		//System.out.println(empDetails.remove("City"));
		//System.out.println(empDetails);
	}

}
