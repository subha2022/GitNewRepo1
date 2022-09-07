package javaInterviewProgram;

public class FindDuplicateCharacterInString {

	public static void main(String[] args)
	{
		 String s= "aaabbaacccdc";
		 
		 for(int i=0;i<s.length();i++)
		 {
			 			
		 }
		 int totalcount= s.length();
		 int totalcountafter_removea=s.replace("a","").length(); // total length after removing a
		 int totalcountafter_removeb=s.replace("b","").length(); // total length after removing b
		 int totalcountafter_removec=s.replace("c","").length(); // total length after removing a
		 int totalcountafter_removed=s.replace("d","").length(); // total length after removing a
			
		
		 int count =totalcount-totalcountafter_removea;
			System.out.println("The Number of a count is:"+count);
			
			int count1 =totalcount-totalcountafter_removeb;
			System.out.println("The Number of b count is:"+count1);
			
			
			int count2 =totalcount-totalcountafter_removec;
			System.out.println("The Number of c count is:"+count2);
			
			
			int count3 =totalcount-totalcountafter_removed;
			System.out.println("The Number of d count is:"+count3);
		
		
	}

}
