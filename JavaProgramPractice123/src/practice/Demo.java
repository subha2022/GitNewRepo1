package practice;



public class Demo
 {
	 
		public static void main(String[] args) 
	
		{
				String s1= "subhasmita";
				System.out.println(s1);
				System.out.println(s1.isEmpty());
				System.out.println(s1.length());
				System.out.println(s1.charAt(4));
				System.out.println(s1.indexOf('h'));
				
				String s2= new String("Jena");
				//String s2= "Jena";
				System.out.println(s1.equalsIgnoreCase(s2));
				System.out.println(s2);
				s1 = s1.concat(s2);
				System.out.println(s1);
				System.out.println(s1.toLowerCase());
				System.out.println(s1.toUpperCase());
				
				String s3=" Subhasmita";
				System.out.println(s3);
				System.out.println(s3.trim());
				//System.out.println(s1.equals(s3));
				System.out.println(s1.equalsIgnoreCase(s3));
				//System.out.println(s1.equals(s3.toUpperCase()));
				System.out.println(s1.replace('h', 'b'));
				
				
				String s4 ="smita";
				System.out.println(s1.contains(s4));
				System.out.println(s1.startsWith("su"));
				
				
		}
		
		
	
	}
 
 


