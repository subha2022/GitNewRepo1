package icici.loans.eduloans;

public class DataTypeDemo {
	//integer data type
	byte b=127; //1 byte
	short s=32767; // 2 bytes
	int i=2147483647; // 4 bytes
	long l=2147483647; //8 bytes
	// floating type
	float f=12.34f; //4 bytes
	double d=23.34; //8 bytes
	//non numeric data types
	boolean bb=true;
	char ch='a';//2 bytes
	
	String name="Subha";
	static String cname;
	static float roi;

	public static void main(String[] args)
	{
		int X=12;
		DataTypeDemo obj = new DataTypeDemo();
		System.out.println("Byte :  "+obj.b);
		System.out.println("Short :  "+obj.s);
		System.out.println("Int :  "+obj.i);
		System.out.println("Long :  "+obj.l);
		
		System.out.println("Float :  "+obj.f);
		System.out.println("Double :  "+obj.d);
		
		System.out.println("Boolean :  "+obj.bb);
		System.out.println("Char :  "+obj.ch);
		System.out.println("String :  "+obj.name);
		System.out.println("String :  "+DataTypeDemo.cname);
		System.out.println("Float :  "+DataTypeDemo.roi);
		System.out.println("int :  "+X);
		
	}

}
