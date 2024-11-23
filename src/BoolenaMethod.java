
public class BoolenaMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isEvenNumber(6));
		
		System.out.println(isOdd(6));
		
		System.out.println(isPrime(3));
	}
	
	public static boolean isEvenNumber(int number)
	{
		return number %2==0;
	}
	
	public static boolean isOdd(int number)
	{
		return number %2==1;
	}
	
	public static boolean isPrime(int number)
	{
		if (number<=1)
			
			return false;
		
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				return false;
			}
		}
	
	return true;

}
}