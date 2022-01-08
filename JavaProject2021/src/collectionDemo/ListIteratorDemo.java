package collectionDemo;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args)
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("Sai");
		a.add("Kiran");
		a.add("subha");
		a.add("madhu");
		
		System.out.println(a);
		
		ListIterator<String> var = a.listIterator();
		while(var.hasNext())
		{
			String str = var.next();
			if(str.equals("subha"))
				var.set("subhasmita");
			else
				var.remove();
		}
		System.out.println(a);

	}

}
