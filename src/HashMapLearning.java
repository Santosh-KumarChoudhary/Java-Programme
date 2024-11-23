import java.util.ArrayList;
//import java.util.Map;

public class HashMapLearning {
	
	public static void main(String[] args) {
		
	
	
//	Map<String, String> map= new HashMap<>();
	
	ArrayList <String > list= new ArrayList<String >();
	
	list.add("Java");
	
	list.add("Python");
	
	list.add("SQL");
	list.add("dotNet");
	
	//System.out.println(list.le);
	
	System.out.println(list.indexOf("SQL"));
	int index=list.indexOf("Python");
	
	System.out.println("Index : "+index);
	
	
boolean isAvailable=	list.contains("Java");

System.out.println("isAvailable :"+isAvailable);
	
	System.out.println(list.size());
	
	for(int i =0;
			
			i<=list.size()-1;//4
			
			
			i++)//1
		
	{
		System.out.println(list.get(i));
		
		//list.clear();
		

		

	}
	
	
	System.out.println("cleared the list "+list.get(+i));


}
}