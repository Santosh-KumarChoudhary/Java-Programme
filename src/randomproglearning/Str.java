package randomproglearning;

public class Str {
	
	static int s=200;
	
	static String name="San";

	
	public static void main(String[] args) {
		
		int c;
		
		name="B2";
		
		System.out.println(name);
		
		{
			//name="Xox";
			
			System.out.println("Third name "+name);
			
			int a=10;
			
			c=900;
			
			System.out.println("Static s :"+s);
			System.out.println("C :"+c);
		Str st= new Str();	st.m1();
		
		String name="Santosh";
		
		System.out.println("Inside name "+name);
		
		String nul= null;
		nul="Fart";
		System.out.println("Null "+nul);

			
		}
		
	
		
		//System.out.println(a);
	}
	
	public void m1()
	
	{
		
		s=908;
		System.out.println(s);
		
		System.out.println("Method name "+name);
	}

}
