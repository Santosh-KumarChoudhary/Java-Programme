
public class Rev {
	
	public static void main(String[] args) {
		
		
		String name="SASI";
		
		
		String rev="";
		

		for(int i=name.length()-1; i>=0;i--)
			
		{
		char c=	name.charAt(i);//S
		
		rev=rev+c;//SAS
		}
		
		
		
		
		System.out.println("reveresd "+rev);
		
		
		
		
		
		
		if(rev.equals(name))//SAS
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
