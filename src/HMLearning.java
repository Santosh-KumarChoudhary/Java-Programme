import java.util.HashMap;
import java.util.Map;

public class HMLearning {
public static void main(String[] args) {
	
	
	Map<String,String> map= new HashMap<>();
	
	map.put("course1", "Java");
	
	map.put("course2", "SQL");
	map.put("course3", "Python");
	map.put("course4", "DotNet");
	map.put("course4", "R");
	map.put("course5", "Spring");

	
	//System.out.println(map.get(map));
	
	
for(Map.Entry<String, String> entry:map.entrySet())
	
{
	String allKey=entry.getKey();
	String value =entry.getValue();
	
	System.out.println("key  :"+allKey +" value : "+value );
	if(entry.getValue()>1)
		
	{
		
	}
	
	//System.out.println("All Value "+value);
	
}
	
	
	
}


}
