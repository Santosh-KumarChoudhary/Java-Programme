
public class indMatchingWord {
	public static void main(String[] args) {
		
		String word= "Hello learning java on daily basis";
		
		String empty="";
		int count=0;
		
		for(int i=0;i<word.length();i++)
			
		{
			char c=word.charAt(i);
		
		if(c!=' ')
		{
			empty= empty+c;
		}
		else
		{
			if(empty.equalsIgnoreCase("learning"))
			{
				count++;
				empty="";
				
			}

	}
		}
		if(count==0)System.out.println("not found");
		else System.out.println("Found"+count);
	
	}

}
