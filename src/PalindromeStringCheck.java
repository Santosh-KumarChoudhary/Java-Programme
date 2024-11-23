
public class PalindromeStringCheck {
	
	public static void main(String[] args) {
		
		isPalindrome("Joo");
		
	}
	
	
	
	public static String isPalindrome(String name)
	
	{
		String rev="";
		String origName= name.toLowerCase();
	
		
		for(int i=origName.length()-1;i>=0;i--)
			
		{
			//name.toLowerCase();
			//char ch []= name.toCharArray();
	rev=rev+origName.charAt(i);

		}
		
		System.out.println("Ch is "+rev);
		
		if(origName.equals(rev))
			
		{
			System.out.println("it's pal");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		
	
	
		return name;

	}
	
}
