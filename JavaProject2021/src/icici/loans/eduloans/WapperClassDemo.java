package icici.loans.eduloans;

public class WapperClassDemo 
{

	public static void main(String[] args) 
	{
		/*
		 byte------Byte
		 short-----Short
		 int-------Integer
		 long------Long //in every wapper class 1st letter is always upper case 
		 float-----Float
		 double----Double
		 boolean----Boolean
		 char----Character
		 */

		int x =100;
		System.out.println(x);
		Integer y =Integer.valueOf(x);
		//Integer y =x; //autoboxing
		System.out.println(y);
		
		//Float f = Float.valueOf(x);
		//System.out.println(f);
		
		System.out.println("------------------");
		
		String s1 = "17";
		String s2 = "20";
		System.out.println(s1+s2);
		
		int p1 = Integer.parseInt(s1);
		int p2 = Integer.parseInt(s2);
		int result = p1+p2;
		System.out.println(result);
		
		/*double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result=d1+d2;
		System.out.println(result);*/
		
		
		
	}

}
