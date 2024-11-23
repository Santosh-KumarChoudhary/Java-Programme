
public class ForEachLoop {
	
	public static void main(String[] args) {
		
		String [] array= new String [] {
				"ABC" ,"DEf" ,"JKL","PWQ","XYZ"};
		
		//System.out.println("Array is "+array);
		arrayList(array);
		foreach(array);
		
	}
	
	public static void arrayList( String [] array)
	
	{
		for(int i=0;i<array.length;i++)
			
		{
			System.out.println(array[i]);
		}
	}
	
public static void foreach( String [] array)

{
	for( String name : array)
		
	{
		System.out.print(name + " ");
	}
}

}
