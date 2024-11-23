
public class ForLoopPrimeNumber {
	
	public static void main(String[] args) {
		
		System.out.println( isPrime(12));
		System.out.println("12 is " + (isPrime(12) ? " ":"NOT ")+"a prime number");
		
	}
	
	public static boolean isPrime(int wholenumber)
	
	{
		
		if(wholenumber<=2)
		{
		return (wholenumber==2);
		
		}
		for (int divisor =2; divisor<=wholenumber/2;divisor++ )
			
		{
			if(wholenumber%divisor==0)
				
			{
				return false;
			}
		}
		return true;

		
	}

}
