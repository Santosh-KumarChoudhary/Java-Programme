package list;

import java.util.ArrayList;
import java.util.List;

public class ListImplementaions {
	
	public static void main(String[] args) {
		
		
		List<String> name= new ArrayList<>();
		
		name.add("San");
		name.add(0,"Bittu");
		
		name.add(1,"Choudhary");
		
		name.add(0,"Nishu");
		name.set(1, "Golu");
		name.add(1,"Rest");
		name.add(0,"Kittu");
		
		//System.out.println(name.get(0));
		//System.out.println(name.size());
	
		name.remove(0);
		name.remove(1);
		
		for(int i=0;i<name.size();i++)
			
		{
			System.out.println(name.get(i));
		}
		
		if(name.contains("Nishu"))
			
		{
			System.out.println("It Exists and it's Index is "+name.indexOf("Nishu") );
			
		}
		
		else
		{
			System.out.println("No!!!! Luck");
		}
		
		
		for(String str :name)
			
		{
			System.out.println("Names are "+str);
		}
		
		
	}

}
