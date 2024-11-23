
public class CountNumberOfIntegers {
	
	public static void main(String[] args) {
		
		
		int digit =1223334;
		
		int count=0;
		
		while(digit!=0)
			
		{
			digit=digit/10;
			
			count++;
		}
		
		System.out.println("Total digit present is "+count);
	}

}
