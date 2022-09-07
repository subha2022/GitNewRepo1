package practice;

public class DataTypeExample
{
byte b=127;
short s =157;
int i = 100;
long l = 1402;
float f = 2.05f;
double d = 12.25;
boolean bb = true;
char c = 'a';
String name = "Subha";


	public static void main(String[] args) 
	{
		DataTypeExample obj = new DataTypeExample();
		System.out.println("Byte :" + obj.b);
		System.out.println("Short :" + obj.s);
		System.out.println("int :" + obj.i);
		System.out.println("Long :" + obj.l);
		System.out.println("Float : " + obj.f);
		System.out.println("Double : " + obj.d);
		System.out.println("Boolean: "+ obj.bb );
		System.out.println("Char :" +obj.c);
		System.out.println("name : " + obj.name);
	}

}
