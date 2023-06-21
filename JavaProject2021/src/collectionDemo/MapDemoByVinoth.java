package collectionDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapDemoByVinoth 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, Integer> h= new HashMap<Integer, Integer>();
		h.put(10, 100);// duplicate values are not allowed
		h.put(20, 200);
		h.put(30, 200);//it is not follow the insertion order
		h.put(10, 300);
		h.put(40, 400);
		
		System.out.println(h);	
		System.out.println(h.get(30));// get a particular value
		System.out.println(h.size());// get size
		System.out.println(h.isEmpty());//check empty or not
		
		Set<Integer> keys = h.keySet();//to get all the key value
		for(Integer k:keys)
		{
			System.out.println(k +"---------"+h.get(k));
		}
		System.out.println(h.containsKey(30));// check particular key exist or not
		System.out.println(h.containsValue(300));//for value 
		
		LinkedHashMap<Integer, Integer> h1 = new LinkedHashMap<Integer, Integer>();
		h1.put(10, 100);// duplicate values are not allowed
		h1.put(20, 200);
		h1.put(30, 200);
		h1.put(10, 300);////it is follow the insertion order
		h1.put(40, 400);
		
		System.out.println(h1);
		
		TreeMap<Integer, Integer> h2 = new TreeMap<Integer, Integer>();
		h2.put(100, 100);// duplicate values are not allowed
		h2.put(200, 200);
		h2.put(30, 200);
		h2.put(1, 300);//it is follow the insertion order
		h2.put(40, 400);
		System.out.println(h2);
	}
	
}