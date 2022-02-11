package icici.loans.eduloans;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// byte,short,int,long,float,double,boolean,char
		
	/*	int x =10;
		System.out.println(x);
		double y =x;
		System.out.println(y);*/
		
		double x =10.7;
		System.out.println(x);
		int y =(int) x;
		System.out.println(y);
		
		System.out.println("----------------");
		
		int a =67;
		System.out.println(a);
		char b =(char) a;
		System.out.println(b);
		
	}

}
