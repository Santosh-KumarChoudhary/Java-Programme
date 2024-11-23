
public class PrintLastDigit {
	
	public static void main(String[] args) {
		
		int number=1234;
		int rev=0;
		
		while(number!=0)
		{
			int lastDigit= number%10;
			
			System.out.println(lastDigit);
			rev=rev*10+lastDigit;
			number=number/10;
		}
		
		System.out.println("rev "+rev);
		if(rev==number)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		
	}

}
