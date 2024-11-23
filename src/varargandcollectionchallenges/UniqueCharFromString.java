package varargandcollectionchallenges;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharFromString {
	
	public static void main(String[] args) {
		
	
		
		
		String name= "sans";
		
		Set<Character> s= new HashSet<>();
		
		
		
		for(char c: name.toCharArray())
		{
			s.add(c);
			
			

		}
		System.out.println("Unique char "+s);
		
		System.out.println("Count of unique "+s.size());

		
	}
	
	

}
