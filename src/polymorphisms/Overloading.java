package polymorphisms;

public class Overloading {
	public static void main(String[] args) {
		bark(3);
		
	}
	
	
	
	public static int add(int a, int b)
	
	{
		return a+b;
	}
	public static String add(String a , String b)
	{
		return "a"+"b";
	}
	
	public void add(int a, int b, int c)
	
	{
		System.out.println(a+b+c);
	}
	
	public static void bark()
	
	{
		System.out.println("Wooof");
	}
	
	public static void bark(int num)
	
	{
		for (int i=1; i<=num;i++)
			System.out.println("Woof");
	}

}
