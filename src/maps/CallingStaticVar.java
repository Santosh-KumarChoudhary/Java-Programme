package maps;

public class CallingStaticVar {
	
	static int a;
	int b;
	
public static void main(String[] args) {
	
	
	System.out.println(a);
	m1();
	
	CallingStaticVar v= new CallingStaticVar();
	
	
	v.m3();
}

public static void m1()

{
	a=10;
	a=13;
	System.out.println(a);
	
	
	
	
}

public void m3()

{
	a=12;
	
	System.out.println("Static var :"+a);
	
	b=300;
	
	System.out.println("Non-static "+b);
}

}
