import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {
	public static void main(String[] args) {
		
		HashMap <String,String> capitslMap= new HashMap<String,String>();
		
		capitslMap.put("India", "Delhi");
		capitslMap.put("USA", "Washington DC");
		
		capitslMap.put("Indonesia", "Jakarta");
		
		capitslMap.put("Japan", "Tokyo");
		capitslMap.put("China", null);
		
		capitslMap.put("UAE", null);
		capitslMap.put(null, "Tehran");
		capitslMap.put(null, "Washington DC");
		//capitslMap.put("UAE", "Dubai");


		
		System.out.println(capitslMap.get(null ));
		System.out.println(capitslMap.get("UAE" ));
		
		Iterator <String> it=capitslMap.keySet().iterator();
		while(it.hasNext())
		{
			String key =it.next();
			String value=capitslMap.get(key);
			System.out.println(key + " "+value);
		}
		
	Iterator<java.util.Map.Entry<String, String>>it1	=capitslMap.entrySet().iterator();
	
	capitslMap.put("UAE", "Updated UAE");
	
	boolean isAvailable=capitslMap.containsKey("UAE");
	
	System.out.println("Checking existence "+isAvailable);
	}
	

	
	
}
