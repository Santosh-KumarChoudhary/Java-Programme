package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestingMaps {
	public static void main(String[] args) {
		
	
	
	Map<String,Integer> map = new HashMap<>();
	
	
	map.put("San", 100);
	
	map.put("Rasm", 100);
	map.put("Ziya", 100);
	map.put("ABRAM", 100);
	map.put("Tan", 100);

	System.out.println(map.size());
	Set<String> keys=map.keySet();
	
	System.out.println("Key sets are "+keys);
	
	Integer tan=map.get("Tan");
	
	System.out.println("Tan holding "+tan);
	
	//map.entrySet();
	
	Integer key=map.get("Ziya");
	
	System.out.println(key);
	
	System.out.println(map.containsKey("ABRAM"));
	System.out.println(map.containsKey("ABAM"));
	
	map.remove("TAN");
	
	System.out.println(map);
	System.out.println(map.size());
	
	for(String allKey: map.keySet())
		
	{
		System.out.println(allKey +" : "+map.get(allKey));
	}
	


}
}