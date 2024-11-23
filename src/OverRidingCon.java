
public class OverRidingCon {
	
	public static void main(String[] args) {
		
		Dog dog=new Dog();
		dog.bark();
		//dog.
		Animal animal=new Animal();
		
		animal.bark();
		animal.bark();
		dog.bark();
		dog.eat();
	}

}


class Animal{
	
	
	public void bark()
	
	{
		System.out.println("Animal bark");
	}
	
	public String   eat()
	
	{
		System.out.println("Animals eat");
		
		return "Animals eat";
	}
	public static String eat(String item)
	
	{
		return item;
	}
	
}

class Dog extends Animal {
	
	
	public void bark()
	
	{
		System.out.println("Dags Bark");
	}
	public  String eat()
	
	{
		System.out.println("DOG eat class");
	return "Childs over riding method";
	}
	public void bark(String a)
	
	{
		System.out.println("Childs own Bark method");
	}
	public  static String eat(String food)
	
	{
		
		return "Cake";
		
		}
	
	
	
	
	public void add()
	
	{
		System.out.println("Childs Own method");
	}
}