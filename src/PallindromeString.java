
public class PallindromeString {
	
	public static void main(String[] args) {
		
		
		String name ="TAT";
		String rev="";
	char []	a=name.toCharArray();
		
		for(int i=a.length-1;i>=0;i--)
			
		{
			rev= rev+a[i];
		}
		
		if(name.equals(rev))
			
		{
			System.out.println("Plaindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
	}

}
