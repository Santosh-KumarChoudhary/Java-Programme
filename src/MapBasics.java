import java.util.HashMap;
import java.util.Map;

public class MapBasics {
	
	
	public static void main(String[] args) {
		
	String input  ="Jyotii";
	
	char [] ch= input.toCharArray();
	Map<Character,Integer> map= new HashMap<>();
	
	for(char c:ch)//i
		
	{
		
		if(!map.containsKey(c))
		{
			map.put(c, 1);// j= 1, y =1 ,0 =1,t=1,1=1,
		}
		else
		{
		int count=	map.get(c);//1 count =1
		
		map.put(c, count+1);//i =2
		
		
		}
		

	}
	
	System.out.println(map);

	
	

}}
