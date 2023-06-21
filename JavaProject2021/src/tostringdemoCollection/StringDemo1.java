package tostringdemoCollection;

public class StringDemo1 
{

	public static void main(String[] args) 
	{
		String s1 = "subhasmita"; //string declaration
		String s2 = new String("jena");//string declaration
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//s1=s1+s2;
		s1 = s1.concat(s2);
		System.out.println(s1.hashCode());
		
		System.out.println("--------------------");
		
		StringBuffer sb1 = new StringBuffer("subha");
		StringBuffer sb2 = new StringBuffer("smita");
		
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		sb1 = sb1.append(sb2);
		System.out.println(sb1.hashCode());
		
		System.out.println("-----------");
		
		StringBuilder sb3 = new StringBuilder("Madhu");
		StringBuilder sb4 = new StringBuilder("Smita");
		
		System.out.println(sb3.hashCode());
		System.out.println(sb4.hashCode());
		
		sb3 = sb3.append(sb4);
		System.out.println(sb3.hashCode());
		
		
		
	}

}
