package TaskGiven_Loka;

public class Method_Overloading {
	int a;
	int b;

	void sum()
	{
		a = 10;
		b = 20;
		System.out.println(a + b);
	}
	void sum(int x, int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);
	}
	void sum(int x, int y, int z)
	{
		System.out.println(x+y+z);
	}
	void sum(int x, float y)
	{
		System.out.println(x+y);
	}

	public static void main(String[] args)
{
		Method_Overloading mo = new Method_Overloading();
		mo.sum();
		mo.sum(120, 145);
		mo.sum(145, 278, 645);
		mo.sum(25, 14.4f);
				
	}

}
