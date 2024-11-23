package set;

import java.util.HashSet;
import java.util.Set;

public class Testiingset {
	
	public static void main(String[] args) {
		
		
		
		Set<String> set = new HashSet<>();
		
		set.add("San");
		
		set.add("B2");
		
		set.add("GG");
		
		System.out.println("Size of set :"+set.size());
	
		for(String name:set)
			
		{
			System.out.println(name);
		}
		
		System.out.println(set.add("San"));
		
		set.remove("B2");
		
		System.out.println(set);
		System.out.println("Size of set :"+set.size());
		
		System.out.println(set.remove("GG"));
		
		System.out.println(set);
		System.out.println(set.isEmpty());

		
		
	}

}
