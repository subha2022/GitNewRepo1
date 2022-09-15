package icici.loans.eduloans;

public class AutoBoxing {

	public static void main(String[] args) 
	{
		//convert int to Integer
		int num = 50;
		
		//Integer obj = new Integer(num)- old version
		
		// Converting int to integer explicitly
		Integer a = Integer.valueOf(num);
		
		 //AutoBoxing - Integer.valueOf(100) - Compiler
		Integer b = 100;
		Float cost = 1.45f;
		System.out.println(a+b);
		
		//UnBoxing = converting object to primitive data type
		int i = a.intValue();
		
		//b.intValue();
		int j = b;
		
		
		
		

	}

}
