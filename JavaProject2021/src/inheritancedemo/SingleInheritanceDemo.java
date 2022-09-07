package inheritancedemo;

class Animal1
{
	public void getName(String Name)
	{
		System.out.println("Name of the Animal : " + Name);
	} 
}
class Dog extends Animal1
{
	public void getBreedName(String BreedName)
	{
		System.out.println("BreedName of the Dog : " + BreedName);	
	}
}
public class SingleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 a = new Animal1();
		a.getName("dog");
		
		Dog d = new Dog();
		d.getName("dog");
		d.getBreedName("puppy");
		
	}

}
