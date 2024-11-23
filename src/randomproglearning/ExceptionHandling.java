package randomproglearning;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		System.out.println(name("San"));
		
	}

	
	public static int name(String name)
	
	{
		String name1="San";
		if(name1.equals(name))
			
		{
			try {
				int a =10/0;
				
			}
			catch(ArithmeticException e)
			
			{
				System.out.println(e.getMessage());
				return 20;
			}
			finally
			{
				System.out.println("Finally executed");
			//return 200;
			
			
		}
			
			
	}
		
		else
		{
			System.out.println("It's other than the Input provided");
		}
		return 1000;
}

}