package randomproglearning;

public class Swap {
	
	 int a=10;
	 int b=20;
	
	public static void main(String[] args) {
		
	
		
		Swap s= new Swap();
		
	s.swap(10, 20);
		
		System.out.println(s.a+" "+ s.b);
		
	}
	
	public  void swap(int a,  int b)
	
	{
		
		this.a=a;
		this.b=b;
		int temp=a;//10
		a=b;//20
		b=temp;//10
	}

}
