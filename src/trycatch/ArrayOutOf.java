package trycatch;

public class ArrayOutOf {
	
	public static void main(String[] args) {
		
		
		int [] a= new int [3];
	int length=	a.length;
	
	System.out.println("Array length is "+length);
		

		a[2]=9;
		try
		{
		System.out.println(a[3]);
		}
		catch(ArithmeticException e)
		{
		System.out.println(e.getMessage());
	}
		catch( NumberFormatException ex)
		{
			System.out.println(ex.getMessage()+" , enter valid numbers");
		}
		catch(Exception er)
		
		{
			System.out.println("Last Exception");
		}
		
		catch(Throwable th)
		
		{
			System.out.println("general exception");
		}
		
	finally
	{
		System.out.println("hello");
	}

}
}