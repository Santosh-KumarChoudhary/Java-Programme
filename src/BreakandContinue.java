
public class BreakandContinue {
	public static void main(String[] args) {
		
		int i;
		
		for( i=1;i<10;i++)
		{
			if(i==5)
				
				break;
			System.out.println(" "+i);

		}
		
		System.out.println("Out of loop");
		
		for( i=1;i<10;i++)
			
		{
			if(i==8)
				continue;
			
			System.out.println(i);
		}
		
		System.out.println("Out of the 2nd Loop");

		
	}
	

}
