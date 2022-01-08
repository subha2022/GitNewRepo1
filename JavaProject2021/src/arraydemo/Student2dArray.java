package arraydemo;

public class Student2dArray 
{
	int sno;
	String sname;
	
		
	public Student2dArray(int sno, String sname) {  
		super();
		this.sno = sno;
		this.sname = sname;
	}
	
	@Override
	public String toString() {    //generate tostring
		return "Student2dArray [sno=" + sno + ", sname=" + sname + "]";
	}


	public static void main(String[] args) 
	{
		Student2dArray  s = new Student2dArray(100,"subha");
		//System.out.println(s.sno);
		//System.out.println(s.sname);
		
		System.out.println(s);
		
		Student2dArray obj = new Student2dArray (10,"s1");
		Student2dArray obj1 = new Student2dArray (20,"s2");
		Student2dArray obj2 = new Student2dArray (30,"s3");
		Student2dArray obj3 = new Student2dArray (40,"s4");
		
		/*System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj3);
		System.out.println(obj3);*/
		
		Student2dArray  [] st = new Student2dArray [4];     //user defined array(Student2dArray)
		st[0]=obj;
		st[1]=obj1;
		st[2]=obj2;
		st[3]=obj3;
		
		for(Student2dArray i:st) 
		{
			System.out.println(i);
		}
		
		}
	
}
