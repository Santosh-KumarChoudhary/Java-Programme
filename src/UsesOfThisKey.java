
public class UsesOfThisKey {
	
	int a=10;
	
	int b;
	
	public static void main(String[] args) {
		
		
		UsesOfThisKey use=new UsesOfThisKey();
		
		use.add(1300);
		System.out.println(use.a);
		
		use.m3();
		UsesOfThisKey obj=new UsesOfThisKey(10);
		
		System.out.println("Main method");
		
		obj.m3();
		
		System.out.println("Main method");

		
	}
	
	
	UsesOfThisKey()
	{
		this.b=20;
	}
	UsesOfThisKey(int b)
	
	{
		this.b=508;
	}
	
	
	public void m3()
	
	{
		System.out.println("**********************************************************");
		System.out.println("Value of b "+this.b+this.b);
		
		System.out.println("**********************************************************");

	}
	
	public void m2()
	
	{
		System.out.println("m2 methos called");
		
		//this.a=9099;
		
		System.out.println("m2 method and value of a is "+a);//
	}
	
	
	public  void add(int a)
	
	{
//	int a=2500;
		
		System.out.println("Before local a is "+a);//1300
		
		this.a=a;
		
		System.out.println("Value of a after local "+a);//1300
		this.m2();
		
		//System.out.println("Value of a is "+a);
	}

}
