package varargandcollectionchallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
	
	public static void main(String[] args) {
		
		List<Integer> ls= Arrays.asList(10,12,13,14,15);
		list(ls);
		System.out.println("Reversed list "+ls);
		
		
		List <Integer> ls2= Arrays.asList(10,12,14);
		
		List<Integer> ls3= new ArrayList<>();
		
		System.out.println("ls2 size :"+ls2.size());
		
		for(int i=ls2.size()-1;i>=0;i--)
			
		{
			ls3.add(ls2.get(i));
		}
		
		System.out.println("Reversed second list "+ls3);
		
	}

	
	public static void list(List<Integer> lis)
	
	{
		Collections.reverse(lis);
	}
	
	
	
	
}
