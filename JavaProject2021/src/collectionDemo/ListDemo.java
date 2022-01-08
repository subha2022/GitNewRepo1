package collectionDemo;

import java.util.ArrayList;

public class ListDemo 
{

	public static void main(String[] args)
	{
		ArrayList<Object> a = new ArrayList<Object>();// it is allows only Wrapper class type and object type
		a.add(10);
		a.add("subhasmita");
		a.add(12.25f);
		a.add(10);
		a.add(20);
		a.add(30);
		
		System.out.println(a);
		System.out.println(a.get(1));//get index
		System.out.println(a.isEmpty());//is it empty or not.
		System.out.println(a.hashCode());//get hash code
		System.out.println(a.contains("subha"));//checks particular object contains or not
		
		System.out.println(a);
		// if we are trying to add one more object it is adding after ending object.
		a.add(40);
		System.out.println(a);
		
		a.add(1,"silli");
		System.out.println(a);
		
		a.set(1, "Lali"); //for replace
		System.out.println(a);
		
		System.out.println(a.size());//get length
		
		System.out.println(a.subList(1, 5)); //get sublist
		
		a.remove(1);
		System.out.println(a);//for remove
		
		a.remove("subhasmita");//remove object
		System.out.println(a);
		
		a.clear();
		System.out.println(a); //for practice collection java2novice
	}

}
