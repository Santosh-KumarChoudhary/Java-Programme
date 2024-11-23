
public class MoveCharacterBy2 {
	
	public static void main(String[] args) {
		String name ="SCN";
		
		int indexvalue=name.indexOf('C');
		
		System.out.println("C ka index hai : "+indexvalue);
		
		String empty="";
		
		
		for(int i=0;i<name.length();i++) ///3
			
		{
			char c=name.charAt(i); // S,A,N
			
			
			System.out.println("**********************");
			
			System.out.print("C ka value "+c);
			
			
			System.out.println("**********************");

			
			if(c=='S' || c=='C' || c=='A' || c=='N')
				
			{
		//	c-=26;
				
				c-=2;  // c=c+2;u C
				empty=empty+c;///    ucp
				//System.out.println(empty);

			}
			
			
		}
		System.out.println("Added val "+empty);

	}

}
