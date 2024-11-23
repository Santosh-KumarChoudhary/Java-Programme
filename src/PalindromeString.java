
public class PalindromeString {
	
	public static void main(String[] args) {
		String name ="SASI";
		
		//char rev='';
		
		int num =3553;
		int rev=0;
		int rem=0;
		int orignum =num;
		
		
		while(num!=0)
		{
			rem= num %10;
			rev= rev*10+rem;
			System.out.println("rev :"+rev);
			
			num =num/10;
			System.out.println("number :"+num);
			
			
			
			
		}
		
		if(orignum ==rev)
			
		{
			System.out.println("Its a palindrome");
		}
		else
		{
			System.out.println("not a plaindrome");
		}
		
	
	
	}

}
