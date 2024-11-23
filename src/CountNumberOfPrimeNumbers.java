
public class CountNumberOfPrimeNumbers {
	
	public static void main(String[] args) {
		
		
		
	}

	
	
	public static  boolean isPrime(int number)
	
	{
		if(number==2)
			
		{
			return true;
		}
		
for(int i=2;i<=number;i++)
	
{
	if(number%2==0)
		
	{
		return false;
	}
	
}
return true;
		
	}
}
