package MethodChaningConcepts;

class MethodRepo
{
	public MethodRepo printName(String Name)
	{
		System.out.println("Name is "+Name);
		return this;
	}
	
	public MethodRepo printAge(int Age)
	{
		System.out.println("Age is "+Age);
		return this;
	}
}

public class Demo {

	public static void main(String[] args) {
		
         MethodRepo methodrepo = new MethodRepo();
         methodrepo.printAge(36);;
         methodrepo.printName("Arpit");
         
         methodrepo.printAge(99).printName("Ram Kumar");
	}

}
