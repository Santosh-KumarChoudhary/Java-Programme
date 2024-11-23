package randomproglearning;

import java.io.IOException;

public class PostAndPreIncrement {
	
	public static void main(String[] args) {
		
		
		int a= 10;
		int c=20;
		
		
		int b= a++ + ++a +a++ - --a -  --c;
		
		// 10 +11+ 11
		// 12
		System.out.println(" a "+a);
		
		System.out.println(b);
		
		
		try
		
		{
			throw new IOException("San");
			
			//int a1= 10/0;
		
		}
		
		
		
		catch(NullPointerException e)
		
		{
			
			//int a =19;
		System.out.println("Hi");
		System.out.println(e.getMessage());
		}
		
	catch(Exception e)
		
		{
		
		System.out.println("Catched in exception class");
			System.out.println(e.getMessage());
		}
		
		
		catch (Throwable e)
		
		{
			System.out.println("hello throwable "+e .getMessage());
		}
		
		
		

		
	
		finally
		{
			System.out.println(" Finally !!!! Choudhary");
		}
	}
	
	

}
