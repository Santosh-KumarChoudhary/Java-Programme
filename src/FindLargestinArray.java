
public class FindLargestinArray {
	
	public static void main(String[] args) {
		
		int numbers []= {10,3,18,14,78,98,112};
		
		System.out.println("Largest number is "+	findLargest(numbers));
		
		
	
		
		
		
		
	}
	
	
	public static int findLargest( int array[])
	
	{
		
		int max=array[0];

		for(int i=0;i<array.length;i++)
			
		{
		
		//array [1]= max;//3
		
		if(array[i]>max)
			
		{
	max=array[i];
	
	System.out.println(array[i]);
		}
			
	
			
		
		
		}
		return max;
	
			
	}

}
