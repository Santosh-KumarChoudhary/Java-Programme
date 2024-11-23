
public class PrintWOrdOutOfSentence {
	public static void main(String[] args) {
		
		
		String word="hello learning java today";
		word+=" ";
		
		String empty="";
		for(int i=0;i<word.length();i++)
			
		{
			char c=word.charAt(i);
			
			if((c!=' '))
			{
				empty+=c;
			}
			else
			{
				
				//if(empty.startsWith("l"))
				System.out.println(empty);

				empty="";
				//System.out.println("empty :"+empty);

			}
		}
	}

}
