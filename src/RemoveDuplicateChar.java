import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {
	
	public static void main(String[] args) {
		
		String name = "coconutc";
		
		Set<Character> set= new LinkedHashSet<>();
		
		
		
		for(int i =0;i<name.length();i++)
			
		{
			
			set.add(name.charAt(i));
		}
		
		System.out.println("Srt value "+set);
		
		StringBuffer sb = new StringBuffer();
		
		
		for(Character c: set)
			
		{
			sb.append(c);

		}
		
		System.out.println("WIthout dup : "+sb);
		
		
		System.out.println("**********  Without duplicate ***********");
		
		
		String name2="Santosh";
		
	String loweredString= name2.toLowerCase();
	int count=loweredString.length();
	
		System.out.println("name2 : "+loweredString);
		
		
		System.out.println("Count is :"+count);
	int removed=	loweredString.replace("s", "").length();
	int fincount=count-removed;
	System.out.println("After removing s :"+fincount);

}
}