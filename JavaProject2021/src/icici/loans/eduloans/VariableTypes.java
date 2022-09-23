package icici.loans.eduloans;

	public class VariableTypes 
	{    // here X and cname is primitive variable
		
	int x=100;// instance(or) global (or)non static
	
	static String cname="VWmare";// static(or) non-global
    
	public void m1()
{
	int x=200;//local variables
	//System.out.println(y);
	System.out.println(x);
	System.out.println(this.x);
	System.out.println(cname);
}
	public static void m2()
	{
		VariableTypes obj1 = new VariableTypes();
		System.out.println(obj1.x);
		System.out.println(cname);
	
	}
	public static void main(String[] args) {
		
    VariableTypes obj = new VariableTypes();//here obj is non-prmitive variable or reference variable
    System.out.println(obj.x);
    System.out.println(VariableTypes.cname);
    obj.m1();
    m2(); // static method
	}

}
