
public class GetCharacterCount {
	public static void main(String[] args) {
		
		String name=" Santosh kum ar t";
		
		int count =0;
		
		for(int i=0;i<name.length();i++)
			
		{
			//char c= name.charAt(i);
			
			if(name.charAt(i)==' ')
			count++;
			
			
		}
		System.out.println("Total chgaracter is "+count);
		
	}

}
