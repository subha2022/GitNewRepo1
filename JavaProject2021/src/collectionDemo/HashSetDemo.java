package collectionDemo;

import java.util.HashSet;

public class HashSetDemo 
{

	public static void main(String[] args)
	{
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(10);//in set duplicates are not allowed, it takes only once
		h.add(40);
		h.add(50);
		
		System.out.println(h);// Insertion order is not preserved
		

	}

}
