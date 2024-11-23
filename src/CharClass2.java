
public class CharClass2 {
	
	public static void main(String[] args) {
		
		
		String name="santosh kumar";
		String removed="";
		
		for(int i=0;i<name.length();i++)
			
		{
		char c=	name.charAt(i);
		
		if(!Character.isWhitespace(c))
		{
			removed=removed+c;
		}
		}
		System.out.println("removed :"+removed);
	}

}
