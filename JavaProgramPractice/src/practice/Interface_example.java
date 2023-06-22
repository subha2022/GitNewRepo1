package practice;

interface Interface_example {

	String color = "Blue";

	public void fillUp();

	public void addMoreColor();
	
	

	public class Interface_Implimentaion implements Interface_example {
		
		public static void main(String[] args) {
			Interface_Implimentaion obj = new Interface_Implimentaion();
			obj.fillUp();
			obj.addMoreColor();
		}

		public void fillUp() {
			System.out.println(" It is filled");

		}

		public void addMoreColor() {
			System.out.println("Add more color");

		}
	}

}
