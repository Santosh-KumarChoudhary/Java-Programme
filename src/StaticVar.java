
public class StaticVar {
	
	static int a=10
			;
	
	
	public static void main(String[] args) {
		
StaticVar.m1();
StaticVar.m2();

StaticVar m= new StaticVar();

m.m3();
		
	}
	
	public static void m1()
	
	{
		//a=100;
		System.out.println(a);
	}
	public static void m2()
	
	{
		//a=100;
		System.out.println(a);
	}
	public void m3()
	
	{
		System.out.println(a);
	}
	

}
