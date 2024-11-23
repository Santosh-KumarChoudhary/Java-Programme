package polymorphisms;

public class CallingOverridings {
	public static void main(String[] args) {
		
		
		Overridings d= new Overridings();
		d.m1();
		d.m3();
		System.out.println(d.a);
		
		DerivedOverridings der= new DerivedOverridings();
		der.m1();
	System.out.println(der.a);
	der.m1(200);
	der.m3();
		
	}

}
