import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sta {
	public static void main(String[] args) {
		
		
		Map<String ,Integer> myMap= new HashMap<>();
		
		
		myMap.put("Ra", 100);
		
		myMap.put("Xa", 11);
		
		myMap.put("Ma", 123);
		
	int count=	myMap.get("Xa");
	System.out.println("count od Xa "+count);
	
	for(Map.Entry<String, Integer> enter:myMap.entrySet())
		
	{
		String key=enter.getKey();
		
		int value =enter.getValue();
		
		System.out.println(key +" "+value);
	}
	
	int [] a= {1552,3,24,2,1921};
	
	int max=a[1];
	for(int i=0;i<a.length;i++)
		
	{
		
		if(a[i]<max)
			
		{
			max=a[i];
			a[0]=max;
		}
	}
	for(int i=0;i<a.length;i++)
		
	{
		System.out.println(" "+a[i]);
	}
	System.out.println("first number "+a[0]);

	System.out.println("largest number "+max);
		
		int [] sort= {2,13,45,1,6,34};
		
		Arrays.sort(sort);
		System.out.println("Sorted "+Arrays.toString(sort));
		
		
	
	}

}
