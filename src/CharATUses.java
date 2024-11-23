
public class CharATUses {
	

	
	public static void main(String[] args) {
		
		getTotalSpace(" U K U M");
		
		

	//	System.out.println("C value :"+c);

		
	}
	
	
	public static void getTotalSpace(String a)
	
	{
		int  count=0;

		
		for(int i=0;i<a.length();i++)
			
		{ 
			if(a.charAt(i) == 'U')
				
			{
				count++;
				
				//System.out.println("Repeating character is "+i);
			}
		}
		//return count;
		
		System.out.println("Total space count "+count);
	}
	


}
