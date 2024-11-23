
public class PallindromeProg {
	
	public static void main(String[] args) {
		
		
		System.out.println(ispalindrome(1221));
		
	}

	
	public static boolean ispalindrome(int number)
	
	{
		int rev=0;
		int originalNumber= number;
		
		while(number!=0)
			
		{
			
		
		
	
		int lastDigit=number%10;
		rev=rev*10+lastDigit;
		
		number=number/10;
		
		
	
		
		}
		System.out.println("Reversed value "+rev);
		System.out.println("Number is "+originalNumber);
		
		if(rev==originalNumber)
			
		{
			System.out.println("It's a palindrome");
			return true;


		}
		
		
	
		return false;
}
	
}
