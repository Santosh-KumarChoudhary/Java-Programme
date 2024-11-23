package polymorphisms;

public class DerivedOverridings extends Overridings {
	//int a=20;

	
	public  void m1()
	
	{
		super.m1();
		super.m3();
		System.out.println("Calling parent method from child class");
		System.out.println("Hello this is child method");
	//	return 10;
	}

	
public void m1(int a)
	
	{
		System.out.println("Hello this is child method "+a);
	}

}
