
public class CountNumberOfPrimeNumber {
	
	
	
	public static void main(String[] args) {
		
	//int count =0;
	//for(int i=2;i<=50;i++)
		
	{
		if(isPrime(11))
			
		{
			System.out.println("number "+5 +"is a prime number");
		//	count++;
		}
		else
		{
			System.out.println("It's not a prime");
		}
		
	}
	//System.out.println("Total number of prime number between2 and 50 :"+count);
		
	}
	
	
	public static boolean isPrime(int number)
	{
		if (number<=2)
			
		{
			return (number==2);
		}
		
		for(int i=2;i<=number/2;i++)
			
		{
			if(number %i==0)
				
			{
				return false;
			}
		}
		return true;
	}

}
