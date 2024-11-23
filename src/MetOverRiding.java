
public class MetOverRiding {
	static int b1=100;
	
	public static void m1()
	
	{
		
		int a=10;

		System.out.println("Parent class method");
	}
	
	
	public static void m2()
	
	{
		
		int a=10;

		System.out.println("Parent class 2nd method");
	}
	
	
	public static void main(String[] args) {
		
		base b= new base();
		
		b.m1();
		
		MetOverRiding met= new base();
		
		met.m1();
		met.m2();
		
		b.m2();
		System.out.println(b.a);
		
				
		
	}

}


class base extends MetOverRiding


{
public static void m1()
	
	{
		
		int a=10;

		System.out.println("Child class method");
	}
public static void m2()

{
	
	int a=10;

	System.out.println("child class 2nd method");
}
		
}
