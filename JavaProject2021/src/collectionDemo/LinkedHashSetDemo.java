package collectionDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(10);//in set duplicates are not allowed, it takes only once
		h.add(40);
		h.add(50);
		
		System.out.println(h);// Insertion order is preserved
		

	}

}
