
public class Factorial {
	public static void main(String[] args) {
		
		
		int num= 6;
		int fact =1;
	
		for (int i=1;i<=num;i++) 
		{
			fact = fact*i;
			
		}
		
		System.out.println("Factorial of  "+num+" is     "+      fact);
		
		
		String name ="jyoti";
		
		
		
	char [] a=	name.toCharArray();
	
	//System.out.println(a.length);
	
	for(int i=a.length-1;
			
			i>=0;
			
			i--)
		
	{
		
		
		System.out.println(a[i]);
		
		
	}
	
	
	}

}
