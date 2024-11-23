package varargandcollectionchallenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringSotening {
	
	
	
	public static void main(String[] args) {
		
	
		List<String > list= Arrays.asList("SAN","XAN","TAN","RAN");
		
		System.out.println("Before sort "+list);
		
		sortning(list);
		
		System.out.println("After sort " +list);
		
		
	}
	
	public static void sortning(List <String >str)
	
	{
		Collections.sort(str);
	}

}
