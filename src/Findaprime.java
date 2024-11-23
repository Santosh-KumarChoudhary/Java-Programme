
public class Findaprime {
	
	public static void main(String[] args) {
		System.out.println("number 10 is "+isPrime(5));
		
	}
	
	public static boolean isPrime(int number)
	
	{
		if(number<=2)
			
		{
			return(number==2);
		}
		
		for(int divisor=2; divisor<number;divisor++)
			
		{
			if(number%divisor==0)
				
			{
				return false;
			}
			
		}
		return true;
	}

}
