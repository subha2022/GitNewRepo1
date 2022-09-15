package tostringdemoCollection;

public class StringDemo //collection list demo
{

	public static void main(String[] args) 
	{
		String s1 = "subhasmita";// one type of String Declaration
		System.out.println(s1);
		System.out.println(s1.isEmpty()); //is it empty or not
		System.out.println(s1.length());// to get for length
		System.out.println(s1.hashCode());// to get hash code
		System.out.println(s1.charAt(3)); //to get a index or character from this string
		System.out.println(s1.indexOf('h')); // to get the no. of the index. if there are 2 h it will take 1st occurrence
	
		String s2 = new String ("jena"); // another type of string declaration
		System.out.println(s2);
		
		System.out.println(s1.equals(s2)); // it checks the comparison
		
		String s3 = "Subhasmita";
		System.out.println(s1.equalsIgnoreCase(s3)); // if ur case is not matching u can use this
	
		String s4 = "subhasmi";
		System.out.println(s1.contains(s4));
		
		//s1 = s1+"  " +s2;
		//s1 = s1.concat(s2); // 2nd way to concatenate
		System.out.println(s1);//one way to concatenate
		
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s3.toLowerCase());
		System.out.println(s1.toUpperCase());
		//System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equals(s3.toLowerCase()));
		
		System.out.println(s1);
		System.out.println(s1.replace('s', 'k'));// for replace the character
		System.out.println(s1.substring(5, 10));// for getting sub strings (in this string 1st index is 0 and last index is lastindex+1 
		
		System.out.println(s1);
		String s5 = " subhasmita";
		System.out.println(s5);
		System.out.println(s1.equals(s5.trim()));//for trim the space
		System.out.println(s5.trim());//for trim the space
		
		String s6 = " Subhasmita";
		System.out.println(s1.equals(s6));
		System.out.println(s1.equals(s6.trim().toLowerCase()));
		
		String s7 = "Subha Smita Jena"; // for breaking
		System.out.println(s7);
		String[] str = s7.split(" ");
		for(String s:str)
		{
			System.out.println(s);
		}
		
		System.out.println(s1.startsWith("sub"));
		System.out.println(s1.endsWith("ta"));
		
		

	}

}
