package practice;

public class WrapperClassExample 
{

	public static void main(String[] args)
	{
		int x = 100;
		System.out.println(x);
		Integer y = x;
		System.out.println(y);
		
		Float f = Float.valueOf(x);
		System.out.println(f);
		
		String s1 = "10";
		String s2 = "20";
		System.out.println(s1+s2);
		
		int p1 = Integer.parseInt(s1);
		int p2 = Integer.parseInt(s2);
		System.out.println(p1+p2);
		

	}

}
