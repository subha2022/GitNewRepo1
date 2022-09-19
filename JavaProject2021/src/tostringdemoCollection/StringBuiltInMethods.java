package tostringdemoCollection;

public class StringBuiltInMethods {

	public static void main(String[] args) 
	{
		String msg ="Welcome to Java online Training ";
		//1 length()
		System.out.println(msg.length());
		//2 toLowerCase()
		System.out.println(msg.toLowerCase());
		//3 toUpperCase()
		System.out.println(msg.toUpperCase());
		//trim()
		String name = " Subha";
		System.out.println(name.trim());
		
		//Declaring
		String val1="Subha ";
		String val2="Smita ";
		String val3="Jena ";
		System.out.println(val1+val2+val3);
		
		//concat()
		System.out.println(val1.concat(val2).concat(val3));
		
		//String Comparison
		//Two way comparison
		//equals()
		String val4 = "A";
		String val5 = "a";
		System.out.println(val4==val5);
		System.out.println(val4.equals(val5));
		System.out.println(val4.equalsIgnoreCase(val5));
		
		// Three way comparison
		/*String1=String2----->0
		 * String1>String2-------->+ve value
		 * String1<String2-------->-ve value
		 */
		String val6 ="S";
		String val7 ="s";
		System.out.println(val6.compareTo(val7));
		System.out.println(val7.compareTo(val6));
		System.out.println(val6.compareToIgnoreCase(val7));
		
		// charAt()
		String courseId = "Automation Course ID - 43452";
		System.out.println(courseId.charAt(4));
		//indexOf()
		System.out.println(courseId.indexOf('u'));
		//contains()
		System.out.println(courseId.contains("43452"));
		
		// subString()
		
		String successfullMsg = "The Transaction Id: NXTGEN1937465.Thank You";
		System.out.println(successfullMsg.indexOf('N'));
		System.out.println(successfullMsg.substring(20));
		System.out.println(successfullMsg.substring(20, 33));
		
		//Replace()
		String updateMsg ="Welcome to ICICI bank";
		System.out.println(updateMsg.replace("ICICI", "SBI"));
		
		// Handling the special character
		String text ="Welcome to \"Selenium Class\"";
		System.out.println(text);
		
		//Split()
		
		
	}

}
