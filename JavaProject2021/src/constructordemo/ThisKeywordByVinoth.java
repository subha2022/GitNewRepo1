package constructordemo;

public class ThisKeywordByVinoth
{
	// Instance Variable
			String empName="Subha";
			int empId=1245;
			
			ThisKeywordByVinoth(String empName,int empId)
			{
				this.empName = empName;
				this.empId = empId;
			}
			public void display()
			{
				System.out.println(empName +" "+empId);
			}

	public static void main(String[] args) 
	{	
		ThisKeywordByVinoth obj =new ThisKeywordByVinoth("Smita",12457);
		obj.display();
		
	}

}
