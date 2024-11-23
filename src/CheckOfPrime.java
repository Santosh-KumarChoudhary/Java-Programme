
public class CheckOfPrime {
	
	public static void main(String[] args) {
		
		int number=9;
		
		boolean isPrime=isPrimeNumber(number);
		if(isPrime)
		{
			System.out.println("Prime number "+isPrime);
		}
		
		else
		{
			System.out.println("Not a prime "+isPrime);
		}
	}
	
	public static boolean isPrimeNumber(int number)
	{
		if(number <=1)
		{
			return false;
		
	}
	for(int i=2;i<=Math.sqrt(number);i++)
		
	{
		if(number%i==0)
		{
			return false;
		}
	}
	 return true;

}
}