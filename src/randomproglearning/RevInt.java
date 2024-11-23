package randomproglearning;

public class RevInt {
	
	public static void main(String[] args) {
		System.out.println(revNum(123));
		
		
	}
	
	public static int revNum(int num)
	
	{
		int rev =0;
		
		while(num>=1)
			
		{
			int  digit = num%10;
			// System.out.println("rem "+rev);//3
			 
			 rev=rev*10+digit;
			 System.out.println("rev "+rev);
			num=num/10;//12
			//System.out.println(" num "+num);
			//rev= rev+ +rem;
			
			System.out.println("rev "+rev);
		}
		
		return rev;
	}

}
