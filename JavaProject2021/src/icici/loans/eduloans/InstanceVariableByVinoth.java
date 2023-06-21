package icici.loans.eduloans;

public class InstanceVariableByVinoth 
{
	// Instance variable
			// Employee Details
			String empNameone="Subha";
			int empID=123;
			float empSalary=453.21f;
			int empMobileno;
			String empAddress="Puri";
			
			String empNameTwo="Smita";
			int empIDtwo=456;
			float empSalarytwo=478.12f;
			


	public static void main(String[] args) 
	{
		InstanceVariableByVinoth empOne = new InstanceVariableByVinoth();
		System.out.println(empOne.empNameone);
		System.out.println(empOne.empID);
		System.out.println(empOne.empSalary);
		System.out.println(empOne.empMobileno);
		System.out.println(empOne.empAddress);
		
		InstanceVariableByVinoth empTwo = new InstanceVariableByVinoth();
		System.out.println(empTwo.empNameTwo);
		System.out.println(empTwo.empIDtwo);
		System.out.println(empTwo.empSalarytwo);
		
		
				
		
		
		}

}
