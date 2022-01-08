package collectionDemo;

import java.util.Enumeration;
import java.util.Vector;

public class EnumarationDemo 
{

	public static void main(String[] args) 
	{
		Vector<Integer> v = new Vector<Integer>();
		/*v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);*/
		for(int i=1;i<=10;i++)
		{
			v.add(i);
		}
		
		System.out.println(v);
		Enumeration<Integer> var =v.elements();
		while(var.hasMoreElements())
		{
			Integer val = var.nextElement();
			if (val%2==0)
			System.out.println(val);
			
		}
		System.out.println(v);
	}

}
