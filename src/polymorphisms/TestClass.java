package polymorphisms;

public class TestClass {
	public static void main(String[] args) {
		
		
		Car c= new Car();
		Vehicles v= new Car();
		
		Vehicles ca=new Car();
		
		
		Plane p = new Plane();
		
		test(ca);
		test(v);
		test(c);
		test(p);
		
	}
	
	public  static void test(Vehicles v)
	
	{
			v.start();
	//Car ca= (Car)v;

	}

}
