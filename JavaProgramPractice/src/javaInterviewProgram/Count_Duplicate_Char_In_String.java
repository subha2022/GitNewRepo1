package javaInterviewProgram;

import java.util.HashMap;
import java.util.Map;

public class Count_Duplicate_Char_In_String {

	public static void main(String[] args) 
	{
		/*String s = "subhasmita";
		int totalcount=s.length();

		int totalCount_after_remove =s.replace("s", "").length();	

		int count = totalcount-totalCount_after_remove;

		System.out.println("s="+count);*/

		String str = "Subhasmita";
		char prog[] =str.toCharArray();
		System.out.println(prog);
		Map<Character,Integer>dup = new	HashMap<>();
		for(char key:prog)
		{
			if(dup.containsKey(key))
			{
				
				dup.put(key, dup.get(key)+1);
			}else
			{
				dup.put(key, 1);
			}

		}
		System.out.println(dup);
	}

}
